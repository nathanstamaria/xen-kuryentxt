package com.xenenergy.projects.controllers;

import com.xenenergy.projects.entities.AddOnKwh;
import com.xenenergy.projects.entities.Pager;
import com.xenenergy.projects.entities.PaginationProperty;
import com.xenenergy.projects.services.interfaces.AddOnKwhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

/**
 * Created by xesi on 16/05/2017.
 */
@Controller
@SessionAttributes("caller")
@RequestMapping("/addonkwh")
public class AddOnKwhController {
    private PaginationProperty property = new PaginationProperty();

    @Autowired
    private AddOnKwhService addOnKwhService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showPersonsPage(@RequestParam("pageSize") Optional<Integer> pageSize,
                                        @RequestParam("page") Optional<Integer> page) {
        ModelAndView modelAndView = new ModelAndView("addonkwh/index");
        // Evaluate page size. If requested parameter is null, return initial
        // page size
        int evalPageSize = pageSize.orElse(property.INITIAL_PAGE_SIZE);
        // Evaluate page. If requested parameter is null or less than 0 (to
        // prevent exception), return initial size. Otherwise, return value of
        // param. decreased by 1.
        int evalPage = (page.orElse(0) < 1) ? property.INITIAL_PAGE : page.get() - 1;

        Page<AddOnKwh> addOnKwhs = addOnKwhService.findAllPageable(new PageRequest(evalPage, evalPageSize));
        Pager pager = new Pager(addOnKwhs.getTotalPages(), addOnKwhs.getNumber(), property.BUTTONS_TO_SHOW);

        modelAndView.addObject("addOnKwhLists", addOnKwhs);
        modelAndView.addObject("selectedPageSize", evalPageSize);
        modelAndView.addObject("pageSizes", property.PAGE_SIZES);
        modelAndView.addObject("pager", pager);
        return modelAndView;
    }
}

package com.newcitysoft.study.ajaxdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/9/4 14:33
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
        return "111";
    }
}

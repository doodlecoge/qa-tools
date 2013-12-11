package com.hch.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huaiwang on 13-12-11.
 */
@Controller
@RequestMapping("/urldenc")
public class UrlDEncoder {
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "urldenc";
    }
}

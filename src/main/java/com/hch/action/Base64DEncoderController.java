package com.hch.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: huaiwang
 * Date: 13-12-10
 * Time: 上午9:04
 */

@Controller
@RequestMapping("/b64denc")
public class Base64DEncoderController {
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "b64denc";
    }
}

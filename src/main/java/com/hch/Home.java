package com.hch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;

/**
 * User: huaiwang
 * Date: 13-11-23
 * Time: 上午11:05
 */


@Controller
@RequestMapping("/")
public class Home {
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("a", "b");
        map.put("aa", "bb");

        HashSet<String> set = new HashSet<String>();
        set.add("a1");
        set.add("a2");
        set.add("a3");

        map.put("set", set);

        return "home";
    }
}

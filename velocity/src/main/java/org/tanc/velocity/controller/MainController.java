package org.tanc.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主控制器
 *
 * @author tanc
 */
@Controller
public class MainController {

    @RequestMapping("/index")
    public String index() {
        return "/index";
    }

    @RequestMapping("/jsp")
    public String second() {
        return "/second";
    }
}

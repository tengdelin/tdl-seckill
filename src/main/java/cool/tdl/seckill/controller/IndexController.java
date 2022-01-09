package cool.tdl.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author tdl
 * @Date 2022/1/8 18:00
 * @description 调转首页
 * @Version 1.0
 */

@Controller
public class IndexController {
    @GetMapping({"/", "/index"})
    private String index() {
        return "index";
    }
}

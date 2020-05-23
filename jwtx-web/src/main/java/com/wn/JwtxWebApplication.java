package com.wn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@SpringBootApplication
@Controller
public class JwtxWebApplication {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(JwtxWebApplication.class, args);
    }

}

package com.vodafone.ecommerce.frontend;

import com.vodafone.ecommerce.admin.Admin;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/")
@AllArgsConstructor
public class FrontendController {


    @GetMapping("/welcomeLogin")
    @ResponseBody
    public String loginPage(Model model){
        model.addAttribute("admin login",new Admin());
        return "login";
    }

}

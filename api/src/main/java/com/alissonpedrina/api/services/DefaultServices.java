package com.alissonpedrina.api.services;

import java.security.Principal;
import java.util.Map;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class DefaultServices {
  @GetMapping("/login")
  public String login() {
    return "/login";
  }
  @GetMapping("/")
  public String ok(Principal principal, Map<String, Object> model) {
    return "/home";
  }


}

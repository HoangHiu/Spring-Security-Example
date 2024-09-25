package org.myapp.spirngsecurityexample.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/hello")
public class HelloController {
    @GetMapping(value = "")
    public String getHello(HttpServletRequest request, HttpServletResponse response){
        String requestString = request.getRemoteUser();
        String responseString = String.valueOf(response.getStatus());
        return "Hello " + requestString + "\nStatus:" + responseString ;
    }
}

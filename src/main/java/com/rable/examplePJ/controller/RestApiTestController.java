package com.rable.examplePJ.controller;

import com.rable.examplePJ.main.CreateMember;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RestApiTestController {

    private final CreateMember createMember = new CreateMember();
    @ResponseBody
    @GetMapping("/members")
    public List<Map<String, Object>> findAllMember(){

        return createMember.getMembers();
    }
    @ResponseBody
    @GetMapping("/")
    public int login(){

        createMember.create();

        Map<String,Object> count = createMember.getCount();
        return (int)count.get("Count");
    }

}

package edu.miu.cse.securitydemo.secured;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/management")
public class MemberController {

    @GetMapping("/member")
    public String member() {
        return "member: secured end point";
    }
}
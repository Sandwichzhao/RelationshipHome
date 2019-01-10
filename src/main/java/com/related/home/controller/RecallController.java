package com.related.home.controller;

import com.related.home.dto.UserInfoDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller(value = "recallController")
@RequestMapping(value = "/v1")
public class RecallController {
    @RequestMapping(value = "/register/user", method = RequestMethod.POST)
    public ResponseEntity<?> registerUserInfo(
            @RequestBody UserInfoDTO userInfo,
            @RequestHeader HttpHeaders headers) {

        return ResponseEntity.ok(null);
    }
}

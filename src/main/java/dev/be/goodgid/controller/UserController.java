package dev.be.goodgid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.be.goodgid.common.response.CommonResponse;
import dev.be.goodgid.common.response.enums.ReturnCode;
import dev.be.goodgid.model.User;
import dev.be.goodgid.repository.oltp.UserMapper;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public CommonResponse<?> getUser() {
        User user = userMapper.selectByPrimaryKey(1L);
        return new CommonResponse<>(ReturnCode.SUCCESS, user);
    }
}

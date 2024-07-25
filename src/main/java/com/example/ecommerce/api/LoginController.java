package com.example.ecommerce.api;

import com.example.ecommerce.core.mapper.AuthenticatedRequestMapper;
import com.example.ecommerce.core.model.HomeCookUser;
import com.example.ecommerce.core.model.Order;
import com.example.ecommerce.core.serviceimpl.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final AuthenticatedRequestMapper requestMapper;
    private final LoginService loginService;

    @PostMapping
    public Boolean IsAuthenticated(@RequestBody CredientialsAuthenticatedDTO requestDTO) {

        return loginService.isAuthenticated(requestMapper.toModel(requestDTO));

    }

    @GetMapping("/users")
    public List<HomeCookUser> fetchUsers() {

        return loginService.getUsers();
    }

}

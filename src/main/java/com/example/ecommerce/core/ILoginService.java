package com.example.ecommerce.core;

import com.example.ecommerce.core.model.AuthenticatedRequest;
import com.example.ecommerce.core.model.HomeCookUser;

import java.util.List;

public interface ILoginService {

    Boolean isAuthenticated(AuthenticatedRequest request);

    List<HomeCookUser> getUsers();
}

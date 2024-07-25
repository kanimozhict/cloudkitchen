package com.example.ecommerce.core.serviceimpl;

import com.example.ecommerce.core.ILoginService;
import com.example.ecommerce.core.mapper.HomeCookUserMapper;
import com.example.ecommerce.core.model.AuthenticatedRequest;
import com.example.ecommerce.core.model.HomeCookUser;
import com.example.ecommerce.persistence.LoginEntity;
import com.example.ecommerce.persistence.repo.HomeCookUserRepository;
import com.example.ecommerce.persistence.repo.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService implements ILoginService {

    private final LoginRepository loginRepository;
    private final HomeCookUserRepository cookUserRepository;
    private final HomeCookUserMapper cookUserMapper;
    @Override
    public Boolean isAuthenticated(AuthenticatedRequest request) {
        LoginEntity login = loginRepository.findByEmailIdAndPassword(request.getEmailID(), request.getPassword());
        if(login!=null){
            return true;
        }
        return false;
    }

    @Override
    public List<HomeCookUser> getUsers() {
        return cookUserMapper.toModel(cookUserRepository.findAll());
    }
}

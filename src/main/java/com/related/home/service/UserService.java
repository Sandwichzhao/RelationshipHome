package com.related.home.service;

import com.related.home.dto.AddressDTO;
import com.related.home.dto.UserInfoDTO;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class UserService {

    @Transactional
    public void registerUserInfo(UserInfoDTO userInfoDTO) {
        AddressDTO addressDTO = userInfoDTO.getAddress();
    }

}


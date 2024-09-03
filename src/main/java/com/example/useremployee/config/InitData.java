package com.example.useremployee.config;

import com.example.useremployee.model.User;
import com.example.useremployee.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User us1 = new User();
        us1.setEmail("karen@aol.com");
        us1.setPassword("asd");
        userRepository.save(us1);

        us1.setUserID(0);
        us1.setEmail("kurt@aol.com");
        us1.setPassword("adfg");
        userRepository.save(us1);

        us1.setUserID(0);
        us1.setEmail("jens@aolt.com");
        us1.setPassword("iga");
        userRepository.save(us1);
    }

}

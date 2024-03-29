package exsample.dbauth.user.service;

import exsample.dbauth.user.datasource.UserDataRepository;
import exsample.dbauth.user.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDataService implements UserDetailsService {

    @Autowired
    UserDataRepository userDataRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserData user =  userDataRepository.findById(username);

        return user;
    }
}

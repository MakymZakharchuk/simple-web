package ua.bychkovskyy.security.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.transaction.annotation.Transactional;
import ua.bychkovskyy.security.UserService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier("userDetailsDao")
    private UserDetailsManager userDetailsManager;

    @PostConstruct
    public void initAdmin(){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        User admin = new User("admin", "admin", authorities);

        createUser(admin);
    }

    @Override
    public boolean userExists(String username) {
        return userDetailsManager.userExists(username);
    }

    @Override
    @Transactional
    public void changePassword(String oldPassword, String newPassword) {
        userDetailsManager.changePassword(oldPassword, newPassword);
    }

    @Override
    @Transactional
    public void deleteUser(String username) {
        userDetailsManager.deleteUser(username);
    }

    @Override
    @Transactional
    public void updateUser(UserDetails user) {
        userDetailsManager.updateUser(user);
    }

    @Override
    @Transactional
    public void createUser(UserDetails user) {
        userDetailsManager.createUser(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDetailsManager.loadUserByUsername(username);
    }
}

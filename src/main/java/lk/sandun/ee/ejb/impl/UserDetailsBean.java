package lk.sandun.ee.ejb.impl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;
import lk.sandun.ee.ejb.remote.UserDetails;

@Stateless(name = "UserInfo", mappedName = "UserInfo")
public class UserDetailsBean implements UserDetails {

    int count;

    @PostConstruct
    public void init() {
        System.out.println("UserDetailsBean init");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("UserDetailsBean destroy");
    }

    @Override
    public String getName() {
        try {
            Thread.sleep(5000);
        }catch (Exception e) {

        }
        count++;
        return "Sandun : "+count;
    }

    @Override
    public String getEmail() {
        return "Sandunamayadunne2003@gmail.com";
    }

    @Override
    public String getContact() {
        return "0770852536";
    }
}

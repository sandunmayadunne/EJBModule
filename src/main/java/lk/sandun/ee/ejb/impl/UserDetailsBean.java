package lk.sandun.ee.ejb.impl;

import jakarta.ejb.Stateless;
import lk.sandun.ee.ejb.remote.UserDetails;

@Stateless
public class UserDetailsBean implements UserDetails {
    @Override
    public String getName() {
        return "Sandun";
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

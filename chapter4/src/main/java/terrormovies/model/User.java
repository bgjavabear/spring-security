package terrormovies.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class User extends org.springframework.security.core.userdetails.User {

    private String lastname;

    public User(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
                boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, String lastname) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired,
                accountNonLocked, authorities);
        this.lastname = lastname;
    }

    public User(String username, String password, Collection<? extends GrantedAuthority> authorities, String lastname) {
        this(username, password, true, true, true, true,
                authorities, lastname);
    }

    public String getLastname() {
        return lastname;
    }
}

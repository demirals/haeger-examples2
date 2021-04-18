package de.haegerconsulting.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static de.haegerconsulting.security.ApplicationUserPermission.*;
public enum ApplicationUserRole {

    PRAKTIKANT(Sets.newHashSet()),
    KW(Sets.newHashSet(PATIENT_LESEN, REZEPT_LESEN)),
    ARZT(Sets.newHashSet(PATIENT_LESEN, PATIENT_SCHREIBEN, REZEPT_LESEN, REZEPT_SCHREIBEN));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions(){
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthories(){
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));

        return permissions;
    }
}

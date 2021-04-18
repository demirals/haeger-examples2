package de.haegerconsulting.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import static de.haegerconsulting.security.ApplicationUserPermission.*;
import static de.haegerconsulting.security.ApplicationUserRole.*;

@Configurable
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationUserConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationUserConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "index", "css", "js").permitAll()
                .antMatchers("/api/**").hasRole(PRAKTIKANT.name())
                .antMatchers(HttpMethod.DELETE,"/management/api/**").hasAuthority(PATIENT_SCHREIBEN.getPermission())
                .antMatchers(HttpMethod.POST,"/management/api/**").hasAuthority(PATIENT_SCHREIBEN.getPermission())
                .antMatchers(HttpMethod.PUT,"/management/api/**").hasAuthority(PATIENT_SCHREIBEN.getPermission())
                .antMatchers(HttpMethod.GET,"/management/api/**").hasAnyRole(ARZT.name(), KW.name())
                .anyRequest().authenticated()
                .and()
                .httpBasic();

    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {

        UserDetails thomas = User.builder()
                .username("ralf")
                .password(passwordEncoder.encode("passRalf"))
                .roles("PRAKTIKANT") // ROLE_PRAKTIKANT
                .authorities(PRAKTIKANT.getGrantedAuthories())
                .build();

        UserDetails jana = User.builder()
                .username("cedrik")
                .password(passwordEncoder.encode("passCedrik"))
               // .roles("KW") // ROLE_KW
                .authorities(KW.getGrantedAuthories())
                .build();

        UserDetails andreas = User.builder()
                .username("andreas")
                .password(passwordEncoder.encode("passAndreas"))
               // .roles("ARZT") // ROLE_ARZT
                .authorities(ARZT.getGrantedAuthories())
                .build();



        return new InMemoryUserDetailsManager(
                thomas,
                jana,
                andreas
        );
    }
}

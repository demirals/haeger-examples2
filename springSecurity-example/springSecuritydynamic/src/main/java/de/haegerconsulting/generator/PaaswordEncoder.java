package de.haegerconsulting.generator;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PaaswordEncoder {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String nonEncodedPassword = "passRalf";
        String encodedPassord = encoder.encode(nonEncodedPassword);

        System.out.println(encodedPassord);
    }
}

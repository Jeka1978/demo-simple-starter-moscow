package com.naya.demosimplestarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Evgeny Borisov
 */
@Data
@ConfigurationProperties("userdetails")
public class UserDetails {
    private String name;
}

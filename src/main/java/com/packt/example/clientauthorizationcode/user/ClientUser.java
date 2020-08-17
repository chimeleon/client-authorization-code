package com.packt.example.clientauthorizationcode.user;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class ClientUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String accessToken;
    private ZonedDateTime accessTokenValidity;
    private String refreshToken;
    @Transient
    private List<Entry> entries = new ArrayList<>();
}

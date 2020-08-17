package com.packt.example.clientauthorizationcode.user;

import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Client, Long> {
    Optional<ClientUser> findByUsername(String username);
}

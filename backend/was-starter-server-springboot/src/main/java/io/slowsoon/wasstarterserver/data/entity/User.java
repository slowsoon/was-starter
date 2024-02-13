package io.slowsoon.wasstarterserver.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seq;
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;


    public void setSeq(Long seq) { this.seq = seq; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setCreatedAt(LocalDateTime now) { this.createdAt = now; }
    public void setUpdatedAt(LocalDateTime now) { this.updatedAt = now; }

    public Long getSeq() { return this.seq; }
    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public String getPassword() { return this.password; }
}

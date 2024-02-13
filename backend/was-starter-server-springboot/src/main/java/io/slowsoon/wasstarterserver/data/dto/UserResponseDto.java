package io.slowsoon.wasstarterserver.data.dto;

public class UserResponseDto {
    private Long seq;
    private String name;
    private String email;
    private String password;

    public UserResponseDto() {

    }

    public UserResponseDto(Long seq, String name, String email, String password) {
        this.seq = seq;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getSeq() { return this.seq; }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
    public void setSeq(Long seq) { this.seq = seq; }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

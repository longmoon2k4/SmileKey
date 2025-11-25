package com.he186065.smilekey.model;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(50)", nullable = false)
    private String name;
    @Column(name = "Username", columnDefinition = "NVARCHAR(50)", nullable = false, unique = true)
    private String username;
    @Column(name = "Password", columnDefinition = "NVARCHAR(50)", nullable = false)
    private String password;
    @Column(name = "Email", columnDefinition = "NVARCHAR(50)", nullable = false, unique = true)
    private String email;
    @Column(name = "Role", columnDefinition = "NVARCHAR(50)", nullable = false)
    private String role;
    @Column(name = "Status", columnDefinition = "NVARCHAR(50)", nullable = false)
    private Boolean status;

    public User() {
    }

    public User(String name,String username, String password, String email, String role, Boolean status) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", status=" + status +
                '}';
    }
}

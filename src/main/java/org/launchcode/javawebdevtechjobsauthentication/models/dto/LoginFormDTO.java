package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20, message = "Invalid username. Between 3 and 50 characters please.")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20, message = "Invalid password. Between 3 and 50 characters please.")
    private String password;

//    public String getName() {
//        return username;
//    }
//
//    public void setName(String name) {
//        this.username = name;
//    }

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
}

package uz.pdp.homework1.payload;

import lombok.Data;

@Data
public class LoginDto {
    private String email;
    private String password;
}

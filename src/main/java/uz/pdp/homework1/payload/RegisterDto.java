package uz.pdp.homework1.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterDto {

    private String firtName;

    private String lastName;

    private String email;

    private String password;

    private Integer roleId;
}

package uz.pdp.homework1.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {


    private String message;
    private boolean succes;
    private Object object;

    public ApiResponse(String message, boolean succes) {
        this.message = message;
        this.succes = succes;
    }
}

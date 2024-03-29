package sarahguarneri.CAPSTONE.payloads.users.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record NewUserClientDTO(
        @NotEmpty(message = "The field name must be filled")
        @Size(min = 3, max = 30, message = "The name must be between 3 and 30 characters!")
        String name,
        @NotEmpty(message = "The field surname must be filled")
        @Size(min = 3, max = 30, message = "The surname must be between 3 and 30 characters!")
        String surname,
        @Email
        @NotEmpty(message = "The field email must be filled")
        String email,
        @NotEmpty(message = "The field password must be filled")
        @Size(min = 6, message = "Password must be at least 6 characters!")
        String password,
        @NotEmpty(message = "The field phone number must be filled")
        String phone_number
//        @NotEmpty(message = "Role must be one of these: admin, client or exhibitor")
//        String role
) {
}

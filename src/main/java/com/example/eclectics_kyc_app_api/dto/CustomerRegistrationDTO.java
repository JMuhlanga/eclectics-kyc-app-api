package com.example.eclectics_kyc_app_api.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.processing.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerRegistrationDTO {

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10,15}$", message = "Phone number must be valid")
    private String phone;

    @NotBlank(message = "First name is required")
    @Size(max = 50, message = "First name cannot exceed 50 characters")
    private String firstName;

    private String middleName;

    @NotBlank(message = "Last name is required")
    @Size(max = 50, message = "Last name cannot exceed 50 characters")
    private String lastName;

    @NotBlank(message = "ID number is required")
    @Pattern(regexp = "^[0-9]{6,12}$", message = "ID number must be valid")
    private String idNumber;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    private String passportPic; // Base64 encoded or URL
    private String frontIdPic;  // Base64 encoded or URL
    private String backIdPic;   // Base64 encoded or URL
}

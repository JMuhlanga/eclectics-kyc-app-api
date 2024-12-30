package com.example.eclectics_kyc_app_api.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "customers") // Map to the `customers` table in the database
public class CustomersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate IDs
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "id_number", nullable = false, unique = true)
    private String idNumber;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "passport_pic", nullable = false)
    private String passportPic;

    @Column(name = "front_id_pic", nullable = false)
    private String frontIdPic;

    @Column(name = "back_id_pic", nullable = false)
    private String backIdPic;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "status", nullable = false)
    private String status = "INACTIVE"; // Default status


}

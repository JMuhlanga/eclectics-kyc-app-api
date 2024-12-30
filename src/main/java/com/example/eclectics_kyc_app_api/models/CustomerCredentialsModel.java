package com.example.eclectics_kyc_app_api.models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "customer_credentials") // Map to the `customer_credentials` table in the database
public class CustomerCredentialsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate credential ID
    @Column(name = "cred_id")
    private Long credId;

    @Column(name = "customer_id", nullable = false)
    private Long customerId; // Foreign key linking to the customers table

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password; // Should be stored as a hashed value
}

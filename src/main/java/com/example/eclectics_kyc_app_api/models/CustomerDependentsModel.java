package com.example.eclectics_kyc_app_api.models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "customer_dependents") // Map to the `customer_dependents` table in the database
public class CustomerDependentsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate dependent ID
    @Column(name = "dependent_id")
    private Long dependentId;

    @Column(name = "customer_id", nullable = false)
    private Long customerId; // Foreign key linking to the customers table

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "relationship", nullable = false)
    private String relationship;

    @Column(name = "contact", nullable = false)
    private String contact;
}

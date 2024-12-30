package com.example.eclectics_kyc_app_api.repository;

import com.example.eclectics_kyc_app_api.models.CustomerDependentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentRepository extends JpaRepository<CustomerDependentsModel, Long> {
}

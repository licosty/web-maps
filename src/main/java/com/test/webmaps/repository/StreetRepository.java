package com.test.webmaps.repository;

import com.test.webmaps.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface StreetRepository extends JpaRepository<Street, Long>, JpaSpecificationExecutor<Street> {
}

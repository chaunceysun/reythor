package com.bc.provider.repository;

import com.bc.provider.bean.Depart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartRepository extends JpaRepository<Depart, Integer> {
}

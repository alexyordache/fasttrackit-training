package org.fasttrackit.universityapp.repository;

import org.fasttrackit.universityapp.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<Human, Long> {
}

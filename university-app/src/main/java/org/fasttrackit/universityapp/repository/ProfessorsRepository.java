package org.fasttrackit.universityapp.repository;

import org.fasttrackit.universityapp.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorsRepository extends JpaRepository<Professor, Long> {
}

package org.fasttrackit.universityapp.repository;

import org.fasttrackit.universityapp.entity.Human;
import org.fasttrackit.universityapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumansRepository extends JpaRepository<Human, Long> {
}

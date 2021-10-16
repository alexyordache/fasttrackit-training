package org.fasttrackit.universityapp.repository;

import org.fasttrackit.universityapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Course, Long> {
}

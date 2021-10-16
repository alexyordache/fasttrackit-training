package org.fasttrackit.universityapp.repository;

import org.fasttrackit.universityapp.entity.ScheduledCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleCourseRepository extends JpaRepository<ScheduledCourse, Long> {
}

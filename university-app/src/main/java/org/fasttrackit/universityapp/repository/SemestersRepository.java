package org.fasttrackit.universityapp.repository;

import org.fasttrackit.universityapp.entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestersRepository extends JpaRepository<Semester, Long> {
    java.util.List<Semester> findByUniversityDeptAndUniversityYearAndSemesterNo(String universityDept, String universityYear, String semesterNo);
}

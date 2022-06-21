package com.example.subjectrestapi.repository;

import com.example.subjectrestapi.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,String>{



}

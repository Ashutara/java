package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

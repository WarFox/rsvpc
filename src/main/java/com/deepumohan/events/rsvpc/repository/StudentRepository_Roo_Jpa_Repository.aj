// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.deepumohan.events.rsvpc.repository;

import com.deepumohan.events.rsvpc.domain.Student;
import com.deepumohan.events.rsvpc.repository.StudentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

privileged aspect StudentRepository_Roo_Jpa_Repository {
    
    declare parents: StudentRepository extends JpaRepository<Student, Long>;
    
    declare parents: StudentRepository extends JpaSpecificationExecutor<Student>;
    
    declare @type: StudentRepository: @Repository;
    
}

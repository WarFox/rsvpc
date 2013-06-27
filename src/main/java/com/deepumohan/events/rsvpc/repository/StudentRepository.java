package com.deepumohan.events.rsvpc.repository;

import com.deepumohan.events.rsvpc.domain.Student;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Student.class)
public interface StudentRepository {
}

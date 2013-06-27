package com.deepumohan.events.rsvpc.repository;

import com.deepumohan.events.rsvpc.domain.Event;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Event.class)
public interface EventRepository {
}

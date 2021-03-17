package com.jkelly.tickets.ticketsshop.repos;

import com.jkelly.tickets.ticketsshop.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}

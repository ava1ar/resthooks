package com.byteflair.resthooks.events;

import com.byteflair.resthooks.journal.EventLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;

/**
 * Created by Daniel Cerecedo <daniel.cerecedo@byteflair.com> on 19/04/16.
 */
@Configuration
public class EventConfig {
    @Bean
    @Autowired
    EventService eventService(EventRepository eventRepository) {
        return new EventService(eventRepository);
    }


    @Bean
    @Autowired
    EventResourceProcessor eventResourceProcessor(EventLogRepository eventLogRepository, RepositoryEntityLinks repositoryEntityLinks) {
        return new EventResourceProcessor(eventLogRepository, repositoryEntityLinks);
    }

    @Bean
    EventController eventController() {
        return new EventController();
    }
}

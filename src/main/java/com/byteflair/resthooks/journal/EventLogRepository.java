package com.byteflair.resthooks.journal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by Daniel Cerecedo <daniel.cerecedo@byteflair.com> on 15/04/16.
 */
@RepositoryRestResource(path = "journal", collectionResourceRel = "journal", itemResourceRel = "log")
public interface EventLogRepository extends PagingAndSortingRepository<EventLog, String> {

    @RestResource(path = "event", rel = "journal")
    List<EventLog> findByEventIdOrderByTimestampDesc(@Param("event-id") String eventId);
}

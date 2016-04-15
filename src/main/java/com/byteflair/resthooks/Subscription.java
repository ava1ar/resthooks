package com.byteflair.resthooks;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.net.URL;
import java.time.LocalDateTime;

/**
 * Created by Daniel Cerecedo <daniel.cerecedo@byteflair.com> on 15/04/16.
 */
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Document
public class Subscription {
    @Field
    @Id
    private String id;
    @Field
    private String topic;
    @Field
    private int maximunRetries;
    @Field
    private URL callback;
    @Field
    private LocalDateTime timestamp;
}
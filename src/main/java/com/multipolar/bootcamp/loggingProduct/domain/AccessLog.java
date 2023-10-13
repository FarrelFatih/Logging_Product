package com.multipolar.bootcamp.loggingProduct.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "access_log_service")
@ToString
@EqualsAndHashCode
public class AccessLog implements Serializable {
    @Id
    private String id;
    private String requestMethod;
    private String requestUri;
    private Integer responseStatusCode;
    private LocalDateTime timestamp = LocalDateTime.now();
    private String content;

}

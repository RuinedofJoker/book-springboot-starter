package org.joker.bookspringbootstarter.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "joker.book")
public class BookProperties {
    private String name;
    private String publisher;
}

package org.joker.bookspringbootstarter.autoconfigure;

import org.joker.bookspringbootstarter.pojo.BookProperties;
import org.joker.bookspringbootstarter.service.BookService;
import org.joker.bookspringbootstarter.service.impl.BookServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass
@EnableConfigurationProperties(BookProperties.class)
public class BookAutoConfiguration {
    private BookProperties bookProperties;

    public BookAutoConfiguration(BookProperties bookProperties) {
        this.bookProperties = bookProperties;
    }

    @Bean
    @ConditionalOnMissingBean(BookService.class)
    public BookService bookService() {
        BookService bookService = new BookServiceImpl(bookProperties);
        return bookService;
    }
}

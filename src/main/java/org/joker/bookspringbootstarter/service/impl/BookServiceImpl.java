package org.joker.bookspringbootstarter.service.impl;

import org.joker.bookspringbootstarter.pojo.BookProperties;
import org.joker.bookspringbootstarter.service.BookService;

public class BookServiceImpl implements BookService {

    private BookProperties bookProperties;

    public BookServiceImpl(BookProperties bookProperties) {
        this.bookProperties = bookProperties;
    }

    @Override
    public String readBook() {
        StringBuilder builder = new StringBuilder();
        builder
                .append("Read the book ")
                .append(bookProperties.getName())
                .append(" and is from ")
                .append(bookProperties.getPublisher())
                .append("!!!");
        return builder.toString();
    }
}

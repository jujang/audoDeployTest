package com.dongnebook.domain.book.dto.response;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.dongnebook.domain.book.dto.response.QBookResponse is a Querydsl Projection type for BookResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBookResponse extends ConstructorExpression<BookResponse> {

    private static final long serialVersionUID = 2097671120L;

    public QBookResponse(com.querydsl.core.types.Expression<Long> bookId, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> author, com.querydsl.core.types.Expression<String> publisher, com.querydsl.core.types.Expression<Integer> rentalFee, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<com.dongnebook.domain.book.domain.BookState> state, com.querydsl.core.types.Expression<String> bookImgUrl, com.querydsl.core.types.Expression<Long> dibsId, com.querydsl.core.types.Expression<java.time.LocalDateTime> rentalStart, com.querydsl.core.types.Expression<java.time.LocalDateTime> rentalEnd) {
        super(BookResponse.class, new Class<?>[]{long.class, String.class, String.class, String.class, int.class, String.class, com.dongnebook.domain.book.domain.BookState.class, String.class, long.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class}, bookId, title, author, publisher, rentalFee, content, state, bookImgUrl, dibsId, rentalStart, rentalEnd);
    }

}


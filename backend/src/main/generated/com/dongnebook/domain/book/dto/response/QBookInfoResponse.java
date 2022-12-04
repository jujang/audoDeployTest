package com.dongnebook.domain.book.dto.response;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.dongnebook.domain.book.dto.response.QBookInfoResponse is a Querydsl Projection type for BookInfoResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBookInfoResponse extends ConstructorExpression<BookInfoResponse> {

    private static final long serialVersionUID = -141637858L;

    public QBookInfoResponse(com.querydsl.core.types.Expression<Long> bookId, com.querydsl.core.types.Expression<String> bookUrl, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> author, com.querydsl.core.types.Expression<String> publisher, com.querydsl.core.types.Expression<Integer> rentalFee, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<? extends com.dongnebook.domain.model.Location> location, com.querydsl.core.types.Expression<com.dongnebook.domain.book.domain.BookState> bookState, com.querydsl.core.types.Expression<String> merchantName) {
        super(BookInfoResponse.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class, int.class, String.class, com.dongnebook.domain.model.Location.class, com.dongnebook.domain.book.domain.BookState.class, String.class}, bookId, bookUrl, title, author, publisher, rentalFee, content, location, bookState, merchantName);
    }

}


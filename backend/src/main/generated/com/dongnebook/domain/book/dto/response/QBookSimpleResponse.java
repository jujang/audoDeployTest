package com.dongnebook.domain.book.dto.response;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.dongnebook.domain.book.dto.response.QBookSimpleResponse is a Querydsl Projection type for BookSimpleResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBookSimpleResponse extends ConstructorExpression<BookSimpleResponse> {

    private static final long serialVersionUID = 1884063842L;

    public QBookSimpleResponse(com.querydsl.core.types.Expression<Long> bookId, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<com.dongnebook.domain.book.domain.BookState> status, com.querydsl.core.types.Expression<String> bookImage, com.querydsl.core.types.Expression<? extends com.dongnebook.domain.book.domain.Money> rentalFee, com.querydsl.core.types.Expression<? extends com.dongnebook.domain.model.Location> location, com.querydsl.core.types.Expression<String> merchantName) {
        super(BookSimpleResponse.class, new Class<?>[]{long.class, String.class, com.dongnebook.domain.book.domain.BookState.class, String.class, com.dongnebook.domain.book.domain.Money.class, com.dongnebook.domain.model.Location.class, String.class}, bookId, title, status, bookImage, rentalFee, location, merchantName);
    }

    public QBookSimpleResponse(com.querydsl.core.types.Expression<Long> bookId, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<com.dongnebook.domain.book.domain.BookState> status, com.querydsl.core.types.Expression<String> bookImage) {
        super(BookSimpleResponse.class, new Class<?>[]{long.class, String.class, com.dongnebook.domain.book.domain.BookState.class, String.class}, bookId, title, status, bookImage);
    }

    public QBookSimpleResponse(com.querydsl.core.types.Expression<Long> bookId, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<? extends com.dongnebook.domain.book.domain.Money> rentalFee, com.querydsl.core.types.Expression<String> bookImage, com.querydsl.core.types.Expression<String> merchantName) {
        super(BookSimpleResponse.class, new Class<?>[]{long.class, String.class, com.dongnebook.domain.book.domain.Money.class, String.class, String.class}, bookId, title, rentalFee, bookImage, merchantName);
    }

}


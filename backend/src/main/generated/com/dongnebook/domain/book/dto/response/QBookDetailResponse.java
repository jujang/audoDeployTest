package com.dongnebook.domain.book.dto.response;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.dongnebook.domain.book.dto.response.QBookDetailResponse is a Querydsl Projection type for BookDetailResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBookDetailResponse extends ConstructorExpression<BookDetailResponse> {

    private static final long serialVersionUID = 666460161L;

    public QBookDetailResponse(com.querydsl.core.types.Expression<? extends BookResponse> book, com.querydsl.core.types.Expression<? extends com.dongnebook.domain.member.dto.response.BookDetailMemberResponse> merchant) {
        super(BookDetailResponse.class, new Class<?>[]{BookResponse.class, com.dongnebook.domain.member.dto.response.BookDetailMemberResponse.class}, book, merchant);
    }

}


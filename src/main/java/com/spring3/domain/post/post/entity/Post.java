package com.spring3.domain.post.post.entity;

import com.spring3.global.jpa.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Post extends BaseEntity {
    private String title;
    private String content;
}

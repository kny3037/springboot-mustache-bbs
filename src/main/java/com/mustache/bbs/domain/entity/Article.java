package com.mustache.bbs.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity //JPA에서 객체로 다루겠다는 선언
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    //@Entity가 붙어있다면 꼭 붙여줘야 한다. pk를 의미.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //자동 완성
    //ID를 직접 생성하지 않고 자동으로 생성하도록 한 경우 붙인다.
    private Long id;

    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

// @Entity, @Id, @GeneratedValue 세 개는 세트!

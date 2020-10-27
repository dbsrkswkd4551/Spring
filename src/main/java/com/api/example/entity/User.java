package com.api.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder //builder를 사용할 수 있게 한다
@Entity // jpa entity임을 알린다
@Getter //user 필드값의 getter를 자동으로 생성한다
@NoArgsConstructor //인자없는 생성자를 자동으로 생성한다
@AllArgsConstructor //인자를 모두 갖춘 생성자를 자동으로 생성한다
@Table(name = "user") //user 테이블과 매핑됨을 명시
public class User {
    @Id // primaryKey임을 알린다
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk 생성 전략을 DB에 위임한다 (=auto_increment)
    private long msrl;

    @Column(nullable = false, unique = true, length = 30) // uid column명시, NOTNULL이고 유니크한 필드이며 길이는 30이다
    private String uid;

    @Column(nullable = false, length = 100) //name column명시, NOTNULL이고 길이는 100이다
    private String name;
}

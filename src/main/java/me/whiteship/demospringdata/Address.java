package me.whiteship.demospringdata;

import jakarta.persistence.Embeddable;

/**
 * @Embeddable
 *  - 값을 정의하는 곳에 사용
 */
@Embeddable
public class Address {
    private String street;

    private String city;

    private String state;

    private String zipCodle;
}

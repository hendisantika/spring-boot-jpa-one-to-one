package com.hendisantika.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jpa-one-to-one
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/04/22
 * Time: 14.46
 */
@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {

    @Id
    @Column(name = "id")
    @SequenceGenerator(initialValue = 1, name = "address_seq", sequenceName = "address_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    private int id;

    @Column(name = "doornumber")
    private String doorNumber;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;
}

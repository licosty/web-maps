package com.test.webmaps.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "apartments")
@Getter
@Setter
@ToString
public class Apartment extends BaseEntity {
    @Column(name = "area")
    private Float area;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;
}

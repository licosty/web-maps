package com.test.webmaps.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "houses")
@Getter
@Setter
@ToString
public class House extends BaseEntity {
    @Column(name = "number")
    private String number;

    @ManyToOne
    @JoinColumn(name = "street_id")
    private Street street;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "house")
    private List<Apartment> apartments;
}

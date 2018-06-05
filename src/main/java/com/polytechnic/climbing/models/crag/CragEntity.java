package com.polytechnic.climbing.models.crag;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "crag")
@Table(name = "crag")
public class CragEntity {
    @Id
    @Column(name = "crag_id")
    private Long cragId;

    @Column(name = "area_id")
    private Long areaId;

    @Column(name = "Title")
    private  String title;
}



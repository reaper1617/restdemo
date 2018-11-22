package com.gerasimchuk.pqademo.entities;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity()
@Table(name = "ExtDataChangeProt_V", schema = "pqadb")
public class ExtDataChangeProtV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "protRecord_ID")
    private Integer protRecordId;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Column(name = "timerName")
    private String timerName;// varchar(64) not null,

    @Column(name = "param_ID")
    private Integer paramID;// int not null,

    @Column(name = "param_status_txt")
    private String paramStatusTxt; // varchar(81),

    @Column(name = "subIndex")
    private Integer subIndex; // int,

    @Column(name = "oldValue")
    private String oldValue; // varchar(81),

    @Column(name = "oldValue_txt")
    private String oldValueTxt;// varchar(81),

    @Column(name = "newValue")
    private String newValue;// varchar(81),

    @Column(name = "newValue_txt")
    private String newValueTxt;// varchar(81),

    @Column(name = "oldNormValue")
    private String oldNormValue;// varchar(81),

    @Column(name = "newNormValue")
    private String newNormValue;// varchar(81),

    @Column(name = "physicalUnitId")
    private Integer physicalUnitId;// int,

    @Column(name = "computerName")
    private String computerName;// varchar(64),

    @Column(name = "userName")
    private String userName;// varchar(64),

    @Column(name = "comment")
    private String comment;// varchar(64)

}

package com.assignment.camel.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pain001")
public class Pain001 implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "message_id")
    private String message_id;

    @Lob
    private String xml;

}

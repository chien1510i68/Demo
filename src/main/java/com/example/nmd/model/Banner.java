package com.example.nmd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Banner {
    @Id
    private long id ;

    @Column(name = "image")
    private String image ;
    @Column(name = "type")
    private String type ;

    private String tile ;
}

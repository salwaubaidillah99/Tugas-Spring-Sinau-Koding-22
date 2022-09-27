package com.sinaukoding.tokosinau.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nama_supplier;

    @Column
    private String noTelp;

    @Column
    private String alamat;
}


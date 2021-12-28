package com.bpkadlampungtengah.simda.helper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ref_pot_spm_rek")
public class RefPotSpmRek {
    @Id
    @Column(name = "kd_pot_rek")
    private int kdPotRek;
    private int kdRek1;
    private int kdRek2;
    private int kdRek3;
    private int kdRek4;
    private int kdRek5;
    private int kdPot;

    @ManyToOne
    private RefPotSpm refPotSpm;
}


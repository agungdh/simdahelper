package com.bpkadlampungtengah.simda.helper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(TaSpmPotPrimaryKey.class)
@Table(name = "ta_spm_pot")
public class TaSpmPotEntity {
    @Id
    private int tahun;
    @Id
    private String noSpm;
    @Id
    @Column(name = "kd_pot_rek")
    private int kdPotRek;
    private BigDecimal nilai;
    private String kdBilling;
    private String ntpn;
    private Timestamp tgltrxNtpn;
    private Timestamp tglbukuNtpn;

    @ManyToOne
    private RefPotSpmRek refPotSpmRek;
}


package com.bpkadlampungtengah.simda.helper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ref_pot_spm")
public class RefPotSpm {
    @Id
    @Column(name = "kd_pot")
    private int kdPot;
    private String nmPot;
    private String kdMap;
}


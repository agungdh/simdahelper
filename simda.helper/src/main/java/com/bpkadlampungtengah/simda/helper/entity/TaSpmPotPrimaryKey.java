package com.bpkadlampungtengah.simda.helper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaSpmPotPrimaryKey implements Serializable {
    private int tahun;
    private String noSpm;
    private int kdPotRek;
}

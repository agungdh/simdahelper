package com.bpkadlampungtengah.simda.helper.repository;

import com.bpkadlampungtengah.simda.helper.entity.TaSpmPotEntity;

import java.util.List;
import java.util.Map;

public interface PajakRepositoryInterface {
    List<Map<String, Object>> allTaSpmDatas();
    List<Map<String, Object>> allTaSpmDatas(int tahun);
    List<TaSpmPotEntity> getAllDatas();
    void getAllDatasPajakBulanan();
}
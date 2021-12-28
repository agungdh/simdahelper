package com.bpkadlampungtengah.simda.helper.resource;

import com.bpkadlampungtengah.simda.helper.entity.TaSpmPotEntity;
import com.bpkadlampungtengah.simda.helper.repository.PajakRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pajak")
@Slf4j
public class PajakResource {
    @Autowired
    PajakRepository pajakRepository;

    @GetMapping("/")
    public ResponseEntity<String> test() {
        log.info("ehe");
        return ResponseEntity.ok("hehe");
    }

    @GetMapping("/datas")
    public ResponseEntity<List<Map<String, Object>>> taPotSpmDatas() {
        return ResponseEntity.ok(pajakRepository.allTaSpmDatas());
    }

    @GetMapping("/datas2")
    public ResponseEntity<List<TaSpmPotEntity>> taPotSpmDatas2() {
        return ResponseEntity.ok(pajakRepository.getAllDatas());
    }

    @GetMapping("/datas3")
    public void taPotSpmDatas3() {
        pajakRepository.getAllDatasPajakBulanan();
    }
}

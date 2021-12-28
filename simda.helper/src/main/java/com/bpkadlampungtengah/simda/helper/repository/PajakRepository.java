package com.bpkadlampungtengah.simda.helper.repository;

import com.bpkadlampungtengah.simda.helper.entity.QRefPotSpm;
import com.bpkadlampungtengah.simda.helper.entity.QRefPotSpmRek;
import com.bpkadlampungtengah.simda.helper.entity.QTaSpmPotEntity;
import com.bpkadlampungtengah.simda.helper.entity.TaSpmPotEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@Repository
@Slf4j
public class PajakRepository implements PajakRepositoryInterface {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Map<String, Object>> allTaSpmDatas() {
        return jdbcTemplate.queryForList("SELECT * FROM ta_spm_pot");
    }

    @Override
    public List<Map<String, Object>> allTaSpmDatas(int tahun) {
        return jdbcTemplate.queryForList("SELECT * FROM ta_spm_pot");
    }

    @Override
    public List<TaSpmPotEntity> getAllDatas() {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);

        QTaSpmPotEntity qTaSpmPotEntity = QTaSpmPotEntity.taSpmPotEntity;

        List<TaSpmPotEntity> taSpmPotEntity = queryFactory.selectFrom(qTaSpmPotEntity).fetch();

        return taSpmPotEntity;
    }

    @Override
    public void getAllDatasPajakBulanan() {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);

        QTaSpmPotEntity qTaSpmPotEntity = QTaSpmPotEntity.taSpmPotEntity;
        QRefPotSpm qRefPotSpm = QRefPotSpm.refPotSpm;
        QRefPotSpmRek qRefPotSpmRek = QRefPotSpmRek.refPotSpmRek;

        List<TaSpmPotEntity> taSpmPotEntity = queryFactory
                .selectFrom(qTaSpmPotEntity)
                .join(qTaSpmPotEntity.refPotSpmRek, qRefPotSpmRek)

                .fetch();

        log.info(taSpmPotEntity.toString());
    }
}

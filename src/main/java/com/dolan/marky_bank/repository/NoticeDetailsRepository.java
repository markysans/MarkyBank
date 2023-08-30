package com.dolan.marky_bank.repository;

import com.dolan.marky_bank.entity.NoticeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface NoticeDetailsRepository extends JpaRepository<NoticeDetails, Long> {
    @Query("select nd from NoticeDetails nd where noticeBeginDate >= :date "
    + " AND noticeEndDate <= :date")
    List<NoticeDetails> findActiveNotices(@Param("date")LocalDate date);
}

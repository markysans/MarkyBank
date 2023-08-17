package com.dolan.marky_bank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "account_transactions")
public class AccountTransaction {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2")
    private String transactionId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_number", nullable = false)
    private Accounts account;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    private LocalDateTime transactionDateTime;
    private String transactionSummary;
    private String transactionType;
    private Double transactionAmount;
    private Double closingBalance;
    @CreationTimestamp
    private LocalDateTime createdDateTime;
    @UpdateTimestamp
    private LocalDateTime updatedDateTime;

}

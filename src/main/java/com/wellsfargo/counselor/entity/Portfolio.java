package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private LocalDate creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, String portfolioName, LocalDate creationDate) {
        this.client = client;
        this.portfolioName = portfolioName;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
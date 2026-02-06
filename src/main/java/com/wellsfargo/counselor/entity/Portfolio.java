package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToMany
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false, updatable = false)
    private LocalDate creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, LocalDate creationDate) {
        this.client = client;
        this.creationDate = LocalDate.now();
    }

    public Long getPortfolioId() { return portfolioId; }

    public Client getClient() { return client; }

    public LocalDate getCreationDate() { return creationDate; }
}

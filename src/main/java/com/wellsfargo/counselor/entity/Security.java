package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private Long securityId;

    @Column(nullable = false)
    private String type;   // e.g., Stock, Bond

    @Column(nullable = false)
    private String name;   // e.g., Apple, Tesla

    @Column(nullable = false)
    private double value;  // current value

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    protected Security() {}

    public Security(String type, String name, double value, Portfolio portfolio) {
        this.type = type;
        this.name = name;
        this.value = value;
        this.portfolio = portfolio;
    }

    public Long getSecurityId() { return securityId; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}

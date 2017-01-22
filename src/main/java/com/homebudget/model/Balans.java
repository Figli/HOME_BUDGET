package com.homebudget.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "balans")
public class Balans {

    @Id
    @Column(name = "balans_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "balans")
    private double balans;

    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamo;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "balans", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Purse> purseList;

    public Balans() {

    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

    public Date getTimeStamo() {
        return timeStamo;
    }

    public void setTimeStamo(Date timeStamo) {
        this.timeStamo = timeStamo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Purse> getPurseList() {
        return purseList;
    }

    public void setPurseList(List<Purse> purseList) {
        this.purseList = purseList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Balans{" +
                "id=" + id +
                ", balans=" + balans +
                ", timeStamo=" + timeStamo +
                ", category=" + category +
                ", purseList=" + purseList +
                '}';
    }
}

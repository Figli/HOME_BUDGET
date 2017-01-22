package com.homebudget.model;

import javax.persistence.*;

@Entity
@Table(name = "purse")
public class Purse {

    @Id
    @Column(name = "purse_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "purse_name")
    private String purseName;

    @Column(name = "purse_balans")
    private double purseBalans;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Balans balans;

    public Purse() {

    }

    public Purse(double purseBalans, String purseName) {
        this.purseBalans = purseBalans;
        this.purseName = purseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPurseName() {
        return purseName;
    }

    public void setPurseName(String purseName) {
        this.purseName = purseName;
    }

    public double getPurseBalans() {
        return purseBalans;
    }

    public void setPurseBalans(double purseBalans) {
        this.purseBalans = purseBalans;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Balans getBalans() {
        return balans;
    }

    public void setBalans(Balans balans) {
        this.balans = balans;
    }

    @Override
    public String toString() {
        return "Purse{" +
                "id=" + id +
                ", purseName='" + purseName + '\'' +
                ", purseBalans=" + purseBalans +
                ", user=" + user +
                ", balans=" + balans +
                '}';
    }
}

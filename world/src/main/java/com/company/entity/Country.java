/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tss
 */

@Entity
@Table(name = "country")
public class Country implements Serializable{

    @Id
    @Column(length = 3, name = "Code")
    private String Code;
    private String Name;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Continent Continent;
    
    private String Region;
    private String SurfaceArea;
    private Integer IndepYear;
    private Double Population;
    private Double LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private Integer Capital;
    private String Code2;

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Continent getContinent() {
        return Continent;
    }

    public void setContinent(Continent Continent) {
        this.Continent = Continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(String SurfaceArea) {
        this.SurfaceArea = SurfaceArea;
    }

    public Integer getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(Integer IndepYear) {
        this.IndepYear = IndepYear;
    }

    public Double getPopulation() {
        return Population;
    }

    public void setPopulation(Double Population) {
        this.Population = Population;
    }

    public Double getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(Double LifeExpectancy) {
        this.LifeExpectancy = LifeExpectancy;
    }

    public Double getGNP() {
        return GNP;
    }

    public void setGNP(Double GNP) {
        this.GNP = GNP;
    }

    public Double getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(Double GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String LocalName) {
        this.LocalName = LocalName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String GovernmentForm) {
        this.GovernmentForm = GovernmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String HeadOfState) {
        this.HeadOfState = HeadOfState;
    }

    public Integer getCapital() {
        return Capital;
    }

    public void setCapital(Integer Capital) {
        this.Capital = Capital;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String Code2) {
        this.Code2 = Code2;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Code);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;
        return Objects.equals(this.Code, other.Code);
    }

    @Override
    public String toString() {
        return "Country{" + "Code=" + Code + ", Name=" + Name + ", Continent=" + Continent + ", Region=" + Region + ", SurfaceArea=" + SurfaceArea + ", IndepYear=" + IndepYear + ", Population=" + Population + ", LifeExpectancy=" + LifeExpectancy + ", GNP=" + GNP + ", GNPOld=" + GNPOld + ", LocalName=" + LocalName + ", GovernmentForm=" + GovernmentForm + ", HeadOfState=" + HeadOfState + ", Capital=" + Capital + ", Code2=" + Code2 + '}';
    }
   
}

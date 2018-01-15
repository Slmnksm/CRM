/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "Bakim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bakim.findAll", query = "SELECT b FROM Bakim b"),
    @NamedQuery(name = "Bakim.findByPkbakim", query = "SELECT b FROM Bakim b WHERE b.pkbakim = :pkbakim"),
    @NamedQuery(name = "Bakim.findByBakimtar", query = "SELECT b FROM Bakim b WHERE b.bakimtar = :bakimtar"),
    @NamedQuery(name = "Bakim.findByBakim", query = "SELECT b FROM Bakim b WHERE b.bakim = :bakim"),
    @NamedQuery(name = "Bakim.findBySorumlu", query = "SELECT b FROM Bakim b WHERE b.sorumlu = :sorumlu"),
    @NamedQuery(name = "Bakim.findByKontrol", query = "SELECT b FROM Bakim b WHERE b.kontrol = :kontrol"),
    @NamedQuery(name = "Bakim.findByDegisen", query = "SELECT b FROM Bakim b WHERE b.degisen = :degisen"),
    @NamedQuery(name = "Bakim.findByFkstok", query = "SELECT b FROM Bakim b WHERE b.fkstok = :fkstok"),
    @NamedQuery(name = "Bakim.findByFaturano", query = "SELECT b FROM Bakim b WHERE b.faturano = :faturano")})
public class Bakim implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkbakim")
    private Integer pkbakim;
    @Column(name = "bakimtar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bakimtar;
    @Size(max = 1073741823)
    @Column(name = "bakim")
    private String bakim;
    @Size(max = 50)
    @Column(name = "sorumlu")
    private String sorumlu;
    @Size(max = 50)
    @Column(name = "kontrol")
    private String kontrol;
    @Size(max = 1073741823)
    @Column(name = "degisen")
    private String degisen;
    @Column(name = "fkstok")
    private Integer fkstok;
    @Size(max = 50)
    @Column(name = "faturano")
    private String faturano;

    public Bakim() {
    }

    public Bakim(Integer pkbakim) {
        this.pkbakim = pkbakim;
    }

    public Integer getPkbakim() {
        return pkbakim;
    }

    public void setPkbakim(Integer pkbakim) {
        this.pkbakim = pkbakim;
    }

    public Date getBakimtar() {
        return bakimtar;
    }

    public void setBakimtar(Date bakimtar) {
        this.bakimtar = bakimtar;
    }

    public String getBakim() {
        return bakim;
    }

    public void setBakim(String bakim) {
        this.bakim = bakim;
    }

    public String getSorumlu() {
        return sorumlu;
    }

    public void setSorumlu(String sorumlu) {
        this.sorumlu = sorumlu;
    }

    public String getKontrol() {
        return kontrol;
    }

    public void setKontrol(String kontrol) {
        this.kontrol = kontrol;
    }

    public String getDegisen() {
        return degisen;
    }

    public void setDegisen(String degisen) {
        this.degisen = degisen;
    }

    public Integer getFkstok() {
        return fkstok;
    }

    public void setFkstok(Integer fkstok) {
        this.fkstok = fkstok;
    }

    public String getFaturano() {
        return faturano;
    }

    public void setFaturano(String faturano) {
        this.faturano = faturano;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkbakim != null ? pkbakim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bakim)) {
            return false;
        }
        Bakim other = (Bakim) object;
        if ((this.pkbakim == null && other.pkbakim != null) || (this.pkbakim != null && !this.pkbakim.equals(other.pkbakim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Bakim[ pkbakim=" + pkbakim + " ]";
    }
    
}

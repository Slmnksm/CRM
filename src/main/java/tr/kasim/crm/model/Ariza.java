/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "Ariza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ariza.findAll", query = "SELECT a FROM Ariza a"),
    @NamedQuery(name = "Ariza.findByPkariza", query = "SELECT a FROM Ariza a WHERE a.pkariza = :pkariza"),
    @NamedQuery(name = "Ariza.findByArizaTar", query = "SELECT a FROM Ariza a WHERE a.arizaTar = :arizaTar"),
    @NamedQuery(name = "Ariza.findByServisAd", query = "SELECT a FROM Ariza a WHERE a.servisAd = :servisAd"),
    @NamedQuery(name = "Ariza.findByArizaNeden", query = "SELECT a FROM Ariza a WHERE a.arizaNeden = :arizaNeden"),
    @NamedQuery(name = "Ariza.findByUcret", query = "SELECT a FROM Ariza a WHERE a.ucret = :ucret"),
    @NamedQuery(name = "Ariza.findByDonusTar", query = "SELECT a FROM Ariza a WHERE a.donusTar = :donusTar"),
    @NamedQuery(name = "Ariza.findByFkstok", query = "SELECT a FROM Ariza a WHERE a.fkstok = :fkstok"),
    @NamedQuery(name = "Ariza.findByFaturaNo", query = "SELECT a FROM Ariza a WHERE a.faturaNo = :faturaNo")})
public class Ariza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkariza")
    private Integer pkariza;
    @Column(name = "ArizaTar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arizaTar;
    @Size(max = 150)
    @Column(name = "ServisAd")
    private String servisAd;
    @Size(max = 1073741823)
    @Column(name = "ArizaNeden")
    private String arizaNeden;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Ucret")
    private BigDecimal ucret;
    @Column(name = "DonusTar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date donusTar;
    @Column(name = "fkstok")
    private Integer fkstok;
    @Size(max = 50)
    @Column(name = "FaturaNo")
    private String faturaNo;

    public Ariza() {
    }

    public Ariza(Integer pkariza) {
        this.pkariza = pkariza;
    }

    public Integer getPkariza() {
        return pkariza;
    }

    public void setPkariza(Integer pkariza) {
        this.pkariza = pkariza;
    }

    public Date getArizaTar() {
        return arizaTar;
    }

    public void setArizaTar(Date arizaTar) {
        this.arizaTar = arizaTar;
    }

    public String getServisAd() {
        return servisAd;
    }

    public void setServisAd(String servisAd) {
        this.servisAd = servisAd;
    }

    public String getArizaNeden() {
        return arizaNeden;
    }

    public void setArizaNeden(String arizaNeden) {
        this.arizaNeden = arizaNeden;
    }

    public BigDecimal getUcret() {
        return ucret;
    }

    public void setUcret(BigDecimal ucret) {
        this.ucret = ucret;
    }

    public Date getDonusTar() {
        return donusTar;
    }

    public void setDonusTar(Date donusTar) {
        this.donusTar = donusTar;
    }

    public Integer getFkstok() {
        return fkstok;
    }

    public void setFkstok(Integer fkstok) {
        this.fkstok = fkstok;
    }

    public String getFaturaNo() {
        return faturaNo;
    }

    public void setFaturaNo(String faturaNo) {
        this.faturaNo = faturaNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkariza != null ? pkariza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ariza)) {
            return false;
        }
        Ariza other = (Ariza) object;
        if ((this.pkariza == null && other.pkariza != null) || (this.pkariza != null && !this.pkariza.equals(other.pkariza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Ariza[ pkariza=" + pkariza + " ]";
    }
    
}

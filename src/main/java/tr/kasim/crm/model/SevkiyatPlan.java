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
@Table(name = "SevkiyatPlan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SevkiyatPlan.findAll", query = "SELECT s FROM SevkiyatPlan s"),
    @NamedQuery(name = "SevkiyatPlan.findByPkSevkPlan", query = "SELECT s FROM SevkiyatPlan s WHERE s.pkSevkPlan = :pkSevkPlan"),
    @NamedQuery(name = "SevkiyatPlan.findByTarih", query = "SELECT s FROM SevkiyatPlan s WHERE s.tarih = :tarih"),
    @NamedQuery(name = "SevkiyatPlan.findByFkArac", query = "SELECT s FROM SevkiyatPlan s WHERE s.fkArac = :fkArac"),
    @NamedQuery(name = "SevkiyatPlan.findBySofor", query = "SELECT s FROM SevkiyatPlan s WHERE s.sofor = :sofor"),
    @NamedQuery(name = "SevkiyatPlan.findByGuzergah", query = "SELECT s FROM SevkiyatPlan s WHERE s.guzergah = :guzergah"),
    @NamedQuery(name = "SevkiyatPlan.findByYukAdet", query = "SELECT s FROM SevkiyatPlan s WHERE s.yukAdet = :yukAdet"),
    @NamedQuery(name = "SevkiyatPlan.findByToplamAgirlik", query = "SELECT s FROM SevkiyatPlan s WHERE s.toplamAgirlik = :toplamAgirlik"),
    @NamedQuery(name = "SevkiyatPlan.findByToplamHacim", query = "SELECT s FROM SevkiyatPlan s WHERE s.toplamHacim = :toplamHacim"),
    @NamedQuery(name = "SevkiyatPlan.findByAciklama", query = "SELECT s FROM SevkiyatPlan s WHERE s.aciklama = :aciklama")})
public class SevkiyatPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkSevkPlan")
    private Integer pkSevkPlan;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Column(name = "fkArac")
    private Integer fkArac;
    @Size(max = 50)
    @Column(name = "Sofor")
    private String sofor;
    @Size(max = 50)
    @Column(name = "Guzergah")
    private String guzergah;
    @Column(name = "YukAdet")
    private Integer yukAdet;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ToplamAgirlik")
    private BigDecimal toplamAgirlik;
    @Column(name = "ToplamHacim")
    private BigDecimal toplamHacim;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;

    public SevkiyatPlan() {
    }

    public SevkiyatPlan(Integer pkSevkPlan) {
        this.pkSevkPlan = pkSevkPlan;
    }

    public Integer getPkSevkPlan() {
        return pkSevkPlan;
    }

    public void setPkSevkPlan(Integer pkSevkPlan) {
        this.pkSevkPlan = pkSevkPlan;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public Integer getFkArac() {
        return fkArac;
    }

    public void setFkArac(Integer fkArac) {
        this.fkArac = fkArac;
    }

    public String getSofor() {
        return sofor;
    }

    public void setSofor(String sofor) {
        this.sofor = sofor;
    }

    public String getGuzergah() {
        return guzergah;
    }

    public void setGuzergah(String guzergah) {
        this.guzergah = guzergah;
    }

    public Integer getYukAdet() {
        return yukAdet;
    }

    public void setYukAdet(Integer yukAdet) {
        this.yukAdet = yukAdet;
    }

    public BigDecimal getToplamAgirlik() {
        return toplamAgirlik;
    }

    public void setToplamAgirlik(BigDecimal toplamAgirlik) {
        this.toplamAgirlik = toplamAgirlik;
    }

    public BigDecimal getToplamHacim() {
        return toplamHacim;
    }

    public void setToplamHacim(BigDecimal toplamHacim) {
        this.toplamHacim = toplamHacim;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkSevkPlan != null ? pkSevkPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SevkiyatPlan)) {
            return false;
        }
        SevkiyatPlan other = (SevkiyatPlan) object;
        if ((this.pkSevkPlan == null && other.pkSevkPlan != null) || (this.pkSevkPlan != null && !this.pkSevkPlan.equals(other.pkSevkPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SevkiyatPlan[ pkSevkPlan=" + pkSevkPlan + " ]";
    }
    
}

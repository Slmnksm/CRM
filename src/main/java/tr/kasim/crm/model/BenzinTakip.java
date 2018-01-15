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
@Table(name = "BenzinTakip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BenzinTakip.findAll", query = "SELECT b FROM BenzinTakip b"),
    @NamedQuery(name = "BenzinTakip.findByPkBenzin", query = "SELECT b FROM BenzinTakip b WHERE b.pkBenzin = :pkBenzin"),
    @NamedQuery(name = "BenzinTakip.findByFkArac", query = "SELECT b FROM BenzinTakip b WHERE b.fkArac = :fkArac"),
    @NamedQuery(name = "BenzinTakip.findByTarih", query = "SELECT b FROM BenzinTakip b WHERE b.tarih = :tarih"),
    @NamedQuery(name = "BenzinTakip.findByFkfirma", query = "SELECT b FROM BenzinTakip b WHERE b.fkfirma = :fkfirma"),
    @NamedQuery(name = "BenzinTakip.findBySofor", query = "SELECT b FROM BenzinTakip b WHERE b.sofor = :sofor"),
    @NamedQuery(name = "BenzinTakip.findByMiktar", query = "SELECT b FROM BenzinTakip b WHERE b.miktar = :miktar"),
    @NamedQuery(name = "BenzinTakip.findByTutar", query = "SELECT b FROM BenzinTakip b WHERE b.tutar = :tutar"),
    @NamedQuery(name = "BenzinTakip.findByFisNo", query = "SELECT b FROM BenzinTakip b WHERE b.fisNo = :fisNo"),
    @NamedQuery(name = "BenzinTakip.findByAracKm", query = "SELECT b FROM BenzinTakip b WHERE b.aracKm = :aracKm"),
    @NamedQuery(name = "BenzinTakip.findByAciklama", query = "SELECT b FROM BenzinTakip b WHERE b.aciklama = :aciklama")})
public class BenzinTakip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkBenzin")
    private Integer pkBenzin;
    @Column(name = "fkArac")
    private Integer fkArac;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Column(name = "fkfirma")
    private Integer fkfirma;
    @Size(max = 50)
    @Column(name = "Sofor")
    private String sofor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Miktar")
    private BigDecimal miktar;
    @Column(name = "Tutar")
    private BigDecimal tutar;
    @Size(max = 50)
    @Column(name = "FisNo")
    private String fisNo;
    @Column(name = "AracKm")
    private BigDecimal aracKm;
    @Size(max = 150)
    @Column(name = "Aciklama")
    private String aciklama;

    public BenzinTakip() {
    }

    public BenzinTakip(Integer pkBenzin) {
        this.pkBenzin = pkBenzin;
    }

    public Integer getPkBenzin() {
        return pkBenzin;
    }

    public void setPkBenzin(Integer pkBenzin) {
        this.pkBenzin = pkBenzin;
    }

    public Integer getFkArac() {
        return fkArac;
    }

    public void setFkArac(Integer fkArac) {
        this.fkArac = fkArac;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public Integer getFkfirma() {
        return fkfirma;
    }

    public void setFkfirma(Integer fkfirma) {
        this.fkfirma = fkfirma;
    }

    public String getSofor() {
        return sofor;
    }

    public void setSofor(String sofor) {
        this.sofor = sofor;
    }

    public BigDecimal getMiktar() {
        return miktar;
    }

    public void setMiktar(BigDecimal miktar) {
        this.miktar = miktar;
    }

    public BigDecimal getTutar() {
        return tutar;
    }

    public void setTutar(BigDecimal tutar) {
        this.tutar = tutar;
    }

    public String getFisNo() {
        return fisNo;
    }

    public void setFisNo(String fisNo) {
        this.fisNo = fisNo;
    }

    public BigDecimal getAracKm() {
        return aracKm;
    }

    public void setAracKm(BigDecimal aracKm) {
        this.aracKm = aracKm;
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
        hash += (pkBenzin != null ? pkBenzin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BenzinTakip)) {
            return false;
        }
        BenzinTakip other = (BenzinTakip) object;
        if ((this.pkBenzin == null && other.pkBenzin != null) || (this.pkBenzin != null && !this.pkBenzin.equals(other.pkBenzin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.BenzinTakip[ pkBenzin=" + pkBenzin + " ]";
    }
    
}

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
@Table(name = "SevkBekleyen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SevkBekleyen.findAll", query = "SELECT s FROM SevkBekleyen s"),
    @NamedQuery(name = "SevkBekleyen.findByPksevk", query = "SELECT s FROM SevkBekleyen s WHERE s.pksevk = :pksevk"),
    @NamedQuery(name = "SevkBekleyen.findBySevkno", query = "SELECT s FROM SevkBekleyen s WHERE s.sevkno = :sevkno"),
    @NamedQuery(name = "SevkBekleyen.findByTarih", query = "SELECT s FROM SevkBekleyen s WHERE s.tarih = :tarih"),
    @NamedQuery(name = "SevkBekleyen.findBySiparisno", query = "SELECT s FROM SevkBekleyen s WHERE s.siparisno = :siparisno"),
    @NamedQuery(name = "SevkBekleyen.findByFkFirma", query = "SELECT s FROM SevkBekleyen s WHERE s.fkFirma = :fkFirma"),
    @NamedQuery(name = "SevkBekleyen.findByFkYetkili", query = "SELECT s FROM SevkBekleyen s WHERE s.fkYetkili = :fkYetkili"),
    @NamedQuery(name = "SevkBekleyen.findByFkProjeKod", query = "SELECT s FROM SevkBekleyen s WHERE s.fkProjeKod = :fkProjeKod"),
    @NamedQuery(name = "SevkBekleyen.findByFkTeklif", query = "SELECT s FROM SevkBekleyen s WHERE s.fkTeklif = :fkTeklif"),
    @NamedQuery(name = "SevkBekleyen.findByUstNo", query = "SELECT s FROM SevkBekleyen s WHERE s.ustNo = :ustNo"),
    @NamedQuery(name = "SevkBekleyen.findByAciklama", query = "SELECT s FROM SevkBekleyen s WHERE s.aciklama = :aciklama"),
    @NamedQuery(name = "SevkBekleyen.findByDurum", query = "SELECT s FROM SevkBekleyen s WHERE s.durum = :durum"),
    @NamedQuery(name = "SevkBekleyen.findBySevkEmriZaman", query = "SELECT s FROM SevkBekleyen s WHERE s.sevkEmriZaman = :sevkEmriZaman"),
    @NamedQuery(name = "SevkBekleyen.findByHazirOlmaZaman", query = "SELECT s FROM SevkBekleyen s WHERE s.hazirOlmaZaman = :hazirOlmaZaman"),
    @NamedQuery(name = "SevkBekleyen.findBySevkiyatZaman", query = "SELECT s FROM SevkBekleyen s WHERE s.sevkiyatZaman = :sevkiyatZaman")})
public class SevkBekleyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksevk")
    private Integer pksevk;
    @Column(name = "sevkno")
    private Integer sevkno;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Column(name = "siparisno")
    private Integer siparisno;
    @Column(name = "fkFirma")
    private Integer fkFirma;
    @Size(max = 50)
    @Column(name = "fkYetkili")
    private String fkYetkili;
    @Column(name = "fkProjeKod")
    private Integer fkProjeKod;
    @Column(name = "fkTeklif")
    private Integer fkTeklif;
    @Column(name = "UstNo")
    private Integer ustNo;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;
    @Column(name = "SevkEmriZaman")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sevkEmriZaman;
    @Column(name = "HazirOlmaZaman")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hazirOlmaZaman;
    @Column(name = "SevkiyatZaman")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sevkiyatZaman;

    public SevkBekleyen() {
    }

    public SevkBekleyen(Integer pksevk) {
        this.pksevk = pksevk;
    }

    public Integer getPksevk() {
        return pksevk;
    }

    public void setPksevk(Integer pksevk) {
        this.pksevk = pksevk;
    }

    public Integer getSevkno() {
        return sevkno;
    }

    public void setSevkno(Integer sevkno) {
        this.sevkno = sevkno;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public Integer getSiparisno() {
        return siparisno;
    }

    public void setSiparisno(Integer siparisno) {
        this.siparisno = siparisno;
    }

    public Integer getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Integer fkFirma) {
        this.fkFirma = fkFirma;
    }

    public String getFkYetkili() {
        return fkYetkili;
    }

    public void setFkYetkili(String fkYetkili) {
        this.fkYetkili = fkYetkili;
    }

    public Integer getFkProjeKod() {
        return fkProjeKod;
    }

    public void setFkProjeKod(Integer fkProjeKod) {
        this.fkProjeKod = fkProjeKod;
    }

    public Integer getFkTeklif() {
        return fkTeklif;
    }

    public void setFkTeklif(Integer fkTeklif) {
        this.fkTeklif = fkTeklif;
    }

    public Integer getUstNo() {
        return ustNo;
    }

    public void setUstNo(Integer ustNo) {
        this.ustNo = ustNo;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public Date getSevkEmriZaman() {
        return sevkEmriZaman;
    }

    public void setSevkEmriZaman(Date sevkEmriZaman) {
        this.sevkEmriZaman = sevkEmriZaman;
    }

    public Date getHazirOlmaZaman() {
        return hazirOlmaZaman;
    }

    public void setHazirOlmaZaman(Date hazirOlmaZaman) {
        this.hazirOlmaZaman = hazirOlmaZaman;
    }

    public Date getSevkiyatZaman() {
        return sevkiyatZaman;
    }

    public void setSevkiyatZaman(Date sevkiyatZaman) {
        this.sevkiyatZaman = sevkiyatZaman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksevk != null ? pksevk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SevkBekleyen)) {
            return false;
        }
        SevkBekleyen other = (SevkBekleyen) object;
        if ((this.pksevk == null && other.pksevk != null) || (this.pksevk != null && !this.pksevk.equals(other.pksevk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SevkBekleyen[ pksevk=" + pksevk + " ]";
    }
    
}

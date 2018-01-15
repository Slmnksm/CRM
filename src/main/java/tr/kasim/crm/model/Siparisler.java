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
@Table(name = "Siparisler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Siparisler.findAll", query = "SELECT s FROM Siparisler s"),
    @NamedQuery(name = "Siparisler.findByPksiparis", query = "SELECT s FROM Siparisler s WHERE s.pksiparis = :pksiparis"),
    @NamedQuery(name = "Siparisler.findBySiparisUstNo", query = "SELECT s FROM Siparisler s WHERE s.siparisUstNo = :siparisUstNo"),
    @NamedQuery(name = "Siparisler.findByFkFirma", query = "SELECT s FROM Siparisler s WHERE s.fkFirma = :fkFirma"),
    @NamedQuery(name = "Siparisler.findByFkProje", query = "SELECT s FROM Siparisler s WHERE s.fkProje = :fkProje"),
    @NamedQuery(name = "Siparisler.findByFkTeklif", query = "SELECT s FROM Siparisler s WHERE s.fkTeklif = :fkTeklif"),
    @NamedQuery(name = "Siparisler.findBySiparisKullanici", query = "SELECT s FROM Siparisler s WHERE s.siparisKullanici = :siparisKullanici"),
    @NamedQuery(name = "Siparisler.findBySiparisTarihi", query = "SELECT s FROM Siparisler s WHERE s.siparisTarihi = :siparisTarihi"),
    @NamedQuery(name = "Siparisler.findByTerminTarihi", query = "SELECT s FROM Siparisler s WHERE s.terminTarihi = :terminTarihi"),
    @NamedQuery(name = "Siparisler.findBySevkAdresi", query = "SELECT s FROM Siparisler s WHERE s.sevkAdresi = :sevkAdresi"),
    @NamedQuery(name = "Siparisler.findByAciklama", query = "SELECT s FROM Siparisler s WHERE s.aciklama = :aciklama"),
    @NamedQuery(name = "Siparisler.findByDurum", query = "SELECT s FROM Siparisler s WHERE s.durum = :durum"),
    @NamedQuery(name = "Siparisler.findBySil", query = "SELECT s FROM Siparisler s WHERE s.sil = :sil")})
public class Siparisler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksiparis")
    private Integer pksiparis;
    @Column(name = "SiparisUstNo")
    private Integer siparisUstNo;
    @Column(name = "fkFirma")
    private Integer fkFirma;
    @Column(name = "fkProje")
    private Integer fkProje;
    @Column(name = "fkTeklif")
    private Integer fkTeklif;
    @Column(name = "siparis_kullanici")
    private Integer siparisKullanici;
    @Column(name = "siparis_tarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date siparisTarihi;
    @Column(name = "termin_tarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date terminTarihi;
    @Size(max = 250)
    @Column(name = "sevk_adresi")
    private String sevkAdresi;
    @Size(max = 250)
    @Column(name = "aciklama")
    private String aciklama;
    @Size(max = 250)
    @Column(name = "durum")
    private String durum;
    @Column(name = "sil")
    private Boolean sil;

    public Siparisler() {
    }

    public Siparisler(Integer pksiparis) {
        this.pksiparis = pksiparis;
    }

    public Integer getPksiparis() {
        return pksiparis;
    }

    public void setPksiparis(Integer pksiparis) {
        this.pksiparis = pksiparis;
    }

    public Integer getSiparisUstNo() {
        return siparisUstNo;
    }

    public void setSiparisUstNo(Integer siparisUstNo) {
        this.siparisUstNo = siparisUstNo;
    }

    public Integer getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Integer fkFirma) {
        this.fkFirma = fkFirma;
    }

    public Integer getFkProje() {
        return fkProje;
    }

    public void setFkProje(Integer fkProje) {
        this.fkProje = fkProje;
    }

    public Integer getFkTeklif() {
        return fkTeklif;
    }

    public void setFkTeklif(Integer fkTeklif) {
        this.fkTeklif = fkTeklif;
    }

    public Integer getSiparisKullanici() {
        return siparisKullanici;
    }

    public void setSiparisKullanici(Integer siparisKullanici) {
        this.siparisKullanici = siparisKullanici;
    }

    public Date getSiparisTarihi() {
        return siparisTarihi;
    }

    public void setSiparisTarihi(Date siparisTarihi) {
        this.siparisTarihi = siparisTarihi;
    }

    public Date getTerminTarihi() {
        return terminTarihi;
    }

    public void setTerminTarihi(Date terminTarihi) {
        this.terminTarihi = terminTarihi;
    }

    public String getSevkAdresi() {
        return sevkAdresi;
    }

    public void setSevkAdresi(String sevkAdresi) {
        this.sevkAdresi = sevkAdresi;
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

    public Boolean getSil() {
        return sil;
    }

    public void setSil(Boolean sil) {
        this.sil = sil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksiparis != null ? pksiparis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Siparisler)) {
            return false;
        }
        Siparisler other = (Siparisler) object;
        if ((this.pksiparis == null && other.pksiparis != null) || (this.pksiparis != null && !this.pksiparis.equals(other.pksiparis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Siparisler[ pksiparis=" + pksiparis + " ]";
    }
    
}

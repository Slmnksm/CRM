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
@Table(name = "Uretim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uretim.findAll", query = "SELECT u FROM Uretim u"),
    @NamedQuery(name = "Uretim.findByPkUretim", query = "SELECT u FROM Uretim u WHERE u.pkUretim = :pkUretim"),
    @NamedQuery(name = "Uretim.findByUretimno", query = "SELECT u FROM Uretim u WHERE u.uretimno = :uretimno"),
    @NamedQuery(name = "Uretim.findByTarih", query = "SELECT u FROM Uretim u WHERE u.tarih = :tarih"),
    @NamedQuery(name = "Uretim.findBySiparisno", query = "SELECT u FROM Uretim u WHERE u.siparisno = :siparisno"),
    @NamedQuery(name = "Uretim.findByFkFirma", query = "SELECT u FROM Uretim u WHERE u.fkFirma = :fkFirma"),
    @NamedQuery(name = "Uretim.findByFkYetkili", query = "SELECT u FROM Uretim u WHERE u.fkYetkili = :fkYetkili"),
    @NamedQuery(name = "Uretim.findByFkProjeKod", query = "SELECT u FROM Uretim u WHERE u.fkProjeKod = :fkProjeKod"),
    @NamedQuery(name = "Uretim.findByFkTeklif", query = "SELECT u FROM Uretim u WHERE u.fkTeklif = :fkTeklif"),
    @NamedQuery(name = "Uretim.findByUstNo", query = "SELECT u FROM Uretim u WHERE u.ustNo = :ustNo"),
    @NamedQuery(name = "Uretim.findByAciklama", query = "SELECT u FROM Uretim u WHERE u.aciklama = :aciklama"),
    @NamedQuery(name = "Uretim.findByDurum", query = "SELECT u FROM Uretim u WHERE u.durum = :durum"),
    @NamedQuery(name = "Uretim.findByUretimEmriZaman", query = "SELECT u FROM Uretim u WHERE u.uretimEmriZaman = :uretimEmriZaman"),
    @NamedQuery(name = "Uretim.findByHazirOlmaZaman", query = "SELECT u FROM Uretim u WHERE u.hazirOlmaZaman = :hazirOlmaZaman")})
public class Uretim implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkUretim")
    private Integer pkUretim;
    @Column(name = "uretimno")
    private Integer uretimno;
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
    @Column(name = "UretimEmriZaman")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uretimEmriZaman;
    @Column(name = "HazirOlmaZaman")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hazirOlmaZaman;

    public Uretim() {
    }

    public Uretim(Integer pkUretim) {
        this.pkUretim = pkUretim;
    }

    public Integer getPkUretim() {
        return pkUretim;
    }

    public void setPkUretim(Integer pkUretim) {
        this.pkUretim = pkUretim;
    }

    public Integer getUretimno() {
        return uretimno;
    }

    public void setUretimno(Integer uretimno) {
        this.uretimno = uretimno;
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

    public Date getUretimEmriZaman() {
        return uretimEmriZaman;
    }

    public void setUretimEmriZaman(Date uretimEmriZaman) {
        this.uretimEmriZaman = uretimEmriZaman;
    }

    public Date getHazirOlmaZaman() {
        return hazirOlmaZaman;
    }

    public void setHazirOlmaZaman(Date hazirOlmaZaman) {
        this.hazirOlmaZaman = hazirOlmaZaman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkUretim != null ? pkUretim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uretim)) {
            return false;
        }
        Uretim other = (Uretim) object;
        if ((this.pkUretim == null && other.pkUretim != null) || (this.pkUretim != null && !this.pkUretim.equals(other.pkUretim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Uretim[ pkUretim=" + pkUretim + " ]";
    }
    
}

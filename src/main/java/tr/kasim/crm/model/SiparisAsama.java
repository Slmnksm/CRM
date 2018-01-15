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
@Table(name = "SiparisAsama")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiparisAsama.findAll", query = "SELECT s FROM SiparisAsama s"),
    @NamedQuery(name = "SiparisAsama.findByPkSipAsama", query = "SELECT s FROM SiparisAsama s WHERE s.pkSipAsama = :pkSipAsama"),
    @NamedQuery(name = "SiparisAsama.findByFkSipDetay", query = "SELECT s FROM SiparisAsama s WHERE s.fkSipDetay = :fkSipDetay"),
    @NamedQuery(name = "SiparisAsama.findByFkAsama", query = "SELECT s FROM SiparisAsama s WHERE s.fkAsama = :fkAsama"),
    @NamedQuery(name = "SiparisAsama.findBySira", query = "SELECT s FROM SiparisAsama s WHERE s.sira = :sira"),
    @NamedQuery(name = "SiparisAsama.findByBaslama", query = "SELECT s FROM SiparisAsama s WHERE s.baslama = :baslama"),
    @NamedQuery(name = "SiparisAsama.findByBitis", query = "SELECT s FROM SiparisAsama s WHERE s.bitis = :bitis"),
    @NamedQuery(name = "SiparisAsama.findByDurum", query = "SELECT s FROM SiparisAsama s WHERE s.durum = :durum"),
    @NamedQuery(name = "SiparisAsama.findByAsamaad", query = "SELECT s FROM SiparisAsama s WHERE s.asamaad = :asamaad")})
public class SiparisAsama implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkSipAsama")
    private Integer pkSipAsama;
    @Column(name = "fkSipDetay")
    private Integer fkSipDetay;
    @Column(name = "fkAsama")
    private Integer fkAsama;
    @Column(name = "Sira")
    private Integer sira;
    @Column(name = "Baslama")
    @Temporal(TemporalType.TIMESTAMP)
    private Date baslama;
    @Column(name = "Bitis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitis;
    @Column(name = "Durum")
    private Integer durum;
    @Size(max = 50)
    @Column(name = "Asamaad")
    private String asamaad;

    public SiparisAsama() {
    }

    public SiparisAsama(Integer pkSipAsama) {
        this.pkSipAsama = pkSipAsama;
    }

    public Integer getPkSipAsama() {
        return pkSipAsama;
    }

    public void setPkSipAsama(Integer pkSipAsama) {
        this.pkSipAsama = pkSipAsama;
    }

    public Integer getFkSipDetay() {
        return fkSipDetay;
    }

    public void setFkSipDetay(Integer fkSipDetay) {
        this.fkSipDetay = fkSipDetay;
    }

    public Integer getFkAsama() {
        return fkAsama;
    }

    public void setFkAsama(Integer fkAsama) {
        this.fkAsama = fkAsama;
    }

    public Integer getSira() {
        return sira;
    }

    public void setSira(Integer sira) {
        this.sira = sira;
    }

    public Date getBaslama() {
        return baslama;
    }

    public void setBaslama(Date baslama) {
        this.baslama = baslama;
    }

    public Date getBitis() {
        return bitis;
    }

    public void setBitis(Date bitis) {
        this.bitis = bitis;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }

    public String getAsamaad() {
        return asamaad;
    }

    public void setAsamaad(String asamaad) {
        this.asamaad = asamaad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkSipAsama != null ? pkSipAsama.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiparisAsama)) {
            return false;
        }
        SiparisAsama other = (SiparisAsama) object;
        if ((this.pkSipAsama == null && other.pkSipAsama != null) || (this.pkSipAsama != null && !this.pkSipAsama.equals(other.pkSipAsama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SiparisAsama[ pkSipAsama=" + pkSipAsama + " ]";
    }
    
}

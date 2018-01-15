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
@Table(name = "PersonelDevam")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelDevam.findAll", query = "SELECT p FROM PersonelDevam p"),
    @NamedQuery(name = "PersonelDevam.findByPkDevam", query = "SELECT p FROM PersonelDevam p WHERE p.pkDevam = :pkDevam"),
    @NamedQuery(name = "PersonelDevam.findByFkpersonel", query = "SELECT p FROM PersonelDevam p WHERE p.fkpersonel = :fkpersonel"),
    @NamedQuery(name = "PersonelDevam.findByTarih", query = "SELECT p FROM PersonelDevam p WHERE p.tarih = :tarih"),
    @NamedQuery(name = "PersonelDevam.findBySure", query = "SELECT p FROM PersonelDevam p WHERE p.sure = :sure"),
    @NamedQuery(name = "PersonelDevam.findByNeden", query = "SELECT p FROM PersonelDevam p WHERE p.neden = :neden"),
    @NamedQuery(name = "PersonelDevam.findByDurum", query = "SELECT p FROM PersonelDevam p WHERE p.durum = :durum"),
    @NamedQuery(name = "PersonelDevam.findByAciklama", query = "SELECT p FROM PersonelDevam p WHERE p.aciklama = :aciklama")})
public class PersonelDevam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkDevam")
    private Integer pkDevam;
    @Column(name = "fkpersonel")
    private Integer fkpersonel;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Sure")
    private BigDecimal sure;
    @Size(max = 50)
    @Column(name = "Neden")
    private String neden;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;

    public PersonelDevam() {
    }

    public PersonelDevam(Integer pkDevam) {
        this.pkDevam = pkDevam;
    }

    public Integer getPkDevam() {
        return pkDevam;
    }

    public void setPkDevam(Integer pkDevam) {
        this.pkDevam = pkDevam;
    }

    public Integer getFkpersonel() {
        return fkpersonel;
    }

    public void setFkpersonel(Integer fkpersonel) {
        this.fkpersonel = fkpersonel;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public BigDecimal getSure() {
        return sure;
    }

    public void setSure(BigDecimal sure) {
        this.sure = sure;
    }

    public String getNeden() {
        return neden;
    }

    public void setNeden(String neden) {
        this.neden = neden;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
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
        hash += (pkDevam != null ? pkDevam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelDevam)) {
            return false;
        }
        PersonelDevam other = (PersonelDevam) object;
        if ((this.pkDevam == null && other.pkDevam != null) || (this.pkDevam != null && !this.pkDevam.equals(other.pkDevam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PersonelDevam[ pkDevam=" + pkDevam + " ]";
    }
    
}

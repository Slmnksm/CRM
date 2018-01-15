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
@Table(name = "PersonelAvans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelAvans.findAll", query = "SELECT p FROM PersonelAvans p"),
    @NamedQuery(name = "PersonelAvans.findByPkAvans", query = "SELECT p FROM PersonelAvans p WHERE p.pkAvans = :pkAvans"),
    @NamedQuery(name = "PersonelAvans.findByFkpersonel", query = "SELECT p FROM PersonelAvans p WHERE p.fkpersonel = :fkpersonel"),
    @NamedQuery(name = "PersonelAvans.findByTarih", query = "SELECT p FROM PersonelAvans p WHERE p.tarih = :tarih"),
    @NamedQuery(name = "PersonelAvans.findByNeden", query = "SELECT p FROM PersonelAvans p WHERE p.neden = :neden"),
    @NamedQuery(name = "PersonelAvans.findByAciklama", query = "SELECT p FROM PersonelAvans p WHERE p.aciklama = :aciklama"),
    @NamedQuery(name = "PersonelAvans.findByTutar", query = "SELECT p FROM PersonelAvans p WHERE p.tutar = :tutar")})
public class PersonelAvans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkAvans")
    private Integer pkAvans;
    @Column(name = "fkpersonel")
    private Integer fkpersonel;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Size(max = 50)
    @Column(name = "Neden")
    private String neden;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Tutar")
    private BigDecimal tutar;

    public PersonelAvans() {
    }

    public PersonelAvans(Integer pkAvans) {
        this.pkAvans = pkAvans;
    }

    public Integer getPkAvans() {
        return pkAvans;
    }

    public void setPkAvans(Integer pkAvans) {
        this.pkAvans = pkAvans;
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

    public String getNeden() {
        return neden;
    }

    public void setNeden(String neden) {
        this.neden = neden;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public BigDecimal getTutar() {
        return tutar;
    }

    public void setTutar(BigDecimal tutar) {
        this.tutar = tutar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkAvans != null ? pkAvans.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelAvans)) {
            return false;
        }
        PersonelAvans other = (PersonelAvans) object;
        if ((this.pkAvans == null && other.pkAvans != null) || (this.pkAvans != null && !this.pkAvans.equals(other.pkAvans))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PersonelAvans[ pkAvans=" + pkAvans + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "PersonelBirim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelBirim.findAll", query = "SELECT p FROM PersonelBirim p"),
    @NamedQuery(name = "PersonelBirim.findByPkPerBirim", query = "SELECT p FROM PersonelBirim p WHERE p.pkPerBirim = :pkPerBirim"),
    @NamedQuery(name = "PersonelBirim.findByBirimAd", query = "SELECT p FROM PersonelBirim p WHERE p.birimAd = :birimAd")})
public class PersonelBirim implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkPerBirim")
    private Integer pkPerBirim;
    @Size(max = 50)
    @Column(name = "BirimAd")
    private String birimAd;

    public PersonelBirim() {
    }

    public PersonelBirim(Integer pkPerBirim) {
        this.pkPerBirim = pkPerBirim;
    }

    public Integer getPkPerBirim() {
        return pkPerBirim;
    }

    public void setPkPerBirim(Integer pkPerBirim) {
        this.pkPerBirim = pkPerBirim;
    }

    public String getBirimAd() {
        return birimAd;
    }

    public void setBirimAd(String birimAd) {
        this.birimAd = birimAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPerBirim != null ? pkPerBirim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelBirim)) {
            return false;
        }
        PersonelBirim other = (PersonelBirim) object;
        if ((this.pkPerBirim == null && other.pkPerBirim != null) || (this.pkPerBirim != null && !this.pkPerBirim.equals(other.pkPerBirim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PersonelBirim[ pkPerBirim=" + pkPerBirim + " ]";
    }
    
}

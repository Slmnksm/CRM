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
@Table(name = "PersonelGorev")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelGorev.findAll", query = "SELECT p FROM PersonelGorev p"),
    @NamedQuery(name = "PersonelGorev.findByPkGorev", query = "SELECT p FROM PersonelGorev p WHERE p.pkGorev = :pkGorev"),
    @NamedQuery(name = "PersonelGorev.findByGorevAd", query = "SELECT p FROM PersonelGorev p WHERE p.gorevAd = :gorevAd")})
public class PersonelGorev implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkGorev")
    private Integer pkGorev;
    @Size(max = 50)
    @Column(name = "GorevAd")
    private String gorevAd;

    public PersonelGorev() {
    }

    public PersonelGorev(Integer pkGorev) {
        this.pkGorev = pkGorev;
    }

    public Integer getPkGorev() {
        return pkGorev;
    }

    public void setPkGorev(Integer pkGorev) {
        this.pkGorev = pkGorev;
    }

    public String getGorevAd() {
        return gorevAd;
    }

    public void setGorevAd(String gorevAd) {
        this.gorevAd = gorevAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkGorev != null ? pkGorev.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelGorev)) {
            return false;
        }
        PersonelGorev other = (PersonelGorev) object;
        if ((this.pkGorev == null && other.pkGorev != null) || (this.pkGorev != null && !this.pkGorev.equals(other.pkGorev))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PersonelGorev[ pkGorev=" + pkGorev + " ]";
    }
    
}

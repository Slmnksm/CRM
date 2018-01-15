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
@Table(name = "ProjeKod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjeKod.findAll", query = "SELECT p FROM ProjeKod p"),
    @NamedQuery(name = "ProjeKod.findByPkProjeKod", query = "SELECT p FROM ProjeKod p WHERE p.pkProjeKod = :pkProjeKod"),
    @NamedQuery(name = "ProjeKod.findByProjeKod", query = "SELECT p FROM ProjeKod p WHERE p.projeKod = :projeKod"),
    @NamedQuery(name = "ProjeKod.findByProjeAd", query = "SELECT p FROM ProjeKod p WHERE p.projeAd = :projeAd"),
    @NamedQuery(name = "ProjeKod.findByPasif", query = "SELECT p FROM ProjeKod p WHERE p.pasif = :pasif")})
public class ProjeKod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkProjeKod")
    private Integer pkProjeKod;
    @Size(max = 50)
    @Column(name = "ProjeKod")
    private String projeKod;
    @Size(max = 50)
    @Column(name = "ProjeAd")
    private String projeAd;
    @Column(name = "Pasif")
    private Boolean pasif;

    public ProjeKod() {
    }

    public ProjeKod(Integer pkProjeKod) {
        this.pkProjeKod = pkProjeKod;
    }

    public Integer getPkProjeKod() {
        return pkProjeKod;
    }

    public void setPkProjeKod(Integer pkProjeKod) {
        this.pkProjeKod = pkProjeKod;
    }

    public String getProjeKod() {
        return projeKod;
    }

    public void setProjeKod(String projeKod) {
        this.projeKod = projeKod;
    }

    public String getProjeAd() {
        return projeAd;
    }

    public void setProjeAd(String projeAd) {
        this.projeAd = projeAd;
    }

    public Boolean getPasif() {
        return pasif;
    }

    public void setPasif(Boolean pasif) {
        this.pasif = pasif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkProjeKod != null ? pkProjeKod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjeKod)) {
            return false;
        }
        ProjeKod other = (ProjeKod) object;
        if ((this.pkProjeKod == null && other.pkProjeKod != null) || (this.pkProjeKod != null && !this.pkProjeKod.equals(other.pkProjeKod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.ProjeKod[ pkProjeKod=" + pkProjeKod + " ]";
    }
    
}

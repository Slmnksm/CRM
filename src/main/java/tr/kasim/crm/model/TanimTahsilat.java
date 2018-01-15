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
@Table(name = "TanimTahsilat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TanimTahsilat.findAll", query = "SELECT t FROM TanimTahsilat t"),
    @NamedQuery(name = "TanimTahsilat.findByPkTahsilat", query = "SELECT t FROM TanimTahsilat t WHERE t.pkTahsilat = :pkTahsilat"),
    @NamedQuery(name = "TanimTahsilat.findByTahsilat", query = "SELECT t FROM TanimTahsilat t WHERE t.tahsilat = :tahsilat")})
public class TanimTahsilat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkTahsilat")
    private Integer pkTahsilat;
    @Size(max = 50)
    @Column(name = "Tahsilat")
    private String tahsilat;

    public TanimTahsilat() {
    }

    public TanimTahsilat(Integer pkTahsilat) {
        this.pkTahsilat = pkTahsilat;
    }

    public Integer getPkTahsilat() {
        return pkTahsilat;
    }

    public void setPkTahsilat(Integer pkTahsilat) {
        this.pkTahsilat = pkTahsilat;
    }

    public String getTahsilat() {
        return tahsilat;
    }

    public void setTahsilat(String tahsilat) {
        this.tahsilat = tahsilat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkTahsilat != null ? pkTahsilat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TanimTahsilat)) {
            return false;
        }
        TanimTahsilat other = (TanimTahsilat) object;
        if ((this.pkTahsilat == null && other.pkTahsilat != null) || (this.pkTahsilat != null && !this.pkTahsilat.equals(other.pkTahsilat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TanimTahsilat[ pkTahsilat=" + pkTahsilat + " ]";
    }
    
}

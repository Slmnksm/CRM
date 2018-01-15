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
@Table(name = "StokGrup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StokGrup.findAll", query = "SELECT s FROM StokGrup s"),
    @NamedQuery(name = "StokGrup.findByPkGrup", query = "SELECT s FROM StokGrup s WHERE s.pkGrup = :pkGrup"),
    @NamedQuery(name = "StokGrup.findByGrupAd", query = "SELECT s FROM StokGrup s WHERE s.grupAd = :grupAd"),
    @NamedQuery(name = "StokGrup.findByTip", query = "SELECT s FROM StokGrup s WHERE s.tip = :tip"),
    @NamedQuery(name = "StokGrup.findByGrupKod", query = "SELECT s FROM StokGrup s WHERE s.grupKod = :grupKod"),
    @NamedQuery(name = "StokGrup.findByAltGrup", query = "SELECT s FROM StokGrup s WHERE s.altGrup = :altGrup")})
public class StokGrup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkGrup")
    private Integer pkGrup;
    @Size(max = 50)
    @Column(name = "GrupAd")
    private String grupAd;
    @Column(name = "Tip")
    private Integer tip;
    @Size(max = 20)
    @Column(name = "GrupKod")
    private String grupKod;
    @Column(name = "AltGrup")
    private Integer altGrup;

    public StokGrup() {
    }

    public StokGrup(Integer pkGrup) {
        this.pkGrup = pkGrup;
    }

    public Integer getPkGrup() {
        return pkGrup;
    }

    public void setPkGrup(Integer pkGrup) {
        this.pkGrup = pkGrup;
    }

    public String getGrupAd() {
        return grupAd;
    }

    public void setGrupAd(String grupAd) {
        this.grupAd = grupAd;
    }

    public Integer getTip() {
        return tip;
    }

    public void setTip(Integer tip) {
        this.tip = tip;
    }

    public String getGrupKod() {
        return grupKod;
    }

    public void setGrupKod(String grupKod) {
        this.grupKod = grupKod;
    }

    public Integer getAltGrup() {
        return altGrup;
    }

    public void setAltGrup(Integer altGrup) {
        this.altGrup = altGrup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkGrup != null ? pkGrup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StokGrup)) {
            return false;
        }
        StokGrup other = (StokGrup) object;
        if ((this.pkGrup == null && other.pkGrup != null) || (this.pkGrup != null && !this.pkGrup.equals(other.pkGrup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.StokGrup[ pkGrup=" + pkGrup + " ]";
    }
    
}

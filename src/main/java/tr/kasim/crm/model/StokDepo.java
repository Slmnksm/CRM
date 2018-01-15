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
@Table(name = "StokDepo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StokDepo.findAll", query = "SELECT s FROM StokDepo s"),
    @NamedQuery(name = "StokDepo.findByPkdepo", query = "SELECT s FROM StokDepo s WHERE s.pkdepo = :pkdepo"),
    @NamedQuery(name = "StokDepo.findByDepoAd", query = "SELECT s FROM StokDepo s WHERE s.depoAd = :depoAd"),
    @NamedQuery(name = "StokDepo.findByPkSube", query = "SELECT s FROM StokDepo s WHERE s.pkSube = :pkSube"),
    @NamedQuery(name = "StokDepo.findByAdres", query = "SELECT s FROM StokDepo s WHERE s.adres = :adres"),
    @NamedQuery(name = "StokDepo.findByDepoSorumlusu", query = "SELECT s FROM StokDepo s WHERE s.depoSorumlusu = :depoSorumlusu")})
public class StokDepo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkdepo")
    private Integer pkdepo;
    @Size(max = 250)
    @Column(name = "depoAd")
    private String depoAd;
    @Column(name = "pkSube")
    private Integer pkSube;
    @Size(max = 350)
    @Column(name = "adres")
    private String adres;
    @Size(max = 50)
    @Column(name = "DepoSorumlusu")
    private String depoSorumlusu;

    public StokDepo() {
    }

    public StokDepo(Integer pkdepo) {
        this.pkdepo = pkdepo;
    }

    public Integer getPkdepo() {
        return pkdepo;
    }

    public void setPkdepo(Integer pkdepo) {
        this.pkdepo = pkdepo;
    }

    public String getDepoAd() {
        return depoAd;
    }

    public void setDepoAd(String depoAd) {
        this.depoAd = depoAd;
    }

    public Integer getPkSube() {
        return pkSube;
    }

    public void setPkSube(Integer pkSube) {
        this.pkSube = pkSube;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getDepoSorumlusu() {
        return depoSorumlusu;
    }

    public void setDepoSorumlusu(String depoSorumlusu) {
        this.depoSorumlusu = depoSorumlusu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkdepo != null ? pkdepo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StokDepo)) {
            return false;
        }
        StokDepo other = (StokDepo) object;
        if ((this.pkdepo == null && other.pkdepo != null) || (this.pkdepo != null && !this.pkdepo.equals(other.pkdepo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.StokDepo[ pkdepo=" + pkdepo + " ]";
    }
    
}

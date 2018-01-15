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
@Table(name = "MuhPlan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MuhPlan.findAll", query = "SELECT m FROM MuhPlan m"),
    @NamedQuery(name = "MuhPlan.findByPkplan", query = "SELECT m FROM MuhPlan m WHERE m.pkplan = :pkplan"),
    @NamedQuery(name = "MuhPlan.findByMuhKod", query = "SELECT m FROM MuhPlan m WHERE m.muhKod = :muhKod"),
    @NamedQuery(name = "MuhPlan.findByMuhaAd", query = "SELECT m FROM MuhPlan m WHERE m.muhaAd = :muhaAd")})
public class MuhPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkplan")
    private Integer pkplan;
    @Size(max = 50)
    @Column(name = "MuhKod")
    private String muhKod;
    @Size(max = 150)
    @Column(name = "MuhaAd")
    private String muhaAd;

    public MuhPlan() {
    }

    public MuhPlan(Integer pkplan) {
        this.pkplan = pkplan;
    }

    public Integer getPkplan() {
        return pkplan;
    }

    public void setPkplan(Integer pkplan) {
        this.pkplan = pkplan;
    }

    public String getMuhKod() {
        return muhKod;
    }

    public void setMuhKod(String muhKod) {
        this.muhKod = muhKod;
    }

    public String getMuhaAd() {
        return muhaAd;
    }

    public void setMuhaAd(String muhaAd) {
        this.muhaAd = muhaAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkplan != null ? pkplan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MuhPlan)) {
            return false;
        }
        MuhPlan other = (MuhPlan) object;
        if ((this.pkplan == null && other.pkplan != null) || (this.pkplan != null && !this.pkplan.equals(other.pkplan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.MuhPlan[ pkplan=" + pkplan + " ]";
    }
    
}

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "TanimKdv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TanimKdv.findAll", query = "SELECT t FROM TanimKdv t"),
    @NamedQuery(name = "TanimKdv.findByPkKdv", query = "SELECT t FROM TanimKdv t WHERE t.pkKdv = :pkKdv"),
    @NamedQuery(name = "TanimKdv.findByOran", query = "SELECT t FROM TanimKdv t WHERE t.oran = :oran")})
public class TanimKdv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkKdv")
    private Integer pkKdv;
    @Column(name = "Oran")
    private Integer oran;

    public TanimKdv() {
    }

    public TanimKdv(Integer pkKdv) {
        this.pkKdv = pkKdv;
    }

    public Integer getPkKdv() {
        return pkKdv;
    }

    public void setPkKdv(Integer pkKdv) {
        this.pkKdv = pkKdv;
    }

    public Integer getOran() {
        return oran;
    }

    public void setOran(Integer oran) {
        this.oran = oran;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkKdv != null ? pkKdv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TanimKdv)) {
            return false;
        }
        TanimKdv other = (TanimKdv) object;
        if ((this.pkKdv == null && other.pkKdv != null) || (this.pkKdv != null && !this.pkKdv.equals(other.pkKdv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TanimKdv[ pkKdv=" + pkKdv + " ]";
    }
    
}

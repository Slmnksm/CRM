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
@Table(name = "ProjeSevk")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjeSevk.findAll", query = "SELECT p FROM ProjeSevk p"),
    @NamedQuery(name = "ProjeSevk.findByPkSevk", query = "SELECT p FROM ProjeSevk p WHERE p.pkSevk = :pkSevk"),
    @NamedQuery(name = "ProjeSevk.findBySevkAdres", query = "SELECT p FROM ProjeSevk p WHERE p.sevkAdres = :sevkAdres"),
    @NamedQuery(name = "ProjeSevk.findByProjeUstNo", query = "SELECT p FROM ProjeSevk p WHERE p.projeUstNo = :projeUstNo")})
public class ProjeSevk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkSevk")
    private Integer pkSevk;
    @Size(max = 250)
    @Column(name = "SevkAdres")
    private String sevkAdres;
    @Column(name = "ProjeUstNo")
    private Integer projeUstNo;

    public ProjeSevk() {
    }

    public ProjeSevk(Integer pkSevk) {
        this.pkSevk = pkSevk;
    }

    public Integer getPkSevk() {
        return pkSevk;
    }

    public void setPkSevk(Integer pkSevk) {
        this.pkSevk = pkSevk;
    }

    public String getSevkAdres() {
        return sevkAdres;
    }

    public void setSevkAdres(String sevkAdres) {
        this.sevkAdres = sevkAdres;
    }

    public Integer getProjeUstNo() {
        return projeUstNo;
    }

    public void setProjeUstNo(Integer projeUstNo) {
        this.projeUstNo = projeUstNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkSevk != null ? pkSevk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjeSevk)) {
            return false;
        }
        ProjeSevk other = (ProjeSevk) object;
        if ((this.pkSevk == null && other.pkSevk != null) || (this.pkSevk != null && !this.pkSevk.equals(other.pkSevk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.ProjeSevk[ pkSevk=" + pkSevk + " ]";
    }
    
}

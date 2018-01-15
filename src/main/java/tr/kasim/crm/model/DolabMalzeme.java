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
@Table(name = "DolabMalzeme")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DolabMalzeme.findAll", query = "SELECT d FROM DolabMalzeme d"),
    @NamedQuery(name = "DolabMalzeme.findByMarkaCins", query = "SELECT d FROM DolabMalzeme d WHERE d.markaCins = :markaCins"),
    @NamedQuery(name = "DolabMalzeme.findById", query = "SELECT d FROM DolabMalzeme d WHERE d.id = :id")})
public class DolabMalzeme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "MarkaCins")
    private String markaCins;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;

    public DolabMalzeme() {
    }

    public DolabMalzeme(Integer id) {
        this.id = id;
    }

    public String getMarkaCins() {
        return markaCins;
    }

    public void setMarkaCins(String markaCins) {
        this.markaCins = markaCins;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DolabMalzeme)) {
            return false;
        }
        DolabMalzeme other = (DolabMalzeme) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.DolabMalzeme[ id=" + id + " ]";
    }
    
}

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
@Table(name = "PlanResource")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanResource.findAll", query = "SELECT p FROM PlanResource p"),
    @NamedQuery(name = "PlanResource.findByPkresource", query = "SELECT p FROM PlanResource p WHERE p.pkresource = :pkresource"),
    @NamedQuery(name = "PlanResource.findByResource", query = "SELECT p FROM PlanResource p WHERE p.resource = :resource"),
    @NamedQuery(name = "PlanResource.findByMakine", query = "SELECT p FROM PlanResource p WHERE p.makine = :makine")})
public class PlanResource implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkresource")
    private Integer pkresource;
    @Size(max = 50)
    @Column(name = "Resource")
    private String resource;
    @Column(name = "Makine")
    private Integer makine;

    public PlanResource() {
    }

    public PlanResource(Integer pkresource) {
        this.pkresource = pkresource;
    }

    public Integer getPkresource() {
        return pkresource;
    }

    public void setPkresource(Integer pkresource) {
        this.pkresource = pkresource;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Integer getMakine() {
        return makine;
    }

    public void setMakine(Integer makine) {
        this.makine = makine;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkresource != null ? pkresource.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanResource)) {
            return false;
        }
        PlanResource other = (PlanResource) object;
        if ((this.pkresource == null && other.pkresource != null) || (this.pkresource != null && !this.pkresource.equals(other.pkresource))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PlanResource[ pkresource=" + pkresource + " ]";
    }
    
}

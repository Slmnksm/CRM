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
@Table(name = "KapiModel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KapiModel.findAll", query = "SELECT k FROM KapiModel k"),
    @NamedQuery(name = "KapiModel.findByModel", query = "SELECT k FROM KapiModel k WHERE k.model = :model"),
    @NamedQuery(name = "KapiModel.findById", query = "SELECT k FROM KapiModel k WHERE k.id = :id")})
public class KapiModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "Model")
    private String model;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;

    public KapiModel() {
    }

    public KapiModel(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        if (!(object instanceof KapiModel)) {
            return false;
        }
        KapiModel other = (KapiModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.KapiModel[ id=" + id + " ]";
    }
    
}

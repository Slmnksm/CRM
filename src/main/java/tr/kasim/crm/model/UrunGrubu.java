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
@Table(name = "UrunGrubu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UrunGrubu.findAll", query = "SELECT u FROM UrunGrubu u"),
    @NamedQuery(name = "UrunGrubu.findByPkUrunGrubu", query = "SELECT u FROM UrunGrubu u WHERE u.pkUrunGrubu = :pkUrunGrubu"),
    @NamedQuery(name = "UrunGrubu.findByAdi", query = "SELECT u FROM UrunGrubu u WHERE u.adi = :adi")})
public class UrunGrubu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkUrunGrubu")
    private Integer pkUrunGrubu;
    @Size(max = 50)
    @Column(name = "Adi")
    private String adi;

    public UrunGrubu() {
    }

    public UrunGrubu(Integer pkUrunGrubu) {
        this.pkUrunGrubu = pkUrunGrubu;
    }

    public Integer getPkUrunGrubu() {
        return pkUrunGrubu;
    }

    public void setPkUrunGrubu(Integer pkUrunGrubu) {
        this.pkUrunGrubu = pkUrunGrubu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkUrunGrubu != null ? pkUrunGrubu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UrunGrubu)) {
            return false;
        }
        UrunGrubu other = (UrunGrubu) object;
        if ((this.pkUrunGrubu == null && other.pkUrunGrubu != null) || (this.pkUrunGrubu != null && !this.pkUrunGrubu.equals(other.pkUrunGrubu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.UrunGrubu[ pkUrunGrubu=" + pkUrunGrubu + " ]";
    }
    
}

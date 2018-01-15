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
@Table(name = "UstNo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UstNo.findAll", query = "SELECT u FROM UstNo u"),
    @NamedQuery(name = "UstNo.findByOtoNo", query = "SELECT u FROM UstNo u WHERE u.otoNo = :otoNo"),
    @NamedQuery(name = "UstNo.findBySiparisNo", query = "SELECT u FROM UstNo u WHERE u.siparisNo = :siparisNo"),
    @NamedQuery(name = "UstNo.findByMuhNo", query = "SELECT u FROM UstNo u WHERE u.muhNo = :muhNo"),
    @NamedQuery(name = "UstNo.findByArizaNo", query = "SELECT u FROM UstNo u WHERE u.arizaNo = :arizaNo"),
    @NamedQuery(name = "UstNo.findByTalepNo", query = "SELECT u FROM UstNo u WHERE u.talepNo = :talepNo"),
    @NamedQuery(name = "UstNo.findByJotun", query = "SELECT u FROM UstNo u WHERE u.jotun = :jotun"),
    @NamedQuery(name = "UstNo.findByProjeNo", query = "SELECT u FROM UstNo u WHERE u.projeNo = :projeNo"),
    @NamedQuery(name = "UstNo.findByDosyaNo", query = "SELECT u FROM UstNo u WHERE u.dosyaNo = :dosyaNo")})
public class UstNo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OtoNo")
    private Integer otoNo;
    @Column(name = "SiparisNo")
    private Integer siparisNo;
    @Column(name = "MuhNo")
    private Integer muhNo;
    @Column(name = "ArizaNo")
    private Integer arizaNo;
    @Column(name = "TalepNo")
    private Integer talepNo;
    @Column(name = "Jotun")
    private Integer jotun;
    @Column(name = "ProjeNo")
    private Integer projeNo;
    @Column(name = "DosyaNo")
    private Integer dosyaNo;

    public UstNo() {
    }

    public UstNo(Integer otoNo) {
        this.otoNo = otoNo;
    }

    public Integer getOtoNo() {
        return otoNo;
    }

    public void setOtoNo(Integer otoNo) {
        this.otoNo = otoNo;
    }

    public Integer getSiparisNo() {
        return siparisNo;
    }

    public void setSiparisNo(Integer siparisNo) {
        this.siparisNo = siparisNo;
    }

    public Integer getMuhNo() {
        return muhNo;
    }

    public void setMuhNo(Integer muhNo) {
        this.muhNo = muhNo;
    }

    public Integer getArizaNo() {
        return arizaNo;
    }

    public void setArizaNo(Integer arizaNo) {
        this.arizaNo = arizaNo;
    }

    public Integer getTalepNo() {
        return talepNo;
    }

    public void setTalepNo(Integer talepNo) {
        this.talepNo = talepNo;
    }

    public Integer getJotun() {
        return jotun;
    }

    public void setJotun(Integer jotun) {
        this.jotun = jotun;
    }

    public Integer getProjeNo() {
        return projeNo;
    }

    public void setProjeNo(Integer projeNo) {
        this.projeNo = projeNo;
    }

    public Integer getDosyaNo() {
        return dosyaNo;
    }

    public void setDosyaNo(Integer dosyaNo) {
        this.dosyaNo = dosyaNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (otoNo != null ? otoNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UstNo)) {
            return false;
        }
        UstNo other = (UstNo) object;
        if ((this.otoNo == null && other.otoNo != null) || (this.otoNo != null && !this.otoNo.equals(other.otoNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.UstNo[ otoNo=" + otoNo + " ]";
    }
    
}

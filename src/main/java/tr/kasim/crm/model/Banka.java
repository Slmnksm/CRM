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
@Table(name = "Banka")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banka.findAll", query = "SELECT b FROM Banka b"),
    @NamedQuery(name = "Banka.findByPkBanka", query = "SELECT b FROM Banka b WHERE b.pkBanka = :pkBanka"),
    @NamedQuery(name = "Banka.findByHesapKod", query = "SELECT b FROM Banka b WHERE b.hesapKod = :hesapKod"),
    @NamedQuery(name = "Banka.findByHesapAd", query = "SELECT b FROM Banka b WHERE b.hesapAd = :hesapAd"),
    @NamedQuery(name = "Banka.findByBanka", query = "SELECT b FROM Banka b WHERE b.banka = :banka"),
    @NamedQuery(name = "Banka.findByHesapTur", query = "SELECT b FROM Banka b WHERE b.hesapTur = :hesapTur"),
    @NamedQuery(name = "Banka.findByIban", query = "SELECT b FROM Banka b WHERE b.iban = :iban"),
    @NamedQuery(name = "Banka.findBySil", query = "SELECT b FROM Banka b WHERE b.sil = :sil"),
    @NamedQuery(name = "Banka.findByUstNo", query = "SELECT b FROM Banka b WHERE b.ustNo = :ustNo")})
public class Banka implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkBanka")
    private Integer pkBanka;
    @Size(max = 50)
    @Column(name = "HesapKod")
    private String hesapKod;
    @Size(max = 50)
    @Column(name = "HesapAd")
    private String hesapAd;
    @Size(max = 50)
    @Column(name = "Banka")
    private String banka;
    @Size(max = 50)
    @Column(name = "HesapTur")
    private String hesapTur;
    @Size(max = 50)
    @Column(name = "IBAN")
    private String iban;
    @Column(name = "Sil")
    private Boolean sil;
    @Column(name = "UstNo")
    private Integer ustNo;

    public Banka() {
    }

    public Banka(Integer pkBanka) {
        this.pkBanka = pkBanka;
    }

    public Integer getPkBanka() {
        return pkBanka;
    }

    public void setPkBanka(Integer pkBanka) {
        this.pkBanka = pkBanka;
    }

    public String getHesapKod() {
        return hesapKod;
    }

    public void setHesapKod(String hesapKod) {
        this.hesapKod = hesapKod;
    }

    public String getHesapAd() {
        return hesapAd;
    }

    public void setHesapAd(String hesapAd) {
        this.hesapAd = hesapAd;
    }

    public String getBanka() {
        return banka;
    }

    public void setBanka(String banka) {
        this.banka = banka;
    }

    public String getHesapTur() {
        return hesapTur;
    }

    public void setHesapTur(String hesapTur) {
        this.hesapTur = hesapTur;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Boolean getSil() {
        return sil;
    }

    public void setSil(Boolean sil) {
        this.sil = sil;
    }

    public Integer getUstNo() {
        return ustNo;
    }

    public void setUstNo(Integer ustNo) {
        this.ustNo = ustNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkBanka != null ? pkBanka.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banka)) {
            return false;
        }
        Banka other = (Banka) object;
        if ((this.pkBanka == null && other.pkBanka != null) || (this.pkBanka != null && !this.pkBanka.equals(other.pkBanka))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Banka[ pkBanka=" + pkBanka + " ]";
    }
    
}

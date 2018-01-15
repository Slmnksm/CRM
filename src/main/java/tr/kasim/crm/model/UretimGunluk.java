/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "UretimGunluk")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UretimGunluk.findAll", query = "SELECT u FROM UretimGunluk u"),
    @NamedQuery(name = "UretimGunluk.findByPkgunluk", query = "SELECT u FROM UretimGunluk u WHERE u.pkgunluk = :pkgunluk"),
    @NamedQuery(name = "UretimGunluk.findByUstNo", query = "SELECT u FROM UretimGunluk u WHERE u.ustNo = :ustNo"),
    @NamedQuery(name = "UretimGunluk.findByTarih", query = "SELECT u FROM UretimGunluk u WHERE u.tarih = :tarih"),
    @NamedQuery(name = "UretimGunluk.findByUretimGunluk", query = "SELECT u FROM UretimGunluk u WHERE u.uretimGunluk = :uretimGunluk")})
public class UretimGunluk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkgunluk")
    private Integer pkgunluk;
    @Column(name = "UstNo")
    private Integer ustNo;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Size(max = 1073741823)
    @Column(name = "UretimGunluk")
    private String uretimGunluk;

    public UretimGunluk() {
    }

    public UretimGunluk(Integer pkgunluk) {
        this.pkgunluk = pkgunluk;
    }

    public Integer getPkgunluk() {
        return pkgunluk;
    }

    public void setPkgunluk(Integer pkgunluk) {
        this.pkgunluk = pkgunluk;
    }

    public Integer getUstNo() {
        return ustNo;
    }

    public void setUstNo(Integer ustNo) {
        this.ustNo = ustNo;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getUretimGunluk() {
        return uretimGunluk;
    }

    public void setUretimGunluk(String uretimGunluk) {
        this.uretimGunluk = uretimGunluk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkgunluk != null ? pkgunluk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UretimGunluk)) {
            return false;
        }
        UretimGunluk other = (UretimGunluk) object;
        if ((this.pkgunluk == null && other.pkgunluk != null) || (this.pkgunluk != null && !this.pkgunluk.equals(other.pkgunluk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.UretimGunluk[ pkgunluk=" + pkgunluk + " ]";
    }
    
}

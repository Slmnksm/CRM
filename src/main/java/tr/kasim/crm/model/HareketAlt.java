/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "HareketAlt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HareketAlt.findAll", query = "SELECT h FROM HareketAlt h"),
    @NamedQuery(name = "HareketAlt.findByPkHareketAlt", query = "SELECT h FROM HareketAlt h WHERE h.pkHareketAlt = :pkHareketAlt"),
    @NamedQuery(name = "HareketAlt.findByUstNo", query = "SELECT h FROM HareketAlt h WHERE h.ustNo = :ustNo"),
    @NamedQuery(name = "HareketAlt.findByBankaAd", query = "SELECT h FROM HareketAlt h WHERE h.bankaAd = :bankaAd"),
    @NamedQuery(name = "HareketAlt.findByTaksit", query = "SELECT h FROM HareketAlt h WHERE h.taksit = :taksit"),
    @NamedQuery(name = "HareketAlt.findByTutar", query = "SELECT h FROM HareketAlt h WHERE h.tutar = :tutar"),
    @NamedQuery(name = "HareketAlt.findByEvrakNo", query = "SELECT h FROM HareketAlt h WHERE h.evrakNo = :evrakNo"),
    @NamedQuery(name = "HareketAlt.findByEvrakVade", query = "SELECT h FROM HareketAlt h WHERE h.evrakVade = :evrakVade"),
    @NamedQuery(name = "HareketAlt.findByBorclu", query = "SELECT h FROM HareketAlt h WHERE h.borclu = :borclu"),
    @NamedQuery(name = "HareketAlt.findByPortfoyNo", query = "SELECT h FROM HareketAlt h WHERE h.portfoyNo = :portfoyNo"),
    @NamedQuery(name = "HareketAlt.findByTip", query = "SELECT h FROM HareketAlt h WHERE h.tip = :tip"),
    @NamedQuery(name = "HareketAlt.findByDurum", query = "SELECT h FROM HareketAlt h WHERE h.durum = :durum"),
    @NamedQuery(name = "HareketAlt.findByEvrakNo2", query = "SELECT h FROM HareketAlt h WHERE h.evrakNo2 = :evrakNo2"),
    @NamedQuery(name = "HareketAlt.findByCirolayan", query = "SELECT h FROM HareketAlt h WHERE h.cirolayan = :cirolayan"),
    @NamedQuery(name = "HareketAlt.findByHesapad", query = "SELECT h FROM HareketAlt h WHERE h.hesapad = :hesapad"),
    @NamedQuery(name = "HareketAlt.findByHesapno", query = "SELECT h FROM HareketAlt h WHERE h.hesapno = :hesapno"),
    @NamedQuery(name = "HareketAlt.findBySube", query = "SELECT h FROM HareketAlt h WHERE h.sube = :sube"),
    @NamedQuery(name = "HareketAlt.findBySil", query = "SELECT h FROM HareketAlt h WHERE h.sil = :sil"),
    @NamedQuery(name = "HareketAlt.findByTur", query = "SELECT h FROM HareketAlt h WHERE h.tur = :tur")})
public class HareketAlt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkHareketAlt")
    private Integer pkHareketAlt;
    @Column(name = "UstNo")
    private Integer ustNo;
    @Size(max = 50)
    @Column(name = "BankaAd")
    private String bankaAd;
    @Column(name = "Taksit")
    private Integer taksit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Tutar")
    private BigDecimal tutar;
    @Size(max = 20)
    @Column(name = "EvrakNo")
    private String evrakNo;
    @Column(name = "EvrakVade")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evrakVade;
    @Size(max = 150)
    @Column(name = "Borclu")
    private String borclu;
    @Size(max = 20)
    @Column(name = "PortfoyNo")
    private String portfoyNo;
    @Column(name = "tip")
    private Integer tip;
    @Column(name = "durum")
    private Integer durum;
    @Size(max = 20)
    @Column(name = "EvrakNo2")
    private String evrakNo2;
    @Size(max = 20)
    @Column(name = "cirolayan")
    private String cirolayan;
    @Size(max = 100)
    @Column(name = "hesapad")
    private String hesapad;
    @Size(max = 100)
    @Column(name = "hesapno")
    private String hesapno;
    @Size(max = 100)
    @Column(name = "sube")
    private String sube;
    @Column(name = "sil")
    private Boolean sil;
    @Size(max = 10)
    @Column(name = "tur")
    private String tur;

    public HareketAlt() {
    }

    public HareketAlt(Integer pkHareketAlt) {
        this.pkHareketAlt = pkHareketAlt;
    }

    public Integer getPkHareketAlt() {
        return pkHareketAlt;
    }

    public void setPkHareketAlt(Integer pkHareketAlt) {
        this.pkHareketAlt = pkHareketAlt;
    }

    public Integer getUstNo() {
        return ustNo;
    }

    public void setUstNo(Integer ustNo) {
        this.ustNo = ustNo;
    }

    public String getBankaAd() {
        return bankaAd;
    }

    public void setBankaAd(String bankaAd) {
        this.bankaAd = bankaAd;
    }

    public Integer getTaksit() {
        return taksit;
    }

    public void setTaksit(Integer taksit) {
        this.taksit = taksit;
    }

    public BigDecimal getTutar() {
        return tutar;
    }

    public void setTutar(BigDecimal tutar) {
        this.tutar = tutar;
    }

    public String getEvrakNo() {
        return evrakNo;
    }

    public void setEvrakNo(String evrakNo) {
        this.evrakNo = evrakNo;
    }

    public Date getEvrakVade() {
        return evrakVade;
    }

    public void setEvrakVade(Date evrakVade) {
        this.evrakVade = evrakVade;
    }

    public String getBorclu() {
        return borclu;
    }

    public void setBorclu(String borclu) {
        this.borclu = borclu;
    }

    public String getPortfoyNo() {
        return portfoyNo;
    }

    public void setPortfoyNo(String portfoyNo) {
        this.portfoyNo = portfoyNo;
    }

    public Integer getTip() {
        return tip;
    }

    public void setTip(Integer tip) {
        this.tip = tip;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }

    public String getEvrakNo2() {
        return evrakNo2;
    }

    public void setEvrakNo2(String evrakNo2) {
        this.evrakNo2 = evrakNo2;
    }

    public String getCirolayan() {
        return cirolayan;
    }

    public void setCirolayan(String cirolayan) {
        this.cirolayan = cirolayan;
    }

    public String getHesapad() {
        return hesapad;
    }

    public void setHesapad(String hesapad) {
        this.hesapad = hesapad;
    }

    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    public Boolean getSil() {
        return sil;
    }

    public void setSil(Boolean sil) {
        this.sil = sil;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkHareketAlt != null ? pkHareketAlt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HareketAlt)) {
            return false;
        }
        HareketAlt other = (HareketAlt) object;
        if ((this.pkHareketAlt == null && other.pkHareketAlt != null) || (this.pkHareketAlt != null && !this.pkHareketAlt.equals(other.pkHareketAlt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.HareketAlt[ pkHareketAlt=" + pkHareketAlt + " ]";
    }
    
}

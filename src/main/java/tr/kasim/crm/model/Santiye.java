/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "Santiye")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Santiye.findAll", query = "SELECT s FROM Santiye s"),
    @NamedQuery(name = "Santiye.findByPksantiye", query = "SELECT s FROM Santiye s WHERE s.pksantiye = :pksantiye"),
    @NamedQuery(name = "Santiye.findByFkpazarlama", query = "SELECT s FROM Santiye s WHERE s.fkpazarlama = :fkpazarlama"),
    @NamedQuery(name = "Santiye.findBySantiye", query = "SELECT s FROM Santiye s WHERE s.santiye = :santiye"),
    @NamedQuery(name = "Santiye.findByYetkili", query = "SELECT s FROM Santiye s WHERE s.yetkili = :yetkili"),
    @NamedQuery(name = "Santiye.findByTel", query = "SELECT s FROM Santiye s WHERE s.tel = :tel"),
    @NamedQuery(name = "Santiye.findByAdres", query = "SELECT s FROM Santiye s WHERE s.adres = :adres"),
    @NamedQuery(name = "Santiye.findByKonum", query = "SELECT s FROM Santiye s WHERE s.konum = :konum"),
    @NamedQuery(name = "Santiye.findByCiro", query = "SELECT s FROM Santiye s WHERE s.ciro = :ciro"),
    @NamedQuery(name = "Santiye.findByVade", query = "SELECT s FROM Santiye s WHERE s.vade = :vade"),
    @NamedQuery(name = "Santiye.findByReel", query = "SELECT s FROM Santiye s WHERE s.reel = :reel"),
    @NamedQuery(name = "Santiye.findByBoya", query = "SELECT s FROM Santiye s WHERE s.boya = :boya"),
    @NamedQuery(name = "Santiye.findBySiva", query = "SELECT s FROM Santiye s WHERE s.siva = :siva"),
    @NamedQuery(name = "Santiye.findByAlci", query = "SELECT s FROM Santiye s WHERE s.alci = :alci"),
    @NamedQuery(name = "Santiye.findByIscilik", query = "SELECT s FROM Santiye s WHERE s.iscilik = :iscilik"),
    @NamedQuery(name = "Santiye.findByDiger", query = "SELECT s FROM Santiye s WHERE s.diger = :diger"),
    @NamedQuery(name = "Santiye.findByAktif", query = "SELECT s FROM Santiye s WHERE s.aktif = :aktif")})
public class Santiye implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksantiye")
    private Integer pksantiye;
    @Column(name = "fkpazarlama")
    private Integer fkpazarlama;
    @Size(max = 50)
    @Column(name = "Santiye")
    private String santiye;
    @Size(max = 50)
    @Column(name = "Yetkili")
    private String yetkili;
    @Size(max = 50)
    @Column(name = "Tel")
    private String tel;
    @Size(max = 150)
    @Column(name = "Adres")
    private String adres;
    @Size(max = 50)
    @Column(name = "Konum")
    private String konum;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Ciro")
    private BigDecimal ciro;
    @Column(name = "Vade")
    private BigDecimal vade;
    @Column(name = "Reel")
    private BigDecimal reel;
    @Column(name = "boya")
    private Boolean boya;
    @Column(name = "siva")
    private Boolean siva;
    @Column(name = "alci")
    private Boolean alci;
    @Column(name = "iscilik")
    private Boolean iscilik;
    @Column(name = "diger")
    private Boolean diger;
    @Column(name = "aktif")
    private Boolean aktif;

    public Santiye() {
    }

    public Santiye(Integer pksantiye) {
        this.pksantiye = pksantiye;
    }

    public Integer getPksantiye() {
        return pksantiye;
    }

    public void setPksantiye(Integer pksantiye) {
        this.pksantiye = pksantiye;
    }

    public Integer getFkpazarlama() {
        return fkpazarlama;
    }

    public void setFkpazarlama(Integer fkpazarlama) {
        this.fkpazarlama = fkpazarlama;
    }

    public String getSantiye() {
        return santiye;
    }

    public void setSantiye(String santiye) {
        this.santiye = santiye;
    }

    public String getYetkili() {
        return yetkili;
    }

    public void setYetkili(String yetkili) {
        this.yetkili = yetkili;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public BigDecimal getCiro() {
        return ciro;
    }

    public void setCiro(BigDecimal ciro) {
        this.ciro = ciro;
    }

    public BigDecimal getVade() {
        return vade;
    }

    public void setVade(BigDecimal vade) {
        this.vade = vade;
    }

    public BigDecimal getReel() {
        return reel;
    }

    public void setReel(BigDecimal reel) {
        this.reel = reel;
    }

    public Boolean getBoya() {
        return boya;
    }

    public void setBoya(Boolean boya) {
        this.boya = boya;
    }

    public Boolean getSiva() {
        return siva;
    }

    public void setSiva(Boolean siva) {
        this.siva = siva;
    }

    public Boolean getAlci() {
        return alci;
    }

    public void setAlci(Boolean alci) {
        this.alci = alci;
    }

    public Boolean getIscilik() {
        return iscilik;
    }

    public void setIscilik(Boolean iscilik) {
        this.iscilik = iscilik;
    }

    public Boolean getDiger() {
        return diger;
    }

    public void setDiger(Boolean diger) {
        this.diger = diger;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksantiye != null ? pksantiye.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Santiye)) {
            return false;
        }
        Santiye other = (Santiye) object;
        if ((this.pksantiye == null && other.pksantiye != null) || (this.pksantiye != null && !this.pksantiye.equals(other.pksantiye))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Santiye[ pksantiye=" + pksantiye + " ]";
    }
    
}

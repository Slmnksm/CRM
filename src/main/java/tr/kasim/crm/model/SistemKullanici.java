/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "SistemKullanici")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SistemKullanici.findAll", query = "SELECT s FROM SistemKullanici s"),
    @NamedQuery(name = "SistemKullanici.findByPkKullanici", query = "SELECT s FROM SistemKullanici s WHERE s.pkKullanici = :pkKullanici"),
    @NamedQuery(name = "SistemKullanici.findByAd", query = "SELECT s FROM SistemKullanici s WHERE s.ad = :ad"),
    @NamedQuery(name = "SistemKullanici.findBySoyad", query = "SELECT s FROM SistemKullanici s WHERE s.soyad = :soyad"),
    @NamedQuery(name = "SistemKullanici.findByKullaniciad", query = "SELECT s FROM SistemKullanici s WHERE s.kullaniciad = :kullaniciad"),
    @NamedQuery(name = "SistemKullanici.findBySifre", query = "SELECT s FROM SistemKullanici s WHERE s.sifre = :sifre"),
    @NamedQuery(name = "SistemKullanici.findByEposta", query = "SELECT s FROM SistemKullanici s WHERE s.eposta = :eposta"),
    @NamedQuery(name = "SistemKullanici.findByAdmin", query = "SELECT s FROM SistemKullanici s WHERE s.admin = :admin"),
    @NamedQuery(name = "SistemKullanici.findByFkbirim", query = "SELECT s FROM SistemKullanici s WHERE s.fkbirim = :fkbirim"),
    @NamedQuery(name = "SistemKullanici.findByFkPersonel", query = "SELECT s FROM SistemKullanici s WHERE s.fkPersonel = :fkPersonel"),
    @NamedQuery(name = "SistemKullanici.findByIskonto", query = "SELECT s FROM SistemKullanici s WHERE s.iskonto = :iskonto")})
public class SistemKullanici implements Serializable {

    @OneToMany(mappedBy = "fkSistemKullanici", fetch = FetchType.LAZY)
    private List<Firma> firmaList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkKullanici", fetch = FetchType.LAZY)
    private Collection<UserSession> userSessionCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkKullanici")
    private Integer pkKullanici;
    @Size(max = 50)
    @Column(name = "Ad")
    private String ad;
    @Size(max = 50)
    @Column(name = "Soyad")
    private String soyad;
    @Size(max = 50)
    @Column(name = "kullaniciad")
    private String kullaniciad;
    @Size(max = 50)
    @Column(name = "sifre")
    private String sifre;
    @Size(max = 50)
    @Column(name = "eposta")
    private String eposta;
    @Column(name = "admin")
    private Short admin;
    @Column(name = "fkbirim")
    private Integer fkbirim;
    @Column(name = "fkPersonel")
    private Integer fkPersonel;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "iskonto")
    private BigDecimal iskonto;

    public SistemKullanici() {
    }

    public SistemKullanici(Integer pkKullanici) {
        this.pkKullanici = pkKullanici;
    }

    public Integer getPkKullanici() {
        return pkKullanici;
    }

    public void setPkKullanici(Integer pkKullanici) {
        this.pkKullanici = pkKullanici;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKullaniciad() {
        return kullaniciad;
    }

    public void setKullaniciad(String kullaniciad) {
        this.kullaniciad = kullaniciad;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public Short getAdmin() {
        return admin;
    }

    public void setAdmin(Short admin) {
        this.admin = admin;
    }

    public Integer getFkbirim() {
        return fkbirim;
    }

    public void setFkbirim(Integer fkbirim) {
        this.fkbirim = fkbirim;
    }

    public Integer getFkPersonel() {
        return fkPersonel;
    }

    public void setFkPersonel(Integer fkPersonel) {
        this.fkPersonel = fkPersonel;
    }

    public BigDecimal getIskonto() {
        return iskonto;
    }

    public void setIskonto(BigDecimal iskonto) {
        this.iskonto = iskonto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkKullanici != null ? pkKullanici.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SistemKullanici)) {
            return false;
        }
        SistemKullanici other = (SistemKullanici) object;
        if ((this.pkKullanici == null && other.pkKullanici != null) || (this.pkKullanici != null && !this.pkKullanici.equals(other.pkKullanici))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SistemKullanici[ pkKullanici=" + pkKullanici + " ]";
    }

    @XmlTransient
    public Collection<UserSession> getUserSessionCollection() {
        return userSessionCollection;
    }

    public void setUserSessionCollection(Collection<UserSession> userSessionCollection) {
        this.userSessionCollection = userSessionCollection;
    }

    @XmlTransient
    public List<Firma> getFirmaList() {
        return firmaList;
    }

    public void setFirmaList(List<Firma> firmaList) {
        this.firmaList = firmaList;
    }
    
}

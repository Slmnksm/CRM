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
@Table(name = "BankaDetay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BankaDetay.findAll", query = "SELECT b FROM BankaDetay b"),
    @NamedQuery(name = "BankaDetay.findByPkBankaDetay", query = "SELECT b FROM BankaDetay b WHERE b.pkBankaDetay = :pkBankaDetay"),
    @NamedQuery(name = "BankaDetay.findByFkBanka", query = "SELECT b FROM BankaDetay b WHERE b.fkBanka = :fkBanka"),
    @NamedQuery(name = "BankaDetay.findBySube", query = "SELECT b FROM BankaDetay b WHERE b.sube = :sube"),
    @NamedQuery(name = "BankaDetay.findBySubeAd", query = "SELECT b FROM BankaDetay b WHERE b.subeAd = :subeAd"),
    @NamedQuery(name = "BankaDetay.findByIban", query = "SELECT b FROM BankaDetay b WHERE b.iban = :iban"),
    @NamedQuery(name = "BankaDetay.findByOzelKod", query = "SELECT b FROM BankaDetay b WHERE b.ozelKod = :ozelKod"),
    @NamedQuery(name = "BankaDetay.findByIlgiliKisi", query = "SELECT b FROM BankaDetay b WHERE b.ilgiliKisi = :ilgiliKisi"),
    @NamedQuery(name = "BankaDetay.findByTelefon", query = "SELECT b FROM BankaDetay b WHERE b.telefon = :telefon"),
    @NamedQuery(name = "BankaDetay.findByPostaAdres", query = "SELECT b FROM BankaDetay b WHERE b.postaAdres = :postaAdres"),
    @NamedQuery(name = "BankaDetay.findByEmail", query = "SELECT b FROM BankaDetay b WHERE b.email = :email"),
    @NamedQuery(name = "BankaDetay.findByWebAdres", query = "SELECT b FROM BankaDetay b WHERE b.webAdres = :webAdres"),
    @NamedQuery(name = "BankaDetay.findByBankaNakit", query = "SELECT b FROM BankaDetay b WHERE b.bankaNakit = :bankaNakit"),
    @NamedQuery(name = "BankaDetay.findByKesilenCekler", query = "SELECT b FROM BankaDetay b WHERE b.kesilenCekler = :kesilenCekler"),
    @NamedQuery(name = "BankaDetay.findByTahsileVerilenCekler", query = "SELECT b FROM BankaDetay b WHERE b.tahsileVerilenCekler = :tahsileVerilenCekler"),
    @NamedQuery(name = "BankaDetay.findByTeminataVerilenCekler", query = "SELECT b FROM BankaDetay b WHERE b.teminataVerilenCekler = :teminataVerilenCekler"),
    @NamedQuery(name = "BankaDetay.findByTahsileVerilenSenetler", query = "SELECT b FROM BankaDetay b WHERE b.tahsileVerilenSenetler = :tahsileVerilenSenetler"),
    @NamedQuery(name = "BankaDetay.findByTeminataVerilenSenetler", query = "SELECT b FROM BankaDetay b WHERE b.teminataVerilenSenetler = :teminataVerilenSenetler"),
    @NamedQuery(name = "BankaDetay.findByBankaMasraflari", query = "SELECT b FROM BankaDetay b WHERE b.bankaMasraflari = :bankaMasraflari"),
    @NamedQuery(name = "BankaDetay.findByBekleyenPoslar", query = "SELECT b FROM BankaDetay b WHERE b.bekleyenPoslar = :bekleyenPoslar"),
    @NamedQuery(name = "BankaDetay.findByBankaKredi", query = "SELECT b FROM BankaDetay b WHERE b.bankaKredi = :bankaKredi"),
    @NamedQuery(name = "BankaDetay.findByBankaKredisiKasaKarsilik", query = "SELECT b FROM BankaDetay b WHERE b.bankaKredisiKasaKarsilik = :bankaKredisiKasaKarsilik"),
    @NamedQuery(name = "BankaDetay.findByBankaKredisiBankaKarsilik", query = "SELECT b FROM BankaDetay b WHERE b.bankaKredisiBankaKarsilik = :bankaKredisiBankaKarsilik"),
    @NamedQuery(name = "BankaDetay.findByOdenenKredi", query = "SELECT b FROM BankaDetay b WHERE b.odenenKredi = :odenenKredi"),
    @NamedQuery(name = "BankaDetay.findBySil", query = "SELECT b FROM BankaDetay b WHERE b.sil = :sil"),
    @NamedQuery(name = "BankaDetay.findByUstNo", query = "SELECT b FROM BankaDetay b WHERE b.ustNo = :ustNo")})
public class BankaDetay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkBankaDetay")
    private Integer pkBankaDetay;
    @Column(name = "fkBanka")
    private Integer fkBanka;
    @Size(max = 50)
    @Column(name = "Sube")
    private String sube;
    @Size(max = 150)
    @Column(name = "SubeAd")
    private String subeAd;
    @Size(max = 50)
    @Column(name = "Iban")
    private String iban;
    @Size(max = 50)
    @Column(name = "OzelKod")
    private String ozelKod;
    @Size(max = 50)
    @Column(name = "IlgiliKisi")
    private String ilgiliKisi;
    @Size(max = 50)
    @Column(name = "Telefon")
    private String telefon;
    @Size(max = 150)
    @Column(name = "PostaAdres")
    private String postaAdres;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "Email")
    private String email;
    @Size(max = 50)
    @Column(name = "WebAdres")
    private String webAdres;
    @Column(name = "BankaNakit")
    private Integer bankaNakit;
    @Column(name = "KesilenCekler")
    private Integer kesilenCekler;
    @Column(name = "TahsileVerilenCekler")
    private Integer tahsileVerilenCekler;
    @Column(name = "TeminataVerilenCekler")
    private Integer teminataVerilenCekler;
    @Column(name = "TahsileVerilenSenetler")
    private Integer tahsileVerilenSenetler;
    @Column(name = "TeminataVerilenSenetler")
    private Integer teminataVerilenSenetler;
    @Column(name = "BankaMasraflari")
    private Integer bankaMasraflari;
    @Column(name = "BekleyenPoslar")
    private Integer bekleyenPoslar;
    @Column(name = "BankaKredi")
    private Integer bankaKredi;
    @Column(name = "BankaKredisiKasaKarsilik")
    private Integer bankaKredisiKasaKarsilik;
    @Column(name = "BankaKredisiBankaKarsilik")
    private Integer bankaKredisiBankaKarsilik;
    @Column(name = "OdenenKredi")
    private Integer odenenKredi;
    @Column(name = "Sil")
    private Boolean sil;
    @Column(name = "UstNo")
    private Integer ustNo;

    public BankaDetay() {
    }

    public BankaDetay(Integer pkBankaDetay) {
        this.pkBankaDetay = pkBankaDetay;
    }

    public Integer getPkBankaDetay() {
        return pkBankaDetay;
    }

    public void setPkBankaDetay(Integer pkBankaDetay) {
        this.pkBankaDetay = pkBankaDetay;
    }

    public Integer getFkBanka() {
        return fkBanka;
    }

    public void setFkBanka(Integer fkBanka) {
        this.fkBanka = fkBanka;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    public String getSubeAd() {
        return subeAd;
    }

    public void setSubeAd(String subeAd) {
        this.subeAd = subeAd;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOzelKod() {
        return ozelKod;
    }

    public void setOzelKod(String ozelKod) {
        this.ozelKod = ozelKod;
    }

    public String getIlgiliKisi() {
        return ilgiliKisi;
    }

    public void setIlgiliKisi(String ilgiliKisi) {
        this.ilgiliKisi = ilgiliKisi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getPostaAdres() {
        return postaAdres;
    }

    public void setPostaAdres(String postaAdres) {
        this.postaAdres = postaAdres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebAdres() {
        return webAdres;
    }

    public void setWebAdres(String webAdres) {
        this.webAdres = webAdres;
    }

    public Integer getBankaNakit() {
        return bankaNakit;
    }

    public void setBankaNakit(Integer bankaNakit) {
        this.bankaNakit = bankaNakit;
    }

    public Integer getKesilenCekler() {
        return kesilenCekler;
    }

    public void setKesilenCekler(Integer kesilenCekler) {
        this.kesilenCekler = kesilenCekler;
    }

    public Integer getTahsileVerilenCekler() {
        return tahsileVerilenCekler;
    }

    public void setTahsileVerilenCekler(Integer tahsileVerilenCekler) {
        this.tahsileVerilenCekler = tahsileVerilenCekler;
    }

    public Integer getTeminataVerilenCekler() {
        return teminataVerilenCekler;
    }

    public void setTeminataVerilenCekler(Integer teminataVerilenCekler) {
        this.teminataVerilenCekler = teminataVerilenCekler;
    }

    public Integer getTahsileVerilenSenetler() {
        return tahsileVerilenSenetler;
    }

    public void setTahsileVerilenSenetler(Integer tahsileVerilenSenetler) {
        this.tahsileVerilenSenetler = tahsileVerilenSenetler;
    }

    public Integer getTeminataVerilenSenetler() {
        return teminataVerilenSenetler;
    }

    public void setTeminataVerilenSenetler(Integer teminataVerilenSenetler) {
        this.teminataVerilenSenetler = teminataVerilenSenetler;
    }

    public Integer getBankaMasraflari() {
        return bankaMasraflari;
    }

    public void setBankaMasraflari(Integer bankaMasraflari) {
        this.bankaMasraflari = bankaMasraflari;
    }

    public Integer getBekleyenPoslar() {
        return bekleyenPoslar;
    }

    public void setBekleyenPoslar(Integer bekleyenPoslar) {
        this.bekleyenPoslar = bekleyenPoslar;
    }

    public Integer getBankaKredi() {
        return bankaKredi;
    }

    public void setBankaKredi(Integer bankaKredi) {
        this.bankaKredi = bankaKredi;
    }

    public Integer getBankaKredisiKasaKarsilik() {
        return bankaKredisiKasaKarsilik;
    }

    public void setBankaKredisiKasaKarsilik(Integer bankaKredisiKasaKarsilik) {
        this.bankaKredisiKasaKarsilik = bankaKredisiKasaKarsilik;
    }

    public Integer getBankaKredisiBankaKarsilik() {
        return bankaKredisiBankaKarsilik;
    }

    public void setBankaKredisiBankaKarsilik(Integer bankaKredisiBankaKarsilik) {
        this.bankaKredisiBankaKarsilik = bankaKredisiBankaKarsilik;
    }

    public Integer getOdenenKredi() {
        return odenenKredi;
    }

    public void setOdenenKredi(Integer odenenKredi) {
        this.odenenKredi = odenenKredi;
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
        hash += (pkBankaDetay != null ? pkBankaDetay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BankaDetay)) {
            return false;
        }
        BankaDetay other = (BankaDetay) object;
        if ((this.pkBankaDetay == null && other.pkBankaDetay != null) || (this.pkBankaDetay != null && !this.pkBankaDetay.equals(other.pkBankaDetay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.BankaDetay[ pkBankaDetay=" + pkBankaDetay + " ]";
    }
    
}

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
@Table(name = "HareketDetay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HareketDetay.findAll", query = "SELECT h FROM HareketDetay h"),
    @NamedQuery(name = "HareketDetay.findByPkHDetay", query = "SELECT h FROM HareketDetay h WHERE h.pkHDetay = :pkHDetay"),
    @NamedQuery(name = "HareketDetay.findByUstNo", query = "SELECT h FROM HareketDetay h WHERE h.ustNo = :ustNo"),
    @NamedQuery(name = "HareketDetay.findByHareketTip", query = "SELECT h FROM HareketDetay h WHERE h.hareketTip = :hareketTip"),
    @NamedQuery(name = "HareketDetay.findByIslemTarih", query = "SELECT h FROM HareketDetay h WHERE h.islemTarih = :islemTarih"),
    @NamedQuery(name = "HareketDetay.findByEvrakTip", query = "SELECT h FROM HareketDetay h WHERE h.evrakTip = :evrakTip"),
    @NamedQuery(name = "HareketDetay.findByIslemKod", query = "SELECT h FROM HareketDetay h WHERE h.islemKod = :islemKod"),
    @NamedQuery(name = "HareketDetay.findByIslemAd", query = "SELECT h FROM HareketDetay h WHERE h.islemAd = :islemAd"),
    @NamedQuery(name = "HareketDetay.findByAciklama", query = "SELECT h FROM HareketDetay h WHERE h.aciklama = :aciklama"),
    @NamedQuery(name = "HareketDetay.findByBirim", query = "SELECT h FROM HareketDetay h WHERE h.birim = :birim"),
    @NamedQuery(name = "HareketDetay.findByMiktar", query = "SELECT h FROM HareketDetay h WHERE h.miktar = :miktar"),
    @NamedQuery(name = "HareketDetay.findByBFiyat", query = "SELECT h FROM HareketDetay h WHERE h.bFiyat = :bFiyat"),
    @NamedQuery(name = "HareketDetay.findByToplam", query = "SELECT h FROM HareketDetay h WHERE h.toplam = :toplam"),
    @NamedQuery(name = "HareketDetay.findByKdvOran", query = "SELECT h FROM HareketDetay h WHERE h.kdvOran = :kdvOran"),
    @NamedQuery(name = "HareketDetay.findByKdvTutar", query = "SELECT h FROM HareketDetay h WHERE h.kdvTutar = :kdvTutar"),
    @NamedQuery(name = "HareketDetay.findByIskontoOran", query = "SELECT h FROM HareketDetay h WHERE h.iskontoOran = :iskontoOran"),
    @NamedQuery(name = "HareketDetay.findByIskonto", query = "SELECT h FROM HareketDetay h WHERE h.iskonto = :iskonto"),
    @NamedQuery(name = "HareketDetay.findByGenelToplam", query = "SELECT h FROM HareketDetay h WHERE h.genelToplam = :genelToplam"),
    @NamedQuery(name = "HareketDetay.findByFkFirma", query = "SELECT h FROM HareketDetay h WHERE h.fkFirma = :fkFirma"),
    @NamedQuery(name = "HareketDetay.findByGelenMiktar", query = "SELECT h FROM HareketDetay h WHERE h.gelenMiktar = :gelenMiktar"),
    @NamedQuery(name = "HareketDetay.findByCikanMiktar", query = "SELECT h FROM HareketDetay h WHERE h.cikanMiktar = :cikanMiktar"),
    @NamedQuery(name = "HareketDetay.findByBorc", query = "SELECT h FROM HareketDetay h WHERE h.borc = :borc"),
    @NamedQuery(name = "HareketDetay.findByAlacak", query = "SELECT h FROM HareketDetay h WHERE h.alacak = :alacak"),
    @NamedQuery(name = "HareketDetay.findByEvrakNo", query = "SELECT h FROM HareketDetay h WHERE h.evrakNo = :evrakNo"),
    @NamedQuery(name = "HareketDetay.findByEvrakKimin", query = "SELECT h FROM HareketDetay h WHERE h.evrakKimin = :evrakKimin"),
    @NamedQuery(name = "HareketDetay.findByEvrakBanka", query = "SELECT h FROM HareketDetay h WHERE h.evrakBanka = :evrakBanka"),
    @NamedQuery(name = "HareketDetay.findByEvrakVade", query = "SELECT h FROM HareketDetay h WHERE h.evrakVade = :evrakVade"),
    @NamedQuery(name = "HareketDetay.findByDurum", query = "SELECT h FROM HareketDetay h WHERE h.durum = :durum"),
    @NamedQuery(name = "HareketDetay.findByKullanici", query = "SELECT h FROM HareketDetay h WHERE h.kullanici = :kullanici"),
    @NamedQuery(name = "HareketDetay.findByGuncelleme", query = "SELECT h FROM HareketDetay h WHERE h.guncelleme = :guncelleme"),
    @NamedQuery(name = "HareketDetay.findBySilZaman", query = "SELECT h FROM HareketDetay h WHERE h.silZaman = :silZaman"),
    @NamedQuery(name = "HareketDetay.findBySilKullanici", query = "SELECT h FROM HareketDetay h WHERE h.silKullanici = :silKullanici"),
    @NamedQuery(name = "HareketDetay.findBySil", query = "SELECT h FROM HareketDetay h WHERE h.sil = :sil"),
    @NamedQuery(name = "HareketDetay.findByFkstok", query = "SELECT h FROM HareketDetay h WHERE h.fkstok = :fkstok"),
    @NamedQuery(name = "HareketDetay.findBySiparisNo", query = "SELECT h FROM HareketDetay h WHERE h.siparisNo = :siparisNo"),
    @NamedQuery(name = "HareketDetay.findByDoviz", query = "SELECT h FROM HareketDetay h WHERE h.doviz = :doviz"),
    @NamedQuery(name = "HareketDetay.findByEvrakTarih", query = "SELECT h FROM HareketDetay h WHERE h.evrakTarih = :evrakTarih"),
    @NamedQuery(name = "HareketDetay.findByEvrakAd", query = "SELECT h FROM HareketDetay h WHERE h.evrakAd = :evrakAd"),
    @NamedQuery(name = "HareketDetay.findByFirmaAd", query = "SELECT h FROM HareketDetay h WHERE h.firmaAd = :firmaAd"),
    @NamedQuery(name = "HareketDetay.findByKur", query = "SELECT h FROM HareketDetay h WHERE h.kur = :kur"),
    @NamedQuery(name = "HareketDetay.findByTLBorc", query = "SELECT h FROM HareketDetay h WHERE h.tLBorc = :tLBorc"),
    @NamedQuery(name = "HareketDetay.findByTLAlacak", query = "SELECT h FROM HareketDetay h WHERE h.tLAlacak = :tLAlacak"),
    @NamedQuery(name = "HareketDetay.findByIsno", query = "SELECT h FROM HareketDetay h WHERE h.isno = :isno"),
    @NamedQuery(name = "HareketDetay.findByFirmaCari", query = "SELECT h FROM HareketDetay h WHERE h.firmaCari = :firmaCari"),
    @NamedQuery(name = "HareketDetay.findByFisNo", query = "SELECT h FROM HareketDetay h WHERE h.fisNo = :fisNo"),
    @NamedQuery(name = "HareketDetay.findByEn", query = "SELECT h FROM HareketDetay h WHERE h.en = :en"),
    @NamedQuery(name = "HareketDetay.findByBoy", query = "SELECT h FROM HareketDetay h WHERE h.boy = :boy"),
    @NamedQuery(name = "HareketDetay.findByBoyut", query = "SELECT h FROM HareketDetay h WHERE h.boyut = :boyut"),
    @NamedQuery(name = "HareketDetay.findByTip", query = "SELECT h FROM HareketDetay h WHERE h.tip = :tip"),
    @NamedQuery(name = "HareketDetay.findByFkdepo", query = "SELECT h FROM HareketDetay h WHERE h.fkdepo = :fkdepo"),
    @NamedQuery(name = "HareketDetay.findByMasraf", query = "SELECT h FROM HareketDetay h WHERE h.masraf = :masraf"),
    @NamedQuery(name = "HareketDetay.findByMalCinsi", query = "SELECT h FROM HareketDetay h WHERE h.malCinsi = :malCinsi"),
    @NamedQuery(name = "HareketDetay.findByAyiciriOzellik", query = "SELECT h FROM HareketDetay h WHERE h.ayiciriOzellik = :ayiciriOzellik"),
    @NamedQuery(name = "HareketDetay.findByKullanimYeri", query = "SELECT h FROM HareketDetay h WHERE h.kullanimYeri = :kullanimYeri"),
    @NamedQuery(name = "HareketDetay.findByOncelik", query = "SELECT h FROM HareketDetay h WHERE h.oncelik = :oncelik"),
    @NamedQuery(name = "HareketDetay.findByOnaylananMiktar", query = "SELECT h FROM HareketDetay h WHERE h.onaylananMiktar = :onaylananMiktar"),
    @NamedQuery(name = "HareketDetay.findByTalepNo", query = "SELECT h FROM HareketDetay h WHERE h.talepNo = :talepNo"),
    @NamedQuery(name = "HareketDetay.findByPkkasa", query = "SELECT h FROM HareketDetay h WHERE h.pkkasa = :pkkasa"),
    @NamedQuery(name = "HareketDetay.findByFkbanka", query = "SELECT h FROM HareketDetay h WHERE h.fkbanka = :fkbanka"),
    @NamedQuery(name = "HareketDetay.findByKdvDahil", query = "SELECT h FROM HareketDetay h WHERE h.kdvDahil = :kdvDahil"),
    @NamedQuery(name = "HareketDetay.findByKampanyaIndirim", query = "SELECT h FROM HareketDetay h WHERE h.kampanyaIndirim = :kampanyaIndirim"),
    @NamedQuery(name = "HareketDetay.findByFirmaIskontoOran", query = "SELECT h FROM HareketDetay h WHERE h.firmaIskontoOran = :firmaIskontoOran"),
    @NamedQuery(name = "HareketDetay.findByFirmaIskontoMiktar", query = "SELECT h FROM HareketDetay h WHERE h.firmaIskontoMiktar = :firmaIskontoMiktar"),
    @NamedQuery(name = "HareketDetay.findByStokIskontoOran", query = "SELECT h FROM HareketDetay h WHERE h.stokIskontoOran = :stokIskontoOran"),
    @NamedQuery(name = "HareketDetay.findByStokIskontoMiktar", query = "SELECT h FROM HareketDetay h WHERE h.stokIskontoMiktar = :stokIskontoMiktar"),
    @NamedQuery(name = "HareketDetay.findByTeslimAlan", query = "SELECT h FROM HareketDetay h WHERE h.teslimAlan = :teslimAlan"),
    @NamedQuery(name = "HareketDetay.findByDovizTuru", query = "SELECT h FROM HareketDetay h WHERE h.dovizTuru = :dovizTuru")})
public class HareketDetay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkHDetay")
    private Integer pkHDetay;
    @Column(name = "UstNo")
    private Integer ustNo;
    @Column(name = "HareketTip")
    private Integer hareketTip;
    @Column(name = "islemTarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date islemTarih;
    @Column(name = "EvrakTip")
    private Integer evrakTip;
    @Size(max = 50)
    @Column(name = "islemKod")
    private String islemKod;
    @Size(max = 150)
    @Column(name = "islemAd")
    private String islemAd;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Size(max = 10)
    @Column(name = "Birim")
    private String birim;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Miktar")
    private Double miktar;
    @Column(name = "BFiyat")
    private BigDecimal bFiyat;
    @Column(name = "Toplam")
    private BigDecimal toplam;
    @Column(name = "KdvOran")
    private BigDecimal kdvOran;
    @Column(name = "KdvTutar")
    private BigDecimal kdvTutar;
    @Column(name = "IskontoOran")
    private BigDecimal iskontoOran;
    @Column(name = "Iskonto")
    private BigDecimal iskonto;
    @Column(name = "GenelToplam")
    private BigDecimal genelToplam;
    @Column(name = "fkFirma")
    private Integer fkFirma;
    @Column(name = "GelenMiktar")
    private BigDecimal gelenMiktar;
    @Column(name = "CikanMiktar")
    private BigDecimal cikanMiktar;
    @Column(name = "Borc")
    private BigDecimal borc;
    @Column(name = "Alacak")
    private BigDecimal alacak;
    @Size(max = 50)
    @Column(name = "EvrakNo")
    private String evrakNo;
    @Size(max = 50)
    @Column(name = "EvrakKimin")
    private String evrakKimin;
    @Size(max = 50)
    @Column(name = "EvrakBanka")
    private String evrakBanka;
    @Column(name = "EvrakVade")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evrakVade;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;
    @Column(name = "Kullanici")
    private Integer kullanici;
    @Column(name = "Guncelleme")
    @Temporal(TemporalType.TIMESTAMP)
    private Date guncelleme;
    @Column(name = "SilZaman")
    @Temporal(TemporalType.TIMESTAMP)
    private Date silZaman;
    @Column(name = "SilKullanici")
    private Integer silKullanici;
    @Column(name = "Sil")
    private Boolean sil;
    @Column(name = "fkstok")
    private Integer fkstok;
    @Column(name = "SiparisNo")
    private Integer siparisNo;
    @Size(max = 50)
    @Column(name = "Doviz")
    private String doviz;
    @Column(name = "EvrakTarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evrakTarih;
    @Size(max = 50)
    @Column(name = "EvrakAd")
    private String evrakAd;
    @Size(max = 250)
    @Column(name = "FirmaAd")
    private String firmaAd;
    @Column(name = "Kur")
    private BigDecimal kur;
    @Column(name = "TLBorc")
    private BigDecimal tLBorc;
    @Column(name = "TLAlacak")
    private BigDecimal tLAlacak;
    @Column(name = "isno")
    private Integer isno;
    @Size(max = 50)
    @Column(name = "FirmaCari")
    private String firmaCari;
    @Size(max = 50)
    @Column(name = "FisNo")
    private String fisNo;
    @Column(name = "En")
    private BigDecimal en;
    @Column(name = "Boy")
    private BigDecimal boy;
    @Column(name = "Boyut")
    private BigDecimal boyut;
    @Column(name = "tip")
    private Short tip;
    @Column(name = "fkdepo")
    private Integer fkdepo;
    @Size(max = 250)
    @Column(name = "masraf")
    private String masraf;
    @Size(max = 250)
    @Column(name = "MalCinsi")
    private String malCinsi;
    @Size(max = 250)
    @Column(name = "AyiciriOzellik")
    private String ayiciriOzellik;
    @Size(max = 250)
    @Column(name = "KullanimYeri")
    private String kullanimYeri;
    @Size(max = 150)
    @Column(name = "Oncelik")
    private String oncelik;
    @Column(name = "OnaylananMiktar")
    private BigDecimal onaylananMiktar;
    @Column(name = "TalepNo")
    private Integer talepNo;
    @Column(name = "pkkasa")
    private Integer pkkasa;
    @Column(name = "fkbanka")
    private Integer fkbanka;
    @Size(max = 50)
    @Column(name = "KdvDahil")
    private String kdvDahil;
    @Column(name = "KampanyaIndirim")
    private Integer kampanyaIndirim;
    @Column(name = "FirmaIskontoOran")
    private Integer firmaIskontoOran;
    @Column(name = "FirmaIskontoMiktar")
    private BigDecimal firmaIskontoMiktar;
    @Column(name = "StokIskontoOran")
    private Integer stokIskontoOran;
    @Column(name = "StokIskontoMiktar")
    private BigDecimal stokIskontoMiktar;
    @Size(max = 50)
    @Column(name = "TeslimAlan")
    private String teslimAlan;
    @Column(name = "DovizTuru")
    private Integer dovizTuru;

    public HareketDetay() {
    }

    public HareketDetay(Integer pkHDetay) {
        this.pkHDetay = pkHDetay;
    }

    public Integer getPkHDetay() {
        return pkHDetay;
    }

    public void setPkHDetay(Integer pkHDetay) {
        this.pkHDetay = pkHDetay;
    }

    public Integer getUstNo() {
        return ustNo;
    }

    public void setUstNo(Integer ustNo) {
        this.ustNo = ustNo;
    }

    public Integer getHareketTip() {
        return hareketTip;
    }

    public void setHareketTip(Integer hareketTip) {
        this.hareketTip = hareketTip;
    }

    public Date getIslemTarih() {
        return islemTarih;
    }

    public void setIslemTarih(Date islemTarih) {
        this.islemTarih = islemTarih;
    }

    public Integer getEvrakTip() {
        return evrakTip;
    }

    public void setEvrakTip(Integer evrakTip) {
        this.evrakTip = evrakTip;
    }

    public String getIslemKod() {
        return islemKod;
    }

    public void setIslemKod(String islemKod) {
        this.islemKod = islemKod;
    }

    public String getIslemAd() {
        return islemAd;
    }

    public void setIslemAd(String islemAd) {
        this.islemAd = islemAd;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public Double getMiktar() {
        return miktar;
    }

    public void setMiktar(Double miktar) {
        this.miktar = miktar;
    }

    public BigDecimal getBFiyat() {
        return bFiyat;
    }

    public void setBFiyat(BigDecimal bFiyat) {
        this.bFiyat = bFiyat;
    }

    public BigDecimal getToplam() {
        return toplam;
    }

    public void setToplam(BigDecimal toplam) {
        this.toplam = toplam;
    }

    public BigDecimal getKdvOran() {
        return kdvOran;
    }

    public void setKdvOran(BigDecimal kdvOran) {
        this.kdvOran = kdvOran;
    }

    public BigDecimal getKdvTutar() {
        return kdvTutar;
    }

    public void setKdvTutar(BigDecimal kdvTutar) {
        this.kdvTutar = kdvTutar;
    }

    public BigDecimal getIskontoOran() {
        return iskontoOran;
    }

    public void setIskontoOran(BigDecimal iskontoOran) {
        this.iskontoOran = iskontoOran;
    }

    public BigDecimal getIskonto() {
        return iskonto;
    }

    public void setIskonto(BigDecimal iskonto) {
        this.iskonto = iskonto;
    }

    public BigDecimal getGenelToplam() {
        return genelToplam;
    }

    public void setGenelToplam(BigDecimal genelToplam) {
        this.genelToplam = genelToplam;
    }

    public Integer getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Integer fkFirma) {
        this.fkFirma = fkFirma;
    }

    public BigDecimal getGelenMiktar() {
        return gelenMiktar;
    }

    public void setGelenMiktar(BigDecimal gelenMiktar) {
        this.gelenMiktar = gelenMiktar;
    }

    public BigDecimal getCikanMiktar() {
        return cikanMiktar;
    }

    public void setCikanMiktar(BigDecimal cikanMiktar) {
        this.cikanMiktar = cikanMiktar;
    }

    public BigDecimal getBorc() {
        return borc;
    }

    public void setBorc(BigDecimal borc) {
        this.borc = borc;
    }

    public BigDecimal getAlacak() {
        return alacak;
    }

    public void setAlacak(BigDecimal alacak) {
        this.alacak = alacak;
    }

    public String getEvrakNo() {
        return evrakNo;
    }

    public void setEvrakNo(String evrakNo) {
        this.evrakNo = evrakNo;
    }

    public String getEvrakKimin() {
        return evrakKimin;
    }

    public void setEvrakKimin(String evrakKimin) {
        this.evrakKimin = evrakKimin;
    }

    public String getEvrakBanka() {
        return evrakBanka;
    }

    public void setEvrakBanka(String evrakBanka) {
        this.evrakBanka = evrakBanka;
    }

    public Date getEvrakVade() {
        return evrakVade;
    }

    public void setEvrakVade(Date evrakVade) {
        this.evrakVade = evrakVade;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public Integer getKullanici() {
        return kullanici;
    }

    public void setKullanici(Integer kullanici) {
        this.kullanici = kullanici;
    }

    public Date getGuncelleme() {
        return guncelleme;
    }

    public void setGuncelleme(Date guncelleme) {
        this.guncelleme = guncelleme;
    }

    public Date getSilZaman() {
        return silZaman;
    }

    public void setSilZaman(Date silZaman) {
        this.silZaman = silZaman;
    }

    public Integer getSilKullanici() {
        return silKullanici;
    }

    public void setSilKullanici(Integer silKullanici) {
        this.silKullanici = silKullanici;
    }

    public Boolean getSil() {
        return sil;
    }

    public void setSil(Boolean sil) {
        this.sil = sil;
    }

    public Integer getFkstok() {
        return fkstok;
    }

    public void setFkstok(Integer fkstok) {
        this.fkstok = fkstok;
    }

    public Integer getSiparisNo() {
        return siparisNo;
    }

    public void setSiparisNo(Integer siparisNo) {
        this.siparisNo = siparisNo;
    }

    public String getDoviz() {
        return doviz;
    }

    public void setDoviz(String doviz) {
        this.doviz = doviz;
    }

    public Date getEvrakTarih() {
        return evrakTarih;
    }

    public void setEvrakTarih(Date evrakTarih) {
        this.evrakTarih = evrakTarih;
    }

    public String getEvrakAd() {
        return evrakAd;
    }

    public void setEvrakAd(String evrakAd) {
        this.evrakAd = evrakAd;
    }

    public String getFirmaAd() {
        return firmaAd;
    }

    public void setFirmaAd(String firmaAd) {
        this.firmaAd = firmaAd;
    }

    public BigDecimal getKur() {
        return kur;
    }

    public void setKur(BigDecimal kur) {
        this.kur = kur;
    }

    public BigDecimal getTLBorc() {
        return tLBorc;
    }

    public void setTLBorc(BigDecimal tLBorc) {
        this.tLBorc = tLBorc;
    }

    public BigDecimal getTLAlacak() {
        return tLAlacak;
    }

    public void setTLAlacak(BigDecimal tLAlacak) {
        this.tLAlacak = tLAlacak;
    }

    public Integer getIsno() {
        return isno;
    }

    public void setIsno(Integer isno) {
        this.isno = isno;
    }

    public String getFirmaCari() {
        return firmaCari;
    }

    public void setFirmaCari(String firmaCari) {
        this.firmaCari = firmaCari;
    }

    public String getFisNo() {
        return fisNo;
    }

    public void setFisNo(String fisNo) {
        this.fisNo = fisNo;
    }

    public BigDecimal getEn() {
        return en;
    }

    public void setEn(BigDecimal en) {
        this.en = en;
    }

    public BigDecimal getBoy() {
        return boy;
    }

    public void setBoy(BigDecimal boy) {
        this.boy = boy;
    }

    public BigDecimal getBoyut() {
        return boyut;
    }

    public void setBoyut(BigDecimal boyut) {
        this.boyut = boyut;
    }

    public Short getTip() {
        return tip;
    }

    public void setTip(Short tip) {
        this.tip = tip;
    }

    public Integer getFkdepo() {
        return fkdepo;
    }

    public void setFkdepo(Integer fkdepo) {
        this.fkdepo = fkdepo;
    }

    public String getMasraf() {
        return masraf;
    }

    public void setMasraf(String masraf) {
        this.masraf = masraf;
    }

    public String getMalCinsi() {
        return malCinsi;
    }

    public void setMalCinsi(String malCinsi) {
        this.malCinsi = malCinsi;
    }

    public String getAyiciriOzellik() {
        return ayiciriOzellik;
    }

    public void setAyiciriOzellik(String ayiciriOzellik) {
        this.ayiciriOzellik = ayiciriOzellik;
    }

    public String getKullanimYeri() {
        return kullanimYeri;
    }

    public void setKullanimYeri(String kullanimYeri) {
        this.kullanimYeri = kullanimYeri;
    }

    public String getOncelik() {
        return oncelik;
    }

    public void setOncelik(String oncelik) {
        this.oncelik = oncelik;
    }

    public BigDecimal getOnaylananMiktar() {
        return onaylananMiktar;
    }

    public void setOnaylananMiktar(BigDecimal onaylananMiktar) {
        this.onaylananMiktar = onaylananMiktar;
    }

    public Integer getTalepNo() {
        return talepNo;
    }

    public void setTalepNo(Integer talepNo) {
        this.talepNo = talepNo;
    }

    public Integer getPkkasa() {
        return pkkasa;
    }

    public void setPkkasa(Integer pkkasa) {
        this.pkkasa = pkkasa;
    }

    public Integer getFkbanka() {
        return fkbanka;
    }

    public void setFkbanka(Integer fkbanka) {
        this.fkbanka = fkbanka;
    }

    public String getKdvDahil() {
        return kdvDahil;
    }

    public void setKdvDahil(String kdvDahil) {
        this.kdvDahil = kdvDahil;
    }

    public Integer getKampanyaIndirim() {
        return kampanyaIndirim;
    }

    public void setKampanyaIndirim(Integer kampanyaIndirim) {
        this.kampanyaIndirim = kampanyaIndirim;
    }

    public Integer getFirmaIskontoOran() {
        return firmaIskontoOran;
    }

    public void setFirmaIskontoOran(Integer firmaIskontoOran) {
        this.firmaIskontoOran = firmaIskontoOran;
    }

    public BigDecimal getFirmaIskontoMiktar() {
        return firmaIskontoMiktar;
    }

    public void setFirmaIskontoMiktar(BigDecimal firmaIskontoMiktar) {
        this.firmaIskontoMiktar = firmaIskontoMiktar;
    }

    public Integer getStokIskontoOran() {
        return stokIskontoOran;
    }

    public void setStokIskontoOran(Integer stokIskontoOran) {
        this.stokIskontoOran = stokIskontoOran;
    }

    public BigDecimal getStokIskontoMiktar() {
        return stokIskontoMiktar;
    }

    public void setStokIskontoMiktar(BigDecimal stokIskontoMiktar) {
        this.stokIskontoMiktar = stokIskontoMiktar;
    }

    public String getTeslimAlan() {
        return teslimAlan;
    }

    public void setTeslimAlan(String teslimAlan) {
        this.teslimAlan = teslimAlan;
    }

    public Integer getDovizTuru() {
        return dovizTuru;
    }

    public void setDovizTuru(Integer dovizTuru) {
        this.dovizTuru = dovizTuru;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkHDetay != null ? pkHDetay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HareketDetay)) {
            return false;
        }
        HareketDetay other = (HareketDetay) object;
        if ((this.pkHDetay == null && other.pkHDetay != null) || (this.pkHDetay != null && !this.pkHDetay.equals(other.pkHDetay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.HareketDetay[ pkHDetay=" + pkHDetay + " ]";
    }
    
}

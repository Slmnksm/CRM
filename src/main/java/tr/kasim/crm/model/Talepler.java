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
@Table(name = "Talepler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Talepler.findAll", query = "SELECT t FROM Talepler t"),
    @NamedQuery(name = "Talepler.findByTalepKodu", query = "SELECT t FROM Talepler t WHERE t.talepKodu = :talepKodu"),
    @NamedQuery(name = "Talepler.findByTalepTarihi", query = "SELECT t FROM Talepler t WHERE t.talepTarihi = :talepTarihi"),
    @NamedQuery(name = "Talepler.findByTalepKullanici", query = "SELECT t FROM Talepler t WHERE t.talepKullanici = :talepKullanici"),
    @NamedQuery(name = "Talepler.findByOncelik", query = "SELECT t FROM Talepler t WHERE t.oncelik = :oncelik"),
    @NamedQuery(name = "Talepler.findByIsteyenBirim", query = "SELECT t FROM Talepler t WHERE t.isteyenBirim = :isteyenBirim"),
    @NamedQuery(name = "Talepler.findByMalzemeCinsi", query = "SELECT t FROM Talepler t WHERE t.malzemeCinsi = :malzemeCinsi"),
    @NamedQuery(name = "Talepler.findByUrunGrubu", query = "SELECT t FROM Talepler t WHERE t.urunGrubu = :urunGrubu"),
    @NamedQuery(name = "Talepler.findByUrunAdi", query = "SELECT t FROM Talepler t WHERE t.urunAdi = :urunAdi"),
    @NamedQuery(name = "Talepler.findByAyiriciOzellik", query = "SELECT t FROM Talepler t WHERE t.ayiriciOzellik = :ayiriciOzellik"),
    @NamedQuery(name = "Talepler.findByMiktar", query = "SELECT t FROM Talepler t WHERE t.miktar = :miktar"),
    @NamedQuery(name = "Talepler.findByMiktarBirim", query = "SELECT t FROM Talepler t WHERE t.miktarBirim = :miktarBirim"),
    @NamedQuery(name = "Talepler.findByKullanimYeri", query = "SELECT t FROM Talepler t WHERE t.kullanimYeri = :kullanimYeri"),
    @NamedQuery(name = "Talepler.findByIstenenTarih", query = "SELECT t FROM Talepler t WHERE t.istenenTarih = :istenenTarih"),
    @NamedQuery(name = "Talepler.findByAciklama", query = "SELECT t FROM Talepler t WHERE t.aciklama = :aciklama"),
    @NamedQuery(name = "Talepler.findByDurum", query = "SELECT t FROM Talepler t WHERE t.durum = :durum"),
    @NamedQuery(name = "Talepler.findByUrunKodu", query = "SELECT t FROM Talepler t WHERE t.urunKodu = :urunKodu"),
    @NamedQuery(name = "Talepler.findBySil", query = "SELECT t FROM Talepler t WHERE t.sil = :sil")})
public class Talepler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "talep_kodu")
    private Integer talepKodu;
    @Column(name = "talep_tarihi")
    @Temporal(TemporalType.DATE)
    private Date talepTarihi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "talep_kullanici")
    private int talepKullanici;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "oncelik")
    private String oncelik;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isteyen_birim")
    private int isteyenBirim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "malzeme_cinsi")
    private String malzemeCinsi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "urun_grubu")
    private String urunGrubu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "urun_adi")
    private String urunAdi;
    @Size(max = 300)
    @Column(name = "ayirici_ozellik")
    private String ayiriciOzellik;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "miktar")
    private String miktar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "miktar_birim")
    private String miktarBirim;
    @Size(max = 300)
    @Column(name = "kullanim_yeri")
    private String kullanimYeri;
    @Column(name = "istenen_tarih")
    @Temporal(TemporalType.DATE)
    private Date istenenTarih;
    @Size(max = 300)
    @Column(name = "aciklama")
    private String aciklama;
    @Size(max = 20)
    @Column(name = "durum")
    private String durum;
    @Size(max = 200)
    @Column(name = "urun_kodu")
    private String urunKodu;
    @Column(name = "sil")
    private Integer sil;

    public Talepler() {
    }

    public Talepler(Integer talepKodu) {
        this.talepKodu = talepKodu;
    }

    public Talepler(Integer talepKodu, int talepKullanici, String oncelik, int isteyenBirim, String malzemeCinsi, String urunGrubu, String urunAdi, String miktar, String miktarBirim) {
        this.talepKodu = talepKodu;
        this.talepKullanici = talepKullanici;
        this.oncelik = oncelik;
        this.isteyenBirim = isteyenBirim;
        this.malzemeCinsi = malzemeCinsi;
        this.urunGrubu = urunGrubu;
        this.urunAdi = urunAdi;
        this.miktar = miktar;
        this.miktarBirim = miktarBirim;
    }

    public Integer getTalepKodu() {
        return talepKodu;
    }

    public void setTalepKodu(Integer talepKodu) {
        this.talepKodu = talepKodu;
    }

    public Date getTalepTarihi() {
        return talepTarihi;
    }

    public void setTalepTarihi(Date talepTarihi) {
        this.talepTarihi = talepTarihi;
    }

    public int getTalepKullanici() {
        return talepKullanici;
    }

    public void setTalepKullanici(int talepKullanici) {
        this.talepKullanici = talepKullanici;
    }

    public String getOncelik() {
        return oncelik;
    }

    public void setOncelik(String oncelik) {
        this.oncelik = oncelik;
    }

    public int getIsteyenBirim() {
        return isteyenBirim;
    }

    public void setIsteyenBirim(int isteyenBirim) {
        this.isteyenBirim = isteyenBirim;
    }

    public String getMalzemeCinsi() {
        return malzemeCinsi;
    }

    public void setMalzemeCinsi(String malzemeCinsi) {
        this.malzemeCinsi = malzemeCinsi;
    }

    public String getUrunGrubu() {
        return urunGrubu;
    }

    public void setUrunGrubu(String urunGrubu) {
        this.urunGrubu = urunGrubu;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getAyiriciOzellik() {
        return ayiriciOzellik;
    }

    public void setAyiriciOzellik(String ayiriciOzellik) {
        this.ayiriciOzellik = ayiriciOzellik;
    }

    public String getMiktar() {
        return miktar;
    }

    public void setMiktar(String miktar) {
        this.miktar = miktar;
    }

    public String getMiktarBirim() {
        return miktarBirim;
    }

    public void setMiktarBirim(String miktarBirim) {
        this.miktarBirim = miktarBirim;
    }

    public String getKullanimYeri() {
        return kullanimYeri;
    }

    public void setKullanimYeri(String kullanimYeri) {
        this.kullanimYeri = kullanimYeri;
    }

    public Date getIstenenTarih() {
        return istenenTarih;
    }

    public void setIstenenTarih(Date istenenTarih) {
        this.istenenTarih = istenenTarih;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getUrunKodu() {
        return urunKodu;
    }

    public void setUrunKodu(String urunKodu) {
        this.urunKodu = urunKodu;
    }

    public Integer getSil() {
        return sil;
    }

    public void setSil(Integer sil) {
        this.sil = sil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (talepKodu != null ? talepKodu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Talepler)) {
            return false;
        }
        Talepler other = (Talepler) object;
        if ((this.talepKodu == null && other.talepKodu != null) || (this.talepKodu != null && !this.talepKodu.equals(other.talepKodu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Talepler[ talepKodu=" + talepKodu + " ]";
    }
    
}

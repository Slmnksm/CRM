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
@Table(name = "Hareket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hareket.findAll", query = "SELECT h FROM Hareket h"),
    @NamedQuery(name = "Hareket.findByFkHareket", query = "SELECT h FROM Hareket h WHERE h.fkHareket = :fkHareket"),
    @NamedQuery(name = "Hareket.findByUstNo", query = "SELECT h FROM Hareket h WHERE h.ustNo = :ustNo"),
    @NamedQuery(name = "Hareket.findByHareketTip", query = "SELECT h FROM Hareket h WHERE h.hareketTip = :hareketTip"),
    @NamedQuery(name = "Hareket.findByIslemTarih", query = "SELECT h FROM Hareket h WHERE h.islemTarih = :islemTarih"),
    @NamedQuery(name = "Hareket.findByEvrakTarih", query = "SELECT h FROM Hareket h WHERE h.evrakTarih = :evrakTarih"),
    @NamedQuery(name = "Hareket.findByEvrakNo", query = "SELECT h FROM Hareket h WHERE h.evrakNo = :evrakNo"),
    @NamedQuery(name = "Hareket.findByFisNo", query = "SELECT h FROM Hareket h WHERE h.fisNo = :fisNo"),
    @NamedQuery(name = "Hareket.findByFkFirma", query = "SELECT h FROM Hareket h WHERE h.fkFirma = :fkFirma"),
    @NamedQuery(name = "Hareket.findByFkEvrakTip", query = "SELECT h FROM Hareket h WHERE h.fkEvrakTip = :fkEvrakTip"),
    @NamedQuery(name = "Hareket.findByEvrakToplam", query = "SELECT h FROM Hareket h WHERE h.evrakToplam = :evrakToplam"),
    @NamedQuery(name = "Hareket.findByAciklama", query = "SELECT h FROM Hareket h WHERE h.aciklama = :aciklama"),
    @NamedQuery(name = "Hareket.findByGuncelleme", query = "SELECT h FROM Hareket h WHERE h.guncelleme = :guncelleme"),
    @NamedQuery(name = "Hareket.findByKullanici", query = "SELECT h FROM Hareket h WHERE h.kullanici = :kullanici"),
    @NamedQuery(name = "Hareket.findBySilZaman", query = "SELECT h FROM Hareket h WHERE h.silZaman = :silZaman"),
    @NamedQuery(name = "Hareket.findBySilKullanici", query = "SELECT h FROM Hareket h WHERE h.silKullanici = :silKullanici"),
    @NamedQuery(name = "Hareket.findBySil", query = "SELECT h FROM Hareket h WHERE h.sil = :sil"),
    @NamedQuery(name = "Hareket.findByIsno", query = "SELECT h FROM Hareket h WHERE h.isno = :isno"),
    @NamedQuery(name = "Hareket.findByFistip", query = "SELECT h FROM Hareket h WHERE h.fistip = :fistip"),
    @NamedQuery(name = "Hareket.findByFkdepo", query = "SELECT h FROM Hareket h WHERE h.fkdepo = :fkdepo"),
    @NamedQuery(name = "Hareket.findByTalepNo", query = "SELECT h FROM Hareket h WHERE h.talepNo = :talepNo"),
    @NamedQuery(name = "Hareket.findByIskonto", query = "SELECT h FROM Hareket h WHERE h.iskonto = :iskonto"),
    @NamedQuery(name = "Hareket.findByProjekod", query = "SELECT h FROM Hareket h WHERE h.projekod = :projekod"),
    @NamedQuery(name = "Hareket.findByPkSirket", query = "SELECT h FROM Hareket h WHERE h.pkSirket = :pkSirket"),
    @NamedQuery(name = "Hareket.findByOzel", query = "SELECT h FROM Hareket h WHERE h.ozel = :ozel"),
    @NamedQuery(name = "Hareket.findByToplam", query = "SELECT h FROM Hareket h WHERE h.toplam = :toplam"),
    @NamedQuery(name = "Hareket.findByDovizTutari", query = "SELECT h FROM Hareket h WHERE h.dovizTutari = :dovizTutari"),
    @NamedQuery(name = "Hareket.findByDovizTuru", query = "SELECT h FROM Hareket h WHERE h.dovizTuru = :dovizTuru"),
    @NamedQuery(name = "Hareket.findByKdvTutar", query = "SELECT h FROM Hareket h WHERE h.kdvTutar = :kdvTutar"),
    @NamedQuery(name = "Hareket.findByFksatici", query = "SELECT h FROM Hareket h WHERE h.fksatici = :fksatici"),
    @NamedQuery(name = "Hareket.findByDonem", query = "SELECT h FROM Hareket h WHERE h.donem = :donem"),
    @NamedQuery(name = "Hareket.findByFistur", query = "SELECT h FROM Hareket h WHERE h.fistur = :fistur"),
    @NamedQuery(name = "Hareket.findByVade", query = "SELECT h FROM Hareket h WHERE h.vade = :vade"),
    @NamedQuery(name = "Hareket.findByIrsaliyeno", query = "SELECT h FROM Hareket h WHERE h.irsaliyeno = :irsaliyeno"),
    @NamedQuery(name = "Hareket.findByDurum", query = "SELECT h FROM Hareket h WHERE h.durum = :durum"),
    @NamedQuery(name = "Hareket.findBySevkAdres", query = "SELECT h FROM Hareket h WHERE h.sevkAdres = :sevkAdres")})
public class Hareket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkHareket")
    private Integer fkHareket;
    @Column(name = "UstNo")
    private Integer ustNo;
    @Column(name = "HareketTip")
    private Integer hareketTip;
    @Column(name = "islemTarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date islemTarih;
    @Column(name = "EvrakTarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evrakTarih;
    @Size(max = 150)
    @Column(name = "EvrakNo")
    private String evrakNo;
    @Size(max = 50)
    @Column(name = "FisNo")
    private String fisNo;
    @Column(name = "fkFirma")
    private Integer fkFirma;
    @Column(name = "fkEvrakTip")
    private Integer fkEvrakTip;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EvrakToplam")
    private BigDecimal evrakToplam;
    @Size(max = 150)
    @Column(name = "Aciklama")
    private String aciklama;
    @Column(name = "Guncelleme")
    @Temporal(TemporalType.TIMESTAMP)
    private Date guncelleme;
    @Column(name = "Kullanici")
    private Integer kullanici;
    @Column(name = "SilZaman")
    @Temporal(TemporalType.TIMESTAMP)
    private Date silZaman;
    @Column(name = "SilKullanici")
    @Temporal(TemporalType.TIMESTAMP)
    private Date silKullanici;
    @Column(name = "Sil")
    private Boolean sil;
    @Column(name = "isno")
    private Integer isno;
    @Size(max = 50)
    @Column(name = "fistip")
    private String fistip;
    @Column(name = "fkdepo")
    private Integer fkdepo;
    @Column(name = "TalepNo")
    private Integer talepNo;
    @Column(name = "Iskonto")
    private BigDecimal iskonto;
    @Size(max = 50)
    @Column(name = "Projekod")
    private String projekod;
    @Column(name = "pkSirket")
    private Integer pkSirket;
    @Column(name = "Ozel")
    private Boolean ozel;
    @Column(name = "Toplam")
    private BigDecimal toplam;
    @Column(name = "DovizTutari")
    private BigDecimal dovizTutari;
    @Column(name = "DovizTuru")
    private Integer dovizTuru;
    @Column(name = "KdvTutar")
    private BigDecimal kdvTutar;
    @Column(name = "fksatici")
    private Integer fksatici;
    @Column(name = "Donem")
    private Integer donem;
    @Size(max = 50)
    @Column(name = "Fistur")
    private String fistur;
    @Column(name = "Vade")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vade;
    @Column(name = "irsaliyeno")
    private Integer irsaliyeno;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;
    @Size(max = 400)
    @Column(name = "SevkAdres")
    private String sevkAdres;

    public Hareket() {
    }

    public Hareket(Integer fkHareket) {
        this.fkHareket = fkHareket;
    }

    public Integer getFkHareket() {
        return fkHareket;
    }

    public void setFkHareket(Integer fkHareket) {
        this.fkHareket = fkHareket;
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

    public Date getEvrakTarih() {
        return evrakTarih;
    }

    public void setEvrakTarih(Date evrakTarih) {
        this.evrakTarih = evrakTarih;
    }

    public String getEvrakNo() {
        return evrakNo;
    }

    public void setEvrakNo(String evrakNo) {
        this.evrakNo = evrakNo;
    }

    public String getFisNo() {
        return fisNo;
    }

    public void setFisNo(String fisNo) {
        this.fisNo = fisNo;
    }

    public Integer getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Integer fkFirma) {
        this.fkFirma = fkFirma;
    }

    public Integer getFkEvrakTip() {
        return fkEvrakTip;
    }

    public void setFkEvrakTip(Integer fkEvrakTip) {
        this.fkEvrakTip = fkEvrakTip;
    }

    public BigDecimal getEvrakToplam() {
        return evrakToplam;
    }

    public void setEvrakToplam(BigDecimal evrakToplam) {
        this.evrakToplam = evrakToplam;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Date getGuncelleme() {
        return guncelleme;
    }

    public void setGuncelleme(Date guncelleme) {
        this.guncelleme = guncelleme;
    }

    public Integer getKullanici() {
        return kullanici;
    }

    public void setKullanici(Integer kullanici) {
        this.kullanici = kullanici;
    }

    public Date getSilZaman() {
        return silZaman;
    }

    public void setSilZaman(Date silZaman) {
        this.silZaman = silZaman;
    }

    public Date getSilKullanici() {
        return silKullanici;
    }

    public void setSilKullanici(Date silKullanici) {
        this.silKullanici = silKullanici;
    }

    public Boolean getSil() {
        return sil;
    }

    public void setSil(Boolean sil) {
        this.sil = sil;
    }

    public Integer getIsno() {
        return isno;
    }

    public void setIsno(Integer isno) {
        this.isno = isno;
    }

    public String getFistip() {
        return fistip;
    }

    public void setFistip(String fistip) {
        this.fistip = fistip;
    }

    public Integer getFkdepo() {
        return fkdepo;
    }

    public void setFkdepo(Integer fkdepo) {
        this.fkdepo = fkdepo;
    }

    public Integer getTalepNo() {
        return talepNo;
    }

    public void setTalepNo(Integer talepNo) {
        this.talepNo = talepNo;
    }

    public BigDecimal getIskonto() {
        return iskonto;
    }

    public void setIskonto(BigDecimal iskonto) {
        this.iskonto = iskonto;
    }

    public String getProjekod() {
        return projekod;
    }

    public void setProjekod(String projekod) {
        this.projekod = projekod;
    }

    public Integer getPkSirket() {
        return pkSirket;
    }

    public void setPkSirket(Integer pkSirket) {
        this.pkSirket = pkSirket;
    }

    public Boolean getOzel() {
        return ozel;
    }

    public void setOzel(Boolean ozel) {
        this.ozel = ozel;
    }

    public BigDecimal getToplam() {
        return toplam;
    }

    public void setToplam(BigDecimal toplam) {
        this.toplam = toplam;
    }

    public BigDecimal getDovizTutari() {
        return dovizTutari;
    }

    public void setDovizTutari(BigDecimal dovizTutari) {
        this.dovizTutari = dovizTutari;
    }

    public Integer getDovizTuru() {
        return dovizTuru;
    }

    public void setDovizTuru(Integer dovizTuru) {
        this.dovizTuru = dovizTuru;
    }

    public BigDecimal getKdvTutar() {
        return kdvTutar;
    }

    public void setKdvTutar(BigDecimal kdvTutar) {
        this.kdvTutar = kdvTutar;
    }

    public Integer getFksatici() {
        return fksatici;
    }

    public void setFksatici(Integer fksatici) {
        this.fksatici = fksatici;
    }

    public Integer getDonem() {
        return donem;
    }

    public void setDonem(Integer donem) {
        this.donem = donem;
    }

    public String getFistur() {
        return fistur;
    }

    public void setFistur(String fistur) {
        this.fistur = fistur;
    }

    public Date getVade() {
        return vade;
    }

    public void setVade(Date vade) {
        this.vade = vade;
    }

    public Integer getIrsaliyeno() {
        return irsaliyeno;
    }

    public void setIrsaliyeno(Integer irsaliyeno) {
        this.irsaliyeno = irsaliyeno;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getSevkAdres() {
        return sevkAdres;
    }

    public void setSevkAdres(String sevkAdres) {
        this.sevkAdres = sevkAdres;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fkHareket != null ? fkHareket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hareket)) {
            return false;
        }
        Hareket other = (Hareket) object;
        if ((this.fkHareket == null && other.fkHareket != null) || (this.fkHareket != null && !this.fkHareket.equals(other.fkHareket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Hareket[ fkHareket=" + fkHareket + " ]";
    }
    
}

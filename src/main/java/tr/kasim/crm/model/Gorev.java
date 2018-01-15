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
@Table(name = "Gorev")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gorev.findAll", query = "SELECT g FROM Gorev g"),
    @NamedQuery(name = "Gorev.findByPkGorev", query = "SELECT g FROM Gorev g WHERE g.pkGorev = :pkGorev"),
    @NamedQuery(name = "Gorev.findByFkGorevVeren", query = "SELECT g FROM Gorev g WHERE g.fkGorevVeren = :fkGorevVeren"),
    @NamedQuery(name = "Gorev.findByFkGorevlendirilen", query = "SELECT g FROM Gorev g WHERE g.fkGorevlendirilen = :fkGorevlendirilen"),
    @NamedQuery(name = "Gorev.findByGorevTarihi", query = "SELECT g FROM Gorev g WHERE g.gorevTarihi = :gorevTarihi"),
    @NamedQuery(name = "Gorev.findBySaat", query = "SELECT g FROM Gorev g WHERE g.saat = :saat"),
    @NamedQuery(name = "Gorev.findByTarih", query = "SELECT g FROM Gorev g WHERE g.tarih = :tarih"),
    @NamedQuery(name = "Gorev.findByFkProje", query = "SELECT g FROM Gorev g WHERE g.fkProje = :fkProje"),
    @NamedQuery(name = "Gorev.findByGorev", query = "SELECT g FROM Gorev g WHERE g.gorev = :gorev"),
    @NamedQuery(name = "Gorev.findByDurum", query = "SELECT g FROM Gorev g WHERE g.durum = :durum"),
    @NamedQuery(name = "Gorev.findByFkYonlendirilen", query = "SELECT g FROM Gorev g WHERE g.fkYonlendirilen = :fkYonlendirilen"),
    @NamedQuery(name = "Gorev.findByAciklama", query = "SELECT g FROM Gorev g WHERE g.aciklama = :aciklama"),
    @NamedQuery(name = "Gorev.findByTur", query = "SELECT g FROM Gorev g WHERE g.tur = :tur"),
    @NamedQuery(name = "Gorev.findByTip", query = "SELECT g FROM Gorev g WHERE g.tip = :tip"),
    @NamedQuery(name = "Gorev.findByFkFirsat", query = "SELECT g FROM Gorev g WHERE g.fkFirsat = :fkFirsat"),
    @NamedQuery(name = "Gorev.findByFkGorusme", query = "SELECT g FROM Gorev g WHERE g.fkGorusme = :fkGorusme")})
public class Gorev implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkGorev")
    private Integer pkGorev;
    @Column(name = "fkGorevVeren")
    private Integer fkGorevVeren;
    @Column(name = "fkGorevlendirilen")
    private Integer fkGorevlendirilen;
    @Column(name = "GorevTarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gorevTarihi;
    @Size(max = 50)
    @Column(name = "Saat")
    private String saat;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Column(name = "fkProje")
    private Integer fkProje;
    @Size(max = 1073741823)
    @Column(name = "Gorev")
    private String gorev;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;
    @Column(name = "fkYonlendirilen")
    private Integer fkYonlendirilen;
    @Size(max = 1073741823)
    @Column(name = "Aciklama")
    private String aciklama;
    @Size(max = 50)
    @Column(name = "Tur")
    private String tur;
    @Column(name = "Tip")
    private Short tip;
    @Column(name = "fkFirsat")
    private Integer fkFirsat;
    @Column(name = "fkGorusme")
    private Integer fkGorusme;

    public Gorev() {
    }

    public Gorev(Integer pkGorev) {
        this.pkGorev = pkGorev;
    }

    public Integer getPkGorev() {
        return pkGorev;
    }

    public void setPkGorev(Integer pkGorev) {
        this.pkGorev = pkGorev;
    }

    public Integer getFkGorevVeren() {
        return fkGorevVeren;
    }

    public void setFkGorevVeren(Integer fkGorevVeren) {
        this.fkGorevVeren = fkGorevVeren;
    }

    public Integer getFkGorevlendirilen() {
        return fkGorevlendirilen;
    }

    public void setFkGorevlendirilen(Integer fkGorevlendirilen) {
        this.fkGorevlendirilen = fkGorevlendirilen;
    }

    public Date getGorevTarihi() {
        return gorevTarihi;
    }

    public void setGorevTarihi(Date gorevTarihi) {
        this.gorevTarihi = gorevTarihi;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public Integer getFkProje() {
        return fkProje;
    }

    public void setFkProje(Integer fkProje) {
        this.fkProje = fkProje;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public Integer getFkYonlendirilen() {
        return fkYonlendirilen;
    }

    public void setFkYonlendirilen(Integer fkYonlendirilen) {
        this.fkYonlendirilen = fkYonlendirilen;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public Short getTip() {
        return tip;
    }

    public void setTip(Short tip) {
        this.tip = tip;
    }

    public Integer getFkFirsat() {
        return fkFirsat;
    }

    public void setFkFirsat(Integer fkFirsat) {
        this.fkFirsat = fkFirsat;
    }

    public Integer getFkGorusme() {
        return fkGorusme;
    }

    public void setFkGorusme(Integer fkGorusme) {
        this.fkGorusme = fkGorusme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkGorev != null ? pkGorev.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gorev)) {
            return false;
        }
        Gorev other = (Gorev) object;
        if ((this.pkGorev == null && other.pkGorev != null) || (this.pkGorev != null && !this.pkGorev.equals(other.pkGorev))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Gorev[ pkGorev=" + pkGorev + " ]";
    }
    
}

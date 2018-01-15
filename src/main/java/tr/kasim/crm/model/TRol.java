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
@Table(name = "T_Rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TRol.findAll", query = "SELECT t FROM TRol t"),
    @NamedQuery(name = "TRol.findByPkRol", query = "SELECT t FROM TRol t WHERE t.pkRol = :pkRol"),
    @NamedQuery(name = "TRol.findByRolAd", query = "SELECT t FROM TRol t WHERE t.rolAd = :rolAd"),
    @NamedQuery(name = "TRol.findByTamYetki", query = "SELECT t FROM TRol t WHERE t.tamYetki = :tamYetki"),
    @NamedQuery(name = "TRol.findByIslemler", query = "SELECT t FROM TRol t WHERE t.islemler = :islemler"),
    @NamedQuery(name = "TRol.findByStokYonetim", query = "SELECT t FROM TRol t WHERE t.stokYonetim = :stokYonetim"),
    @NamedQuery(name = "TRol.findBySatinAlma", query = "SELECT t FROM TRol t WHERE t.satinAlma = :satinAlma"),
    @NamedQuery(name = "TRol.findByPersonel", query = "SELECT t FROM TRol t WHERE t.personel = :personel"),
    @NamedQuery(name = "TRol.findByMuhasebe", query = "SELECT t FROM TRol t WHERE t.muhasebe = :muhasebe"),
    @NamedQuery(name = "TRol.findByRaporlar", query = "SELECT t FROM TRol t WHERE t.raporlar = :raporlar"),
    @NamedQuery(name = "TRol.findByTanimlar", query = "SELECT t FROM TRol t WHERE t.tanimlar = :tanimlar"),
    @NamedQuery(name = "TRol.findByServis", query = "SELECT t FROM TRol t WHERE t.servis = :servis"),
    @NamedQuery(name = "TRol.findByA1", query = "SELECT t FROM TRol t WHERE t.a1 = :a1"),
    @NamedQuery(name = "TRol.findByA2", query = "SELECT t FROM TRol t WHERE t.a2 = :a2"),
    @NamedQuery(name = "TRol.findByA3", query = "SELECT t FROM TRol t WHERE t.a3 = :a3"),
    @NamedQuery(name = "TRol.findByA4", query = "SELECT t FROM TRol t WHERE t.a4 = :a4"),
    @NamedQuery(name = "TRol.findByA5", query = "SELECT t FROM TRol t WHERE t.a5 = :a5"),
    @NamedQuery(name = "TRol.findByA6", query = "SELECT t FROM TRol t WHERE t.a6 = :a6"),
    @NamedQuery(name = "TRol.findByA7", query = "SELECT t FROM TRol t WHERE t.a7 = :a7"),
    @NamedQuery(name = "TRol.findByA8", query = "SELECT t FROM TRol t WHERE t.a8 = :a8"),
    @NamedQuery(name = "TRol.findByA9", query = "SELECT t FROM TRol t WHERE t.a9 = :a9"),
    @NamedQuery(name = "TRol.findByA10", query = "SELECT t FROM TRol t WHERE t.a10 = :a10"),
    @NamedQuery(name = "TRol.findByA11", query = "SELECT t FROM TRol t WHERE t.a11 = :a11"),
    @NamedQuery(name = "TRol.findByA12", query = "SELECT t FROM TRol t WHERE t.a12 = :a12"),
    @NamedQuery(name = "TRol.findByA13", query = "SELECT t FROM TRol t WHERE t.a13 = :a13"),
    @NamedQuery(name = "TRol.findByA14", query = "SELECT t FROM TRol t WHERE t.a14 = :a14"),
    @NamedQuery(name = "TRol.findByA15", query = "SELECT t FROM TRol t WHERE t.a15 = :a15"),
    @NamedQuery(name = "TRol.findByA16", query = "SELECT t FROM TRol t WHERE t.a16 = :a16"),
    @NamedQuery(name = "TRol.findByA17", query = "SELECT t FROM TRol t WHERE t.a17 = :a17"),
    @NamedQuery(name = "TRol.findByA18", query = "SELECT t FROM TRol t WHERE t.a18 = :a18"),
    @NamedQuery(name = "TRol.findByA19", query = "SELECT t FROM TRol t WHERE t.a19 = :a19"),
    @NamedQuery(name = "TRol.findByB1", query = "SELECT t FROM TRol t WHERE t.b1 = :b1"),
    @NamedQuery(name = "TRol.findByB2", query = "SELECT t FROM TRol t WHERE t.b2 = :b2"),
    @NamedQuery(name = "TRol.findByB3", query = "SELECT t FROM TRol t WHERE t.b3 = :b3"),
    @NamedQuery(name = "TRol.findByB4", query = "SELECT t FROM TRol t WHERE t.b4 = :b4"),
    @NamedQuery(name = "TRol.findByB5", query = "SELECT t FROM TRol t WHERE t.b5 = :b5"),
    @NamedQuery(name = "TRol.findByB6", query = "SELECT t FROM TRol t WHERE t.b6 = :b6"),
    @NamedQuery(name = "TRol.findByB7", query = "SELECT t FROM TRol t WHERE t.b7 = :b7"),
    @NamedQuery(name = "TRol.findByB8", query = "SELECT t FROM TRol t WHERE t.b8 = :b8"),
    @NamedQuery(name = "TRol.findByB9", query = "SELECT t FROM TRol t WHERE t.b9 = :b9"),
    @NamedQuery(name = "TRol.findByB10", query = "SELECT t FROM TRol t WHERE t.b10 = :b10"),
    @NamedQuery(name = "TRol.findByB11", query = "SELECT t FROM TRol t WHERE t.b11 = :b11"),
    @NamedQuery(name = "TRol.findByB12", query = "SELECT t FROM TRol t WHERE t.b12 = :b12"),
    @NamedQuery(name = "TRol.findByB13", query = "SELECT t FROM TRol t WHERE t.b13 = :b13"),
    @NamedQuery(name = "TRol.findByB14", query = "SELECT t FROM TRol t WHERE t.b14 = :b14"),
    @NamedQuery(name = "TRol.findByB15", query = "SELECT t FROM TRol t WHERE t.b15 = :b15"),
    @NamedQuery(name = "TRol.findByB17", query = "SELECT t FROM TRol t WHERE t.b17 = :b17"),
    @NamedQuery(name = "TRol.findByC1", query = "SELECT t FROM TRol t WHERE t.c1 = :c1"),
    @NamedQuery(name = "TRol.findByC2", query = "SELECT t FROM TRol t WHERE t.c2 = :c2"),
    @NamedQuery(name = "TRol.findByC3", query = "SELECT t FROM TRol t WHERE t.c3 = :c3"),
    @NamedQuery(name = "TRol.findByC4", query = "SELECT t FROM TRol t WHERE t.c4 = :c4"),
    @NamedQuery(name = "TRol.findByC5", query = "SELECT t FROM TRol t WHERE t.c5 = :c5"),
    @NamedQuery(name = "TRol.findByC6", query = "SELECT t FROM TRol t WHERE t.c6 = :c6"),
    @NamedQuery(name = "TRol.findByC7", query = "SELECT t FROM TRol t WHERE t.c7 = :c7"),
    @NamedQuery(name = "TRol.findByD1", query = "SELECT t FROM TRol t WHERE t.d1 = :d1"),
    @NamedQuery(name = "TRol.findByD2", query = "SELECT t FROM TRol t WHERE t.d2 = :d2"),
    @NamedQuery(name = "TRol.findByD3", query = "SELECT t FROM TRol t WHERE t.d3 = :d3"),
    @NamedQuery(name = "TRol.findByD4", query = "SELECT t FROM TRol t WHERE t.d4 = :d4"),
    @NamedQuery(name = "TRol.findByD5", query = "SELECT t FROM TRol t WHERE t.d5 = :d5"),
    @NamedQuery(name = "TRol.findByD6", query = "SELECT t FROM TRol t WHERE t.d6 = :d6"),
    @NamedQuery(name = "TRol.findByD7", query = "SELECT t FROM TRol t WHERE t.d7 = :d7"),
    @NamedQuery(name = "TRol.findByE1", query = "SELECT t FROM TRol t WHERE t.e1 = :e1"),
    @NamedQuery(name = "TRol.findByE2", query = "SELECT t FROM TRol t WHERE t.e2 = :e2"),
    @NamedQuery(name = "TRol.findByE3", query = "SELECT t FROM TRol t WHERE t.e3 = :e3"),
    @NamedQuery(name = "TRol.findByE4", query = "SELECT t FROM TRol t WHERE t.e4 = :e4"),
    @NamedQuery(name = "TRol.findByE5", query = "SELECT t FROM TRol t WHERE t.e5 = :e5"),
    @NamedQuery(name = "TRol.findByE6", query = "SELECT t FROM TRol t WHERE t.e6 = :e6"),
    @NamedQuery(name = "TRol.findByE7", query = "SELECT t FROM TRol t WHERE t.e7 = :e7"),
    @NamedQuery(name = "TRol.findByE8", query = "SELECT t FROM TRol t WHERE t.e8 = :e8"),
    @NamedQuery(name = "TRol.findByE9", query = "SELECT t FROM TRol t WHERE t.e9 = :e9"),
    @NamedQuery(name = "TRol.findByE10", query = "SELECT t FROM TRol t WHERE t.e10 = :e10"),
    @NamedQuery(name = "TRol.findByE11", query = "SELECT t FROM TRol t WHERE t.e11 = :e11"),
    @NamedQuery(name = "TRol.findByE12", query = "SELECT t FROM TRol t WHERE t.e12 = :e12"),
    @NamedQuery(name = "TRol.findByE13", query = "SELECT t FROM TRol t WHERE t.e13 = :e13"),
    @NamedQuery(name = "TRol.findByE14", query = "SELECT t FROM TRol t WHERE t.e14 = :e14"),
    @NamedQuery(name = "TRol.findByF1", query = "SELECT t FROM TRol t WHERE t.f1 = :f1"),
    @NamedQuery(name = "TRol.findByF2", query = "SELECT t FROM TRol t WHERE t.f2 = :f2"),
    @NamedQuery(name = "TRol.findByF3", query = "SELECT t FROM TRol t WHERE t.f3 = :f3"),
    @NamedQuery(name = "TRol.findByF4", query = "SELECT t FROM TRol t WHERE t.f4 = :f4"),
    @NamedQuery(name = "TRol.findByF5", query = "SELECT t FROM TRol t WHERE t.f5 = :f5"),
    @NamedQuery(name = "TRol.findByF6", query = "SELECT t FROM TRol t WHERE t.f6 = :f6"),
    @NamedQuery(name = "TRol.findByF7", query = "SELECT t FROM TRol t WHERE t.f7 = :f7"),
    @NamedQuery(name = "TRol.findByF8", query = "SELECT t FROM TRol t WHERE t.f8 = :f8"),
    @NamedQuery(name = "TRol.findByF9", query = "SELECT t FROM TRol t WHERE t.f9 = :f9"),
    @NamedQuery(name = "TRol.findByF10", query = "SELECT t FROM TRol t WHERE t.f10 = :f10"),
    @NamedQuery(name = "TRol.findByF11", query = "SELECT t FROM TRol t WHERE t.f11 = :f11"),
    @NamedQuery(name = "TRol.findByF12", query = "SELECT t FROM TRol t WHERE t.f12 = :f12"),
    @NamedQuery(name = "TRol.findByF13", query = "SELECT t FROM TRol t WHERE t.f13 = :f13"),
    @NamedQuery(name = "TRol.findByF14", query = "SELECT t FROM TRol t WHERE t.f14 = :f14"),
    @NamedQuery(name = "TRol.findByF15", query = "SELECT t FROM TRol t WHERE t.f15 = :f15"),
    @NamedQuery(name = "TRol.findByF16", query = "SELECT t FROM TRol t WHERE t.f16 = :f16"),
    @NamedQuery(name = "TRol.findByF17", query = "SELECT t FROM TRol t WHERE t.f17 = :f17"),
    @NamedQuery(name = "TRol.findByF18", query = "SELECT t FROM TRol t WHERE t.f18 = :f18"),
    @NamedQuery(name = "TRol.findByF19", query = "SELECT t FROM TRol t WHERE t.f19 = :f19"),
    @NamedQuery(name = "TRol.findByF20", query = "SELECT t FROM TRol t WHERE t.f20 = :f20"),
    @NamedQuery(name = "TRol.findByG1", query = "SELECT t FROM TRol t WHERE t.g1 = :g1"),
    @NamedQuery(name = "TRol.findByG2", query = "SELECT t FROM TRol t WHERE t.g2 = :g2"),
    @NamedQuery(name = "TRol.findByG3", query = "SELECT t FROM TRol t WHERE t.g3 = :g3"),
    @NamedQuery(name = "TRol.findByG4", query = "SELECT t FROM TRol t WHERE t.g4 = :g4"),
    @NamedQuery(name = "TRol.findByG5", query = "SELECT t FROM TRol t WHERE t.g5 = :g5"),
    @NamedQuery(name = "TRol.findByG6", query = "SELECT t FROM TRol t WHERE t.g6 = :g6"),
    @NamedQuery(name = "TRol.findByG7", query = "SELECT t FROM TRol t WHERE t.g7 = :g7"),
    @NamedQuery(name = "TRol.findByG8", query = "SELECT t FROM TRol t WHERE t.g8 = :g8")})
public class TRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkRol")
    private Integer pkRol;
    @Size(max = 50)
    @Column(name = "RolAd")
    private String rolAd;
    @Column(name = "TamYetki")
    private Boolean tamYetki;
    @Column(name = "islemler")
    private Boolean islemler;
    @Column(name = "StokYonetim")
    private Boolean stokYonetim;
    @Column(name = "SatinAlma")
    private Boolean satinAlma;
    @Column(name = "Personel")
    private Boolean personel;
    @Column(name = "Muhasebe")
    private Boolean muhasebe;
    @Column(name = "Raporlar")
    private Boolean raporlar;
    @Column(name = "Tanimlar")
    private Boolean tanimlar;
    @Column(name = "Servis")
    private Boolean servis;
    @Column(name = "a1")
    private Boolean a1;
    @Column(name = "a2")
    private Boolean a2;
    @Column(name = "a3")
    private Boolean a3;
    @Column(name = "a4")
    private Boolean a4;
    @Column(name = "a5")
    private Boolean a5;
    @Column(name = "a6")
    private Boolean a6;
    @Column(name = "a7")
    private Boolean a7;
    @Column(name = "a8")
    private Boolean a8;
    @Column(name = "a9")
    private Boolean a9;
    @Column(name = "a10")
    private Boolean a10;
    @Column(name = "a11")
    private Boolean a11;
    @Column(name = "a12")
    private Boolean a12;
    @Column(name = "a13")
    private Boolean a13;
    @Column(name = "a14")
    private Boolean a14;
    @Column(name = "a15")
    private Boolean a15;
    @Column(name = "a16")
    private Boolean a16;
    @Column(name = "a17")
    private Boolean a17;
    @Column(name = "a18")
    private Boolean a18;
    @Column(name = "a19")
    private Boolean a19;
    @Column(name = "b1")
    private Boolean b1;
    @Column(name = "b2")
    private Boolean b2;
    @Column(name = "b3")
    private Boolean b3;
    @Column(name = "b4")
    private Boolean b4;
    @Column(name = "b5")
    private Boolean b5;
    @Column(name = "b6")
    private Boolean b6;
    @Column(name = "b7")
    private Boolean b7;
    @Column(name = "b8")
    private Boolean b8;
    @Column(name = "b9")
    private Boolean b9;
    @Column(name = "b10")
    private Boolean b10;
    @Column(name = "b11")
    private Boolean b11;
    @Column(name = "b12")
    private Boolean b12;
    @Column(name = "b13")
    private Boolean b13;
    @Column(name = "b14")
    private Boolean b14;
    @Column(name = "b15")
    private Boolean b15;
    @Column(name = "b17")
    private Boolean b17;
    @Column(name = "c1")
    private Boolean c1;
    @Column(name = "c2")
    private Boolean c2;
    @Column(name = "c3")
    private Boolean c3;
    @Column(name = "c4")
    private Boolean c4;
    @Column(name = "c5")
    private Boolean c5;
    @Column(name = "c6")
    private Boolean c6;
    @Column(name = "c7")
    private Boolean c7;
    @Column(name = "d1")
    private Boolean d1;
    @Column(name = "d2")
    private Boolean d2;
    @Column(name = "d3")
    private Boolean d3;
    @Column(name = "d4")
    private Boolean d4;
    @Column(name = "d5")
    private Boolean d5;
    @Column(name = "d6")
    private Boolean d6;
    @Column(name = "d7")
    private Boolean d7;
    @Column(name = "e1")
    private Boolean e1;
    @Column(name = "e2")
    private Boolean e2;
    @Column(name = "e3")
    private Boolean e3;
    @Column(name = "e4")
    private Boolean e4;
    @Column(name = "e5")
    private Boolean e5;
    @Column(name = "e6")
    private Boolean e6;
    @Column(name = "e7")
    private Boolean e7;
    @Column(name = "e8")
    private Boolean e8;
    @Column(name = "e9")
    private Boolean e9;
    @Column(name = "e10")
    private Boolean e10;
    @Column(name = "e11")
    private Boolean e11;
    @Column(name = "e12")
    private Boolean e12;
    @Column(name = "e13")
    private Boolean e13;
    @Column(name = "e14")
    private Boolean e14;
    @Column(name = "f1")
    private Boolean f1;
    @Column(name = "f2")
    private Boolean f2;
    @Column(name = "f3")
    private Boolean f3;
    @Column(name = "f4")
    private Boolean f4;
    @Column(name = "f5")
    private Boolean f5;
    @Column(name = "f6")
    private Boolean f6;
    @Column(name = "f7")
    private Boolean f7;
    @Column(name = "f8")
    private Boolean f8;
    @Column(name = "f9")
    private Boolean f9;
    @Column(name = "f10")
    private Boolean f10;
    @Column(name = "f11")
    private Boolean f11;
    @Column(name = "f12")
    private Boolean f12;
    @Column(name = "f13")
    private Boolean f13;
    @Column(name = "f14")
    private Boolean f14;
    @Column(name = "f15")
    private Boolean f15;
    @Column(name = "f16")
    private Boolean f16;
    @Column(name = "f17")
    private Boolean f17;
    @Column(name = "f18")
    private Boolean f18;
    @Column(name = "f19")
    private Boolean f19;
    @Column(name = "f20")
    private Boolean f20;
    @Column(name = "g1")
    private Boolean g1;
    @Column(name = "g2")
    private Boolean g2;
    @Column(name = "g3")
    private Boolean g3;
    @Column(name = "g4")
    private Boolean g4;
    @Column(name = "g5")
    private Boolean g5;
    @Column(name = "g6")
    private Boolean g6;
    @Column(name = "g7")
    private Boolean g7;
    @Column(name = "g8")
    private Boolean g8;

    public TRol() {
    }

    public TRol(Integer pkRol) {
        this.pkRol = pkRol;
    }

    public Integer getPkRol() {
        return pkRol;
    }

    public void setPkRol(Integer pkRol) {
        this.pkRol = pkRol;
    }

    public String getRolAd() {
        return rolAd;
    }

    public void setRolAd(String rolAd) {
        this.rolAd = rolAd;
    }

    public Boolean getTamYetki() {
        return tamYetki;
    }

    public void setTamYetki(Boolean tamYetki) {
        this.tamYetki = tamYetki;
    }

    public Boolean getIslemler() {
        return islemler;
    }

    public void setIslemler(Boolean islemler) {
        this.islemler = islemler;
    }

    public Boolean getStokYonetim() {
        return stokYonetim;
    }

    public void setStokYonetim(Boolean stokYonetim) {
        this.stokYonetim = stokYonetim;
    }

    public Boolean getSatinAlma() {
        return satinAlma;
    }

    public void setSatinAlma(Boolean satinAlma) {
        this.satinAlma = satinAlma;
    }

    public Boolean getPersonel() {
        return personel;
    }

    public void setPersonel(Boolean personel) {
        this.personel = personel;
    }

    public Boolean getMuhasebe() {
        return muhasebe;
    }

    public void setMuhasebe(Boolean muhasebe) {
        this.muhasebe = muhasebe;
    }

    public Boolean getRaporlar() {
        return raporlar;
    }

    public void setRaporlar(Boolean raporlar) {
        this.raporlar = raporlar;
    }

    public Boolean getTanimlar() {
        return tanimlar;
    }

    public void setTanimlar(Boolean tanimlar) {
        this.tanimlar = tanimlar;
    }

    public Boolean getServis() {
        return servis;
    }

    public void setServis(Boolean servis) {
        this.servis = servis;
    }

    public Boolean getA1() {
        return a1;
    }

    public void setA1(Boolean a1) {
        this.a1 = a1;
    }

    public Boolean getA2() {
        return a2;
    }

    public void setA2(Boolean a2) {
        this.a2 = a2;
    }

    public Boolean getA3() {
        return a3;
    }

    public void setA3(Boolean a3) {
        this.a3 = a3;
    }

    public Boolean getA4() {
        return a4;
    }

    public void setA4(Boolean a4) {
        this.a4 = a4;
    }

    public Boolean getA5() {
        return a5;
    }

    public void setA5(Boolean a5) {
        this.a5 = a5;
    }

    public Boolean getA6() {
        return a6;
    }

    public void setA6(Boolean a6) {
        this.a6 = a6;
    }

    public Boolean getA7() {
        return a7;
    }

    public void setA7(Boolean a7) {
        this.a7 = a7;
    }

    public Boolean getA8() {
        return a8;
    }

    public void setA8(Boolean a8) {
        this.a8 = a8;
    }

    public Boolean getA9() {
        return a9;
    }

    public void setA9(Boolean a9) {
        this.a9 = a9;
    }

    public Boolean getA10() {
        return a10;
    }

    public void setA10(Boolean a10) {
        this.a10 = a10;
    }

    public Boolean getA11() {
        return a11;
    }

    public void setA11(Boolean a11) {
        this.a11 = a11;
    }

    public Boolean getA12() {
        return a12;
    }

    public void setA12(Boolean a12) {
        this.a12 = a12;
    }

    public Boolean getA13() {
        return a13;
    }

    public void setA13(Boolean a13) {
        this.a13 = a13;
    }

    public Boolean getA14() {
        return a14;
    }

    public void setA14(Boolean a14) {
        this.a14 = a14;
    }

    public Boolean getA15() {
        return a15;
    }

    public void setA15(Boolean a15) {
        this.a15 = a15;
    }

    public Boolean getA16() {
        return a16;
    }

    public void setA16(Boolean a16) {
        this.a16 = a16;
    }

    public Boolean getA17() {
        return a17;
    }

    public void setA17(Boolean a17) {
        this.a17 = a17;
    }

    public Boolean getA18() {
        return a18;
    }

    public void setA18(Boolean a18) {
        this.a18 = a18;
    }

    public Boolean getA19() {
        return a19;
    }

    public void setA19(Boolean a19) {
        this.a19 = a19;
    }

    public Boolean getB1() {
        return b1;
    }

    public void setB1(Boolean b1) {
        this.b1 = b1;
    }

    public Boolean getB2() {
        return b2;
    }

    public void setB2(Boolean b2) {
        this.b2 = b2;
    }

    public Boolean getB3() {
        return b3;
    }

    public void setB3(Boolean b3) {
        this.b3 = b3;
    }

    public Boolean getB4() {
        return b4;
    }

    public void setB4(Boolean b4) {
        this.b4 = b4;
    }

    public Boolean getB5() {
        return b5;
    }

    public void setB5(Boolean b5) {
        this.b5 = b5;
    }

    public Boolean getB6() {
        return b6;
    }

    public void setB6(Boolean b6) {
        this.b6 = b6;
    }

    public Boolean getB7() {
        return b7;
    }

    public void setB7(Boolean b7) {
        this.b7 = b7;
    }

    public Boolean getB8() {
        return b8;
    }

    public void setB8(Boolean b8) {
        this.b8 = b8;
    }

    public Boolean getB9() {
        return b9;
    }

    public void setB9(Boolean b9) {
        this.b9 = b9;
    }

    public Boolean getB10() {
        return b10;
    }

    public void setB10(Boolean b10) {
        this.b10 = b10;
    }

    public Boolean getB11() {
        return b11;
    }

    public void setB11(Boolean b11) {
        this.b11 = b11;
    }

    public Boolean getB12() {
        return b12;
    }

    public void setB12(Boolean b12) {
        this.b12 = b12;
    }

    public Boolean getB13() {
        return b13;
    }

    public void setB13(Boolean b13) {
        this.b13 = b13;
    }

    public Boolean getB14() {
        return b14;
    }

    public void setB14(Boolean b14) {
        this.b14 = b14;
    }

    public Boolean getB15() {
        return b15;
    }

    public void setB15(Boolean b15) {
        this.b15 = b15;
    }

    public Boolean getB17() {
        return b17;
    }

    public void setB17(Boolean b17) {
        this.b17 = b17;
    }

    public Boolean getC1() {
        return c1;
    }

    public void setC1(Boolean c1) {
        this.c1 = c1;
    }

    public Boolean getC2() {
        return c2;
    }

    public void setC2(Boolean c2) {
        this.c2 = c2;
    }

    public Boolean getC3() {
        return c3;
    }

    public void setC3(Boolean c3) {
        this.c3 = c3;
    }

    public Boolean getC4() {
        return c4;
    }

    public void setC4(Boolean c4) {
        this.c4 = c4;
    }

    public Boolean getC5() {
        return c5;
    }

    public void setC5(Boolean c5) {
        this.c5 = c5;
    }

    public Boolean getC6() {
        return c6;
    }

    public void setC6(Boolean c6) {
        this.c6 = c6;
    }

    public Boolean getC7() {
        return c7;
    }

    public void setC7(Boolean c7) {
        this.c7 = c7;
    }

    public Boolean getD1() {
        return d1;
    }

    public void setD1(Boolean d1) {
        this.d1 = d1;
    }

    public Boolean getD2() {
        return d2;
    }

    public void setD2(Boolean d2) {
        this.d2 = d2;
    }

    public Boolean getD3() {
        return d3;
    }

    public void setD3(Boolean d3) {
        this.d3 = d3;
    }

    public Boolean getD4() {
        return d4;
    }

    public void setD4(Boolean d4) {
        this.d4 = d4;
    }

    public Boolean getD5() {
        return d5;
    }

    public void setD5(Boolean d5) {
        this.d5 = d5;
    }

    public Boolean getD6() {
        return d6;
    }

    public void setD6(Boolean d6) {
        this.d6 = d6;
    }

    public Boolean getD7() {
        return d7;
    }

    public void setD7(Boolean d7) {
        this.d7 = d7;
    }

    public Boolean getE1() {
        return e1;
    }

    public void setE1(Boolean e1) {
        this.e1 = e1;
    }

    public Boolean getE2() {
        return e2;
    }

    public void setE2(Boolean e2) {
        this.e2 = e2;
    }

    public Boolean getE3() {
        return e3;
    }

    public void setE3(Boolean e3) {
        this.e3 = e3;
    }

    public Boolean getE4() {
        return e4;
    }

    public void setE4(Boolean e4) {
        this.e4 = e4;
    }

    public Boolean getE5() {
        return e5;
    }

    public void setE5(Boolean e5) {
        this.e5 = e5;
    }

    public Boolean getE6() {
        return e6;
    }

    public void setE6(Boolean e6) {
        this.e6 = e6;
    }

    public Boolean getE7() {
        return e7;
    }

    public void setE7(Boolean e7) {
        this.e7 = e7;
    }

    public Boolean getE8() {
        return e8;
    }

    public void setE8(Boolean e8) {
        this.e8 = e8;
    }

    public Boolean getE9() {
        return e9;
    }

    public void setE9(Boolean e9) {
        this.e9 = e9;
    }

    public Boolean getE10() {
        return e10;
    }

    public void setE10(Boolean e10) {
        this.e10 = e10;
    }

    public Boolean getE11() {
        return e11;
    }

    public void setE11(Boolean e11) {
        this.e11 = e11;
    }

    public Boolean getE12() {
        return e12;
    }

    public void setE12(Boolean e12) {
        this.e12 = e12;
    }

    public Boolean getE13() {
        return e13;
    }

    public void setE13(Boolean e13) {
        this.e13 = e13;
    }

    public Boolean getE14() {
        return e14;
    }

    public void setE14(Boolean e14) {
        this.e14 = e14;
    }

    public Boolean getF1() {
        return f1;
    }

    public void setF1(Boolean f1) {
        this.f1 = f1;
    }

    public Boolean getF2() {
        return f2;
    }

    public void setF2(Boolean f2) {
        this.f2 = f2;
    }

    public Boolean getF3() {
        return f3;
    }

    public void setF3(Boolean f3) {
        this.f3 = f3;
    }

    public Boolean getF4() {
        return f4;
    }

    public void setF4(Boolean f4) {
        this.f4 = f4;
    }

    public Boolean getF5() {
        return f5;
    }

    public void setF5(Boolean f5) {
        this.f5 = f5;
    }

    public Boolean getF6() {
        return f6;
    }

    public void setF6(Boolean f6) {
        this.f6 = f6;
    }

    public Boolean getF7() {
        return f7;
    }

    public void setF7(Boolean f7) {
        this.f7 = f7;
    }

    public Boolean getF8() {
        return f8;
    }

    public void setF8(Boolean f8) {
        this.f8 = f8;
    }

    public Boolean getF9() {
        return f9;
    }

    public void setF9(Boolean f9) {
        this.f9 = f9;
    }

    public Boolean getF10() {
        return f10;
    }

    public void setF10(Boolean f10) {
        this.f10 = f10;
    }

    public Boolean getF11() {
        return f11;
    }

    public void setF11(Boolean f11) {
        this.f11 = f11;
    }

    public Boolean getF12() {
        return f12;
    }

    public void setF12(Boolean f12) {
        this.f12 = f12;
    }

    public Boolean getF13() {
        return f13;
    }

    public void setF13(Boolean f13) {
        this.f13 = f13;
    }

    public Boolean getF14() {
        return f14;
    }

    public void setF14(Boolean f14) {
        this.f14 = f14;
    }

    public Boolean getF15() {
        return f15;
    }

    public void setF15(Boolean f15) {
        this.f15 = f15;
    }

    public Boolean getF16() {
        return f16;
    }

    public void setF16(Boolean f16) {
        this.f16 = f16;
    }

    public Boolean getF17() {
        return f17;
    }

    public void setF17(Boolean f17) {
        this.f17 = f17;
    }

    public Boolean getF18() {
        return f18;
    }

    public void setF18(Boolean f18) {
        this.f18 = f18;
    }

    public Boolean getF19() {
        return f19;
    }

    public void setF19(Boolean f19) {
        this.f19 = f19;
    }

    public Boolean getF20() {
        return f20;
    }

    public void setF20(Boolean f20) {
        this.f20 = f20;
    }

    public Boolean getG1() {
        return g1;
    }

    public void setG1(Boolean g1) {
        this.g1 = g1;
    }

    public Boolean getG2() {
        return g2;
    }

    public void setG2(Boolean g2) {
        this.g2 = g2;
    }

    public Boolean getG3() {
        return g3;
    }

    public void setG3(Boolean g3) {
        this.g3 = g3;
    }

    public Boolean getG4() {
        return g4;
    }

    public void setG4(Boolean g4) {
        this.g4 = g4;
    }

    public Boolean getG5() {
        return g5;
    }

    public void setG5(Boolean g5) {
        this.g5 = g5;
    }

    public Boolean getG6() {
        return g6;
    }

    public void setG6(Boolean g6) {
        this.g6 = g6;
    }

    public Boolean getG7() {
        return g7;
    }

    public void setG7(Boolean g7) {
        this.g7 = g7;
    }

    public Boolean getG8() {
        return g8;
    }

    public void setG8(Boolean g8) {
        this.g8 = g8;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkRol != null ? pkRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TRol)) {
            return false;
        }
        TRol other = (TRol) object;
        if ((this.pkRol == null && other.pkRol != null) || (this.pkRol != null && !this.pkRol.equals(other.pkRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TRol[ pkRol=" + pkRol + " ]";
    }
    
}

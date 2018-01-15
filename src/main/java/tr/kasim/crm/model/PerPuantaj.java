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
@Table(name = "PerPuantaj")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerPuantaj.findAll", query = "SELECT p FROM PerPuantaj p"),
    @NamedQuery(name = "PerPuantaj.findByPkpuantaj", query = "SELECT p FROM PerPuantaj p WHERE p.pkpuantaj = :pkpuantaj"),
    @NamedQuery(name = "PerPuantaj.findByFkpersonel", query = "SELECT p FROM PerPuantaj p WHERE p.fkpersonel = :fkpersonel"),
    @NamedQuery(name = "PerPuantaj.findByAyno", query = "SELECT p FROM PerPuantaj p WHERE p.ayno = :ayno"),
    @NamedQuery(name = "PerPuantaj.findByA1", query = "SELECT p FROM PerPuantaj p WHERE p.a1 = :a1"),
    @NamedQuery(name = "PerPuantaj.findByA2", query = "SELECT p FROM PerPuantaj p WHERE p.a2 = :a2"),
    @NamedQuery(name = "PerPuantaj.findByA3", query = "SELECT p FROM PerPuantaj p WHERE p.a3 = :a3"),
    @NamedQuery(name = "PerPuantaj.findByA4", query = "SELECT p FROM PerPuantaj p WHERE p.a4 = :a4"),
    @NamedQuery(name = "PerPuantaj.findByA5", query = "SELECT p FROM PerPuantaj p WHERE p.a5 = :a5"),
    @NamedQuery(name = "PerPuantaj.findByA6", query = "SELECT p FROM PerPuantaj p WHERE p.a6 = :a6"),
    @NamedQuery(name = "PerPuantaj.findByA7", query = "SELECT p FROM PerPuantaj p WHERE p.a7 = :a7"),
    @NamedQuery(name = "PerPuantaj.findByA8", query = "SELECT p FROM PerPuantaj p WHERE p.a8 = :a8"),
    @NamedQuery(name = "PerPuantaj.findByA9", query = "SELECT p FROM PerPuantaj p WHERE p.a9 = :a9"),
    @NamedQuery(name = "PerPuantaj.findByA10", query = "SELECT p FROM PerPuantaj p WHERE p.a10 = :a10"),
    @NamedQuery(name = "PerPuantaj.findByA11", query = "SELECT p FROM PerPuantaj p WHERE p.a11 = :a11"),
    @NamedQuery(name = "PerPuantaj.findByA12", query = "SELECT p FROM PerPuantaj p WHERE p.a12 = :a12"),
    @NamedQuery(name = "PerPuantaj.findByA13", query = "SELECT p FROM PerPuantaj p WHERE p.a13 = :a13"),
    @NamedQuery(name = "PerPuantaj.findByA14", query = "SELECT p FROM PerPuantaj p WHERE p.a14 = :a14"),
    @NamedQuery(name = "PerPuantaj.findByA15", query = "SELECT p FROM PerPuantaj p WHERE p.a15 = :a15"),
    @NamedQuery(name = "PerPuantaj.findByA16", query = "SELECT p FROM PerPuantaj p WHERE p.a16 = :a16"),
    @NamedQuery(name = "PerPuantaj.findByA17", query = "SELECT p FROM PerPuantaj p WHERE p.a17 = :a17"),
    @NamedQuery(name = "PerPuantaj.findByA18", query = "SELECT p FROM PerPuantaj p WHERE p.a18 = :a18"),
    @NamedQuery(name = "PerPuantaj.findByA19", query = "SELECT p FROM PerPuantaj p WHERE p.a19 = :a19"),
    @NamedQuery(name = "PerPuantaj.findByA20", query = "SELECT p FROM PerPuantaj p WHERE p.a20 = :a20"),
    @NamedQuery(name = "PerPuantaj.findByA21", query = "SELECT p FROM PerPuantaj p WHERE p.a21 = :a21"),
    @NamedQuery(name = "PerPuantaj.findByA22", query = "SELECT p FROM PerPuantaj p WHERE p.a22 = :a22"),
    @NamedQuery(name = "PerPuantaj.findByA23", query = "SELECT p FROM PerPuantaj p WHERE p.a23 = :a23"),
    @NamedQuery(name = "PerPuantaj.findByA24", query = "SELECT p FROM PerPuantaj p WHERE p.a24 = :a24"),
    @NamedQuery(name = "PerPuantaj.findByA25", query = "SELECT p FROM PerPuantaj p WHERE p.a25 = :a25"),
    @NamedQuery(name = "PerPuantaj.findByA26", query = "SELECT p FROM PerPuantaj p WHERE p.a26 = :a26"),
    @NamedQuery(name = "PerPuantaj.findByA27", query = "SELECT p FROM PerPuantaj p WHERE p.a27 = :a27"),
    @NamedQuery(name = "PerPuantaj.findByA28", query = "SELECT p FROM PerPuantaj p WHERE p.a28 = :a28"),
    @NamedQuery(name = "PerPuantaj.findByA29", query = "SELECT p FROM PerPuantaj p WHERE p.a29 = :a29"),
    @NamedQuery(name = "PerPuantaj.findByA30", query = "SELECT p FROM PerPuantaj p WHERE p.a30 = :a30"),
    @NamedQuery(name = "PerPuantaj.findByA31", query = "SELECT p FROM PerPuantaj p WHERE p.a31 = :a31")})
public class PerPuantaj implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkpuantaj")
    private Integer pkpuantaj;
    @Column(name = "fkpersonel")
    private Integer fkpersonel;
    @Column(name = "ayno")
    private Integer ayno;
    @Size(max = 1)
    @Column(name = "a1")
    private String a1;
    @Size(max = 1)
    @Column(name = "a2")
    private String a2;
    @Size(max = 1)
    @Column(name = "a3")
    private String a3;
    @Size(max = 1)
    @Column(name = "a4")
    private String a4;
    @Size(max = 1)
    @Column(name = "a5")
    private String a5;
    @Size(max = 1)
    @Column(name = "a6")
    private String a6;
    @Size(max = 1)
    @Column(name = "a7")
    private String a7;
    @Size(max = 1)
    @Column(name = "a8")
    private String a8;
    @Size(max = 1)
    @Column(name = "a9")
    private String a9;
    @Size(max = 1)
    @Column(name = "a10")
    private String a10;
    @Size(max = 1)
    @Column(name = "a11")
    private String a11;
    @Size(max = 1)
    @Column(name = "a12")
    private String a12;
    @Size(max = 1)
    @Column(name = "a13")
    private String a13;
    @Size(max = 1)
    @Column(name = "a14")
    private String a14;
    @Size(max = 1)
    @Column(name = "a15")
    private String a15;
    @Size(max = 1)
    @Column(name = "a16")
    private String a16;
    @Size(max = 1)
    @Column(name = "a17")
    private String a17;
    @Size(max = 1)
    @Column(name = "a18")
    private String a18;
    @Size(max = 1)
    @Column(name = "a19")
    private String a19;
    @Size(max = 1)
    @Column(name = "a20")
    private String a20;
    @Size(max = 1)
    @Column(name = "a21")
    private String a21;
    @Size(max = 1)
    @Column(name = "a22")
    private String a22;
    @Size(max = 1)
    @Column(name = "a23")
    private String a23;
    @Size(max = 1)
    @Column(name = "a24")
    private String a24;
    @Size(max = 1)
    @Column(name = "a25")
    private String a25;
    @Size(max = 1)
    @Column(name = "a26")
    private String a26;
    @Size(max = 1)
    @Column(name = "a27")
    private String a27;
    @Size(max = 1)
    @Column(name = "a28")
    private String a28;
    @Size(max = 1)
    @Column(name = "a29")
    private String a29;
    @Size(max = 1)
    @Column(name = "a30")
    private String a30;
    @Size(max = 1)
    @Column(name = "a31")
    private String a31;

    public PerPuantaj() {
    }

    public PerPuantaj(Integer pkpuantaj) {
        this.pkpuantaj = pkpuantaj;
    }

    public Integer getPkpuantaj() {
        return pkpuantaj;
    }

    public void setPkpuantaj(Integer pkpuantaj) {
        this.pkpuantaj = pkpuantaj;
    }

    public Integer getFkpersonel() {
        return fkpersonel;
    }

    public void setFkpersonel(Integer fkpersonel) {
        this.fkpersonel = fkpersonel;
    }

    public Integer getAyno() {
        return ayno;
    }

    public void setAyno(Integer ayno) {
        this.ayno = ayno;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public String getA7() {
        return a7;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public String getA8() {
        return a8;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public String getA9() {
        return a9;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public String getA12() {
        return a12;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }

    public String getA13() {
        return a13;
    }

    public void setA13(String a13) {
        this.a13 = a13;
    }

    public String getA14() {
        return a14;
    }

    public void setA14(String a14) {
        this.a14 = a14;
    }

    public String getA15() {
        return a15;
    }

    public void setA15(String a15) {
        this.a15 = a15;
    }

    public String getA16() {
        return a16;
    }

    public void setA16(String a16) {
        this.a16 = a16;
    }

    public String getA17() {
        return a17;
    }

    public void setA17(String a17) {
        this.a17 = a17;
    }

    public String getA18() {
        return a18;
    }

    public void setA18(String a18) {
        this.a18 = a18;
    }

    public String getA19() {
        return a19;
    }

    public void setA19(String a19) {
        this.a19 = a19;
    }

    public String getA20() {
        return a20;
    }

    public void setA20(String a20) {
        this.a20 = a20;
    }

    public String getA21() {
        return a21;
    }

    public void setA21(String a21) {
        this.a21 = a21;
    }

    public String getA22() {
        return a22;
    }

    public void setA22(String a22) {
        this.a22 = a22;
    }

    public String getA23() {
        return a23;
    }

    public void setA23(String a23) {
        this.a23 = a23;
    }

    public String getA24() {
        return a24;
    }

    public void setA24(String a24) {
        this.a24 = a24;
    }

    public String getA25() {
        return a25;
    }

    public void setA25(String a25) {
        this.a25 = a25;
    }

    public String getA26() {
        return a26;
    }

    public void setA26(String a26) {
        this.a26 = a26;
    }

    public String getA27() {
        return a27;
    }

    public void setA27(String a27) {
        this.a27 = a27;
    }

    public String getA28() {
        return a28;
    }

    public void setA28(String a28) {
        this.a28 = a28;
    }

    public String getA29() {
        return a29;
    }

    public void setA29(String a29) {
        this.a29 = a29;
    }

    public String getA30() {
        return a30;
    }

    public void setA30(String a30) {
        this.a30 = a30;
    }

    public String getA31() {
        return a31;
    }

    public void setA31(String a31) {
        this.a31 = a31;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkpuantaj != null ? pkpuantaj.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerPuantaj)) {
            return false;
        }
        PerPuantaj other = (PerPuantaj) object;
        if ((this.pkpuantaj == null && other.pkpuantaj != null) || (this.pkpuantaj != null && !this.pkpuantaj.equals(other.pkpuantaj))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PerPuantaj[ pkpuantaj=" + pkpuantaj + " ]";
    }
    
}

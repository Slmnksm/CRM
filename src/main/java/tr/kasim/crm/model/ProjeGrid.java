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
@Table(name = "ProjeGrid")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjeGrid.findAll", query = "SELECT p FROM ProjeGrid p"),
    @NamedQuery(name = "ProjeGrid.findByPkProjeGrid", query = "SELECT p FROM ProjeGrid p WHERE p.pkProjeGrid = :pkProjeGrid"),
    @NamedQuery(name = "ProjeGrid.findByFkProje", query = "SELECT p FROM ProjeGrid p WHERE p.fkProje = :fkProje"),
    @NamedQuery(name = "ProjeGrid.findByUrunGrubu", query = "SELECT p FROM ProjeGrid p WHERE p.urunGrubu = :urunGrubu"),
    @NamedQuery(name = "ProjeGrid.findByBaslangic", query = "SELECT p FROM ProjeGrid p WHERE p.baslangic = :baslangic"),
    @NamedQuery(name = "ProjeGrid.findByButce", query = "SELECT p FROM ProjeGrid p WHERE p.butce = :butce"),
    @NamedQuery(name = "ProjeGrid.findByMetraj", query = "SELECT p FROM ProjeGrid p WHERE p.metraj = :metraj"),
    @NamedQuery(name = "ProjeGrid.findByParaBirimi", query = "SELECT p FROM ProjeGrid p WHERE p.paraBirimi = :paraBirimi"),
    @NamedQuery(name = "ProjeGrid.findByFirsat", query = "SELECT p FROM ProjeGrid p WHERE p.firsat = :firsat"),
    @NamedQuery(name = "ProjeGrid.findByYil", query = "SELECT p FROM ProjeGrid p WHERE p.yil = :yil")})
public class ProjeGrid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkProjeGrid")
    private Integer pkProjeGrid;
    @Column(name = "fkProje")
    private Integer fkProje;
    @Column(name = "UrunGrubu")
    private Integer urunGrubu;
    @Size(max = 50)
    @Column(name = "Baslangic")
    private String baslangic;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Butce")
    private BigDecimal butce;
    @Column(name = "Metraj")
    private BigDecimal metraj;
    @Column(name = "ParaBirimi")
    private Integer paraBirimi;
    @Column(name = "Firsat")
    private Boolean firsat;
    @Column(name = "Yil")
    private Integer yil;

    public ProjeGrid() {
    }

    public ProjeGrid(Integer pkProjeGrid) {
        this.pkProjeGrid = pkProjeGrid;
    }

    public Integer getPkProjeGrid() {
        return pkProjeGrid;
    }

    public void setPkProjeGrid(Integer pkProjeGrid) {
        this.pkProjeGrid = pkProjeGrid;
    }

    public Integer getFkProje() {
        return fkProje;
    }

    public void setFkProje(Integer fkProje) {
        this.fkProje = fkProje;
    }

    public Integer getUrunGrubu() {
        return urunGrubu;
    }

    public void setUrunGrubu(Integer urunGrubu) {
        this.urunGrubu = urunGrubu;
    }

    public String getBaslangic() {
        return baslangic;
    }

    public void setBaslangic(String baslangic) {
        this.baslangic = baslangic;
    }

    public BigDecimal getButce() {
        return butce;
    }

    public void setButce(BigDecimal butce) {
        this.butce = butce;
    }

    public BigDecimal getMetraj() {
        return metraj;
    }

    public void setMetraj(BigDecimal metraj) {
        this.metraj = metraj;
    }

    public Integer getParaBirimi() {
        return paraBirimi;
    }

    public void setParaBirimi(Integer paraBirimi) {
        this.paraBirimi = paraBirimi;
    }

    public Boolean getFirsat() {
        return firsat;
    }

    public void setFirsat(Boolean firsat) {
        this.firsat = firsat;
    }

    public Integer getYil() {
        return yil;
    }

    public void setYil(Integer yil) {
        this.yil = yil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkProjeGrid != null ? pkProjeGrid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjeGrid)) {
            return false;
        }
        ProjeGrid other = (ProjeGrid) object;
        if ((this.pkProjeGrid == null && other.pkProjeGrid != null) || (this.pkProjeGrid != null && !this.pkProjeGrid.equals(other.pkProjeGrid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.ProjeGrid[ pkProjeGrid=" + pkProjeGrid + " ]";
    }
    
}

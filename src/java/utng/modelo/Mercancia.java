/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Husky Siberiano
 */
@Entity
@Table(name = "mercancia")
public class Mercancia implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mercancia")
    private Long idMercancia;
    @Column (name = "nombre", length = 100)
    private String nombre;
    @Column(name = "cantidad", length = 10)
    private int cantidad;
    @Column (name = "precio", length = 10)
    private int precio;
    @ManyToOne//(cascade = CascadeType.REMOVE)
    @JoinColumn(name="id_catalogo")
    private Catalogo catalogo;

    public Mercancia(Long idMercancia, String nombre, int cantidad, int precio,Catalogo catalogo) {
        this.idMercancia = idMercancia;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.catalogo=catalogo;
    }
    
    public Mercancia(){
            this.idMercancia=0L;
    }

    public Long getIdMercancia() {
        return idMercancia;
    }

    public void setIdMercancia(Long idMercancia) {
        this.idMercancia = idMercancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    
    
    
}

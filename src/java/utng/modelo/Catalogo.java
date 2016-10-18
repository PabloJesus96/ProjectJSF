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
import javax.persistence.Table;

/**
 *
 * @author Husky Siberiano
 */
@Entity
@Table(name="catalogo")
public class Catalogo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalogo")
    private Long idCatalogo;
    @Column (name = "nombre",length = 100)
    private String nombre;
    @Column (name = "descripcion", length = 200)
    private String descripcion;
    @Column (name = "serie", length = 5)
    private int serie;
    

//    public Catalogo(Long idCatalogo, String nombre, String descripcion, int serie) {
//        this.idCatalogo = idCatalogo;
//        this.nombre = nombre;
//        this.descripcion = descripcion;
//        this.serie = serie;
//    }
    
    public Catalogo(){
        this.idCatalogo=0L;
    }

    public Long getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Long idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    
}

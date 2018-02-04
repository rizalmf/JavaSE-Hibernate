/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ngarambes.data.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author ngarambes
 */
@Entity
@Table(name = "asisten")
public class Asisten implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_asisten")
    @SequenceGenerator(name = "seq_asisten", sequenceName = "asisten_id_seq", allocationSize = 1)
    private long id;
    
    @Column(name = "nama", nullable = false, length = 100)
    private String nama;
    
    @Column(name = "nim", nullable = false, length = 20, unique = true)
    private String nim;
    
    @Column(name = "angkatan", nullable = false, length = 4)
    private int angkatan;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the angkatan
     */
    public int getAngkatan() {
        return angkatan;
    }

    /**
     * @param angkatan the angkatan to set
     */
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
    
    
    
}

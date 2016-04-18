/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@Entity
@SequenceGenerator(name="ITEM_SEQ" , sequenceName="ITEM_SEQ", initialValue = 1 , allocationSize = 1)
public class Item implements Serializable,EntidadeBase {
    private static final long serialVersionUID = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "ITEM_SEQ")
    private Long id;
    
    @Column(name = "ITENS_DISP",nullable=false)
    private Long itensDisp;
    
    
    @JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Pedido pedido;
    
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
    @ManyToOne
    private Produto produto;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItensDisp() {
        return itensDisp;
    }

    public void setItensDisp(Long itensDisp) {
        this.itensDisp = itensDisp;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    
    
}

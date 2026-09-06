package tiopaulo.ufape.barsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;

import tiopaulo.ufape.barsystem.interfaces.Calculavel;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido implements Calculavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cliente cliente;
    @OneToMany
    private List<ItemPedido> itens;
    private String status;


    public Pedido() {
        itens = new ArrayList<>();
    }


    public Pedido(Long id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = "ABERTO";
    }


    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }


    @Override
    public double calcularTotal() {

        double total = 0;

        for(ItemPedido item : itens){
            total += item.calcularSubtotal();
        }

        return total;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public List<ItemPedido> getItens() {
        return itens;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }
}
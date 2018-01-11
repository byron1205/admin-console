/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.web;

import com.gestor.bots.admin.console.model.Cliente;
import com.gestor.bots.admin.console.servicio.ClienteService;
import com.gestor.bots.admin.console.servicio.SocialMediaService;
import com.gestor.bots.admin.console.web.common.BaseBean;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.commons.beanutils.BeanUtils;

/**
 *
 * @author Edward
 */
@Named
@ViewScoped
public class ClienteBean extends BaseBean implements Serializable  {
    @Inject
    private ClienteService clienteService;

    private List<Cliente> clienteList;

    private Cliente cliente;
    private Cliente clienteSel;
    
    @PostConstruct
    public void init() {
        this.clienteList = this.clienteService.obtenerTodos();
    }

    @Override
    public void nuevo() {
        super.nuevo();
        this.cliente = new Cliente();
    }

    @Override
    public void modificar() {
        super.modificar();
        this.cliente = new Cliente();
        try {
            BeanUtils.copyProperties(this.cliente, this.clienteSel);
        } catch (Exception ex) {

        }
    }

    @Override
    public void consultar() {
        super.consultar();
        this.cliente = this.clienteSel;
    }

  

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getClienteSel() {
        return clienteSel;
    }

    public void setClienteSel(Cliente clienteSel) {
        this.clienteSel = clienteSel;
    }
    
    
}

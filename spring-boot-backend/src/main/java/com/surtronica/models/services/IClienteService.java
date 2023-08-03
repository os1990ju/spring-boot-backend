package com.surtronica.models.services;

import com.surtronica.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}

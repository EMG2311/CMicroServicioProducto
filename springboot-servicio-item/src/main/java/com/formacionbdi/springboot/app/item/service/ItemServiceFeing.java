package com.formacionbdi.springboot.app.item.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.item.clientes.ProductoClienteRest;
import com.formacionbdi.springboot.app.item.models.Item;
@Service
@Primary
public class ItemServiceFeing implements ItemService{
	@Autowired
	private ProductoClienteRest clienteFeing;

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return clienteFeing.listar().stream().map(p->new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		// TODO Auto-generated method stub
		return new Item(clienteFeing.detalle(id),cantidad);
	}

}

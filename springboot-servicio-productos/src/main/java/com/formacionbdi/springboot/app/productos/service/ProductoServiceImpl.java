package com.formacionbdi.springboot.app.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.productos.dao.ProductoDao;
import com.formacionbdi.springboot.app.productos.models.entity.Producto;
@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private ProductoDao productoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		List<Producto> productos=(List<Producto>)productoDao.findAll();
		return productos; 
	}

	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

}

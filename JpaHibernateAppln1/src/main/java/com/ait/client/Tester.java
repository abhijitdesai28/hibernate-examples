package com.ait.client;

import com.ait.dao.impl.ProductDAOImpl;
import com.ait.entity.ProductEntity;
import com.ait.dao.ProductDAO;

public class Tester {

	public static void main(String[] args) {
	//	ProductDAO  dao = new ProductDAOImpl();
		ProductDAO dao = new ProductDAOImpl();
		/*
		 * create a new product entity
		 */
		/*ProductEntity pEntity = new ProductEntity();
		pEntity.setProductId(129013);
		pEntity.setProductName("LAPTOP");
		pEntity.setQuantity(8);
		pEntity.setUnitPrice(88000.0);
		/*
		 * call saveProduct() of DAO class
		 */
		//dao.saveProduct(pEntity);
		
		/*
		 * call updateProductById() of DAO class
		 */
		/*ProductEntity updateProduct= dao.updateProductById(129011, 56000.0);
		System.out.println(updateProduct);*/
		
		/*
		 * call deleteProductById() of DAO class
		 */
		dao.deleteProductById(129011);
	}

}

package com.ait.otm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import com.ait.otm.dao.CategoryDAO;
import com.ait.otm.dao.impl.CategoryDAOImpl;
import com.ait.otm.entities.CategoryEntity;
import com.ait.otm.entities.ProductEntity;

public class Tester {

	public static void main(String[] args) throws Exception {
		CategoryDAO dao = new CategoryDAOImpl();
		/*
		 * call saveCategory() method
		 */

		// create CategoryEntity instance
		/*
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCategoryId(123456);
		categoryEntity.setCategoryName("ELECTRONICS");

		// create ProductEntity instance-1
		ProductEntity productEntity1 = new ProductEntity();
		productEntity1.setProductId(789546);
		productEntity1.setProductName("Mobile");

		File file1 = new File("D:\\images\\mobile1.jfif");
		byte[] imageBytes = new byte[(int) file1.length()];

		FileInputStream fis = new FileInputStream(file1);
		fis.read(imageBytes);
		productEntity1.setProductImage(imageBytes);

		// create ProductEntity instance-2
		ProductEntity productEntity2 = new ProductEntity();
		productEntity2.setProductId(6662);
		productEntity2.setProductName("TV");

		File file2 = new File("D:\\images\\tv1.jfif");
		byte[] imageBytes_tv = new byte[(int) file2.length()];

		FileInputStream fis2 = new FileInputStream(file2);
		fis2.read(imageBytes_tv);
		productEntity2.setProductImage(imageBytes_tv);

		// create ProductEntity instance-3
		ProductEntity productEntity3 = new ProductEntity();
		productEntity3.setProductId(3698);
		productEntity3.setProductName("microOwave");

		File file3 = new File("D:\\images\\mowave.jfif");
		byte[] imageBytes_mowave= new byte[(int) file3.length()];

		FileInputStream fis3 = new FileInputStream(file3);
		fis3.read(imageBytes_mowave);
		productEntity3.setProductImage(imageBytes_mowave);
		
		//add ProductEntity instances to Collection.
		List<ProductEntity> listOfProduct = Arrays.asList(productEntity1, productEntity2, productEntity3);
		//set the collection to CategoryEntity instance
		categoryEntity.setListOfProducts(listOfProduct);
		
		dao.saveCategory(categoryEntity);
		*/
		
		/*
		 * Call fetchCategory();
		 */
		
		/*
		CategoryEntity cEntity= dao.fetchCategory(123456);
		System.out.println("Category Name : "+cEntity.getCategoryName());//Category Name : ELECTRONICS
		List<ProductEntity> lst = cEntity.getListOfProducts();
		//read the first element of the list
		ProductEntity pEntity = lst.get(0);
		System.out.println("product id : " +pEntity.getProductId());//product id : 3698
		System.out.println("product name: " +pEntity.getProductName());//product name: microOwave
		byte[] bytesOfImage = pEntity.getProductImage();
		File file = new File("D:\\ImageFromDb\\mobile_img_fromDb.jfif");
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(bytesOfImage);
		System.out.println("Please check the image at : "+file.getAbsolutePath());//Please check the image at : D:\ImageFromDb\mobile_img_fromDb.jfif
        */

		/* 
		 * Call removeCategory()
		 */
		dao.removeCategory(123456);
	}
}

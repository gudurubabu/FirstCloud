/**
 * 
 */
package hello.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dguduru
 *
 */
public class ProductsVO {
	List<ProductVO> products;

	public List<ProductVO> getProducts() {
		if(null == products)
			new ArrayList<>();
		return products;
	}

	public void setProducts(List<ProductVO> products) {
		this.products = products;
	}
	
	

}

/**
 * 
 */
package hello.util;

import java.util.ArrayList;
import java.util.List;

import hello.vo.ProductVO;
import hello.vo.ProductsVO;

/**
 * @author dguduru
 *
 */
public class ApiUtil {
	static List<ProductVO> products =new ArrayList<>();
	
	static {
		products = createProducts(5);
	}

	public static ProductVO getproductFromList(String id) {
		ProductVO  product=null;
		if(id != null && !id.equals("000")) {
			product=getNamedProductFromList(id);
		}else {
			product=getDefaultProduct(); 
		}
		return product==null ?getDefaultProduct(): product;
	}

	/**
	 * Initializing the list
	 * 
	 * @param size
	 * @return
	 */
	private static List<ProductVO> createProducts(int size) {
		List<ProductVO> resultVo=new ArrayList<>();
		for(int i=0;i<size;i++) {
			ProductVO vo=new ProductVO("00"+i,"prod "+i,"product "," Good ");
			resultVo.add(vo);
		}
		return resultVo;
	}

	/**
	 * Getting from the list
	 * 
	 * @param id
	 * @return
	 */
	private static ProductVO getNamedProductFromList(String id) {
		for (ProductVO productVO : products) {
			if(productVO.getPid().equalsIgnoreCase(id)) {
				return productVO;
			}
		}
		return null;
	}

	/**
	 * Default Product Setting
	 * 
	 * @return
	 */
	private static ProductVO getDefaultProduct() {
		
		return new ProductVO("001","prod 1","product "," Good ");
	}

	/**
	 * Getting all the products
	 */
	public static ProductsVO getproductList() {
		ProductsVO allProducts = new ProductsVO();
		allProducts.setProducts(products);
		return allProducts;
	}

}

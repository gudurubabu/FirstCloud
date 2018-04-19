/**
 * 
 */
package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.util.ApiUtil;
import hello.vo.ProductVO;
import hello.vo.ProductsVO;

/**
 * @author dguduru
 *
 */
@RestController
public class MyAPI {

	@RequestMapping("/getProduct")
	public ProductVO getProduct(@RequestParam(value = "id", required = false, defaultValue = "000") String id) {
		return ApiUtil.getproductFromList(id);
	}
	@RequestMapping("/getProducts")
	public ProductsVO getProducts() {
		return ApiUtil.getproductList();
	}

}

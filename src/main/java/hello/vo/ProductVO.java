/**
 * 
 */
package hello.vo;

/**
 * @author dguduru
 *
 */
public class ProductVO {

	private String pname;
	private String amount;
	private String desc;
	private String pid;

	public ProductVO(String pid, String pname, String amount, String desc) {
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
		this.desc = desc;
	}

	public String getPname() {
		return pname;
	}

	public String getAmount() {
		return amount;
	}

	public String getDesc() {
		return desc;
	}

	public String getPid() {
		return pid;
	}

}

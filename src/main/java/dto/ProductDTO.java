package dto;
/**
 * 产品数据
 * @author aisino
 *
 */
public class ProductDTO {

	private Integer id;
	private String productName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

package cn.com.entity;


/**
 * 
 * @author guofeng
 * @see ����
 */
public class XY {
	private final double x, y;

	/**
	 * ��������ϵ
	 * 
	 * @param x
	 * @param y
	 */
	public XY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Returns a copy of the current {@link Address} instance which is a new
	 * entity in terms of persistence.
	 * mongo 会映射多个
	 * @return
	 */
/*	@Transient
	public XY getCopy() {
		return new XY(this.x, this.y);
	}*/

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}

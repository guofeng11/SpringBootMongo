package cn.com.entity;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;

/**
 * Base class for document classes.
 * @see ����mongo id ������id�ж��ĵ��Ƿ���ͬ 
 * @author Guo feng
 */
public abstract class AbstractDocument {
	
	@Id
	private BigInteger id;

	/**
	 * Returns the identifier of the document.
	 * 
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}
	/* 
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/* 
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractDocument other = (AbstractDocument) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}

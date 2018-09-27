package zhrk.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseQxRela<M extends BaseQxRela<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("ID", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("ID");
	}

	public M setName(java.lang.String name) {
		set("NAME", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("NAME");
	}

	public M setRemark(java.lang.String remark) {
		set("REMARK", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("REMARK");
	}

}

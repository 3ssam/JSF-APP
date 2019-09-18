package mo.essam.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ScopeTesting {
	private int value = 0;

	public String increment() {
		value++;
		return "Counter";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ScopeTesting() {
		super();
	}
	
	

}

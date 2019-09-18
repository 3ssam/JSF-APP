package mo.essam.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourismeBean {
	private String typeOfTourisme;

	public String getTypeOfTourisme() {
		return typeOfTourisme;
	}

	public void setTypeOfTourisme(String typeOfTourisme) {
		this.typeOfTourisme = typeOfTourisme;
	}

	public TourismeBean() {
		super();
	}

	public String startTheTour() {
		
		if (typeOfTourisme != null && typeOfTourisme.equals("city"))
			return "city_tour";
		else if (typeOfTourisme.equals("country"))
			return "country_tour";
		else
			return "tour_form";

	}

}
package aj.search.engine.model;


import org.springframework.data.annotation.Id;

public class AgeGroup {
	
	
	private Integer gte;
	private Integer lte;
	
	
	public Integer getGte() {
		return gte;
	}
	public void setGte(Integer gte) {
		this.gte = gte;
	}
	public Integer getLte() {
		return lte;
	}
	public void setLte(Integer lte) {
		this.lte = lte;
	}
	
	
	
}

package dos.search.engine.model;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

public class Exclude {
	private Integer excludeId;
	
	@Field(type= FieldType.Nested)
	private List<String> nationality;
	
	public Integer getExcludeId() {
		return excludeId;
	}
	public void setExcludeId(Integer excludeId) {
		this.excludeId = excludeId;
	}
	public List<String> getNationality() {
		return nationality;
	}
	public void setNationality(List<String> nationality) {
		this.nationality = nationality;
	}
}

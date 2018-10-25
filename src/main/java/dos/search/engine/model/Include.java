package dos.search.engine.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

;

public class Include {

	@Id
	private Integer includeId;
	@Field(type= FieldType.Nested)
	private List<AgeGroup> age;
	public Integer getIncludeId() {
		return includeId;
	}
	public void setIncludeId(Integer includeId) {
		this.includeId = includeId;
	}
	public List<AgeGroup> getAge() {
		return age;
	}
	public void setAge(List<AgeGroup> age) {
		this.age = age;
	}
	
}

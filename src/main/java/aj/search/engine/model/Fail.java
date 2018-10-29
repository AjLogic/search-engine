package aj.search.engine.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

public class Fail {
	
	@Id
	private String exclusionId;
	
	@Field(type= FieldType.Nested,includeInParent=true)
	private List<String> ethnicity;
	
	
	
	private List<StudentBatch> ageGroup;
	
	
	private List<String> disability;
	
	
	private List<String> gender;
	
	
	private List<String> genderReassignments;
	
	private String marriage;

	public String getExclusionId() {
		return exclusionId;
	}

	public void setExclusionId(String exclusionId) {
		this.exclusionId = exclusionId;
	}

	public List<String> getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(List<String> ethnicity) {
		this.ethnicity = ethnicity;
	}

	public List<StudentBatch> getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(List<StudentBatch> ageGroup) {
		this.ageGroup = ageGroup;
	}

	public List<String> getDisability() {
		return disability;
	}

	public void setDisability(List<String> disability) {
		this.disability = disability;
	}

	public List<String> getGender() {
		return gender;
	}

	public void setGender(List<String> gender) {
		this.gender = gender;
	}

	public List<String> getGenderReassignments() {
		return genderReassignments;
	}

	public void setGenderReassignments(List<String> genderReassignments) {
		this.genderReassignments = genderReassignments;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	
	
	
	
}

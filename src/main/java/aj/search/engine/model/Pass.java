package aj.search.engine.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;



public class Pass {

	@Id
	private String inclusionId;
	
	
	@Field(type= FieldType.Nested,store=true)
	private List<StudentBatch> ageGroup;
	
	
	private List<String> disability;
	
	@Field(type= FieldType.Nested)
	private List<String> gender;
	
	
	private List<String> genderReassignments;
	
	
	private List<String> religion;
	
	
	private List<String> sexualOrientation;
	
	
	private List<String> ethnicity;
	
	private String marriage;

	public String getInclusionId() {
		return inclusionId;
	}

	public void setInclusionId(String inclusionId) {
		this.inclusionId = inclusionId;
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

	public List<String> getReligion() {
		return religion;
	}

	public void setReligion(List<String> religion) {
		this.religion = religion;
	}

	public List<String> getSexualOrientation() {
		return sexualOrientation;
	}

	public void setSexualOrientation(List<String> sexualOrientation) {
		this.sexualOrientation = sexualOrientation;
	}

	public List<String> getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(List<String> ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	
	
	
}

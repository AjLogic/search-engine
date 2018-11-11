package aj.search.engine.model;

import java.util.List;

import org.springframework.context.annotation.FilterType;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Mapping;

@Document(indexName = "activity", type = "activity")
@Mapping(mappingPath = "./dos-mapping/activity_mapping.json")
public class Activity {

	@Id
	private String activityId;

	private Inclusion inclusion;

	private Exclusion exclusion;

	private String crcProviderId;

	private List<String> flexTeamAssociation;

	private String description;
	private String plannedOutcomes;

	private Long crc;

	private String primaryPathway;

	private String secondaryPathway;

	private String provisionEmailAddress;
	

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Inclusion getInclusion() {
		return inclusion;
	}

	public void setInclusion(Inclusion inclusion) {
		this.inclusion = inclusion;
	}

	public Exclusion getExclusion() {
		return exclusion;
	}

	public void setExclusion(Exclusion exclusion) {
		this.exclusion = exclusion;
	}

	public String getCrcProviderId() {
		return crcProviderId;
	}

	public void setCrcProviderId(String crcProviderId) {
		this.crcProviderId = crcProviderId;
	}

	public List<String> getFlexTeamAssociation() {
		return flexTeamAssociation;
	}

	public void setFlexTeamAssociation(List<String> flexTeamAssociation) {
		this.flexTeamAssociation = flexTeamAssociation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlannedOutcomes() {
		return plannedOutcomes;
	}

	public void setPlannedOutcomes(String plannedOutcomes) {
		this.plannedOutcomes = plannedOutcomes;
	}

	public Long getCrc() {
		return crc;
	}

	public void setCrc(Long crc) {
		this.crc = crc;
	}

	public String getPrimaryPathway() {
		return primaryPathway;
	}

	public void setPrimaryPathway(String primaryPathway) {
		this.primaryPathway = primaryPathway;
	}

	public String getSecondaryPathway() {
		return secondaryPathway;
	}

	public void setSecondaryPathway(String secondaryPathway) {
		this.secondaryPathway = secondaryPathway;
	}

	public String getProvisionEmailAddress() {
		return provisionEmailAddress;
	}

	public void setProvisionEmailAddress(String provisionEmailAddress) {
		this.provisionEmailAddress = provisionEmailAddress;
	}

}

package aj.search.engine.model;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Parent;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "activity", type = "activity")
public class Task {

	@Id
	private String activityId;

	@Field(type= FieldType.Nested)
	private Pass inclusion;

	@Field(type= FieldType.Nested)
	private Fail exclusion;

	private String crcProviderId;

	private List<String> flexTeamAssociation;

	private String description;
	private String plannedOutcomes;

	private Long crc;

	private String primaryPathway;

	private String secondaryPathway;

	private Long associatedNsi;

	private Long associatedReferral;

	private Long serviceFeeStatus;

	private BigDecimal serviceFeeCost;

	private Long locationAvailabilityType;

	private Long serviceStatus;

	private String mapLink;

	private String provisionAddressLine2;

	private String provisionAddressLine3;

	private String provisionPostCode;

	private String provisionPhoneNumber;

	private String provisionEmailAddress;

	private Long deliveryTypeMethod;

	private Long buildingAccesibilityConsideration;

	private Long minSessions;

	private Long maxSessions;

	private Long helplineFlag;

	private Long referralMethod;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Pass getInclusion() {
		return inclusion;
	}

	public void setInclusion(Pass inclusion) {
		this.inclusion = inclusion;
	}

	public Fail getExclusion() {
		return exclusion;
	}

	public void setExclusion(Fail exclusion) {
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

	public Long getAssociatedNsi() {
		return associatedNsi;
	}

	public void setAssociatedNsi(Long associatedNsi) {
		this.associatedNsi = associatedNsi;
	}

	public Long getAssociatedReferral() {
		return associatedReferral;
	}

	public void setAssociatedReferral(Long associatedReferral) {
		this.associatedReferral = associatedReferral;
	}

	public Long getServiceFeeStatus() {
		return serviceFeeStatus;
	}

	public void setServiceFeeStatus(Long serviceFeeStatus) {
		this.serviceFeeStatus = serviceFeeStatus;
	}

	public BigDecimal getServiceFeeCost() {
		return serviceFeeCost;
	}

	public void setServiceFeeCost(BigDecimal serviceFeeCost) {
		this.serviceFeeCost = serviceFeeCost;
	}

	public Long getLocationAvailabilityType() {
		return locationAvailabilityType;
	}

	public void setLocationAvailabilityType(Long locationAvailabilityType) {
		this.locationAvailabilityType = locationAvailabilityType;
	}

	public Long getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(Long serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getMapLink() {
		return mapLink;
	}

	public void setMapLink(String mapLink) {
		this.mapLink = mapLink;
	}

	public String getProvisionAddressLine2() {
		return provisionAddressLine2;
	}

	public void setProvisionAddressLine2(String provisionAddressLine2) {
		this.provisionAddressLine2 = provisionAddressLine2;
	}

	public String getProvisionAddressLine3() {
		return provisionAddressLine3;
	}

	public void setProvisionAddressLine3(String provisionAddressLine3) {
		this.provisionAddressLine3 = provisionAddressLine3;
	}

	public String getProvisionPostCode() {
		return provisionPostCode;
	}

	public void setProvisionPostCode(String provisionPostCode) {
		this.provisionPostCode = provisionPostCode;
	}

	public String getProvisionPhoneNumber() {
		return provisionPhoneNumber;
	}

	public void setProvisionPhoneNumber(String provisionPhoneNumber) {
		this.provisionPhoneNumber = provisionPhoneNumber;
	}

	public String getProvisionEmailAddress() {
		return provisionEmailAddress;
	}

	public void setProvisionEmailAddress(String provisionEmailAddress) {
		this.provisionEmailAddress = provisionEmailAddress;
	}

	public Long getDeliveryTypeMethod() {
		return deliveryTypeMethod;
	}

	public void setDeliveryTypeMethod(Long deliveryTypeMethod) {
		this.deliveryTypeMethod = deliveryTypeMethod;
	}

	public Long getBuildingAccesibilityConsideration() {
		return buildingAccesibilityConsideration;
	}

	public void setBuildingAccesibilityConsideration(Long buildingAccesibilityConsideration) {
		this.buildingAccesibilityConsideration = buildingAccesibilityConsideration;
	}

	public Long getMinSessions() {
		return minSessions;
	}

	public void setMinSessions(Long minSessions) {
		this.minSessions = minSessions;
	}

	public Long getMaxSessions() {
		return maxSessions;
	}

	public void setMaxSessions(Long maxSessions) {
		this.maxSessions = maxSessions;
	}

	public Long getHelplineFlag() {
		return helplineFlag;
	}

	public void setHelplineFlag(Long helplineFlag) {
		this.helplineFlag = helplineFlag;
	}

	public Long getReferralMethod() {
		return referralMethod;
	}

	public void setReferralMethod(Long referralMethod) {
		this.referralMethod = referralMethod;
	}

	

}

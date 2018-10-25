package dos.search.engine.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Parent;

@Document(indexName = "activity", type = "su_activity")
public class Activity {
	
	@Id
	private String activityid;
	@Parent(type="provider")
	private String providerId;
	private String gender;
	private String PathwayOne;
	private String PathwaySecond;
	private Include include;
	private Exclude exclude;
	
	public String getActivityid() {
		return activityid;
	}
	public void setActivityid(String activityid) {
		this.activityid = activityid;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPathwayOne() {
		return PathwayOne;
	}
	public void setPathwayOne(String pathwayOne) {
		PathwayOne = pathwayOne;
	}
	public String getPathwaySecond() {
		return PathwaySecond;
	}
	public void setPathwaySecond(String pathwaySecond) {
		PathwaySecond = pathwaySecond;
	}
	public Include getInclude() {
		return include;
	}
	public void setInclude(Include include) {
		this.include = include;
	}
	public Exclude getExclude() {
		return exclude;
	}
	public void setExclude(Exclude exclude) {
		this.exclude = exclude;
	}

}

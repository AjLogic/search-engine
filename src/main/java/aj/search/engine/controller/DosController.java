package aj.search.engine.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aj.search.engine.model.Activity;
import aj.search.engine.model.AgeGroup;
import aj.search.engine.model.Exclusion;
import aj.search.engine.model.Inclusion;
import aj.search.engine.repository.ActivityRepository;

@RestController
public class DosController {

	
	@Autowired
	ActivityRepository activityRepository;
	
	@RequestMapping(value="/save")
	public void saveDosObject(HttpRequest request, HttpResponse response) {
	
		activityA34();
	
	}
	private void activityA1() {
		Activity activity = new Activity();
		activity.setActivityId("20");
		List<String> team = new ArrayList();
		team.add("C07");
		team.add("CO8");
		activity.setFlexTeamAssociation(team);
		activity.setCrcProviderId("1");
		activity.setPrimaryPathway("A");
		Inclusion inclusion = new Inclusion();
		List<String> gender  = new ArrayList();
		inclusion.setInclusionId("20");	
		gender.add("Male");
		gender.add("FeMale");
		inclusion.setGender(gender);
		inclusion.setMarriage("NO");
		AgeGroup age1 = new  AgeGroup();
		age1.setGte(1);
		age1.setLte(5);
		AgeGroup age = new  AgeGroup();
		age.setGte(7);
		age.setLte(10);
		List<AgeGroup>ages = new ArrayList();
		ages.add(age);
		ages.add(age1);
		inclusion.setAgeGroup(ages);
		activity.setInclusion(inclusion);
		Exclusion exclusion = new Exclusion();
		@SuppressWarnings("rawtypes")
		List<String> ethnicity  = new ArrayList();
		ethnicity.add("white");
		ethnicity.add("blck");
		exclusion.setEthnicity(ethnicity);
		exclusion.setExclusionId("20");
		activity.setExclusion(exclusion);
		activityRepository.save(activity);
	}
	
	private void activityA2() {
		Activity activity = new Activity();
		activity.setActivityId("22");
		List<String> team = new ArrayList();
		team.add("C07");
		team.add("CO8");
		activity.setFlexTeamAssociation(team);
		activity.setCrcProviderId("2");
		activity.setSecondaryPathway("A");
		activity.setProvisionEmailAddress("vinisha");
		Inclusion inclusion = new Inclusion();
		List<String> gender  = new ArrayList();
		inclusion.setInclusionId("22");	
		gender.add("Male");
		gender.add("FeMale");
		inclusion.setGender(gender);
		AgeGroup age1 = new  AgeGroup();
		age1.setGte(12);
		age1.setLte(20);
		AgeGroup age = new  AgeGroup();
		
		age.setGte(22);
		age.setLte(25);
		List<AgeGroup>a = new ArrayList();
		a.add(age);
		a.add(age1);
		
		Exclusion exclusion = new Exclusion();
		exclusion.setAgeGroup(a);
		exclusion.setMarriage("Yes");
		List<String> ethnicity  = new ArrayList();
		ethnicity.add("white");
		ethnicity.add("blck");
		exclusion.setEthnicity(ethnicity);
		exclusion.setExclusionId("22");
		activity.setExclusion(exclusion);
		activityRepository.save(activity);
	}
	
	private void activityA33() {
			Activity activity = new Activity();
			activity.setActivityId("33");
			List<String> team = new ArrayList();
			team.add("C07");
			team.add("CO6");
			activity.setFlexTeamAssociation(team);
			activity.setCrcProviderId("33");
			activity.setSecondaryPathway("A");
			Inclusion inclusion = new Inclusion();
			activity.setProvisionEmailAddress("vinisha");
			List<String> gender  = new ArrayList();
			inclusion.setInclusionId("33");	
			gender.add("Male");
			inclusion.setMarriage("NO");
			inclusion.setGender(gender);
			Exclusion exclusion = new Exclusion();
			List<String> ethnicity  = new ArrayList();
			ethnicity.add("white");
			ethnicity.add("blck");
			exclusion.setEthnicity(ethnicity);
			exclusion.setExclusionId("33");
			activity.setExclusion(exclusion);
			activityRepository.save(activity);
		}
	
	
	private void activityA34() {
		Activity activity = new Activity();
		activity.setActivityId("34");
		List<String> team = new ArrayList();
		team.add("C07");
		team.add("CO6");
		activity.setFlexTeamAssociation(team);
		activity.setCrcProviderId("34");
		activity.setSecondaryPathway("A");
		Inclusion inclusion = new Inclusion();
		activity.setProvisionEmailAddress("vinisha");
		List<String> gender  = new ArrayList();
		inclusion.setInclusionId("34");	
		gender.add("Male");
		inclusion.setMarriage("NO");
		inclusion.setGender(gender);
		Exclusion exclusion = new Exclusion();
		List<String> ethnicity  = new ArrayList();
		ethnicity.add("white");
		ethnicity.add("AA");
		exclusion.setEthnicity(ethnicity);
		exclusion.setExclusionId("34");
		activity.setExclusion(exclusion);
		activityRepository.save(activity);
	}
	
	
	
	@RequestMapping(value="/delete")
	public void deleteDosObject(HttpRequest request, HttpResponse response) {
		activityRepository.deleteAll();
	}
	}

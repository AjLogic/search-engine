package aj.search.engine.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aj.search.engine.model.Task;
import aj.search.engine.model.StudentBatch;
import aj.search.engine.model.Fail;
import aj.search.engine.model.Pass;
import aj.search.engine.repository.ActivityRepository;

@RestController
public class DosController {

	
	@Autowired
	ActivityRepository activityRepository;
	
	@Transactional
	@RequestMapping(value="/save")
	public void SaveDosObject(HttpRequest request, HttpResponse response) {
	
	Task activity = new Task();
	activity.setActivityId("3");
	List<String> team = new ArrayList<String>();
	team.add("CO6");
	activity.setFlexTeamAssociation(team);
	activity.setCrcProviderId("1");
	activity.setPrimaryPathway("A");
	//activity.setSecondaryPathway("B");
	Pass inclusion = new Pass();
	List<StudentBatch> ageGroup  =new ArrayList<StudentBatch>();
	StudentBatch age =new StudentBatch();
	age.setId(5);
	age.setMinAge(3);
	age.setMaxAge(5);
	StudentBatch age1 =new StudentBatch();
	age1.setId(6);
	age1.setMinAge(7);
	age1.setMaxAge(10);
	ageGroup.add(age);
	ageGroup.add(age1);
	inclusion.setAgeGroup(ageGroup);
	List<String> gender  =new ArrayList<String>();
	gender.add("Male");
	inclusion.setGender(gender);
	inclusion.setInclusionId("3");	
	activity.setInclusion(inclusion);
	
	Fail exclusion = new Fail();
	List<String> ethnicity  =new ArrayList<String>();
	ethnicity.add("India");
	ethnicity.add("USA");
	exclusion.setEthnicity(ethnicity);
	exclusion.setExclusionId("3");
	activity.setExclusion(exclusion);
	activityRepository.save(activity);
	
	}
	
	@Transactional
	@RequestMapping(value="/delete")
	public void deleteDosObject(HttpRequest request, HttpResponse response) {
		activityRepository.deleteAll();
	}
	}

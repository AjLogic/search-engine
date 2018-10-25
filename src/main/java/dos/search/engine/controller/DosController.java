package dos.search.engine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dos.search.engine.model.Activity;
import dos.search.engine.model.AgeGroup;
import dos.search.engine.model.Exclude;
import dos.search.engine.model.Include;
import dos.search.engine.model.SUProvider;
import dos.search.engine.repository.ActivityRepository;
import dos.search.engine.repository.SuProviderRepository;

@RestController
public class DosController {

	@Autowired
	SuProviderRepository suProviderRepository;
	
	@Autowired
	ActivityRepository activityRepository;
	
	@RequestMapping(value="/save")
	public void SaveDosObject() {
		
		SUProvider provider = new SUProvider();
		provider.setCrc("C06");
		provider.setProviderId("1");
		suProviderRepository.save(provider);
		Activity activity = new  Activity();
		activity.setActivityid("1");
		activity.setProviderId("1");
		activity.setPathwayOne("10");
		activity.setPathwaySecond("20");
		activity.setGender("M");
		Include include =new Include();
		AgeGroup age =new AgeGroup();
		age.setId(1);
		age.setMinAge(10);
		age.setMaxAge(20);
		AgeGroup age1 =new AgeGroup();
		age1.setId(1);
		age1.setMinAge(10);
		age1.setMaxAge(20);
		List<AgeGroup> list = new ArrayList<>();
		list.add(age1);
		list.add(age1);
		include.setAge(list);
		include.setIncludeId(1);
		List<String> l = new ArrayList<>();
		l.add("Ind");
		l.add("Aus");
		Exclude ex =new Exclude(); 
		ex.setExcludeId(1);
		ex.setNationality(l);
		activity.setInclude(include);
		activity.setExclude(ex);
		activityRepository.save(activity);
	}
}

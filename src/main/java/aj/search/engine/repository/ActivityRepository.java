package aj.search.engine.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import aj.search.engine.model.Activity;

public interface  ActivityRepository extends ElasticsearchRepository<Activity, String>{ 

}

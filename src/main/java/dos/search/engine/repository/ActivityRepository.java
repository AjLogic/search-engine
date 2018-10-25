package dos.search.engine.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import dos.search.engine.model.Activity;

public interface  ActivityRepository extends ElasticsearchRepository<Activity, String>{ 

}

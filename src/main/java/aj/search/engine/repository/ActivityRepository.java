package aj.search.engine.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import aj.search.engine.model.Task;

public interface  ActivityRepository extends ElasticsearchRepository<Task, String>{ 

}

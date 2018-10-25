package dos.search.engine.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import dos.search.engine.model.SUProvider;

public interface SuProviderRepository extends ElasticsearchRepository<SUProvider, String>{

}

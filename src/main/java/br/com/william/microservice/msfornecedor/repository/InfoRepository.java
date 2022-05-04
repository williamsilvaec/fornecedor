package br.com.william.microservice.msfornecedor.repository;

import br.com.william.microservice.msfornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstado(String estado);
}

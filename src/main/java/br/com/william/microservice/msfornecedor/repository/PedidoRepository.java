package br.com.william.microservice.msfornecedor.repository;


import br.com.william.microservice.msfornecedor.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

}

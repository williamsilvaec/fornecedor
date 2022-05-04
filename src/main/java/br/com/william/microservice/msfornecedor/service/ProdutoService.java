package br.com.william.microservice.msfornecedor.service;

import br.com.william.microservice.msfornecedor.model.Produto;
import br.com.william.microservice.msfornecedor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getProdutosPorEstado(String estado) {
        return produtoRepository.findByEstado(estado);
    }


}

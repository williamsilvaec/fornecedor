package br.com.william.microservice.msfornecedor.service;

import br.com.william.microservice.msfornecedor.model.InfoFornecedor;
import br.com.william.microservice.msfornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);
    }
}

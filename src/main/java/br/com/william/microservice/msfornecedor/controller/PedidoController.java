package br.com.william.microservice.msfornecedor.controller;

import br.com.william.microservice.msfornecedor.dto.ItemDoPedidoDTO;
import br.com.william.microservice.msfornecedor.model.Pedido;
import br.com.william.microservice.msfornecedor.service.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);

    @Autowired
    private PedidoService pedidoService;

    @RequestMapping(method = RequestMethod.POST)
    public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
        LOG.info("Recebendo pedido");
        return pedidoService.realizaPedido(produtos);
    }

    @RequestMapping("/{id}")
    public Pedido getPedidoPorId(@PathVariable Long id) {
        return pedidoService.getPedidoPorId(id);
    }
}

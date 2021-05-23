package com.willianthomaz.projetorest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cliente")
public class MeuResource {

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
        //service.save(cliente)
        return cliente;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id){
        //service.buscarPorId(id);
        //service.delete(id);
    }

    @PutMapping("{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        //service.buscarPorId(id);
        //service.update(id);
        return cliente;

    }

    @GetMapping("{id}")
    public Cliente obterDadosCliente(@PathVariable Long id){
        Cliente cliente = new Cliente("Fulano","000.000.000-00");
        return cliente;
    }
}

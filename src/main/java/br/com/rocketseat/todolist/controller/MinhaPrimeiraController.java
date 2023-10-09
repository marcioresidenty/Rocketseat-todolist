package br.com.rocketseat.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

//@Controller  // anotação de uma classe controladora que retorna uma pagina 
@RestController // retorna uma api
@RequestMapping("/primeiraRota") //Mapeia a rota
public class MinhaPrimeiraController {
    /**
     * Alguns metodos de acessos do HTTP que podemos usar
     * 
     *  GET -  Buscar uma informação
     *  POST - Adicionar um dado / informação
     *  PUT - Alterar um dado / informação
     *  DELETE - Remover um dado / informação
     *  PATCH - Alterar somente uma parte do dado / informação
     */
    
    @GetMapping("/primeiraMetodo")
    public String primeiraMenssagem() {
        return "Funcionou ";
    }
    
}

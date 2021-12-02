package br.com.maddytec.cliente.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data // cria os getter e setters e two string automaticamente
@AllArgsConstructor // cria os contructor com propriedades criadas no cliente
@NoArgsConstructor // cria construtores vazio, sem argumentos
@Builder // ajuda na criação de objetos cliente
@Entity // informa que é uma entidade no banco de dados
public class Cliente implements Serializable {
        //atribuitos da classe
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
                private Long id;
@Column(name = "nome", nullable = false) //adicionando uma coluna no banco de dados
                private  String nome;
@Column(name = "email")
                private  String email;
@Column(name = "cpf")
                private  String cpf;
}

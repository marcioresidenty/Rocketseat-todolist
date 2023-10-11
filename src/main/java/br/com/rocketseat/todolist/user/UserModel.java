package br.com.rocketseat.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Data   //anotação LOMBOK que carrega os getters e setters

@Entity(name = "tb_users")
public class UserModel {

   @Id
   @GeneratedValue(generator = "UUID")
   private UUID id;

   @Column(unique = true) // não permite cadastro iguais 
   private String username;
   private String name;
   private String password;

   @CreationTimestamp
   private LocalDateTime createdAt;

}
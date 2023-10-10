package com.example.demo.controllers;

import java.util.List;
import java.util.ArrayList;
import com.example.demo.entities.Aluno;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/alunos") 
public class AlunoController {
    
    private List<Aluno> alunos;

    public AlunoController(){
        alunos = new ArrayList<>();
        alunos.add(new Aluno ("Joaquim", 3));
        alunos.add(new Aluno ("Maria", 2));
        alunos.add(new Aluno ("Olivia", 5));
        alunos.add(new Aluno ("Pedro", 3));
    }


    @GetMapping ()
    public List<Aluno> getAlunos(){
        return alunos;
    }
    
    @GetMapping ("/{id}")
    public Aluno getAlunosById(@PathVariable()int id){
        return alunos.get(id);
    }

    @PostMapping() public Aluno setAluno(@RequestBody Aluno aluno){
        alunos.add(aluno);
        return aluno;

    }
}

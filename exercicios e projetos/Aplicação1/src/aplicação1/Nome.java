/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação1;

import java.util.*;
import static java.lang.System.out;

public class Nome {
  private String nome;

  public Nome (String nome) {
    this.nome = nome;
  }

  public String getNome() { return this.nome; }

  public String toString() {
    return "Nome= " + nome;
  }
}
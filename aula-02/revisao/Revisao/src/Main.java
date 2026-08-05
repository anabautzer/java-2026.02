void main() {
  List<Double> lista = new ArrayList<>();
  lista.add(5.0);
  lista.add(7.0);
  lista.add(2.0);
  System.out.println(lista);
  for (Double posicao: lista){
    System.out.println(posicao);
  }
  Collections.sort(lista, Collections.reverseOrder()); // collections para acessar a biblioteca, sort para crescetes, reverseOrder para ser decrescente
  System.out.println(lista);
  List<Aluno> listaAluno = new ArrayList<>(); // fazendo com objeto
  listaAluno.add(new Aluno(0,"Ana"));
  listaAluno.add(new Aluno(1,"Rafael"));
  listaAluno.add(new Aluno(2,"Eduardo"));
  System.out.println("\nAluno 1: " + listaAluno.get(0).getNome() + " RM: " + listaAluno.get(0).getRM());
  System.out.println("Aluno 2: " + listaAluno.get(1).getNome() + " RM: " + listaAluno.get(1).getRM());
  System.out.println("Aluno 3: " + listaAluno.get(2).getNome() + " RM: " + listaAluno.get(2).getRM());
  Collections.sort(listaAluno);

  for (Aluno alunos: listaAluno){ // para imprimir todos na tela ao mesmo tempo
    System.out.println("Aluno: " + alunos.getNome() + " RM: " + alunos.getRM());
  }
  System.out.println("\n");
  for (int i = 0; i < listaAluno.size(); i++){ // outra maneira de fazer
    System.out.println("Aluno: " + listaAluno.get(i).getNome() + " RM: " + listaAluno.get(i).getRM());
  }

}


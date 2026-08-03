//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Integer> lista = new ArrayList<>(); // colocar Integer na instância é opcional, tomar cuidado ao definir o tipo da lista, definir apenas após o new (boas práticas)
    // List<Integer> lista2 = new LinkedList<>();
    lista.add(5);
    lista.add(25);
    lista.add(3);
    lista.add(1, 75); // adiciona pelo index
    lista.remove(3); // pelo index
    lista.remove((Integer) 75); // Cast - força o int a se tornar um Integer
    System.out.println(lista);

    int a = lista.get(1); // recupera o valor da posição pelo index
    int tamanho = lista.size(); // tamanho da lista
    System.out.println("Valor: " + a + "\nTamanho: " + tamanho);

    int soma = 0;
    for (int i = 0; i < lista.size(); i++) {
        System.out.println("\nIndice 1: " + i + "\nValor 1: " + lista.get(i)); // mostrar passo a passo e mostrar os componentes, além do modo de manipular
        soma += lista.get(i);
    }
    System.out.println("\nSoma: " + soma);

    for (Integer i2 : lista) { // percorre de 0 até o tamanho - 1 da lista (foreach), perde a manipulação dos dados
        System.out.println("\nValor 2: " + i2);
    }
    lista.forEach(System.out::println); // imprime todo o conteúdo da tela, sem controle
    System.out.println();
    lista.set(0, 50); // substitui o valor que está no índice
    lista.forEach(System.out::println);

    if (lista.contains(75)){
        System.out.println("Está");
    } else {
        System.out.println("Não está");
    }
    System.out.println(lista.indexOf(50));
    System.out.println(lista.lastIndexOf(50));
    lista.clear(); // apaga a lista
    System.out.println(lista.isEmpty()); // verifica se está vazia

}

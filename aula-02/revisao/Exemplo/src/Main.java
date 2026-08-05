void main() {
    List<Pessoa> listaPessoa = new ArrayList<>();

    listaPessoa.add(new Pessoa("Rafael"));
    listaPessoa.add(new Pessoa("Cristiano"));
    listaPessoa.add(new Pessoa("Maria"));
    listaPessoa.add(new Pessoa("Ana"));

    for (Pessoa pessoas: listaPessoa){
        System.out.println("Nome: " + pessoas.getNome());
    }
    System.out.println("Quantidade de nomes: " + listaPessoa.size());
    listaPessoa.set(1, new Pessoa("Carlos")); // ele pede um objeto

    for (int i = 0; i < listaPessoa.size(); i++){
        if (listaPessoa.get(i).getNome().equals("Maria")){
            listaPessoa.remove(i);
            break;
        }

    }

    for (int i = 0; i < listaPessoa.size(); i++){
        if (listaPessoa.get(i).getNome().equals("Ana")){
            System.out.println("Tem Ana na lista");
            break;
        }
    }
    for (Pessoa pessoas: listaPessoa){
        System.out.println("Nome: " + pessoas.getNome());
    }
    System.out.println("A lista está vazia? " + listaPessoa.isEmpty());

}

void main() {
    Scanner sc = new Scanner(System.in);
    int contar = 0;
    List<Float> notas = new ArrayList<>();
    int opcao = 0;
    float somatoria = 0;

    System.out.println("Digite 4 notas: ");
    while (contar < 4) {
        notas.add(sc.nextFloat());
        contar++;
    }

    do {
        System.out.println("Opção 1 - Adicionar nota");
        System.out.println("Opção 2 - Remover nota");
        System.out.println("Opção 3 - Lista de notas");
        System.out.println("Opção 4 - Calcular média das notas");

        opcao = sc.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Digite uma nota para adicionar: ");
                notas.add(sc.nextFloat());
                break;
            case 2:
                System.out.println("Digite uma nota para remover: ");
                float remover = sc.nextFloat();
                if (notas.contains(remover)){
                    notas.remove(remover);
                } else {
                    System.out.println("A nota não foi encontrada!");
                }
                break;
            case 3:
                for (Float nota : notas) {
                    System.out.println("Notas: " + nota);
                }
                break;
            case 4:
                for (Float soma : notas) {
                    somatoria += soma;
                }
                System.out.println("Média: " + somatoria/notas.size());
        }
    } while (opcao != 4);

}

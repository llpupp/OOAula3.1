package one.dio.oo;

/**
 * Classe de exemplo para o exercício da Aula 2 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro(); //construtor padrão sem parâmetros

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);
        //objeto criado com parâmetros no seu construtor

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}


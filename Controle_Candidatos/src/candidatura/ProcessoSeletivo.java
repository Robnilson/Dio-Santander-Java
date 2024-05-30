package candidatura;




import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;




public class ProcessoSeletivo {

    public static void main(String[] args) {

       //imprimirSelecionados();

        String [] candidatos = {"FELIPE", "JOÃO", "MARIA", "CARLOS", "ANA"};

        for(String candidato: candidatos){

            entrandoEmContato(candidato);

        }

    

    

    }




    static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;

        boolean continuarTentando = true;

        boolean atendeu=false;

        do{

            atendeu= atender();

            continuarTentando = !atendeu;

            if(continuarTentando)

                tentativasRealizadas++;

            else

                System.out.println("Contato realizado com sucesso ");




        }while(continuarTentando && tentativasRealizadas <3);




        if(atendeu)

            System.out.println("Conseguimos contato com " + candidato + " NA "+tentativasRealizadas);

        else

            System.out.println("Nao conseguimos contato com " + candidato + "numero maximo de tentativa ");






    }

    static boolean atender(){

        return new Random().nextInt(3)==1;

    }




    static void imprimirSelecionados(){

        String [] candidatos = {"FELIPE", "JOÃO", "MARIA", "CARLOS", "ANA"};




        for(String candidato: candidatos){

            System.out.println("O candidato selecionado foi " + candidato);

        }

    }




    static void selecaoCandidatos(){

        String[] candidatos = {"FELIPE", "JOÃO", "MARIA", "CARLOS", "ANA", "PAULO", "FERNANDA", "PEDRO", "LUCIA", "BRUNO", "CAMILA", "GUSTAVO", "PATRICIA", "ANDRE", "RAQUEL", "MARCOS"};




        int candidatosSelecionados = 0;

        int candidatosAtual=0;

        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){

            String candidato = candidatos[candidatosAtual];

            double salarioPretendido = valorPretendido();




        System.out.println("O candidato "+candidato+" Solicitou o salario de "+salarioPretendido);

        if(salarioBase >= salarioPretendido){

            System.out.println("o candidato "+candidato+" foi selecionado ");

            candidatosSelecionados++;

        }

        candidatosAtual++;

    

}

}

static double valorPretendido(){

    return ThreadLocalRandom.current().nextDouble(1800, 2200);

}

    static void analisarCandidato(double salarioPretendido){

        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){

            System.out.println("Ligar para o candidato");

        }else if(salarioBase == salarioPretendido)

            System.out.println("Ligar para contra proposta ");

        else{

            System.err.println("Aguardando resultados ");

        }




    }


}

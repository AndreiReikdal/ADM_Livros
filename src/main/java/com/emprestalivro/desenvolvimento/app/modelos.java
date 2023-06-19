package com.emprestalivro.desenvolvimento.app;

/***********  SALVAR OBJETOS NO BANCO DE DADOS ******************/
        /*
        // Instanciar pessoas
         Adulto a1 = new Adulto("joao", 60, "23232323");
         Crianca cr1 = new Crianca("valentina", 17, "2312312312");
         Adulto a2 = new Adulto("mariana", 35, "454d564");

        // Salva os objetos no banco
         pDao.salvarPessoa(a1);
         pDao.salvarPessoa(cr1);
         pDao.salvarPessoa(a2);
      
        // // Instanciar carros
        Carro c1 = new Carro("gurgel");
        Carro c2 = new Carro("fusca");
        Carro c3 = new Carro("ka");


        // Observe que a1 e a2 são os adultos que foram criados nesta execução e foram salvos 
        // no banco. Caso não tivessem sido salvos, não seria possível salvar o carro pois
        // o ID do dono não estaria disponível.
        
        c1.setDono(a1); //gurgel pertence ao a1
        c2.setDono(a1); //fusca pertence ao a1
        c3.setDono(a2); //ka pertence à a2
     
        // Salva os objetos no banco
        cDao.salvarCarro(c1);
        cDao.salvarCarro(c2);
        cDao.salvarCarro(c3);
        */
        /*************************************************************** */
     







        /**** BUSCAR TODOS OS CARROS E IMPRIMI-LOS NA TELA ************ */
        /*
        ArrayList<Carro> carros = (ArrayList<Carro>) cDao.buscarTodasCarros();
        for(Carro carro : carros){
            System.out.println(carro);
        }
        /*************************************************************** */








         /**** BUSCAR TODOS OS CARROS E IMPRIMI-LAS NA TELA ************ */
        /*
        ArrayList<Pessoa> criancas = (ArrayList<Pessoa>) pDao.buscarTodasCriancas();
        System.out.println(criancas);

        // OBSERVAÇÃO IMPORTANTE SOBRE O TOSTRING:
        /* Para criar o método toString em Carro e em Adulto, tome cuidado para não 
         * imprimir a lista de carros em Adulto, pois pode haver um ciclo infinito
         * de chamadas de uma classe para outra.
         */
        /*************************************************************** */









        /********** BUSCA UMA PESSOA POR UM NOME E ALTERA O NOME DESSA PESSOA ************** */

        /*
        // Lê o nome a ser buscado
        System.out.println("Digite um nome: ");
        String nomeBuscado = leitor.nextLine();

        // Busca todas as pessoas do banco
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) pDao.buscarTodasPessoas();

        // Percorre a lista até encontrar o nome (ou cada nome se houver repetidos)
        for(Pessoa p : pessoas){
            if(nomeBuscado.equals(p.getNome())){
                System.out.println("Pessoa encontrada, digite um novo nome: ");
                String novoNome = leitor.nextLine();
                // Altera o nome no objeto
                p.setNome(novoNome);
                // Salva alterações no banco
                pDao.atualizarPessoa(p);
            }
        }
        */
        /************************************************************************************ */









        /********************* REMOÇÃO DE UMA PESSOA POR SEU ID *************************** */
        /*
        // Carrega a lista de pessoas do banco
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) pDao.buscarTodasPessoas();

        // Imprime cada pessoa (O toString deve imprimir o ID neste caso)
        for(Pessoa pessoa : pessoas){          
            System.out.println(pessoa);
        }

        // Seleciona o id da pessoa a ser removida
        System.out.println("Selecione um id para remover");
        Long idSelecionado = Long.parseLong(leitor.nextLine());

        // Busca a pessoa por id e a exclui do banco
        Pessoa pessoaRemover = pDao.buscarPessoaPorId(idSelecionado);
        pDao.excluirPessoa(pessoaRemover);
        */

        // Há outras maneiras de exlcuir, como passando diretamente o objeto a ser removido
        /************************************************************************************ */







        /***** SELECIONA UM CARRO POR UM NOME E ALTERA SEU DONO **************** */
        /*        
        ArrayList<Carro> carros = (ArrayList<Carro>) cDao.buscarTodasCarros();
        for(Carro item : carros){
            if(item.getModelo().equals("gurgel")){
                //buscar pessoa pelo ID 1 (na aplicação real você deve pegar o id do objeto, por exemplo)                
                Adulto novoDono = (Adulto) pDao.buscarPessoaPorId(1L);

                //Define o novo dono e altera no carro
                item.setDono(novoDono);

                //Atualiza no banco
                cDao.atualizarCarro(item);
            }
        }
        */
        /*************************************************************** */


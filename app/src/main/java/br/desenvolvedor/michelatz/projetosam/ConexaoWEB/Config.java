package br.desenvolvedor.michelatz.projetosam.ConexaoWEB;

public class Config {

    //endereços web
    public static final String URL_INSERIR_USUARIO = "http://projetosw.esy.es/conexao/addUsuario.php";
    public static final String URL_EDITAR_USUARIO = "http://projetosw.esy.es/conexao/editarUsuario.php";
    public static final String URL_LISTA_SERVICOS = "http://projetosw.esy.es/conexao/listaServicos.php";
    public static final String URL_LISTA_SERVICOS_UTILIZADOS = "http://projetosw.esy.es/conexao/listaServicos.php";
    public static final String URL_VERIFICA_LOGIN = "http://projetosw.esy.es/conexao/verificaLogin.php";
    public static final String URL_BUSCA_SERVICOS = "http://projetosw.esy.es/conexao/buscaServicos.php";
    public static final String URL_BUSCA_USUARIO = "http://projetosw.esy.es/conexao/buscaUsuario.php?id=";
    public static final String URL_DELETE_USUARIO = "http://projetosw.esy.es/conexao/excluirUsuario.php?id=";
    public static final String URL_INSERIR_SERVICO = "http://projetosw.esy.es/conexao/addServicos.php";
    public static final String URL_EDITAR_SERVICO = "http://projetosw.esy.es/conexao/editarServicos.php";
    public static final String URL_DELETE_SERVICO = "http://projetosw.esy.es/conexao/excluirServico.php?id=";
    public static final String URL_BUSCA_DADOS_SERVICO = "http://projetosw.esy.es/conexao/buscaDadosServico.php?id=";
    public static final String URL_INSERIR_TIPO_SERVICO = "http://projetosw.esy.es/conexao/addTipoServico.php";
    public static final String URL_LISTA_AUTONOMOS = "http://projetosw.esy.es/conexao/listaAutonomos.php";
    public static final String URL_INSERIR_MENSAGEM = "http://projetosw.esy.es/conexao/addMensagens.php";
    public static final String URL_BUSCA_MENSAGENS = "http://projetosw.esy.es/conexao/buscaMensagens.php?idServico=";
    public static final String URL_DELETAR_MENSAGEM = "http://projetosw.esy.es/conexao/excluirMensagem.php?id=";
    public static final String URL_BUSCA_RECOMENDACAO = "http://projetosw.esy.es/conexao/buscaRecomendacao.php";
    public static final String URL_LISTAR_CHAT = "http://projetosw.esy.es/conexao/buscaMensagensChat.php";
    public static final String URL_LISTAR_CONVERSAS = "http://projetosw.esy.es/conexao/chatListarConversas.php";
    public static final String URL_GERENCIAR_RECOMENDACAO = "http://projetosw.esy.es/conexao/gerenciarRecomendacoes.php";


    //CHAT
    public static final String URL_INSERIR_MENSAGEM_CHAT = "http://projetosw.esy.es/conexao/chatInserirMensagem.php";


    //Chaves que seram usadas nos scripts PHPs
    public static final String KEY_USUARIO_NOME = "nome";
    public static final String KEY_USUARIO_EMAIL = "email";
    public static final String KEY_USUARIO_SENHA = "senha";
    //teste comitt
    public static final String KEY_USUARIO_CIDADE = "cidade";
    public static final String KEY_USUARIO_ESTADO  = "estado";
    public static final String KEY_USUARIO_IDLOGADO  = "idLogado";

    public static final String KEY_SERVICO_RECOMENDACAO  = "recomendacao";
    public static final String KEY_SERVICO_GERENCIA_RECOMENDACAO  = "gerenciaRecomendacao";
    public static final String KEY_SERVICO_TIPO_RECENDACAO  = "tipoRecomendacao";
    public static final String KEY_SERVICO_NOME  = "nomeServico";
    public static final String KEY_SERVICO_TURNO  = "turno";
    public static final String KEY_SERVICO_DIA  = "diaSemana";
    public static final String KEY_SERVICO_IDUSUARIO  = "idUsuario";
    public static final String KEY_SERVICO_IDSERVICO  = "idServico";
    public static final String KEY_TIPO_SERVICO_NOME  = "nomeTipoServico";
    public static final String KEY_RECOMENDACAO  = "recomendacao";
    public static final String KEY_SERVICO_MENSAGEM  = "comentario";
    public static final String KEY_ID_AUTONOMO  = "idAutonomo";


    //CHAT
    public static final String KEY_EMISSOR  = "idEmissor";
    public static final String KEY_RECEPTOR  = "idReceptor";
    public static final String KEY_MENSAGEM_CHAT  = "mensagem";
    public static final String KEY_ID_SERVICO  = "idServico";
    public static final String KEY_HORARIO  = "horario";
    public static final String KEY_ID_MENSAGEM  = "id";

    public static final String KEY_CHAT_ID_RECEPTOR = "idReceptor";
    public static final String KEY_CHAT_ID_EMISSOR = "idEmissor";
    public static final String KEY_CHAT_ID_SERVICO = "idServico";

    public static final String KEY_CONVERSA_ID = "id";
    public static final String KEY_CONVERSA_NOME_SERVICO = "nomeServico";
    public static final String KEY_CONVERSA_MENSAGEM = "mensagem";
    public static final String KEY_CONVERSA_EMISSOR = "nomeEmissor";
    public static final String KEY_CONVERSA_RECEPTOR = "nomeReceptor";
    public static final String KEY_CONVERSA_ID_EMISSOR = "idEmissor";
    public static final String KEY_CONVERSA_ID_RECEPTOR = "idReceptor";
    public static final String KEY_CONVERSA_ID_SERVICO = "idServico";
    public static final String KEY_CONVERSA_HORARIO = "horario";

    //Tags JSON
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_ID_USUARIO = "idUsuario";
    public static final String TAG_ID_SERVICO = "idServico";
    public static final String TAG_NOME_SERVICO = "nomeServico";
    public static final String TAG_CIDADE = "cidade";
    public static final String TAG_NOME = "nomeUsuario";
    public static final String TAG_ESTADO = "estado";
    public static final String TAG_TIPO_TELA = "tipoTela";
    public static final String TAG_TURNO = "turno";
    public static final String TAG_DIA = "diaSemana";
    public static final String TAG_RECOMENDACAO = "recomendacao";
    public static final String TAG_COMENTARIO = "comentario";

    //Id e dados do serviço que serão passados por intent
    public static final String SERVICO_ID = "servico_id";
    public static final String TIPO_TABELA = "tipo_tabela";
    public static final String DIA = "dia";
    public static final String TURNO = "turno";
    public static final String RECOMENDACAO = "recomendacao";
    public static final String NOMESERVICO = "nomeServico";
    public static final String NOME_USUARIO = "nomeUsuario";
    public static final String ID_AUTONOMO = "idAutonomo";
}

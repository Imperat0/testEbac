package service;


import dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    public String buscar() {
        clienteDao.buscar();
        return "Buscado com sucesso";
    }

    public String excluir() {
        clienteDao.excluir();
        return "Excluido com sucesso";
    }

    public String atualizar() {
        clienteDao.atualizar();
        return "Atualizado com sucesso";
    }
}

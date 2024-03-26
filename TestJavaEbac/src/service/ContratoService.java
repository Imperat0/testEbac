package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Buscar com sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluido com sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado com sucesso";
    }
}

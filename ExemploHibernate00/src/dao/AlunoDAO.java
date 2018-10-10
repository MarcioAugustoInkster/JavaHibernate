package dao;

import bean.Aluno;
import coneccao.Coneccao;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    public List<Aluno> obterTodos() {
        List<Aluno> alunos = new ArrayList<>();
        
        return alunos;
    }
    
    public Aluno obterPeloId(int id) {
        Aluno alunos = null;
        
        return alunos;
    }
    
    public int insert(Aluno aluno) {
        Coneccao coneccao = new Coneccao();
        
        if (coneccao.conectar()) {
            coneccao.session.save(aluno);
            coneccao.transaction.commit();
            coneccao.session.close();
            
            return -1;
        }
        
        return -1;
    }
    
    public boolean alterar(Aluno aluno) {
        
        
        return false;
    }
    
    public boolean excluir(int id) {
        
        
        return false;
    }
}

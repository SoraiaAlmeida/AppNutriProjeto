package br.edu.fateczl.appnutriprojeto.persistence;

import java.sql.SQLException;
import java.util.List;

public interface ICRUDDAO<T> {
    public void inserir(T t) throws SQLException;

    public void alterar(T t) throws SQLException;

    public void deletar(T t) throws SQLException;

    public T buscar(T t) throws SQLException;

    public List<T> listar() throws SQLException;
}
package br.com.blol.app70.models;

import br.com.blol.app70.exceptions.ExceptionBank;

import java.io.Serializable;

public class Funcionario implements Serializable {

    private int codigo;
    ;
    private String cpf;
    private String nome;
    private int codigoSetor;
    private Sexo sexo;
    private double salario;

    public Funcionario(int codigo, String cpf, String nome, Sexo sexo,
                       int codigoSetor, double salario) throws ExceptionBank {

        setCodigo(codigo);
        setCpf(cpf);
        setNome(nome);
        setSexo(sexo);
        setCodigoSetor(codigoSetor);
        setSalario(salario);
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) throws ExceptionBank {
        if (salario < 0)
            throw new ExceptionBank("Salário inválido.");
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) throws ExceptionBank {
        if (sexo == null)
            throw new ExceptionBank("Sexo Inválido.");

        this.sexo = sexo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ExceptionBank {
        if (codigo < 0)
            throw new ExceptionBank("Codigo Inválido.");

        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws ExceptionBank {
        if ((cpf == null) || (cpf.trim().equals("")))  // trim elimina caractere
            throw new ExceptionBank("CPF Inválido.");

        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ExceptionBank {
        if ((nome == null) || (nome.trim().equals("")))
            throw new ExceptionBank("Nome Inválido.");

        this.nome = nome;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }


    public enum Sexo {Masculino, Feminino}


}



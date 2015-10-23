package model;

public class Setor {

        
            private int codigo;
                    private String nome;
                            private String obs;

                                            
                                    
                                    public Setor(String nome, String obs) throws Exception {
                                                
                                                    setNome(nome);
                                                                setObs(obs);

                                                                        }


                                            public int getCodigo() {
                                                            return codigo;
                                                                    }
                                                    public void setCodigo(int codigo) throws Exception {
                                                                    if (codigo < 0 )
                                                                                        throw new Exception ("Codigo Inválido.");
                                                                                
                                                                                this.codigo = codigo;
                                                                                        }
                                                            public void setObs(String obs) throws Exception {
                                                                            if ( (obs == null ) || ( obs.trim().equals("")))
                                                                                                throw new Exception ("obs Inválido.");
                                                                                
                                                                                        this.obs = obs;
                                                                                                }
                                                                    
                                                                    public String getObs() {
                                                                                    return obs;
                                                                                            }

                                                                            public String getNome() {
                                                                                            return nome;
                                                                                                    }
                                                                                    
                                                                                    public void setNome(String nome) throws Exception {
                                                                                                    if ( (nome == null ) || ( nome.trim().equals("")))
                                                                                                                        throw new Exception ("Nome Inválido.");
                                                                                                                
                                                                                                                this.nome = nome;
                                                                                                                        }


                                                                                            
}


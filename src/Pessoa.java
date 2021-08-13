public class Pessoa {

    private String nome;
    private String msg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome: " + nome +
                ", msg: " + msg  +
                '}';
    }
}

public class DoHello implements Generic<Pessoa> {


    @Override
    public void dizerOla(Pessoa pessoa) {
        System.out.println(pessoa.toString());
    }

    @Override
    public void setOla() {
        Pessoa p = new Pessoa();
        p.setNome("A. G.");
        p.setMsg("Initial Kraken");
        dizerOla(p);
    }
}

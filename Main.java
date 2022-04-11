package veiculos;

public class Main
{
    public static void main(String args[])
    {
        Veiculo v1 = new Veiculo();
        Carro c1 = new Carro();
        Moto m1 = new Moto();
        Aviao a1 = new Aviao();

        System.out.println(c1 instanceof Carro);
        System.out.println(c1 instanceof Veiculo);
        //System.out.println(Carro instanceof Carro);
        System.out.println(m1 instanceof Veiculo);
        //System.out.println(Carro instanceof Veiculo);
        //System.out.println(m1 instanceof Carro);
        System.out.println(m1 instanceof Moto);
        System.out.println(v1 instanceof Carro);

        c1.locomove();
        v1.locomove();
        a1.locomove();

    }
}

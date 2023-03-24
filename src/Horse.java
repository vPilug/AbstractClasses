public class Horse extends Mamal {
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shepHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}

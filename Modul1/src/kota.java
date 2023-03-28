public class kota<E> {
    private final E element;

    public kota(E kota) {
        element = kota;
    }

    public static void main(String[] args) {
        kota<Integer> jumlahkota = new kota<Integer>(9);
        kota<String> namakota = new kota<String>("Malang");
        System.out.println("jumlah kota di jawa Timur : " + jumlahkota.getElement() + " Kota ");
        System.out.println("Kota di jawa timur : Kota " + namakota.getElement());
    }

    public E getElement() {
        return element;
    }
}
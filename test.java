
public class latihan{

    
    static void current_rasio(final float al, final float hl) {
        final float cr = ((al / hl) * 100);
        System.out.println("Current Rasio = " + cr);
    }
    static void quick_rasio(final float al, final float p, final float ul)
    {
        final float qr = (((al - p)/ul) * 100)
    }

    public static void main(final String[] agrs)
    {
        current_rasio(15629555766.00f, 43134543977.00f);
        
        quick_rasio(15629555766.00f, 74841050.00f, 43134543977.00f)
    }
}

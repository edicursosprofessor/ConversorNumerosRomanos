public class Conversor {

    String[] romanos = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    int[] decimais = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    public String converter(int numero) {
        StringBuilder romano = new StringBuilder();
        for (int i = decimais.length - 1; i >= 0; i--) {
            while (numero >= decimais[i]) {
                romano.append(romanos[i]);
                numero -= decimais[i];
            }
        }
        return romano.toString();
    }

}

public class Main {
    public static void main(String[] args) {
       int[] array = {140,139,160,170,135};
       int[] arrayOrdenado = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            int a = i;
            --a;
            for (int j = a; j <= i; j++) {
                if (array[i] < array[j]){
                    arrayOrdenado[j] = array[i];
                    arrayOrdenado[i] = array[j];
                    int controlWhile = ++i;
                    while(controlWhile < array.length){
                        arrayOrdenado[controlWhile] = array[controlWhile];
                        controlWhile++;
                    }
                    array = new int[array.length];
                    array = arrayOrdenado;
                    arrayOrdenado = new int[array.length];
                    i = 0;
                }
                else{
                    arrayOrdenado[j] = array[j];
                }
            }
        }
        imprimirNumeros(arrayOrdenado);
    }
    public static void imprimirNumeros(int[] arrayOrdenado){
        for (int b = 0; b < arrayOrdenado.length; b++) {
            System.out.println(arrayOrdenado[b]);
        }
    }
}
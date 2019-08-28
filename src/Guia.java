public class Guia {
    public static void main(String[] args) {
        int [] temperaturas = new int[24];

        public agregarTemp( int temp){
            for (int i = 0; i < temperaturas.length; i++){
                temperaturas[i] = temp
            };

        }

        public maximo(){
            int maximo = temperaturas[0];

            for (i=0; i < temperaturas.length; i++){
                if ( maximo < temperaturas[i]){
                    maximo = temperaturas[i]
                };
            }
        }
    }
}

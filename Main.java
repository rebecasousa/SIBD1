
class main {
    public static void main(String[] args){
        int a[] = new int[10]; 
        int b[] = new int[10]; 
        for(int i = 0;i<10;i++){
            a[i] = 0;
            b[i] = i;
        }
        Array teste = new Array();
        teste.setArrayA(a);
        teste.setArrayB(b);
        teste.CalculaDivisaoArrays();

    
}
}
import java.util.Scanner;
public class Operaciones{
 //operaciones otros
 public static void aleatorios (int[] arreglo){
  int valor,total=0;
  for(int i=0;i<arreglo.length;i++){
   arreglo[i]= 1 +(int)(Math.random()*100);
   System.out.print(" "+ arreglo[i]);
  }
 }
 
 public static void crear_num(int []arreglo){
  Scanner entrada = new Scanner(System.in);
  int valor;
  for(int i=0;i<arreglo.length;i++){
   System.out.println("+i Digite el valor: "+i);
   valor = entrada.nextInt();
   arreglo[i] = valor;
  }
 }
 //operaciones Cadenas
 //operaciones Numeros
 public static void n_ver(int[] arreglo){
  for(int i=0; i<arreglo.length; i++){
   System.out.print(arreglo[i]+" ");
  }
 }
 
 public static void n_asc(int []arreglo){
  for(int i=0; i<arreglo.length; i++){
   System.out.print(arreglo[i]+" ");
  }
 }
 
 public static void n_desc(int []arreglo,int tam){
  for(int i=tam;i>=1;i--){
   System.out.print(arreglo[i]+" ");
  }
 }
 
 public static void n_burbuja(int arreglo[]){
  int j,temp;
  boolean sorteo;
  for(int i=0;i<arreglo.length-1;i++){
   sorteo=true;
   for(j=arreglo.length-1;j>i;j--){
    if(arreglo[j]<=arreglo[j-1]){
     temp=arreglo[j];
     arreglo[j]=arreglo[j-1];
     arreglo[j-1]=temp;
     sorteo=false;
    }
   }
  }
  System.out.println("Arreglo Ordenado");
 }
 
 public static void n_shell(int arreglo[]){
  int salto, aux, i;
  boolean cambios;
  for(salto=arreglo.length/2; salto!=0; salto/=2){
   cambios=true;
   while(cambios){ // Mientras se intercambie algún elemento
    cambios=false;
    for(i=salto; i< arreglo.length; i++){ // se da una pasada
     if(arreglo[i-salto]>arreglo[i]){ // y si están desordenados
      aux=arreglo[i]; // se reordenan
      arreglo[i]=arreglo[i-salto];
      arreglo[i-salto]=aux;
      cambios=true; // y se marca como cambio.
     }
    }
   }
  }
 }
 
 public int n_busquedaBin( int[] arreglo, int clave){
  boolean encontre = false;
  int central,bajo=0, alto;
  int valorcentral;
  alto=arreglo.length-1;
  while( bajo <= alto && !encontre ){
   central = ( bajo + alto ) / 2;
   valorcentral=arreglo[central];
   if( clave == valorcentral ){
    return central;
   }else if( clave == valorcentral){
    alto = central - 1;
   }else{
    bajo = central + 1;
   }
  }
  return -1;
 }
}
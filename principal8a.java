import java.util.Scanner;
public class principal8a {
 public static void main(String[] args) {
  int opc_accion,opc_son,tam;//opc CON = strings or numbers
  int opc_cad,opc_num,opc_Boo,res;//opc Boo = ordenamientos o busquedas
  Scanner entrada = new Scanner(System.in);
  Operaciones accion = new Operaciones();
  do{// bucle principal del programa
   do{
    System.out.println(".::Menú Principal::.");
    System.out.println("Digite una opcion.\n[1]Arreglo de cadenas.\n[2]Arreglo de numeros.\n[3]Salir del programa.");
    System.out.print("Opcion: ");opc_son = entrada.nextInt();
   }while((opc_son>3)||(opc_son<1));
   
   if(opc_son==3){//condicional de salida
    System.out.println("Saliendo del programa...");break;
   
   }else if(opc_son==2){
    do{
     System.out.println(".::Menú Crear Números::.\nDigite una opción.");
     System.out.println("[1]. Por teclado\n[2]. Aleatorio.");
     System.out.print("Opcion: ");opc_num=entrada.nextInt();
    }while((opc_num>2)||(opc_num<1));
    
    //tamaño del arreglo de numeros
    System.out.print("Digite el tamaño de arreglo: ");
    tam=entrada.nextInt();
    int arreglo_num[] = new int [tam];
    
    if(opc_num==2){
     accion.aleatorios(arreglo_num);
    }else{
     accion.crear_num(arreglo_num);
    }
    //Ver arreglo ingresado
    System.out.println("\nArreglo ingresado");
    accion.n_ver(arreglo_num);
    do{
     System.out.println("\n.::Menú Ordenamientos Busquedas::.\nDigite una opcion.");
     System.out.println("[1]. Ordenamientos.\n[2]. Busquedas.");
     System.out.print("Opcion: ");opc_Boo = entrada.nextInt();
    }while((opc_Boo<1)||(opc_Boo>2));
    
    if(opc_Boo==1){
     do{
      System.out.println(".::Menú Ordenamientos::.\nDigite una opcion.");
      System.out.println("[1]. Burbuja\n[2]. Insersion\n[3]. Seleccion.\n[4]. Shell\n[5]Mezcla");
      System.out.print("Opcion: ");opc_accion=entrada.nextInt();
     }while((opc_accion>5)||(opc_accion<1));
    }else{
     do{
      System.out.println(".::Menú Ordenamientos::.\nDigite una opcion.");
      System.out.println("[6]. Binaria");                                   //agregar busquedas
      System.out.print("Opcion: ");opc_accion=entrada.nextInt();
     }while((opc_accion>6)||(opc_accion<5));
    }
    //Operaciones con el arreglo
    switch(opc_accion){
     case 1: accion.n_burbuja(arreglo_num);break;
     //case 2: accion.n_insersion(arreglo_num);break;
     //case 3: accion.n_seleccion(arreglo_num);break;
     case 4: accion.n_shell(arreglo_num);break;
     //case 5: accion.n_mezcla(arreglo_num);break;
     case 6: int clave; System.out.print("Digite el valor a buscar: ");
             clave = entrada.nextInt();
             int indice=accion.n_busquedaBin(arreglo_num,clave);
             if(indice!=-1){
              System.out.println("El numero "+clave+" se encuentra en posicion "+(indice+1)+ "en el arreglo");
             }else{
              System.out.println("El numero "+clave+" no se encuentra en el arreglo");
             }
             break;
    }
    
    //to ver ascendente o descendente
    /*if(opc_accion<6){
     do{
      System.out.println("\n[1]. Ascendente\n[2]. Descendente");
      System.out.print("Opcion: ");res=entrada.nextInt();
     }while((res>2)||(res<1));
     
     if(res==1){
      accion.n_asc(arreglo_num);
     }else if(res==2){
      accion.n_desc(arreglo_num,tam);
     }
    }*/
    
   }else{
   }
  }while(opc_son!=3);
  System.out.println("Fin del programa.");
 }
}
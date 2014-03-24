import java.util.Scanner;
public class sp1 {
 static int v1=3;	
 static int puntos=0;
 
static 	String p1 ="PAPA";
static	String p2 ="OSO";
static	String p3 ="VASO";
static void desicionf(String palabra){
	 if (palabra.equals(p1) ||palabra.equals(p2) ||palabra.equals(p3)){
		 System.out.print("Has ganado 10 puntos");
		 puntos=puntos+10;
		 arreglo();
	 }
	 else {
		 v1=v1-1;
		 System.out.print("Perdiste una vida");
		 System.out.println("\n -------------------------");
		 arreglo();
	 }
}

 static void arreglo()
 {
	 System.out.println("\n---------------------------------------------------");
	 System.out.println("\n 		---SOPA de letras nivel 1---");
	 // VIDAS ------------------------------------------------------
	 System.out.print("Puntos: "+puntos);
	 System.out.println("\n ---VIDAS "+v1+"---");
	 //---------------------------------palabras correctas--------------------

	//------------------Sopa de letras--------------------------------------------
	 String Arreglo_SOPA[][]=new String[5][5];
	 Arreglo_SOPA[0][0]="P";
	 Arreglo_SOPA[0][1]="A";
	 Arreglo_SOPA[0][2]="P";
	 Arreglo_SOPA[0][3]="A";
	 Arreglo_SOPA[0][4]="O";
	 System.out.print(Arreglo_SOPA[0][0]);
	 System.out.print(" "+Arreglo_SOPA[0][1]);
	 System.out.print(" "+Arreglo_SOPA[0][2]);
	 System.out.print(" "+Arreglo_SOPA[0][3]);
	 System.out.println(" "+Arreglo_SOPA[0][4]);
	 Arreglo_SOPA[1][0]="A";
	 Arreglo_SOPA[1][1]="C";
	 Arreglo_SOPA[1][2]="O";
	 Arreglo_SOPA[1][3]="S";
	 Arreglo_SOPA[1][4]="O";
	 System.out.print(Arreglo_SOPA[1][0]);
	 System.out.print(" "+Arreglo_SOPA[1][1]);
	 System.out.print(" "+Arreglo_SOPA[1][2]);
	 System.out.print(" "+Arreglo_SOPA[1][3]);
	 System.out.println(" "+Arreglo_SOPA[1][4]);
	 Arreglo_SOPA[2][0]="I";
	 Arreglo_SOPA[2][1]="H";
	 Arreglo_SOPA[2][2]="F";
	 Arreglo_SOPA[2][3]="D";
	 Arreglo_SOPA[2][4]="O";
	 System.out.print(Arreglo_SOPA[2][0]);
	 System.out.print(" "+Arreglo_SOPA[2][1]);
	 System.out.print(" "+Arreglo_SOPA[2][2]);
	 System.out.print(" "+Arreglo_SOPA[2][3]);
	 System.out.println(" "+Arreglo_SOPA[2][4]);
	 Arreglo_SOPA[3][0]="V";
	 Arreglo_SOPA[3][1]="A";
	 Arreglo_SOPA[3][2]="S";
	 Arreglo_SOPA[3][3]="O";
	 Arreglo_SOPA[3][4]="T";
	 System.out.print(Arreglo_SOPA[3][0]);
	 System.out.print(" "+Arreglo_SOPA[3][1]);
	 System.out.print(" "+Arreglo_SOPA[3][2]);
	 System.out.print(" "+Arreglo_SOPA[3][3]);
	 System.out.println(" "+Arreglo_SOPA[3][4]);
	 Arreglo_SOPA[4][0]="I";
	 Arreglo_SOPA[4][1]="R";
	 Arreglo_SOPA[4][2]="Y";
	 Arreglo_SOPA[4][3]="Z";
	 Arreglo_SOPA[4][4]="P";
	 System.out.print(Arreglo_SOPA[4][0]);
	 System.out.print(" "+Arreglo_SOPA[4][1]);
	 System.out.print(" "+Arreglo_SOPA[4][2]);
	 System.out.print(" "+Arreglo_SOPA[4][3]);
	 System.out.println(" "+Arreglo_SOPA[4][4]);
	 
 }
 
/* */
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner mi_s= new Scanner (System.in);
	 arreglo();
	 
	 for(int i=0;i<3;i++ ){
		 System.out.print("\n Ingrese una palabra= ");
		 desicionf(mi_s.next());
		 }
		 if (puntos<=20){
			 System.out.print("Debes encontrar la Otra palabra para subir de nivel");
			 System.out.print("\n Ingrese una palabra= ");
			 desicionf(mi_s.next());
		 }
		 
		 }
	 }
	 


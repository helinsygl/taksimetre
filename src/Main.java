import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
int km;
double perKm=2.20;
int acilis=10;
System.out.println("Mesafeyi kilometre cinsinde giriniz>");
km=inp.nextInt();
double ucret=acilis+(km*perKm);
if(ucret<20){
    ucret=20;
    System.out.println("Ödenecek tutar>"+ucret);
}
else{
    System.out.println("öenecek ücret>"+ucret);
}
    }
}
package variables;

public class variabletypes {
    int x = 10;
    static int y = 20;

    public static void main(String[] args){
        variabletypes t1 = new variabletypes();
        System.out.println(t1.x);
        System.out. println(variabletypes.y);
        for (int z = 0; z<=5; z++){
            System.out.println(z);
        }
    }
}
// In the above example x is instant var y is static and z is local
// for local var only final modifier is applicable in case if we use any other modifiers it gives compile time error

package variables;

public class VariableTypes {
    int x = 10;
    static int p = 20;

    public static void main(String[] args){
        VariableTypes t1 = new VariableTypes();
        //System.out.println(t1.x);
        //.out. println(VariableTypes.p);
        for (int z = 0; z< args.length; z++){
            System.out.println(args[z]);
        }
    }
}
// In the above example x is instant var y is static and z is local
// for local var only final modifier is applicable in case if we use any other modifiers it gives compile time error


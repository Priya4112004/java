import java.util.Scanner;
class AbsEncapJava{
    private
        int privar;
    protected
        int provar;
    public
        int pubvar;
    void setVar(int priValue,int proValue, int pubValue){
        privar=priValue;
        provar=proValue;
        pubvar=pubValue;
    }
    void getVar(){
        System.out.println("Private variable :"+privar);
        System.out.println("Protceted variable :"+provar);
        System.out.println("Public variable :"+pubvar);
    }
}
class AccessSpecifierDemo{
    public static void main(String[] args) {
        AbsEncapJava obj = new AbsEncapJava();
        obj.setVar(45,11,3);
        obj.getVar();
    }
}

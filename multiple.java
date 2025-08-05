class Mammals{
    void mam(){
        System.out.println("Inside mammal class");
    }
}
class lion extends Mammals{
    void roar(){
        System.out.println("Inside lion class");
    }
}

class human extends Mammals {
    void hum() {
        System.out.println("Inside Human class");
    }
}
class multiple{
    public static void main (String args[]){
        lion obj=new lion();
        //obj.hum();
        obj.roar();
        obj.mam();
    }
}
class Animal {
    void eat(){
        System.out.println("Eating....Animalclass.....");
    }
}

class Lion extends Animal{
    void roar(){
        System.out.println("Roar.....Lion class.....");
    }
}

class Babylion extends Lion{
    void weep(){
        System.out.println("Weeping.....babylion....");
    }
}
class inheritance{
    public static void main(String args[]){
        Babylion obj=new Babylion();
        obj.weep();
        obj.roar();
        obj.eat();
    }

}

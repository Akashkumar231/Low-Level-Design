package designpattern;

interface ICharacter{
    String getAbility();
}

class Mario implements ICharacter{
    @Override
    public String getAbility() {
        return " Mario Character with No ability";
    }
}

interface  DecoratorPattern extends ICharacter{
}
class HeightAbility implements DecoratorPattern {
    ICharacter iCharacter ;
    HeightAbility(ICharacter character){
        this.iCharacter = character;
    }
  public   String getAbility(){
       return iCharacter.getAbility()+ " Height Ability.";
    }
}
class FireAbility implements DecoratorPattern{
    ICharacter iCharacter ;
    FireAbility(ICharacter character){
        this.iCharacter = character;
    }

    @Override
    public String getAbility() {
        return iCharacter.getAbility()+" Added Fire Ability";
    }
}

class  JumpAbility implements DecoratorPattern {
    ICharacter iCharacter;
    JumpAbility(ICharacter character){
        this.iCharacter=character;
    }
    @Override
    public String getAbility() {
        return iCharacter.getAbility()+" Added JumpAbility";
    }
}

public class DecoratorDesignPattern {

    public static void main(String [] args){
        ICharacter mario = new HeightAbility(new FireAbility(new JumpAbility(new Mario())));
        System.out.println(mario.getAbility());

    }

}

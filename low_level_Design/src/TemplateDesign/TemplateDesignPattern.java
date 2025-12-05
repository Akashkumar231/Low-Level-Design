package TemplateDesign;


abstract class ModelTrainer{
    public abstract void loadData();
    public abstract void preprocessedData();
    public abstract void trainModel();
    public  void templateMethod(){
        loadData();
        preprocessedData();
        trainModel();
    }
}

class Model1 extends ModelTrainer{

    @Override
    public void loadData() {
        System.out.println("For Model1 : Executing Step 1. is to load Data.");
    }

    @Override
    public void preprocessedData() {
        System.out.println("For Model1 : Executing Step 2. is to preprocess Data.");
    }

    @Override
    public void trainModel() {
        System.out.println("For Model1 : Executing Step 3. is to train Model.");
    }

}

class Model2 extends ModelTrainer{

    @Override
    public void loadData() {
        System.out.println("For Model2 : Executing Step 1. is to load Data.");
    }

    @Override
    public void preprocessedData() {
        System.out.println("For Model2 : Executing Step 2. is to preprocess Data.");
    }

    @Override
    public void trainModel() {
        System.out.println("For Model2 : Executing Step 3. is to train Model.");
    }

}



public class TemplateDesignPattern {
    public static void main(String [] args){
        ModelTrainer modelTrainer1 = new Model1();
        modelTrainer1.templateMethod();
        ModelTrainer modelTrainer2 = new Model2();
        modelTrainer2.templateMethod();
    }
}

package com.tesla.structural.adapter.p9_6;

public class AnimalAdapter implements CatInterface, DogInterface {

    private CatInterface cat;

    private DogInterface dog;

    @Override
    public void wang() {
        dog.wang();
    }

    @Override
    public void action() {
        cat.catchMouse();
    }

    @Override
    public void miao() {
        dog.wang();
    }

    @Override
    public void catchMouse() {
        cat.catchMouse();
    }

    public void setCat(CatInterface cat) {
        this.cat = cat;
    }

    public void setDog(DogInterface dog) {
        this.dog = dog;
    }

}

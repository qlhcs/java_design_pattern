package com.tesla.structural.facade.p13_4;

public class FacadeNoNeedTransform extends AbstractFacade {
    private Analyser analyser;

    private Displayer displayer;

    public FacadeNoNeedTransform() {
        analyser = new Analyser();
        displayer = new Displayer();
    }

    @Override
    void operation() {
        analyser.analyse();
        displayer.display();
    }

}

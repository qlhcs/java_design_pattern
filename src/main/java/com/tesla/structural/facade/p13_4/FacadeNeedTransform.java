package com.tesla.structural.facade.p13_4;

public class FacadeNeedTransform extends AbstractFacade {

    private Transformer transformer;

    private Analyser analyser;

    private Displayer displayer;

    public FacadeNeedTransform () {
        transformer = new Transformer();
        analyser = new Analyser();
        displayer = new Displayer();
    }

    @Override
    void operation() {
        transformer.transform();
        analyser.analyse();
        displayer.display();
    }

}

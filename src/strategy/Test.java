package strategy;

import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
    public static void main(String[] args) {

        // Singleton

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

    }    // Facade

}
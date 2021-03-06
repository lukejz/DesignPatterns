package FactoryOverBuilder.AbstractFactory.ComponentsFactory;

import FactoryOverBuilder.AbstractFactory.ComponentsFactory.Components.Fabric.Fabric;
import FactoryOverBuilder.AbstractFactory.ComponentsFactory.Components.Fabric.SynteticTextileFabric;
import FactoryOverBuilder.AbstractFactory.ComponentsFactory.Components.Laces.LacesTie;
import FactoryOverBuilder.AbstractFactory.ComponentsFactory.Components.Laces.Tie;
import FactoryOverBuilder.AbstractFactory.ComponentsFactory.Components.Sole.Sole;
import FactoryOverBuilder.AbstractFactory.ComponentsFactory.Components.Sole.SpringySole;

public class FootballComponentsFactory implements ComponentsFactory {
    @Override
    public Sole createSole() {
        return new SpringySole();
    }

    @Override
    public Fabric createFabric() {
        return new SynteticTextileFabric();
    }

    @Override
    public Tie createLaces() {
        return new LacesTie();
    }
}

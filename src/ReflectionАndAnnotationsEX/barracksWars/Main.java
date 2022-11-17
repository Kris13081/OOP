package ReflectionАndAnnotationsEX.barracksWars;

import ReflectionАndAnnotationsEX.barracksWars.interfaces.Repository;
import ReflectionАndAnnotationsEX.barracksWars.interfaces.Runnable;
import ReflectionАndAnnotationsEX.barracksWars.interfaces.UnitFactory;
import ReflectionАndAnnotationsEX.barracksWars.core.Engine;
import ReflectionАndAnnotationsEX.barracksWars.core.factories.UnitFactoryImpl;
import ReflectionАndAnnotationsEX.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}

package ReflectionАndAnnotationsEX.barracksWars.models.units;

public class Archer extends AbstractUnit {
    private static final int ARCHER_HEALTH = 25;
    private static final int ARCHER_DAMAGE = 7;

    public Archer() {
        super(ARCHER_HEALTH, ARCHER_DAMAGE);
    }
}

class Horseman extends AbstractUnit {
    private static final int HORSEMAN_DAMAGE = 10;
    private static final int HORSEMAN_HEALTH = 50;

    protected Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH_AND_DAMAGE = 20;


    protected Gunner() {
        super(GUNNER_HEALTH_AND_DAMAGE,GUNNER_HEALTH_AND_DAMAGE);
    }
}
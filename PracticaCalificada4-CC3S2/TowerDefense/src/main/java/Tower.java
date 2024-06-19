public class Tower {
    private int damage;
    private int range;
    private int fireRate;

    public Tower(int damage, int range, int fireRate) {
        this.damage = damage;
        this.range = range;
        this.fireRate = fireRate;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public class CannonTower extends Tower {
        public CannonTower() {
            super(50, 2, 3);
        }
    }

    public class LaserTower extends Tower {
        public LaserTower() {
            super(30, 5, 5);
        }
    }

    public class ArrowTower extends Tower {
        public ArrowTower() {
            super(15, 3, 10);
        }
    }
}

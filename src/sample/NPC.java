package sample;

public class NPC implements Serialize, Movement, Spawn {
    protected int health;
    protected String state;
    protected Coordinate location;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Coordinate getLocation() {
        return location;
    }
    public void setLocation(Coordinate location) {
        this.location = location;
    }
    @Override
    public void serialize(){}

    @Override
    public void deserialize(){}


    @Override
    public void spawn() {}

    @Override
    public void despawn() {}


    @Override
    public void Front() {}

    @Override
    public void Back() {}

    @Override
    public void Parallax() {}

    @Override
    public void Jump() {}

}

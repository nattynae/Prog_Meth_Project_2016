package Model;

public class Pond extends StrongObstacle implements BulletPassable{
	
	public Pond(int x, int y) {
		super(x, y);
	}
	
	@Override
	public int getZ() {
		return 0; // should be lower than a bullet.
	}
	
}

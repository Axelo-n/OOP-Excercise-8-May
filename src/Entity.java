
public class Entity {
	protected String name;
	protected HP hp;
	protected int att;
	protected int def;
	
	@Override
	public String toString() {
		return this.name;
	}
		
	public Entity(String name, HP hp, int att, int def) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
	}
	
	public void takeDamage(int att) {
		att -= this.def;
		if(att < 0) att = 0;
		hp.reduce(att);
		System.out.println(this.name + " is taking damage for " + att + " point(s)");
	}
	
	public void attack(Enemy enemy) {
		System.out.println(this.name + " attacking " + enemy);
		enemy.takeDamage(this.att);
	}
	
	public void showHP() {
		System.out.println(this.name + " current HP is " + this.hp);
	}
}

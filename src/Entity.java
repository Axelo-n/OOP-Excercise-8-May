
public class Entity implements IDamageable, IAttack, IRecoverable, IHeal{
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
	
	public int takeDamage(int att, int def) {
		att -= def;
		if(att < 0) att = 0;
		hp.reduce(att);
		System.out.println(this.name + " is taking damage for " + att + " point(s)");
		return att;
	}
	
	public void attack(IDamageable damageable) {
		Enemy enemy = (Enemy)damageable;
		System.out.println(this.name + " attacking " + enemy);
		enemy.takeDamage(this.att, enemy.def);
	}
	
	public void showHP() {
		System.out.println(this.name + " current HP is " + this.hp);
	}

	@Override
	public void heal(int value) {

	}

	@Override
	public void recover(int value) {

	}
}


public class HP {
	private int HP;

	public HP(int HP) {
		this.HP = HP;
	}

	public void reduce(int amount) {
		this.HP -= amount;		
	}
	
	@Override
	public String toString() {
		return ""+this.HP;
	}

}

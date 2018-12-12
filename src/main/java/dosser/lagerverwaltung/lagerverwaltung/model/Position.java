package dosser.lagerverwaltung.lagerverwaltung.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Position {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int x,y;

	public Position() {
	}

	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public long getId() {return id;	}
	public void setId(long id) {this.id = id;}
}

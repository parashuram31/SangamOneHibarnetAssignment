package HaibarnetAssignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Student")
public class CreateTable {
	@Id
	int id;
	@Column(nullable=false)
	String name;
	@Column(nullable = false,unique = true)
	long pnone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPnone() {
		return pnone;
	}
	public void setPnone(long pnone) {
		this.pnone = pnone;
	}
}


package pojos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="dac_depts")
public class Dept {
	private Integer deptId;
	private String name;
	//HAS multiple emps
	private List<Emp> emps=new ArrayList<>();
	

	public Dept() {
		// TODO Auto-generated constructor stub
	}

	public Dept(String name) {
		super();
		this.name = name;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	@Column(length=10)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany
	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", name=" + name + "]";
	}
	
}

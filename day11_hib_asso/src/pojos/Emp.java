package pojos;
import javax.persistence.*;

@Entity
@Table(name="dac_emps")
public class Emp {
	private Integer empId;
	private String name;
	private Dept department;
	public Emp() {
		System.out.println("in emp constr");
	}
	public Emp(String name) {
		super();
		this.name = name;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	@Column(length=10)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
	public Dept getDepartment() {
		return department;
	}
	public void setDepartment(Dept department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + "]";
	}
	

}

package demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class emp {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long  empno;
	
	String ename;
	Integer mgr;
	
	public Long getEmpno() {
		return empno;
	}
	public void setEmpno(Long empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	
	@Override
	public String toString() {
		return "emp [empno=" + empno + ", ename=" + ename + ", mgr=" + mgr + ", getEmpno()=" + getEmpno()
				+ ", getEname()=" + getEname() + ", getMgr()=" + getMgr() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

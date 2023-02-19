package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
	private List<CanBo> canbos;
	
	public QLCB() {
		this.canbos = new ArrayList<>();
	}
	
	public void addCB(CanBo canbo) {
		this.canbos.add(canbo);
	}
	
	public List<CanBo> searchCBByName(String name) {
		return this.canbos.stream().filter(cb -> cb.getName().contains(name)).collect(Collectors.toList());
	}
	
	public void showInfoCB() {
		this.canbos.forEach(cb -> System.out.println(cb.toString()));
	}
}

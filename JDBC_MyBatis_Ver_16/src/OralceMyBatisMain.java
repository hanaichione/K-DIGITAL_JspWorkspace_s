import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
		
		Map map = new HashMap<>();
		map.put("deptno1", 10);
		map.put("deptno2", 20);
		
		List<Dept> list = service.multiSelectMap(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
//		List<Dept> list = service.selectAll();
//		// select * from dept where deptno >= 40;
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
		
//		System.out.println("==========================");
//		
//		List<Dept> list2 = service.selectAll2();
//		// select * from dept where deptno >= 40;
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
		
//		Dept d = service.selectByDeptno();
//		System.out.println(d);
		
	}	// end main

}	// end class

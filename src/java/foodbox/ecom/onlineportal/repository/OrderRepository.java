package foodbox.ecom.onlineportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import foodbox.ecom.onlineportal.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, String>  {
	
	List<Orders> findOrderByEmail(String email);
}


package com.aprendendoSpring.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aprendendoSpring.course.entities.Category;
import com.aprendendoSpring.course.entities.OrderItem;
import com.aprendendoSpring.course.entities.Payment;
import com.aprendendoSpring.course.entities.Order;
import com.aprendendoSpring.course.entities.Product;
import com.aprendendoSpring.course.entities.User;
import com.aprendendoSpring.course.entities.enums.OrdersStatus;
import com.aprendendoSpring.course.repositorys.CategoryRepository;
import com.aprendendoSpring.course.repositorys.OrderItemRepository;
import com.aprendendoSpring.course.repositorys.OrderRepository;
import com.aprendendoSpring.course.repositorys.ProductRepository;
import com.aprendendoSpring.course.repositorys.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired    // mesma coisa de instanciar o UserRepository
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderrepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	

	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(u1, u2));

		
//		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
//		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),u1, OrdersStatus.PAID);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2,OrdersStatus.DELIVERED);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrdersStatus.SHIPPED);
		orderrepository.saveAll(Arrays.asList(o1,o2,o3));
		
		OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
		OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
		OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
		OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());
		
		orderItemRepository.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));
		
		Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
		o1.setPayment(pay1);
		orderrepository.save(o1);
	
	}

}

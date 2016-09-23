package io.github.lucasvenez.ormclass;

import java.util.Date;

import io.github.lucasvenez.ormclass.dao.OrderDAO;
import io.github.lucasvenez.ormclass.model.City;
import io.github.lucasvenez.ormclass.model.Country;
import io.github.lucasvenez.ormclass.model.Individual;
import io.github.lucasvenez.ormclass.model.Order;
import io.github.lucasvenez.ormclass.model.Person;
import io.github.lucasvenez.ormclass.model.Product;
import io.github.lucasvenez.ormclass.model.State;

public class Main {

	public static void main(String[] args) {
		
		Country country = new Country("Brasil");
		
		State state = new State("São Paulo", country);
		
		City city = new City("Caragua", state);
		
		
		Person person = new Individual();
		
		person.getFullname();
		
        person.getBirthdate();
		
		person.getCity();
		
		
		Product product = new Product();
		
		
		
		
		Order order = new Order();
		
		order.setOrderDate(new Date());
		
		order.setOrderTime(new Date());
		
		//..

		OrderDAO dao = new OrderDAO();
		
		dao.persist(order);
	}

}

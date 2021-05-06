//package com.jacob.val.controller;
//
//public interface AdRepo extends JpaRepository<Ad, Long> {
//
//    // Derived Query Examples
//    List<Ad> findAdsByDescriptionEndingWith(String match);
//    List<Ad> findByDescriptionIsNotContaining(String match);
//    List<Ad> findAdByOrderByDescription();
//    List<Ad> findAdByOrderByDescriptionDesc();
//    List<Ad> findAdsByPriceInCentsBetween(int min, int max);
//
//    // Custom Query Examples
//
//    @Query("from Ad a where a.id = 1")
//    List<Ad> coolMethodOne();
//
//    @Query("from Ad a where a.id = :num")
//    List<Ad> coolMethodTwo(@Param("num") int num);
//
//    @Query("from Ad a where length(a.description) > :minLength")
//    List<Ad> coolMethodThree(@Param("minLength") int minLength);
//
//}


import com.jacob.val.controller.OneToOne;

@Entity
public class Company {

	@OneToMany(cascade = CascadeType.ALL)
	private Ceo ceo;
	//for user view with thymeleaf we can reach that info by;
	${company.ceo.name}
}
@Entity
public class Ceo {

}



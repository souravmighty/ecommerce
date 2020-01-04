package com.deloitte.ecommerce.dao;

import java.util.Set;
import com.deloitte.ecommerce.entities.CustomerWallet;;


public interface ICustomerWalletDao {
	

	
	CustomerWallet findByMobileNo(String no);

	
	boolean credentialsCorrect(String mobileno, String password);

}

package com.example.trial.Cservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trial.Cmodel.Logincheck;
import com.example.trial.Crepository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	public LoginRepository repo;

	public Logincheck add(Logincheck lo) {
		// TODO Auto-generated method stub
		return repo.save(lo);
	}
	
	public String loginCheckData(String username,String password)
	{
		Logincheck user = repo.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}

}

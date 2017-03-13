package ua.com.forkShop.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.forkShop.entity.Role;
import ua.com.forkShop.entity.User;
import ua.com.forkShop.repository.UserRepository;
import ua.com.forkShop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
		private UserRepository userRepository;
		
		@Override
		public void save(User user) {
			user.setRole(Role.ROLE_USER);
			userRepository.save(user);
	}

}

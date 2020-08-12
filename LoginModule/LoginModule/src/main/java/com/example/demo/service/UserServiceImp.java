package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.exception.UserException;
import com.example.demo.repository.UserRepository;




/****************************
 *          @author          Prateek Pandey
 *          Description      It is a service class that provides the services for the registration 
           				 	 of new user, login the existing user in the database, view details 
           				 	 of all user,login for admin and deleting some user
                                         
  *         Version          1.0
  *         Created Date     10-May-2020
 ****************************/

@Service
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	/****************************
	 * Method: 					saveUser
     * Description: 			To register a new User
	 * @throws UserException:   It is raised due to EmailId already exists
     * Created By:              Prateek Pandey
     * Created Date:            10-May-2020                           
	 
	 ****************************/
	
	@Override
	public Users saveUser(Users user) throws UserException {
		String tempEmailId = user.getEmailId();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			Users userobj = userRepository.findByEmailId(tempEmailId);
			if (userobj != null) {
				throw new UserException("User with " + tempEmailId + " already exists");
			}
		}
		return userRepository.save(user);
	}

	/****************************
	 * Method: 					loginUser
     * Description: 			To login an existing User
	 * @throws UserException:   It is raised due to Invalid  EmailId and Password
     * Created By:              Prateek Pandey
     * Created Date:            10-May-2020                           
	 
	 ****************************/
	
	@Override
	public Users loginUser(Users user) throws UserException {

		String tempEmailId = user.getEmailId();
		String tempPass = user.getUserPassword();
		Users userObj = null;
		if (tempEmailId != null && tempPass != null) {
			userObj = userRepository.findByEmailIdAndUserPassword(tempEmailId, tempPass);
		}
		if (userObj == null) {
			throw new UserException("Invalid  EmailId and Password");
		}

		return userObj;
	}

	
	/****************************
	 * Method: 					showAllUsers
     * Description: 			To show list of all users
     * Created By:              Prateek Pandey
     * Created Date:            10-May-2020                           
	 
	 ****************************/
	
	@Override
	public List<Users> showAllUsers() {
		return userRepository.findAll();
	}
	
	/****************************
	 * Method: 					deleteUser
     * Description: 			To delete the user
     * Created By:              Prateek Pandey
     * Created Date:            10-May-2020                           
	 
	 ****************************/

	@Override
	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);
	}

	
	/****************************
	 * Method: 					loginAdmin
     * Description: 			To login as an Admin
	 * @throws UserException:   It is raised due to Bad Credentials
     * Created By:              Prateek Pandey
     * Created Date:            10-May-2020                           
	 
	 ****************************/
	
	@Override
	public String loginAdmin(Users user) throws UserException {
		String tempName = user.getUserName();
		String tempPass = user.getUserPassword();
		if (tempName.equals("Admin") && tempPass.equals("Admin@123")) {
			return "login Successfull";
		} else {
			throw new UserException("Bad Credentials");
		}

	}

}

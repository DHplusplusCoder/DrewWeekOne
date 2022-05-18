/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drew
 */
public class MockDataDrewTwo {
    private final List<User> users = new ArrayList<>();
    
    public MockDataDrewTwo() {
        User Generic_Employee_One = new User(1, "genericEmployee1", "genericPassword1", Role.Employee);
        User Generic_Finance_Manager_One = new User(4, "genericManager1", "genericManagerPassword1", Role.Manager);
        
        users.add(Generic_Employee_One);
        users.add(Generic_Finance_Manager_One);
}
   
public List(User getUsers()
{
   return users;     
}
}
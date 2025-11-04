public class Employee {
    private String userName;
    private String userId;
    private String componyName;
    private String userAdd;
     
    public Employee(String userName,String userId,String componyName,String userAdd ){
    this.userName = userName;
    this.userId = userId;
    this.componyName = componyName;
    this.userAdd= userAdd;
    }
    // geter and setter useing
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public String getComponyName(){
        return componyName;
    }
    public void setComponyName(String componyName){
       this.componyName = componyName;
    }

    public String getUseAdd(){
        return userAdd;
    }
    public void setUserAdd(String userAdd){
       this.userAdd = userAdd;
    }
    @Override
    public String toString() {
       return "Employee =>[userName :"+userName+", userId : "+userId+", componyName :"+componyName+", useradd : "+userAdd+"]"; 
    }
}

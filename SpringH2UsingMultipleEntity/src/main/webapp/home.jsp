<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<body>

<h3>Employee Information</h3>

<div>
  <form action="addEmployee">
    <label for="eid">EmployeeID</label>
    <input type="text" id="eid" name="eid" placeholder="Enter Your Employee ID..">
    
    <label for="Firstname">First Name</label>
    <input type="text" id="Firstname" name="Firstname" placeholder="Enter Your First Name..">

    <label for="Lastname">Last Name</label>
    <input type="text" id="lname" name="Lastname" placeholder="Enter Your Last name..">

 <label for="designation">Designation</label>
    <input type="text" id="designation" name="designation" placeholder="Enter Your Designation..">
    
     <label for="email">Email Id</label>
    <input type="text" id="email" name="email" placeholder="Enter Your Email ID..">
    
    <label for="department">Department</label>
    <input type="text" id="department" name="department" placeholder="Enter Your Department..">
    
    <label for="salary">Salary</label>
    <input type="text" id="salary" name="salary" placeholder="Enter Your Salary..">
    
    <label for="country">Country</label>
    <select id="country" name="country">
      <option value="india">India</option>
      <option value="canada">Canada</option>
      <option value="usa">USA</option>
    </select>
  
    <input type="submit" value="Submit">
  </form>
</div>

</body>
</html>



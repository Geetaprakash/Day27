package com.company;

public class EmpPD {
    public int id;
    public String Name;
    public double salary;
public EmpPD(Integer  id,String Name,Double salary){
    this.id=id;
    this.Name=Name;
    this.salary=salary;
}
public String toString(){retrun "id=" + ",Name='"+ Name + '\'' + ",salary="+salary;
}
}

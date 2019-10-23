public  class Person{
//为啥没有class
String name;
char sex;
int age;
Person(String name,char sex,int age){
    this.name = name;
    this.sex = sex;
    this.age = age;
}
Person(){
    this("Tom",'M',16);
}
void setData(String name,char sex,int age){
    this.name = name;
    this.sex = sex;
    this.age = age;
}
String getData(){
    return "Name:" + name +"\tSex:" + sex +"\tAge:" +age;
}
}

class Student extends Person{
    String sID;
    String speciality;
    Student(){
        super();
        sID = "0000";
        speciality = "IT";
    }
    Student(String n,char s,int a,String sID,String sp){
        super(n,s,a);
        this.sID = sID;
        this.speciality = sp;
    }
    void setData(String n,char s,int a,String si,String sp){
        setData(n, s, a);
        sID = si;
        speciality = sp;
    }
    String getdata(){
        return super.getData()+"\tSID:"+sID+"\tSpeciality:"+speciality;
    }
}

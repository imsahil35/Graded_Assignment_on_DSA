import java.io.*;
import java.util.*;
public class Priorityqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = Integer.parseInt(sc.nextLine());
        PriorityQueue<Student> student = new PriorityQueue<Student>(num, new StComparator());
        String op;
        for(int i=0;i<num;i++){
            op = sc.next();
            if(op.equals("ENTER")){
                student.add(new Student(sc.next(), sc.nextDouble(),sc.nextInt()));
                if(sc.hasNextLine()){
                    sc.nextLine();
                }
            }
            else if(op.equals("Served")){
                student.poll();
            }
        }
        
        if(student.isEmpty()){
            System.out.println("Empty");
        }
        else{
            while (!student.isEmpty()) {
                System.out.println(student.poll().getName());
            }
        }
    }
}
class Student{
    private int id;
    private String name;
    private double cgpa;
    
    public Student(String name, double cgpa, int id){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getCGPA(){
        return this.cgpa;
    }
}

class StComparator implements Comparator<Student>{
    
    public int compare(Student a, Student b){
        if(a.getCGPA() < b.getCGPA()){
            return 1;
        }
        else if(a.getCGPA() > b.getCGPA()){
            return -1;
        }
        else{
            if(a.getName().compareTo(b.getName()) < 0){
                return -1;
            }
            else if(a.getName().compareTo(b.getName()) > 0){
                return 1;
            }
            else{
                if(a.getID() < b.getID()){
                    return -1;
                }
                else{
                    return 1;
                }
                
            }
        }
    }
}

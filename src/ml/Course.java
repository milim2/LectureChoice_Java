package ml;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irene
 */
public class Course {
    private String id;
    private String title;
    private int credit;
    private String category;
   
    public Course(){
        this("","",0,"NONE");
    }  // this()      
    
     public Course(String id, String title, int credit, String category){
        //set(id, title,credit,cat);
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    // debug
    public String toString(){
        return ("id: " + this.id + "\nTitle: " + this.title);
    }
    
    // override equals() for searching    
    public boolean equals(Object o) { 
        if(o instanceof Course){
        Course course = (Course) o;
        return id.equals(course.getId());
        }
        else return false;
    }
    
//        if (cs == this)   return true;              
//        if((cs == null)||cs.getId() != this.getId()) 
//            return false;
    
        
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    // override compareTo() to sort by ID (bonus mark)
//    public int compareTo(Course cs ){
//        int diffId = id.compareTo(cs.id);
//        if(diffId != 0) return diffId;
//       }  
//      
//    private void set(String id, String title, int credit, String cat) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}

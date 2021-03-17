/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managingpeople;

/**
 *
 * @author user
 */
public class Managingpeople2 {
        public static void main(String[] args) {
        ManagingPeople p1 = new ManagingPeople("Arial", 37);
        ManagingPeople p2 = new ManagingPeople("Joseph", 15);

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }

    }
}


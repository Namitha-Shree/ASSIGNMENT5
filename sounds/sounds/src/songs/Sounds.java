/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package songs;

/**
 *
 * @author NAMITHA SHREE
 */
public class Sounds {

    /**
     * @param args the command line arguments
     */
    /**
     * Classs that will play music files at given paths
     *
     * @author Jesus Molina
     *
     */

    public static void main(String[] args) {
        // TODO code application logic here
        FilePlayer fp = new FilePlayer();
        fp.play("src/songs");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import java.awt.Graphics;
import tetris.Block;

/**
 *
 * @author Brendan
 */
public class Tetromino {
    // The p@[] at index i desicribes the rotations state when rotationState == i. 
    public P2[][] rotations;  // Initialized in constructor, these are in grid coordinates!!!
    public int rotationState = 0;
    public P2 current;
    public Color c;
    
    
    
    public Tetromino(P2[][] rotatations, P2 start, Color c) {
        this.rotations = rotations;
        this.current = start;
        this.c = c;
    }
    public Tetromino tetI(P2 start, Color c){
        // You need to make the other 6 methods!!! 
        //Make a new tetromino the rotation array coorisponding 
        //with I and the color C that was given
       return null; 
    }
    
    public boolean drop(gameState gs) {        
        // add gravity to the current y position.
        // Check if there are any intersections.
        // If there is subtract gravity and move the blocks down as far as you can
        // The return boolean tells whether the drop resulted in an intersection happening.
        return false;
    }
    
    public void horizontalMove(boolean d, gameState gs) {
        // Make sure this is in grid coordinates
        // d is direction False: Left, True: Right
        // Change x by given d.
        // Check for intersections
        // Change x back if there is an intersection
    }
    
    public void rotate(boolean d, gameState gs) {
        // False: counterclockwise (-1), True: clockwise (+1)
        // change rotation state by 1 based off of d
        // check if there are intsersection
        // If there is change rotation state back
    }
    
    public boolean intersect(gameState gs) {
        // When our grid coordinates are used to look at inside of block
        // If any of them are not null return false because there is an issue
        return true;
    }
}

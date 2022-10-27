/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import entity.movie;
import java.util.Comparator;

/**
 *
 * @author Pablo
 */
public class comparator {
    public static Comparator<movie> orderByTimelengthDesc = new Comparator<movie> () {
        @Override
        public int compare(movie t1, movie t) {
            return t.getTimelength().compareTo(t1.getTimelength());
        }
    };    
        public static Comparator<movie> orderByTimelengthAsc = new Comparator<movie> () {
        @Override
        public int compare(movie t1, movie t) {
            return t1.getTimelength().compareTo(t.getTimelength());
        }
    };
        public static Comparator<movie> orderByDirector = new Comparator<movie> () {
        @Override
        public int compare(movie t1, movie t) {
            return t1.getDirector().compareTo(t.getDirector());
        }
    };
        public static Comparator<movie> orderByTitle = new Comparator<movie> () {
        @Override
        public int compare(movie t1, movie t) {
            return t1.getTitle().compareTo(t.getTitle());
        }
    };
}

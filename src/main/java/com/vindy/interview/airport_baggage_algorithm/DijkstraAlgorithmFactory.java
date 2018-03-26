package com.vindy.interview.airport_baggage_algorithm;

/**
 * Created by vindhya 
 */
public class DijkstraAlgorithmFactory {

    public static DijkstraAlgorithm createDijkstraAlgorithm(){
        return new DijkstraAlgorithmImpl();
    }
}

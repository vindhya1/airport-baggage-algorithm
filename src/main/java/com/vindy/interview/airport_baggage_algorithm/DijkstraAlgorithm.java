package com.vindy.interview.airport_baggage_algorithm;

import com.vindy.interview.airport_baggage_algorithm.model.DirectedEdge;

import java.util.List;

/**
 * Created by vindhya 
 */
public interface DijkstraAlgorithm {
    public String findShortestPath(String entry,String dest, List<DirectedEdge> graphEdges);
}

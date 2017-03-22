package com.epam.akka.model;

/**
 *
 * @author Siva Nagi Reddy Alla (Siva_Alla@epam.com)
 */
public class Term {

    private String name;
    private String rank;

    public Term() {
    }

    public Term(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    
}

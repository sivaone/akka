
package com.epam.akka.model;

import java.util.List;

/**
 *
 * @author Siva Nagi Reddy Alla (Siva_Alla@epam.com)
 */
public class Contract {
    private String name;
    private String rank;
    private int pCount;
    private int aCount;
    private int dCount;
    private int uCount;
    private List<Document> documentList;

    public Contract() {
    }

    public Contract(String name) {
        this.name = name;
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

    public int getpCount() {
        return pCount;
    }

    public void setpCount(int pCount) {
        this.pCount = pCount;
    }

    public int getaCount() {
        return aCount;
    }

    public void setaCount(int aCount) {
        this.aCount = aCount;
    }

    public int getdCount() {
        return dCount;
    }

    public void setdCount(int dCount) {
        this.dCount = dCount;
    }

    public int getuCount() {
        return uCount;
    }

    public void setuCount(int uCount) {
        this.uCount = uCount;
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }
    
    
}

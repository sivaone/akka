
package com.epam.akka;

import akka.actor.ActorSystem;
import akka.actor.Props;
import com.epam.akka.model.Contract;
import com.epam.akka.model.Document;
import com.epam.akka.model.Term;
import java.util.Arrays;

public class Main {
    static ActorSystem actorSystem = ActorSystem.create();
    
    public static void main(String[] args) {
        Props props = Props.create(ContractActor.class, null, null);
        
        actorSystem.actorOf(props, "Contract");
        
        
    }
    
    static Contract createContract(String name){
        Term t1 = new Term("one", "P");
        Term t2 = new Term("two", "P");
        Term t3 = new Term("three", "A");
        Term t4 = new Term("four", "D");
        
        Document d1 = new Document("d one");
        d1.setTermList(Arrays.asList(t1, t2, t3, t4));        
        Document d2 = new Document("d two");
        d1.setTermList(Arrays.asList(t1, t2, t3, t4));        
        Document d3 = new Document("d three");
        d1.setTermList(Arrays.asList(t1, t2, t3, t4));
        
        Contract c = new Contract("C one");
        c.setDocumentList(Arrays.asList(d1, d2, d3));
        
        return c;
    }
}

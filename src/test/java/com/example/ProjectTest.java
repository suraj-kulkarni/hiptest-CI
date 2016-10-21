package com.example;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

    
    public void testFindingASiteOnGoogle() {
        
        Actionwords actionwords = new Actionwords();
		
		actionwords.openP1("http://google.com");
        
        actionwords.searchForP1(" Hiptest");
        
        actionwords.aLinkToP1(" \" Hiptest - Agile test management tool\" results are shown. ");
    }
}

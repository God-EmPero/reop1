package com.gao.maven;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String str = "";
        if (StringUtils.isEmpty(str)) {
            System.out.println("str is " + null);
        } else {
            System.out.println("str is " + str);
        }
    }
}

package buoi3.demo1;

/**
 * File: CompositePatternExample.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 4:05 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class CompositePatternExample {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory dir1 = new Directory("Dir1");
        Directory dir2 = new Directory("Dir2");
        File file1 = new File("File1", 100);
        File file2 = new File("File2", 200);
        File file3 = new File("File3", 300);

        root.add(dir1);
        root.add(dir2);
        dir1.add(file1);
        dir1.add(file2);
        dir2.add(file3);

        root.showInfo();
    }
}

package buoi3.demo1;

/**
 * File: File.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 4:03 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class File implements FileSystem {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("File: " + name + " - Size: " + size + " bytes");
    }
}

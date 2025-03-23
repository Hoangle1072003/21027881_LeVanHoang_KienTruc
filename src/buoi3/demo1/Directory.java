package buoi3.demo1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * File: Directory.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 4:03 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }

    public void remove(FileSystem fs) {
        children.remove(fs);
    }


    @Override
    public void showInfo() {
        System.out.println("Directory: " + name);
        for (FileSystem fs : children) {
            fs.showInfo();
        }
    }
}

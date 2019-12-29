package com.tom.io.file;

import java.io.File;
import java.io.FileFilter;

/**
 * 过滤📁的过滤器
 */
public class FileFilterByDiretory implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory();
    }
}

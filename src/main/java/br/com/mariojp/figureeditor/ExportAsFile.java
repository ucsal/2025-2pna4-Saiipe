package br.com.mariojp.figureeditor;

import javax.swing.*;
import java.io.File;

public interface ExportAsFile {
    public void export(JComponent component, File file);
}
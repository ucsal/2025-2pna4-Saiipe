package br.com.mariojp.figureeditor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PngExporter implements ExportAsFile {

    @Override
    public void export(JComponent component, File file) {
        int width = component.getWidth();
        int height = component.getHeight();

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();

        component.paintAll(g2d);
        g2d.dispose();

        try {
            ImageIO.write(image, "png", file);
            System.out.println("Imagem exportada: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

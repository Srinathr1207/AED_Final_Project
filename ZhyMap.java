package com.nova;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ZhyMap {
    private static final ImageIcon map;
    private static final ImageIcon issuedMap;
    private static final String BUTTON_SHOW = "Show issues";
    private static final String BUTTON_HIDE = "Hide issues";

    static {
        try {
            URL url = ZhyMap.class.getResource("/map.png");
            assert url != null;
            BufferedImage bufferedImage = ImageIO.read(url);
            Image scaledImage = bufferedImage.getScaledInstance(800, 500, Image.SCALE_SMOOTH);
            map = new ImageIcon(scaledImage);

            url = ZhyMap.class.getResource("/issued-map.png");
            assert url != null;
            bufferedImage = ImageIO.read(url);
            scaledImage = bufferedImage.getScaledInstance(800, 500, Image.SCALE_SMOOTH);
            issuedMap = new ImageIcon(scaledImage);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    private final JButton button;
    private final JLabel mapLabel;
    private final JLabel issuedMapLabel;
    private final JPanel mainPanel;
    private boolean buttonShow = true;

    public ZhyMap() {
        mainPanel = new JPanel();
        button = new JButton();
        mapLabel = new JLabel(map);
        issuedMapLabel = new JLabel(issuedMap);
        issuedMapLabel.setVisible(false);
        button.setText(BUTTON_SHOW);
        button.addActionListener(this::toggleButton);
        mainPanel.add(mapLabel);
        mainPanel.add(issuedMapLabel);
        mainPanel.add(button);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ZhyMap");
        frame.setLayout(new BorderLayout());
        frame.setContentPane(new ZhyMap().mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void toggleButton(ActionEvent event) {
        buttonShow = !buttonShow;
        if (buttonShow) {
            button.setText(BUTTON_SHOW);
        } else {
            button.setText(BUTTON_HIDE);
        }
        mapLabel.setVisible(buttonShow);
        issuedMapLabel.setVisible(!buttonShow);
    }
}

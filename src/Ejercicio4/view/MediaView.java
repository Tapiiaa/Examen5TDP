package Ejercicio4.view;


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import Ejercicio4.composite.MediaComponent;
import Ejercicio4.composite.MediaComposite;

public class MediaView {
    private JFrame frame;
    private JTree mediaTree;

    public MediaView() {
        frame = new JFrame("Media Library");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
    }

    public void setMediaTree(MediaComponent media) {
        DefaultMutableTreeNode rootNode = buildTree(media);
        mediaTree = new JTree(rootNode);
        frame.add(new JScrollPane(mediaTree));
    }

    private DefaultMutableTreeNode buildTree(MediaComponent media) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(media.getName());
        if (media instanceof MediaComposite) {
            for (MediaComponent child : ((MediaComposite) media).getChildren()) {
                node.add(buildTree(child));
            }
        }
        return node;
    }

    public void show() {
        frame.setVisible(true);
    }
}

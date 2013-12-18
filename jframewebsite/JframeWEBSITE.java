package jframewebsite;



import javax.swing.*;
public class JframeWEBSITE {
   
    
    public static String s = "MINECRAFT UPDATES -- mcupdate.tumblr.com";
   
    
    public static void main(String[] args) throws Exception {
        JEditorPane website1 = new JEditorPane("http://www.mcupdate.tumblr.com");
        website1.setEditable(false);
        JFrame websiteframe = new JFrame();
        websiteframe.add(new JScrollPane(website1));
        websiteframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        websiteframe.setVisible(true);
        websiteframe.setSize(1300, 650);
    }
}

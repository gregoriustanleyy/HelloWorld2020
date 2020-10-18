import javax.swing.JFrame;

class Clubs{

  public static void main(String[] args) {
    ClubsCheckbox cc = new ClubsCheckbox();
    boolean[] categories = cc.clubsCategories;
    cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cc.setVisible(true);
    if(categories[0]){
      //display all clubs in cs
    }
    if(categories[1]){
      //display all clubs in ds
    }
    if(categories[2]){
      //display all clubs in math
    }
  }
}

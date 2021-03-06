package Runners;

import java.io.IOException;

import jigsaw.Jigsaw;
import jigsaw.JigsawNode;

public class RunnerPart2 {
  /**
   * @param args
   * @throws IOException 
   */
  public static void main(String[] args) throws IOException {
    
    if (JigsawNode.getDimension() != 5) {
      System.out.println("Wrong dimension of nodes, please change the dimension of JigsawNode to 5");
      return;
    }
    
    // destNode: {25,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,0};
    JigsawNode destNode = new JigsawNode(new int[]{25,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,0});      

    JigsawNode startNode = Jigsaw.scatter(destNode, 1000);
    //JigsawNode startNode = new JigsawNode(new int[]{19,8,7,9,23,10,3,19,5,4,14,2,20,11,6,15,22,13,16,0,1,21,12,18,24,17});

    Jigsaw jigsaw = new Jigsaw(startNode, destNode);

    jigsaw.ASearch();
  }

}

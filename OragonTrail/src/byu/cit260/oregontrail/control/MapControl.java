/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

/**
 *
 * @author Moose
 */
public class MapControl {

 public static Map createMap( int noOfRows,int noOfColumns);  
 
    if noOfRows < 0 OR numOfColumns < 0;
    return null;
 endif
 if items is null OR its length is < 1
 RETURN null
 endif
Map map = new Map object
save the noOfRows in the map
save the noOfColumns in the map
locations = createLocations(noOfRows, noOfColumns)
Assign the locations array to the map
scenes = createScenes()
questions = createQuestions()
assignQuestionsToScenes()
assignItemsToScenes() 
        

   private static Location[][] createLocations(int rows,int columns);

   private static Scene[] createScenes();
private static Question[] createQuestions();
private static void assignQuestionsToScenes(Question[] questions,
 Scene[] scenes)
private static void assignItemsToScenes(InventoryItem[] items,
 Scene[] scenes)
private static void assignScenesToLocations(
 Scene[] scenes,
 Location[][] locations)

        }
    

   

       
     

    
    }
    

package sumit.solidprinciple;

import java.io.File;

/**
 * O -> Open/Close Principle
 * Open for extension and close for modification
 */
public class OpenClose {

}

class SaveToFile{
    public void saveFileToLocal(File file){
        // Save to file
    }

    public void saveFileToS3(File file){
        // Save file to S3
    }
}

/**
 * Now if we have any requirement to save the file to S3
 * So, we don't have to write code like below
 *
 * class SaveToFile{
 *     public void saveFileToLocal(){
 *         // Save to file
 *     }
 *
 *     public void saveFileToS3(){
 *         // Save file to S3
 *     }
 * }
 *
 * If we require some functionality from existing class we can extend it else we can write a separate class.
 * We should not touch the existing tested classes. Let's see with the example
 */

interface SaveFile{
    public void save(File file);
}

class SaveFileToLocal implements SaveFile {
    public void save(File file){
        // Provide implementation
    }
}

class SaveFileToS3 implements SaveFile {
    public void save(File file){
        // Provide implementation
    }
}

/**
 * With the above we have the extensibility feature. Now let say tomorrow if we need to
 * implement another method which will save the file to DB we can simply do that without
 * changing the existing behaviour.
 *
 * EG ::
 */

class SaveFileToDB implements SaveFile{
    public void save(File file){
        // Provide implementation.
    }
}

/**
 * That's how we achieve open/close principle.
 */
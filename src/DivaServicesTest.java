
import ch.unifr.diva.DivaServicesCommunicator;
import ch.unifr.diva.DivaServicesConnection;
import ch.unifr.diva.exceptions.CollectionException;
import ch.unifr.diva.exceptions.MethodNotAvailableException;
import ch.unifr.diva.request.DivaCollection;
import ch.unifr.diva.request.DivaServicesRequest;
import ch.unifr.diva.returnTypes.DivaServicesResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lunactic
 */
public class DivaServicesTest {

    public static void main(String[] args) throws IOException, CollectionException, MethodNotAvailableException {
        DivaServicesConnection connection = new DivaServicesConnection("http://172.16.10.233:8080", 5);
        DivaServicesCommunicator communicator = new DivaServicesCommunicator(connection);

        
        //1. upload your own data
        //uploadData(communicator);

        //2. apply a method to your data
        //runMethod(communicator);
    }

    /**
     * 
     * Upload your data to DIVAServices
     *
     * @param communicator
     * @throws IOException
     */
    public static void uploadData(DivaServicesCommunicator communicator) throws IOException {
        //1. create a List<BufferedImage> and load some images into it
        //      (use ImageIO.read(new File("PathToFile"))
      
        //TODO ADD CODE HERE
        
        //2. create a DivaCollection using communicator.createCollection(images)
        
        //TODO ADD CODE HERE
        
        //3. Print out the name of the collection and store it somewhere
      
        //TODO ADD CODE HERE
        
    }

    /**
     * Run a method using DivaServices
     * 
     * 
     * @param communicator
     * @throws MethodNotAvailableException
     * @throws CollectionException
     * @throws IOException
     */
    public static void runMethod(DivaServicesCommunicator communicator) throws MethodNotAvailableException, CollectionException, IOException {
        //1. Create a DivaCollection using communicator.createCollection(String)
        //      Provide the name of the previously created collection
        
        //TODO ADD CODE HERE
        
        
        //2. Create a DivaServicesRequest with the collection
        
        //TODO ADD CODE HERE
        
        //3. Run the OtsuBinarization method using the request
        
        //TODO ADD CODE HERE
        
        //4. Get the response image using response.getImages().get(0)
        
        //TODO ADD CODE HERE
        
        //5. Save the output image to a file using ImageIO.write(...)

        //TODO ADD CODE HERE
        
    }

}

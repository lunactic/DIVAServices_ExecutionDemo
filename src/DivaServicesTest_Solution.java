
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
public class DivaServicesTest_Solution {

    public static void main(String[] args) throws IOException, CollectionException, MethodNotAvailableException {
        DivaServicesConnection connection = new DivaServicesConnection("http://localhost:8080", 5);
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
        
        List<BufferedImage> images = new LinkedList<>();
        BufferedImage image = ImageIO.read(new File("/home/lunactic/Documents/BGE_AdS_372_5_f171.jpg"));
        images.add(image);

        //2. create a DivaCollection using communicator.createCollection(images)
        
        DivaCollection collection = communicator.createCollection(images);

        //3. Print out the name of the collection and store it somewhere
      
        System.out.println(collection.getName());
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
        DivaCollection collection = communicator.createCollection("contentworsemousebird");
        
        //2. Create a DivaServicesRequest with the collection
        DivaServicesRequest request = new DivaServicesRequest(collection);

        //3. Run the OtsuBinarization method using the request
        DivaServicesResponse<Object> response = communicator.runKrakenBinarization(request);
        
        //4. Get the response image using response.getImages().get(0)
        BufferedImage binaryImage = response.getImages().get(0);
        
        //5. Save the output image to a file using ImageIO.write(...)
        ImageIO.write(binaryImage, "jpg", new File("/home/lunactic/Documents/binary_kraken.jpg"));
    }

}

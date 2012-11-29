package TrainController;

import java.util.Random;

public class Train{

    private char trackLine;
    private int trainID;
    private TrainModel trainModel;
    
    public Train(char p_trackLine, int p_trainID, int p_cars, double p_length, double p_height, double p_width){
        this.trackLine = p_trackLine;
        this.trainID = p_trainID;
        this.trainModel = new TrainModel(p_trainID, p_cars, p_length, p_height, p_width);
    }
    
    public int GetID(){
        return this.trainID;
    }
    
    public char GetLine(){
        return this.trackLine;
    }
    
    public void SetSpeed(double p_speed){
        trainModel.SetPointSpeed(p_speed);
    }
    
    public void SetAuthority(double p_authority){
        trainModel.SetAuthority(p_authority);
    }
    
    public void Stop(){
        trainModel.SetPointSpeed(0.0);
    }
    
    public boolean NearCrossing(){
        Random number = new Random();
        int hack = number.nextInt(2);
        if (hack == 1)
            return true;
        if (hack == 0)
            return false;
    }
}
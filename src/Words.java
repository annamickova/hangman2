import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words extends Display {
    protected List<String> listOfWords;
    protected String wordToGuess;
    protected int number;

    public Words(List<String> listOfWords, String wordToGuess, int number) throws Exception{
        this.listOfWords = listOfWords;
        this.wordToGuess = wordToGuess;
        setNumber(number);
    }

    public Words(int number) throws Exception {
        setNumber(number);
    }

    public List<String> getListOfWords() {
        return listOfWords;
    }
    public void setListOfWords(List<String> listOfWords) {
        this.listOfWords = listOfWords;
    }

    public String getWordToGuess() {
        return wordToGuess;
    }
    public void setWordToGuess(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) throws Exception{
        if (number <= 8 && number > 0){
            this.number = number;
        }else {
            throw new Exception("wrong input");
        }
    }



    public String selectWord(){
        listOfWords = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("words"+number+".txt"))){
            String line = "";
            while((line = br.readLine()) != null){
                listOfWords.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        Random rd = new Random();
        wordToGuess = listOfWords.get(rd.nextInt(listOfWords.size()));
        return wordToGuess;
    }
}

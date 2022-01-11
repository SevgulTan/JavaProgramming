package day11_Switch_Scanner;

public class Browsers {


    public static void main(String[] args) {

        String browserName ="chrome";
        String result ="";

        boolean validBrowser = browserName =="chrome"|| browserName ==" firefox" || browserName =="opera"
                || browserName =="safari" || browserName =="edge";

        if (validBrowser){
          if (browserName=="chrome"){
              result ="Chrome is selected.";
          }else if (browserName ==" firefox"){
              result ="Firefox is selected.";
          }else if (browserName =="opera"){
              result ="Opera is selected.";
          }else if (browserName =="safari"){
              result ="Safari is selected.";
          }else if (browserName =="edge"){
              result ="Edge is selected.";
          }

        }else{
            result ="Invalid Browser Name";

        }

        System.out.println(result);


    }
}

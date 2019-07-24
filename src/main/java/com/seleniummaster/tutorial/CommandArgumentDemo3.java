package com.seleniummaster.tutorial;
import org.apache.commons.cli.*;
public class CommandArgumentDemo3 {
    public static void main(String[] args){
//Create command line options object
                 Options options=new Options();
                   //Create option parameter n
                   Option base=new Option("n","number",true,"the base number");
                   base.setRequired(true);
                   options.addOption(base);
                   //Create option parameter p
                   Option power=new Option("p","powervalue",true,"exponent");
                   power.setRequired(true);
                   options.addOption(power);
                   //Create command line parser
                   CommandLineParser parser=new DefaultParser();
                   HelpFormatter formatter=new HelpFormatter();
                   CommandLine cmd;
                   try{
                           cmd=parser.parse(options,args);
                       }
                 catch (ParseException e)
                 {
                          System.out.println(e.getMessage());
                           formatter.printHelp("command -options",options);
                          System.exit(1);
                          return;
                       }
                 double baseNumber=Double.parseDouble(cmd.getOptionValue("n"));
                   double powerValue=Double.parseDouble(cmd.getOptionValue("p"));
                   System.out.println("Base number is: "+baseNumber + " Power value is: "+powerValue);
                   double finalResult=Math.pow(baseNumber,powerValue);
                   System.out.println(baseNumber+ " to the power of "+ powerValue + "="+finalResult);

    }
}

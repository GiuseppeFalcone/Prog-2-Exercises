package com.lab.lab2;

public class StringDemo {
    private String[] stringArray;
    private String longestString;

    public StringDemo(String[] stringArray){
        assert stringArray != null : "Error!\nString Array provided is NULL !!";
        this.stringArray = stringArray;
        longestString = " ";
    }
    public String getLongest(){
        setLongest();
        return longestString;
    }

    private void setLongest(){
        for(int ix = 0; ix < stringArray.length; ix++){
            if (stringArray[ix].length() > longestString.length()){
                longestString = stringArray[ix];
            }
        }
    }

    public String concatAll(){
        return makeConcat();
    }

    private String makeConcat(){
        String tmp = "";
        for(String str : stringArray) {
            tmp = tmp.concat(str);
        }
        return tmp;
    }

    public String trim(String str){
        assert str != null : "Error!\tString given as input is NULL !!";
        return makeTrim(str);
    }

    private String makeTrim(String str){
        char example = ' ';
        int left = 0;
        while(str.charAt(left) == example){
            ++left;
        }

        int right = str.length() - 1;
        while(str.charAt(right) == example){
            --right;
        }

        return str.substring(left, right+1);
    }

    public static void main(String[] args) {
        String[] array = {"Ciao", "giuseppe", "chehjgh"};
        StringDemo stringArray = new StringDemo(array);

        System.out.println("Longest String = " + stringArray.getLongest());

        System.out.println("All concatenated = " + stringArray.concatAll());

        System.out.println(stringArray.trim("   Ciao a tutti!    "));
    }

}

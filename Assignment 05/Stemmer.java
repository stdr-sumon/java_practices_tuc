package assignment5;

public class Stemmer {
    public static String[] getNGrams(String keyword, int number)
    {
        int aryLen = 1;
        int keywordLen = keyword.length();
        if (keywordLen >= number) {
            aryLen = keywordLen - number  + 1;
        }
        String[] nGramArr = new String[aryLen];
        if (number > keywordLen) {
            int count = 0;
            while (count < (number - keywordLen)) 
	    {
                keyword = keyword + "*";
                count++;
            }
            nGramArr[aryLen - 1] = keyword;
        } else {
            int index = 0; 
            for(int i = 0; i <= keywordLen - number; i++)
            {
                String strNgram = "";
                for(int j = i; j < i + number; j++)
                { 
                    strNgram = strNgram + keyword.charAt(j);
                }
                
                nGramArr[index] = strNgram;
                index++;
            }
        }
        
        return nGramArr;
    }
    
    public static String[] getShared(String[] arr1NGrams, String[] arr2NGrams) 
    {
        int sharedArrLen = 0;
        for(int  i = 0 ; i < arr1NGrams.length; i++)
        {
            for(int  j = 0 ; j < arr2NGrams.length; j++)
            {
                if (arr1NGrams[i].equals(arr2NGrams[j])) 
                {
                    sharedArrLen++;
                }
            }
        }
        
        if (sharedArrLen > 0) {
            String[] sharedGrams = new String[sharedArrLen];
            int shrIndx = 0;
            for(int  i = 0 ; i < arr1NGrams.length; i++)
            {
                for(int  j = 0 ; j < arr2NGrams.length; j++)
                {
                    if (arr1NGrams[i].equals(arr2NGrams[j])) 
                    {
                        sharedGrams[shrIndx] = arr1NGrams[i];
                        shrIndx++;
                    }
                }
            }
            return sharedGrams;
        } else {
            String[] emptyArr = {};

            return emptyArr;
        }
    }
    
    public static double getDistance(String[] arr1NGrams, String[] arr2NGrams) 
    {
        String[] sharedArray = getShared(arr1NGrams, arr2NGrams);
        return (double) sharedArray.length / (arr1NGrams.length + arr2NGrams.length);
    }
    
    public static boolean isRelevant(String keyword, String text) 
    {
        int len = 3;
        double leastDistance = 0.0;
        String[] keywordNGrams = getNGrams(keyword, len);
        String[] textSplit = text.split(" ");
        double[] arrDist = new double[textSplit.length];
        
        for(int  i = 0 ; i < textSplit.length; i++)
        {
            String[] textSplitNGrams = getNGrams(textSplit[i], len);
            arrDist[i] = (double) getDistance(keywordNGrams, textSplitNGrams);
            if (i > 0 && arrDist[i - 1] > 0.4) {
                arrDist[i] = arrDist[i - 1];
                leastDistance = arrDist[i];
            }
        }
        
        if (leastDistance > 0.4) {
            return true;
        } else {
            return false;
        }
    }
}

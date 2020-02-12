/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 794458
 */
public class ItemArray implements Serializable{
public ArrayList<String> finalArray;
public int code;
public String codex;

public ItemArray()
{
    finalArray = new ArrayList<String>();
    code=0;
    codex ="";
}

    /**
     * @return the finalArray
     */
    public ArrayList<String> getFinalArray() {
        return finalArray;
    }
    public String getFinalArrayElement(int index) {
        return finalArray.get(index);
    }

    /**
     * @param finalArray the finalArray to set
     */
    public void setFinalArray(ArrayList<String> finalArray) {
        this.finalArray = finalArray;
    }

    public void addFinalArray(String item)
    {
        finalArray.add(item);
        code++;
        codex = codex+code;
    }
    
    public void removeFinalArray(String item)
    {
        int counter=0;
        for(String oldItem: finalArray)
        {
            if(oldItem.equals(item))
            {
                finalArray.remove(counter);
                
                break;
            }
            else
            {
               counter++; 
            }
        }

    }
    public int getCode()
    {
        return code;
    }
    public int getSize()
    {
        return finalArray.size();
    }
}

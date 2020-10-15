package com.cybertek.tests.day16_ddf;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {


    @Test
    public void readExcelFile(){

        //create an object from excel ultils class
        // it accepts 2 parameters
        // 1 . location of the file
        // 2 , sheet that we want to use

        ExcelUtil qa3short = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");

        // how many rows in the sheet

        System.out.println("qa3short.rowCount() = " + qa3short.rowCount());

        // how many colums in the sheet

        System.out.println("qa3short.columnCount() = " + qa3short.columnCount());

        // get all colums names

        System.out.println("qa3short.getColumnsNames() = " + qa3short.getColumnsNames());

        // get all data in list of maps (related to collections)

        List<Map<String, String>> dataList = qa3short.getDataList();

        for (Map<String, String> onerow : dataList) {
            System.out.println(onerow);
        }


        // get nona as a value

        System.out.println("dataList.get(2) = " + dataList.get(2).get("firstname"));


        // get harbor as a result


        System.out.println("dataList.get(8).get(\"lastname\") = " + dataList.get(8).get("lastname"));


        // get all data in 2 d array

        String [][] dataArray = qa3short.getDataArray();
        System.out.println(Arrays.deepToString(dataArray));

    }


}

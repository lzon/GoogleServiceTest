package com.example.myapplication;

import android.graphics.Paint;

import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.annotation.SmartTable;

/**
 * Created by huang on 2017/11/4.
 */
@SmartTable(name = "人员信息统计")
public class PM25 {
    @SmartColumn(id =1,name = "姓名")
    private String name;
    @SmartColumn(id=2,name="年龄")
    private int age;
    @SmartColumn(id=3,name="身高")
    private int height;
    @SmartColumn(id=4,name="工资")
    private int salary;
    @SmartColumn(id=5,name="有没有女朋友")
    private int haveFriendy;


}
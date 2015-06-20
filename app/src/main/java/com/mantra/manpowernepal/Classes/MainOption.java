package com.mantra.manpowernepal.Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yubraj on 6/20/15.
 */
public class MainOption {

    public String title;

    public MainOption(String title){
        this.title = title;
    }

    public static List<MainOption> getDrawableDataList(){
        List<MainOption> optionList = new ArrayList<MainOption>();
        optionList.add(new MainOption("Jobs"));
        optionList.add(new MainOption("News"));
        optionList.add(new MainOption("Notices"));
        optionList.add(new MainOption("Forms"));
        optionList.add(new MainOption("Discussions"));

        return  optionList;
    }
}

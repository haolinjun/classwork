package pers.fjl.papercheck;

import org.junit.Before;
import pers.fjl.papercheck.file.FileInput;
import pers.fjl.papercheck.service.impl.SimHashImpl;

public class Test {
    String origin="E:\\ideawenjian\\paperpass\\src\\main\\resources\\orig.txt";
    String[] s={
            "E:\\ideawenjian\\paperpass\\src\\main\\resources\\orig_0.8_add.txt",
            "E:\\ideawenjian\\paperpass\\src\\main\\resources\\orig_0.8_del.txt",
            "E:\\ideawenjian\\paperpass\\src\\main\\resources\\orig_0.8_dis_1.txt",
            "E:\\ideawenjian\\paperpass\\src\\main\\resources\\orig_0.8_dis_10.txt",
            "E:\\ideawenjian\\paperpass\\src\\main\\resources\\orig_0.8_dis_15.txt"};

    @org.junit.Test
    public void addTest(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[0]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+String.format("%.2f", 100-distance*100/128)+"%");
    }

    @org.junit.Test
    public void delTest(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[1]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+String.format("%.2f", 100-distance*100/128)+"%");
    }

    @org.junit.Test
    public void dis_1Test(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[2]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+String.format("%.2f", 100-distance*100/128)+"%");
    }

    @org.junit.Test
    public void dis_10Test(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[3]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+String.format("%.2f", 100-distance*100/128)+"%");
    }

    @org.junit.Test
    public void dis_15Test(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[4]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+String.format("%.2f", 100-distance*100/128)+"%");
    }


}

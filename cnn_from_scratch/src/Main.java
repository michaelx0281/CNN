package cnn_from_scratch.src;

import java.util.List;

import cnn_from_scratch.src.data.DataReader;
import cnn_from_scratch.src.data.Image;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello, World! It has been a pretty long while since I have used Java!");

        System.out.println(
                "The goal of this project is to create a convolution neural network which is able to classify a bunch of handwritten numbers!");
        List<Image> images = new DataReader().readData(("data/mnist_test"));

        /*
         * This is actually seen as one of the easiest tasks to start with from within
         * ML (and it really shows how far we have gotten)
         * 
         * However, it does make me question the reliability of those CAPCHA tests with
         * weirdly written letters
         */
    }
}
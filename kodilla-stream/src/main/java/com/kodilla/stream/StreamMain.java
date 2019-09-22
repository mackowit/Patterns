package com.kodilla.stream;

import com.kodilla.stream.beautyfier.PoemBeautyfier;

public class StreamMain {
          public static void main(String[] args) {

              PoemBeautyfier poemBeautyfier = new PoemBeautyfier();

              poemBeautyfier.beautify("Lorem ipsum dolor", (poemToDecorate -> "ABC" + poemToDecorate + "ABC"));
              poemBeautyfier.beautify("Lorem ipsum dolor", (poemToDecorate -> poemToDecorate.toUpperCase()));
              poemBeautyfier.beautify("Lorem ipsum dolor", (poemToDecorate -> poemToDecorate.replace('o', '2')));
              poemBeautyfier.beautify("Lorem ipsum dolor", (poemToDecorate -> {
                  String decoratedPoem = "";
                  for(int i =0; i<poemToDecorate.length(); i++) {
                      decoratedPoem = decoratedPoem + poemToDecorate.charAt(poemToDecorate.length()-(1+i));
                  }
                  return decoratedPoem;
              }));


          }
}


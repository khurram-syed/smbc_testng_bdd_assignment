package com.smbc.anagram;

import java.util.Arrays;

public class AnagramChecker {

  public boolean isAnagram(String s1, String s2){
      if( s1 == null || s2 == null ) return false;

      String str1 = s1.replaceAll("\\s+", "").toLowerCase();
      String str2 = s2.replaceAll("\\s+", "").toLowerCase();

      if(str1.length() != str2.length()) return false;

      char[]  strCh1 = str1.toCharArray();
      char[]  strCh2 = str2.toCharArray();

      Arrays.sort(strCh1);
      Arrays.sort(strCh2);

      return Arrays.equals(strCh1, strCh2);
  }
}

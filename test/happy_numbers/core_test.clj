(ns happy-numbers.core-test
  (:use midje.sweet)
  (:use [happy-numbers.core]))

(facts 
  (facts
    "about detecting happy numbers"
    
    (happy? 1) => true
    (happy? 4) => false
    (happy? 7) => true
    (happy? 10) => true
    (happy? 31) => true)
  
  (facts
    "about happy numbers under a given number (see http://mathworld.wolfram.com/HappyNumber.html)"
    
    (happy-numbers-under 100) => '(1 7 10 13 19 23 28 31 32 44 49 68 70 79 82 86 91 94 97)))

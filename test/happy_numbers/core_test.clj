(ns happy-numbers.core-test
  (:use midje.sweet)
  (:use [happy-numbers.core]))

(facts 
  "about happy numbers"
  
    (happy? 1) => true
    (happy? 4) => false
    (happy? 10) => true)

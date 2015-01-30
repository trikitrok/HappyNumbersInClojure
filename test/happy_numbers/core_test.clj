(ns happy-numbers.core-test
  (:use midje.sweet)
  (:use [happy-numbers.core]))

(facts 
  "about happy numbers"
  (fact 
    "one is happy"
    (happy? 1) => true))

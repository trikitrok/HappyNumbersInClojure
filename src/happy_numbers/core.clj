(ns happy-numbers.core)

(declare 
  parse-int)

(defn happy? [n]
  (= (reduce + (map #(* % %)(map parse-int (str n)))) 1))

(defn- parse-int [ch]
  (Integer/parseInt (str ch)))

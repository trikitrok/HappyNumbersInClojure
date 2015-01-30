(ns happy-numbers.core)

(declare 
  parse-int,
  square)

(defn happy? [n]
  (= (reduce + (square (map parse-int (str n)))) 1))

(defn- parse-int [ch]
  (Integer/parseInt (str ch)))

(def ^:private square  
  (partial map #(* % %)))

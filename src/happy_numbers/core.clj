(ns happy-numbers.core)

(declare 
  parse-int
  square
  digits-in)

(defn happy? [n]
  (= (reduce + (square (digits-in n))) 1))

(defn- parse-int [ch]
  (Integer/parseInt (str ch)))

(def ^:private square  
  (partial map #(* % %)))

(defn- digits-in [n]
  (map parse-int (str n)))

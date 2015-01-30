(ns happy-numbers.core)

(declare 
  parse-int
  square
  digits-in
  sum-squares-of
  one-digit?)

(defn happy? [n]
  (if (one-digit? n)
    (= (sum-squares-of (digits-in n)) 1)
    (= (sum-squares-of 
         (digits-in (sum-squares-of (digits-in n)))) 1)))

(defn- parse-int [ch]
  (Integer/parseInt (str ch)))

(def ^:private square  
  (partial map #(* % %)))

(defn- digits-in [n]
  (map parse-int (str n)))

(defn- sum-squares-of [digits]
  (reduce + (square digits)))

(defn- one-digit? [n]
  (= 1 (count (digits-in n))))

(ns happy-numbers.core)

(declare 
  parse-int
  square
  digits-in
  sum-squares-of
  one-digit?)

(defn happy? [n]
  (let [sum-squared-digits (sum-squares-of (digits-in n))]
    (if (one-digit? sum-squared-digits)
      (= sum-squared-digits 1)
      (recur sum-squared-digits))))

(defn happy-numbers-under [n]
  (filter happy? (range 1 n)))

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

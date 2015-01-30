(ns happy-numbers.core)

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

(defn- happy-num? [n]
  (let [sum-squared-digits (sum-squares-of (digits-in n))]
    (if (one-digit? sum-squared-digits)
      (= sum-squared-digits 1)
      (recur sum-squared-digits))))

(def happy? (memoize happy-num?))

(defn happy-numbers-under [n]
  (filter happy? (range 1 n)))
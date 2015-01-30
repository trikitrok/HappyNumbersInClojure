(ns happy-numbers.core)

(defn happy? [n]
  (= (reduce + (map #(* % %)(map #(Integer/parseInt (str %)) (str n)))) 1))

(ns euler-1.core
  (:gen-class))

(defn divisible [value] (or (= (rem value 3) 0) (= (rem value 5) 0)))
(defn -main
  "Calculate sum of all integers >= 0 and < 1000 that are divisible by 3 or 5"
  [& args]
  (println (reduce + (filter divisible (range 1 1000)))))

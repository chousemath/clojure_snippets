(ns clojure-practice-1.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "This is an addition by Joseph")
  (println (first ["This is the first element" "Second" "Third"]))
  (println "The value below should be 6")
  (println (+ 1 2 3))
  (println "The value below should be 24")
  (println (* 2 3 4))
  (do (println "This is a combined call!")
      (println (+ 10 10 12)))

  (do (println "This is another combined call with more elements!")
      (println "\t 1. Element 1")
      (println "\t 2. Element 2")
      (println "\t 3. Element 3")))

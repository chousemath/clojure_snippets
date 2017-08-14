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
      (println "\t 3. Element 3"))
  (do (println ["an element" "another element"])
      (println (str "Hello " "world!"))
      (println (str "Trying out " "some string " "concatenation")))
  (if true
      (println "The truth condition should be activated!")
      (println "This should not be activated..."))
  (println (= 2 (+ 1 1)))
  (if (= 6 (+ 1 2 3))
      (println "Indeed, you have 6!")
      (println "You do not have 6"))
  (if (> 6 5)
      (do (println "6 is indeed greater than 5!")
          (println "The above statement should be that 6 is greater than 5"))
      (println "6 is not greater than 5...?"))
  (if (< 3 2)
      (println "This should not be activated...")
      (do (println "The condition is false!")
          (println "This branch should be activated!")))
  (when (> 5 1)
      (println "5 should always")
      (println "Just to make sure you know...5 should always be greater than 1"))
  (when (nil? (+ 1 2))
        (println "That is strange... 1 + 2 should not be nill")
        (println "You should not see this statement..."))
  (when (= (* 2 5) 10)
        (println "Yay! 2*5=10")
        (println "I guess you didn't fail basic math"))
  ; `or` returns either the first truthy value or the last value
  (println (or nil false "This should be returned!!!"))
  (println (or (= 1 3) (> 4 5) "I believe this should be returned..."))
  (println (or 1 "This should not be returned"))
  ; `and` returns the first falsey value or the last truthy value
  (println "The value printed directly below should be `nil`")
  (println (and nil "ha" "yo"))
  (println "The value printed directly below should be `false`")
  (println (and "jaeho" false "hadouken"))
  (println "5 should be printed below")
  (println (and 1 2 3 4 5))
  ; you use def to bind values in Clojure
  (def my-name
    ["Joseph Sungpil Choi"])
  (println (str "Hi there! My name is " (first my-name)))
  (def ages
    [27 13 89 99])
  (println (str "The very last age should be " (last ages)))

  ; please note that it is now `defn` NOT `def`
  (defn greeting
    [name]
    (str "Hi there " name))

  (println (greeting "Joseph Choi"))

  (defn greetings
    [greeting-number]
    (case greeting-number
      1 "Aloha there!"
      2 "Hey there sexy"
      3 "Wazzuuuuup"
      "Greetings ^^"))

  (println (greetings 1))
  (println (greetings 2))
  (println (greetings 3))
  (println (greetings 999))

  (println 1/5)

  ; Clojure only allows double quotes for strings
  (defn add-noise
    [phrase]
    (str phrase " ASLDFJASDLFKAJSDF"))

  (println (add-noise "Hey you..."))
  (println (str "printing an " "empty map"))
  (println {})
  (println (str "Now printing some maps" " with keywords" "..."))
  (println {:first-name "Joseph" :middle-name "Sungpil" :last-name "Choi"})
  (println {:plus + :minus - :multiply *})
  ; here is an example of some nested maps
  (println {:first-map {:element-1 "yo!" :element-2 "lo!"} :second-map {:element-1 "potato"}})
  (println {:dogs {:first "Retriever" :second "Poodle"} :cats {:first "Siamese" :second "Tiger"}})
  (println (hash-map :first "Joseph" :middle "Sungpil" :last "Choi"))
  (println (hash-map :dogs (hash-map :first "woof" :second "bark!")))
  (def my-map-1 {:first "Joseph" :middle "Sungpil" :last "Choi"})
  (println (str "My first name is " (get my-map-1 :first)))
  (println (str "My middle name is " (get my-map-1 :middle)))
  (println (str "My last name is " (get my-map-1 :last)))
  (println (str "My full name is " (get my-map-1 :first) " " (get my-map-1 :middle) " " (get my-map-1 :last)))
  (println (get my-map-1 :second "Default Name: Bob!"))
  (println (get-in {:a "yolo" :b {:a "bro" :b "hadouken"}} [:b :b]))
  (println (str "You can also treat maps like " ({:a "functions" :b "variables"} :a)))
  (println (:y (:x {:x {:y "oh yeah!" :t "spam"} :n "Spanky!"})))
  (println (str "The zeroeth value of the vector is "(get [44 33 22] 0)))
  ; vectors can be of mixed types!
  (println (str "I was looking for `Hadouken!` => " (:a (get ["bla" {:a "Hadouken!" :b "yo"} 1] 1)))))

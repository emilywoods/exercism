(ns anagram
  (:require [clojure.string :as str]))

(defn sort-word 
  [word]
  (reduce str ""  (sort (seq (str/lower-case word) ) ) )
  )

(defn map-words
  [word]
  (hash-map (sort-word word) (str/lower-case word) ) )

(defn anagrams-for 
  [word input-list]
   (let [anagram-map (map-words word) ]
     (filter (fn [list-item]
               (and (contains? anagram-map (sort-word list-item) )
                    (not= (str/lower-case word) list-item)))
    input-list )))




(ns word-count
  (require [clojure.string :as str])
  )

(defn word-count [input-text]
  (frequencies
    (remove empty? (str/split (str/lower-case input-text) #"\s|[^a-zA-Z0\d+]"))
    )
)

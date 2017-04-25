(ns bob)

(defn response-for [input]
  (cond
    (re-matches #"\s+|" input) (str "Fine. Be that way!")
    (re-matches #"\D[a-z\s+\?]+|\A[\d+\?]+" input) (str "Sure.")
    (re-matches #"[\sA-Z0-9,]*[!|?]|[\sA-Z0-9%^*(?#$@!]*"  input) (str "Whoa, chill out!") 
    :else (str "Whatever.")
    )
  )

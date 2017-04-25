(ns rna-transcription)

(defn to-rna [input] 
  (def rna {"C" "G" "G" "C" "T" "A" "A" "U"})
  (if (nil? (re-find #"^[CGAT]+$" input))
    (assert false))
  (clojure.string/replace input
              (re-pattern (apply str (interpose "|" (map #(java.util.regex.Pattern/quote %) (keys rna)))))
          rna)
  )

(ns for-clojure.core)

(defn partially-flatten
  "Partially flatten a sequence (#93)"
  [coll]
  (filter #(and (sequential? %) (not (sequential? (first %))))
    (tree-seq sequential? seq coll)))

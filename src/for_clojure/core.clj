(ns for-clojure.core)

(defn partially-flatten
  "Partially flatten a sequence (#93)"
  [coll]
  (map flatten x))

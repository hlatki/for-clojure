(ns for-clojure.core)

(defn partially-flatten
  "Partially flatten a sequence (#93)"
  [coll]
  (map flatten coll))

(defn id-key-vals
  "Identify keys and values (#105)"
  [vect]
  (loop [acc-map {}
         rest-vect (rest vect)
         k (first vect)
         v []
         i (first rest-vect)]
    (cond
      (nil? k) {}
      (nil? i) (assoc acc-map k v)
      (keyword? i) (recur (assoc acc-map k v)
                          (rest rest-vect)
                          i
                          []
                          (first (rest rest-vect)))
      (number? i)  (recur acc-map
                          (rest rest-vect)
                          k
                          (conj v i)
                          (first (rest rest-vect)))
      :else acc-map)))

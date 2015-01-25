(ns for-clojure.core-test
  (:require [clojure.test :refer :all]
            [for-clojure.core :refer :all]))

(deftest problem-93
  (testing "Partially flatten a sequence (#93)"
    (is (= (partially-flatten [["Do"] ["Nothing"]]) [["Do"] ["Nothing"]]))
    (is (= (partially-flatten [[[[:a :b]]] [[:c :d]] [:e :f]])
   [[:a :b] [:c :d] [:e :f]]))
    (is (= (partially-flatten '((1 2)((3 4)((((5 6)))))))
   '((1 2)(3 4)(5 6))))))

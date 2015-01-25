(ns for-clojure.core-test
  (:require [clojure.test :refer :all]
            [for-clojure.core :refer :all]))

(deftest problem-105
  (testing "Identify keys and values (#105)"
    (is (= {} (id-key-vals [])))
    (is (= {:a [1]} (id-key-vals [:a 1])))
    (is (= {:a [1], :b [2]} (id-key-vals [:a 1, :b 2])))
    (is (= {:a [1 2 3], :b [], :c [4]} (id-key-vals [:a 1 2 3 :b :c 4])))))

(deftest problem-93
  (testing "Partially flatten a sequence (#93)"
    (is (= (partially-flatten [["Do"] ["Nothing"]]) [["Do"] ["Nothing"]]))
    (is (= (partially-flatten [[[[:a :b]]] [[:c :d]] [:e :f]])
   [[:a :b] [:c :d] [:e :f]]))
    (is (= (partially-flatten '((1 2)((3 4)((((5 6)))))))
   '((1 2)(3 4)(5 6))))))



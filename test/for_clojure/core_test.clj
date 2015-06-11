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

(deftest problem-108
  (testing "Smallest number in all sorted seqs"
    (= 3 (smallest-num-in-all-seqs [3 4 5]))
    (= 4 (smallest-num-in-all-seqs [1 2 3 4 5 6 7] [0.5 3/2 4 19]))
    (= 7 (smallest-num-in-all-seqs (range) (range 0 100 7/6) [2 3 5 7 11 13]))
    (= 64 (smallest-num-in-all-seqs (map #(* % % %) (range)) ;; perfect cubes
              (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2
              (iterate inc 20)))))

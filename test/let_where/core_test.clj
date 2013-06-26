(ns let-where.core-test
  (:require [clojure.test :refer :all]
            [let-where.core :refer :all]))

(deftest let-where-test
  (testing "Correct conversion to 'let' form."
    (is (= [4 8 12]
           (let-where
             (map go coll)
             :where [go #(* 4 %)
                     coll [1 2 3]])))))

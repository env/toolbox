(ns toolbox.core-test
  (:require [clojure.test :refer :all]
            [toolbox.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(run-tests *ns*)

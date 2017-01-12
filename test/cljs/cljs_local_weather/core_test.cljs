(ns cljs-local-weather.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [cljs-local-weather.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))

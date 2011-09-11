(ns ch1.t5)

(def p (fn [] (p)))

(def test (fn [x y] (if (= x 0) 0 y)))
(println (test 0 (p)))

(ns ch1.t6)

(def new-if (fn [predicate then-clause else-clause] (cond (predicate) then-clause
                                                      :else else-clause)))

(println (new-if (fn [] (= 2 3)) 0 5))
(println (new-if (fn [] (= 1 1)) 0 5))

(def square (fn [x] (* x x)))

(def abs (fn [a] (if (> a 0) a (- a))))

(def good-enough? (fn [guess x] (< (abs (- (square guess) x)) 0.001)))

(def average (fn [x y] (/ (+ x y) 2)))

(def improve (fn [guess x] (average guess (/ x guess))))

(def sqrt-iter (fn [guess x] (new-if (good-enough? guess x)        ;if
                               guess
                               (sqrt-iter (improve guess x)
                                 x))))

(println (sqrt-iter 1.0 100000000))

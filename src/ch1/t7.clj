(ns ch1.t7)

(def square (fn [x] (* x x)))

(def abs (fn [a] (if (> a 0) a (- a))))

;(def good-enough? (fn [guess x] (<= (abs(/ (- (square guess) x) x)) 0.001)))
(def good-enough? (fn [guess x] (< (abs (- (square guess) x)) 0.001)))

(def average (fn [x y] (/ (+ x y) 2)))

(def improve (fn [guess x] (average guess (/ x guess))))

(def sqrt-iter (fn [guess x] (if (good-enough? guess x)
                               guess
                               (sqrt-iter (improve guess x)
                                 x))))

(println (sqrt-iter 1.0 4))
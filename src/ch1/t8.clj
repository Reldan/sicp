(ns ch1.t8)

(def square (fn [x] (* x x)))

(def cube (fn [x] (* x x x)))

(def abs (fn [a] (if (> a 0) a (- a))))

(def good-enough? (fn [guess x] (<= (abs (- (cube guess) x)) 0.001)))

(def improve (fn [guess x] (/ (+ (/ x (square guess)) (* 2 guess)) 3)))

(def cube-iter (fn [guess x] (if (good-enough? guess x)
                               guess
                               (cube-iter (improve guess x)
                                 x))))

(println (cube-iter 8.0 8.0))
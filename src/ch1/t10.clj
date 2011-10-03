(ns ch1.t10)

(def A (fn [x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (A (- x 1)
                (A x (- y 1))))))

(println (A 1 10))
(println (A 2 4))
(println (A 3 3))

(def f (fn [n] (A 0 n)))
(def g (fn [n] (A 1 n)))
(def h (fn [n] (A 2 n)))

(println (f 5.))
(println (g 5.))
(println (h 5.))

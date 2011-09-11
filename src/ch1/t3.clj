(ns ch1.t3)

(def sum_square (fn [x y] (+ (* x x) (* y y))))

(def sum_square_max (fn [x y z] (cond
                                  (and (>= x y) (>= z y)) (sum_square x z)
                                  (and (>= x y) (>= y z)) (sum_square x y)
                                  (and (>= y x) (>= z x)) (sum_square y z)
                                  (and (>= y x) (>= x z)) (sum_square y x)
                                  )))

(println (sum_square_max 0 0 0))
(println (sum_square_max 1 0 0))
(println (sum_square_max 1 0 2))
(println (sum_square_max 0 5 2))
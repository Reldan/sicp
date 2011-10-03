(ns ch1.t9)

(def + (fn [a b] (if (= a 0)
                   b
                   (inc (+ (dec a) b)))))


(println (+ 50000000 3))



(def + (fn [a b] (if (= a 0)
                   b
                   (+ (dec a) (inc b)))))


(println (+ 50000000 3))
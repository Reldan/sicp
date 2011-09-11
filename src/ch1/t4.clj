(ns ch1.t4)

(def a-plus-abs-b (fn [a b] ((if (> b 0) + -) a b)))

(println (a-plus-abs-b 3 4))
(println (a-plus-abs-b 0 0))
(println (a-plus-abs-b 4 -3))

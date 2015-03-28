(ns probs-from-4clj.core)

;; problem 1 (Elementary)
(def nothing-but-the-truth-solution true)


;; problem 2 (Elementary)
(def simple-math-solution 4)


;; problem 3 (Elementary)
(def intro-to-strings-solution "HELLO WORLD")

;; problem 4 (Elementary)
(def intro-to-lists-solution (list :a :b :c))

;; problem 5 (Elementary)
(def lists-conj-solution '(1 2 3 4))

;; problem 6 (Elementary)
(def intro-to-vectors-solution [:a :b :c])

;; problem 7 (Elementary)
(def vectors-conj-solution [1 2 3 4])

;; problem 8 (Elementary)
(def intro-to-sets-solution #{:a :b :c :d})

;; problem 9 (Elementary)
(def sets-conj-solution 2)

;; problem 10 (Elementary)
(def intro-to-maps-solution 20)

;; problem 11 (Elementary)
(def maps-conj-solution {:b 2})

;; problem 12 (Elementary)
(def intro-to-sequences-solution 3)

;; problem 13 (Elementary)
(def sequences-rest-solution '(20 30 40))

;; problem 14 (Elementary)
(def intro-to-functions-solution 8)

;; problem 15 (Elementary)
(defn double-down-solution
  [x]
  (* 2 x))

;; problem 16 (Elementary)
(defn hello-world-solution
  [s] ;; update args as needed
  (str "Hello, " s "!"))

;; problem 17 (Elementary)
(def sequences-map-solution '(6 7 8))

;; problem 18 (Elementary)
(def sequences-filter-solution '(6 7))

;; problem 19 (Easy)
;; restrictions: last
(defn last-element-solution
  [[x & xs]]
  (if-not (seq xs)
    x
    (recur xs)))

;; problem 20 (Easy)
(defn penultimate-element-solution
  [coll] ;; update args as needed
  (second (reverse coll)))

;; problem 21 (Easy)
;; restrictions: nth
(defn nth-element-solution
  [coll n]
  (first (drop n coll)))

;; problem 22 (Easy)
;; restrictions: count
(defn count-a-sequence-solution
  [coll]
  (loop [a 0 coll coll]
    (if (seq coll)
      (recur (+ a 1) (rest coll))
      a)))

;; problem 23 (Easy)
;; restrictions: reverse, rseq
(defn reverse-a-sequence-solution
  [coll] ;; update args as needed
  (loop [acc () coll coll]
    (if (seq coll)
      (recur (conj acc (first coll)) (rest coll))
      acc)))

;; problem 24 (Easy)
(defn sum-it-all-up-solution
  [coll] ;; update args as needed
  (reduce + 0 coll))

;; problem 25 (Easy)
(defn find-the-odd-numbers-solution
  [coll]
  (filter odd? coll))

;; problem 26 (Easy)
(defn fibonacci-sequence-solution
  [n]
  (letfn [(fib [a b] (cons a (lazy-seq (fib b (+ b a)))))]
    (take n (fib 1 1))))


;; problem 27 (Easy)
(defn palindrome-detector-solution
  [x]
  (= (seq x) (reverse (seq x))))

;; problem 28 (Easy)
;; restrictions: flatten
(defn flatten-a-sequence-solution
  [coll] ;; update args as needed
  (filter (complement sequential?)
          (rest (tree-seq sequential? seq coll))))

;; problem 29 (Easy)
(defn get-the-caps-solution
  [s] ;; update args as needed
  ;; Write a function which takes a string and returns a new string containing only the capital letters.
  (apply str (filter #(Character/isUpperCase %) s)))


;; problem 30 (Easy)
(defn compress-a-sequence-solution
  [coll] ;; update args as needed
  (loop [acc [] coll coll]
    (cond
      (not (seq coll)) (seq acc)
      (= (last acc) (first coll)) (recur acc (rest coll))
      :else (recur (conj acc (first coll)) (rest coll)))))


;; problem 31 (Easy)
(defn pack-a-sequence-solution
  [coll] ;; update args as needed
  (loop [acc [] coll coll]
    (if (seq coll)
      (let [x (first coll)
            xs (take-while #(= x %) coll)]
        (recur (conj acc xs) (drop (count xs) coll)))
      (seq acc))))


;; problem 32 (Easy)
(defn duplicate-a-sequence-solution
  [coll] ;; update args as needed
  (seq (reduce #(conj (conj %1 %2) %2)
               [] coll)))


;; problem 33 (Easy)
(defn replicate-a-sequence-solution
  [coll n] ;; update args as needed
  (apply concat
         (reduce #(conj %1 (repeat n %2)) [] coll)))


;; problem 34 (Easy)
;; restrictions: range
(defn implement-range-solution
  ([start end] (implement-range-solution start end start))
  ([start end n]
   (when (< n end)
     (cons n (lazy-seq (implement-range-solution start end (inc n)))))))


;; problem 60 (Medium)
;; restrictions: reductions
(defn sequence-reductions-solution
  ([f [x & coll]] (sequence-reductions-solution f x coll))
  ([f a [x & coll]]
   (if (or x coll)
     (lazy-seq (cons a (sequence-reductions-solution f (f a x) coll))
               )
     (cons a nil))))

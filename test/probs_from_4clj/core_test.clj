(ns probs-from-4clj.core-test
  (:require [clojure.test :refer :all]
            [probs-from-4clj.core :refer :all]))

;; problem 1
(deftest can-nothing-but-the-truth
  (is (= nothing-but-the-truth-solution true)))


;; problem 2
(deftest can-simple-math
  (is (= (- 10 (* 2 3)) simple-math-solution)))


;; problem 3
(deftest can-intro-to-strings
  (is (= intro-to-strings-solution (.toUpperCase "hello world"))))


;; problem 4
(deftest can-intro-to-lists
  (is (= intro-to-lists-solution '(:a :b :c))))


;; problem 5
(deftest can-lists-conj
  (is (= lists-conj-solution (conj '(2 3 4) 1)))
  (is (= lists-conj-solution (conj '(3 4) 2 1))))


;; problem 6
(deftest can-intro-to-vectors
  (is (= intro-to-vectors-solution (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))


;; problem 7
(deftest can-vectors-conj
  (is (= vectors-conj-solution (conj [1 2 3] 4)))
  (is (= vectors-conj-solution (conj [1 2] 3 4))))


;; problem 8
(deftest can-intro-to-sets
  (is (= intro-to-sets-solution (set '(:a :a :b :c :c :c :c :d :d))))
  (is (= intro-to-sets-solution (clojure.set/union #{:a :b :c} #{:b :c :d}))))


;; problem 9
(deftest can-sets-conj
  (is (= #{1 2 3 4} (conj #{1 4 3} sets-conj-solution))))


;; problem 10
(deftest can-intro-to-maps
  (is (= intro-to-maps-solution ((hash-map :a 10, :b 20, :c 30) :b)))
  (is (= intro-to-maps-solution (:b {:a 10, :b 20, :c 30}))))


;; problem 11
(deftest can-maps-conj
  (is (= {:a 1, :b 2, :c 3} (conj {:a 1} maps-conj-solution [:c 3]))))


;; problem 12
(deftest can-intro-to-sequences
  (is (= intro-to-sequences-solution (first '(3 2 1))))
  (is (= intro-to-sequences-solution (second [2 3 4])))
  (is (= intro-to-sequences-solution (last (list 1 2 3)))))


;; problem 13
(deftest can-sequences-rest
  (is (= sequences-rest-solution (rest [10 20 30 40]))))


;; problem 14
(deftest can-intro-to-functions
  (is (= intro-to-functions-solution ((fn add-five [x] (+ x 5)) 3)))
  (is (= intro-to-functions-solution ((fn [x] (+ x 5)) 3)))
  (is (= intro-to-functions-solution (#(+ % 5) 3)))
  (is (= intro-to-functions-solution ((partial + 5) 3))))


;; problem 15
(deftest can-double-down
  (is (= (double-down-solution 2) 4))
  (is (= (double-down-solution 3) 6))
  (is (= (double-down-solution 11) 22))
  (is (= (double-down-solution 7) 14)))


;; problem 16
(deftest can-hello-world
  (is (= (hello-world-solution "Dave") "Hello, Dave!"))
  (is (= (hello-world-solution "Jenn") "Hello, Jenn!"))
  (is (= (hello-world-solution "Rhea") "Hello, Rhea!")))


;; problem 17
(deftest can-sequences-map
  (is (= sequences-map-solution (map #(+ % 5) '(1 2 3)))))


;; problem 18
(deftest can-sequences-filter
  (is (= sequences-filter-solution (filter #(> % 5) '(3 4 5 6 7)))))


;; problem 19
(deftest can-last-element
  (is (= (last-element-solution [1 2 3 4 5]) 5))
  (is (= (last-element-solution '(5 4 3)) 3))
  (is (= (last-element-solution ["b" "c" "d"]) "d")))


;; problem 20
(deftest can-penultimate-element
  (is (= (penultimate-element-solution (list 1 2 3 4 5)) 4))
  (is (= (penultimate-element-solution ["a" "b" "c"]) "b"))
  (is (= (penultimate-element-solution [[1 2] [3 4]]) [1 2])))


;; problem 21
(deftest can-nth-element
  (is (= (nth-element-solution '(4 5 6 7) 2) 6))
  (is (= (nth-element-solution [:a :b :c] 0) :a))
  (is (= (nth-element-solution [1 2 3 4] 1) 2))
  (is (= (nth-element-solution '([1 2] [3 4] [5 6]) 2) [5 6])))


;; problem 22
(deftest can-count-a-sequence
  (is (= (count-a-sequence-solution '(1 2 3 3 1)) 5))
  (is (= (count-a-sequence-solution "Hello World") 11))
  (is (= (count-a-sequence-solution [[1 2] [3 4] [5 6]]) 3))
  (is (= (count-a-sequence-solution '(13)) 1))
  (is (= (count-a-sequence-solution '(:a :b :c)) 3)))


;; problem 23
(deftest can-reverse-a-sequence
  (is (= (reverse-a-sequence-solution [1 2 3 4 5]) [5 4 3 2 1]))
  (is (= (reverse-a-sequence-solution (sorted-set 5 7 2 7)) '(7 5 2)))
  (is (= (reverse-a-sequence-solution [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])))


;; problem 24
(deftest can-sum-it-all-up
  (is (= (sum-it-all-up-solution [1 2 3]) 6))
  (is (= (sum-it-all-up-solution (list 0 -2 5 5)) 8))
  (is (= (sum-it-all-up-solution #{4 2 1}) 7))
  (is (= (sum-it-all-up-solution '(0 0 -1)) -1))
  (is (= (sum-it-all-up-solution '(1 10 3)) 14)))


;; problem 25
(deftest can-find-the-odd-numbers
  (is (= (find-the-odd-numbers-solution #{1 2 3 4 5}) '(1 3 5)))
  (is (= (find-the-odd-numbers-solution [4 2 1 6]) '(1)))
  (is (= (find-the-odd-numbers-solution [2 2 4 6]) '()))
  (is (= (find-the-odd-numbers-solution [1 1 1 3]) '(1 1 1 3))))


;; problem 26
(deftest can-fibonacci-sequence
  (is (= (fibonacci-sequence-solution 3) '(1 1 2)))
  (is (= (fibonacci-sequence-solution 6) '(1 1 2 3 5 8)))
  (is (= (fibonacci-sequence-solution 8) '(1 1 2 3 5 8 13 21))))


;; problem 27
(deftest can-palindrome-detector
  (is (false? (palindrome-detector-solution '(1 2 3 4 5))))
  (is (true? (palindrome-detector-solution "racecar")))
  (is (true? (palindrome-detector-solution [:foo :bar :foo])))
  (is (true? (palindrome-detector-solution '(1 1 3 3 1 1))))
  (is (false? (palindrome-detector-solution '(:a :b :c)))))


;; problem 28
(deftest can-flatten-a-sequence
  (is (= (flatten-a-sequence-solution '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (is (= (flatten-a-sequence-solution ["a" ["b"] "c"]) '("a" "b" "c")))
  (is (= (flatten-a-sequence-solution '((((:a))))) '(:a))))


;; problem 29
(deftest can-get-the-caps
  (is (= (get-the-caps-solution "HeLlO, WoRlD!") "HLOWRD"))
  (is (empty? (get-the-caps-solution "nothing")))
  (is (= (get-the-caps-solution "$#A(*&987Zf") "AZ")))


;; problem 30
(deftest can-compress-a-sequence
  (is (= (apply str (compress-a-sequence-solution "Leeeeeerrroyyy")) "Leroy"))
  (is (= (compress-a-sequence-solution [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (is (= (compress-a-sequence-solution [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))


;; problem 31
(deftest can-pack-a-sequence
  (is (= (pack-a-sequence-solution [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
  (is (= (pack-a-sequence-solution [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
  (is (= (pack-a-sequence-solution [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))))


;; problem 32
(deftest can-duplicate-a-sequence
  (is (= (duplicate-a-sequence-solution [1 2 3]) '(1 1 2 2 3 3)))
  (is (= (duplicate-a-sequence-solution [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
  (is (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))


;; problem 33
(deftest can-replicate-a-sequence
  (is (= (replicate-a-sequence-solution [1 2 3] 2) '(1 1 2 2 3 3)))
  (is (= (replicate-a-sequence-solution [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
  (is (= (replicate-a-sequence-solution [4 5 6] 1) '(4 5 6)))
  (is (= (replicate-a-sequence-solution [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (replicate-a-sequence-solution [44 33] 2) [44 44 33 33])))


;; problem 34
(deftest can-implement-range
  (is (= (implement-range-solution 1 4) '(1 2 3)))
  (is (= (implement-range-solution -2 2) '(-2 -1 0 1)))
  (is (= (implement-range-solution 5 8) '(5 6 7))))


;; problem 60
(deftest can-sequence-reductions
  (is (= (take 5 (sequence-reductions-solution + (range))) [0 1 3 6 10]))
  (is (= (sequence-reductions-solution conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
  (is (= (last (sequence-reductions-solution * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)))

;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname |hw 21|) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
;Team Nautica: Kartik, Walter, Jamie
;IntroCs Pd7
; Hw 21 Een Vrushuh Vee Haf Zees Ness Ting Dulls
; 2019/10/08
;returns the greater of its two numeric inputs
(define MAX2
  (lambda (a b)
    (max a b)))
(MAX2 0 0)"...0"
(MAX2 3 2)"...3"
(MAX2 4 5)"...5"
; returns the greatest of its three numeric inputs.
(define MAX3
  (lambda (a b c)
    (max a b c)))
(MAX3 1 1 1)"...1"

(MAX3 3 2 1)"...3"

(MAX3 4 6 5)"...6"

(MAX3 7 8 9)"...9"
; returns the greatest of its 4 numeric inputs.
(define MAX4
  (lambda (a b c d)
    (max a b c d)))
(MAX4 1 1 1 1)"...1"
(MAX4 1 2 3 4)"...4"
(MAX4 8 9 5 4)"...9"
(MAX4 1 3 5 7)"...7"
; returns the greatest of its 5 numeric inputs
(define MAX5
  (lambda (a b c d e)
    (max a b c d e)))
(MAX5 1 2 3 4 5)"...5"
(MAX5 1 3 5 7 9)"...9"
(MAX5 7 10 40 50 60)"...60"
(MAX5 8 10 12 17 19)"...19"


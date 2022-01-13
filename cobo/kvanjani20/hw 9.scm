;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname |hw 9|) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
;Kartik Vanjani
;Intro CS Pd 7
;Hw 9 Write A procedure give it a name
;2019/09/18
; DrRacket stepper basically alllows you to put in a given
; expression, and then shows each step of how the answer of the expression
; is determined. You can goback and forward to see the steps.
(define foo
  (lambda (d)
    (+ 0 d)))
(foo 1)
"... should be 1"
(foo 0)
"... should be 0"
(foo 10)
"... should be 10"
(define AreaCirc
  (lambda (R)
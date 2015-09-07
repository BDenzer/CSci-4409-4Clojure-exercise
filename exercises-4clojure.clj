;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #10: Intro to maps

; What I pasted in the box:

20

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #16: Hello world

; What I pasted in the box:

#(str "Hello, " % "!")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #17: Sequences: map

; What I pasted in the box:

'(6 7 8)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #18 - Sequences: filter

; What I pasted in the box:

'(6 7)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 20 - Penultimate Element

; What I pasted in the box:

#(nth % (-(dec (count %))1))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 21 - Nth Element

; What I pasted in the box:

#(.get %1 %2)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 23 - Reverse a Sequence

; What I pasted in the box:



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #18 - Sequences: filter

; What I pasted in the box:

'(6 7)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #18 - Sequences: filter

; What I pasted in the box:

'(6 7)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #18 - Sequences: filter

; What I pasted in the box:

'(6 7)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #18 - Sequences: filter

; What I pasted in the box:

'(6 7)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #18 - Sequences: filter

; What I pasted in the box:

'(6 7)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #18 - Sequences: filter

; What I pasted in the box:

'(6 7)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #18 - Sequences: filter

; What I pasted in the box:

'(6 7)

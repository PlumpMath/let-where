(ns let-where.core)

(defmacro let-where
  "Allow let bindings after code, similar to Haskell's where clause.
   ex. (let-where
         (map go xs)
         :where [go #(* 4 %)
                 xs [1 2 3]])"
  [code kw bindings]
  `(let ~bindings ~code))

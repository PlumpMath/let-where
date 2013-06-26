# Introduction to let-where

Macro 'let-where' to allow let bindings to follow code forms like Haskell's
'where' keyword."

## Usage

```Clojure
    (let-where forms :where bindings)
```

## Example

```Clojure
    (let-where
      (do (println s)
          (println t))
      :where [s "howdy neighbor!"
              t "how you doing?"])
```

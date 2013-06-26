# let-where

This is a toy to familiarize myself with Clojure workflow. It may prove useful
to someone.

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

## License

Copyright © 2013 Christopher Rooney

Distributed under the Eclipse Public License, the same as Clojure.

(def foo (clojure.xml/parse "http://search.twitter.com/search.atom?&q=clojure"))
(print foo)
"uhcns"
(class (* 1000 1000 1000))
(print "Hello\nWorld!!!")
(.toUpperCase "lower case letter")
(def dick {:one "one" :two 2})
(:one dick)
(dick :two)
(defstruct book :title :autor)
(def aBook (struct book "The C Programming Language" "Brian"))
(println (.toString aBook))
(struct-map book :title "Code Complete" :year 2009)
(def aSetOfStrings #{:one :two :three})
(count aSetOfStrings)
; this is a single line comment
(keyword? :foo)


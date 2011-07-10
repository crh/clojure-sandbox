(ns tokenize
  (:import (java.io BufferedReader FileReader)))

(defn process-file [file-name line-func line-acc]
  (with-open [rdr (BufferedReader. (FileReader. file-name))]
    (reduce line-func line-acc (line-seq rdr)))
)

(defn process-line [acc line]
  (+ acc 1))

(prn (process-file "foo.txt" process-line 0))
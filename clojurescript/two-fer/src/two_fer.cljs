(ns two-fer)

(defn two-fer [name] ;; <-- arguments come here.
  ;; your code goes here.
  (if (string? name)
    (str "One for ", name, ", one for me.")
    (str "One for you, one for me."))
  )

(ns annalyns-infiltration)

(defn can-fast-attack?
  "Returns true if a fast-attack can be made, false otherwise."
  [knight-awake?]
  (not knight-awake?)
  )

(defn can-spy?
  "Returns true if the kidnappers can be spied upon, false otherwise."
  [knight-awake? archer-awake? prisoner-awake?]
  (or knight-awake? archer-awake? prisoner-awake?)
  )

(defn can-signal-prisoner?
  "Returns true if the prisoner can be signalled, false otherwise."
  [archer-awake? prisoner-awake?]
  (if (and prisoner-awake? (false? archer-awake?))
    true
    false)
  )

(defn can-free-prisoner?
  "Returns true if prisoner can be freed, false otherwise."
  [knight-awake? archer-awake? prisoner-awake? dog-present?]
  (if (false? archer-awake?)
    (if (or prisoner-awake? dog-present?) 
      (if (and knight-awake? prisoner-awake?)
        (if dog-present?
          true
          false)
        true)
      false)
    false)
  )

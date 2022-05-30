(ns bird-watcher)

(def last-week 
  [0 2 5 3 7 8 4]
  )

(defn today [birds]
  (last birds)
  )

(defn inc-bird [birds]
  (loop [hasil [] burung birds]
    (cond 
      (empty? burung) hasil
      (= 1 (count burung)) (recur (conj hasil (inc (first burung))) (rest burung))
      :else (recur (conj hasil (first burung)) (rest burung))))
  )

(defn day-without-birds? [birds]
  (cond 
    (zero? (first birds)) true
    (= 1 (count birds)) false
    :else (day-without-birds? (rest birds)))
  )

(defn n-days-count [birds n]
  (apply + (take n birds))
  )

(defn busy-days [birds]
  (loop [burung birds hasil 0]
    (cond
      (empty? burung) hasil
      (<= 5 (first burung)) (recur (rest burung) (inc hasil))
      :else (recur (rest burung) hasil)))
  )

(defn odd-week? [birds]
  (if (= birds [1 0 1 0 1 0 1])
    true
    false)
  )

(defproject aerial.msgpacket "0.0.1"
  :description "Messaging envelope protocol and implementations"
  :url "https://github.com/aerial/msgpacket"
  :license {:name "The MIT License (MIT)"
            :url  "http://opensource.org/licenses/MIT"
            :distribution :repo}
  :min-lein-version "2.3.3"
  :global-vars {*warn-on-reflection* false
                *assert* true}

  :dependencies
  [[org.clojure/clojure        "1.8.0"]
   [org.clojure/core.async     "0.1.346.0-17112a-alpha"]
   [org.clojure/tools.reader   "1.0.0-beta3"]
   [com.cognitect/transit-clj  "0.8.259"]
   [http-kit                   "2.1.19"]
   [com.taoensso/timbre        "3.3.1"]  ; Logger
   [com.taoensso/encore        "1.22.0" :exclusions [org.clojure/tools.reader]]
   ]
  :aot :all

  :repositories
  {"lclrepo" "file:lclrepo"
   "sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"})

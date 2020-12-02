def call(propname){
   try{
      echo "loadsecops groovy execution"
      def toolsJsoncontent = libraryResource "globaltools.json"
      if (toolsJsoncontent == null)
           error("unable to read json file")
      splitvalue= propname.split("//.")
       toolsprop = readJSON text: toolsJsoncontent
      echo "${splitvalue[0]}"
      return toolsprop."${splitvalue[0]}"."${splitvalue[1]}"."${splitvalue[2]}"
   
   }catch(err){
       error("caught exception in loadsecops.groovy file")
   }

}

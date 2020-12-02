def call(propname){
   try{
      echo "loadsecops groovy execution"
      def toolsJsonContent = libraryResource "globaltools.json"
      echo "json file loaded"
      if (toolsJsonContent == null)
           error("unable to read json file")
      def splitvalue= propname.split("\\.")
      toolsprop = readJSON text: toolsJsonContent
      echo "${splitvalue[0]}"
      return toolsprop."${splitvalue[0]}"."${splitvalue[1]}"."${splitvalue[2]}"
   
   }catch(err){
       error("caught exception in loadsecops.groovy file")
   }

}

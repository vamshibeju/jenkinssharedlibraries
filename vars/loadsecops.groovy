def call(propname){
   try{
      echo "loadsecops groovy execution"
      def toolsJsoncontent = libraryResource "globaltools.json"
      if (toolsJsoncontent == null)
           error("unable to read json file")
       toolsprop = readJSON text: toolsJsoncontent
       return toolsprop.whitehat.test
   
   }catch(err){
       error("caught exception in loadsecops.groovy file")
   }

}

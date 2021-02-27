def call(){
  try {
      echo "start of unittests"
      def testtrendpath= ""
      junit "${testtrendpath}"
  }catch(err){
      error("caught exception in mvnunittest.groovy")
  }

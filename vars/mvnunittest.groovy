def call(){
  try {
      echo "start of unittests"
      //def testtrendpath= ""
      //junit "${testtrendpath}"
      mvn test
   }catch(err){
      error("caught exception in mvnunittest.groovy")
  }

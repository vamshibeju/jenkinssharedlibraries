def call() {
    try{

           sh script: "mvn -Dmaven.test.skip=false clean install "
   
    }catch(err){
        error("caught exception in execMaven.groovy")
    }

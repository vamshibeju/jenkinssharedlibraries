def call(){

def fileWriter = new FileWriter("/var/lib/jenkins/workspace/creatingxmljob/test.xml");
@NonCPS

def peopleBuilder = new groovy.xml.MarkupBuilder(fileWriter)
      peopleBuilder.people {
                  person {
               	 firstName('John')
               	 lastName('Doe')
               	 age(25)
           		 }
      }        
        fileWriter.close();

}

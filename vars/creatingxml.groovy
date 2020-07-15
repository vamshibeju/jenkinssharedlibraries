def call(){

def fileWriter = new FileWriter("/var/lib/jenkins/workspace/creatingxmljob/test.xml");

def peopleBuilder = new groovy.xml.MarkupBuilder(fileWriter)
def peopleBuilder1= "peopleBuilder.people {
                  person {
               	 firstName('John')
               	 lastName('Doe')
               	 age(25)
           		 }"
        
        fileWriter.close();
}
}

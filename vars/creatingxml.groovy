def call(){
def fileWriter = new FileWriter("test.xml")
	fileWriter.setExecutable(true, false);

def peopleBuilder = new groovy.xml.MarkupBuilder(fileWriter)
peopleBuilder.people {
            person {
                firstName('John')
                lastName('Doe')
                age(25)
            }
            person {
                firstName('Jane')
                lastName('Smith')
                age(31)
            }
        }
        fileWriter.close();
		
}

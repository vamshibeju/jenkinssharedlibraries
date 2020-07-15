import groovy.xml.MarkupBuilder
	
	 def fileWriter = new FileWriter("test1.xml")
        def peopleBuilder = new MarkupBuilder(fileWriter)
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
		

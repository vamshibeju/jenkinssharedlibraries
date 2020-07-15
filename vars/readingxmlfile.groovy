 def stringWriter = new StringWriter()
        def peopleBuilder = new MarkupBuilder(stringWriter)
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
        def xml = stringWriter.toString()
        println xml

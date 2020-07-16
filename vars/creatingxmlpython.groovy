@Library("sharedlibraries") _
pipeline{
    agent any 
    stages{
        stage(creatingxml){
            steps{
                script{

           load(createxml.py)
        }
    }
    }
}
}

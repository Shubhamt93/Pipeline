node {
    stage ('Pull') {
       git 'https://github.com/Shubhamt93/Pipeline.git'
     }
    stage ('Build') {
        sh '''ls
               pwd'''
     }
    stage ('Deploy') {
       //
     }
    }
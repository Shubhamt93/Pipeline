node {
    stage ('Pull') {
       git 'https://github.com/Shubhamt93/Pipeline.git'
     }
    stage ('Build') {
        //
     }
    stage ('Deploy') {
       //
     }
    }
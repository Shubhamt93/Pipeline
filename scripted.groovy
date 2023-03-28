node {
    stage ('Pull') {
    git 'https://github.com/Shubhamt93/Pipeline.git'
     }
    stage ('Test') {
        //
     }
    stage ('Deploy') {
       //
     }
    }
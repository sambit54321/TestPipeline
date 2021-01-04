def info(message) {
    stage("${message}"){
        echo "INFO: ${message}"
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'd6e325bf-86b3-4327-8824-ab8a2bf202de', url: 'https://github.com/sambit54321/d8-multisite.git']]])
    }
}

def warning(message) {
    stage("Warning"){
        echo "WARNING: ${message}"
    }
}
def info(message) {
    stage("Info"){
        echo "INFO: ${message}"
    }
}

def warning(message) {
    stage("Warning"){
        echo "WARNING: ${message}"
    }
}
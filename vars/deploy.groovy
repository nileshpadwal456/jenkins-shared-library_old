def deploy(Map args) {
  node {
    stage('Deploy') {
      echo "Command: ${args.command}"
    }
  }
  return this
}
def build(Map args) {
  node {
    stage('Build') {
      echo "Command: ${args.command}"
    }
  }
  return this
}
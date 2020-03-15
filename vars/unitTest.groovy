def unitTest(Map args) {
  node {
    stage('Unit Test') {
      echo "Command: ${args.command}"
    }
  }
  return this
}
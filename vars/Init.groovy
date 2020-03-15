def call(Map args) {
  node {
    def build = args.jsl.com.mycompany.jenkins.Build.new(this)
    build.setBuildDescription([
      title      : "#${env.BUILD_NUMBER} My build title",
      description: 'My build description'
    ])
  }
  return this
}





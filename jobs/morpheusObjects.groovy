pipelineJob('Create groups,users,clouds') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials('pvt-key')
                        github('paramasivamsathyaprakash/repo', 'ssh', 'github.com')
                    }
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}

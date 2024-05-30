pipeline {
    agent any

    stages {
        stage('Send Test Email') {
            steps {
                script {
                    def sender = 'bolarinwa29@gmail.com'
                    def recipients = 'bolarinwa29@gmail.com'
                    def subject = 'Test Email: Reminder for Worship Songs'
                    def body = """
                        Hi David,

                        This is just a test email to remind you that we need the worship songs.

                        Best regards,
                        David Bolarinwa
                    """
                    
                    emailext (
                        subject: subject,
                        body: body,
                        to: recipients,
                        from: sender
                    )
                }
            }
        }
    }
}

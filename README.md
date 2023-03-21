# Scientific-Calculator-MiniProject

This project a mini-project as part of the course Software Production Engineering. We build a menu driven program for a scientific calculator using the DevOps tools chain.

This is a scientific calculator program with user menu driven operations give as:

● Square root function - √x
● Factorial function - x!
● Natural logarithm (base е) - ln(x)
● Power function - xb\

The DevOps pipeline includes:

● We use GitHub as the source control management tool and Git as the Version Control System.
● For testing our code we use JUnit.
● To build the code we use Maven.
● For Continuous Integration(CI) we use Jenkins.
● To Containerize the code we use Docker and we push the created Docker image to Docker hub.
● We do the configuration management and deployment using Chef/Ansible. We use these we do configuration management and pull our docker image and run it on the managed hosts.
● For Deployment we can either do it on our local machine or on Kubernetes cluster or OpenStack cloud. We can also use Amazon AWS or Google Cloud.
● For monitoring we use the ELK stack. We use a log file to do the monitoring. We generate the log file for our project and pass in our ELK stack.

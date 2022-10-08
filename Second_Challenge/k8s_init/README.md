# "hostname.sh" This script creates 5 files:
## 1. hosts - contains the list of ip and hostname and to be copied to each node /etc/hosts with ansible playbook
## 2. hosts.txt - contains the list of ip and credentials for ansible to ssh to each node
## 3. ansible.cfg - contains rules for easier execution for ansible
## 4. k8s_init.sh - contains the list of commands to be executed on all nodes to initialze the cluster
## 5. playbook.yml - ansible playbook to to copy hosts file to each node and execute k8s_init.sh
## 6. token.sh - contains the command to get the token to join the cluster (created on master node and fetched from master node to be used on worker nodes)

&nbsp;

# What it does:
## a. Execute terraform to create the infrastructure
## b. Get into each node and set hostname according to user input
## c. Creates the files
## d. Copies the hosts file to each node
## e. Executes the k8s_init.sh on each node
## f. Gets the token from master node
## g. Executes the token.sh on each worker node
## h. Executes the token.sh on each node to join the cluster
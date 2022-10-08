# DevOps Task

## First Challenge - Has a powerpoint presenting:
- ### How to optimize and save IT costs and lower aws services costs
- ### And some of the benfits of CI/CD & Release Automation

## Second Challenge:
1. ### Provision infrastructure using terraform then initialize the infrastructure & running jenkins on master node as a contianer using ansible
   - #### Using script (k8s_init/hostname.sh) to provision 3 instances on aws then initialize the infrastructure using ansible using the following command:
      ```bash
      bash k8s_init/hostname.sh
      ```
   - #### After executing the script on your local machine you will get 3 instances on aws with the following names:
      - #### master
      - #### worker1
      - #### worker2
2. ### Now after we have the infrastructure and jenkins ready open jenkins console on your browser:
   ```
   http://<master_ip>:8080
   ```
   ### Then create a new pipeline & copy Jenkinsfile script then paste it in pipeline groovy script section then click on build now
   ### the pipeline will run and will create a docker image for the app then will deploy it on kubernetes cluster using: 
      - #### Deployment yaml file
      - #### NodePort Service yaml file
## Now you can access the app on your browser using the following url:
```
http://<master_ip>:30007
```
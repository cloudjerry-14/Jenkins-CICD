# Multi stage multi Agent jenkins pipeline

We have written a 2 stage pipeline which will run on 2 different agents 
We are using docker containers as agents
the first container is be a maven container and the second is a node container

The execution flow of the multi stage pipeline is asynchronous and hence after every successful stage the respective containers will exit

# spring-websocket-rabbitmq-integration
Demo project to show rabbitmq integration

### Installing rabbitmq on Ubuntu
sudo apt install rabbitmq-server  
sudo rabbitmq-plugins enable rabbitmq_management  
sudo rabbitmq-plugins enable rabbitmq_web_stomp  

### Installing rabbitmq on CentOS
sudo yum -y install epel-release  
sudo yum -y install rabbitmq-server  
sudo systemctl start rabbitmq-server  
sudo systemctl enable rabbitmq-server  
sudo rabbitmq-plugins enable rabbitmq_management  
sudo rabbitmq-plugins enable rabbitmq_web_stomp  
sudo systemctl restart rabbitmq-server  

http://localhost:15672  
user/pass: guest/guest

### Running WS client
http://localhost:8080


opt/apache/conf/tomcat-user.xml'**

2

3

4

<role rolename="admin-gui"/> <role rolename="manager-gui"/>

<role rolename="manager-status"/>

ryseedb3.g...

ENKINS

6

<role rolename="manager-script"/>
<role rolename="manager-jmx"/>
<user username="tomcat" password="redhat" roles="admin-gui,manager-gui, manager-stat
manager-script, manager-jmx"/>

'vim /opt/apache-tomcat-8.5.51/webapps/manager/META-INF/context.xml

<!--Valve className="org.apache.catalina.valves.RemoteAddrValve" allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" / -->
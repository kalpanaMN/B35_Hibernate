package metaINF;

<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
 
http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
 version="2.0">
<persistence-unit name="JPA-PU" transaction-type="RESOURCE_LOCAL">
<provider>org.hibernate.ejb.HibernatePersistence</provider>
<properties>
<property name="javax.persistence.jdbc.driver"
value="com.mysql.jdbc.Driver" />
 <property name="javax.persistence.jdbc.url"
value="jdbc:mysql://localhost:3306/B35" />
 <property name="javax.persistence.jdbc.user" value="root" />
 <property name="javax.persistence.jdbc.password"
value="jenny" />
<!-- for auto create/update table -->
<property name="hibernate.hbm2ddl.auto" value="update"/>
 
</properties>
</persistence-unit>
</persistence>
public class Persistance {

}

### Hibernate Standalone test application.

Run a MySQL DB using podman/docker:
```
podman pull quay.io/rhn_support_abaral1/my-mysql
```
```
podman run -d -p 3306:3306 --name my-mysql -e MYSQL_ROOT_PASSWORD=supersecret my-mysql
```

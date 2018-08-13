<<<<<<< HEAD
#!/bin/bash
while ! nc -z ${MYSQL_IP} ${MYSQL_PORT}; do sleep 3; done
=======
#!/bin/bash
while ! nc -z ${MYSQL_IP} ${MYSQL_PORT}; do sleep 3; done
>>>>>>> 4795b04fc59e2539df36bfaa7102e4dc3bfac9ff
echo "${MYSQL_IP}:${MYSQL_PORT}"
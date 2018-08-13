# JavaTest5

git clone https://github.com/caojiameng/JavaTest5.git

cd JavaTest5

sh build.sh

再打开一个gitbash，进入刚才的项目目录
cd Exam1

mvn spring-boot:run

再打开一个gitbashm,进入刚才的项目目录

cd Exam1

curl http://localhost:8080/film/signin/{MARY}{SMITH}

curl http://localhost:8080/film/all

curl -H "Content-Type:application/json" -X POST -d '{"firstName":"cao","lastName":"jiameng","email":"825901384@qq.com","addressId":"5","storeId":"1"}' http://localhost:8080/film/add

curl -H "Content-Type:application/json" -X DELETE  '{"customerId":1}' http://localhost:8080/user/delete/1
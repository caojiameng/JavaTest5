# JavaTest5

git clone https://github.com/caojiameng/JavaTest5.git

cd JavaTest5

sh build.sh

再打开一个gitbash，进入刚才的项目目录
cd Exam1

mvn spring-boot:run

再打开一个gitbashm,进入刚才的项目目录

cd Exam1

## 查看是否可以登录
curl http://localhost:8080/film/signin/{MARY}{SMITH}

## 查询
curl http://localhost:8080/film/all

## 添加
curl -H "Content-Type:application/json" -X POST -d '{"firstName":"cao","lastName":"jiameng","email":"825901384@qq.com","addressId":"5","storeId":"1"}' http://localhost:8080/film/add

## 更新
curl -H "Content-Type:application/json" -X POST -d '{"firstName":"cao1","lastName":"jiameng","email":"825901384@qq.com","addressId":"5","storeId":"1","customerId":"1"}' http://localhost:8080/film/update

## 删除
curl -H "Content-Type:application/json" -X DELETE  '{"customerId":1}' http://localhost:8080/film/delete/1

## 可用以下语句查询修改后的Person表
curl  http://localhost:8080/film/person/all
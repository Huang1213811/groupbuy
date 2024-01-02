
奇奇怪怪的毕设之社区团购管理系统


如何启动？

拉取项目后，修改 `application.yml` 中的数据库连接信息后启动即可  

默认用户名密码 admin(123456)  

如果不正确，可以再测试类 `GroupbuyApplicationTests.java` 中，加密密码后，直接改数据库 `user` 表中的 `password` 字段即可。

前端项目详见 https://github.com/cornerbear/groupbuy_Vue  

、输入命令npm install，重新安装依赖。

、输入命令npm run build 打包。

、最后输入命令npm run dev/npm run serve（或者npm rum xxx）后项目成功运行。
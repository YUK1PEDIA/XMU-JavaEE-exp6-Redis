# Redis 缓存的效率

## Info

厦门大学信息学院 2022 级软件工程专业大三上学期课程——JavaEE平台技术实验六代码

All code is written by YUKIPEDIA



## 注意事项

配置文件 `application.yaml` 中的数据库服务器 url 里的 `mysql` 需要修改本地 host 文件：

在 host 文件中添加 `mysql <你的mysql服务器公网ip>` 后方可连接到数据库。

![1.png](https://s2.loli.net/2024/11/29/vk8prPa7RoWmtbi.png)

另外，redis 配置部分的 host 字段也需要配置本地的 host 文件：

在 host 文件中添加 `redis <你的redis服务器公网ip>` 

![1.png](https://s2.loli.net/2024/11/29/noaq8NEZzLBYm5K.png)


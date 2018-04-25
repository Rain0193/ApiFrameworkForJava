# ApiFrameworkForJava
基于Java语言接口测试框架

## 说明介绍

Java + Maven + TestNG + Maco + HttpClient + MyBatis + MySQL + ExtentReport

### TestNG
### ExtentReport
Maven pom.xml引用
```xml
        <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>3.1.5</version>
            <scope>provided</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.relevantcodes/extentreports -->
        <dependency>
            <groupId>com.relevantcodes</groupId>
            <artifactId>extentreports</artifactId>
            <version>2.41.2</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.vimalselvam/testng-extentsreport -->
        <dependency>
            <groupId>com.vimalselvam</groupId>
            <artifactId>testng-extentsreport</artifactId>
            <version>1.3.1</version>
        </dependency>
```
### moco
### http协议
查看http协议信息头：浏览器开发小工具、Fiddler
##### 常用请求头
- Accept：浏览器告诉服务器它所支持的数据类型
- Accept-Charset：浏览器告诉服务器它采用的字符集
- Accept-Encoding：浏览器告诉服务器它所支持的压缩格式
- Accept-Language：浏览器告诉服务器它所采用的语言
- Connection：浏览器的连接方式
- Host：浏览器告诉服务器我想访问服务器哪台主机
- If-Modified-Since：浏览器告诉服务器它缓存数据时间是多少
- Referer：浏览器告诉服务器我是从哪个网页点过来的（防盗链）
- user-Agent： 浏览器告诉服务器我所使用的浏览器类型、版本等信息
- Date：浏览器告诉服务器我什么时间访问的

##### 常用响应头
- Location: 这个头告诉浏览器你去找谁，配合302状态码使用
- Server: 告诉浏览器服务器的类型
- Content-Encoding：告诉浏览器回送的数据采用的压缩格式
- Content-Type：告诉浏览器回送的数据类型
- Last-Modified：告诉浏览器数据的最后修改时间
- Refresh： 用于控制浏览器定时刷新
- Content-Disposition: 告诉浏览器需要以下载方式打开回送的数据
- Transfer-Encoding：告诉浏览器数据是以分块形式回送的

### cookie与session的区别特点
##### 区别
- cookie在客户端的头信息中
- session在服务端存储， 文件、数据库等都可以
- 一般来说session的验证需要cookie带一个字段来表示这个用户是哪一个session
- 一般来书session的验证需要cookie带一个字段来表示这个用户哪一个session，所以当客户端禁用cookie时，session将失效
##### Cookie的总结
- cookie就是小一段文本信息
- cookie的格式为 key:value;key:value...
- cookie的值由服务端生成，客户端保存

### HttpClient

### SpringBoot初级使用
##### get请求的开发
##### SwaggerUI的使用

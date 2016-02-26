# NumberGenerator
Fei Luo's Java Codes show how to integrate Eclipse Maven and Spring  

Ref:

- [使用maven一步一步构建spring mvc项目 ](http://blog.csdn.net/fox_lht/article/details/16952683)：演示Eclipse Maven如何添加Spring
- [MAVEN Scope使用](http://acooly.iteye.com/blog/1788890)： Maven Scope的区别
- [使用Maven管理Spring](http://blog.csdn.net/renfufei/article/details/35794985)： Marven版本管理
- [如何在Maven中配置Spring依赖](http://www.4byte.cn/learning/119966/ru-he-zai-maven-zhong-pei-zhi-spring-yi-lai.html)： Marven版本管理
- [Spring Hello World 实例](http://www.yiibai.com/spring/spring_hello_world_example.html)

### Steps

1. Eclipse -> New -> Maven
2. 选择pom.xml文件，并打开
3. 增加Properties：展开Properties选项，然后点击Create…按钮，如下所示：然后Name字段填入springVersion，Value字段填入4.2.5.RELEASE。即在pom.xml中增加了一个属性SpringVersion，属性值为3.2.5.RELEASE。 
4. 选择Dependencies标签，打开Dependencies选项卡，并增加一个新的Dependency 
5. Group Id：org.springframework; Artifact Id：spring-context; Version：${SpringVersion}



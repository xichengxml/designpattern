面向对象设计的基本原则：
1. OCP（开闭原则，Open Close Principle）：一个软件的实体应该对扩展开放，对修改关闭
2. DIP（依赖倒转原则，Dependency Inversion Principle）：要针对接口编程，不要针对实现编程
<p>理解：比如Controller层调用Service层，应该是Service基于已有对象封装好方法，然后在Controller组合各种方法实现功能，而不是面向
Controller实现的功能封装<p>
3. LOP（迪米特法则，Law Of Demiter）：只与你直接的朋友通信，而避免和陌生人通信
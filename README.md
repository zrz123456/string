# string
实验4 字符串实验
实验目的：
 掌握字符串string及其方法的使用
 掌握异常处理结构
实验要求：
 利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行，达到以下功能：
 1每7个汉字加入一个标点符号，奇数加“，”，偶数加“。”
 2 允许提供输入参数，统计古诗中某个字或词出现的次数
 3 考虑操作中可能出现的异常，在程序中设计异常处理程序
核心代码：
 for (int i = 7;i<u.length();i+=8) {
         u.insert(i, "，");
             }
        for (int a = 15;a<u.length();a+=15) {
         u.deleteCharAt(a);
             }
         for (int b = 15;b<u.length();b+=16) {
             u.insert(b, "。");
             }
         for (int c = 16;c<u.length();c+=17) {
             u.insert(c, "\n");
             }
     System.out.println(u);
boolean b=u.toString().contains(u1);//子字符串是否被包含在此字符串之中,包含输出true，否则输出false
  System.out.println("此段是否包含在主文章中:"+b);
  System.out.println("包含次数为："+count(u.toString(),u1.toString()));//调用count，输出包含次数
 }
  //统计子字符串被包含次数
实验结果：
 
感想：
本次实验相较于前几次简单了一些，但做起来还不是很轻松，应花更多时间在这门课上。



##JNi使用步骤
```
第一步:为Android studio项目配置NDK 打开项目module设置 查看 sdk-location
```
```
第二步：建立java类 声明native方法
```
```
第三步：生成java类对应的.h文件
1> javac java类 //生成.class文件
2> 在Android项目的xxxx/main/java目录路径下
java -jni 包名.类名  //生成.h头文件(这一步需要class文件)
```
```
第四步：新建jni目录，将头文件放进去
jni目录和java目录平级 可以使用Android studio生成改目录
```
```
第五步：在jni目录下编写这个.h文件实现的 C/C++ 文件
```

```
第六步：在gradle中配置ndk{}
如在defaultConfig目录下配置生成so文件名
ndk{
moduleName "MyCustom"
abiFilters "armeabi", "armeabi-v7a", "x86"//cpu的类型
}
```
```
第七步：在java代码使用C代码前先load so库 库名就是gradle中定义的
使用前System.loadLibrary("MyCustom");
然后就可以正常在java代码中使用了
```
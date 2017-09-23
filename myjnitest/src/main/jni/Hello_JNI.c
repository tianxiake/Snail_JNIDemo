//
// Created by liuyongjie on 2017/9/21.
//
#include <com_nebulaera_myjnitest_HelloWorld.h>
JNIEXPORT jint JNICALL Java_com_nebulaera_myjnitest_HelloWorld_add
        (JNIEnv *env, jobject jobject, jint a, jint b){
    return a+b;
}
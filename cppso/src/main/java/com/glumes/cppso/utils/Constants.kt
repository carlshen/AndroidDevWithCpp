package com.glumes.cppso.utils

/**
 * Created by glumes on 28/02/2018
 */


// 主页面的跳转

const val JUMP_JNI_METIOD_ACTIVITY = 0x00
const val JUMP_INFO_MANAGER_ACTIVITY = 0x01


// JNI 操作相关

const val NO_NATIVE_OPERATION = 0x10
const val NATIVE_BASIC_TYPE = 0x13
const val NATIVE_STRING = 0x11
const val NATIVE_ARRAY = 0x12

const val NATIVE_FIELD_AND_METHOD = 0x17

const val NATIVE_CACHE_FIELD_AND_METHOD = 0x18

const val NATIVE_INVOKE_CONSTRUCTORS = 0x19

const val NATIVE_CALL_STATIC_METHOD = 0x14
const val NATIVE_CALL_INSTANCE_METHOD = 0x15
const val NATIVE_CALL_SUPER_METHOD = 0x16

const val NATIVE_ACCESS_CACHE = 0x6

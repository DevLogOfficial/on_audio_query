package com.devlog.on_audio_query.interfaces

interface PermissionManagerInterface {
    fun permissionStatus() : Boolean
    fun requestPermission()
    fun retryRequestPermission()
}
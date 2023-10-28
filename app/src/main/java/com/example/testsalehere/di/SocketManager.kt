package com.example.testsalehere.di

import io.socket.client.IO
import io.socket.client.Socket
import javax.inject.Inject

class SocketManager @Inject constructor() {
    private var socket: Socket? = null

    fun init() {
        socket = IO.socket("https://px-socket-emitter.saleherethailand.com/update")
    }

    fun getSocket(): Socket? = socket
}

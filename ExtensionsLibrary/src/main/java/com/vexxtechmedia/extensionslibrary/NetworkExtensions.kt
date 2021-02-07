package com.vexxtechmedia.extensionslibrary

import android.net.wifi.WifiManager

fun WifiManager.deviceName(): String = connectionInfo.ssid.run {
    if (this.contains("<unknown ssid>")) "UNKNOWN" else this
}
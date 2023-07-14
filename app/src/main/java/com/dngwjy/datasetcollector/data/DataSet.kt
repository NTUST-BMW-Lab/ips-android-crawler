package com.dngwjy.datasetcollector.data

data class BleData(
    var mac:String,
    var device:String?,
    var rssi:String,
)
data class WifiData(
    var mac: String,
    var ssid:String,
    var rssi: String
)

data class DataSet (
    var time_stamp:String,
    var latitude:Double,
    var longitude:Double,
    var bles:List<BleData>,
    var wifis:List<WifiData>,
    var geomagnetic:List<Float>,
    var accel:List<Float>,
    var gyro:List<Float>
    )
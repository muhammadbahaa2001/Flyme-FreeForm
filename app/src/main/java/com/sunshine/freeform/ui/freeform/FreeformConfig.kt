package com.sunshine.freeform.ui.freeform

data class FreeformConfig(
    //是否使用自定义配置而非在FreeformView中配置
    var useCustomConfig: Boolean = false,
    //运行程序包名
    var packageName: String,
    //运行程序活动名
    var activityName: String,
    //启动的userId
    var userId: Int,
    //叠加层最大高度
    var maxHeight: Int = 1,
    //分辨率
    var freeformDpi: Int = 1,
    //宽高比，默认9：16
    var widthHeightRatio: Float = 11f / 21f,
    //使用shizuku/sui阻止小窗跳出到全屏
    var useSuiRefuseToFullScreen: Boolean = false,
    // 降低背景亮度
    var dimAmount: Float = 0.3f,
    //兼容模式启动
    @Deprecated("", ReplaceWith(""))
    var compatibleMode: Boolean = false,
    var rememberPosition: Boolean = false,
    // 挂起大小
    var floatViewSize: Float = 0.2f,
    //记录启动位置
    var rememberX: Int = 0,
    var rememberY: Int = 0,
    //手动调整小窗方向
    var manualAdjustFreeformRotation: Boolean = false,
) {

}
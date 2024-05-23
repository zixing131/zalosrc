--
-- Created by IntelliJ IDEA.
-- User: khanhtm
-- Date: 09/01/2016
-- Time: 18:32
-- To change this template use File | Settings | File Templates.
--

--class("ZaloLuaApi")
require "ActionId"

ZaloLuaApi = {}

function ZaloLuaApi.callAction(actionId, jsonData, callbackFunctionName)
    if (cc.Application:getInstance():getTargetPlatform() == cc.PLATFORM_OS_ANDROID) then
        local app = AppDelegate:getInstance()
        app:fireActionFromNative(actionId, jsonData, callbackFunctionName);
    end
    if (cc.Application:getInstance():getTargetPlatform() == cc.PLATFORM_OS_IPHONE) or
      (cc.Application:getInstance():getTargetPlatform() == cc.PLATFORM_OS_IPAD)  then
        local args = { id = idCommand, param = param1, nameCallback = funtionNameCalback }
        local luaoc = require "cocos.cocos2d.luaoc"
        local className = "GameHelper"
        local ok  = luaoc.callStaticMethod(className,"receiveMessageFromLua",args)
    end
end

function ZaloLuaApi.callActionClose()
    ccexp.AudioEngine:stopAll()
    if (cc.Application:getInstance():getTargetPlatform() == cc.PLATFORM_OS_ANDROID) then
        ZaloLuaApi.callAction(zalo.ActionId.ACTION_ID_CLOSE, "close from lua game", nil);
    end
    if (cc.Application:getInstance():getTargetPlatform() == cc.PLATFORM_OS_IPHONE) or
      (cc.Application:getInstance():getTargetPlatform() == cc.PLATFORM_OS_IPAD)  then
        local args = { pause = 1 }
        local luaoc = require "cocos.cocos2d.luaoc"
        local className = "GameHelper"
        local ok,ret  = luaoc.callStaticMethod(className,"pauseGameInLUA",args)
    end
end

function sendMessageToNative(idCommand, param1, funtionNameCalback)
    ZaloLuaApi.callAction(idCommand, param1, funtionNameCalback);
end

function closeGame()
    ZaloLuaApi.callActionClose()
end
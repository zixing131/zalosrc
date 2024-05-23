package com.zing.zalo.cocos2dx;

import java.lang.ref.WeakReference;
import org.cocos2dx.lib.Cocos2dxHelper;
import org.cocos2dx.lib.Cocos2dxRenderer;

/* loaded from: classes3.dex */
public class AppDelegate {
    private static AppDelegate INSTANCE;
    private CameraFrameBufferInfo defaultCameraFrameBufferInfo;
    private long nativeAppDelegate;
    private WeakReference<AppDelegateEvent> nativeEventListener;

    /* loaded from: classes3.dex */
    public interface AppDelegateEvent {
        public static final String ACTION_ID_CLOSE = "local.action.close";
        public static final String ACTION_ID_OPEN_ZALO_PAGE = "action.open_page";

        void actionFromNative(String str, String str2, String str3);

        void backupDecorEditable(String str);

        double[] interpolateLandmarkPoint(double[] dArr);

        void onAction(String str, String str2, String str3);

        void onActionClose();

        void signalEnableFaceDetect(boolean z11);

        void signalInterpolateFaceMask(boolean z11);
    }

    public AppDelegate(long j11) {
        this.nativeAppDelegate = j11;
    }

    private void fireActionFromNative(String str, String str2, String str3) {
        try {
            WeakReference<AppDelegateEvent> weakReference = this.nativeEventListener;
            if (weakReference != null && weakReference.get() != null) {
                this.nativeEventListener.get().actionFromNative(str, str2, str3);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static AppDelegate getInstance() {
        return INSTANCE;
    }

    private double[] interpolateLandmarkPointFromNative(double[] dArr) {
        try {
            WeakReference<AppDelegateEvent> weakReference = this.nativeEventListener;
            if (weakReference != null && weakReference.get() != null) {
                return this.nativeEventListener.get().interpolateLandmarkPoint(dArr);
            }
            return null;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    private native void nativeApplyFilter(long j11, long j12, String str, String str2);

    private native String nativeBackupDecorEditable(long j11);

    private native void nativeCallLuaFunction(long j11, String str, String str2, String str3);

    private native Object nativeCheckTouch(long j11, float f11, float f12);

    private native void nativeClearDirector(long j11);

    private native void nativeClearTextureCache(long j11);

    private native void nativeDeleteDecor(long j11, Object obj);

    private native void nativeEnableSound(long j11, int i11);

    private native void nativeFinishRestoreFilter(long j11);

    private native int nativeGetDecorTouchId(long j11);

    private native int nativeGetFilterTouchId(long j11);

    private native void nativeLoadSkeletonInfo(long j11, String str);

    private native void nativeMoveDecorFilter(long j11, Object obj, float f11, float f12);

    private native void nativePlayCameraAnimation(long j11, String str, String str2, int i11, String str3);

    private native void nativePlayCameraFilter(long j11, String str, String str2, int i11, String str3, String str4);

    private native void nativePlayCameraFilterWithRatioContent(long j11, String str, String str2, int i11, String str3, String str4, float f11, float f12);

    private native void nativePlayLuaScript(long j11, String str, String str2, String str3);

    private native void nativePlayStickerAnimation(long j11, String str, String str2, int i11, String str3);

    private native long[] nativeRefreshFilter(long j11);

    private native void nativeRemoveFilter(long j11, long j12);

    private native void nativeRotateDecorFilter(long j11, Object obj, float f11);

    private native void nativeScaleDecorFilter(long j11, Object obj, float f11);

    private native int nativeSetupFilterEnv(long j11, int i11, String str, String str2, float f11, float f12);

    private native void nativeShowEmptyScene(long j11);

    private native void nativeUpdateCameraTexture(long j11, int i11, int i12, int i13, int i14, boolean z11);

    private native void nativeUpdateContainer(long j11, float f11, float f12);

    private native void nativeUpdateDetectionResult(long j11, byte[] bArr, int i11);

    private void signalEnableFaceDetect(boolean z11) {
        try {
            WeakReference<AppDelegateEvent> weakReference = this.nativeEventListener;
            if (weakReference != null && weakReference.get() != null) {
                this.nativeEventListener.get().signalEnableFaceDetect(z11);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void signalInterpolateFaceMask(boolean z11) {
        try {
            WeakReference<AppDelegateEvent> weakReference = this.nativeEventListener;
            if (weakReference != null && weakReference.get() != null) {
                this.nativeEventListener.get().signalInterpolateFaceMask(z11);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void updateListFilter(long[] jArr) {
    }

    public void applyFilter(long j11, String str, String str2) {
        nativeApplyFilter(this.nativeAppDelegate, j11, str, str2);
    }

    public String backupDecorEditable() {
        return nativeBackupDecorEditable(this.nativeAppDelegate);
    }

    public void callLuaFunction(String str, String str2, String str3) {
        nativeCallLuaFunction(this.nativeAppDelegate, str, str2, str3);
    }

    public DecorOwner checkTouch(float f11, float f12) {
        return (DecorOwner) nativeCheckTouch(this.nativeAppDelegate, f11, f12);
    }

    public void clearDirector() {
        nativeClearDirector(this.nativeAppDelegate);
    }

    public void clearTextureCache() {
        nativeClearTextureCache(this.nativeAppDelegate);
    }

    public void deleteDecor(DecorOwner decorOwner) {
        nativeDeleteDecor(this.nativeAppDelegate, decorOwner);
    }

    public void enableCocosSound(boolean z11) {
        nativeEnableSound(this.nativeAppDelegate, z11 ? 1 : 0);
    }

    public void finishRestoreFilter() {
        nativeFinishRestoreFilter(this.nativeAppDelegate);
    }

    public int getDecorTouchId() {
        return nativeGetDecorTouchId(this.nativeAppDelegate);
    }

    public int getFilterTouchId() {
        return nativeGetFilterTouchId(this.nativeAppDelegate);
    }

    public void loadSkeletonInfo(String str) {
        nativeLoadSkeletonInfo(this.nativeAppDelegate, str);
    }

    public void moveDecorFilter(DecorOwner decorOwner, float f11, float f12) {
        nativeMoveDecorFilter(this.nativeAppDelegate, decorOwner, f11, f12);
    }

    public void playCameraAnimation(String str, String str2, int i11, String str3) {
        Cocos2dxHelper.pauseBackgroundMusic();
        Cocos2dxHelper.stopBackgroundMusic();
        Cocos2dxHelper.stopAllEffects();
        Cocos2dxRenderer.nativeOnResume();
        nativePlayCameraAnimation(this.nativeAppDelegate, str, str2, i11, str3);
    }

    public void playCameraFilter(String str, String str2, int i11, String str3, String str4, float f11, float f12) {
        Cocos2dxHelper.pauseBackgroundMusic();
        Cocos2dxHelper.stopBackgroundMusic();
        Cocos2dxHelper.stopAllEffects();
        Cocos2dxRenderer.nativeOnResume();
        nativePlayCameraFilterWithRatioContent(this.nativeAppDelegate, str, str2, i11, str3, str4, f11, f12);
    }

    public void playLuaScript(String str, String str2, String str3) {
        nativePlayLuaScript(this.nativeAppDelegate, str, str2, str3);
    }

    public void playStickerAnimation(String str, String str2, int i11, String str3) {
        Cocos2dxHelper.pauseBackgroundMusic();
        Cocos2dxHelper.stopBackgroundMusic();
        Cocos2dxHelper.stopAllEffects();
        Cocos2dxRenderer.nativeOnResume();
        nativePlayStickerAnimation(this.nativeAppDelegate, str, str2, i11, str3);
    }

    public long[] refreshFilter() {
        return nativeRefreshFilter(this.nativeAppDelegate);
    }

    public void removeFilter(long j11) {
        nativeRemoveFilter(this.nativeAppDelegate, j11);
    }

    public void rotateDecorFilter(DecorOwner decorOwner, float f11) {
        nativeRotateDecorFilter(this.nativeAppDelegate, decorOwner, f11);
    }

    public void scaleDecorFilter(DecorOwner decorOwner, float f11) {
        nativeScaleDecorFilter(this.nativeAppDelegate, decorOwner, f11);
    }

    public void setDefaultCameraTexture(CameraFrameBufferInfo cameraFrameBufferInfo) {
        this.defaultCameraFrameBufferInfo = cameraFrameBufferInfo;
    }

    public void setNativeEventListener(AppDelegateEvent appDelegateEvent) {
        if (appDelegateEvent != null) {
            this.nativeEventListener = new WeakReference<>(appDelegateEvent);
        } else {
            this.nativeEventListener = null;
        }
    }

    public boolean setupFilterEnv(int i11, String str, String str2) {
        return setupFilterEnv(i11, str, str2, 1.0f, 1.0f);
    }

    public void showEmptyScene() {
        nativeShowEmptyScene(this.nativeAppDelegate);
    }

    public void updateCameraTexture(int i11, int i12, int i13, int i14, boolean z11) {
        nativeUpdateCameraTexture(this.nativeAppDelegate, i11, i12, i13, i14, z11);
    }

    public void updateCameraTextureDefault() {
        CameraFrameBufferInfo cameraFrameBufferInfo = this.defaultCameraFrameBufferInfo;
        if (cameraFrameBufferInfo != null) {
            nativeUpdateCameraTexture(this.nativeAppDelegate, cameraFrameBufferInfo.textureId, cameraFrameBufferInfo.width, cameraFrameBufferInfo.height, cameraFrameBufferInfo.rotate, cameraFrameBufferInfo.needFlip);
        }
    }

    public void updateContainer(float f11, float f12) {
        nativeUpdateContainer(this.nativeAppDelegate, f11, f12);
    }

    public void updateDetectionResult(byte[] bArr, int i11) {
        nativeUpdateDetectionResult(this.nativeAppDelegate, bArr, i11);
    }

    private void backupDecorEditable(String str) {
        try {
            WeakReference<AppDelegateEvent> weakReference = this.nativeEventListener;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.nativeEventListener.get().backupDecorEditable(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public boolean setupFilterEnv(int i11, String str, String str2, float f11, float f12) {
        Cocos2dxHelper.pauseBackgroundMusic();
        Cocos2dxHelper.stopBackgroundMusic();
        Cocos2dxHelper.stopAllEffects();
        Cocos2dxRenderer.nativeOnResume();
        clearTextureCache();
        showEmptyScene();
        return nativeSetupFilterEnv(this.nativeAppDelegate, i11, str, str2, f11, f12) == 1;
    }
}

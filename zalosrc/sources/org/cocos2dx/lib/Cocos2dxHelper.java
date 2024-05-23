package org.cocos2dx.lib;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import com.chukong.cocosplay.client.CocosPlayClient;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes7.dex */
public class Cocos2dxHelper {
    private static final int BOOST_TIME = 7;
    private static final String PREFS_NAME = "Cocos2dxPrefsFile";
    private static final int RUNNABLES_PER_FRAME = 5;
    private static boolean sAccelerometerEnabled;
    private static boolean sActivityVisible;
    private static AssetManager sAssetManager;
    private static Cocos2dxMusic sCocos2dMusic;
    private static Cocos2dxSound sCocos2dSound;
    private static Cocos2dxAccelerometer sCocos2dxAccelerometer;
    private static WeakReference<Cocos2dxHelperListener> sCocos2dxHelperListener;
    private static boolean sCompassEnabled;
    private static Context sContext;
    private static String sFileDirectory;
    private static String sPackageName;
    private static boolean sRotationVectorEnabled;
    private static Set<PreferenceManager.OnActivityResultListener> onActivityResultListeners = new LinkedHashSet();
    private static Vibrator sVibrateService = null;
    private static boolean sInited = false;

    /* renamed from: org.cocos2dx.lib.Cocos2dxHelper$1 */
    /* loaded from: classes7.dex */
    class RunnableC244911 implements Runnable {
        final /* synthetic */ byte[] val$bytesUTF8;

        RunnableC244911(byte[] bArr) {
            r1 = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            Cocos2dxHelper.nativeSetEditTextDialogResult(r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.cocos2dx.lib.Cocos2dxHelper$2 */
    /* loaded from: classes7.dex */
    public class RunnableC244922 implements Runnable {
        final /* synthetic */ long val$timestamp;
        final /* synthetic */ float val$x;
        final /* synthetic */ float val$y;
        final /* synthetic */ float val$z;

        RunnableC244922(float f11, float f12, float f13, long j11) {
            r1 = f11;
            r2 = f12;
            r3 = f13;
            r4 = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            Cocos2dxAccelerometer.onSensorChanged(r1, r2, r3, r4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.cocos2dx.lib.Cocos2dxHelper$3 */
    /* loaded from: classes7.dex */
    public class RunnableC244933 implements Runnable {
        final /* synthetic */ float val$pitch;
        final /* synthetic */ float val$roll;
        final /* synthetic */ long val$timestamp;
        final /* synthetic */ float val$yaw;

        RunnableC244933(float f11, float f12, float f13, long j11) {
            r1 = f11;
            r2 = f12;
            r3 = f13;
            r4 = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            Cocos2dxAccelerometer.onSensorRotationChanged(r1, r2, r3, r4);
        }
    }

    /* loaded from: classes7.dex */
    public interface Cocos2dxHelperListener {
        void runOnGLThread(Runnable runnable);

        void showDialog(String str, String str2);
    }

    public static void addOnActivityResultListener(PreferenceManager.OnActivityResultListener onActivityResultListener) {
        onActivityResultListeners.add(onActivityResultListener);
    }

    public static byte[] conversionEncoding(byte[] bArr, String str, String str2) {
        try {
            return new String(bArr, str).getBytes(str2);
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static void deleteValueForKey(String str) {
        SharedPreferences.Editor edit = sContext.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.remove(str);
        edit.commit();
    }

    public static void disableRotationVector() {
        sRotationVectorEnabled = false;
        sCocos2dxAccelerometer.disable();
    }

    public static void enableAccelerometer() {
        sAccelerometerEnabled = true;
        sCocos2dxAccelerometer.enableAccel();
    }

    public static void enableRotationVector() {
        sRotationVectorEnabled = true;
        sCocos2dxAccelerometer.enableOrientation();
    }

    public static void end() {
        sCocos2dMusic.end();
        sCocos2dSound.end();
    }

    public static AssetManager getAssetManager() {
        return sAssetManager;
    }

    public static float getBackgroundMusicVolume() {
        return sCocos2dMusic.getBackgroundVolume();
    }

    public static boolean getBoolForKey(String str, boolean z11) {
        SharedPreferences sharedPreferences = sContext.getSharedPreferences(PREFS_NAME, 0);
        try {
            return sharedPreferences.getBoolean(str, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
            Object obj = sharedPreferences.getAll().get(str);
            if (obj instanceof String) {
                return Boolean.parseBoolean(obj.toString());
            }
            if (obj instanceof Integer) {
                if (((Integer) obj).intValue() == 0) {
                    return false;
                }
                return true;
            }
            if (!(obj instanceof Float) || ((Float) obj).floatValue() == 0.0f) {
                return false;
            }
            return true;
        }
    }

    public static String getCocos2dxPackageName() {
        return sPackageName;
    }

    public static String getCocos2dxWritablePath() {
        return sFileDirectory;
    }

    public static Context getContext() {
        return sContext;
    }

    public static String getCurrentLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static double getDoubleForKey(String str, double d11) {
        return getFloatForKey(str, (float) d11);
    }

    public static float getEffectsVolume() {
        return sCocos2dSound.getEffectsVolume();
    }

    public static float getFloatForKey(String str, float f11) {
        SharedPreferences sharedPreferences = sContext.getSharedPreferences(PREFS_NAME, 0);
        try {
            return sharedPreferences.getFloat(str, f11);
        } catch (Exception e11) {
            e11.printStackTrace();
            Object obj = sharedPreferences.getAll().get(str);
            if (obj instanceof String) {
                return Float.parseFloat(obj.toString());
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).floatValue();
            }
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                return 1.0f;
            }
            return 0.0f;
        }
    }

    public static int getIntegerForKey(String str, int i11) {
        SharedPreferences sharedPreferences = sContext.getSharedPreferences(PREFS_NAME, 0);
        try {
            return sharedPreferences.getInt(str, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            Object obj = sharedPreferences.getAll().get(str);
            if (obj instanceof String) {
                return Integer.parseInt(obj.toString());
            }
            if (obj instanceof Float) {
                return ((Float) obj).intValue();
            }
            if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                return 0;
            }
            return 1;
        }
    }

    public static Set<PreferenceManager.OnActivityResultListener> getOnActivityResultListeners() {
        return onActivityResultListeners;
    }

    public static String getStringForKey(String str, String str2) {
        SharedPreferences sharedPreferences = sContext.getSharedPreferences(PREFS_NAME, 0);
        try {
            return sharedPreferences.getString(str, str2);
        } catch (Exception e11) {
            e11.printStackTrace();
            return sharedPreferences.getAll().get(str).toString();
        }
    }

    @TargetApi(4)
    public static void init(Context context, Cocos2dxHelperListener cocos2dxHelperListener) {
        sContext = context;
        if (cocos2dxHelperListener != null) {
            sCocos2dxHelperListener = new WeakReference<>(cocos2dxHelperListener);
        } else {
            sCocos2dxHelperListener = null;
        }
        if (!sInited) {
            sPackageName = context.getApplicationInfo().packageName;
            if (CocosPlayClient.isEnabled() && !CocosPlayClient.isDemo()) {
                sFileDirectory = CocosPlayClient.getGameRoot();
            } else {
                sFileDirectory = context.getFilesDir().getAbsolutePath();
            }
            sCocos2dxAccelerometer = new Cocos2dxAccelerometer(context);
            sCocos2dMusic = new Cocos2dxMusic(context);
            sCocos2dSound = new Cocos2dxSound(context);
            AssetManager assets = context.getAssets();
            sAssetManager = assets;
            nativeSetContext(context, assets);
            Cocos2dxBitmap.setContext(context);
            sVibrateService = (Vibrator) context.getSystemService("vibrator");
            sInited = true;
        }
    }

    public static boolean isActivityVisible() {
        return sActivityVisible;
    }

    public static boolean isBackgroundMusicPlaying() {
        return sCocos2dMusic.isBackgroundMusicPlaying();
    }

    private static native void nativeSetContext(Context context, AssetManager assetManager);

    static native void nativeSetEditTextDialogResult(byte[] bArr);

    public static void onEnterBackground() {
        sCocos2dSound.onEnterBackground();
        sCocos2dMusic.onEnterBackground();
    }

    public static void onEnterForeground() {
        sCocos2dSound.onEnterForeground();
        sCocos2dMusic.onEnterForeground();
    }

    public static void onPause() {
        sActivityVisible = false;
        if (sAccelerometerEnabled || sRotationVectorEnabled) {
            sCocos2dxAccelerometer.disable();
        }
    }

    public static void onResume() {
        sActivityVisible = true;
        if (sRotationVectorEnabled) {
            sCocos2dxAccelerometer.enableOrientation();
        }
    }

    public static boolean openURL(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            sContext.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void pauseAllEffects() {
        sCocos2dSound.pauseAllEffects();
    }

    public static void pauseBackgroundMusic() {
        sCocos2dMusic.pauseBackgroundMusic();
    }

    public static void pauseEffect(int i11) {
        sCocos2dSound.pauseEffect(i11);
    }

    public static void playBackgroundMusic(String str, boolean z11) {
        sCocos2dMusic.playBackgroundMusic(str, z11);
    }

    public static int playEffect(String str, boolean z11, float f11, float f12, float f13) {
        return sCocos2dSound.playEffect(str, z11, f11, f12, f13);
    }

    public static void preloadBackgroundMusic(String str) {
        sCocos2dMusic.preloadBackgroundMusic(str);
    }

    public static void preloadEffect(String str) {
        sCocos2dSound.preloadEffect(str);
    }

    public static void queueAccelerometer(float f11, float f12, float f13, long j11) {
        Cocos2dxHelperListener cocos2dxHelperListener;
        WeakReference<Cocos2dxHelperListener> weakReference = sCocos2dxHelperListener;
        if (weakReference == null || (cocos2dxHelperListener = weakReference.get()) == null) {
            return;
        }
        cocos2dxHelperListener.runOnGLThread(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.2
            final /* synthetic */ long val$timestamp;
            final /* synthetic */ float val$x;
            final /* synthetic */ float val$y;
            final /* synthetic */ float val$z;

            RunnableC244922(float f112, float f122, float f132, long j112) {
                r1 = f112;
                r2 = f122;
                r3 = f132;
                r4 = j112;
            }

            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxAccelerometer.onSensorChanged(r1, r2, r3, r4);
            }
        });
    }

    public static void queueRotationVector(float f11, float f12, float f13, long j11) {
        Cocos2dxHelperListener cocos2dxHelperListener;
        WeakReference<Cocos2dxHelperListener> weakReference = sCocos2dxHelperListener;
        if (weakReference == null || (cocos2dxHelperListener = weakReference.get()) == null) {
            return;
        }
        cocos2dxHelperListener.runOnGLThread(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.3
            final /* synthetic */ float val$pitch;
            final /* synthetic */ float val$roll;
            final /* synthetic */ long val$timestamp;
            final /* synthetic */ float val$yaw;

            RunnableC244933(float f112, float f122, float f132, long j112) {
                r1 = f112;
                r2 = f122;
                r3 = f132;
                r4 = j112;
            }

            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxAccelerometer.onSensorRotationChanged(r1, r2, r3, r4);
            }
        });
    }

    public static void resumeAllEffects() {
        sCocos2dSound.resumeAllEffects();
    }

    public static void resumeBackgroundMusic() {
        sCocos2dMusic.resumeBackgroundMusic();
    }

    public static void resumeEffect(int i11) {
        sCocos2dSound.resumeEffect(i11);
    }

    public static void rewindBackgroundMusic() {
        sCocos2dMusic.rewindBackgroundMusic();
    }

    public static void setBackgroundMusicVolume(float f11) {
        sCocos2dMusic.setBackgroundVolume(f11);
    }

    public static void setBoolForKey(String str, boolean z11) {
        SharedPreferences.Editor edit = sContext.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putBoolean(str, z11);
        edit.commit();
    }

    public static void setDoubleForKey(String str, double d11) {
        SharedPreferences.Editor edit = sContext.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putFloat(str, (float) d11);
        edit.commit();
    }

    public static void setEditTextDialogResult(String str) {
        try {
            WeakReference<Cocos2dxHelperListener> weakReference = sCocos2dxHelperListener;
            if (weakReference != null && weakReference.get() != null) {
                sCocos2dxHelperListener.get().runOnGLThread(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.1
                    final /* synthetic */ byte[] val$bytesUTF8;

                    RunnableC244911(byte[] bArr) {
                        r1 = bArr;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        Cocos2dxHelper.nativeSetEditTextDialogResult(r1);
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    public static void setEffectsVolume(float f11) {
        sCocos2dSound.setEffectsVolume(f11);
    }

    public static void setFloatForKey(String str, float f11) {
        SharedPreferences.Editor edit = sContext.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putFloat(str, f11);
        edit.commit();
    }

    public static void setIntegerForKey(String str, int i11) {
        SharedPreferences.Editor edit = sContext.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putInt(str, i11);
        edit.commit();
    }

    public static void setStringForKey(String str, String str2) {
        SharedPreferences.Editor edit = sContext.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    private static void showDialog(String str, String str2) {
        try {
            WeakReference<Cocos2dxHelperListener> weakReference = sCocos2dxHelperListener;
            if (weakReference != null && weakReference.get() != null) {
                sCocos2dxHelperListener.get().showDialog(str, str2);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void stopAllEffects() {
        sCocos2dSound.stopAllEffects();
    }

    public static void stopBackgroundMusic() {
        sCocos2dMusic.stopBackgroundMusic();
    }

    public static void stopEffect(int i11) {
        sCocos2dSound.stopEffect(i11);
    }

    public static void terminateProcess() {
        Process.killProcess(Process.myPid());
    }

    public static void unloadEffect(String str) {
        sCocos2dSound.unloadEffect(str);
    }

    public static void vibrate(float f11) {
        sVibrateService.vibrate(f11 * 1000.0f);
    }
}

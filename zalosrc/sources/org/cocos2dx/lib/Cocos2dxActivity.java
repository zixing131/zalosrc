package org.cocos2dx.lib;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.ViewGroup;
import android.widget.EditText;
import com.chukong.cocosplay.client.CocosPlayClient;
import com.zing.zalo.cocos2dx.AppDelegate;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.cocos2dx.lib.Cocos2dxHelper;

/* loaded from: classes7.dex */
public abstract class Cocos2dxActivity extends Activity implements Cocos2dxHelper.Cocos2dxHelperListener {
    private static final String TAG = "Cocos2dxActivity";
    protected Cocos2dxGLSurfaceView mGLSurfaceView = null;
    protected EditText mEdittext = null;
    private int[] mGLContextAttrs = null;
    private boolean hasFocus = false;
    protected ResizeLayout mFrameLayout = null;

    /* loaded from: classes7.dex */
    public static class Cocos2dxEGLConfigChooser implements GLSurfaceView.EGLConfigChooser {
        protected int[] configAttribs;

        /* loaded from: classes7.dex */
        class ConfigValue implements Comparable<ConfigValue> {
            public EGLConfig config;
            public int[] configAttribs;
            public int value;

            public ConfigValue(int[] iArr) {
                this.config = null;
                this.value = 0;
                this.configAttribs = iArr;
                calcValue();
            }

            private void calcValue() {
                int[] iArr = this.configAttribs;
                int i11 = iArr[4];
                if (i11 > 0) {
                    this.value = this.value + 536870912 + ((i11 % 64) << 6);
                }
                int i12 = iArr[5];
                if (i12 > 0) {
                    this.value = this.value + 268435456 + (i12 % 64);
                }
                int i13 = iArr[3];
                if (i13 > 0) {
                    this.value = this.value + 1073741824 + ((i13 % 16) << 24);
                }
                int i14 = iArr[1];
                if (i14 > 0) {
                    this.value += (i14 % 16) << 20;
                }
                int i15 = iArr[2];
                if (i15 > 0) {
                    this.value += (i15 % 16) << 16;
                }
                int i16 = iArr[0];
                if (i16 > 0) {
                    this.value += (i16 % 16) << 12;
                }
            }

            public String toString() {
                return "{ color: " + this.configAttribs[3] + this.configAttribs[2] + this.configAttribs[1] + this.configAttribs[0] + "; depth: " + this.configAttribs[4] + "; stencil: " + this.configAttribs[5] + ";}";
            }

            @Override // java.lang.Comparable
            public int compareTo(ConfigValue configValue) {
                int i11 = this.value;
                int i12 = configValue.value;
                if (i11 < i12) {
                    return -1;
                }
                return i11 > i12 ? 1 : 0;
            }

            public ConfigValue(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                this.value = 0;
                this.config = eGLConfig;
                int[] iArr = new int[6];
                this.configAttribs = iArr;
                iArr[0] = Cocos2dxEGLConfigChooser.this.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                this.configAttribs[1] = Cocos2dxEGLConfigChooser.this.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                this.configAttribs[2] = Cocos2dxEGLConfigChooser.this.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                this.configAttribs[3] = Cocos2dxEGLConfigChooser.this.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                this.configAttribs[4] = Cocos2dxEGLConfigChooser.this.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                this.configAttribs[5] = Cocos2dxEGLConfigChooser.this.findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                calcValue();
            }
        }

        public Cocos2dxEGLConfigChooser(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.configAttribs = new int[]{i11, i12, i13, i14, i15, i16};
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int i11;
            int i12 = 0;
            int[] iArr = this.configAttribs;
            int[] iArr2 = {12324, iArr[0], 12323, iArr[1], 12322, iArr[2], 12321, iArr[3], 12325, iArr[4], 12326, iArr[5], 12352, 4, 12344};
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr3 = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, 1, iArr3) && iArr3[0] > 0) {
                return eGLConfigArr[0];
            }
            int[] iArr4 = {12352, 4, 12344};
            if (egl10.eglChooseConfig(eGLDisplay, iArr4, null, 0, iArr3) && (i11 = iArr3[0]) > 0) {
                ConfigValue[] configValueArr = new ConfigValue[i11];
                EGLConfig[] eGLConfigArr2 = new EGLConfig[i11];
                egl10.eglChooseConfig(eGLDisplay, iArr4, eGLConfigArr2, i11, iArr3);
                for (int i13 = 0; i13 < i11; i13++) {
                    configValueArr[i13] = new ConfigValue(egl10, eGLDisplay, eGLConfigArr2[i13]);
                }
                ConfigValue configValue = new ConfigValue(this.configAttribs);
                int i14 = i11;
                while (i12 < i14 - 1) {
                    int i15 = (i12 + i14) / 2;
                    if (configValue.compareTo(configValueArr[i15]) < 0) {
                        i14 = i15;
                    } else {
                        i12 = i15;
                    }
                }
                if (i12 != i11 - 1) {
                    i12++;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't find EGLConfig match: ");
                sb2.append(configValue);
                sb2.append(", instead of closest one:");
                sb2.append(configValueArr[i12]);
                return configValueArr[i12].config;
            }
            return null;
        }

        int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, int i12) {
            int[] iArr = new int[1];
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i11, iArr)) {
                return iArr[0];
            }
            return i12;
        }

        public Cocos2dxEGLConfigChooser(int[] iArr) {
            this.configAttribs = iArr;
        }
    }

    public static native int[] getGLContextAttrs();

    private static boolean isAndroidEmulator() {
        String str = Build.MODEL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("model=");
        sb2.append(str);
        String str2 = Build.PRODUCT;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("product=");
        sb3.append(str2);
        boolean z11 = false;
        if (str2 != null && (str2.equals("sdk") || str2.contains("_sdk") || str2.contains("sdk_"))) {
            z11 = true;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("isEmulator=");
        sb4.append(z11);
        return z11;
    }

    private void resumeIfHasFocus() {
        if (this.hasFocus) {
            Cocos2dxHelper.onResume();
            this.mGLSurfaceView.onResume();
        }
    }

    public EditText getEdittext() {
        return this.mEdittext;
    }

    public Cocos2dxGLSurfaceView getGLSurfaceView() {
        return this.mGLSurfaceView;
    }

    public void init() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ResizeLayout resizeLayout = new ResizeLayout(this);
        this.mFrameLayout = resizeLayout;
        resizeLayout.setLayoutParams(layoutParams);
        this.mGLSurfaceView = onCreateView();
        this.mGLSurfaceView.setEGLConfigChooser(new Cocos2dxEGLConfigChooser(this.mGLContextAttrs));
        this.mGLSurfaceView.getHolder().setFormat(-3);
        this.mGLSurfaceView.setZOrderOnTop(true);
        this.mFrameLayout.addView(this.mGLSurfaceView);
        this.mGLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        this.mGLSurfaceView.setCocos2dxRenderer(new Cocos2dxRenderer());
        this.mFrameLayout.setBackgroundColor(0);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(2, 2);
        EditText editText = new EditText(this);
        this.mEdittext = editText;
        editText.setLayoutParams(layoutParams2);
        this.mEdittext.setInputType(180224);
        this.mEdittext.setMaxEms(10);
        this.mEdittext.setImeOptions(4);
        this.mEdittext.setVerticalScrollBarEnabled(true);
        this.mEdittext.setTextSize(1, 16.0f);
        this.mFrameLayout.addView(this.mEdittext);
        setContentView(this.mFrameLayout);
    }

    protected abstract boolean isNativeLoaderEnable();

    @Override // android.app.Activity
    protected void onActivityResult(int i11, int i12, Intent intent) {
        Iterator<PreferenceManager.OnActivityResultListener> it = Cocos2dxHelper.getOnActivityResultListeners().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i11, i12, intent);
        }
        super.onActivityResult(i11, i12, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CocosPlayClient.init(this, false);
        try {
            NativeLoader.m89238q(getApplicationContext(), EnumC16739a.f84898x);
            if (AppDelegate.getInstance() != null) {
                Cocos2dxHelper.init(getApplicationContext(), this);
                this.mGLContextAttrs = getGLContextAttrs();
                init();
                return;
            }
            throw new RuntimeException("COCOS2DX library is working wrong");
        } catch (Throwable th2) {
            th2.printStackTrace();
            boolean z11 = th2 instanceof NativeLoader.MissingLibraryException;
            finish();
        }
    }

    public Cocos2dxGLSurfaceView onCreateView() {
        Cocos2dxGLSurfaceView cocos2dxGLSurfaceView = new Cocos2dxGLSurfaceView(this);
        if (this.mGLContextAttrs[3] > 0) {
            cocos2dxGLSurfaceView.getHolder().setFormat(-3);
        }
        cocos2dxGLSurfaceView.setEGLConfigChooser(new Cocos2dxEGLConfigChooser(this.mGLContextAttrs));
        return cocos2dxGLSurfaceView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Cocos2dxHelper.onPause();
        this.mGLSurfaceView.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        resumeIfHasFocus();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onWindowFocusChanged() hasFocus=");
        sb2.append(z11);
        super.onWindowFocusChanged(z11);
        this.hasFocus = z11;
        resumeIfHasFocus();
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void runOnGLThread(Runnable runnable) {
        this.mGLSurfaceView.queueEvent(runnable);
    }

    public void setKeepScreenOn(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxActivity.1
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxActivity.this.mGLSurfaceView.setKeepScreenOn(z11);
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void showDialog(String str, String str2) {
    }
}

package pl0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;

/* renamed from: pl0.f */
/* loaded from: classes7.dex */
public abstract class AbstractC24825f {

    /* renamed from: a */
    private static float f119166a = 0.0f;

    /* renamed from: b */
    private static int f119167b = 256;

    /* renamed from: c */
    private static boolean f119168c = false;

    /* renamed from: d */
    private static boolean f119169d = false;

    /* renamed from: e */
    private static boolean f119170e = false;

    /* renamed from: f */
    private static boolean f119171f = false;

    /* renamed from: g */
    private static boolean f119172g = false;

    /* renamed from: a */
    private static synchronized void m129065a(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        int[] iArr;
        synchronized (AbstractC24825f.class) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null && Build.VERSION.SDK_INT >= 24) {
                    hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities();
                    if (hdrCapabilities != null) {
                        iArr = hdrCapabilities.getSupportedHdrTypes();
                    } else {
                        iArr = null;
                    }
                    if (iArr != null) {
                        for (int i11 : iArr) {
                            if (i11 == 1) {
                                f119168c = true;
                            } else if (i11 == 3) {
                                f119169d = true;
                            } else if (i11 == 2) {
                                f119170e = true;
                            } else if (i11 == 4) {
                                f119171f = true;
                            }
                        }
                    }
                    f119172g = true;
                    return;
                }
                f119169d = false;
                f119168c = false;
                f119170e = false;
                f119171f = false;
                f119172g = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static int m129066b(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException unused) {
            return m129067c(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:            r5.setAccessible(true);        r1 = ((java.lang.Integer) r5.get(r8)).intValue();     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int m129067c(Context context) {
        int i11;
        synchronized (AbstractC24825f.class) {
            if (f119167b == 256) {
                int i12 = 0;
                try {
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    Field[] declaredFields = powerManager.getClass().getDeclaredFields();
                    int length = declaredFields.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            break;
                        }
                        Field field = declaredFields[i13];
                        if (field.getName().equals("BRIGHTNESS_ON")) {
                            break;
                        }
                        i13++;
                    }
                } catch (Exception unused) {
                }
                if (i12 <= 0) {
                    try {
                        Resources system = Resources.getSystem();
                        i12 = system.getInteger(system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", "android"));
                    } catch (Exception unused2) {
                    }
                }
                if (i12 <= 0) {
                    f119167b = 255;
                } else {
                    f119167b = i12;
                }
            }
            i11 = f119167b;
        }
        return i11;
    }

    /* renamed from: d */
    public static synchronized float m129068d(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        float f11;
        synchronized (AbstractC24825f.class) {
            if (context == null) {
                return 100.0f;
            }
            try {
                if (f119166a <= 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null && Build.VERSION.SDK_INT >= 24) {
                        hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities();
                        if (hdrCapabilities != null) {
                            f11 = hdrCapabilities.getDesiredMaxLuminance();
                        } else {
                            f11 = 100.0f;
                        }
                        f119166a = f11;
                        if (f11 <= 0.0f) {
                            f119166a = 100.0f;
                        }
                    }
                    f119166a = 100.0f;
                    return 100.0f;
                }
                return f119166a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static boolean m129069e(Context context) {
        if (!f119172g) {
            m129065a(context);
        }
        return f119170e;
    }

    /* renamed from: f */
    public static boolean m129070f(Context context) {
        if (!f119172g) {
            m129065a(context);
        }
        return f119171f;
    }

    /* renamed from: g */
    public static boolean m129071g(Context context) {
        if (!f119172g) {
            m129065a(context);
        }
        return f119169d;
    }
}

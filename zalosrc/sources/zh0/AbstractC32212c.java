package zh0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zh0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC32212c {
    /* renamed from: a */
    public static int m155331a(Context context) {
        WindowManager windowManager;
        WindowManager windowManager2;
        int i11;
        if (context instanceof Activity) {
            windowManager2 = ((Activity) context).getWindowManager();
        } else {
            try {
                windowManager = (WindowManager) context.getSystemService("window");
            } catch (Exception e11) {
                e11.printStackTrace();
                windowManager = null;
                if (context.getResources().getConfiguration().orientation == 2) {
                    windowManager2 = null;
                    i11 = 90;
                }
            }
            windowManager2 = windowManager;
        }
        i11 = 0;
        if (windowManager2 != null) {
            int rotation = windowManager2.getDefaultDisplay().getRotation();
            if (rotation != 0) {
                if (rotation == 1) {
                    return 90;
                }
                if (rotation != 2) {
                    if (rotation == 3) {
                        return 270;
                    }
                } else {
                    return 180;
                }
            } else {
                return 0;
            }
        }
        return i11;
    }

    /* renamed from: b */
    public static boolean m155332b() {
        if (Camera.getNumberOfCameras() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m155333c() {
        String str = Build.MODEL;
        if (!str.startsWith("PAFM") && !str.startsWith("PAHM") && !str.startsWith("PAFT") && !str.startsWith("CPH1871") && !str.startsWith("CPH1875") && !str.startsWith("CPH1969") && !str.startsWith("CPH1917") && !str.startsWith("CPH1919")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m155334d(int i11) {
        return i11 == 90 || i11 == 270;
    }

    /* renamed from: e */
    public static boolean m155335e(Context context) {
        int m155331a = m155331a(context);
        if (m155331a != 90 && m155331a != 270) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String m155336f(Camera.Parameters parameters, int i11, int i12) {
        String str = "";
        if (parameters != null && parameters.getMaxNumFocusAreas() > 0) {
            if (parameters.getSupportedFocusModes().contains("auto")) {
                parameters.setFocusMode("auto");
                str = "auto";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(new Rect(i11, i12, i11 + 80, i12 + 80), 1000));
            parameters.setFocusAreas(arrayList);
            if (parameters.getMaxNumMeteringAreas() > 0) {
                parameters.setMeteringAreas(arrayList);
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:            if (r5.contains("auto") != false) goto L13;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m155337g(Camera.Parameters parameters, int i11, boolean z11) {
        String str;
        int i12;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        int i13 = 0;
        if (z11) {
            str = "continuous-video";
            if (supportedFocusModes.contains("continuous-video")) {
                i12 = 5;
                if (TextUtils.isEmpty(str)) {
                    String str2 = "continuous-picture";
                    if (supportedFocusModes.contains("continuous-picture")) {
                        i13 = 6;
                    } else {
                        str2 = "auto";
                    }
                    str = str2;
                    if (!TextUtils.isEmpty(str)) {
                        parameters.setFocusMode(str);
                    }
                    return i13;
                }
                i13 = i12;
                if (!TextUtils.isEmpty(str)) {
                }
                return i13;
            }
        }
        str = "";
        i12 = 0;
        if (TextUtils.isEmpty(str)) {
        }
        i13 = i12;
        if (!TextUtils.isEmpty(str)) {
        }
        return i13;
    }
}

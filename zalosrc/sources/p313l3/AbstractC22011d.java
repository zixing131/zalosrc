package p313l3;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Patterns;
import com.adtima.Adtima;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p009a3.C0098c;
import p227i3.AbstractC20202f;
import p227i3.C20217u;

/* renamed from: l3.d */
/* loaded from: classes2.dex */
public abstract class AbstractC22011d {

    /* renamed from: a */
    private static final String f108380a = "d";

    /* renamed from: a */
    public static int m114900a(Context context, float f11) {
        return (int) (f11 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    /* renamed from: b */
    public static int m114901b(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            if (str.length() == 5) {
                simpleDateFormat = new SimpleDateFormat("mm:ss");
            }
            Date parse = simpleDateFormat.parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parse);
            return (calendar.get(10) * 3600) + (calendar.get(12) * 60) + calendar.get(13);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static Activity m114902c() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            for (Object obj : map.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Exception e11) {
            Adtima.m18329e(f108380a, "getCurrentActivity", e11);
            return null;
        }
    }

    /* renamed from: d */
    public static Bitmap m114903d(Bitmap bitmap, int i11, int i12, int i13, int i14) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            float f11 = i11;
            float f12 = i12;
            float f13 = i14;
            float f14 = i13;
            float[] fArr = {f11, f11, f12, f12, f13, f13, f14, f14};
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return createBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m114904e(int i11) {
        try {
            return String.format("%d:%02d:%02d", Integer.valueOf(i11 / 3600), Integer.valueOf((i11 % 3600) / 60), Integer.valueOf(i11 % 60));
        } catch (Exception e11) {
            Adtima.m18329e(f108380a, "convertTimeDuration", e11);
            return null;
        }
    }

    /* renamed from: f */
    public static String m114905f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e11) {
            Adtima.m18329e(f108380a, "getAppVersion", e11);
            return null;
        }
    }

    /* renamed from: g */
    public static String m114906g(Bundle bundle) {
        if (bundle != null) {
            try {
                TreeSet treeSet = new TreeSet(bundle.keySet());
                StringBuilder sb2 = new StringBuilder();
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    sb2.append(str);
                    sb2.append("=");
                    sb2.append(bundle.get(str));
                }
                return m114920u(sb2.toString());
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static String m114907h(String str, String str2) {
        try {
            String substring = str.substring(0, str.lastIndexOf("/"));
            return str2.replace("=\"images/", "=\"" + substring + "/images/").replace("=\"css/", "=\"" + substring + "/css/").replace("=\"js/", "=\"" + substring + "/js/");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m114908i(C0098c c0098c) {
        if (c0098c != null) {
            try {
                return c0098c.f542x0.length() > 0;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m114909j(CharSequence charSequence) {
        try {
            if (TextUtils.isEmpty(charSequence)) {
                return false;
            }
            return Patterns.WEB_URL.matcher(charSequence).matches();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public static String[] m114910k(JSONArray jSONArray) {
        String[] strArr = null;
        if (jSONArray != null) {
            try {
                strArr = new String[jSONArray.length()];
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    strArr[i11] = jSONArray.getString(i11);
                }
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    /* renamed from: l */
    public static String m114911l(String str) {
        try {
            InputStream openStream = FirebasePerfUrlConnection.openStream(new URL(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openStream));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append(System.getProperty("line.separator"));
            }
            openStream.close();
            if (sb2.length() != 0) {
                return m114907h(str, sb2.toString());
            }
        } catch (Exception e11) {
            Adtima.m18329e(f108380a, "downloadUrl", e11);
        }
        return "";
    }

    /* renamed from: m */
    public static boolean m114912m(C0098c c0098c) {
        if (c0098c != null) {
            try {
                if (c0098c.f514j0 != null) {
                    return new JSONObject(c0098c.f514j0).optBoolean("adsShouldConfirmOutApp");
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m114913n(Context context) {
        boolean z11 = false;
        try {
            int m105582L0 = C20217u.m105538N0().m105582L0();
            Adtima.m18328e(f108380a, "isForegroundProcess id: " + m105582L0);
            if (m105582L0 != 0) {
                return m105582L0 == Process.myPid();
            }
            if (context != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.importance == 100 && Process.myPid() == next.pid && !next.processName.equals("com.zing.mp3:player")) {
                        Adtima.m18328e(f108380a, "isForegroundProcess name in: " + next.processName);
                        C20217u.m105538N0().m105600g0(next.pid);
                        z11 = true;
                        break;
                    }
                }
            }
            Adtima.m18328e(f108380a, "isForegroundProcess id after: " + C20217u.m105538N0().m105582L0());
            if (z11) {
                return z11;
            }
            C20217u.m105538N0().m105600g0(-1);
            return z11;
        } catch (Exception e11) {
            Adtima.m18329e(f108380a, "isForegroundProcess", e11);
            return false;
        }
    }

    /* renamed from: o */
    public static String m114914o(String str) {
        try {
            return str.substring(0, str.lastIndexOf("/") + 1);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: p */
    public static String m114915p(String str) {
        if (str != null) {
            try {
                if (str.contains("&h=")) {
                    return str.substring(str.indexOf("&h=") + 3, str.indexOf("&h=") + 6);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: q */
    public static String m114916q(String str) {
        if (str != null) {
            try {
                return new URI(str).getHost();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: r */
    public static double m114917r(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream openStream = FirebasePerfUrlConnection.openStream(new URL(str));
            BitmapFactory.decodeStream(openStream, null, options);
            openStream.close();
            return options.outWidth / options.outHeight;
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    /* renamed from: s */
    public static boolean m114918s(String str) {
        try {
            try {
                new JSONObject(str);
                return true;
            } catch (JSONException unused) {
                return false;
            }
        } catch (JSONException unused2) {
            new JSONArray(str);
            return true;
        }
    }

    /* renamed from: t */
    public static boolean m114919t(String str) {
        try {
            if (TextUtils.isEmpty(str) || AbstractC20202f.f99824m0 == null) {
                return false;
            }
            int i11 = 0;
            while (true) {
                String[] strArr = AbstractC20202f.f99824m0;
                if (i11 >= strArr.length) {
                    return false;
                }
                if (str.contains(strArr[i11])) {
                    return true;
                }
                i11++;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: u */
    public static final String m114920u(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                sb2.append(String.format("%02X", Byte.valueOf(b11)));
            }
            return sb2.toString().toLowerCase();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: v */
    public static int m114921v(String str) {
        int i11;
        int i12 = 0;
        if (str == null) {
            return 0;
        }
        int i13 = 0;
        while (true) {
            try {
                String[] strArr = AbstractC20202f.f99822l0;
                if (i13 >= strArr.length) {
                    i11 = 0;
                    break;
                }
                if (str.contains(strArr[i13])) {
                    i11 = 1;
                    break;
                }
                i13++;
            } catch (Exception unused) {
                return 0;
            }
        }
        if (i11 == 0) {
            while (true) {
                try {
                    String[] strArr2 = AbstractC20202f.f99820k0;
                    if (i12 >= strArr2.length) {
                        break;
                    }
                    if (str.contains(strArr2[i12])) {
                        return 2;
                    }
                    i12++;
                } catch (Exception unused2) {
                }
            }
        }
        return i11;
    }

    /* renamed from: w */
    public static boolean m114922w(String str) {
        if (str != null) {
            try {
                int m114921v = m114921v(str);
                if (m114921v == 1) {
                    return false;
                }
                if (m114921v != 2 && str.startsWith("http") && !str.contains("zaloapp.com") && !str.contains("zalo.me")) {
                    if (!str.contains("play.google.com/store/apps")) {
                        return false;
                    }
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}

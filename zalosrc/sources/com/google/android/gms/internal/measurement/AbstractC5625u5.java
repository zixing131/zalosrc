package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.u5 */
/* loaded from: classes2.dex */
public abstract class AbstractC5625u5 {

    /* renamed from: f */
    static HashMap f32828f;

    /* renamed from: k */
    private static Object f32833k;

    /* renamed from: l */
    static boolean f32834l;

    /* renamed from: a */
    public static final Uri f32823a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f32824b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f32825c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f32826d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    private static final AtomicBoolean f32827e = new AtomicBoolean();

    /* renamed from: g */
    static final HashMap f32829g = new HashMap(16, 1.0f);

    /* renamed from: h */
    static final HashMap f32830h = new HashMap(16, 1.0f);

    /* renamed from: i */
    static final HashMap f32831i = new HashMap(16, 1.0f);

    /* renamed from: j */
    static final HashMap f32832j = new HashMap(16, 1.0f);

    /* renamed from: m */
    static final String[] f32835m = new String[0];

    /* renamed from: a */
    public static String m29676a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC5625u5.class) {
            try {
                String str3 = null;
                if (f32828f == null) {
                    f32827e.set(false);
                    f32828f = new HashMap(16, 1.0f);
                    f32833k = new Object();
                    f32834l = false;
                    contentResolver.registerContentObserver(f32823a, true, new C5591s5(null));
                } else if (f32827e.getAndSet(false)) {
                    f32828f.clear();
                    f32829g.clear();
                    f32830h.clear();
                    f32831i.clear();
                    f32832j.clear();
                    f32833k = new Object();
                    f32834l = false;
                }
                Object obj = f32833k;
                if (f32828f.containsKey(str)) {
                    String str4 = (String) f32828f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f32835m.length;
                Cursor query = contentResolver.query(f32823a, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        m29678c(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    m29678c(obj, str, string);
                    if (string == null) {
                        return null;
                    }
                    return string;
                } finally {
                    query.close();
                }
            } finally {
            }
        }
    }

    /* renamed from: c */
    private static void m29678c(Object obj, String str, String str2) {
        synchronized (AbstractC5625u5.class) {
            try {
                if (obj == f32833k) {
                    f32828f.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

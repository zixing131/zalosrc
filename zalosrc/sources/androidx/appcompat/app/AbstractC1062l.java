package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.l */
/* loaded from: classes2.dex */
abstract class AbstractC1062l {

    /* renamed from: a */
    private static Field f3854a;

    /* renamed from: b */
    private static boolean f3855b;

    /* renamed from: c */
    private static Class f3856c;

    /* renamed from: d */
    private static boolean f3857d;

    /* renamed from: e */
    private static Field f3858e;

    /* renamed from: f */
    private static boolean f3859f;

    /* renamed from: g */
    private static Field f3860g;

    /* renamed from: h */
    private static boolean f3861h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4917a(Resources resources) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return;
        }
        if (i11 >= 24) {
            m4920d(resources);
        } else if (i11 >= 23) {
            m4919c(resources);
        } else {
            m4918b(resources);
        }
    }

    /* renamed from: b */
    private static void m4918b(Resources resources) {
        Map map;
        if (!f3855b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f3854a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3855b = true;
        }
        Field field = f3854a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m4919c(Resources resources) {
        Object obj;
        if (!f3855b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f3854a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3855b = true;
        }
        Field field = f3854a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
            if (obj != null) {
                return;
            }
            m4921e(obj);
            return;
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* renamed from: d */
    private static void m4920d(Resources resources) {
        Object obj;
        if (!f3861h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f3860g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3861h = true;
        }
        Field field = f3860g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f3855b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f3854a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f3855b = true;
        }
        Field field2 = f3854a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            m4921e(obj2);
        }
    }

    /* renamed from: e */
    private static void m4921e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f3857d) {
            try {
                f3856c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f3857d = true;
        }
        Class cls = f3856c;
        if (cls == null) {
            return;
        }
        if (!f3859f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f3858e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f3859f = true;
        }
        Field field = f3858e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}

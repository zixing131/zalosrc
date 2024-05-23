package com.zing.zalo.zinstant;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

/* renamed from: com.zing.zalo.zinstant.i1 */
/* loaded from: classes.dex */
public abstract class AbstractC17158i1 {

    /* renamed from: a */
    private static Context f87691a = null;

    /* renamed from: b */
    public static DatabaseErrorHandler f87692b = null;

    /* renamed from: c */
    private static Drawable f87693c = null;

    /* renamed from: d */
    private static Drawable f87694d = null;

    /* renamed from: e */
    public static float f87695e = 1.0f;

    /* renamed from: f */
    public static float f87696f = 1.0f;

    /* renamed from: g */
    public static float f87697g = 1.0f;

    /* renamed from: h */
    public static String f87698h = "";

    /* renamed from: i */
    private static int f87699i = 1;

    /* renamed from: com.zing.zalo.zinstant.i1$a */
    /* loaded from: classes7.dex */
    private static class a {

        /* renamed from: a */
        static final Bitmap f87700a;

        /* renamed from: b */
        static final Bitmap f87701b;

        static {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap createBitmap = Bitmap.createBitmap(32, 32, config);
            f87700a = createBitmap;
            createBitmap.eraseColor(-1183502);
            Bitmap createBitmap2 = Bitmap.createBitmap(32, 32, config);
            f87701b = createBitmap2;
            createBitmap2.eraseColor(-12961222);
        }
    }

    /* renamed from: a */
    public static Context m91742a() {
        return f87691a;
    }

    /* renamed from: b */
    public static Drawable m91743b() {
        return f87694d;
    }

    /* renamed from: c */
    public static Drawable m91744c() {
        return f87693c;
    }

    /* renamed from: d */
    public static Bitmap m91745d() {
        if (f87699i == 1) {
            return a.f87700a;
        }
        return a.f87701b;
    }

    /* renamed from: e */
    public static int m91746e() {
        return f87699i;
    }

    /* renamed from: f */
    public static void m91747f(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            float f11 = displayMetrics.density;
            f87696f = f11;
            f87695e = displayMetrics.scaledDensity;
            f87697g = f11 / 16.0f;
            return;
        }
        throw new IllegalArgumentException("DisplayMetrics must be non-null");
    }

    /* renamed from: g */
    public static void m91748g(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            f87691a = context;
            m91747f(context);
            return;
        }
        throw new IllegalArgumentException("Given context is null");
    }

    /* renamed from: h */
    public static void m91749h(Drawable drawable, Drawable drawable2) {
        f87693c = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), f87693c.getIntrinsicHeight());
        f87694d = drawable2;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), f87694d.getIntrinsicHeight());
    }

    /* renamed from: i */
    public static void m91750i(int i11) {
        f87699i = i11;
    }
}

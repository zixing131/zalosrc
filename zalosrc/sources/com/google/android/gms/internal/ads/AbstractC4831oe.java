package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.oe */
/* loaded from: classes2.dex */
public abstract class AbstractC4831oe {

    /* renamed from: a */
    private static final char[] f25610a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static long m25166a(double d11, int i11, DisplayMetrics displayMetrics) {
        return Math.round(d11 / displayMetrics.density);
    }

    /* renamed from: b */
    public static Activity m25167b(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i11 = 0; (context instanceof ContextWrapper) && i11 < 10; i11++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: c */
    public static String m25168c(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 + i11;
            char[] cArr2 = f25610a;
            cArr[i12] = cArr2[(b11 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: d */
    public static String m25169d(String str) {
        if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(str);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            return AbstractC5163xb.m27875a(bArr, true);
        }
        return str;
    }

    /* renamed from: e */
    public static String m25170e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: f */
    public static boolean m25171f() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m25172g(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m25173h(DisplayMetrics displayMetrics) {
        if (displayMetrics != null && displayMetrics.density != 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static byte[] m25174i(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i11 = 0; i11 < length; i11 += 2) {
                bArr[i11 / 2] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }
}

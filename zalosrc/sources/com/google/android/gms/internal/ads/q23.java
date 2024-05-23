package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class q23 {

    /* renamed from: a */
    public static final int f26609a;

    /* renamed from: b */
    public static final ClipData f26610b;

    static {
        int i11;
        if (Build.VERSION.SDK_INT > 22) {
            i11 = 67108864;
        } else {
            i11 = 0;
        }
        f26609a = i11;
        f26610b = ClipData.newIntent("", new Intent());
    }

    /* renamed from: a */
    public static PendingIntent m25632a(Context context, int i11, Intent intent, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if ((i12 & 95) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        j53.m23536f(z11, "Cannot set any dangerous parts of intent to be mutable.");
        if (intent.getComponent() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        j53.m23536f(z12, "Must set component on Intent.");
        if (m25633b(0, 1)) {
            j53.m23536f(!m25633b(i12, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !m25633b(i12, 67108864)) {
                z13 = false;
            }
            j53.m23536f(z13, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !m25633b(i12, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!m25633b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!m25633b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!m25633b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!m25633b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f26610b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i12);
    }

    /* renamed from: b */
    private static boolean m25633b(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}

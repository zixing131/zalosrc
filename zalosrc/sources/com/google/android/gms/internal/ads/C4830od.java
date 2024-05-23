package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.od */
/* loaded from: classes2.dex */
public final class C4830od {

    /* renamed from: d */
    private static final String[] f25601d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    private final String f25602a = "ad.doubleclick.net";

    /* renamed from: b */
    private final String[] f25603b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c */
    private final InterfaceC4681kd f25604c;

    public C4830od(InterfaceC4681kd interfaceC4681kd) {
        this.f25604c = interfaceC4681kd;
    }

    /* renamed from: g */
    private final Uri m25157g(Uri uri, String str) {
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.f25602a)) {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i11 = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i11) + "dc_ms=" + str + ";" + uri2.substring(i11));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new zzapf("Parameter already exists: dc_ms");
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") == null) {
                String uri3 = uri.toString();
                int indexOf3 = uri3.indexOf("&adurl");
                if (indexOf3 == -1) {
                    indexOf3 = uri3.indexOf("?adurl");
                }
                if (indexOf3 != -1) {
                    int i12 = indexOf3 + 1;
                    return Uri.parse(uri3.substring(0, i12) + "ms=" + str + "&" + uri3.substring(i12));
                }
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            throw new zzapf("Query parameter already exists: ms");
        } catch (UnsupportedOperationException unused2) {
            throw new zzapf("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    public final Uri m25158a(Uri uri, Context context, View view, Activity activity) {
        try {
            return m25157g(uri, this.f25604c.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzapf("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: b */
    public final Uri m25159b(Uri uri, Context context) {
        return m25157g(uri, this.f25604c.zzg(context));
    }

    /* renamed from: c */
    public final InterfaceC4681kd m25160c() {
        return this.f25604c;
    }

    /* renamed from: d */
    public final void m25161d(MotionEvent motionEvent) {
        this.f25604c.zzk(motionEvent);
    }

    /* renamed from: e */
    public final boolean m25162e(Uri uri) {
        if (m25163f(uri)) {
            String[] strArr = f25601d;
            for (int i11 = 0; i11 < 3; i11++) {
                if (uri.getPath().endsWith(strArr[i11])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m25163f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f25603b;
            for (int i11 = 0; i11 < 3; i11++) {
                if (host.endsWith(strArr[i11])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}

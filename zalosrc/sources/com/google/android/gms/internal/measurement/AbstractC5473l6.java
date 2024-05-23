package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p665y0.C30239a;

/* renamed from: com.google.android.gms.internal.measurement.l6 */
/* loaded from: classes.dex */
public abstract class AbstractC5473l6 {

    /* renamed from: a */
    private static final C30239a f32475a = new C30239a();

    /* renamed from: a */
    public static synchronized Uri m29403a(String str) {
        synchronized (AbstractC5473l6.class) {
            C30239a c30239a = f32475a;
            Uri uri = (Uri) c30239a.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                c30239a.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}

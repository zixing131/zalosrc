package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.StrictMode;
import androidx.appcompat.widget.AbstractC1158c0;
import java.util.Iterator;
import java.util.Map;
import p665y0.C30239a;

/* renamed from: com.google.android.gms.internal.measurement.y6 */
/* loaded from: classes.dex */
public abstract class AbstractC5694y6 implements InterfaceC5354e6 {

    /* renamed from: a */
    private static final Map f32928a = new C30239a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC5694y6 m30042a(Context context, String str, Runnable runnable) {
        if (!AbstractC5659w5.m29981b()) {
            synchronized (AbstractC5694y6.class) {
                AbstractC1158c0.m5500a(f32928a.get(null));
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } finally {
                }
            }
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized void m30043b() {
        synchronized (AbstractC5694y6.class) {
            Map map = f32928a;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                AbstractC1158c0.m5500a(it.next());
                throw null;
            }
        }
    }
}

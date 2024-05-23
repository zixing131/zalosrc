package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import androidx.appcompat.widget.AbstractC1158c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p665y0.C30239a;

/* renamed from: com.google.android.gms.internal.measurement.a6 */
/* loaded from: classes.dex */
public final class C5286a6 implements InterfaceC5354e6 {

    /* renamed from: h */
    private static final Map f32246h = new C30239a();

    /* renamed from: i */
    public static final String[] f32247i = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f32248a;

    /* renamed from: b */
    private final Uri f32249b;

    /* renamed from: c */
    private final Runnable f32250c;

    /* renamed from: d */
    private final ContentObserver f32251d;

    /* renamed from: e */
    private final Object f32252e;

    /* renamed from: f */
    private volatile Map f32253f;

    /* renamed from: g */
    private final List f32254g;

    private C5286a6(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C5710z5 c5710z5 = new C5710z5(this, null);
        this.f32251d = c5710z5;
        this.f32252e = new Object();
        this.f32254g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f32248a = contentResolver;
        this.f32249b = uri;
        this.f32250c = runnable;
        contentResolver.registerContentObserver(uri, false, c5710z5);
    }

    /* renamed from: a */
    public static C5286a6 m28873a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C5286a6 c5286a6;
        synchronized (C5286a6.class) {
            Map map = f32246h;
            c5286a6 = (C5286a6) map.get(uri);
            if (c5286a6 == null) {
                try {
                    C5286a6 c5286a62 = new C5286a6(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c5286a62);
                    } catch (SecurityException unused) {
                    }
                    c5286a6 = c5286a62;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c5286a6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static synchronized void m28874d() {
        synchronized (C5286a6.class) {
            try {
                for (C5286a6 c5286a6 : f32246h.values()) {
                    c5286a6.f32248a.unregisterContentObserver(c5286a6.f32251d);
                }
                f32246h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final Map m28875b() {
        Map map;
        Map map2 = this.f32253f;
        if (map2 == null) {
            synchronized (this.f32252e) {
                try {
                    map2 = this.f32253f;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            map = (Map) AbstractC5320c6.m28968a(new InterfaceC5337d6() { // from class: com.google.android.gms.internal.measurement.y5
                                @Override // com.google.android.gms.internal.measurement.InterfaceC5337d6
                                public final Object zza() {
                                    return C5286a6.this.m28876c();
                                }
                            });
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th2;
                        }
                        this.f32253f = map;
                        map2 = map;
                    }
                } finally {
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Map m28876c() {
        Map hashMap;
        Cursor query = this.f32248a.query(this.f32249b, f32247i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new C30239a(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    public final void m28877e() {
        synchronized (this.f32252e) {
            this.f32253f = null;
            this.f32250c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f32254g.iterator();
                if (it.hasNext()) {
                    AbstractC1158c0.m5500a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5354e6
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) m28875b().get(str);
    }
}

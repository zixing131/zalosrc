package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vx */
/* loaded from: classes2.dex */
public final class C5110vx {

    /* renamed from: a */
    private final List f29600a = new LinkedList();

    /* renamed from: b */
    private final Map f29601b;

    /* renamed from: c */
    private final Object f29602c;

    public C5110vx(boolean z11, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f29601b = linkedHashMap;
        this.f29602c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    /* renamed from: f */
    public static final C4999sx m27422f() {
        return new C4999sx(zzt.zzB().mo105914b(), null, null);
    }

    /* renamed from: a */
    public final C5073ux m27423a() {
        C5073ux c5073ux;
        boolean booleanValue = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f29602c) {
            try {
                for (C4999sx c4999sx : this.f29600a) {
                    long m26449a = c4999sx.m26449a();
                    String m26451c = c4999sx.m26451c();
                    C4999sx m26450b = c4999sx.m26450b();
                    if (m26450b != null && m26449a > 0) {
                        long m26449a2 = m26449a - m26450b.m26449a();
                        sb2.append(m26451c);
                        sb2.append('.');
                        sb2.append(m26449a2);
                        sb2.append(',');
                        if (booleanValue) {
                            if (!hashMap.containsKey(Long.valueOf(m26450b.m26449a()))) {
                                hashMap.put(Long.valueOf(m26450b.m26449a()), new StringBuilder(m26451c));
                            } else {
                                StringBuilder sb3 = (StringBuilder) hashMap.get(Long.valueOf(m26450b.m26449a()));
                                sb3.append('+');
                                sb3.append(m26451c);
                            }
                        }
                    }
                }
                this.f29600a.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        sb4.append(zzt.zzB().mo105913a() + (((Long) entry.getKey()).longValue() - zzt.zzB().mo105914b()));
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    str = sb4.toString();
                }
                c5073ux = new C5073ux(sb2.toString(), str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5073ux;
    }

    /* renamed from: b */
    public final Map m27424b() {
        Map map;
        synchronized (this.f29602c) {
            zzt.zzo().m22934f();
            map = this.f29601b;
        }
        return map;
    }

    /* renamed from: c */
    public final void m27425c(C5110vx c5110vx) {
        synchronized (this.f29602c) {
        }
    }

    /* renamed from: d */
    public final void m27426d(String str, String str2) {
        C4738lx m22934f;
        if (TextUtils.isEmpty(str2) || (m22934f = zzt.zzo().m22934f()) == null) {
            return;
        }
        synchronized (this.f29602c) {
            AbstractC4962rx m24395a = m22934f.m24395a(str);
            Map map = this.f29601b;
            map.put(str, m24395a.mo25351a((String) map.get(str), str2));
        }
    }

    /* renamed from: e */
    public final boolean m27427e(C4999sx c4999sx, long j11, String... strArr) {
        synchronized (this.f29602c) {
            for (int i11 = 0; i11 <= 0; i11++) {
                try {
                    this.f29600a.add(new C4999sx(j11, strArr[i11], c4999sx));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return true;
    }
}

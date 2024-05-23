package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class mt1 {

    /* renamed from: e */
    private final String f24743e;

    /* renamed from: f */
    private final it1 f24744f;

    /* renamed from: b */
    private final List f24740b = new ArrayList();

    /* renamed from: c */
    private boolean f24741c = false;

    /* renamed from: d */
    private boolean f24742d = false;

    /* renamed from: a */
    private final zzg f24739a = zzt.zzo().m22936h();

    public mt1(String str, it1 it1Var) {
        this.f24743e = str;
        this.f24744f = it1Var;
    }

    /* renamed from: g */
    private final Map m24708g() {
        String str;
        Map m23389f = this.f24744f.m23389f();
        m23389f.put("tms", Long.toString(zzt.zzB().mo105914b(), 10));
        if (this.f24739a.zzP()) {
            str = "";
        } else {
            str = this.f24743e;
        }
        m23389f.put("tid", str);
        return m23389f;
    }

    /* renamed from: a */
    public final synchronized void m24709a(String str) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21063N1)).booleanValue()) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
                Map m24708g = m24708g();
                m24708g.put("action", "aaia");
                m24708g.put("aair", "MalformedJson");
                this.f24740b.add(m24708g);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m24710b(String str, String str2) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21063N1)).booleanValue()) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
                Map m24708g = m24708g();
                m24708g.put("action", "adapter_init_finished");
                m24708g.put("ancn", str);
                m24708g.put("rqe", str2);
                this.f24740b.add(m24708g);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m24711c(String str) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21063N1)).booleanValue()) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
                Map m24708g = m24708g();
                m24708g.put("action", "adapter_init_started");
                m24708g.put("ancn", str);
                this.f24740b.add(m24708g);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void m24712d(String str) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21063N1)).booleanValue()) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
                Map m24708g = m24708g();
                m24708g.put("action", "adapter_init_finished");
                m24708g.put("ancn", str);
                this.f24740b.add(m24708g);
            }
        }
    }

    /* renamed from: e */
    public final synchronized void m24713e() {
        try {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21063N1)).booleanValue()) {
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
                    if (!this.f24742d) {
                        Map m24708g = m24708g();
                        m24708g.put("action", "init_finished");
                        this.f24740b.add(m24708g);
                        Iterator it = this.f24740b.iterator();
                        while (it.hasNext()) {
                            this.f24744f.m24035e((Map) it.next());
                        }
                        this.f24742d = true;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public final synchronized void m24714f() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21063N1)).booleanValue()) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
                if (!this.f24741c) {
                    Map m24708g = m24708g();
                    m24708g.put("action", "init_started");
                    this.f24740b.add(m24708g);
                    this.f24741c = true;
                }
            }
        }
    }
}

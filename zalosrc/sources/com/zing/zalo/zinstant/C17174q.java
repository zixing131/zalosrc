package com.zing.zalo.zinstant;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import nj0.AbstractC23802a;
import vg.AbstractC28163q2;
import vj0.AbstractC28268b;

/* renamed from: com.zing.zalo.zinstant.q */
/* loaded from: classes.dex */
public class C17174q extends AbstractC23802a {

    /* renamed from: b */
    private Object f87726b;

    /* renamed from: c */
    private final Object f87727c = new Object();

    @Override // nj0.AbstractC23802a, com.zing.zalo.zinstant.InterfaceC17139d
    /* renamed from: a */
    public Object mo91642a(String str, String str2, String str3) {
        try {
            Object mo91642a = super.mo91642a(str, str2, str3);
            if (mo91642a == null) {
                return AbstractC28163q2.m141688h(str, str2, str3);
            }
            return mo91642a;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    @Override // nj0.AbstractC23802a, com.zing.zalo.zinstant.InterfaceC17139d
    /* renamed from: b */
    public int mo91643b(String str, String str2, boolean z11) {
        try {
            int mo91643b = super.mo91643b(str, str2, z11);
            if (mo91643b == -1) {
                if (AbstractC28163q2.m141686f(str, str2)) {
                    return 1;
                }
                return 0;
            }
            return mo91643b;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // nj0.AbstractC23802a, com.zing.zalo.zinstant.InterfaceC17139d
    /* renamed from: c */
    public String mo91644c(String str, String str2, String str3) {
        try {
            String mo91644c = super.mo91644c(str, str2, str3);
            if (TextUtils.isEmpty(mo91644c)) {
                mo91644c = AbstractC28163q2.m141687g(str, str2, m91780e());
            }
            if (mo91644c == null) {
                return null;
            }
            return AbstractC28268b.m142406a(mo91644c);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public Object m91780e() {
        Object obj;
        synchronized (this.f87727c) {
            obj = this.f87726b;
        }
        return obj;
    }

    /* renamed from: f */
    public void m91781f(Object obj) {
        synchronized (this.f87727c) {
            this.f87726b = obj;
        }
    }
}

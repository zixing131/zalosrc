package com.zing.zalo.zinstant;

import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import uk0.InterfaceC27292f;

/* renamed from: com.zing.zalo.zinstant.p */
/* loaded from: classes7.dex */
public class C17172p implements InterfaceC27292f {
    @Override // uk0.InterfaceC27292f
    /* renamed from: a */
    public void mo91777a(int i11, String str) {
        try {
            AbstractC17155h1.m91737d(AbstractC17148f0.m91690i(i11), str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // uk0.InterfaceC27292f
    /* renamed from: b */
    public void mo44291b(int i11, String str, String str2, ZOMInsight zOMInsight) {
        try {
            int m91690i = AbstractC17148f0.m91690i(i11);
            if (str != null) {
                AbstractC17155h1.m91738e(m91690i, str, str2, zOMInsight);
                AbstractC17153h.m91726r();
                return;
            }
            throw new IllegalArgumentException("zinstantDataId == null");
        } catch (Exception e11) {
            AbstractC17153h.m91725q(e11);
        }
    }

    @Override // uk0.InterfaceC27292f
    /* renamed from: c */
    public void mo91778c(int i11, String str, long j11) {
        try {
            AbstractC17155h1.m91739f(AbstractC17148f0.m91690i(i11), str, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // uk0.InterfaceC27292f
    /* renamed from: d */
    public void mo44292d(int i11, String str, String str2, ZOMInsight zOMInsight) {
        try {
            int m91690i = AbstractC17148f0.m91690i(i11);
            if (str != null) {
                AbstractC17155h1.m91735b(m91690i, str, str2, zOMInsight);
                AbstractC17153h.m91724p();
                return;
            }
            throw new IllegalArgumentException("zinstantDataId == null");
        } catch (Exception e11) {
            AbstractC17153h.m91723o(e11);
        }
    }

    @Override // uk0.InterfaceC27292f
    /* renamed from: e */
    public void mo91779e(int i11, String str, String str2, ZOMInsight zOMInsight) {
        try {
            int m91690i = AbstractC17148f0.m91690i(i11);
            if (str != null) {
                AbstractC17155h1.m91736c(m91690i, str, str2, zOMInsight);
                AbstractC17153h.m91728t();
                return;
            }
            throw new IllegalArgumentException("zinstantDataId == null");
        } catch (Exception e11) {
            AbstractC17153h.m91727s(e11);
        }
    }
}

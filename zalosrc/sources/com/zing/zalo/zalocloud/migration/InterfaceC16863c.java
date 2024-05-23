package com.zing.zalo.zalocloud.migration;

import java.util.Map;
import p487rl.EnumC25825f;
import qm0.AbstractC25363p0;

/* renamed from: com.zing.zalo.zalocloud.migration.c */
/* loaded from: classes7.dex */
public interface InterfaceC16863c {

    /* renamed from: com.zing.zalo.zalocloud.migration.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m90079a(InterfaceC16863c interfaceC16863c, EnumC25825f enumC25825f, Map map, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    map = AbstractC25363p0.m131404i();
                }
                interfaceC16863c.mo90076c(enumC25825f, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onUploadEnd");
        }
    }

    /* renamed from: a */
    void mo90074a();

    /* renamed from: b */
    void mo90075b();

    /* renamed from: c */
    void mo90076c(EnumC25825f enumC25825f, Map map);

    /* renamed from: d */
    void mo90077d(int i11, int i12, int i13, int i14);

    /* renamed from: e */
    void mo90078e(EnumC25825f enumC25825f);

    void onStart();
}

package com.zing.zalo.zinstant.utils;

import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMAudio;
import com.zing.zalo.zinstant.zom.node.ZOMContainer;
import com.zing.zalo.zinstant.zom.node.ZOMImage;
import com.zing.zalo.zinstant.zom.node.ZOMInput;
import com.zing.zalo.zinstant.zom.node.ZOMSkeleton;
import com.zing.zalo.zinstant.zom.node.ZOMSlider;
import com.zing.zalo.zinstant.zom.node.ZOMText;
import com.zing.zalo.zinstant.zom.node.ZOMVideo;
import fn0.AbstractC19074t;
import nk0.AbstractC23838k1;
import nk0.C23813c0;
import nk0.C23823f1;
import nk0.C23833j;
import nk0.C23841l1;
import nk0.C23855s0;
import nk0.C23857t0;
import nk0.C23858u;
import nk0.C23859u0;
import nk0.C23866y;
import nk0.C23869z0;
import qk0.AbstractC25310f;

/* renamed from: com.zing.zalo.zinstant.utils.p */
/* loaded from: classes7.dex */
public final class C17204p {

    /* renamed from: a */
    public static final C17204p f87762a = new C17204p();

    private C17204p() {
    }

    /* renamed from: a */
    public static final AbstractC25310f m91834a(C23855s0 c23855s0, ZOM zom) {
        AbstractC19074t.m100208f(c23855s0, "root");
        if (zom == null) {
            return null;
        }
        int i11 = zom.mType;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 != 7) {
                                if (i11 != 8) {
                                    if (i11 != 9) {
                                        return null;
                                    }
                                    return f87762a.m91837d(new C23833j(c23855s0, (ZOMAudio) zom), zom);
                                }
                                return f87762a.m91836c(new C23813c0(c23855s0, (ZOMInput) zom), zom);
                            }
                            return f87762a.m91837d(new C23859u0(c23855s0, (ZOMSkeleton) zom), zom);
                        }
                        return f87762a.m91836c(new C23869z0(c23855s0, (ZOMSlider) zom), zom);
                    }
                    if (zom.mOverflow == 2) {
                        C17204p c17204p = f87762a;
                        C23857t0 m91835b = c17204p.m91835b(c23855s0, (ZOMContainer) zom);
                        if (m91835b == null) {
                            return null;
                        }
                        return c17204p.m91836c(m91835b, zom);
                    }
                    return f87762a.m91837d(new C23858u(c23855s0, (ZOMContainer) zom), zom);
                }
                return f87762a.m91837d(new C23841l1(c23855s0, (ZOMVideo) zom), zom);
            }
            return f87762a.m91837d(new C23866y(c23855s0, (ZOMImage) zom), zom);
        }
        return f87762a.m91837d(new C23823f1(c23855s0, (ZOMText) zom), zom);
    }

    /* renamed from: b */
    private final C23857t0 m91835b(C23855s0 c23855s0, ZOMContainer zOMContainer) {
        try {
            return new C23857t0(c23855s0, zOMContainer);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final AbstractC25310f m91836c(AbstractC23838k1 abstractC23838k1, ZOM zom) {
        zom.addPlatformNode(abstractC23838k1);
        abstractC23838k1.m131000E().m124636Y(abstractC23838k1);
        return abstractC23838k1;
    }

    /* renamed from: d */
    private final AbstractC25310f m91837d(AbstractC25310f abstractC25310f, ZOM zom) {
        zom.addPlatformNode(abstractC25310f);
        return abstractC25310f;
    }
}

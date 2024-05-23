package vg;

import ag0.C0809c1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import h40.AbstractC19783c;
import im0.AbstractC20626a;
import li.AbstractC22490a;
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.C23665v;
import p361nb.C23669z;
import p420pb.C24709a;
import p645xh.C29628e;
import rh0.C25795c;

/* renamed from: vg.w7 */
/* loaded from: classes3.dex */
public class C28222w7 {

    /* renamed from: b */
    static volatile C28222w7 f131627b;

    /* renamed from: c */
    public static long f131628c;

    /* renamed from: a */
    volatile int f131629a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.w7$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ long f131630a;

        /* renamed from: b */
        final /* synthetic */ C23665v f131631b;

        /* renamed from: c */
        final /* synthetic */ boolean f131632c;

        a(long j11, C23665v c23665v, boolean z11) {
            this.f131630a = j11;
            this.f131631b = c23665v;
            this.f131632c = z11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C24709a.m128299t(MainApplication.getAppContext()).m128303G(this.f131631b);
                if (this.f131632c) {
                    synchronized (AbstractC23304d.f113293K) {
                        AbstractC23304d.f113293K = C24709a.m128299t(MainApplication.getAppContext()).m128313o(50L);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.w7$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f131634a;

        b(C23669z c23669z) {
            this.f131634a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f131634a);
        }
    }

    /* renamed from: a */
    public static synchronized C28222w7 m142183a() {
        C28222w7 c28222w7;
        synchronized (C28222w7.class) {
            try {
                if (f131627b == null) {
                    f131627b = new C28222w7();
                }
                c28222w7 = f131627b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28222w7;
    }

    /* renamed from: b */
    public void m142184b(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        try {
            try {
                if (AbstractC23309i.m122562x0() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (AbstractC23309i.m120962G3(2) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i11 != 3) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                AbstractC19783c.m103534e(z13);
                AbstractC22490a.m116283f("chat_head_state", Integer.toString(i11));
            } catch (Exception e11) {
                AbstractC23350e.m122774d("TimeOnAppManager", e11.toString());
            }
            if ((!z11 && !z12) || TextUtils.isEmpty(CoreUtility.f89233i)) {
                this.f131629a = i11;
                return;
            }
            if (i11 != 1 && i11 != 4) {
                if (i11 == 2 || i11 == 3) {
                    if (f131628c > 0) {
                        if (this.f131629a == 4) {
                            i12 = 13;
                        } else {
                            i12 = 11;
                        }
                        long currentTimeMillis = System.currentTimeMillis() - f131628c;
                        if (currentTimeMillis > 1000) {
                            boolean m93432x = C29628e.m147249E0().m93432x();
                            int m107387c = AbstractC20626a.m107387c();
                            C23665v c23665v = new C23665v(0, currentTimeMillis, m107387c, m93432x ? 1 : 0, String.valueOf(i12), C25795c.f122999c, System.currentTimeMillis());
                            synchronized (AbstractC23304d.f113293K) {
                                try {
                                    if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                                        AbstractC23304d.f113293K.add(c23665v);
                                    }
                                    if (AbstractC23304d.f113293K.size() >= 50) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                } finally {
                                }
                            }
                            if (z11) {
                                C0824j.m2153b(new a(currentTimeMillis, c23665v, z14));
                            }
                            if (z12) {
                                C23665v c23665v2 = new C23665v(1, currentTimeMillis, m107387c, m93432x ? 1 : 0, String.valueOf(i12), C25795c.f122999c, System.currentTimeMillis());
                                c23665v2.f114654a = 2;
                                c23665v2.f114655b = 1;
                                C0809c1.m2050b(new b(c23665v2));
                            }
                        }
                    }
                    if (i11 == 2) {
                        AbstractC23304d.f113357a.set(1);
                    } else {
                        AbstractC23304d.f113357a.set(0);
                    }
                    f131628c = -1L;
                }
            } else {
                if (f131628c <= 0) {
                    f131628c = System.currentTimeMillis();
                }
                AbstractC23304d.f113357a.set(2);
            }
            this.f131629a = i11;
        } catch (Throwable th2) {
            this.f131629a = i11;
            throw th2;
        }
    }
}

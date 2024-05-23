package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.content.res.AbstractC1401h;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3013n3;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import bo.C3063z0;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10880s;
import com.zing.zalo.social.controls.C10887z;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import ho0.AbstractC20110a;
import id0.C20518d;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kd0.C21693c;
import kd0.C21694d;
import kd0.C21697g;
import l30.AbstractC22055v0;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p266jg.AbstractC21244b;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p588vw.C28652r;
import p716zh.C31839a6;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C32049o6;
import th.AbstractC26683d;
import tn.C26761p;
import tr.C26881e;
import vg.AbstractC28236y3;
import vg.AbstractC28245z3;
import vg.C28100j3;

/* renamed from: com.zing.zalo.feed.components.q2 */
/* loaded from: classes4.dex */
public class C8364q2 extends C16716d implements C23744a.c {

    /* renamed from: M0 */
    private C16716d f45603M0;

    /* renamed from: N0 */
    private C22124b0 f45604N0;

    /* renamed from: O0 */
    private C22124b0 f45605O0;

    /* renamed from: P0 */
    private C22129e f45606P0;

    /* renamed from: Q0 */
    private C22126c0 f45607Q0;

    /* renamed from: R0 */
    private C8362q0 f45608R0;

    /* renamed from: S0 */
    private C22126c0 f45609S0;

    /* renamed from: T0 */
    private C11850a f45610T0;

    /* renamed from: U0 */
    private C22126c0 f45611U0;

    /* renamed from: V0 */
    private C22126c0 f45612V0;

    /* renamed from: W0 */
    private C16719g f45613W0;

    /* renamed from: X0 */
    private C16716d f45614X0;

    /* renamed from: Y0 */
    private C21693c f45615Y0;

    /* renamed from: Z0 */
    private C22126c0 f45616Z0;

    /* renamed from: a1 */
    private C22126c0 f45617a1;

    /* renamed from: b1 */
    private C16719g f45618b1;

    /* renamed from: c1 */
    private C16716d f45619c1;

    /* renamed from: d1 */
    private C22126c0 f45620d1;

    /* renamed from: e1 */
    private C16719g f45621e1;

    /* renamed from: f1 */
    private C21694d f45622f1;

    /* renamed from: g1 */
    private C3000l0 f45623g1;

    /* renamed from: h1 */
    private InterfaceC8427w6 f45624h1;

    /* renamed from: i1 */
    private final int f45625i1;

    /* renamed from: j1 */
    private final Drawable f45626j1;

    /* renamed from: k1 */
    private int f45627k1;

    /* renamed from: l1 */
    Handler f45628l1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.q2$a */
    /* loaded from: classes4.dex */
    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                int i11 = message.arg1;
                if (C8364q2.this.f45623g1 != null) {
                    int m14339j0 = C8364q2.this.f45623g1.m14339j0();
                    if (m14339j0 != 1) {
                        if (m14339j0 != 2) {
                            if (m14339j0 == 3) {
                                C8364q2.this.m44827S1(100);
                                return;
                            } else if (m14339j0 != 4) {
                                if (m14339j0 != 5) {
                                    return;
                                }
                            }
                        }
                        C8364q2.this.m44826R1(0);
                        return;
                    }
                    C8364q2.this.m44827S1(i11);
                }
            }
        }
    }

    public C8364q2(Context context) {
        super(context);
        this.f45625i1 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top);
        this.f45628l1 = new a(Looper.getMainLooper());
        this.f45626j1 = AbstractC23136l9.m118665N(context, AbstractC16803z.foreground_local_feed_item);
    }

    /* renamed from: A1 */
    public static /* synthetic */ void m44817A1(C16719g c16719g) {
        ToastUtils.m89266n(AbstractC8020f0.str_feed_edited_hint, new Object[0]);
    }

    /* renamed from: B1 */
    public static /* synthetic */ void m44818B1(C11850a c11850a, String str, C3979l c3979l, boolean z11) {
        if (c3979l != null) {
            try {
                if (c11850a.m89133b0().equals(str)) {
                    c11850a.m65870f2(false);
                    if (z11) {
                        c11850a.m115386T1(c3979l);
                    } else {
                        c11850a.m115386T1(c3979l);
                        c11850a.m89135c1(new C20518d().m106593j(1000L));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: C1 */
    public static /* synthetic */ void m44819C1(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, C16719g c16719g) {
        C3025q0 c3025q0 = c3020p0.f12023C;
        if (c3025q0 != null && interfaceC2259a != null) {
            interfaceC2259a.mo11971un(c3025q0.f12111b);
        }
    }

    /* renamed from: D1 */
    public static /* synthetic */ void m44820D1(WeakReference weakReference, CharSequence charSequence, C3013n3 c3013n3, boolean z11, C21697g c21697g, int i11, String str, C31890dc c31890dc) {
        C8362q0 c8362q0;
        int m153244m;
        int i12;
        if (i11 == 0) {
            int i13 = 0;
            try {
                if (!str.equals(String.valueOf(0)) && c31890dc != null && (c8362q0 = (C8362q0) weakReference.get()) != null && str.equals(c8362q0.getTag(1090453510))) {
                    if (c31890dc.m153249t()) {
                        m153244m = C31890dc.f146485E;
                    } else {
                        m153244m = c31890dc.m153244m(charSequence, 0);
                    }
                    CharSequence m143356G = C28652r.m143349v().m143356G(new SpannableStringBuilder(charSequence), AbstractC23136l9.m118742r(m153244m));
                    c8362q0.m44799D1(m143356G);
                    if (!TextUtils.isEmpty(m143356G)) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    c8362q0.mo44614b1(i12);
                    if (c31890dc.m153248s()) {
                        c8362q0.m44804I1(0);
                        c8362q0.m44797B1(c31890dc, false);
                    } else if (c3013n3.m14430a()) {
                        int i14 = AbstractC6918a0.tag_visibility;
                        if (TextUtils.isEmpty(m143356G)) {
                            i13 = 8;
                        }
                        c8362q0.m44803H1(i14, Integer.valueOf(i13));
                        c8362q0.m44804I1(1);
                        c8362q0.m44796A1(c31890dc, false, z11, m143356G, c3013n3.f11989a, 0);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (c21697g != null) {
            AbstractC20814p0.m108678x(c21697g.m111973m1(), c21697g);
        }
    }

    /* renamed from: G1 */
    private void m44821G1(C3020p0 c3020p0, boolean z11) {
        boolean z12;
        try {
            C3047v0 c3047v0 = c3020p0.f12022B;
            String m114542i = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
            C22126c0 c22126c0 = this.f45607Q0;
            if (c22126c0 != null) {
                c22126c0.m111959G1(m114542i);
            }
            int i11 = 0;
            if (this.f45606P0 != null) {
                boolean z13 = AbstractC23304d.m120536g().f147980a;
                C22129e c22129e = this.f45606P0;
                if (z11 && z13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c22129e.f108931U0 = z12;
                ContactProfile m118084d = AbstractC23028c0.m118084d(c3020p0.f12022B.f12280b);
                if (m118084d != null) {
                    ContactProfile m40356w = ContactProfile.m40356w(m118084d);
                    m40356w.f42446v = c3020p0.f12022B.f12283e;
                    this.f45606P0.m115433q1(m40356w);
                } else {
                    this.f45606P0.m115434r1(c3020p0.f12022B.f12283e);
                }
                this.f45606P0.m115429C1(AbstractC22055v0.m115116F(c3020p0.f12022B.f12280b, AbstractC21244b.m110054d(getContext())), AbstractC22055v0.m115115E(c3020p0.f12022B.f12280b, AbstractC21244b.m110054d(getContext())));
                this.f45606P0.m115442z1(AbstractC22055v0.m115112B(c3020p0.f12022B.f12280b));
            }
            C22124b0 c22124b0 = this.f45605O0;
            if (c22124b0 != null) {
                if (c3020p0.m14494Y() || !c3020p0.m14488S()) {
                    i11 = 8;
                }
                c22124b0.mo44614b1(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: H1 */
    private void m44822H1(InterfaceC2259a interfaceC2259a, C3020p0 c3020p0, C11850a c11850a, C23528a c23528a, boolean z11) {
        if (c11850a != null && c3020p0 != null) {
            try {
                if (c3020p0.m14496a0()) {
                    c11850a.mo44614b1(0);
                    int m118722k0 = AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(16.0f) * 2);
                    C3063z0 c3063z0 = c3020p0.f12023C.f12111b;
                    String str = c3063z0.m153169a() + "_" + c3063z0.m153170b();
                    c11850a.mo44614b1(0);
                    c11850a.mo111925v1(AbstractC28236y3.m142196g(getContext()));
                    c11850a.m65870f2(true);
                    c11850a.m89129Y0(str);
                    C32049o6.f147573a.m154648d(c3063z0, m118722k0, 0.6f, c23528a, new C32049o6.a() { // from class: com.zing.zalo.feed.components.o2

                        /* renamed from: b */
                        public final /* synthetic */ String f45550b;

                        public /* synthetic */ C8348o2(String str2) {
                            r2 = str2;
                        }

                        @Override // p716zh.C32049o6.a
                        /* renamed from: a */
                        public final void mo44791a(C3979l c3979l, boolean z12) {
                            C8364q2.m44818B1(C11850a.this, r2, c3979l, z12);
                        }
                    }, z11);
                    c11850a.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.p2

                        /* renamed from: q */
                        public final /* synthetic */ InterfaceC2259a f45561q;

                        public /* synthetic */ C8356p2(InterfaceC2259a interfaceC2259a2) {
                            r2 = interfaceC2259a2;
                        }

                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            C8364q2.m44819C1(C3020p0.this, r2, c16719g);
                        }
                    });
                } else {
                    c11850a.mo44614b1(8);
                    c11850a.mo89109M0(null);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:7:0x001f, B:12:0x0027, B:15:0x0037, B:17:0x0043, B:19:0x0047, B:20:0x004b, B:22:0x0051, B:24:0x0061, B:26:0x0065, B:27:0x0069, B:29:0x006f, B:36:0x0081, B:32:0x008a, B:39:0x0093, B:41:0x0097, B:42:0x009b, B:44:0x00a1, B:51:0x00b3, B:47:0x00bc, B:54:0x00c5, B:56:0x00c9, B:59:0x00d0, B:61:0x00de, B:62:0x0105, B:66:0x011c, B:68:0x0122, B:70:0x014c, B:72:0x0156, B:74:0x0167, B:76:0x016b, B:77:0x016f, B:79:0x0175, B:81:0x0190, B:83:0x0197, B:85:0x019c, B:88:0x01a8, B:89:0x01af, B:93:0x0135, B:94:0x0144, B:95:0x00fe), top: B:6:0x001f }] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* renamed from: I1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m44823I1(C3020p0 c3020p0, C21697g c21697g, C21697g c21697g2, C8362q0 c8362q0, Context context, InterfaceC10867f interfaceC10867f, boolean z11, boolean z12) {
        C21697g m44809s1;
        ?? r15;
        int i11;
        ArrayList arrayList;
        boolean z13;
        if (c8362q0 != 0) {
            try {
                m44809s1 = c8362q0.m44809s1();
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
            }
        } else {
            m44809s1 = null;
        }
        if (m44809s1 != null) {
            try {
                if (this.f45627k1 != 13) {
                    m44809s1.m111959G1("");
                    m44809s1.mo44614b1(8);
                    c8362q0.mo44614b1(8);
                    if (c3020p0 == null) {
                        return;
                    }
                    CharSequence m108603F = AbstractC20814p0.m108603F(c3020p0, true, interfaceC10867f, false);
                    if (!TextUtils.isEmpty(m108603F)) {
                        ArrayList arrayList2 = c3020p0.f12029I;
                        if (arrayList2 != null) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                C10866e c10866e = (C10866e) it.next();
                                c10866e.m56371O(true);
                                c10866e.m56369M(interfaceC10867f);
                            }
                        }
                        ArrayList arrayList3 = c3020p0.f12030J;
                        if (arrayList3 != null) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                C10866e c10866e2 = (C10866e) it2.next();
                                c10866e2.m56371O(true);
                                c10866e2.m56369M(interfaceC10867f);
                                if (c3020p0.m14498b0()) {
                                    c10866e2.m56372P(1);
                                    c10866e2.m56374R(c3020p0.f12058q);
                                } else {
                                    c10866e2.m56372P(0);
                                    c10866e2.m56374R(c3020p0.f12058q);
                                }
                            }
                        }
                        ArrayList arrayList4 = c3020p0.f12031K;
                        if (arrayList4 != null) {
                            Iterator it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                C10866e c10866e3 = (C10866e) it3.next();
                                c10866e3.m56371O(true);
                                c10866e3.m56369M(interfaceC10867f);
                                if (c3020p0.m14498b0()) {
                                    c10866e3.m56372P(1);
                                    c10866e3.m56374R(c3020p0.f12058q);
                                } else {
                                    c10866e3.m56372P(0);
                                    c10866e3.m56374R(c3020p0.f12058q);
                                }
                            }
                        }
                        C3025q0 c3025q0 = c3020p0.f12023C;
                        if (c3025q0 != null && c3025q0.f12096E != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        CharSequence m152970f = C31839a6.m152970f(m108603F, c3020p0.m14531w(true, false), z13, interfaceC10867f);
                        if (!c3020p0.m14493X()) {
                            m44809s1.m111955C1(C10887z.m56529k());
                            C28100j3 c28100j3 = new C28100j3(1);
                            c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                            m44809s1.setTag(AbstractC6918a0.tag_callback_span_listener, interfaceC10867f);
                            m44809s1.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                        } else {
                            m44809s1.m111955C1(C10880s.m56519f());
                        }
                        m44809s1.mo44614b1(0);
                        c8362q0.mo44614b1(0);
                        m44809s1.m111959G1(m152970f);
                        if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                            if (z11 && c21697g2 != null && AbstractC23309i.m121528Ve()) {
                                r15 = 0;
                                AbstractC20814p0.m108672u(context, m44809s1, c21697g, c21697g2, c3020p0, true, null);
                            } else {
                                r15 = 0;
                                AbstractC20814p0.m108662p(context, m44809s1, c3020p0.f12023C.f12110a.toString(), c3020p0.f12029I);
                            }
                        } else {
                            r15 = 0;
                            m44809s1.m89111N0(null);
                        }
                    } else {
                        r15 = 0;
                    }
                    if (c21697g != 0) {
                        CharSequence m108615L = AbstractC20814p0.m108615L(c3020p0, interfaceC10867f);
                        if (!TextUtils.isEmpty(m108615L)) {
                            c21697g.m111955C1(C10880s.m56519f());
                            c21697g.mo44614b1(r15);
                            c21697g.m111959G1(m108615L);
                            C3003l3 c3003l3 = c3020p0.f12059r;
                            if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    C10866e.m56359e((C10866e) it4.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                                }
                            }
                        } else {
                            i11 = 8;
                            c21697g.mo44614b1(8);
                            if (c21697g2 != null) {
                                c21697g2.mo44614b1(i11);
                            }
                            if (z11 && !TextUtils.isEmpty(c3020p0.f12023C.f12115f) && c21697g2 != null) {
                                AbstractC20814p0.m108668s(context, c21697g2, c3020p0.f12023C.f12115f);
                            }
                            CharSequence m14528u = c3020p0.m14528u();
                            C3013n3 c3013n3 = c3020p0.f12023C.f12097F;
                            C31890dc m153044X = C31845ac.m152996J().m153044X();
                            c8362q0.m44804I1(r15);
                            c8362q0.m44797B1(m153044X, r15);
                            c8362q0.setTag(1090453510, String.valueOf(c3020p0.f12023C.f12096E));
                            c8362q0.m44815y1(c3013n3, m14528u, 7);
                            new WeakReference(c21697g);
                            C31845ac.m152996J().m153057o0(c3020p0.f12023C.f12096E, new C31845ac.e() { // from class: com.zing.zalo.feed.components.n2

                                /* renamed from: a */
                                public final /* synthetic */ WeakReference f45530a;

                                /* renamed from: b */
                                public final /* synthetic */ CharSequence f45531b;

                                /* renamed from: c */
                                public final /* synthetic */ C3013n3 f45532c;

                                /* renamed from: d */
                                public final /* synthetic */ boolean f45533d;

                                /* renamed from: e */
                                public final /* synthetic */ C21697g f45534e;

                                public /* synthetic */ C8340n2(WeakReference weakReference, CharSequence m14528u2, C3013n3 c3013n32, boolean z122, C21697g m44809s12) {
                                    r1 = weakReference;
                                    r2 = m14528u2;
                                    r3 = c3013n32;
                                    r4 = z122;
                                    r5 = m44809s12;
                                }

                                @Override // p716zh.C31845ac.e
                                /* renamed from: a */
                                public final void mo39491a(int i12, String str, C31890dc c31890dc) {
                                    C8364q2.m44820D1(r1, r2, r3, r4, r5, i12, str, c31890dc);
                                }
                            });
                        }
                    }
                    i11 = 8;
                    if (c21697g2 != null) {
                    }
                    if (z11) {
                        AbstractC20814p0.m108668s(context, c21697g2, c3020p0.f12023C.f12115f);
                    }
                    CharSequence m14528u2 = c3020p0.m14528u();
                    C3013n3 c3013n32 = c3020p0.f12023C.f12097F;
                    C31890dc m153044X2 = C31845ac.m152996J().m153044X();
                    c8362q0.m44804I1(r15);
                    c8362q0.m44797B1(m153044X2, r15);
                    c8362q0.setTag(1090453510, String.valueOf(c3020p0.f12023C.f12096E));
                    c8362q0.m44815y1(c3013n32, m14528u2, 7);
                    new WeakReference(c21697g);
                    C31845ac.m152996J().m153057o0(c3020p0.f12023C.f12096E, new C31845ac.e() { // from class: com.zing.zalo.feed.components.n2

                        /* renamed from: a */
                        public final /* synthetic */ WeakReference f45530a;

                        /* renamed from: b */
                        public final /* synthetic */ CharSequence f45531b;

                        /* renamed from: c */
                        public final /* synthetic */ C3013n3 f45532c;

                        /* renamed from: d */
                        public final /* synthetic */ boolean f45533d;

                        /* renamed from: e */
                        public final /* synthetic */ C21697g f45534e;

                        public /* synthetic */ C8340n2(WeakReference weakReference, CharSequence m14528u22, C3013n3 c3013n322, boolean z122, C21697g m44809s12) {
                            r1 = weakReference;
                            r2 = m14528u22;
                            r3 = c3013n322;
                            r4 = z122;
                            r5 = m44809s12;
                        }

                        @Override // p716zh.C31845ac.e
                        /* renamed from: a */
                        public final void mo39491a(int i12, String str, C31890dc c31890dc) {
                            C8364q2.m44820D1(r1, r2, r3, r4, r5, i12, str, c31890dc);
                        }
                    });
                }
            } catch (Exception e12) {
                e = e12;
                e.printStackTrace();
            }
        }
    }

    /* renamed from: J1 */
    private void m44824J1(C3020p0 c3020p0) {
        int i11;
        C22126c0 c22126c0;
        int i12;
        if (this.f45623g1 == null) {
            return;
        }
        if (c3020p0 != null && (c22126c0 = this.f45620d1) != null) {
            if (c3020p0.m14488S()) {
                i12 = AbstractC8020f0.str_feed_editing;
            } else {
                i12 = AbstractC8020f0.str_post_feed_posting_state;
            }
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(i12));
        }
        int m14339j0 = this.f45623g1.m14339j0();
        int i13 = 0;
        if (m14339j0 != 1) {
            if (m14339j0 != 2) {
                if (m14339j0 != 3) {
                    if (m14339j0 != 4) {
                        if (m14339j0 != 5) {
                            return;
                        }
                    }
                } else {
                    m44826R1(100);
                    C21693c c21693c = this.f45615Y0;
                    if (c21693c != null) {
                        c21693c.mo44614b1(8);
                    }
                    C16716d c16716d = this.f45614X0;
                    if (c16716d != null) {
                        c16716d.mo44614b1(8);
                    }
                    C16716d c16716d2 = this.f45619c1;
                    if (c16716d2 != null) {
                        c16716d2.mo44614b1(0);
                    }
                    C22126c0 c22126c02 = this.f45612V0;
                    if (c22126c02 != null) {
                        c22126c02.mo44614b1(8);
                        return;
                    }
                    return;
                }
            }
            m44826R1(0);
            C3000l0 c3000l0 = this.f45623g1;
            C3000l0.w m108845y = AbstractC20826v0.m108845y(c3000l0.f11892o0, c3000l0.f11895q);
            C21693c c21693c2 = this.f45615Y0;
            if (c21693c2 != null) {
                c21693c2.mo44614b1(0);
            }
            C16716d c16716d3 = this.f45614X0;
            if (c16716d3 != null) {
                c16716d3.mo44614b1(0);
            }
            C16716d c16716d4 = this.f45619c1;
            if (c16716d4 != null) {
                c16716d4.mo44614b1(8);
            }
            C22126c0 c22126c03 = this.f45612V0;
            if (c22126c03 != null) {
                c22126c03.mo44614b1(0);
                this.f45612V0.m111959G1(m108845y.f11951b);
            }
            C22126c0 c22126c04 = this.f45616Z0;
            if (c22126c04 != null) {
                if (!m108845y.f11953d) {
                    i13 = 8;
                }
                c22126c04.mo44614b1(i13);
            }
            C22126c0 c22126c05 = this.f45617a1;
            if (c22126c05 != null) {
                c22126c05.m111959G1(m108845y.f11952c);
                return;
            }
            return;
        }
        C26881e.c m138507e = C26881e.m138493d().m138507e(this.f45623g1.f11895q);
        if (m138507e != null) {
            i11 = m138507e.f127238f;
        } else {
            i11 = 0;
        }
        m44826R1(i11);
        C21693c c21693c3 = this.f45615Y0;
        if (c21693c3 != null) {
            c21693c3.mo44614b1(8);
        }
        C16716d c16716d5 = this.f45614X0;
        if (c16716d5 != null) {
            c16716d5.mo44614b1(8);
        }
        C16716d c16716d6 = this.f45619c1;
        if (c16716d6 != null) {
            c16716d6.mo44614b1(0);
        }
        C22126c0 c22126c06 = this.f45612V0;
        if (c22126c06 != null) {
            c22126c06.mo44614b1(8);
        }
    }

    /* renamed from: K1 */
    private void m44825K1(int i11) {
        if (this.f45628l1 != null) {
            Message message = new Message();
            message.what = 1;
            message.arg1 = i11;
            this.f45628l1.sendMessage(message);
        }
    }

    /* renamed from: R1 */
    public void m44826R1(int i11) {
        C21694d c21694d = this.f45622f1;
        if (c21694d != null) {
            c21694d.m111938g1((i11 * 1.0f) / 100.0f, false);
        }
    }

    /* renamed from: S1 */
    public void m44827S1(int i11) {
        C21694d c21694d = this.f45622f1;
        if (c21694d != null) {
            c21694d.m111938g1((i11 * 1.0f) / 100.0f, true);
        }
    }

    /* renamed from: T1 */
    private void m44828T1() {
        C16716d c16716d = this.f45603M0;
        if (c16716d != null && this.f45626j1 != null && this.f45627k1 != 13) {
            int currentWidth = c16716d.getCurrentWidth();
            int currentHeight = this.f45603M0.getCurrentHeight();
            int width = this.f45626j1.getBounds().width();
            int height = this.f45626j1.getBounds().height();
            if (currentWidth > 0 && currentHeight > 0) {
                if (currentWidth != width || currentHeight != height) {
                    this.f45626j1.setBounds(0, 0, currentWidth, currentHeight);
                    this.f45603M0.m89100I().m88997a(this.f45626j1);
                    this.f45603M0.invalidate();
                }
            }
        }
    }

    /* renamed from: y1 */
    public /* synthetic */ void m44838y1(C16719g c16719g) {
        C3000l0 c3000l0 = this.f45623g1;
        if (c3000l0 != null && c3000l0.m14285C0()) {
            C26761p.m137741q().m137757K(this.f45623g1.f11895q);
        }
    }

    /* renamed from: z1 */
    public /* synthetic */ void m44839z1(C16719g c16719g) {
        C3000l0 c3000l0 = this.f45623g1;
        if (c3000l0 != null && c3000l0.m14285C0() && this.f45624h1 != null) {
            AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[TimeLineAdapter] clicked delete async feed, fcid=%s", this.f45623g1.f11895q);
            this.f45624h1.mo43803X(this.f45623g1);
        }
    }

    /* renamed from: E1 */
    public void m44840E1() {
        C23744a.m124114c().m124115b(this, 5050);
    }

    /* renamed from: F1 */
    public void m44841F1() {
        C22126c0 c22126c0;
        try {
            C23744a.m124114c().m124117e(this, 5050);
            C8362q0 c8362q0 = this.f45608R0;
            if (c8362q0 != null) {
                c22126c0 = c8362q0.m44809s1();
            } else {
                c22126c0 = null;
            }
            if (AbstractC26683d.f126393l && c22126c0 != null) {
                AbstractC28245z3.m142218a(c22126c0.m111973m1(), c22126c0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L1 */
    public void m44842L1(C3000l0 c3000l0) {
        this.f45623g1 = c3000l0;
        this.f45603M0.mo44614b1(0);
    }

    /* renamed from: M1 */
    public void m44843M1(int i11, C23528a c23528a, boolean z11) {
        C3020p0 c3020p0;
        C3000l0 c3000l0 = this.f45623g1;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14324b0(i11);
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null) {
            m44821G1(c3020p0, z11);
            AbstractC20814p0.m108671t0(getContext(), c3020p0, this.f45604N0, null, 0);
            m44824J1(c3020p0);
        }
    }

    /* renamed from: N1 */
    public void m44844N1(InterfaceC8427w6 interfaceC8427w6) {
        this.f45624h1 = interfaceC8427w6;
    }

    /* renamed from: O1 */
    public void m44845O1(int i11, Context context, C23528a c23528a, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f, boolean z11) {
        C3020p0 c3020p0;
        int i12;
        try {
            C3000l0 c3000l0 = this.f45623g1;
            C16718f c16718f = null;
            if (c3000l0 != null) {
                c3020p0 = c3000l0.m14324b0(i11);
            } else {
                c3020p0 = null;
            }
            if (c3020p0 == null) {
                return;
            }
            if (c3020p0.f12058q == 6) {
                C22126c0 c22126c0 = this.f45609S0;
                if (c22126c0 != null) {
                    c22126c0.mo44614b1(8);
                }
                C8362q0 c8362q0 = this.f45608R0;
                if (c8362q0 != null) {
                    c8362q0.mo44614b1(8);
                }
                C22126c0 c22126c02 = this.f45611U0;
                if (c22126c02 != null) {
                    c22126c02.mo44614b1(8);
                }
                C11850a c11850a = this.f45610T0;
                if (c11850a != null) {
                    c11850a.mo44614b1(8);
                }
                C16719g c16719g = this.f45613W0;
                if (c16719g != null) {
                    c16718f = c16719g.m89106L();
                }
                if (c16718f != null) {
                    c16718f.m89036T(this.f45625i1);
                    return;
                }
                return;
            }
            C16719g c16719g2 = this.f45613W0;
            if (c16719g2 != null) {
                c16718f = c16719g2.m89106L();
            }
            if (c16718f != null) {
                if (!c3020p0.m14486Q() && !c3020p0.m14496a0()) {
                    i12 = this.f45625i1;
                    c16718f.m89036T(i12);
                }
                i12 = 0;
                c16718f.m89036T(i12);
            }
            m44823I1(c3020p0, this.f45609S0, this.f45611U0, this.f45608R0, context, interfaceC10867f, c3020p0.m14500c0(), z11);
            m44822H1(interfaceC2259a, c3020p0, this.f45610T0, c23528a, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P1 */
    public void m44846P1(C16719g.c cVar) {
        C22129e c22129e = this.f45606P0;
        if (c22129e != null) {
            c22129e.mo89109M0(cVar);
        }
    }

    /* renamed from: Q1 */
    public void m44847Q1(C16719g.c cVar) {
        C22126c0 c22126c0 = this.f45607Q0;
        if (c22126c0 != null) {
            c22126c0.mo89109M0(cVar);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: p0 */
    public void mo44848p0(int i11, int i12, int i13, int i14) {
        super.mo44848p0(i11, i12, i13, i14);
        m44828T1();
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        C3020p0 m14322a0;
        if (i11 == 5050) {
            try {
                String str = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                C3000l0 c3000l0 = this.f45623g1;
                if (c3000l0 != null && c3000l0.m14285C0() && (m14322a0 = this.f45623g1.m14322a0()) != null && TextUtils.equals(m14322a0.f12057p, str)) {
                    m44825K1(intValue);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: x1 */
    public void m44849x1(Context context, boolean z11, int i11) {
        try {
            this.f45627k1 = i11;
            this.f45614X0 = new C16716d(context);
            this.f45615Y0 = new C21693c(context);
            this.f45616Z0 = new C22126c0(context);
            this.f45617a1 = new C22126c0(context);
            this.f45618b1 = new C16719g(context);
            this.f45619c1 = new C16716d(context);
            this.f45620d1 = new C22126c0(context);
            this.f45622f1 = new C21694d(context);
            this.f45621e1 = new C16719g(context);
            this.f45603M0 = new C16716d(context);
            this.f45606P0 = new C22129e(context, AbstractC23136l9.m118655I(AbstractC16802y.avt_M));
            this.f45607Q0 = new C22126c0(context);
            this.f45608R0 = new C8362q0(context);
            this.f45609S0 = new C22126c0(context);
            this.f45610T0 = new C11850a(context);
            this.f45611U0 = new C22126c0(context);
            this.f45604N0 = new C22124b0(context);
            this.f45605O0 = new C22124b0(context);
            this.f45612V0 = new C22126c0(context);
            this.f45613W0 = new C16719g(context);
            this.f45614X0.m89106L().m89060k0(-1).m89030N(-2).m89039W(AbstractC23136l9.m118742r(42.0f));
            this.f45614X0.mo44614b1(8);
            C16718f m89049e0 = this.f45617a1.m89106L().m89060k0(-2).m89030N(-2).m89049e0(this.f45616Z0);
            Boolean bool = Boolean.TRUE;
            m89049e0.m89073z(bool).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_avatar_margin_left)).m89036T(AbstractC23136l9.m118742r(6.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f)).m89027K(true);
            this.f45617a1.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
            this.f45617a1.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f45616Z0.m89106L().m89060k0(-2).m89030N(AbstractC23136l9.m118742r(42.0f)).m89046b0(AbstractC23136l9.m118742r(12.0f)).m89047c0(AbstractC23136l9.m118742r(12.0f)).m89027K(true).m89029M(15).m89049e0(this.f45615Y0);
            this.f45616Z0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.bt_try_again));
            this.f45616Z0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.LinkColor));
            this.f45616Z0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
            this.f45616Z0.mo111965M1(1);
            this.f45616Z0.m89087B0(AbstractC23136l9.m118734o0(context, false));
            this.f45616Z0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.k2
                public /* synthetic */ C8316k2() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8364q2.this.m44838y1(c16719g);
                }
            });
            this.f45615Y0.m89106L().m89060k0(-2).m89030N(-2).m89017A(bool).m89031O(AbstractC23136l9.m118742r(6.0f)).m89027K(true);
            this.f45615Y0.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_ic_head_close_black));
            this.f45615Y0.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_contact_bg));
            this.f45615Y0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.l2
                public /* synthetic */ C8324l2() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8364q2.this.m44839z1(c16719g);
                }
            });
            this.f45618b1.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(0.3f)).m89072y(bool);
            this.f45618b1.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            this.f45619c1.m89106L().m89060k0(-1).m89030N(-2).m89039W(AbstractC23136l9.m118742r(42.0f)).m89023G(this.f45614X0);
            this.f45620d1.m89106L().m89060k0(-2).m89030N(-2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89036T(AbstractC23136l9.m118742r(6.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f)).m89027K(true);
            this.f45620d1.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f13));
            this.f45620d1.m111982x1(false);
            this.f45620d1.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f45620d1.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_post_feed_posting_state));
            this.f45622f1.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(4.0f)).m89034R(AbstractC23136l9.m118742r(12.0f)).m89035S(AbstractC23136l9.m118742r(26.0f)).m89027K(true).m89054h0(this.f45620d1);
            this.f45622f1.m111939h1(C23212s8.m119607o(context, AbstractC16781w.ImagePlaceHolderColor));
            this.f45622f1.m111940i1(C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor));
            m44826R1(0);
            this.f45621e1.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(0.3f)).m89072y(bool);
            this.f45621e1.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            this.f45603M0.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45619c1);
            this.f45606P0.m89101I0(AbstractC6918a0.imvAvatar);
            this.f45606P0.m89106L().m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(16.0f)).m89036T(AbstractC23136l9.m118742r(12.0f));
            this.f45606P0.m115427A1(AbstractC22055v0.m115162v(context));
            this.f45607Q0.m89101I0(AbstractC6918a0.tvUserName);
            this.f45607Q0.m89106L().m89060k0(-2).m89030N(-2).m89048d0(AbstractC23136l9.m118742r(2.0f)).m89020D(this.f45606P0).m89054h0(this.f45606P0).m89035S(AbstractC23136l9.m118742r(40.0f));
            C22126c0 c22126c0 = this.f45607Q0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            this.f45607Q0.m111957E1(true);
            this.f45612V0.m89106L().m89060k0(-2).m89030N(-2).m89023G(this.f45607Q0).m89054h0(this.f45606P0).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_icon_privacy_margin_left));
            this.f45612V0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f13));
            this.f45612V0.m111962J1(Color.parseColor("#f26363"));
            this.f45604N0.m89101I0(AbstractC6918a0.tvPrivacyInfo);
            this.f45604N0.m115398o1().mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
            this.f45604N0.m89106L().m89060k0(-2).m89030N(-2).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_icon_privacy_margin_left)).m89023G(this.f45607Q0).m89054h0(this.f45612V0);
            AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Time, this.f45605O0.m115398o1());
            this.f45605O0.m89106L().m89060k0(-2).m89030N(-2).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89020D(this.f45604N0).m89054h0(this.f45604N0);
            this.f45605O0.m115398o1().m111958F1(AbstractC8020f0.str_feed_edited);
            this.f45605O0.m115399p1(AbstractC23222t7.f112552c);
            this.f45605O0.m115402s1(AbstractC1401h.m7082f(getContext().getResources(), AbstractC16803z.ic_edit_solid_24, null), null, null, null);
            this.f45605O0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.m2
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8364q2.m44817A1(c16719g);
                }
            });
            this.f45608R0.m89101I0(AbstractC6918a0.bg_feed_view);
            this.f45608R0.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45606P0).m89036T(AbstractC23136l9.m118742r(12.0f));
            this.f45608R0.m44801F1(0);
            C22126c0 m44809s1 = this.f45608R0.m44809s1();
            if (m44809s1 != null) {
                Paint.FontMetrics m111969i1 = m44809s1.m111969i1();
                m44809s1.m111984z1(AbstractC23136l9.m118742r(20.0f) - ((int) (m111969i1.descent - m111969i1.ascent)), 1.0f);
            }
            AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Caption, this.f45609S0);
            this.f45609S0.m89101I0(AbstractC6918a0.tvTagAndLocation);
            this.f45609S0.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45608R0).m89032P(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right), 0);
            this.f45609S0.m111953A1(1);
            this.f45609S0.m111980v1(truncateAt);
            this.f45609S0.mo44614b1(8);
            this.f45609S0.m111984z1(AbstractC23136l9.m118655I(AbstractC16802y.feed_linespacing_extra), 1.0f);
            this.f45610T0.m89101I0(AbstractC6918a0.imv_thumb_location);
            this.f45610T0.m111921r1(true);
            this.f45610T0.m111929z1(5);
            this.f45610T0.m65869e2(3);
            this.f45610T0.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_feed));
            this.f45610T0.m65868d2(AbstractC20814p0.f102273c);
            this.f45610T0.mo44614b1(8);
            this.f45610T0.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45609S0).m89036T(AbstractC23136l9.m118742r(14.0f));
            this.f45611U0.m89101I0(AbstractC6918a0.tvTranslation);
            this.f45611U0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
            this.f45611U0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f45611U0.m111982x1(true);
            this.f45611U0.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45610T0).m89032P(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right), AbstractC23136l9.m118742r(16.0f));
            this.f45611U0.m111984z1(AbstractC23136l9.m118655I(AbstractC16802y.feed_linespacing_extra), 1.0f);
            this.f45611U0.mo44614b1(8);
            this.f45613W0.m89101I0(AbstractC6918a0.bottomAnchor);
            this.f45613W0.m89106L().m89060k0(-1).m89030N(1).m89023G(this.f45611U0).m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top));
            this.f45614X0.m89001g1(this.f45615Y0);
            this.f45614X0.m89001g1(this.f45616Z0);
            this.f45614X0.m89001g1(this.f45617a1);
            this.f45614X0.m89001g1(this.f45618b1);
            this.f45619c1.m89001g1(this.f45620d1);
            this.f45619c1.m89001g1(this.f45622f1);
            this.f45619c1.m89001g1(this.f45621e1);
            this.f45603M0.m89001g1(this.f45606P0);
            this.f45603M0.m89001g1(this.f45607Q0);
            this.f45603M0.m89001g1(this.f45612V0);
            this.f45603M0.m89001g1(this.f45604N0);
            if (this.f45627k1 == 13) {
                m89087B0(AbstractC16803z.timeline_top_gradient);
                this.f45604N0.m115398o1().m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white_70));
                AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Name_Video, this.f45607Q0);
                this.f45603M0.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(104.0f));
            } else {
                m89087B0(AbstractC16803z.bg_white_with_top_border);
                this.f45604N0.m115398o1().m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.cMtxt2));
                AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Name, this.f45607Q0);
                this.f45603M0.m89001g1(this.f45605O0);
                this.f45603M0.m89001g1(this.f45608R0);
                this.f45603M0.m89001g1(this.f45609S0);
                this.f45603M0.m89001g1(this.f45610T0);
                this.f45603M0.m89001g1(this.f45611U0);
                this.f45603M0.m89001g1(this.f45613W0);
                m89001g1(this.f45614X0);
                m89001g1(this.f45619c1);
            }
            m89001g1(this.f45603M0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

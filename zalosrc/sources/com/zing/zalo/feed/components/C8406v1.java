package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.content.res.AbstractC1401h;
import ao.InterfaceC2259a;
import ao.InterfaceC2266h;
import bi0.AbstractC2807a;
import bo.C2949b;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3013n3;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3063z0;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10880s;
import com.zing.zalo.social.controls.C10887z;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.AbstractC17450b;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import id0.C20518d;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kd0.C21693c;
import kd0.C21697g;
import l30.AbstractC22055v0;
import l80.C22122a0;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p022ap.C2270a;
import p262jb.AbstractC21196a;
import p266jg.AbstractC21244b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p398oo.C24380u;
import p489rn.AbstractC25881j;
import p489rn.C25866f0;
import p588vw.C28652r;
import p716zh.C31839a6;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C32002l4;
import p716zh.C32049o6;
import th.AbstractC26683d;
import ui0.C27280g;
import vg.AbstractC28236y3;
import vg.AbstractC28245z3;
import vg.C28051e4;
import vg.C28100j3;

/* renamed from: com.zing.zalo.feed.components.v1 */
/* loaded from: classes4.dex */
public class C8406v1 extends C16716d {

    /* renamed from: s1 */
    public static final int f45766s1 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: t1 */
    public static final int f45767t1 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: u1 */
    public static final int f45768u1 = AbstractC23136l9.m118742r(20.0f);

    /* renamed from: v1 */
    public static final int f45769v1 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: w1 */
    public static float f45770w1 = 0.6f;

    /* renamed from: M0 */
    protected C22129e f45771M0;

    /* renamed from: N0 */
    protected C22126c0 f45772N0;

    /* renamed from: O0 */
    protected C22126c0 f45773O0;

    /* renamed from: P0 */
    protected C22124b0 f45774P0;

    /* renamed from: Q0 */
    protected C22124b0 f45775Q0;

    /* renamed from: R0 */
    private C11850a f45776R0;

    /* renamed from: S0 */
    C11850a f45777S0;

    /* renamed from: T0 */
    C22126c0 f45778T0;

    /* renamed from: U0 */
    C16719g f45779U0;

    /* renamed from: V0 */
    C16716d f45780V0;

    /* renamed from: W0 */
    C22126c0 f45781W0;

    /* renamed from: X0 */
    C16716d f45782X0;

    /* renamed from: Y0 */
    C16716d f45783Y0;

    /* renamed from: Z0 */
    private C16719g f45784Z0;

    /* renamed from: a1 */
    private int f45785a1;

    /* renamed from: b1 */
    protected C22126c0 f45786b1;

    /* renamed from: c1 */
    protected C22126c0 f45787c1;

    /* renamed from: d1 */
    protected C22126c0 f45788d1;

    /* renamed from: e1 */
    protected C22126c0 f45789e1;

    /* renamed from: f1 */
    protected C8362q0 f45790f1;

    /* renamed from: g1 */
    protected C22122a0 f45791g1;

    /* renamed from: h1 */
    protected C23528a f45792h1;

    /* renamed from: i1 */
    protected int f45793i1;

    /* renamed from: j1 */
    private boolean f45794j1;

    /* renamed from: k1 */
    protected boolean f45795k1;

    /* renamed from: l1 */
    protected C22126c0 f45796l1;

    /* renamed from: m1 */
    protected C22126c0 f45797m1;

    /* renamed from: n1 */
    protected C16719g f45798n1;

    /* renamed from: o1 */
    protected C16716d f45799o1;

    /* renamed from: p1 */
    private C16719g f45800p1;

    /* renamed from: q1 */
    protected C16719g.c f45801q1;

    /* renamed from: r1 */
    a f45802r1;

    /* renamed from: com.zing.zalo.feed.components.v1$a */
    /* loaded from: classes4.dex */
    public static class a extends AbstractC8370r0 {
        public a(Context context) {
            super(context);
            m44939q1();
        }

        /* renamed from: q1 */
        private void m44939q1() {
            m89106L().m89028L(AbstractC23136l9.m118742r(1.0f), -1);
            mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.ProfileLineColor));
        }

        /* renamed from: r1 */
        public void m44940r1(C3000l0 c3000l0, C3020p0 c3020p0) {
            if (c3020p0 != null) {
                mo89161z0(this.f45640N0);
            }
        }
    }

    public C8406v1(Context context) {
        super(context);
    }

    /* renamed from: D1 */
    private void m44889D1(Context context, int i11) {
        m44917C1(context);
        this.f45790f1.m44801F1(0);
        C22126c0 m44809s1 = this.f45790f1.m44809s1();
        this.f45786b1 = m44809s1;
        m44931e2(m44809s1, 20.0f);
        m89087B0(AbstractC16803z.bg_white_with_top_border);
        this.f45788d1.m111953A1(Integer.MAX_VALUE);
        if (this.f45772N0.m89106L() != null) {
            this.f45772N0.m89106L().m89035S(AbstractC23136l9.m118736p(AbstractC16802y.feed_header_user_name_detail_margin_right));
        }
        C16719g c16719g = this.f45784Z0;
        if (c16719g != null) {
            c16719g.m89106L().m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding));
        }
    }

    /* renamed from: E1 */
    private void m44890E1(Context context, int i11) {
        m44917C1(context);
        C8362q0 c8362q0 = this.f45790f1;
        if (c8362q0 != null) {
            c8362q0.m44801F1(0);
            C22126c0 m44809s1 = this.f45790f1.m44809s1();
            this.f45786b1 = m44809s1;
            if (m44809s1 != null) {
                m44931e2(m44809s1, 20.0f);
            }
            int m118742r = AbstractC23136l9.m118742r(12.0f);
            this.f45790f1.m44800E1(m118742r, 0, m118742r, 0);
        }
        m89087B0(AbstractC16803z.bg_white_with_top_border);
        C16719g c16719g = this.f45784Z0;
        if (c16719g != null) {
            c16719g.m89106L().m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding));
        }
    }

    /* renamed from: I1 */
    private void m44891I1() {
        C16719g c16719g = new C16719g(this.f84786r);
        this.f45800p1 = c16719g;
        c16719g.m89106L().m89028L(-1, -1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile));
        this.f45800p1.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.feed_overlay));
        this.f45800p1.mo44614b1(8);
        m89001g1(this.f45800p1);
    }

    /* renamed from: K1 */
    private boolean m44892K1(int i11) {
        return i11 == 2 || i11 == 3 || i11 == 0;
    }

    /* renamed from: L1 */
    private boolean m44893L1() {
        return this.f45793i1 != 6;
    }

    /* renamed from: M1 */
    private boolean m44894M1(C16719g c16719g) {
        if (c16719g != null && c16719g.m89136d0() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: N1 */
    public static /* synthetic */ void m44895N1(C16719g c16719g) {
        ToastUtils.m89266n(AbstractC8020f0.str_feed_edited_hint, new Object[0]);
    }

    /* renamed from: O1 */
    public /* synthetic */ void m44896O1(InterfaceC2259a interfaceC2259a, C3020p0 c3020p0, C2949b c2949b, C16719g c16719g) {
        C32002l4 m154265h;
        if (interfaceC2259a != null && !c3020p0.f12027G) {
            int i11 = this.f45793i1;
            if (i11 != 2 && i11 != 3) {
                if (i11 == 0) {
                    m154265h = C32002l4.m154264g(10002);
                } else if (i11 == 4) {
                    m154265h = C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START);
                } else {
                    m154265h = null;
                }
            } else {
                m154265h = C32002l4.m154265h(10001, 37);
            }
            interfaceC2259a.mo11926M5(c2949b, 5, m154265h);
        }
    }

    /* renamed from: P1 */
    public static /* synthetic */ void m44897P1(C22122a0 c22122a0, String str, C3979l c3979l, boolean z11) {
        if (c3979l != null) {
            try {
                if (c22122a0.m89133b0().equals(str)) {
                    if (z11) {
                        c22122a0.m115386T1(c3979l);
                    } else {
                        c22122a0.m115386T1(c3979l);
                        c22122a0.m89135c1(new C20518d().m106593j(1000L));
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: Q1 */
    public static /* synthetic */ void m44898Q1(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, C16719g c16719g) {
        C3025q0 c3025q0;
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && interfaceC2259a != null) {
            interfaceC2259a.mo11971un(c3025q0.f12111b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:5:0x0009, B:8:0x0015, B:10:0x001e, B:12:0x002b, B:14:0x0031, B:17:0x0038, B:18:0x0041, B:20:0x0047, B:21:0x004e, B:23:0x0069, B:24:0x007c, B:27:0x008b, B:29:0x0095, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:39:0x004a, B:46:0x00d3, B:48:0x00d7), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:5:0x0009, B:8:0x0015, B:10:0x001e, B:12:0x002b, B:14:0x0031, B:17:0x0038, B:18:0x0041, B:20:0x0047, B:21:0x004e, B:23:0x0069, B:24:0x007c, B:27:0x008b, B:29:0x0095, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:39:0x004a, B:46:0x00d3, B:48:0x00d7), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:5:0x0009, B:8:0x0015, B:10:0x001e, B:12:0x002b, B:14:0x0031, B:17:0x0038, B:18:0x0041, B:20:0x0047, B:21:0x004e, B:23:0x0069, B:24:0x007c, B:27:0x008b, B:29:0x0095, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:39:0x004a, B:46:0x00d3, B:48:0x00d7), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:5:0x0009, B:8:0x0015, B:10:0x001e, B:12:0x002b, B:14:0x0031, B:17:0x0038, B:18:0x0041, B:20:0x0047, B:21:0x004e, B:23:0x0069, B:24:0x007c, B:27:0x008b, B:29:0x0095, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:39:0x004a, B:46:0x00d3, B:48:0x00d7), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004a A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:5:0x0009, B:8:0x0015, B:10:0x001e, B:12:0x002b, B:14:0x0031, B:17:0x0038, B:18:0x0041, B:20:0x0047, B:21:0x004e, B:23:0x0069, B:24:0x007c, B:27:0x008b, B:29:0x0095, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:39:0x004a, B:46:0x00d3, B:48:0x00d7), top: B:4:0x0009 }] */
    /* renamed from: R1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m44899R1(WeakReference weakReference, int i11, CharSequence charSequence, C3020p0 c3020p0, C3013n3 c3013n3, boolean z11, int i12, String str, C31890dc c31890dc) {
        C8362q0 c8362q0;
        CharSequence charSequence2;
        int m153244m;
        CharSequence charSequence3;
        int i13;
        if (i12 == 0) {
            int i14 = 0;
            try {
                if (!str.equals(String.valueOf(0)) && c31890dc != null && (c8362q0 = (C8362q0) weakReference.get()) != null && str.equals(c8362q0.getTag(1090453510))) {
                    boolean m44892K1 = m44892K1(i11);
                    if (m44892K1 && !c31890dc.m153248s()) {
                        charSequence2 = c3020p0.m14527t();
                        if (!c31890dc.m153249t()) {
                            m153244m = C31890dc.f146485E;
                        } else {
                            m153244m = c31890dc.m153244m(charSequence2, i11);
                        }
                        int m118725l0 = AbstractC23136l9.m118725l0(this.f84786r);
                        CharSequence m143352C = C28652r.m143349v().m143352C(new SpannableStringBuilder(charSequence2), AbstractC23136l9.m118742r(m153244m));
                        if (!m44892K1) {
                            charSequence3 = C31845ac.m152996J().m153072x(m143352C, c31890dc, m44912w1(c3020p0, i11), m118725l0, i11);
                        } else {
                            charSequence3 = m143352C;
                        }
                        c8362q0.m44799D1(charSequence3);
                        if (TextUtils.isEmpty(charSequence3)) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        c8362q0.mo44614b1(i13);
                        if (!c31890dc.m153248s()) {
                            m44911v1(c8362q0, true);
                            c8362q0.m44804I1(0);
                            c8362q0.m44798C1(c31890dc, false, "", i11);
                        } else if (c3013n3.m14430a()) {
                            m44911v1(c8362q0, false);
                            int i15 = AbstractC6918a0.tag_visibility;
                            if (TextUtils.isEmpty(charSequence3)) {
                                i14 = 8;
                            }
                            c8362q0.m44803H1(i15, Integer.valueOf(i14));
                            c8362q0.m44804I1(1);
                            c8362q0.m44796A1(c31890dc, false, z11, charSequence3, AbstractC20814p0.m108613K(i11) * c3013n3.f11989a, i11);
                        }
                    }
                    charSequence2 = charSequence;
                    if (!c31890dc.m153249t()) {
                    }
                    int m118725l02 = AbstractC23136l9.m118725l0(this.f84786r);
                    CharSequence m143352C2 = C28652r.m143349v().m143352C(new SpannableStringBuilder(charSequence2), AbstractC23136l9.m118742r(m153244m));
                    if (!m44892K1) {
                    }
                    c8362q0.m44799D1(charSequence3);
                    if (TextUtils.isEmpty(charSequence3)) {
                    }
                    c8362q0.mo44614b1(i13);
                    if (!c31890dc.m153248s()) {
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        C22126c0 c22126c0 = this.f45786b1;
        if (c22126c0 != null) {
            AbstractC20814p0.m108678x(c22126c0.m111973m1(), this.f45786b1);
        }
    }

    /* renamed from: S1 */
    public static /* synthetic */ void m44900S1(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, C3020p0 c3020p0, C16719g c16719g) {
        if (interfaceC2259a instanceof AbstractC25881j.b) {
            ((AbstractC25881j.b) interfaceC2259a).mo14631rG(new C2270a(c3000l0, c3020p0));
        }
    }

    /* renamed from: T1 */
    public static /* synthetic */ void m44901T1(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, C3020p0 c3020p0, C16719g c16719g) {
        if (interfaceC2259a instanceof AbstractC25881j.b) {
            ((AbstractC25881j.b) interfaceC2259a).mo14631rG(new C2270a(c3000l0, c3020p0));
        }
    }

    /* renamed from: V1 */
    private void m44902V1(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a) {
        C2949b c2949b;
        if (c3020p0 != null && c3020p0.f12058q == 23) {
            C3025q0 c3025q0 = c3020p0.f12023C;
            if (c3025q0 != null) {
                c2949b = c3025q0.f12106O;
            } else {
                c2949b = null;
            }
            if (c2949b != null && !TextUtils.isEmpty(c2949b.m13962e())) {
                this.f45796l1.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_intro_feed_album_header) + " ");
                this.f45797m1.m111959G1(c2949b.m13962e());
                this.f45799o1.mo44614b1(0);
            } else {
                this.f45799o1.mo44614b1(8);
            }
            this.f45799o1.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.r1

                /* renamed from: q */
                public final /* synthetic */ InterfaceC2259a f45651q;

                /* renamed from: r */
                public final /* synthetic */ C3020p0 f45652r;

                /* renamed from: s */
                public final /* synthetic */ C2949b f45653s;

                public /* synthetic */ C8371r1(InterfaceC2259a interfaceC2259a2, C3020p0 c3020p02, C2949b c2949b2) {
                    r2 = interfaceC2259a2;
                    r3 = c3020p02;
                    r4 = c2949b2;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8406v1.this.m44896O1(r2, r3, r4, c16719g);
                }
            });
            return;
        }
        this.f45799o1.mo44614b1(8);
    }

    /* renamed from: k2 */
    private void m44903k2(C3000l0 c3000l0) {
        boolean z11;
        int i11 = 0;
        if (c3000l0 != null && c3000l0.m14285C0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C16719g c16719g = this.f45800p1;
        if (!z11) {
            i11 = 8;
        }
        c16719g.mo44614b1(i11);
    }

    /* renamed from: v1 */
    private void m44911v1(C8362q0 c8362q0, boolean z11) {
        int i11 = this.f45793i1;
        if (i11 == 2 || i11 == 3) {
            if (z11) {
                c8362q0.m44802G1(0);
            } else {
                c8362q0.m44802G1(FeedItemBaseModuleView.f44318d0);
            }
        }
    }

    /* renamed from: w1 */
    private int m44912w1(C3020p0 c3020p0, int i11) {
        return (i11 == 2 || i11 == 3) ? 3 : 8;
    }

    /* renamed from: x1 */
    private int m44913x1() {
        if (this.f45793i1 != 6) {
            return AbstractC23136l9.m118655I(AbstractC16802y.avt_M);
        }
        return AbstractC23136l9.m118655I(AbstractC16802y.ava1_border);
    }

    /* renamed from: z1 */
    private void m44914z1() {
        C16719g c16719g = new C16719g(getContext());
        c16719g.m89085A0(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed_profile_body));
        c16719g.m89106L().m89028L(-1, -1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile));
        m89001g1(c16719g);
    }

    /* renamed from: A1 */
    public void m44915A1(Context context, int i11) {
        this.f45792h1 = new C23528a(context);
        this.f45793i1 = i11;
        this.f45785a1 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top);
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 6) {
                        if (i11 != 11) {
                            m44920H1(context, i11);
                            return;
                        } else {
                            m44890E1(context, i11);
                            return;
                        }
                    }
                    m44916B1(context, i11);
                    return;
                }
                m44889D1(context, i11);
                return;
            }
            m44919G1(context);
            return;
        }
        m44918F1(context, i11);
    }

    /* renamed from: B1 */
    protected void m44916B1(Context context, int i11) {
        C16716d c16716d = new C16716d(context);
        this.f45780V0 = c16716d;
        C16718f m89028L = c16716d.m89106L().m89028L(-1, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89018B(bool);
        m89001g1(this.f45780V0);
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89017A(bool).m89036T(AbstractC23136l9.m118742r(8.0f)).m89035S(AbstractC23136l9.m118742r(10.0f));
        c21693c.mo111926w1(AbstractC16803z.ic_head_next);
        this.f45780V0.m89001g1(c21693c);
        C22126c0 c22126c0 = new C22126c0(this.f84786r);
        this.f45778T0 = c22126c0;
        AbstractC20826v0.m108823n(AbstractC20826v0.k.ROBOTO_F7, c22126c0);
        this.f45778T0.m89106L().m89028L(-1, -2).m89046b0(AbstractC23136l9.m118742r(10.0f)).m89047c0(AbstractC23136l9.m118742r(10.0f)).m89036T(AbstractC23136l9.m118742r(8.0f)).m89033Q(AbstractC23136l9.m118742r(8.0f)).m89049e0(c21693c).m89073z(bool);
        this.f45778T0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f45780V0.m89001g1(this.f45778T0);
        C16719g c16719g = new C16719g(this.f84786r);
        this.f45779U0 = c16719g;
        c16719g.m89106L().m89028L(-1, 1).m89023G(this.f45778T0);
        this.f45779U0.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f45780V0.m89001g1(this.f45779U0);
        m44917C1(context);
        this.f45782X0.m89106L().m89023G(this.f45780V0);
        this.f45772N0.m89106L().m89054h0(this.f45771M0).m89049e0(null).m89035S(AbstractC23136l9.m118736p(AbstractC16802y.feed_padding_right)).m89036T(AbstractC23136l9.m118742r(6.0f));
        C22126c0 c22126c02 = new C22126c0(this.f84786r);
        this.f45781W0 = c22126c02;
        AbstractC20826v0.m108823n(AbstractC20826v0.k.ROBOTO_F71, c22126c02);
        this.f45781W0.m89106L().m89028L(-2, -2).m89023G(this.f45772N0).m89054h0(this.f45771M0);
        if (i11 == 13) {
            this.f45781W0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white_70));
        } else {
            this.f45781W0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.cTime1));
        }
        this.f45783Y0.m89001g1(this.f45781W0);
        this.f45783Y0.m89106L().m89049e0(null);
        this.f45771M0.m89106L().m89031O(AbstractC23136l9.m118736p(AbstractC16802y.chat_feed_avatar_margin));
        this.f45790f1.m44801F1(0);
        C22126c0 m44809s1 = this.f45790f1.m44809s1();
        this.f45786b1 = m44809s1;
        m44931e2(m44809s1, 20.0f);
        m89087B0(AbstractC16803z.bg_white_with_top_border);
        this.f45790f1.m89106L().m89036T(0).m89033Q(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_top));
        this.f45788d1.m89106L().m89032P(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_left), 0, AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_right), AbstractC23136l9.m118659K(AbstractC16802y.chat_feed_padding_top));
    }

    /* renamed from: C1 */
    void m44917C1(Context context) {
        try {
            this.f45782X0 = new C16716d(context);
            this.f45783Y0 = new C16716d(context);
            this.f45771M0 = new C22129e(context, m44913x1());
            this.f45772N0 = new C22126c0(context);
            this.f45773O0 = new C22126c0(context);
            this.f45774P0 = new C22124b0(context);
            this.f45775Q0 = new C22124b0(context);
            this.f45777S0 = new C11850a(context);
            this.f45790f1 = new C8362q0(context);
            this.f45788d1 = new C22126c0(context);
            this.f45791g1 = new C22122a0(context);
            this.f45789e1 = new C22126c0(context);
            this.f45784Z0 = new C16719g(context);
            this.f45776R0 = new C11850a(context);
            this.f45771M0.m89101I0(AbstractC6918a0.imvAvatar);
            this.f45771M0.m89106L().m89034R(AbstractC23136l9.m118736p(AbstractC16802y.feed_header_avatar_margin_left)).m89035S(AbstractC23136l9.m118736p(AbstractC16802y.feed_header_avatar_margin_right)).m89036T(AbstractC23136l9.m118742r(12.0f));
            this.f45771M0.m115427A1(AbstractC22055v0.m115162v(context));
            this.f45782X0.m89001g1(this.f45771M0);
            if (this.f45793i1 == 13) {
                AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Name_Video, this.f45772N0);
            } else {
                AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Name, this.f45772N0);
            }
            this.f45772N0.m89101I0(AbstractC6918a0.tvUserName);
            this.f45772N0.m89106L().m89060k0(-2).m89030N(-2).m89035S(f45766s1);
            C22126c0 c22126c0 = this.f45772N0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            m44931e2(this.f45772N0, 18.0f);
            this.f45783Y0.m89001g1(this.f45772N0);
            if (this.f45793i1 == 13) {
                AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Time_Video, this.f45773O0);
            } else {
                AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Time, this.f45773O0);
            }
            this.f45773O0.m89101I0(AbstractC6918a0.tvTime);
            this.f45773O0.m89106L().m89060k0(-2).m89030N(-2).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_icon_privacy_margin_left)).m89023G(this.f45772N0).m89036T(AbstractC23136l9.m118742r(2.0f));
            this.f45783Y0.m89001g1(this.f45773O0);
            this.f45775Q0.m89101I0(AbstractC6918a0.tvPrivacyInfo);
            if (this.f45793i1 == 13) {
                this.f45775Q0.m115398o1().m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white_70));
            } else {
                this.f45775Q0.m115398o1().m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            }
            this.f45775Q0.m115398o1().mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
            this.f45775Q0.m89106L().m89060k0(-2).m89030N(-2).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_icon_privacy_margin_left)).m89020D(this.f45773O0).m89054h0(this.f45773O0);
            this.f45783Y0.m89001g1(this.f45775Q0);
            if (this.f45793i1 == 13) {
                AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Time_Video, this.f45774P0.m115398o1());
            } else {
                AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Time, this.f45774P0.m115398o1());
            }
            this.f45774P0.m89106L().m89060k0(-2).m89030N(-2).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89020D(this.f45773O0).m89054h0(this.f45775Q0);
            this.f45774P0.m115399p1(AbstractC23222t7.f112552c);
            this.f45774P0.m115402s1(AbstractC1401h.m7082f(context.getResources(), AbstractC16803z.ic_edit_solid_24, null), null, null, null);
            this.f45774P0.m115398o1().m111958F1(AbstractC8020f0.str_feed_edited);
            this.f45774P0.m115405v1(1);
            this.f45774P0.m115404u1(truncateAt);
            this.f45774P0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.o1
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    C8406v1.m44895N1(c16719g);
                }
            });
            this.f45783Y0.m89001g1(this.f45774P0);
            int i11 = AbstractC23222t7.f112566j;
            C16718f m89106L = this.f45777S0.m89106L();
            int i12 = f45768u1;
            int i13 = i11 * 2;
            m89106L.m89060k0(i12 + i13).m89030N(i12 + i13).m89041Y(i11).m89035S(f45767t1 - i11).m89017A(Boolean.TRUE).m89070w(this.f45771M0).m89029M(15);
            if (this.f45793i1 == 13) {
                this.f45777S0.m89087B0(AbstractC16803z.bg_btn_feed_menu_inner_video);
                this.f45777S0.mo111925v1(C27280g.m139659b(context, AbstractC23322a.zds_ic_more_horizontal_line_24, AbstractC16801x.white_70));
            } else {
                this.f45777S0.m89087B0(AbstractC16803z.bg_btn_postfeed);
                this.f45777S0.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_more_horizontal_line_24, AbstractC2807a.icon_02));
            }
            this.f45777S0.mo44614b1(8);
            this.f45782X0.m89001g1(this.f45777S0);
            this.f45776R0.m89106L().m89060k0(i12 + i13).m89030N(i12 + i13).m89041Y(i11).m89035S(f45769v1 - i13).m89049e0(this.f45777S0).m89070w(this.f45771M0).m89029M(15);
            if (this.f45793i1 == 13) {
                this.f45776R0.m89087B0(AbstractC16803z.bg_btn_feed_menu_inner_video);
                this.f45776R0.mo111925v1(C27280g.m139659b(context, AbstractC23322a.zds_ic_posts_move_line_24, AbstractC16801x.white_70));
            } else {
                this.f45776R0.m89087B0(AbstractC16803z.bg_btn_postfeed);
                this.f45776R0.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_posts_move_line_24, AbstractC2807a.icon_02));
            }
            this.f45776R0.mo44614b1(8);
            this.f45782X0.m89001g1(this.f45776R0);
            this.f45783Y0.m89106L().m89060k0(-2).m89030N(-2).m89070w(this.f45771M0).m89054h0(this.f45771M0).m89049e0(this.f45776R0);
            this.f45782X0.m89001g1(this.f45783Y0);
            this.f45782X0.m89106L().m89033Q(AbstractC23136l9.m118742r(4.0f));
            m89001g1(this.f45782X0);
            this.f45790f1.m89101I0(AbstractC6918a0.bg_feed_view);
            this.f45790f1.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45782X0).m89036T(AbstractC23136l9.m118736p(AbstractC16802y.feed_background_view_top_margin));
            m89001g1(this.f45790f1);
            AbstractC20826v0.m108823n(AbstractC20826v0.k.Feed_Header_Caption, this.f45788d1);
            this.f45788d1.m89101I0(AbstractC6918a0.tvTagAndLocation);
            this.f45788d1.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45790f1).m89032P(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right), 0);
            this.f45788d1.mo44614b1(8);
            this.f45788d1.m111984z1(AbstractC23136l9.m118655I(AbstractC16802y.feed_linespacing_extra), 1.0f);
            this.f45788d1.m111953A1(2);
            this.f45788d1.m111980v1(truncateAt);
            m89001g1(this.f45788d1);
            this.f45791g1.m89101I0(AbstractC6918a0.imv_thumb_location);
            this.f45791g1.m111921r1(true);
            this.f45791g1.m111929z1(5);
            this.f45791g1.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_feed));
            this.f45791g1.mo44614b1(8);
            this.f45791g1.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45788d1).m89036T(AbstractC23136l9.m118742r(14.0f));
            m89001g1(this.f45791g1);
            this.f45789e1.m89101I0(AbstractC6918a0.tvTranslation);
            this.f45789e1.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
            this.f45789e1.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f45789e1.m111982x1(true);
            this.f45789e1.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45791g1).m89032P(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right), AbstractC23136l9.m118742r(16.0f));
            this.f45789e1.m111984z1(AbstractC23136l9.m118655I(AbstractC16802y.feed_linespacing_extra), 1.0f);
            this.f45789e1.mo44614b1(8);
            m89001g1(this.f45789e1);
            this.f45784Z0.m89101I0(AbstractC6918a0.bottomAnchor);
            this.f45784Z0.m89106L().m89060k0(-1).m89030N(1).m89023G(this.f45789e1).m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top));
            m89001g1(this.f45784Z0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: F1 */
    protected void m44918F1(Context context, int i11) {
        m44917C1(context);
        this.f45788d1.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f45788d1.m111953A1(1);
        this.f45790f1.m44801F1(2);
        this.f45786b1 = this.f45790f1.m44809s1();
        C22124b0 c22124b0 = this.f45775Q0;
        if (c22124b0 != null) {
            c22124b0.m115405v1(1);
            this.f45775Q0.m115404u1(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: G1 */
    protected void m44919G1(Context context) {
        m44921J1();
        m44914z1();
        C22126c0 c22126c0 = new C22126c0(context);
        this.f45796l1 = c22126c0;
        c22126c0.m89106L().m89060k0(-2).m89030N(-2).m89027K(true);
        this.f45796l1.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f45796l1.m111962J1(C23212s8.m119607o(context, AbstractC17450b.NotificationColor5));
        this.f45796l1.m111953A1(1);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f45797m1 = c22126c02;
        c22126c02.m89106L().m89060k0(-1).m89030N(-2).m89054h0(this.f45796l1).m89027K(true);
        this.f45797m1.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f45797m1.m111962J1(C23212s8.m119607o(context, AbstractC17450b.NotificationColor5));
        this.f45797m1.m111953A1(1);
        this.f45797m1.mo111965M1(1);
        C22126c0 c22126c03 = this.f45797m1;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c03.m111980v1(truncateAt);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89060k0(-1).m89030N(-1).m89033Q(AbstractC23136l9.m118742r(8.0f));
        c16716d.m89001g1(this.f45796l1);
        c16716d.m89001g1(this.f45797m1);
        C16719g c16719g = new C16719g(context);
        this.f45798n1 = c16719g;
        c16719g.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(0.5f)).m89072y(Boolean.TRUE);
        this.f45798n1.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.HeaderFormBottomLineColor));
        C16716d c16716d2 = new C16716d(context);
        this.f45799o1 = c16716d2;
        c16716d2.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(28.0f)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile_item)).m89033Q(AbstractC23136l9.m118742r(12.0f));
        this.f45799o1.mo44614b1(8);
        this.f45799o1.m89001g1(this.f45798n1);
        this.f45799o1.m89001g1(c16716d);
        m89001g1(this.f45799o1);
        this.f45787c1 = new C22126c0(context);
        this.f45791g1 = new C22122a0(context);
        this.f45790f1 = new C8362q0(context);
        this.f45784Z0 = new C16719g(context);
        this.f45787c1.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45799o1).m89032P(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item), 0, AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile_item), 0);
        this.f45787c1.m111953A1(2);
        this.f45787c1.m111980v1(truncateAt);
        this.f45787c1.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
        this.f45787c1.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f45787c1.mo44614b1(8);
        m89001g1(this.f45787c1);
        this.f45790f1.m89101I0(AbstractC6918a0.bg_feed_view);
        this.f45790f1.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45787c1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile_item));
        m89001g1(this.f45790f1);
        this.f45791g1.m89101I0(AbstractC6918a0.imv_thumb_location);
        this.f45791g1.m111921r1(true);
        this.f45791g1.m111929z1(5);
        this.f45791g1.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_feed));
        this.f45791g1.mo44614b1(8);
        this.f45791g1.m89106L().m89060k0(-1).m89030N(-1).m89037U(AbstractC20814p0.m108611J()).m89023G(this.f45790f1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile_item)).m89036T(AbstractC23136l9.m118742r(14.0f));
        m89001g1(this.f45791g1);
        this.f45784Z0.m89101I0(AbstractC6918a0.bottomAnchor);
        this.f45784Z0.m89106L().m89060k0(-1).m89030N(1).m89023G(this.f45791g1).m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top));
        m89001g1(this.f45784Z0);
        this.f45790f1.m44801F1(0);
        C22126c0 m44809s1 = this.f45790f1.m44809s1();
        this.f45786b1 = m44809s1;
        m44931e2(m44809s1, 20.0f);
        m44891I1();
    }

    /* renamed from: H1 */
    protected void m44920H1(Context context, int i11) {
        m44917C1(context);
        if (i11 != 13) {
            this.f45790f1.m44801F1(0);
            C22126c0 m44809s1 = this.f45790f1.m44809s1();
            this.f45786b1 = m44809s1;
            m44931e2(m44809s1, 20.0f);
            m89087B0(AbstractC16803z.bg_white_with_top_border);
        } else {
            this.f45790f1.m44801F1(0);
            C22126c0 m44809s12 = this.f45790f1.m44809s1();
            this.f45786b1 = m44809s12;
            m44931e2(m44809s12, 20.0f);
            m89087B0(AbstractC16803z.timeline_top_gradient);
        }
        C22124b0 c22124b0 = this.f45775Q0;
        if (c22124b0 != null) {
            c22124b0.m115405v1(1);
            this.f45775Q0.m115404u1(TextUtils.TruncateAt.END);
        }
        C22126c0 c22126c0 = this.f45773O0;
        if (c22126c0 != null) {
            c22126c0.m111953A1(1);
            this.f45773O0.m111980v1(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: J1 */
    public void m44921J1() {
        a aVar = new a(this.f84786r);
        this.f45802r1 = aVar;
        aVar.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_timebar_marginleft));
        m89001g1(this.f45802r1);
    }

    /* renamed from: U1 */
    public void m44922U1() {
        C22126c0 c22126c0;
        try {
            if (AbstractC26683d.f126393l && (c22126c0 = this.f45786b1) != null) {
                AbstractC28245z3.m142218a(c22126c0.m111973m1(), this.f45786b1);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: W1 */
    void m44923W1(C3000l0 c3000l0, C3020p0 c3020p0, boolean z11, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f) {
        boolean z12;
        int m118742r;
        String str;
        try {
            AbstractC20814p0.m108665q0(c3020p0, this.f45772N0, interfaceC10867f, this.f45793i1, c3000l0.f11896q0, c3020p0.m14494Y());
            if (!TextUtils.isEmpty(c3020p0.f12022B.f12291m) && this.f45793i1 == 4) {
                this.f45772N0.m89106L().m89035S(AbstractC23136l9.m118742r(16.0f));
            }
            int i11 = 0;
            if (this.f45771M0 != null) {
                boolean z13 = AbstractC23304d.m120536g().f147980a;
                C22129e c22129e = this.f45771M0;
                if (z11 && z13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c22129e.f108931U0 = z12;
                ContactProfile m118084d = AbstractC23028c0.m118084d(c3020p0.f12022B.f12280b);
                if (m118084d != null) {
                    ContactProfile m40356w = ContactProfile.m40356w(m118084d);
                    if (!TextUtils.isEmpty(m40356w.f42446v) && CoreUtility.f89233i.equals(m40356w.f42434r)) {
                        str = m40356w.f42446v;
                    } else {
                        str = c3020p0.f12022B.f12283e;
                    }
                    m40356w.f42446v = str;
                    this.f45771M0.m115433q1(m40356w);
                } else {
                    this.f45771M0.m115434r1(c3020p0.f12022B.f12283e);
                }
                if (m44893L1()) {
                    boolean m115116F = AbstractC22055v0.m115116F(c3020p0.f12022B.f12280b, AbstractC21244b.m110054d(getContext()));
                    this.f45771M0.m115429C1(m115116F, AbstractC22055v0.m115115E(c3020p0.f12022B.f12280b, AbstractC21244b.m110054d(getContext())));
                    if (this.f45772N0.m89106L() != null) {
                        C16718f m89106L = this.f45772N0.m89106L();
                        if (m115116F) {
                            m118742r = AbstractC23136l9.m118742r(1.0f);
                        } else {
                            m118742r = AbstractC23136l9.m118742r(3.0f);
                        }
                        m89106L.m89036T(m118742r);
                    }
                } else {
                    this.f45771M0.m115429C1(false, false);
                    if (this.f45772N0.m89106L() != null) {
                        this.f45772N0.m89106L().m89036T(AbstractC23136l9.m118742r(3.0f));
                    }
                }
                this.f45771M0.m115442z1(AbstractC22055v0.m115112B(c3020p0.f12022B.f12280b));
            }
            String m119284r = AbstractC23160o0.m119284r(c3020p0.f12062u, true);
            C22126c0 c22126c0 = this.f45773O0;
            if (c22126c0 != null) {
                c22126c0.m111959G1(m119284r);
            }
            C22124b0 c22124b0 = this.f45774P0;
            if (c22124b0 != null) {
                int i12 = this.f45793i1;
                if (i12 != 0 && i12 != 1 && i12 != 4) {
                    c22124b0.mo44614b1(8);
                }
                if (c3020p0.m14494Y() || !c3020p0.m14488S()) {
                    i11 = 8;
                }
                c22124b0.mo44614b1(i11);
            }
            AbstractC20814p0.m108671t0(getContext(), c3020p0, this.f45775Q0, interfaceC2259a, this.f45793i1);
            this.f45775Q0.mo89099H0(!this.f45794j1);
            if (!z11) {
                FeedActionZUtils.m47543c(c3020p0.f12057p, "new_feed");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: X1 */
    void m44924X1(InterfaceC2259a interfaceC2259a, C3020p0 c3020p0, C22122a0 c22122a0, C23528a c23528a, boolean z11) {
        if (c22122a0 != null && c3020p0 != null) {
            try {
                if (c3020p0.m14496a0()) {
                    c22122a0.mo44614b1(0);
                    int m118722k0 = AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(16.0f) * 2);
                    C3063z0 c3063z0 = c3020p0.f12023C.f12111b;
                    String str = c3063z0.m153169a() + "_" + c3063z0.m153170b();
                    c22122a0.mo44614b1(0);
                    c22122a0.mo111925v1(AbstractC28236y3.m142196g(getContext()));
                    c22122a0.m89129Y0(str);
                    C32049o6.f147573a.m154648d(c3063z0, m118722k0, f45770w1, c23528a, new C32049o6.a() { // from class: com.zing.zalo.feed.components.s1

                        /* renamed from: b */
                        public final /* synthetic */ String f45669b;

                        public /* synthetic */ C8379s1(String str2) {
                            r2 = str2;
                        }

                        @Override // p716zh.C32049o6.a
                        /* renamed from: a */
                        public final void mo44791a(C3979l c3979l, boolean z12) {
                            C8406v1.m44897P1(C22122a0.this, r2, c3979l, z12);
                        }
                    }, z11);
                    c22122a0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.t1

                        /* renamed from: q */
                        public final /* synthetic */ InterfaceC2259a f45714q;

                        public /* synthetic */ C8390t1(InterfaceC2259a interfaceC2259a2) {
                            r2 = interfaceC2259a2;
                        }

                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            C8406v1.m44898Q1(C3020p0.this, r2, c16719g);
                        }
                    });
                } else {
                    c22122a0.mo44614b1(8);
                    c22122a0.mo89109M0(null);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:6:0x0015, B:9:0x0025, B:11:0x0035, B:13:0x0039, B:14:0x003d, B:16:0x0043, B:18:0x0055, B:20:0x0059, B:21:0x005d, B:23:0x0063, B:25:0x0075, B:28:0x007e, B:31:0x0089, B:33:0x008d, B:34:0x0091, B:36:0x0097, B:43:0x00a9, B:39:0x00b2, B:46:0x00bb, B:48:0x00bf, B:51:0x00c6, B:53:0x00d0, B:54:0x00f7, B:58:0x010e, B:60:0x0114, B:62:0x013f, B:64:0x0149, B:66:0x015a, B:68:0x015e, B:69:0x0162, B:71:0x0168, B:73:0x0183, B:75:0x018a, B:77:0x018f, B:80:0x019b, B:82:0x01a4, B:83:0x01b4, B:94:0x01ab, B:95:0x01b0, B:97:0x0127, B:98:0x0136, B:99:0x00f0), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:6:0x0015, B:9:0x0025, B:11:0x0035, B:13:0x0039, B:14:0x003d, B:16:0x0043, B:18:0x0055, B:20:0x0059, B:21:0x005d, B:23:0x0063, B:25:0x0075, B:28:0x007e, B:31:0x0089, B:33:0x008d, B:34:0x0091, B:36:0x0097, B:43:0x00a9, B:39:0x00b2, B:46:0x00bb, B:48:0x00bf, B:51:0x00c6, B:53:0x00d0, B:54:0x00f7, B:58:0x010e, B:60:0x0114, B:62:0x013f, B:64:0x0149, B:66:0x015a, B:68:0x015e, B:69:0x0162, B:71:0x0168, B:73:0x0183, B:75:0x018a, B:77:0x018f, B:80:0x019b, B:82:0x01a4, B:83:0x01b4, B:94:0x01ab, B:95:0x01b0, B:97:0x0127, B:98:0x0136, B:99:0x00f0), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* renamed from: Y1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m44925Y1(C3020p0 c3020p0, C21697g c21697g, C21697g c21697g2, C21697g c21697g3, C8362q0 c8362q0, boolean z11, boolean z12, Context context, InterfaceC10867f interfaceC10867f, InterfaceC2266h interfaceC2266h, boolean z13, boolean z14, int i11) {
        ?? r14;
        int i12;
        CharSequence m14528u;
        ArrayList arrayList;
        if (c21697g == null) {
            return;
        }
        try {
            c21697g.m111959G1("");
            c21697g.mo44614b1(8);
            c8362q0.mo44614b1(8);
            if (c3020p0 == null) {
                return;
            }
            boolean m108641e0 = AbstractC20814p0.m108641e0(i11);
            CharSequence m108603F = AbstractC20814p0.m108603F(c3020p0, z11, interfaceC10867f, m108641e0);
            if (TextUtils.isEmpty(m108603F)) {
                r14 = 0;
            } else {
                ArrayList arrayList2 = c3020p0.f12029I;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C10866e c10866e = (C10866e) it.next();
                        c10866e.m56371O(z12);
                        c10866e.m56369M(interfaceC10867f);
                    }
                }
                ArrayList arrayList3 = c3020p0.f12030J;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        C10866e c10866e2 = (C10866e) it2.next();
                        c10866e2.m56371O(z12);
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
                        c10866e3.m56371O(z12);
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
                CharSequence m152970f = C31839a6.m152970f(m108603F, c3020p0.m14531w(z11, m108641e0), (c3025q0 == null || c3025q0.f12096E == 0) ? false : true, interfaceC10867f);
                if (z12) {
                    c21697g.m111955C1(C10887z.m56529k());
                    C28100j3 c28100j3 = new C28100j3(1);
                    c28100j3.m141567a(c3020p0.f12057p, c3020p0.m14465A());
                    c21697g.setTag(AbstractC6918a0.tag_callback_span_listener, interfaceC10867f);
                    c21697g.setTag(AbstractC6918a0.tag_callback_span_data, c28100j3);
                } else {
                    c21697g.m111955C1(C10880s.m56519f());
                }
                c21697g.mo44614b1(0);
                c8362q0.mo44614b1(0);
                c21697g.m111959G1(m152970f);
                if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                    if (z13 && c21697g3 != null && AbstractC23309i.m121528Ve()) {
                        r14 = 0;
                        AbstractC20814p0.m108672u(context, c21697g, c21697g2, c21697g3, c3020p0, z11, interfaceC2266h);
                    } else {
                        r14 = 0;
                        AbstractC20814p0.m108662p(context, c21697g, c3020p0.f12023C.f12110a.toString(), c3020p0.f12029I);
                    }
                } else {
                    r14 = 0;
                    c21697g.m89111N0(null);
                }
            }
            try {
                if (c21697g2 != 0) {
                    CharSequence m108615L = AbstractC20814p0.m108615L(c3020p0, interfaceC10867f);
                    if (!TextUtils.isEmpty(m108615L)) {
                        c21697g2.m111955C1(C10880s.m56519f());
                        c21697g2.mo44614b1(r14);
                        c21697g2.m111959G1(m108615L);
                        C3003l3 c3003l3 = c3020p0.f12059r;
                        if (c3003l3 != null && (arrayList = c3003l3.f11959d) != null) {
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                C10866e.m56359e((C10866e) it4.next(), c3020p0.f12057p, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, c3020p0.f12058q, interfaceC10867f);
                            }
                        }
                    } else {
                        i12 = 8;
                        c21697g2.mo44614b1(8);
                        if (c21697g3 != null) {
                            c21697g3.mo44614b1(i12);
                        }
                        if (z13 && !TextUtils.isEmpty(c3020p0.f12023C.f12115f) && c21697g3 != null) {
                            AbstractC20814p0.m108668s(context, c21697g3, c3020p0.f12023C.f12115f);
                        }
                        if (m108641e0) {
                            m14528u = z11 ? c3020p0.m14528u() : c3020p0.f12023C.f12110a;
                        } else {
                            m14528u = c3020p0.m14526s();
                        }
                        C3013n3 c3013n3 = c3020p0.f12023C.f12097F;
                        C31890dc m153044X = C31845ac.m152996J().m153044X();
                        c8362q0.m44804I1(r14);
                        m44911v1(c8362q0, true);
                        c8362q0.m44797B1(m153044X, r14);
                        c8362q0.setTag(1090453510, String.valueOf(c3020p0.f12023C.f12096E));
                        c8362q0.m44815y1(c3013n3, m14528u, i11);
                        new WeakReference(c21697g2);
                        C31845ac.m152996J().m153057o0(c3020p0.f12023C.f12096E, new C31845ac.e() { // from class: com.zing.zalo.feed.components.u1

                            /* renamed from: b */
                            public final /* synthetic */ WeakReference f45749b;

                            /* renamed from: c */
                            public final /* synthetic */ int f45750c;

                            /* renamed from: d */
                            public final /* synthetic */ CharSequence f45751d;

                            /* renamed from: e */
                            public final /* synthetic */ C3020p0 f45752e;

                            /* renamed from: f */
                            public final /* synthetic */ C3013n3 f45753f;

                            /* renamed from: g */
                            public final /* synthetic */ boolean f45754g;

                            public /* synthetic */ C8398u1(WeakReference weakReference, int i112, CharSequence m14528u2, C3020p0 c3020p02, C3013n3 c3013n32, boolean z142) {
                                r2 = weakReference;
                                r3 = i112;
                                r4 = m14528u2;
                                r5 = c3020p02;
                                r6 = c3013n32;
                                r7 = z142;
                            }

                            @Override // p716zh.C31845ac.e
                            /* renamed from: a */
                            public final void mo39491a(int i13, String str, C31890dc c31890dc) {
                                C8406v1.this.m44899R1(r2, r3, r4, r5, r6, r7, i13, str, c31890dc);
                            }
                        });
                        AbstractC20814p0.m108618M0(c3020p02);
                        return;
                    }
                }
                m44911v1(c8362q0, true);
                c8362q0.m44797B1(m153044X, r14);
                c8362q0.setTag(1090453510, String.valueOf(c3020p02.f12023C.f12096E));
                c8362q0.m44815y1(c3013n32, m14528u2, i112);
                new WeakReference(c21697g2);
                C31845ac.m152996J().m153057o0(c3020p02.f12023C.f12096E, new C31845ac.e() { // from class: com.zing.zalo.feed.components.u1

                    /* renamed from: b */
                    public final /* synthetic */ WeakReference f45749b;

                    /* renamed from: c */
                    public final /* synthetic */ int f45750c;

                    /* renamed from: d */
                    public final /* synthetic */ CharSequence f45751d;

                    /* renamed from: e */
                    public final /* synthetic */ C3020p0 f45752e;

                    /* renamed from: f */
                    public final /* synthetic */ C3013n3 f45753f;

                    /* renamed from: g */
                    public final /* synthetic */ boolean f45754g;

                    public /* synthetic */ C8398u1(WeakReference weakReference, int i112, CharSequence m14528u2, C3020p0 c3020p02, C3013n3 c3013n32, boolean z142) {
                        r2 = weakReference;
                        r3 = i112;
                        r4 = m14528u2;
                        r5 = c3020p02;
                        r6 = c3013n32;
                        r7 = z142;
                    }

                    @Override // p716zh.C31845ac.e
                    /* renamed from: a */
                    public final void mo39491a(int i13, String str, C31890dc c31890dc) {
                        C8406v1.this.m44899R1(r2, r3, r4, r5, r6, r7, i13, str, c31890dc);
                    }
                });
                AbstractC20814p0.m108618M0(c3020p02);
                return;
            } catch (Exception e11) {
                e = e11;
                AbstractC20110a.m104539h(e);
                return;
            }
            i12 = 8;
            if (c21697g3 != null) {
            }
            if (z13) {
                AbstractC20814p0.m108668s(context, c21697g3, c3020p02.f12023C.f12115f);
            }
            if (m108641e0) {
            }
            C3013n3 c3013n32 = c3020p02.f12023C.f12097F;
            C31890dc m153044X2 = C31845ac.m152996J().m153044X();
            c8362q0.m44804I1(r14);
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: Z1 */
    public void m44926Z1(C16719g.c cVar) {
        C8362q0 c8362q0 = this.f45790f1;
        if (c8362q0 != null) {
            c8362q0.mo89109M0(cVar);
            C22126c0 c22126c0 = this.f45790f1.f45580N0;
            if (c22126c0 != null) {
                c22126c0.mo89109M0(cVar);
            }
        }
    }

    /* renamed from: a2 */
    public void m44927a2(C3000l0 c3000l0, int i11) {
        C3020p0 m14324b0;
        if (c3000l0 == null || (m14324b0 = c3000l0.m14324b0(i11)) == null) {
            return;
        }
        String m119284r = AbstractC23160o0.m119284r(m14324b0.f12062u, true);
        C22126c0 c22126c0 = this.f45773O0;
        if (c22126c0 != null) {
            c22126c0.m111959G1(m119284r);
        }
    }

    /* renamed from: b2 */
    public void m44928b2(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f) {
        C3020p0 m14324b0;
        try {
            this.f45795k1 = z11;
            if (c3000l0 == null || (m14324b0 = c3000l0.m14324b0(i11)) == null) {
                return;
            }
            int i12 = this.f45793i1;
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    if (i12 != 9) {
                        m44923W1(c3000l0, m14324b0, z11, interfaceC2259a, interfaceC10867f);
                        return;
                    }
                    m44923W1(c3000l0, m14324b0, z11, interfaceC2259a, interfaceC10867f);
                    m44937l2(this.f45771M0, this.f45772N0, this.f45773O0, this.f45775Q0);
                    m44938y1(this.f45790f1, this.f45784Z0);
                    return;
                }
                a aVar = this.f45802r1;
                if (aVar != null) {
                    aVar.m44940r1(c3000l0, m14324b0);
                }
                m44902V1(m14324b0, interfaceC2259a);
                return;
            }
            m44923W1(c3000l0, m14324b0, z11, interfaceC2259a, interfaceC10867f);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: c2 */
    public void m44929c2(C3000l0 c3000l0) {
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14322a0 = c3000l0.m14322a0();
            if (m14322a0 == null) {
                return;
            }
            if (this.f45780V0 != null && this.f45778T0 != null && this.f45779U0 != null) {
                if (!TextUtils.isEmpty(m14322a0.f12066y)) {
                    this.f45780V0.mo44614b1(0);
                    this.f45778T0.m111959G1(m14322a0.f12066y);
                } else {
                    this.f45780V0.mo44614b1(8);
                }
                this.f45778T0.mo89109M0(this.f45801q1);
            }
            if (this.f45781W0 != null) {
                if (!TextUtils.isEmpty(m14322a0.f12067z)) {
                    this.f45781W0.mo44614b1(0);
                    this.f45781W0.m111959G1(m14322a0.f12067z);
                } else {
                    this.f45781W0.mo44614b1(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d2 */
    public void m44930d2(boolean z11) {
        this.f45794j1 = z11;
    }

    /* renamed from: e2 */
    void m44931e2(C22126c0 c22126c0, float f11) {
        if (c22126c0 != null) {
            Paint.FontMetrics m111969i1 = c22126c0.m111969i1();
            c22126c0.m111984z1(AbstractC23136l9.m118742r(f11) - ((int) (m111969i1.descent - m111969i1.ascent)), 1.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0288 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:6:0x000b, B:9:0x0012, B:20:0x002c, B:25:0x003e, B:27:0x0061, B:28:0x006c, B:30:0x03c3, B:32:0x03c7, B:38:0x007f, B:40:0x0085, B:41:0x0088, B:43:0x008c, B:45:0x0090, B:47:0x0096, B:49:0x009e, B:51:0x00b4, B:52:0x00bc, B:57:0x00cf, B:59:0x00f0, B:62:0x00f8, B:64:0x010e, B:68:0x01e2, B:73:0x01f6, B:75:0x0221, B:77:0x0225, B:78:0x022a, B:80:0x023c, B:82:0x0242, B:84:0x0247, B:86:0x024f, B:90:0x025b, B:93:0x026b, B:94:0x0265, B:96:0x026e, B:98:0x0272, B:100:0x0278, B:103:0x028e, B:104:0x0288, B:107:0x0119, B:109:0x011f, B:111:0x0135, B:112:0x0139, B:114:0x013f, B:116:0x0163, B:118:0x0169, B:120:0x017f, B:121:0x0187, B:123:0x018d, B:124:0x0199, B:126:0x01bd, B:127:0x01cb, B:129:0x01d4, B:130:0x01dd, B:132:0x0293, B:134:0x029a, B:136:0x02a0, B:138:0x02ac, B:139:0x02b4, B:141:0x02b7, B:143:0x02bb, B:145:0x02c1, B:146:0x02d0, B:147:0x02e7, B:149:0x02f2, B:151:0x0300, B:153:0x0306, B:154:0x0311, B:156:0x0315, B:157:0x0318, B:159:0x031c, B:160:0x0388, B:162:0x038c, B:163:0x0392, B:165:0x0396, B:167:0x039c, B:169:0x03a2, B:171:0x03aa, B:172:0x03bc, B:174:0x0321, B:176:0x0325, B:178:0x032b, B:180:0x0333, B:182:0x033a, B:184:0x0343, B:189:0x0357), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0265 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:6:0x000b, B:9:0x0012, B:20:0x002c, B:25:0x003e, B:27:0x0061, B:28:0x006c, B:30:0x03c3, B:32:0x03c7, B:38:0x007f, B:40:0x0085, B:41:0x0088, B:43:0x008c, B:45:0x0090, B:47:0x0096, B:49:0x009e, B:51:0x00b4, B:52:0x00bc, B:57:0x00cf, B:59:0x00f0, B:62:0x00f8, B:64:0x010e, B:68:0x01e2, B:73:0x01f6, B:75:0x0221, B:77:0x0225, B:78:0x022a, B:80:0x023c, B:82:0x0242, B:84:0x0247, B:86:0x024f, B:90:0x025b, B:93:0x026b, B:94:0x0265, B:96:0x026e, B:98:0x0272, B:100:0x0278, B:103:0x028e, B:104:0x0288, B:107:0x0119, B:109:0x011f, B:111:0x0135, B:112:0x0139, B:114:0x013f, B:116:0x0163, B:118:0x0169, B:120:0x017f, B:121:0x0187, B:123:0x018d, B:124:0x0199, B:126:0x01bd, B:127:0x01cb, B:129:0x01d4, B:130:0x01dd, B:132:0x0293, B:134:0x029a, B:136:0x02a0, B:138:0x02ac, B:139:0x02b4, B:141:0x02b7, B:143:0x02bb, B:145:0x02c1, B:146:0x02d0, B:147:0x02e7, B:149:0x02f2, B:151:0x0300, B:153:0x0306, B:154:0x0311, B:156:0x0315, B:157:0x0318, B:159:0x031c, B:160:0x0388, B:162:0x038c, B:163:0x0392, B:165:0x0396, B:167:0x039c, B:169:0x03a2, B:171:0x03aa, B:172:0x03bc, B:174:0x0321, B:176:0x0325, B:178:0x032b, B:180:0x0333, B:182:0x033a, B:184:0x0343, B:189:0x0357), top: B:5:0x000b }] */
    /* renamed from: f2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m44932f2(C3000l0 c3000l0, int i11, Context context, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f) {
        C3020p0 c3020p0;
        int i12;
        C3020p0 c3020p02;
        C16719g c16719g;
        C22126c0 c22126c0;
        boolean z11;
        C22126c0 c22126c02;
        C3020p0 c3020p03;
        C3020p0 c3020p04;
        CharSequence charSequence = "";
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            int i13 = this.f45793i1;
            if (i13 == 0) {
                c3020p0 = m14324b0;
                if (c3020p0.f12058q == 6) {
                    this.f45788d1.mo44614b1(8);
                    this.f45790f1.mo44614b1(8);
                    C16719g c16719g2 = this.f45784Z0;
                    if (c16719g2 != null && c16719g2.m89106L() != null) {
                        this.f45784Z0.m89106L().m89036T(this.f45785a1);
                    }
                    C22126c0 c22126c03 = this.f45789e1;
                    if (c22126c03 != null) {
                        c22126c03.mo44614b1(8);
                    }
                    C22122a0 c22122a0 = this.f45791g1;
                    if (c22122a0 != null) {
                        c22122a0.mo44614b1(8);
                    }
                } else {
                    C16719g c16719g3 = this.f45784Z0;
                    if (c16719g3 != null && c16719g3.m89106L() != null) {
                        int i14 = this.f45785a1;
                        if (c3020p0.m14486Q() || c3020p0.m14496a0()) {
                            i14 = 0;
                        }
                        this.f45784Z0.m89106L().m89036T(i14);
                    }
                    C22126c0 c22126c04 = this.f45786b1;
                    C22126c0 c22126c05 = this.f45788d1;
                    C22126c0 c22126c06 = this.f45789e1;
                    C8362q0 c8362q0 = this.f45790f1;
                    int i15 = this.f45793i1;
                    m44925Y1(c3020p0, c22126c04, c22126c05, c22126c06, c8362q0, i15 != 4, i15 == 0, context, interfaceC10867f, null, c3020p0.m14500c0(), this.f45795k1, this.f45793i1);
                    m44924X1(interfaceC2259a, c3020p0, this.f45791g1, this.f45792h1, this.f45795k1);
                }
                C11850a c11850a = this.f45777S0;
                if (c11850a != null) {
                    i12 = 0;
                    c11850a.mo44614b1(0);
                } else {
                    i12 = 0;
                }
                if (this.f45776R0 != null) {
                    if (c3000l0.f11896q0 == 0 && !c3020p0.m14494Y() && C24380u.f117739a.m127515h()) {
                        this.f45776R0.mo44614b1(i12);
                        this.f45776R0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.q1

                            /* renamed from: q */
                            public final /* synthetic */ C3000l0 f45601q;

                            /* renamed from: r */
                            public final /* synthetic */ C3020p0 f45602r;

                            public /* synthetic */ C8363q1(C3000l0 c3000l02, C3020p0 c3020p05) {
                                r2 = c3000l02;
                                r3 = c3020p05;
                            }

                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g4) {
                                C8406v1.m44901T1(InterfaceC2259a.this, r2, r3, c16719g4);
                            }
                        });
                    } else {
                        this.f45776R0.mo44614b1(8);
                    }
                }
            } else if (i13 == 1) {
                c3020p05 = m14324b0;
                C22126c0 c22126c07 = this.f45788d1;
                if (c22126c07 != null && c22126c07.m89106L() != null) {
                    this.f45788d1.m89106L().m89036T(c3020p05.m14486Q() ? AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top) : 0);
                }
                C16719g c16719g4 = this.f45784Z0;
                if (c16719g4 != null && c16719g4.m89106L() != null) {
                    this.f45784Z0.m89106L().m89036T(AbstractC23136l9.m118742r(6.0f));
                }
                AbstractC20814p0.m108683z0(c3000l02, c3020p05, this.f45790f1, c3000l02.f11863L, this.f45788d1, c3000l02.f11864M, context, interfaceC10867f, this.f45795k1, 7);
            } else if (i13 == 2 || i13 == 3) {
                m44903k2(c3000l02);
                this.f45787c1.m111959G1("");
                this.f45787c1.mo44614b1(8);
                if (!m14324b0.m14482K() && !m14324b0.m14477G()) {
                    c3020p02 = m14324b0;
                    C22126c0 c22126c08 = this.f45786b1;
                    C22126c0 c22126c09 = this.f45787c1;
                    C22126c0 c22126c010 = this.f45789e1;
                    C8362q0 c8362q02 = this.f45790f1;
                    int i16 = this.f45793i1;
                    c3020p05 = c3020p02;
                    m44925Y1(c3020p02, c22126c08, c22126c09, c22126c010, c8362q02, i16 == 4, i16 != 0, context, interfaceC10867f, null, c3020p02.m14500c0(), this.f45795k1, this.f45793i1);
                    if (c3020p05.f12058q == 6 && (c22126c02 = this.f45786b1) != null) {
                        c22126c02.mo44614b1(8);
                    }
                    m44924X1(interfaceC2259a, c3020p05, this.f45791g1, this.f45792h1, this.f45795k1);
                    c16719g = this.f45784Z0;
                    if (c16719g != null && c16719g.m89106L() != null) {
                        if (c3020p05.f12058q != 1 && (m44894M1(this.f45786b1) || m44894M1(this.f45787c1))) {
                            z11 = false;
                            this.f45784Z0.m89106L().m89036T(!z11 ? 0 : AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom));
                        }
                        z11 = true;
                        this.f45784Z0.m89106L().m89036T(!z11 ? 0 : AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom));
                    }
                    c22126c0 = this.f45787c1;
                    if (c22126c0 != null && c22126c0.m89106L() != null) {
                        this.f45787c1.m89106L().m89033Q(!(c3020p05.m14486Q() ^ true) ? 0 : AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom));
                    }
                }
                if (m14324b0.m14482K()) {
                    c3020p02 = m14324b0;
                    charSequence = TextUtils.concat("", c3020p02.f12059r.f11958c);
                    ArrayList arrayList = c3020p02.f12059r.f11959d;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C10866e.m56359e((C10866e) it.next(), c3020p02.f12057p, c3020p02.f12022B.f12280b, c3020p02.f12059r.f11956a, c3020p02.f12058q, interfaceC10867f);
                        }
                    }
                } else {
                    c3020p02 = m14324b0;
                }
                if (c3020p02.m14477G()) {
                    CharSequence m14728g = c3020p02.f12023C.f12111b.m14728g();
                    if (!TextUtils.isEmpty(c3020p02.f12023C.f12111b.m14730i())) {
                        m14728g = c3020p02.f12023C.f12111b.m14730i();
                    }
                    if (c3020p02.m14482K()) {
                        m14728g = TextUtils.concat(" ", m14728g);
                    }
                    charSequence = TextUtils.concat(charSequence, m14728g);
                    double m153170b = c3020p02.f12023C.f12111b.m153170b();
                    double m153169a = c3020p02.f12023C.f12111b.m153169a();
                    C10866e m14729h = c3020p02.f12023C.f12111b.m14729h();
                    if (m14729h != null) {
                        m14729h.m56375S(true);
                        m14729h.m56378V(C25866f0.m133448H(interfaceC10867f, "", m153170b, m153169a));
                    }
                }
                this.f45787c1.m111959G1(charSequence);
                if (AbstractC23304d.f113420o2) {
                    this.f45787c1.m111955C1(C10880s.m56519f());
                }
                this.f45787c1.mo44614b1(0);
                C22126c0 c22126c082 = this.f45786b1;
                C22126c0 c22126c092 = this.f45787c1;
                C22126c0 c22126c0102 = this.f45789e1;
                C8362q0 c8362q022 = this.f45790f1;
                int i162 = this.f45793i1;
                c3020p05 = c3020p02;
                m44925Y1(c3020p02, c22126c082, c22126c092, c22126c0102, c8362q022, i162 == 4, i162 != 0, context, interfaceC10867f, null, c3020p02.m14500c0(), this.f45795k1, this.f45793i1);
                if (c3020p05.f12058q == 6) {
                    c22126c02.mo44614b1(8);
                }
                m44924X1(interfaceC2259a, c3020p05, this.f45791g1, this.f45792h1, this.f45795k1);
                c16719g = this.f45784Z0;
                if (c16719g != null) {
                    if (c3020p05.f12058q != 1) {
                        z11 = false;
                        this.f45784Z0.m89106L().m89036T(!z11 ? 0 : AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom));
                    }
                    z11 = true;
                    this.f45784Z0.m89106L().m89036T(!z11 ? 0 : AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom));
                }
                c22126c0 = this.f45787c1;
                if (c22126c0 != null) {
                    this.f45787c1.m89106L().m89033Q(!(c3020p05.m14486Q() ^ true) ? 0 : AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom));
                }
            } else {
                if (i13 == 11) {
                    c3020p03 = m14324b0;
                    m44925Y1(m14324b0, this.f45786b1, this.f45788d1, this.f45789e1, this.f45790f1, i13 != 4, i13 == 0, context, interfaceC10867f, null, m14324b0.m14500c0(), this.f45795k1, this.f45793i1);
                    if (this.f45793i1 == 6) {
                        this.f45786b1.mo89109M0(this.f45801q1);
                    }
                } else if (i13 != 13) {
                    c3020p03 = m14324b0;
                    m44925Y1(m14324b0, this.f45786b1, this.f45788d1, this.f45789e1, this.f45790f1, i13 != 4, i13 == 0, context, interfaceC10867f, null, m14324b0.m14500c0(), this.f45795k1, this.f45793i1);
                    if (this.f45793i1 == 6) {
                        this.f45786b1.mo89109M0(this.f45801q1);
                    }
                    m44924X1(interfaceC2259a, c3020p03, this.f45791g1, this.f45792h1, this.f45795k1);
                } else {
                    c3020p03 = m14324b0;
                    C11850a c11850a2 = this.f45777S0;
                    if (c11850a2 != null) {
                        c11850a2.mo44614b1(0);
                    }
                    if (this.f45776R0 != null) {
                        if (c3000l02.f11896q0 == 0 && !c3020p03.m14494Y() && C24380u.f117739a.m127515h()) {
                            this.f45776R0.mo44614b1(0);
                            c3020p04 = c3020p03;
                            this.f45776R0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.p1

                                /* renamed from: q */
                                public final /* synthetic */ C3000l0 f45558q;

                                /* renamed from: r */
                                public final /* synthetic */ C3020p0 f45559r;

                                public /* synthetic */ C8355p1(C3000l0 c3000l02, C3020p0 c3020p042) {
                                    r2 = c3000l02;
                                    r3 = c3020p042;
                                }

                                @Override // com.zing.zalo.uidrawing.C16719g.c
                                /* renamed from: y */
                                public final void mo929y(C16719g c16719g5) {
                                    C8406v1.m44900S1(InterfaceC2259a.this, r2, r3, c16719g5);
                                }
                            });
                        } else {
                            c3020p042 = c3020p03;
                            this.f45776R0.mo44614b1(8);
                        }
                        c3020p05 = c3020p042;
                    }
                }
                c3020p05 = c3020p03;
            }
            if (this.f45795k1) {
                return;
            }
            C28051e4.m141514f().m141527p(c3020p05);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g2 */
    public void m44933g2(C16719g.c cVar) {
        C22129e c22129e = this.f45771M0;
        if (c22129e != null) {
            c22129e.mo89109M0(cVar);
        }
    }

    /* renamed from: h2 */
    public void m44934h2(C16719g.c cVar) {
        C11850a c11850a = this.f45777S0;
        if (c11850a != null) {
            c11850a.mo89109M0(cVar);
        }
    }

    /* renamed from: i2 */
    public void m44935i2(C16719g.c cVar) {
        C22129e c22129e = this.f45771M0;
        if (c22129e != null) {
            c22129e.mo89109M0(cVar);
        }
        C22126c0 c22126c0 = this.f45772N0;
        if (c22126c0 != null) {
            c22126c0.mo89109M0(cVar);
        }
    }

    /* renamed from: j2 */
    public void m44936j2(int i11) {
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 6) {
                        if (i11 != 11) {
                            if (i11 != 13) {
                                return;
                            }
                        } else {
                            m44938y1(this.f45771M0, this.f45772N0, this.f45773O0, this.f45775Q0, this.f45777S0, this.f45776R0);
                        }
                    } else {
                        m44938y1(this.f45776R0, this.f45773O0, this.f45791g1);
                    }
                } else {
                    this.f45771M0.mo44614b1(0);
                    this.f45772N0.mo44614b1(0);
                    this.f45790f1.mo44614b1(0);
                    this.f45788d1.mo44614b1(0);
                    this.f45773O0.mo44614b1(0);
                    this.f45775Q0.mo44614b1(0);
                    m44937l2(this.f45777S0);
                    this.f45791g1.mo44614b1(8);
                    this.f45789e1.mo44614b1(8);
                    this.f45776R0.mo44614b1(8);
                }
            }
            m44937l2(this.f45777S0, this.f45776R0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l2 */
    public void m44937l2(C16719g... c16719gArr) {
        try {
            if (c16719gArr.length <= 0) {
                return;
            }
            for (C16719g c16719g : c16719gArr) {
                c16719g.mo44614b1(0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: y1 */
    public void m44938y1(C16719g... c16719gArr) {
        try {
            if (c16719gArr.length <= 0) {
                return;
            }
            for (C16719g c16719g : c16719gArr) {
                c16719g.mo44614b1(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}

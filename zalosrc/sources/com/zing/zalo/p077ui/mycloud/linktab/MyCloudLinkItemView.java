package com.zing.zalo.p077ui.mycloud.linktab;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.linktab.MyCloudLinkItemView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import id0.C20518d;
import java.util.Locale;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23228u2;
import me0.C23212s8;
import me0.C23250w4;
import me0.C23278z2;
import mm0.AbstractC23350e;
import on0.C24329j;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C31944h6;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import u80.InterfaceC27158o2;
import ui0.C27280g;
import z80.RunnableC31712e;

/* loaded from: classes6.dex */
public final class MyCloudLinkItemView extends ModulesView {

    /* renamed from: K */
    private int f65805K;

    /* renamed from: L */
    private int f65806L;

    /* renamed from: M */
    private int f65807M;

    /* renamed from: N */
    private int f65808N;

    /* renamed from: O */
    private C21693c f65809O;

    /* renamed from: P */
    private C16716d f65810P;

    /* renamed from: Q */
    private C22126c0 f65811Q;

    /* renamed from: R */
    private C22126c0 f65812R;

    /* renamed from: S */
    private C22126c0 f65813S;

    /* renamed from: T */
    private C21693c f65814T;

    /* renamed from: U */
    private C16719g f65815U;

    /* renamed from: V */
    private C16719g f65816V;

    /* renamed from: W */
    private C16716d f65817W;

    /* renamed from: a0 */
    private C21691a f65818a0;

    /* renamed from: b0 */
    private C3977j f65819b0;

    /* renamed from: c0 */
    private C23528a f65820c0;

    /* renamed from: d0 */
    private final InterfaceC24854k f65821d0;

    /* renamed from: e0 */
    private final InterfaceC24854k f65822e0;

    /* renamed from: f0 */
    private Runnable f65823f0;

    /* renamed from: g0 */
    private Handler f65824g0;

    /* renamed from: h0 */
    private boolean f65825h0;

    /* renamed from: i0 */
    private MyCloudMessageItem f65826i0;

    /* renamed from: j0 */
    private int f65827j0;

    /* renamed from: k0 */
    private BaseMyCloudTabView.AbstractC12510b f65828k0;

    /* renamed from: l0 */
    private InterfaceC27158o2 f65829l0;

    /* renamed from: com.zing.zalo.ui.mycloud.linktab.MyCloudLinkItemView$a */
    /* loaded from: classes6.dex */
    public static final class C12623a extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ boolean f65831m1;

        C12623a(boolean z11) {
            this.f65831m1 = z11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                C21693c c21693c = MyCloudLinkItemView.this.f65809O;
                C21693c c21693c2 = null;
                if (c21693c == null) {
                    AbstractC19074t.m100223u("imvThumb");
                    c21693c = null;
                }
                if (c21693c.m89133b0() != null) {
                    C21693c c21693c3 = MyCloudLinkItemView.this.f65809O;
                    if (c21693c3 == null) {
                        AbstractC19074t.m100223u("imvThumb");
                        c21693c3 = null;
                    }
                    if (AbstractC19074t.m100204b(c21693c3.m89133b0(), str) && c3979l != null) {
                        C3977j c3977j = MyCloudLinkItemView.this.f65819b0;
                        if (c3977j != null) {
                            c3977j.setImageInfo(c3979l, false);
                        }
                        if (this.f65831m1) {
                            C21693c c21693c4 = MyCloudLinkItemView.this.f65809O;
                            if (c21693c4 == null) {
                                AbstractC19074t.m100223u("imvThumb");
                            } else {
                                c21693c2 = c21693c4;
                            }
                            c21693c2.mo111924u1(c3979l.m18839c());
                            return;
                        }
                        C21693c c21693c5 = MyCloudLinkItemView.this.f65809O;
                        if (c21693c5 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                            c21693c5 = null;
                        }
                        c21693c5.mo111924u1(c3979l.m18839c());
                        C21693c c21693c6 = MyCloudLinkItemView.this.f65809O;
                        if (c21693c6 == null) {
                            AbstractC19074t.m100223u("imvThumb");
                        } else {
                            c21693c2 = c21693c6;
                        }
                        c21693c2.m89135c1(new C20518d().m106593j(200L));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.linktab.MyCloudLinkItemView$b */
    /* loaded from: classes6.dex */
    public static final class C12624b extends AbstractC19075u implements InterfaceC18494a {
        C12624b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MyCloudLinkItemView.this.getContext(), AbstractC16803z.btn_radio_on_holo_light);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.linktab.MyCloudLinkItemView$c */
    /* loaded from: classes6.dex */
    public static final class C12625c extends AbstractC19075u implements InterfaceC18494a {
        C12625c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MyCloudLinkItemView.this.getContext(), AbstractC16803z.ic_unchecked_radio_button_header);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCloudLinkItemView(Context context, boolean z11) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f65805K = AbstractC23136l9.m118742r(66.0f);
        this.f65806L = AbstractC23136l9.m118742r(66.0f);
        this.f65807M = AbstractC23136l9.m118742r(12.0f);
        this.f65808N = AbstractC23136l9.m118742r(16.0f);
        m129210a = AbstractC24856m.m129210a(new C12625c());
        this.f65821d0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12624b());
        this.f65822e0 = m129210a2;
        this.f65824g0 = new Handler(Looper.getMainLooper());
        this.f65825h0 = z11;
        m70980m0(context);
    }

    /* renamed from: e0 */
    private final void m70972e0(boolean z11) {
        m70974g0();
        m70978k0();
        m70975h0();
        m70973f0();
        m70976i0(z11);
    }

    /* renamed from: f0 */
    private final void m70973f0() {
        MyCloudMessageItem myCloudMessageItem = this.f65826i0;
        if (myCloudMessageItem == null) {
            return;
        }
        String m94862C4 = myCloudMessageItem.m71033m().m94862C4();
        if (m94862C4 == null) {
            m94862C4 = "";
        }
        String m119788L = C23250w4.m119788L(m94862C4, myCloudMessageItem.m71033m().m94854B4());
        C22126c0 c22126c0 = this.f65812R;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("tvExtraInfo");
            c22126c0 = null;
        }
        c22126c0.m111959G1(m119788L);
    }

    /* renamed from: g0 */
    private final void m70974g0() {
        boolean z11 = false;
        C16719g c16719g = null;
        if (this.f65825h0) {
            C21691a c21691a = this.f65818a0;
            if (c21691a == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a = null;
            }
            c21691a.mo44614b1(0);
            C21693c c21693c = this.f65814T;
            if (c21693c == null) {
                AbstractC19074t.m100223u("btnMenu");
                c21693c = null;
            }
            c21693c.mo44614b1(8);
            C21691a c21691a2 = this.f65818a0;
            if (c21691a2 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a2 = null;
            }
            MyCloudMessageItem myCloudMessageItem = this.f65826i0;
            if (myCloudMessageItem != null) {
                z11 = myCloudMessageItem.m71022f();
            }
            c21691a2.mo89091D0(z11);
            C16716d c16716d = this.f65810P;
            if (c16716d == null) {
                AbstractC19074t.m100223u("layoutInfoLink");
                c16716d = null;
            }
            C16718f m89106L = c16716d.m89106L();
            C21691a c21691a3 = this.f65818a0;
            if (c21691a3 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
            } else {
                c16719g = c21691a3;
            }
            m89106L.m89049e0(c16719g);
            return;
        }
        C21691a c21691a4 = this.f65818a0;
        if (c21691a4 == null) {
            AbstractC19074t.m100223u("checkBoxModule");
            c21691a4 = null;
        }
        c21691a4.mo44614b1(8);
        C21693c c21693c2 = this.f65814T;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("btnMenu");
            c21693c2 = null;
        }
        c21693c2.mo44614b1(0);
        C16716d c16716d2 = this.f65810P;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("layoutInfoLink");
            c16716d2 = null;
        }
        C16718f m89106L2 = c16716d2.m89106L();
        C21693c c21693c3 = this.f65814T;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("btnMenu");
        } else {
            c16719g = c21693c3;
        }
        m89106L2.m89049e0(c16719g);
    }

    private final Drawable getMDrawableChecked() {
        return (Drawable) this.f65822e0.getValue();
    }

    private final Drawable getMDrawableNormal() {
        return (Drawable) this.f65821d0.getValue();
    }

    /* renamed from: h0 */
    private final void m70975h0() {
        MyCloudMessageItem myCloudMessageItem = this.f65826i0;
        if (myCloudMessageItem == null) {
            return;
        }
        C22126c0 c22126c0 = null;
        if (!TextUtils.isEmpty(myCloudMessageItem.m71040w()) && !AbstractC19074t.m100204b(myCloudMessageItem.m71040w().toString(), myCloudMessageItem.m71033m().m95090b5())) {
            C22126c0 c22126c02 = this.f65813S;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("tvSubtitle");
            } else {
                c22126c0 = c22126c02;
            }
            c22126c0.m111959G1(myCloudMessageItem.m71040w());
            return;
        }
        C22126c0 c22126c03 = this.f65813S;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("tvSubtitle");
        } else {
            c22126c0 = c22126c03;
        }
        String m95090b5 = myCloudMessageItem.m71033m().m95090b5();
        if (m95090b5.length() == 0) {
            m95090b5 = "Link";
        }
        c22126c0.m111959G1(m95090b5);
    }

    /* renamed from: i0 */
    private final void m70976i0(boolean z11) {
        String str;
        MyCloudMessageItem myCloudMessageItem = this.f65826i0;
        if (myCloudMessageItem == null) {
            return;
        }
        m70979l0();
        C21693c c21693c = this.f65809O;
        C21693c c21693c2 = null;
        if (c21693c == null) {
            AbstractC19074t.m100223u("imvThumb");
            c21693c = null;
        }
        c21693c.mo111926w1(AbstractC16803z.chat_icloud_default);
        String m95131f5 = myCloudMessageItem.m71033m().m95131f5();
        AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
        if (!TextUtils.isEmpty(m95131f5)) {
            boolean m125696L2 = C23999j.m125696L2(m95131f5, C23278z2.m120126f0());
            C21693c c21693c3 = this.f65809O;
            if (c21693c3 == null) {
                AbstractC19074t.m100223u("imvThumb");
            } else {
                c21693c2 = c21693c3;
            }
            c21693c2.m89129Y0(m95131f5);
            RunnableC31712e runnableC31712e = new Runnable() { // from class: z80.e

                /* renamed from: q */
                public final /* synthetic */ String f145671q;

                /* renamed from: r */
                public final /* synthetic */ boolean f145672r;

                public /* synthetic */ RunnableC31712e(String m95131f52, boolean m125696L22) {
                    r2 = m95131f52;
                    r3 = m125696L22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MyCloudLinkItemView.m70977j0(MyCloudLinkItemView.this, r2, r3);
                }
            };
            if (!m125696L22 && z11) {
                if (C23250w4.f112644a.m119843q()) {
                    runnableC31712e.run();
                    return;
                }
                return;
            }
            runnableC31712e.run();
            return;
        }
        if (!TextUtils.isEmpty(myCloudMessageItem.m71033m().m95090b5())) {
            str = myCloudMessageItem.m71033m().m95090b5();
        } else {
            str = "";
        }
        AbstractC19074t.m100205c(str);
        if (str.length() == 0 && AbstractC19646n0.m103044x1(myCloudMessageItem.m71033m().m95041W4())) {
            String m95019U3 = myCloudMessageItem.m71033m().m95019U3();
            AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
            str = C31944h6.m153548n(m95019U3);
        }
        String m119702a = AbstractC23228u2.m119702a(str);
        AbstractC19074t.m100207e(m119702a, "getDomainName(...)");
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String upperCase = m119702a.toUpperCase(locale);
        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        if (!TextUtils.isEmpty(upperCase)) {
            C21693c c21693c4 = this.f65809O;
            if (c21693c4 == null) {
                AbstractC19074t.m100223u("imvThumb");
            } else {
                c21693c2 = c21693c4;
            }
            c21693c2.mo111925v1(C23250w4.f112644a.m119821H(upperCase, str));
        }
    }

    /* renamed from: j0 */
    public static final void m70977j0(MyCloudLinkItemView myCloudLinkItemView, String str, boolean z11) {
        C23528a c23528a;
        AbstractC19074t.m100208f(myCloudLinkItemView, "this$0");
        AbstractC19074t.m100208f(str, "$thumbUrl");
        C23528a c23528a2 = myCloudLinkItemView.f65820c0;
        if (c23528a2 != null && (c23528a = (C23528a) c23528a2.m123612r(myCloudLinkItemView.f65819b0)) != null) {
        }
    }

    /* renamed from: k0 */
    private final void m70978k0() {
        String str;
        MyCloudMessageItem myCloudMessageItem = this.f65826i0;
        if (myCloudMessageItem == null) {
            return;
        }
        if (!TextUtils.isEmpty(myCloudMessageItem.m71033m().m95090b5())) {
            str = myCloudMessageItem.m71033m().m95090b5();
        } else {
            str = "";
        }
        AbstractC19074t.m100205c(str);
        if (str.length() == 0 && AbstractC19646n0.m103044x1(myCloudMessageItem.m71033m().m95041W4())) {
            String m95019U3 = myCloudMessageItem.m71033m().m95019U3();
            AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
            str = C31944h6.m153548n(m95019U3);
        }
        String m119702a = AbstractC23228u2.m119702a(str);
        AbstractC19074t.m100207e(m119702a, "getDomainName(...)");
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String upperCase = m119702a.toUpperCase(locale);
        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        C22126c0 c22126c0 = this.f65811Q;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c22126c0 = null;
        }
        c22126c0.m111959G1(upperCase);
    }

    /* renamed from: l0 */
    private final void m70979l0() {
        Runnable runnable = this.f65823f0;
        if (runnable != null) {
            this.f65824g0.removeCallbacks(runnable);
            this.f65823f0 = null;
        }
    }

    /* renamed from: m0 */
    private final void m70980m0(Context context) {
        int i11;
        int i12;
        boolean z11;
        mo44090O();
        this.f65820c0 = new C23528a(context);
        this.f65819b0 = new C3977j(context);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89060k0(-1).m89030N(-2).m89044a0(this.f65807M);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f65817W = c16716d;
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89030N(this.f65806L).m89060k0(this.f65805K).m89034R(this.f65808N).m89035S(this.f65808N).m89041Y(1);
        c21693c.m111929z1(5);
        c21693c.mo111926w1(AbstractC16803z.chat_icloud_default);
        c21693c.mo111927x1(AbstractC23136l9.m118742r(6.0f));
        this.f65809O = c21693c;
        C16716d c16716d2 = this.f65817W;
        C16716d c16716d3 = null;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d2 = null;
        }
        C21693c c21693c2 = this.f65809O;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("imvThumb");
            c21693c2 = null;
        }
        c16716d2.m89001g1(c21693c2);
        C21691a c21691a = new C21691a(context);
        C16718f m89106L = c21691a.m89106L();
        Drawable mDrawableNormal = getMDrawableNormal();
        if (mDrawableNormal != null) {
            i11 = mDrawableNormal.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        C16718f m89060k0 = m89106L.m89060k0(i11 + (this.f65808N * 2));
        Drawable mDrawableNormal2 = getMDrawableNormal();
        if (mDrawableNormal2 != null) {
            i12 = mDrawableNormal2.getIntrinsicHeight();
        } else {
            i12 = 0;
        }
        C16718f m89027K = m89060k0.m89030N(i12 + (this.f65808N * 2)).m89041Y(this.f65808N).m89035S(AbstractC23222t7.f112566j).m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89017A(bool);
        c21691a.mo89107L0(null);
        c21691a.m111906k1(getMDrawableNormal());
        c21691a.m111905j1(getMDrawableChecked());
        c21691a.mo89107L0(new C16719g.b() { // from class: z80.a
            public /* synthetic */ C31708a() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.b
            /* renamed from: a */
            public final void mo945a(C16719g c16719g, boolean z12) {
                MyCloudLinkItemView.m70983p0(MyCloudLinkItemView.this, c16719g, z12);
            }
        });
        C16716d c16716d4 = this.f65817W;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d4 = null;
        }
        c16716d4.m89001g1(c21691a);
        if (!this.f65825h0) {
            c21691a.mo44614b1(8);
        } else {
            MyCloudMessageItem myCloudMessageItem = this.f65826i0;
            if (myCloudMessageItem != null) {
                z11 = myCloudMessageItem.m71022f();
            } else {
                z11 = false;
            }
            c21691a.mo89091D0(z11);
        }
        this.f65818a0 = c21691a;
        C21693c c21693c3 = new C21693c(context);
        c21693c3.m89106L().m89030N(-2).m89060k0(-2).m89041Y(this.f65808N).m89027K(true).m89017A(bool);
        c21693c3.m111929z1(5);
        c21693c3.mo111925v1(C27280g.m139660c(context, AbstractC2810d.zds_ic_more_horizontal_solid_24, AbstractC2807a.icon_01));
        c21693c3.mo89109M0(new C16719g.c() { // from class: z80.b
            public /* synthetic */ C31709b() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MyCloudLinkItemView.m70984q0(MyCloudLinkItemView.this, c16719g);
            }
        });
        C16716d c16716d5 = this.f65817W;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d5 = null;
        }
        c16716d5.m89001g1(c21693c3);
        if (this.f65825h0) {
            c21693c3.mo44614b1(8);
        }
        this.f65814T = c21693c3;
        C16716d c16716d6 = new C16716d(context);
        C16718f m89027K2 = c16716d6.m89106L().m89030N(-2).m89060k0(-2).m89027K(true);
        C21693c c21693c4 = this.f65809O;
        if (c21693c4 == null) {
            AbstractC19074t.m100223u("imvThumb");
            c21693c4 = null;
        }
        C16718f m89054h0 = m89027K2.m89054h0(c21693c4);
        C21693c c21693c5 = this.f65814T;
        if (c21693c5 == null) {
            AbstractC19074t.m100223u("btnMenu");
            c21693c5 = null;
        }
        m89054h0.m89049e0(c21693c5);
        if (this.f65825h0) {
            C16718f m89106L2 = c16716d6.m89106L();
            C21691a c21691a2 = this.f65818a0;
            if (c21691a2 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a2 = null;
            }
            m89106L2.m89049e0(c21691a2);
        }
        this.f65810P = c16716d6;
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m89106L().m89060k0(-1).m89030N(-2);
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.mo111965M1(1);
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.LinkColor));
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(10.0f));
        this.f65811Q = c22126c0;
        C16716d c16716d7 = this.f65810P;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("layoutInfoLink");
            c16716d7 = null;
        }
        C22126c0 c22126c02 = this.f65811Q;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c22126c02 = null;
        }
        c16716d7.m89001g1(c22126c02);
        C22126c0 c22126c03 = new C22126c0(context);
        C16718f m89030N = c22126c03.m89106L().m89060k0(-1).m89030N(-2);
        C22126c0 c22126c04 = this.f65811Q;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c22126c04 = null;
        }
        m89030N.m89023G(c22126c04);
        c22126c03.m111953A1(2);
        c22126c03.m111980v1(truncateAt);
        c22126c03.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        c22126c03.mo111964L1(AbstractC23136l9.m118742r(15.0f));
        this.f65813S = c22126c03;
        C16716d c16716d8 = this.f65810P;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("layoutInfoLink");
            c16716d8 = null;
        }
        C22126c0 c22126c05 = this.f65813S;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("tvSubtitle");
            c22126c05 = null;
        }
        c16716d8.m89001g1(c22126c05);
        C22126c0 c22126c06 = new C22126c0(context);
        C16718f m89036T = c22126c06.m89106L().m89060k0(-1).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C22126c0 c22126c07 = this.f65813S;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("tvSubtitle");
            c22126c07 = null;
        }
        m89036T.m89023G(c22126c07);
        c22126c06.m111953A1(1);
        c22126c06.m111980v1(truncateAt);
        c22126c06.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22126c06.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f65812R = c22126c06;
        C16716d c16716d9 = this.f65810P;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("layoutInfoLink");
            c16716d9 = null;
        }
        C22126c0 c22126c08 = this.f65812R;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("tvExtraInfo");
            c22126c08 = null;
        }
        c16716d9.m89001g1(c22126c08);
        C16716d c16716d10 = this.f65817W;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d10 = null;
        }
        C16716d c16716d11 = this.f65810P;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("layoutInfoLink");
            c16716d11 = null;
        }
        c16716d10.m89001g1(c16716d11);
        C16716d c16716d12 = this.f65817W;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d12 = null;
        }
        c16716d12.mo89109M0(new C16719g.c() { // from class: z80.c
            public /* synthetic */ C31710c() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MyCloudLinkItemView.m70981n0(MyCloudLinkItemView.this, c16719g);
            }
        });
        C16716d c16716d13 = this.f65817W;
        if (c16716d13 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d13 = null;
        }
        c16716d13.m89111N0(new C16719g.d() { // from class: z80.d
            public /* synthetic */ C31711d() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                MyCloudLinkItemView.m70982o0(MyCloudLinkItemView.this, c16719g);
            }
        });
        C16716d c16716d14 = this.f65817W;
        if (c16716d14 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d14 = null;
        }
        mo69681L(c16716d14);
        C16719g c16719g = new C16719g(context);
        C16718f m89034R = c16719g.m89106L().m89030N(1).m89060k0(-1).m89034R(AbstractC23136l9.m118742r(98.0f));
        C16716d c16716d15 = this.f65817W;
        if (c16716d15 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d15 = null;
        }
        m89034R.m89023G(c16716d15);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        mo69681L(c16719g);
        this.f65815U = c16719g;
        C16719g c16719g2 = new C16719g(context);
        C16718f m89060k02 = c16719g2.m89106L().m89030N(AbstractC23222t7.f112566j).m89060k0(-1);
        C16716d c16716d16 = this.f65817W;
        if (c16716d16 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
            c16716d16 = null;
        }
        m89060k02.m89023G(c16716d16);
        c16719g2.mo44614b1(8);
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
        this.f65816V = c16719g2;
        mo69681L(c16719g2);
        C16716d c16716d17 = this.f65817W;
        if (c16716d17 == null) {
            AbstractC19074t.m100223u("layoutContainerLink");
        } else {
            c16716d3 = c16716d17;
        }
        c16716d3.m89106L().m89042Z(0, AbstractC23222t7.f112572m, 0, AbstractC23222t7.f112576o);
    }

    /* renamed from: n0 */
    public static final void m70981n0(MyCloudLinkItemView myCloudLinkItemView, C16719g c16719g) {
        String str;
        AbstractC19074t.m100208f(myCloudLinkItemView, "this$0");
        if (myCloudLinkItemView.f65825h0) {
            C21691a c21691a = myCloudLinkItemView.f65818a0;
            C21691a c21691a2 = null;
            if (c21691a == null) {
                AbstractC19074t.m100223u("checkBoxModule");
                c21691a = null;
            }
            C21691a c21691a3 = myCloudLinkItemView.f65818a0;
            if (c21691a3 == null) {
                AbstractC19074t.m100223u("checkBoxModule");
            } else {
                c21691a2 = c21691a3;
            }
            c21691a.m111904i1(!c21691a2.m89141i0(), true);
            return;
        }
        MyCloudMessageItem myCloudMessageItem = myCloudLinkItemView.f65826i0;
        if (myCloudMessageItem != null) {
            if (!TextUtils.isEmpty(myCloudMessageItem.m71033m().m95090b5())) {
                str = myCloudMessageItem.m71033m().m95090b5();
            } else if (AbstractC19646n0.m103044x1(myCloudMessageItem.m71033m().m95041W4())) {
                String m95019U3 = myCloudMessageItem.m71033m().m95019U3();
                AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
                str = C31944h6.m153548n(m95019U3);
            } else {
                str = "";
            }
            AbstractC19074t.m100205c(str);
            if (!new C24329j("(?i)^(http://|https://).*").m127018f(str)) {
                str = "https://" + str;
            }
            BaseMyCloudTabView.AbstractC12510b abstractC12510b = myCloudLinkItemView.f65828k0;
            if (abstractC12510b != null) {
                abstractC12510b.mo70395n(myCloudMessageItem.m71033m(), str);
            }
        }
    }

    /* renamed from: o0 */
    public static final void m70982o0(MyCloudLinkItemView myCloudLinkItemView, C16719g c16719g) {
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(myCloudLinkItemView, "this$0");
        MyCloudMessageItem myCloudMessageItem = myCloudLinkItemView.f65826i0;
        if (myCloudMessageItem != null && (interfaceC27158o2 = myCloudLinkItemView.f65829l0) != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem, myCloudLinkItemView.f65827j0, null, 4, null);
        }
    }

    /* renamed from: p0 */
    public static final void m70983p0(MyCloudLinkItemView myCloudLinkItemView, C16719g c16719g, boolean z11) {
        MyCloudMessageItem myCloudMessageItem;
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(myCloudLinkItemView, "this$0");
        MyCloudMessageItem myCloudMessageItem2 = myCloudLinkItemView.f65826i0;
        if ((myCloudMessageItem2 == null || z11 != myCloudMessageItem2.m71022f()) && (myCloudMessageItem = myCloudLinkItemView.f65826i0) != null && (interfaceC27158o2 = myCloudLinkItemView.f65829l0) != null) {
            interfaceC27158o2.mo70518a(myCloudMessageItem, z11);
        }
    }

    /* renamed from: q0 */
    public static final void m70984q0(MyCloudLinkItemView myCloudLinkItemView, C16719g c16719g) {
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        AbstractC19074t.m100208f(myCloudLinkItemView, "this$0");
        MyCloudMessageItem myCloudMessageItem = myCloudLinkItemView.f65826i0;
        if (myCloudMessageItem != null && (abstractC12510b = myCloudLinkItemView.f65828k0) != null) {
            abstractC12510b.mo70396o(myCloudMessageItem);
        }
    }

    /* renamed from: r0 */
    private final void m70985r0(MyCloudMessageItem myCloudMessageItem, int i11, boolean z11) {
        this.f65827j0 = i11;
        this.f65826i0 = myCloudMessageItem;
        this.f65825h0 = z11;
    }

    /* renamed from: d0 */
    public final void m70986d0(MyCloudMessageItem myCloudMessageItem, int i11, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(myCloudMessageItem, "data");
        try {
            m70985r0(myCloudMessageItem, i11, z11);
            m70972e0(z12);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    public final BaseMyCloudTabView.AbstractC12510b getDelegate() {
        return this.f65828k0;
    }

    public final Rect getRectView() {
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            C16716d c16716d = this.f65817W;
            if (c16716d == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d = null;
            }
            int m89114P = c16716d.m89114P() + i11;
            C16716d c16716d2 = this.f65817W;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("layoutContainerLink");
                c16716d2 = null;
            }
            return new Rect(i11, i12, m89114P, c16716d2.m89112O() + i12);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    public final InterfaceC27158o2 getSelectEventListener() {
        return this.f65829l0;
    }

    /* renamed from: s0 */
    public final void m70987s0(boolean z11, boolean z12) {
        int i11;
        C16719g c16719g = this.f65815U;
        C16719g c16719g2 = null;
        if (c16719g == null) {
            AbstractC19074t.m100223u("cline");
            c16719g = null;
        }
        int i12 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c16719g.mo44614b1(i11);
        C16719g c16719g3 = this.f65816V;
        if (c16719g3 == null) {
            AbstractC19074t.m100223u("headerSeparator");
        } else {
            c16719g2 = c16719g3;
        }
        if (z12) {
            i12 = 0;
        }
        c16719g2.mo44614b1(i12);
    }

    public final void setCheckBoModuleState(boolean z11) {
        C21691a c21691a = this.f65818a0;
        if (c21691a == null) {
            AbstractC19074t.m100223u("checkBoxModule");
            c21691a = null;
        }
        c21691a.mo89091D0(z11);
    }

    public final void setDelegate(BaseMyCloudTabView.AbstractC12510b abstractC12510b) {
        this.f65828k0 = abstractC12510b;
    }

    public final void setSelectEventListener(InterfaceC27158o2 interfaceC27158o2) {
        this.f65829l0 = interfaceC27158o2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCloudLinkItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f65805K = AbstractC23136l9.m118742r(66.0f);
        this.f65806L = AbstractC23136l9.m118742r(66.0f);
        this.f65807M = AbstractC23136l9.m118742r(12.0f);
        this.f65808N = AbstractC23136l9.m118742r(16.0f);
        m129210a = AbstractC24856m.m129210a(new C12625c());
        this.f65821d0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12624b());
        this.f65822e0 = m129210a2;
        this.f65824g0 = new Handler(Looper.getMainLooper());
        m70980m0(context);
    }
}

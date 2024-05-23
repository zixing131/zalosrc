package com.zing.zalo.feed.mvp.profile;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import zl0.AbstractC32232i;

/* loaded from: classes4.dex */
public class ProfileSkeletonView extends LinearLayout {

    /* renamed from: A */
    final int f46547A;

    /* renamed from: B */
    final int f46548B;

    /* renamed from: C */
    final int f46549C;

    /* renamed from: D */
    final int f46550D;

    /* renamed from: E */
    final int f46551E;

    /* renamed from: F */
    final int f46552F;

    /* renamed from: G */
    final int f46553G;

    /* renamed from: H */
    final int f46554H;

    /* renamed from: I */
    final int f46555I;

    /* renamed from: J */
    final int f46556J;

    /* renamed from: K */
    final int f46557K;

    /* renamed from: L */
    final int f46558L;

    /* renamed from: M */
    final int f46559M;

    /* renamed from: N */
    final int f46560N;

    /* renamed from: O */
    final int f46561O;

    /* renamed from: P */
    final int f46562P;

    /* renamed from: Q */
    final int f46563Q;

    /* renamed from: R */
    final int f46564R;

    /* renamed from: S */
    final int f46565S;

    /* renamed from: T */
    final int f46566T;

    /* renamed from: U */
    final int f46567U;

    /* renamed from: V */
    final int f46568V;

    /* renamed from: W */
    final int f46569W;

    /* renamed from: a0 */
    final int f46570a0;

    /* renamed from: b0 */
    final int f46571b0;

    /* renamed from: c0 */
    final int f46572c0;

    /* renamed from: d0 */
    final int f46573d0;

    /* renamed from: e0 */
    final int f46574e0;

    /* renamed from: f0 */
    final int f46575f0;

    /* renamed from: g0 */
    final int f46576g0;

    /* renamed from: h0 */
    final int f46577h0;

    /* renamed from: i0 */
    final int f46578i0;

    /* renamed from: j0 */
    final int f46579j0;

    /* renamed from: k0 */
    final int f46580k0;

    /* renamed from: l0 */
    final int f46581l0;

    /* renamed from: m0 */
    final int f46582m0;

    /* renamed from: n0 */
    final int f46583n0;

    /* renamed from: o0 */
    final int f46584o0;

    /* renamed from: p */
    int f46585p;

    /* renamed from: p0 */
    final int f46586p0;

    /* renamed from: q */
    ModulesView f46587q;

    /* renamed from: q0 */
    final int f46588q0;

    /* renamed from: r */
    List f46589r;

    /* renamed from: r0 */
    final int f46590r0;

    /* renamed from: s */
    final int f46591s;

    /* renamed from: s0 */
    boolean f46592s0;

    /* renamed from: t */
    final int f46593t;

    /* renamed from: t0 */
    int f46594t0;

    /* renamed from: u */
    final int f46595u;

    /* renamed from: u0 */
    C16658t0 f46596u0;

    /* renamed from: v */
    final int f46597v;

    /* renamed from: v0 */
    int[] f46598v0;

    /* renamed from: w */
    final int f46599w;

    /* renamed from: w0 */
    RectF f46600w0;

    /* renamed from: x */
    final int f46601x;

    /* renamed from: x0 */
    Matrix f46602x0;

    /* renamed from: y */
    final int f46603y;

    /* renamed from: y0 */
    C16658t0.b f46604y0;

    /* renamed from: z */
    final int f46605z;

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileSkeletonView$a */
    /* loaded from: classes4.dex */
    public class ViewTreeObserverOnPreDrawListenerC8659a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC8659a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int min;
            ProfileSkeletonView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ProfileSkeletonView profileSkeletonView = ProfileSkeletonView.this;
            profileSkeletonView.getLocationOnScreen(profileSkeletonView.f46598v0);
            int i11 = ProfileSkeletonView.this.f46598v0[1];
            int m118713h0 = AbstractC23136l9.m118713h0();
            Iterator it = ProfileSkeletonView.this.f46589r.iterator();
            while (true) {
                int i12 = 0;
                if (!it.hasNext()) {
                    return false;
                }
                C16666v0 c16666v0 = (C16666v0) it.next();
                int m88806g1 = c16666v0.m88806g1();
                int m89098H = c16666v0.m89098H() + i11;
                if (c16666v0.f84500H0 == 1) {
                    min = (int) Math.min(255.0f, (((m89098H * 255) * 1.0f) / m118713h0) + 30.0f);
                } else {
                    min = Math.min(255, ((int) ((1.0f - ((m89098H * 1.0f) / m118713h0)) * 255.0f)) + 30);
                }
                if (min >= 0) {
                    i12 = min;
                }
                c16666v0.m88811l1(Color.argb(i12, Color.red(m88806g1), Color.green(m88806g1), Color.blue(m88806g1)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileSkeletonView$b */
    /* loaded from: classes4.dex */
    public class C8660b implements C16658t0.b {
        C8660b() {
        }

        @Override // com.zing.zalo.uicontrol.C16658t0.b
        /* renamed from: a */
        public void mo44637a(C16658t0 c16658t0, RectF rectF) {
            C16658t0 c16658t02;
            ProfileSkeletonView profileSkeletonView = ProfileSkeletonView.this;
            profileSkeletonView.getLocationOnScreen(profileSkeletonView.f46598v0);
            ProfileSkeletonView.this.f46600w0.setEmpty();
            ProfileSkeletonView.this.f46602x0.reset();
            ProfileSkeletonView profileSkeletonView2 = ProfileSkeletonView.this;
            Matrix matrix = profileSkeletonView2.f46602x0;
            int[] iArr = profileSkeletonView2.f46598v0;
            matrix.setTranslate(-iArr[0], -iArr[1]);
            ProfileSkeletonView profileSkeletonView3 = ProfileSkeletonView.this;
            profileSkeletonView3.f46602x0.mapRect(profileSkeletonView3.f46600w0, rectF);
            for (C16666v0 c16666v0 : ProfileSkeletonView.this.f46589r) {
                ProfileSkeletonView profileSkeletonView4 = ProfileSkeletonView.this;
                c16666v0.m88810k1(profileSkeletonView4.f46600w0, profileSkeletonView4.f46596u0.m88776b());
            }
            if (!AbstractC20826v0.m108836t0(ProfileSkeletonView.this) && (c16658t02 = ProfileSkeletonView.this.f46596u0) != null) {
                c16658t02.m88785k();
            }
        }
    }

    public ProfileSkeletonView(Context context) {
        super(context);
        this.f46585p = 0;
        this.f46589r = new ArrayList();
        this.f46591s = AbstractC32232i.m155453a(16.0f);
        this.f46593t = AbstractC32232i.m155453a(8.0f);
        this.f46595u = AbstractC32232i.m155453a(46.0f);
        this.f46597v = AbstractC32232i.m155453a(19.0f);
        this.f46599w = AbstractC32232i.m155453a(16.0f);
        this.f46601x = AbstractC32232i.m155453a(8.0f);
        this.f46603y = AbstractC32232i.m155453a(61.0f);
        this.f46605z = AbstractC32232i.m155453a(24.0f);
        this.f46547A = AbstractC32232i.m155453a(16.0f);
        this.f46548B = AbstractC32232i.m155453a(12.0f);
        this.f46549C = AbstractC32232i.m155453a(19.0f);
        this.f46550D = AbstractC32232i.m155453a(16.0f);
        this.f46551E = AbstractC32232i.m155453a(10.0f);
        int m155453a = AbstractC32232i.m155453a(148.0f);
        this.f46552F = m155453a;
        this.f46553G = AbstractC32232i.m155453a(93.0f);
        this.f46554H = AbstractC32232i.m155453a(10.0f);
        this.f46555I = AbstractC32232i.m155453a(8.0f);
        this.f46556J = m155453a;
        this.f46557K = AbstractC32232i.m155453a(18.0f);
        this.f46558L = AbstractC32232i.m155453a(6.0f);
        this.f46559M = AbstractC32232i.m155453a(31.0f);
        this.f46560N = AbstractC32232i.m155453a(88.0f);
        this.f46561O = AbstractC32232i.m155453a(24.0f);
        this.f46562P = AbstractC32232i.m155453a(22.0f);
        this.f46563Q = AbstractC32232i.m155453a(15.0f);
        this.f46564R = AbstractC32232i.m155453a(25.0f);
        this.f46565S = AbstractC32232i.m155453a(61.0f);
        this.f46566T = AbstractC32232i.m155453a(12.0f);
        this.f46567U = AbstractC32232i.m155453a(16.0f);
        this.f46568V = AbstractC32232i.m155453a(18.0f);
        this.f46569W = AbstractC32232i.m155453a(3.0f);
        this.f46570a0 = AbstractC32232i.m155453a(20.0f);
        this.f46571b0 = AbstractC32232i.m155453a(3.0f);
        this.f46572c0 = AbstractC32232i.m155453a(88.0f);
        this.f46573d0 = AbstractC32232i.m155453a(88.0f);
        this.f46574e0 = AbstractC32232i.m155453a(8.0f);
        this.f46575f0 = AbstractC32232i.m155453a(220.0f);
        this.f46576g0 = AbstractC32232i.m155453a(28.0f);
        this.f46577h0 = AbstractC32232i.m155453a(150.0f);
        this.f46578i0 = AbstractC32232i.m155453a(16.0f);
        this.f46579j0 = AbstractC23136l9.m118742r(220.0f);
        this.f46580k0 = AbstractC23136l9.m118742r(16.0f);
        this.f46581l0 = AbstractC23136l9.m118742r(18.0f);
        this.f46582m0 = AbstractC23136l9.m118742r(64.0f);
        this.f46583n0 = AbstractC23136l9.m118742r(16.0f);
        this.f46584o0 = AbstractC23136l9.m118742r(24.0f);
        this.f46586p0 = AbstractC23136l9.m118742r(7.0f);
        this.f46588q0 = AbstractC23136l9.m118742r(200.0f);
        this.f46590r0 = AbstractC23136l9.m118742r(80.0f);
        this.f46592s0 = false;
        this.f46598v0 = new int[2];
        this.f46600w0 = new RectF();
        this.f46602x0 = new Matrix();
        this.f46604y0 = new C8660b();
    }

    /* renamed from: a */
    private void m46116a() {
        if (this.f46596u0 == null) {
            this.f46596u0 = new C16658t0(getContext());
            Rect rect = new Rect();
            int m118742r = AbstractC23136l9.m118742r(200.0f);
            this.f46596u0.m88783i(m118742r);
            rect.set((-m118742r) / 2, 0, AbstractC23136l9.m118722k0() + (m118742r / 2), AbstractC23136l9.m118713h0());
            this.f46596u0.m88777c((int) (((m118742r / AbstractC23136l9.m118722k0()) + 1.0f) * 1000), 200);
            this.f46596u0.m88778d(rect);
            this.f46596u0.m88782h(this.f46604y0);
            if (C23212s8.m119602i()) {
                this.f46596u0.m88781g(C23212s8.m119607o(getContext(), AbstractC16781w.ProfilePrimaryBackgroundColor));
            }
        }
    }

    /* renamed from: c */
    private C16716d m46117c(Context context) {
        C16716d c16716d = new C16716d(context);
        C16666v0 c16666v0 = new C16666v0(context);
        c16666v0.m89106L().m89060k0(AbstractC23136l9.m118742r(130.0f)).m89030N(AbstractC23136l9.m118742r(90.0f));
        C16666v0 c16666v02 = new C16666v0(context);
        c16666v02.m89106L().m89060k0(AbstractC23136l9.m118742r(100.0f)).m89030N(AbstractC23136l9.m118742r(15.0f)).m89025I(true).m89023G(c16666v0).m89032P(0, AbstractC23136l9.m118742r(10.0f), 0, 0);
        c16666v02.m88807h1(AbstractC23136l9.m118742r(6.0f));
        C16666v0 c16666v03 = new C16666v0(context);
        c16666v03.m89106L().m89060k0(AbstractC23136l9.m118742r(80.0f)).m89030N(AbstractC23136l9.m118742r(15.0f)).m89025I(true).m89023G(c16666v02).m89032P(0, AbstractC23136l9.m118742r(6.0f), 0, 0);
        c16666v03.m88807h1(AbstractC23136l9.m118742r(6.0f));
        c16716d.m89001g1(c16666v0);
        c16716d.m89001g1(c16666v02);
        c16716d.m89001g1(c16666v03);
        return c16716d;
    }

    /* renamed from: b */
    C16666v0 m46118b() {
        C16666v0 c16666v0 = new C16666v0(getContext());
        if (this.f46592s0) {
            c16666v0.m88811l1(this.f46594t0);
        }
        return c16666v0;
    }

    /* renamed from: d */
    void m46119d() {
        setOrientation(1);
        if (this.f46587q == null) {
            this.f46587q = new ModulesView(getContext());
            addView(this.f46587q, new LinearLayout.LayoutParams(-1, -2));
        }
        this.f46587q.mo44090O();
        switch (this.f46585p) {
            case 1:
                m46122g();
                break;
            case 2:
                m46126k();
                break;
            case 3:
                m46121f(true);
                break;
            case 6:
                m46124i();
                break;
            case 7:
                m46123h();
                break;
            case 8:
                m46125j();
                break;
            case 9:
                m46120e();
                break;
        }
        requestLayout();
        if (this.f46596u0 == null) {
            this.f46596u0 = new C16658t0(getContext());
            Rect rect = new Rect();
            int m118742r = AbstractC23136l9.m118742r(200.0f);
            this.f46596u0.m88783i(m118742r);
            rect.set((-m118742r) / 2, 0, AbstractC23136l9.m118722k0() + (m118742r / 2), AbstractC23136l9.m118713h0());
            this.f46596u0.m88777c((int) (((m118742r / AbstractC23136l9.m118722k0()) + 1.0f) * 1000), 200);
            this.f46596u0.m88778d(rect);
            this.f46596u0.m88782h(this.f46604y0);
        }
        this.f46596u0.mo88784j();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8659a());
        this.f46596u0.m88780f(true);
    }

    /* renamed from: e */
    void m46120e() {
        int i11;
        m46116a();
        Context context = getContext();
        C16666v0 c16666v0 = null;
        int i12 = 0;
        while (i12 < 2) {
            C16666v0 c16666v02 = new C16666v0(context);
            C16718f m89054h0 = c16666v02.m89106L().m89060k0(AbstractC23136l9.m118742r(220.0f)).m89030N(AbstractC23136l9.m118742r(48.0f)).m89054h0(c16666v0);
            if (i12 == 0) {
                i11 = AbstractC23136l9.m118742r(30.0f);
            } else {
                i11 = 0;
            }
            m89054h0.m89032P(i11, 0, AbstractC23136l9.m118742r(12.0f), 0);
            c16666v02.m88811l1(C23212s8.m119607o(context, AbstractC16781w.ProfileLineColor));
            c16666v02.m88807h1(AbstractC23136l9.m118742r(8.0f));
            this.f46589r.add(c16666v02);
            i12++;
            c16666v0 = c16666v02;
        }
        this.f46587q.mo69682M(this.f46589r);
    }

    /* renamed from: f */
    void m46121f(boolean z11) {
        int i11;
        int m118742r;
        if (z11) {
            AbstractC32232i.m155453a(16.0f);
            int m155453a = AbstractC32232i.m155453a(24.0f);
            C16666v0 m46118b = m46118b();
            m46118b.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(280.0f)).m89036T(m155453a);
            m46118b.m88807h1(AbstractC23136l9.m118742r(0.0f));
            this.f46587q.mo69681L(m46118b);
            C16666v0 m46118b2 = m46118b();
            m46118b2.m89106L().m89060k0(this.f46575f0).m89030N(this.f46576g0).m89023G(m46118b).m89026J(true).m89036T(AbstractC23136l9.m118742r(25.0f));
            m46118b2.m88807h1(AbstractC23136l9.m118742r(6.0f));
            this.f46589r.add(m46118b2);
            this.f46587q.mo69681L(m46118b2);
            C16666v0 m46118b3 = m46118b();
            m46118b3.m89106L().m89060k0(this.f46577h0).m89030N(this.f46578i0).m89023G(m46118b2).m89036T(AbstractC32232i.m155453a(8.0f)).m89026J(true);
            m46118b3.m88807h1(AbstractC23136l9.m118742r(6.0f));
            this.f46589r.add(m46118b3);
            this.f46587q.mo69681L(m46118b3);
            int i12 = 0;
            while (i12 < 2) {
                C16666v0 m46118b4 = m46118b();
                C16718f m89023G = m46118b4.m89106L().m89060k0(this.f46579j0).m89030N(this.f46580k0).m89023G(m46118b3);
                if (i12 == 0) {
                    m118742r = AbstractC23136l9.m118742r(32.0f);
                } else {
                    m118742r = AbstractC23136l9.m118742r(8.0f);
                }
                m89023G.m89036T(m118742r).m89026J(true);
                m46118b4.m88807h1(AbstractC23136l9.m118742r(6.0f));
                this.f46589r.add(m46118b4);
                this.f46587q.mo69681L(m46118b4);
                i12++;
                m46118b3 = m46118b4;
            }
        }
        int m118722k0 = (int) (((AbstractC23136l9.m118722k0() * 1.0f) / 320.0f) * 2.0f);
        int m118722k02 = (int) (((AbstractC23136l9.m118722k0() - (2 * m118722k0)) * 1.0f) / 3);
        List list = this.f46589r;
        C16719g c16719g = (C16719g) list.get(list.size() - 1);
        c16719g.m89106L().m89033Q(AbstractC32232i.m155453a(80.0f));
        int i13 = 0;
        while (i13 < 2) {
            C16719g c16719g2 = null;
            C16719g c16719g3 = null;
            int i14 = 0;
            while (i14 < 3) {
                C16666v0 m46118b5 = m46118b();
                C16718f m89054h0 = m46118b5.m89106L().m89060k0(m118722k02).m89030N(m118722k02).m89023G(c16719g).m89054h0(c16719g3);
                if (c16719g3 != null) {
                    i11 = m118722k0;
                } else {
                    i11 = 0;
                }
                m89054h0.m89032P(i11, 0, 0, m118722k0);
                m46118b5.m88807h1(0.0f);
                this.f46587q.mo69681L(m46118b5);
                if (i14 == 0) {
                    c16719g2 = m46118b5;
                }
                i14++;
                c16719g3 = m46118b5;
            }
            i13++;
            c16719g = c16719g2;
        }
    }

    /* renamed from: g */
    void m46122g() {
        int i11;
        Context context = getContext();
        C16666v0 c16666v0 = new C16666v0(context);
        c16666v0.m89106L().m89060k0(this.f46603y).m89030N(this.f46605z).m89032P(this.f46591s, this.f46547A, 0, this.f46548B);
        c16666v0.m88807h1(this.f46593t);
        this.f46589r.add(c16666v0);
        int m118722k0 = ((int) ((AbstractC23136l9.m118722k0() * 1.0f) / this.f46552F)) + 1;
        C16666v0 c16666v02 = null;
        int i12 = 0;
        while (i12 < m118722k0) {
            if (c16666v02 == null) {
                i11 = this.f46550D;
            } else {
                i11 = this.f46554H;
            }
            C16666v0 c16666v03 = new C16666v0(context);
            c16666v03.m89106L().m89060k0(this.f46552F).m89030N(this.f46553G).m89023G(c16666v0).m89054h0(c16666v02).m89032P(i11, 0, 0, this.f46551E);
            int i13 = this.f46555I;
            c16666v03.m88808i1(i13, i13, 0.0f, 0.0f);
            this.f46589r.add(c16666v03);
            C16666v0 c16666v04 = new C16666v0(context);
            c16666v04.m89106L().m89060k0(this.f46556J).m89030N(this.f46557K).m89023G(c16666v03).m89071x(c16666v03).m89032P(0, 0, 0, AbstractC23136l9.m118742r(4.0f));
            c16666v04.m88807h1(this.f46558L);
            this.f46589r.add(c16666v04);
            C16666v0 c16666v05 = new C16666v0(context);
            c16666v05.m89106L().m89060k0((this.f46556J * 3) / 4).m89030N(this.f46557K).m89023G(c16666v04).m89071x(c16666v03).m89032P(0, 0, 0, this.f46559M);
            c16666v05.m88807h1(this.f46558L);
            this.f46589r.add(c16666v05);
            i12++;
            c16666v02 = c16666v03;
        }
        this.f46587q.mo69682M(this.f46589r);
    }

    /* renamed from: h */
    void m46123h() {
        Context context = getContext();
        ArrayList<C16716d> arrayList = new ArrayList();
        int m118713h0 = (AbstractC23136l9.m118713h0() / AbstractC23136l9.m118742r(150.0f)) + 1;
        C16716d c16716d = null;
        int i11 = 0;
        while (i11 < m118713h0) {
            C16716d m46117c = m46117c(context);
            m46117c.m89106L().m89060k0(-2).m89030N(-2).m89023G(c16716d).m89032P(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(20.0f), 0, 0);
            C16716d m46117c2 = m46117c(context);
            m46117c2.m89106L().m89060k0(-2).m89030N(-2).m89054h0(m46117c).m89020D(m46117c).m89032P(AbstractC23136l9.m118742r(24.0f), 0, AbstractC23136l9.m118742r(16.0f), 0);
            arrayList.add(m46117c);
            arrayList.add(m46117c2);
            i11++;
            c16716d = m46117c;
        }
        for (C16716d c16716d2 : arrayList) {
            for (int i12 = 0; i12 < c16716d2.m89005l1(); i12++) {
                C16719g m89004k1 = c16716d2.m89004k1(i12);
                if (m89004k1 instanceof C16666v0) {
                    this.f46589r.add((C16666v0) m89004k1);
                }
            }
        }
        this.f46587q.mo69682M(arrayList);
    }

    /* renamed from: i */
    void m46124i() {
        Context context = getContext();
        int m119607o = C23212s8.m119607o(context, AbstractC16781w.ProfileLineColor);
        C16666v0 c16666v0 = null;
        int i11 = 0;
        while (i11 < 6) {
            C16666v0 c16666v02 = new C16666v0(context);
            C16718f m89030N = c16666v02.m89106L().m89060k0(this.f46582m0).m89030N(this.f46582m0);
            int i12 = this.f46583n0;
            int i13 = this.f46586p0;
            m89030N.m89032P(i12, i13, this.f46584o0, i13).m89023G(c16666v0);
            c16666v02.m88807h1(AbstractC23136l9.m118742r(8.0f));
            c16666v02.m88811l1(m119607o);
            this.f46589r.add(c16666v02);
            C16666v0 c16666v03 = new C16666v0(context);
            C16718f m89030N2 = c16666v03.m89106L().m89060k0(this.f46588q0).m89030N(this.f46581l0);
            int i14 = this.f46586p0;
            m89030N2.m89032P(0, i14, 0, i14).m89054h0(c16666v02).m89020D(c16666v02);
            c16666v03.m88807h1(AbstractC23136l9.m118742r(6.0f));
            c16666v03.m88811l1(m119607o);
            this.f46589r.add(c16666v03);
            C16666v0 c16666v04 = new C16666v0(context);
            C16718f m89030N3 = c16666v04.m89106L().m89060k0(this.f46590r0).m89030N(this.f46581l0);
            int i15 = this.f46586p0;
            m89030N3.m89032P(0, i15, 0, i15).m89054h0(c16666v02).m89023G(c16666v03);
            c16666v04.m88807h1(AbstractC23136l9.m118742r(6.0f));
            c16666v04.m88811l1(m119607o);
            this.f46589r.add(c16666v04);
            i11++;
            c16666v0 = c16666v02;
        }
        this.f46587q.mo69682M(this.f46589r);
    }

    /* renamed from: j */
    void m46125j() {
        Context context = getContext();
        int m119607o = C23212s8.m119607o(context, AbstractC16781w.ProfileLineColor);
        C16666v0 c16666v0 = null;
        int i11 = 0;
        while (i11 < 4) {
            C16666v0 c16666v02 = new C16666v0(context);
            C16718f m89030N = c16666v02.m89106L().m89060k0(this.f46582m0).m89030N(this.f46582m0);
            int i12 = this.f46583n0;
            int i13 = this.f46586p0;
            m89030N.m89032P(i12, i13, this.f46584o0, i13).m89023G(c16666v0);
            c16666v02.m88807h1(AbstractC23136l9.m118742r(8.0f));
            c16666v02.m88811l1(m119607o);
            this.f46589r.add(c16666v02);
            C16666v0 c16666v03 = new C16666v0(context);
            C16718f m89030N2 = c16666v03.m89106L().m89060k0(this.f46588q0).m89030N(this.f46581l0);
            int i14 = this.f46586p0;
            m89030N2.m89032P(0, i14, 0, i14).m89054h0(c16666v02).m89020D(c16666v02);
            c16666v03.m88807h1(AbstractC23136l9.m118742r(6.0f));
            c16666v03.m88811l1(m119607o);
            this.f46589r.add(c16666v03);
            C16666v0 c16666v04 = new C16666v0(context);
            C16718f m89030N3 = c16666v04.m89106L().m89060k0(this.f46590r0).m89030N(this.f46581l0);
            int i15 = this.f46586p0;
            m89030N3.m89032P(0, i15, 0, i15).m89054h0(c16666v02).m89023G(c16666v03);
            c16666v04.m88807h1(AbstractC23136l9.m118742r(6.0f));
            c16666v04.m88811l1(m119607o);
            this.f46589r.add(c16666v04);
            i11++;
            c16666v0 = c16666v02;
        }
        this.f46587q.mo69682M(this.f46589r);
    }

    /* renamed from: k */
    void m46126k() {
        int i11;
        Context context = getContext();
        C16666v0 c16666v0 = new C16666v0(context);
        c16666v0.m89106L().m89060k0(this.f46560N).m89030N(this.f46561O).m89032P(this.f46591s, this.f46562P, 0, this.f46563Q);
        c16666v0.m88807h1(this.f46593t);
        this.f46589r.add(c16666v0);
        int m118722k0 = ((int) ((AbstractC23136l9.m118722k0() * 1.0f) / this.f46572c0)) + 1;
        for (int i12 = 0; i12 < 3; i12++) {
            C16666v0 c16666v02 = new C16666v0(context);
            c16666v02.m89106L().m89060k0(this.f46565S).m89030N(this.f46566T).m89023G(c16666v0).m89032P(this.f46567U, 0, 0, this.f46568V);
            c16666v02.m88807h1(this.f46569W);
            this.f46589r.add(c16666v02);
            C16666v0 c16666v03 = null;
            int i13 = 0;
            while (i13 < m118722k0) {
                C16666v0 c16666v04 = new C16666v0(context);
                C16718f m89054h0 = c16666v04.m89106L().m89060k0(this.f46572c0).m89030N(this.f46573d0).m89023G(c16666v02).m89054h0(c16666v03);
                if (c16666v03 != null) {
                    i11 = this.f46571b0;
                } else {
                    i11 = 0;
                }
                m89054h0.m89032P(i11, 0, 0, this.f46570a0);
                c16666v04.m88807h1(this.f46574e0);
                this.f46589r.add(c16666v04);
                if (i13 == 0) {
                    c16666v0 = c16666v04;
                }
                i13++;
                c16666v03 = c16666v04;
            }
        }
        this.f46587q.mo69682M(this.f46589r);
    }

    /* renamed from: l */
    void m46127l() {
        this.f46587q = null;
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16658t0 c16658t0 = this.f46596u0;
        if (c16658t0 != null) {
            c16658t0.mo88784j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16658t0 c16658t0 = this.f46596u0;
        if (c16658t0 != null) {
            c16658t0.m88785k();
        }
    }

    public void setColorModule(int i11) {
        this.f46594t0 = i11;
        this.f46592s0 = true;
    }

    public void setSkeletonLayoutType(int i11) {
        if (this.f46585p != i11) {
            this.f46585p = i11;
            m46127l();
            m46119d();
        }
    }

    public ProfileSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46585p = 0;
        this.f46589r = new ArrayList();
        this.f46591s = AbstractC32232i.m155453a(16.0f);
        this.f46593t = AbstractC32232i.m155453a(8.0f);
        this.f46595u = AbstractC32232i.m155453a(46.0f);
        this.f46597v = AbstractC32232i.m155453a(19.0f);
        this.f46599w = AbstractC32232i.m155453a(16.0f);
        this.f46601x = AbstractC32232i.m155453a(8.0f);
        this.f46603y = AbstractC32232i.m155453a(61.0f);
        this.f46605z = AbstractC32232i.m155453a(24.0f);
        this.f46547A = AbstractC32232i.m155453a(16.0f);
        this.f46548B = AbstractC32232i.m155453a(12.0f);
        this.f46549C = AbstractC32232i.m155453a(19.0f);
        this.f46550D = AbstractC32232i.m155453a(16.0f);
        this.f46551E = AbstractC32232i.m155453a(10.0f);
        int m155453a = AbstractC32232i.m155453a(148.0f);
        this.f46552F = m155453a;
        this.f46553G = AbstractC32232i.m155453a(93.0f);
        this.f46554H = AbstractC32232i.m155453a(10.0f);
        this.f46555I = AbstractC32232i.m155453a(8.0f);
        this.f46556J = m155453a;
        this.f46557K = AbstractC32232i.m155453a(18.0f);
        this.f46558L = AbstractC32232i.m155453a(6.0f);
        this.f46559M = AbstractC32232i.m155453a(31.0f);
        this.f46560N = AbstractC32232i.m155453a(88.0f);
        this.f46561O = AbstractC32232i.m155453a(24.0f);
        this.f46562P = AbstractC32232i.m155453a(22.0f);
        this.f46563Q = AbstractC32232i.m155453a(15.0f);
        this.f46564R = AbstractC32232i.m155453a(25.0f);
        this.f46565S = AbstractC32232i.m155453a(61.0f);
        this.f46566T = AbstractC32232i.m155453a(12.0f);
        this.f46567U = AbstractC32232i.m155453a(16.0f);
        this.f46568V = AbstractC32232i.m155453a(18.0f);
        this.f46569W = AbstractC32232i.m155453a(3.0f);
        this.f46570a0 = AbstractC32232i.m155453a(20.0f);
        this.f46571b0 = AbstractC32232i.m155453a(3.0f);
        this.f46572c0 = AbstractC32232i.m155453a(88.0f);
        this.f46573d0 = AbstractC32232i.m155453a(88.0f);
        this.f46574e0 = AbstractC32232i.m155453a(8.0f);
        this.f46575f0 = AbstractC32232i.m155453a(220.0f);
        this.f46576g0 = AbstractC32232i.m155453a(28.0f);
        this.f46577h0 = AbstractC32232i.m155453a(150.0f);
        this.f46578i0 = AbstractC32232i.m155453a(16.0f);
        this.f46579j0 = AbstractC23136l9.m118742r(220.0f);
        this.f46580k0 = AbstractC23136l9.m118742r(16.0f);
        this.f46581l0 = AbstractC23136l9.m118742r(18.0f);
        this.f46582m0 = AbstractC23136l9.m118742r(64.0f);
        this.f46583n0 = AbstractC23136l9.m118742r(16.0f);
        this.f46584o0 = AbstractC23136l9.m118742r(24.0f);
        this.f46586p0 = AbstractC23136l9.m118742r(7.0f);
        this.f46588q0 = AbstractC23136l9.m118742r(200.0f);
        this.f46590r0 = AbstractC23136l9.m118742r(80.0f);
        this.f46592s0 = false;
        this.f46598v0 = new int[2];
        this.f46600w0 = new RectF();
        this.f46602x0 = new Matrix();
        this.f46604y0 = new C8660b();
    }
}

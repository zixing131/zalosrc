package com.zing.zalo.p077ui.zviews;

import ac.C0708i;
import ac.C0732w;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.AbstractC1388a;
import au.C2343e;
import bi0.AbstractC2807a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.p077ui.widget.C13658k;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.custom.DrawableCallbackView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23028c0;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23144m6;
import me0.AbstractC23160o0;
import me0.C23212s8;
import me0.C23278z2;
import p055ce.C3433b;
import p055ce.C3442k;
import p142ey.C18644n;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C32006l8;
import t00.C26446c;
import tc0.C26628a;
import vg.C28194t6;

/* loaded from: classes6.dex */
public class ProfileCardView extends DrawableCallbackView implements View.OnTouchListener, C28194t6.f {

    /* renamed from: A */
    int f76295A;

    /* renamed from: A0 */
    int f76296A0;

    /* renamed from: A1 */
    ColorStateList f76297A1;

    /* renamed from: B */
    int f76298B;

    /* renamed from: B0 */
    int f76299B0;

    /* renamed from: B1 */
    String f76300B1;

    /* renamed from: C */
    int f76301C;

    /* renamed from: C0 */
    int f76302C0;

    /* renamed from: C1 */
    C3977j f76303C1;

    /* renamed from: D */
    int f76304D;

    /* renamed from: D0 */
    int f76305D0;

    /* renamed from: D1 */
    C3977j f76306D1;

    /* renamed from: E */
    int f76307E;

    /* renamed from: E0 */
    int f76308E0;

    /* renamed from: E1 */
    C3977j[] f76309E1;

    /* renamed from: F */
    int f76310F;

    /* renamed from: F0 */
    StaticLayout f76311F0;

    /* renamed from: F1 */
    ArrayList f76312F1;

    /* renamed from: G */
    int f76313G;

    /* renamed from: G0 */
    StaticLayout f76314G0;

    /* renamed from: G1 */
    boolean f76315G1;

    /* renamed from: H */
    int f76316H;

    /* renamed from: H0 */
    StaticLayout f76317H0;

    /* renamed from: H1 */
    boolean f76318H1;

    /* renamed from: I */
    int f76319I;

    /* renamed from: I0 */
    StaticLayout f76320I0;

    /* renamed from: I1 */
    Map f76321I1;

    /* renamed from: J */
    int f76322J;

    /* renamed from: J0 */
    StaticLayout f76323J0;

    /* renamed from: J1 */
    C13697o f76324J1;

    /* renamed from: K */
    int f76325K;

    /* renamed from: K0 */
    StaticLayout f76326K0;

    /* renamed from: K1 */
    C26628a f76327K1;

    /* renamed from: L */
    int f76328L;

    /* renamed from: L0 */
    StaticLayout f76329L0;

    /* renamed from: L1 */
    Rect f76330L1;

    /* renamed from: M */
    int f76331M;

    /* renamed from: M0 */
    StaticLayout f76332M0;

    /* renamed from: M1 */
    int f76333M1;

    /* renamed from: N */
    int f76334N;

    /* renamed from: N0 */
    Paint f76335N0;

    /* renamed from: N1 */
    int f76336N1;

    /* renamed from: O */
    int f76337O;

    /* renamed from: O0 */
    Paint f76338O0;

    /* renamed from: O1 */
    EnumC14800c f76339O1;

    /* renamed from: P */
    int f76340P;

    /* renamed from: P0 */
    Paint f76341P0;

    /* renamed from: P1 */
    float f76342P1;

    /* renamed from: Q */
    int f76343Q;

    /* renamed from: Q0 */
    Paint f76344Q0;

    /* renamed from: Q1 */
    float f76345Q1;

    /* renamed from: R */
    int f76346R;

    /* renamed from: R0 */
    Paint f76347R0;

    /* renamed from: R1 */
    boolean f76348R1;

    /* renamed from: S */
    int f76349S;

    /* renamed from: S0 */
    Rect f76350S0;

    /* renamed from: S1 */
    VelocityTracker f76351S1;

    /* renamed from: T */
    int f76352T;

    /* renamed from: T0 */
    Rect f76353T0;

    /* renamed from: U */
    int f76354U;

    /* renamed from: U0 */
    Rect f76355U0;

    /* renamed from: V */
    int f76356V;

    /* renamed from: V0 */
    Rect f76357V0;

    /* renamed from: W */
    int f76358W;

    /* renamed from: W0 */
    Rect f76359W0;

    /* renamed from: X0 */
    Rect f76360X0;

    /* renamed from: Y0 */
    InterfaceC14801d f76361Y0;

    /* renamed from: Z0 */
    ViewConfiguration f76362Z0;

    /* renamed from: a0 */
    int f76363a0;

    /* renamed from: a1 */
    C32006l8 f76364a1;

    /* renamed from: b0 */
    int f76365b0;

    /* renamed from: b1 */
    Handler f76366b1;

    /* renamed from: c0 */
    int f76367c0;

    /* renamed from: c1 */
    boolean f76368c1;

    /* renamed from: d0 */
    int f76369d0;

    /* renamed from: d1 */
    C13704p1 f76370d1;

    /* renamed from: e0 */
    int f76371e0;

    /* renamed from: e1 */
    C13704p1 f76372e1;

    /* renamed from: f0 */
    int f76373f0;

    /* renamed from: f1 */
    C13704p1 f76374f1;

    /* renamed from: g0 */
    int f76375g0;

    /* renamed from: g1 */
    C13704p1 f76376g1;

    /* renamed from: h0 */
    int f76377h0;

    /* renamed from: h1 */
    C13704p1 f76378h1;

    /* renamed from: i0 */
    int f76379i0;

    /* renamed from: i1 */
    C13704p1 f76380i1;

    /* renamed from: j0 */
    int f76381j0;

    /* renamed from: j1 */
    C13704p1 f76382j1;

    /* renamed from: k0 */
    int f76383k0;

    /* renamed from: k1 */
    C13704p1 f76384k1;

    /* renamed from: l0 */
    int f76385l0;

    /* renamed from: l1 */
    Paint f76386l1;

    /* renamed from: m0 */
    int f76387m0;

    /* renamed from: m1 */
    Bitmap f76388m1;

    /* renamed from: n0 */
    int f76389n0;

    /* renamed from: n1 */
    Drawable f76390n1;

    /* renamed from: o0 */
    int f76391o0;

    /* renamed from: o1 */
    Bitmap f76392o1;

    /* renamed from: p0 */
    int f76393p0;

    /* renamed from: p1 */
    Drawable f76394p1;

    /* renamed from: q */
    final String f76395q;

    /* renamed from: q0 */
    int f76396q0;

    /* renamed from: q1 */
    Drawable f76397q1;

    /* renamed from: r */
    int f76398r;

    /* renamed from: r0 */
    int f76399r0;

    /* renamed from: r1 */
    Drawable f76400r1;

    /* renamed from: s */
    int f76401s;

    /* renamed from: s0 */
    int f76402s0;

    /* renamed from: s1 */
    RectF f76403s1;

    /* renamed from: t */
    int f76404t;

    /* renamed from: t0 */
    int f76405t0;

    /* renamed from: t1 */
    C23528a f76406t1;

    /* renamed from: u */
    int f76407u;

    /* renamed from: u0 */
    int f76408u0;

    /* renamed from: u1 */
    Rect f76409u1;

    /* renamed from: v */
    int f76410v;

    /* renamed from: v0 */
    int f76411v0;

    /* renamed from: v1 */
    Rect f76412v1;

    /* renamed from: w */
    int f76413w;

    /* renamed from: w0 */
    int f76414w0;

    /* renamed from: w1 */
    Drawable f76415w1;

    /* renamed from: x */
    int f76416x;

    /* renamed from: x0 */
    int f76417x0;

    /* renamed from: x1 */
    Drawable f76418x1;

    /* renamed from: y */
    int f76419y;

    /* renamed from: y0 */
    int f76420y0;

    /* renamed from: y1 */
    Drawable f76421y1;

    /* renamed from: z */
    int f76422z;

    /* renamed from: z0 */
    float f76423z0;

    /* renamed from: z1 */
    ColorStateList f76424z1;

    /* renamed from: com.zing.zalo.ui.zviews.ProfileCardView$a */
    /* loaded from: classes6.dex */
    public class C14798a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ int f76425l1;

        /* renamed from: m1 */
        final /* synthetic */ InterfaceC3968a f76426m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f76427n1;

        C14798a(int i11, InterfaceC3968a interfaceC3968a, boolean z11) {
            this.f76425l1 = i11;
            this.f76426m1 = interfaceC3968a;
            this.f76427n1 = z11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                if (!ProfileCardView.this.m83022e(str, this.f76425l1)) {
                    return;
                }
                InterfaceC3968a interfaceC3968a2 = this.f76426m1;
                if (interfaceC3968a2 != null) {
                    interfaceC3968a2.setImageInfo(c3979l, false);
                }
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                        ProfileCardView.this.m83038z(m18839c, true ^ this.f76427n1, this.f76425l1, str);
                        ProfileCardView.this.invalidate();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfileCardView$b */
    /* loaded from: classes6.dex */
    public class C14799b extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ int f76429p;

        /* renamed from: q */
        final /* synthetic */ int f76430q;

        C14799b(int i11, int i12) {
            this.f76429p = i11;
            this.f76430q = i12;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            Rect rect = new Rect(ProfileCardView.this.m83027k(this.f76429p, this.f76430q));
            rect.offset(0, AbstractC23136l9.m118740q0(ProfileCardView.this.getContext()));
            return rect;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.ProfileCardView$c */
    /* loaded from: classes6.dex */
    public enum EnumC14800c {
        TOP,
        PHOTO,
        BUTTON_LEFT,
        BUTTON_RIGHT,
        REMOVEIC,
        NONE
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfileCardView$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC14801d {
        /* renamed from: I3 */
        void mo36283I3(C32006l8 c32006l8);

        /* renamed from: a */
        void mo36284a(C32006l8 c32006l8);

        /* renamed from: b */
        void mo36285b(C32006l8 c32006l8);

        /* renamed from: c */
        void mo36286c(View view, List list, int i11, AnimationTarget animationTarget);

        /* renamed from: d */
        void mo36287d(C32006l8 c32006l8, int i11);

        /* renamed from: d3 */
        void mo36288d3(int i11);

        /* renamed from: t4 */
        void mo36289t4(C32006l8 c32006l8);
    }

    public ProfileCardView(Context context, int i11, int i12) {
        super(context);
        this.f76395q = ProfileCardView.class.getSimpleName();
        this.f76354U = 0;
        this.f76423z0 = 150.0f;
        this.f76296A0 = AbstractC23136l9.m118742r(30.0f);
        this.f76305D0 = 3;
        this.f76308E0 = 4;
        this.f76368c1 = false;
        this.f76300B1 = "";
        this.f76303C1 = new C3977j(MainApplication.getAppContext());
        this.f76306D1 = new C3977j(MainApplication.getAppContext());
        this.f76312F1 = new ArrayList();
        this.f76315G1 = false;
        this.f76318H1 = false;
        this.f76321I1 = new HashMap();
        this.f76330L1 = new Rect();
        this.f76333M1 = 0;
        this.f76336N1 = 2;
        this.f76339O1 = EnumC14800c.NONE;
        this.f76348R1 = false;
        m83031q(context, i11, i12);
    }

    /* renamed from: w */
    public /* synthetic */ void m83014w(String str, int i11, C32006l8 c32006l8) {
        try {
            if (TextUtils.equals(str, this.f76364a1.f147278e) && i11 == 0 && c32006l8 != null) {
                this.f76315G1 = true;
                AbstractC23144m6.m118823d(this.f76364a1, c32006l8);
                m83019b(this.f76364a1);
                InterfaceC14801d interfaceC14801d = this.f76361Y0;
                if (interfaceC14801d != null) {
                    interfaceC14801d.mo36289t4(this.f76364a1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: A */
    public void m83015A(C32006l8 c32006l8, boolean z11) {
        if (c32006l8 == null) {
            return;
        }
        try {
            this.f76364a1 = c32006l8;
            C28194t6.m141765b().m141767c(this.f76364a1, this);
            this.f76368c1 = z11;
            m83019b(this.f76364a1);
            setOnTouchListener(this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    boolean m83016B(int i11, int i12) {
        try {
            if (this.f76312F1 != null) {
                for (int i13 = 0; i13 < this.f76312F1.size(); i13++) {
                    if (((Rect) this.f76312F1.get(i13)).contains(i11, i12)) {
                        return true;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: C */
    void m83017C(int i11) {
        if (i11 > 0) {
            try {
                this.f76367c0 = (this.f76398r - ((this.f76381j0 * i11) + (this.f76373f0 * (i11 - 1)))) / 2;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: D */
    void m83018D(int i11, int i12) {
        Drawable drawable;
        C13704p1 c13704p1;
        ColorStateList colorStateList;
        if (i11 == 1) {
            drawable = this.f76415w1;
            c13704p1 = this.f76380i1;
            colorStateList = this.f76424z1;
        } else {
            drawable = this.f76418x1;
            c13704p1 = this.f76382j1;
            colorStateList = this.f76297A1;
        }
        if (drawable != null && c13704p1 != null && colorStateList != null) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            drawable.setState(new int[]{R.attr.state_enabled, -16842919});
                            c13704p1.setColor(colorStateList.getDefaultColor());
                            return;
                        } else {
                            drawable.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
                            c13704p1.setColor(colorStateList.getColorForState(new int[]{R.attr.state_enabled, R.attr.state_pressed}, 3));
                            return;
                        }
                    }
                    drawable.setState(new int[]{-16842910});
                    c13704p1.setColor(colorStateList.getColorForState(new int[]{-16842910}, this.f76396q0));
                    return;
                }
                drawable.setState(new int[]{R.attr.state_enabled, -16842919});
                c13704p1.setColor(colorStateList.getDefaultColor());
                return;
            }
            drawable.setState(new int[]{R.attr.state_enabled, -16842919});
            c13704p1.setColor(colorStateList.getDefaultColor());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01df, code lost:            if (android.text.TextUtils.isEmpty(r9) == false) goto L206;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m83019b(C32006l8 c32006l8) {
        String str;
        String str2;
        String str3;
        boolean z11;
        Resources resources;
        int i11;
        int i12;
        String str4;
        int min;
        if (c32006l8 == null) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(c32006l8.f147277d)) {
                m83036x(c32006l8.f147277d, C23278z2.m120132i0(), this.f76303C1, 0);
            }
            if (!TextUtils.isEmpty(c32006l8.f147276c)) {
                if (C23302b.f113247a.m120523d(c32006l8.f147276c) && !CoreUtility.f89233i.equals(c32006l8.f147278e)) {
                    this.f76390n1 = C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(c32006l8.m154302c(true, false)), C2343e.m12307a(c32006l8.f147278e, false));
                } else {
                    m83036x(c32006l8.f147276c, C23278z2.m120143n(), this.f76306D1, 1);
                }
            }
            ArrayList arrayList = c32006l8.f147281h;
            if (arrayList != null && (min = Math.min(arrayList.size(), this.f76375g0)) >= this.f76377h0) {
                m83017C(min);
                for (int i13 = 0; i13 < min; i13++) {
                    C3977j c3977j = this.f76309E1[i13];
                    if (c3977j == null) {
                        c3977j = new C3977j(getContext());
                        this.f76309E1[i13] = c3977j;
                    }
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) c32006l8.f147281h.get(i13);
                    C13658k c13658k = new C13658k(this);
                    c13658k.m76341t(1, this.f76379i0);
                    c13658k.m76343v(false);
                    String m40526m0 = itemAlbumMobile.m40526m0();
                    this.f76321I1.put(m40526m0, c13658k);
                    m83036x(m40526m0, C23278z2.m120136k0(), c3977j, 2);
                }
            }
            String m154302c = c32006l8.m154302c(true, false);
            C13704p1 c13704p1 = this.f76370d1;
            float f11 = this.f76358W;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String charSequence = TextUtils.ellipsize(m154302c, c13704p1, f11, truncateAt).toString();
            C13704p1 c13704p12 = this.f76370d1;
            int i14 = this.f76358W;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            StaticLayout staticLayout = new StaticLayout(charSequence, c13704p12, i14, alignment, 1.0f, 0.0f, false);
            this.f76311F0 = staticLayout;
            this.f76304D = staticLayout.getHeight();
            C3433b m154301b = c32006l8.m154301b();
            String str5 = "";
            if (m154301b == null || !C3442k.f14460a.m17300e(m154301b.m17256i())) {
                str = "";
            } else {
                str = m154301b.m17255h();
            }
            if (TextUtils.isEmpty(str)) {
                this.f76365b0 = 0;
                this.f76363a0 = 0;
                this.f76326K0 = null;
                this.f76313G = 0;
                this.f76307E = 0;
            } else {
                C13704p1 c13704p13 = new C13704p1();
                this.f76384k1 = c13704p13;
                c13704p13.setAntiAlias(true);
                this.f76384k1.setTextSize(this.f76331M);
                this.f76384k1.setColor(C23212s8.m119607o(getContext(), AbstractC2807a.information_text));
                this.f76363a0 = Math.round(this.f76384k1.measureText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_label_business_account)));
                StaticLayout staticLayout2 = new StaticLayout(AbstractC23136l9.m118743r0(AbstractC8020f0.str_label_business_account), this.f76384k1, this.f76363a0, alignment, 1.0f, 0.0f, false);
                this.f76326K0 = staticLayout2;
                this.f76365b0 = (this.f76398r - this.f76363a0) / 2;
                this.f76313G = staticLayout2.getHeight();
                this.f76307E = AbstractC23136l9.m118742r(6.0f);
            }
            if (c32006l8.f147282i > 0) {
                str2 = getResources().getString(AbstractC8020f0.str_optionM_vipInfo);
            } else {
                int i15 = c32006l8.f147294u;
                if (i15 == -1) {
                    str2 = "";
                } else {
                    if (i15 == 0) {
                        resources = getResources();
                        i11 = AbstractC8020f0.str_mini_profile_gender_men;
                    } else {
                        resources = getResources();
                        i11 = AbstractC8020f0.str_mini_profile_gender_women;
                    }
                    str2 = resources.getString(i11);
                }
                if (!c32006l8.f147297x || c32006l8.f147298y != 8) {
                    str3 = "";
                    z11 = false;
                } else {
                    str3 = c32006l8.f147274a;
                    if (TextUtils.equals(str3, c32006l8.m154302c(true, false))) {
                        str3 = "";
                    }
                    z11 = true;
                }
                if (z11) {
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        str2 = String.format(this.f76300B1, str3, str2);
                    } else if (TextUtils.isEmpty(str2)) {
                    }
                } else {
                    str3 = m83028l(c32006l8);
                    if (c32006l8.f147286m == 2) {
                        long j11 = c32006l8.f147280g;
                        if (j11 > 0) {
                            if (j11 < 100000000000L) {
                                c32006l8.f147280g = j11 * 1000;
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                str2 = String.format("%1$s • %2$s", AbstractC23160o0.m119270m0(c32006l8.f147280g), str3);
                            } else {
                                str2 = AbstractC23160o0.m119270m0(c32006l8.f147280g);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        str2 = String.format("%1$s • %2$s", str2, str3);
                    } else if (TextUtils.isEmpty(str2)) {
                        if (!TextUtils.isEmpty(str3)) {
                            str2 = str3;
                        }
                        str2 = "";
                    }
                }
            }
            StaticLayout staticLayout3 = new StaticLayout(AbstractC23144m6.m118821b(str2, this.f76372e1, this.f76358W, truncateAt, 1).toString(), this.f76372e1, this.f76358W, alignment, 1.0f, 0.0f, false);
            this.f76314G0 = staticLayout3;
            this.f76322J = staticLayout3.getHeight();
            String str6 = c32006l8.f147291r;
            this.f76318H1 = true ^ TextUtils.isEmpty(str6);
            StaticLayout staticLayout4 = new StaticLayout(AbstractC23144m6.m118821b(str6, this.f76374f1, this.f76358W, truncateAt, this.f76308E0).toString(), this.f76374f1, this.f76358W, alignment, 1.0f, 0.0f, false);
            this.f76317H0 = staticLayout4;
            this.f76352T = staticLayout4.getHeight();
            if (m83035v(c32006l8)) {
                if (TextUtils.isEmpty(c32006l8.f147285l)) {
                    str4 = "";
                } else {
                    str4 = c32006l8.f147285l;
                }
                StaticLayout staticLayout5 = new StaticLayout(AbstractC23144m6.m118821b(str4, this.f76376g1, this.f76358W, truncateAt, this.f76305D0).toString(), this.f76376g1, this.f76358W, alignment, 1.0f, 0.0f, false);
                this.f76332M0 = staticLayout5;
                this.f76354U = staticLayout5.getHeight();
            }
            int i16 = c32006l8.f147293t;
            if (i16 > 0 && i16 > this.f76375g0) {
                str5 = "+" + (c32006l8.f147293t - this.f76375g0);
            } else if (c32006l8.f147281h != null) {
                str5 = "+" + (c32006l8.f147281h.size() - this.f76375g0);
            }
            this.f76329L0 = new StaticLayout(TextUtils.ellipsize(str5, this.f76378h1, this.f76379i0, truncateAt).toString(), this.f76378h1, this.f76379i0, alignment, 1.0f, 0.0f, false);
            if (m83035v(c32006l8)) {
                i12 = this.f76354U;
                int i17 = this.f76379i0;
                if (i12 <= i17) {
                    i12 = i17;
                }
            } else {
                i12 = this.f76379i0;
            }
            int i18 = this.f76410v;
            int i19 = this.f76416x;
            int i21 = this.f76295A;
            int i22 = this.f76298B;
            int i23 = this.f76304D;
            int i24 = this.f76322J;
            int i25 = this.f76316H;
            int i26 = i18 + i19 + i21 + i22 + i23 + i24 + i25 + this.f76340P;
            int i27 = this.f76346R;
            int i28 = this.f76352T;
            int i29 = this.f76385l0;
            int i31 = i26 + (i27 * 2) + i28 + i12 + (i29 * 2) + this.f76389n0;
            int i32 = this.f76313G;
            int i33 = this.f76307E;
            int i34 = i31 + i32 + i33;
            this.f76401s = i34;
            AbstractC23304d.f113456x2 = i34;
            int i35 = (this.f76404t / 2) - (i34 / 2);
            this.f76420y0 = i35;
            int i36 = i35 + i18 + i19 + i21;
            this.f76301C = i36;
            int i37 = i36 + i23 + i22;
            this.f76310F = i37;
            int i38 = i37 + i32 + i33;
            this.f76319I = i38;
            int i39 = i38 + i24 + i25;
            this.f76349S = i39;
            int i41 = i39 + i28 + i27;
            this.f76369d0 = i41;
            this.f76371e0 = i41;
            this.f76391o0 = i41 + i12 + i29;
            int i42 = this.f76420y0;
            this.f76353T0 = new Rect(0, i42, this.f76398r, this.f76410v + i42);
            int i43 = this.f76398r;
            int i44 = this.f76413w;
            int i45 = this.f76420y0;
            int i46 = this.f76410v;
            int i47 = this.f76416x;
            this.f76350S0 = new Rect((i43 / 2) - (i44 / 2), ((i45 + i46) + i47) - i44, (i43 / 2) + (i44 / 2), i45 + i46 + i47);
            int i48 = this.f76367c0;
            int i49 = this.f76369d0;
            this.f76355U0 = new Rect(i48, i49, this.f76398r - i48, this.f76379i0 + i49);
            this.f76312F1.clear();
            ArrayList arrayList2 = c32006l8.f147281h;
            if (arrayList2 != null) {
                int min2 = Math.min(arrayList2.size(), this.f76375g0);
                int i51 = this.f76367c0;
                if (min2 >= this.f76377h0) {
                    int i52 = i51;
                    for (int i53 = 0; i53 < min2; i53++) {
                        int i54 = this.f76369d0;
                        int i55 = this.f76379i0;
                        this.f76312F1.add(new Rect(i52, i54, i52 + i55, i55 + i54));
                        i52 = i52 + this.f76379i0 + this.f76373f0;
                    }
                }
            }
            m83021d(c32006l8);
            m83020c(c32006l8);
            int i56 = this.f76383k0;
            int i57 = this.f76391o0;
            this.f76357V0 = new Rect(i56, i57, this.f76387m0 + i56, this.f76389n0 + i57);
            int i58 = this.f76357V0.right + this.f76393p0;
            int i59 = this.f76391o0;
            this.f76359W0 = new Rect(i58, i59, this.f76398r - this.f76383k0, this.f76389n0 + i59);
            int intrinsicWidth = this.f76398r - this.f76397q1.getIntrinsicWidth();
            int i61 = this.f76299B0;
            int i62 = this.f76420y0;
            int i63 = this.f76302C0;
            this.f76360X0 = new Rect(intrinsicWidth - i61, i62 + i63, this.f76398r - i61, i62 + i63 + this.f76397q1.getIntrinsicHeight());
            int i64 = this.f76404t;
            int i65 = this.f76401s;
            this.f76403s1 = new RectF(0.0f, (i64 / 2) - (i65 / 2), this.f76398r, (i64 / 2) + (i65 / 2));
            int i66 = this.f76383k0;
            int i67 = this.f76391o0;
            this.f76409u1 = new Rect(i66, i67, this.f76387m0 + i66, this.f76389n0 + i67);
            int i68 = this.f76383k0;
            int i69 = this.f76387m0 + i68 + this.f76393p0;
            int i71 = this.f76391o0;
            this.f76412v1 = new Rect(i69, i71, this.f76398r - i68, this.f76389n0 + i71);
            this.f76415w1.setBounds(this.f76409u1);
            this.f76418x1.setBounds(this.f76412v1);
            this.f76421y1.setBounds(new Rect(this.f76365b0 - AbstractC23136l9.m118742r(4.0f), this.f76310F - AbstractC23136l9.m118742r(1.0f), this.f76365b0 + this.f76363a0 + AbstractC23136l9.m118742r(4.0f), this.f76310F + this.f76313G + AbstractC23136l9.m118742r(1.0f)));
            InterfaceC14801d interfaceC14801d = this.f76361Y0;
            if (interfaceC14801d != null) {
                interfaceC14801d.mo36288d3((this.f76404t - this.f76401s) / 2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        invalidate();
    }

    /* renamed from: c */
    void m83020c(C32006l8 c32006l8) {
        if (c32006l8 == null) {
            return;
        }
        try {
            String string = getResources().getString(AbstractC8020f0.str_suggest_friend_send_msg);
            this.f76336N1 = 2;
            m83018D(1, 0);
            this.f76320I0 = new StaticLayout(string, this.f76380i1, this.f76387m0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    void m83021d(C32006l8 c32006l8) {
        String m83023f;
        if (c32006l8 == null) {
            return;
        }
        try {
            if (c32006l8.f147290q == 3) {
                if (c32006l8.f147282i > 0) {
                    m83023f = getResources().getString(AbstractC8020f0.str_followed);
                    this.f76333M1 = 4;
                    m83018D(2, 2);
                } else {
                    m83023f = m83023f(c32006l8);
                }
            } else if (c32006l8.f147282i > 0) {
                this.f76333M1 = 0;
                m83023f = getResources().getString(AbstractC8020f0.str_suggest_func_follow_page);
                m83018D(2, 1);
            } else {
                m83023f = m83023f(c32006l8);
            }
            this.f76323J0 = new StaticLayout(m83023f, this.f76382j1, this.f76387m0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    boolean m83022e(String str, int i11) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return m83024g(str);
                }
                return false;
            }
            if (this.f76364a1 == null || TextUtils.isEmpty(str) || !str.equals(this.f76364a1.f147276c)) {
                return false;
            }
            return true;
        }
        if (this.f76364a1 == null || TextUtils.isEmpty(str) || !str.equals(this.f76364a1.f147277d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    String m83023f(C32006l8 c32006l8) {
        if (C21927m.m114302u().m114312J().m153137g(c32006l8.f147278e)) {
            String string = getResources().getString(AbstractC8020f0.str_mini_profile_unblock);
            this.f76333M1 = 6;
            m83018D(2, 1);
            return string;
        }
        if (AbstractC23063f2.m118359k(c32006l8.f147278e)) {
            String string2 = getResources().getString(AbstractC8020f0.str_requested);
            this.f76333M1 = 4;
            m83018D(2, 2);
            return string2;
        }
        if (AbstractC23063f2.m118360l(c32006l8.f147278e) && c32006l8.f147290q != 5) {
            String m136327a = C26446c.m136326b().m136327a();
            this.f76333M1 = 1;
            m83018D(2, 1);
            return m136327a;
        }
        if (C18644n.m98531l().m98558u(c32006l8.f147278e)) {
            this.f76333M1 = 3;
            String string3 = getResources().getString(AbstractC8020f0.user_interaction_func_call);
            m83018D(2, 0);
            return string3;
        }
        String string4 = getResources().getString(AbstractC8020f0.btn_send_Invitation);
        this.f76333M1 = 0;
        m83018D(2, 1);
        return string4;
    }

    /* renamed from: g */
    boolean m83024g(String str) {
        ArrayList arrayList;
        try {
            if (this.f76364a1 != null && !TextUtils.isEmpty(str) && (arrayList = this.f76364a1.f147281h) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (str.equals(((ItemAlbumMobile) it.next()).m40526m0())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: i */
    public Rect m83025i(int i11) {
        try {
            ArrayList arrayList = this.f76312F1;
            if (arrayList != null) {
                if (i11 >= 0 && i11 < arrayList.size()) {
                    Rect rect = (Rect) this.f76312F1.get(i11);
                    int i12 = rect.left;
                    int i13 = this.f76296A0;
                    Rect rect2 = new Rect(i12 + i13, rect.top, rect.right + i13, rect.bottom);
                    rect2.offset(0, AbstractC23136l9.m118740q0(getContext()));
                    return rect2;
                }
                Rect rect3 = (Rect) this.f76312F1.get(r7.size() - 1);
                int i14 = rect3.left;
                int i15 = this.f76296A0;
                Rect rect4 = new Rect(i14 + i15, rect3.top, rect3.right + i15, rect3.bottom);
                rect4.offset(0, AbstractC23136l9.m118740q0(getContext()));
                return rect4;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    int m83026j(int i11, int i12) {
        try {
            if (this.f76312F1 != null) {
                for (int i13 = 0; i13 < this.f76312F1.size(); i13++) {
                    if (((Rect) this.f76312F1.get(i13)).contains(i11, i12)) {
                        return i13;
                    }
                }
                return -1;
            }
            return -1;
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    /* renamed from: k */
    Rect m83027k(int i11, int i12) {
        try {
            if (this.f76312F1 != null) {
                for (int i13 = 0; i13 < this.f76312F1.size(); i13++) {
                    if (((Rect) this.f76312F1.get(i13)).contains(i11, i12)) {
                        return (Rect) this.f76312F1.get(i13);
                    }
                }
                return null;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    String m83028l(C32006l8 c32006l8) {
        if (c32006l8 == null) {
            return "";
        }
        if (c32006l8.f147282i <= 0) {
            int i11 = c32006l8.f147286m;
            if (i11 == 1) {
                if (!TextUtils.isEmpty(c32006l8.f147292s)) {
                    return c32006l8.f147292s;
                }
                return AbstractC23059e9.m118339r(c32006l8.f147286m, c32006l8.f147287n, c32006l8.f147275b);
            }
            if (i11 == 2) {
                if (!TextUtils.isEmpty(c32006l8.f147292s)) {
                    return c32006l8.f147292s;
                }
                int i12 = c32006l8.f147287n;
                if (i12 != -1 && i12 != 30 && i12 != 10) {
                    return AbstractC23059e9.m118339r(c32006l8.f147286m, i12, c32006l8.f147275b);
                }
                return AbstractC23059e9.m118339r(c32006l8.f147286m, i12, c32006l8.f147275b).trim();
            }
            return getResources().getString(AbstractC8020f0.str_you_may_know);
        }
        return getResources().getString(AbstractC8020f0.str_maybe_you_care);
    }

    /* renamed from: m */
    void m83029m(int i11, int i12) {
        try {
            m83032r(this.f76364a1);
            int i13 = 3;
            int i14 = 0;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (i11 != 0) {
                            if (i11 == 1) {
                                if (this.f76333M1 == 4) {
                                    i14 = 2;
                                }
                                m83018D(2, i14);
                            }
                        } else {
                            if (this.f76333M1 == 4) {
                                i13 = 2;
                            }
                            m83018D(2, i13);
                        }
                    }
                } else if (i11 != 0) {
                    if (i11 == 1) {
                        m83018D(1, 0);
                    }
                } else {
                    m83018D(1, 3);
                }
            } else if (i11 != 0) {
                if (i11 == 1) {
                    m83018D(1, 0);
                    if (this.f76333M1 == 4) {
                        i14 = 2;
                    }
                    m83018D(2, i14);
                }
            } else {
                m83018D(1, 3);
                if (this.f76333M1 == 4) {
                    i13 = 2;
                }
                m83018D(2, i13);
            }
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // vg.C28194t6.f
    /* renamed from: n */
    public void mo60866n(int i11, String str, C32006l8 c32006l8) {
        this.f76366b1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.m70

            /* renamed from: q */
            public final /* synthetic */ String f81103q;

            /* renamed from: r */
            public final /* synthetic */ int f81104r;

            /* renamed from: s */
            public final /* synthetic */ C32006l8 f81105s;

            public /* synthetic */ m70(String str2, int i112, C32006l8 c32006l82) {
                r2 = str2;
                r3 = i112;
                r4 = c32006l82;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ProfileCardView.this.m83014w(r2, r3, r4);
            }
        });
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        ArrayList arrayList;
        Rect rect;
        Drawable drawable;
        super.onDraw(canvas);
        try {
            RectF rectF = this.f76403s1;
            if (rectF != null) {
                int i11 = this.f76407u;
                canvas.drawRoundRect(rectF, i11, i11, this.f76338O0);
            }
            C13697o c13697o = this.f76324J1;
            int i12 = 0;
            if (c13697o != null) {
                c13697o.m76460H(0, this.f76420y0);
                this.f76324J1.m76467d(canvas);
            }
            if (this.f76397q1 != null && m83034u()) {
                int intrinsicWidth = (this.f76398r - this.f76397q1.getIntrinsicWidth()) - this.f76299B0;
                int i13 = this.f76420y0 + this.f76302C0;
                this.f76397q1.setBounds(intrinsicWidth, i13, this.f76397q1.getIntrinsicWidth() + intrinsicWidth, this.f76397q1.getIntrinsicHeight() + i13);
                this.f76397q1.draw(canvas);
            }
            float f11 = this.f76398r / 2;
            int i14 = this.f76420y0 + this.f76410v + this.f76416x;
            int i15 = this.f76413w;
            canvas.drawCircle(f11, i14 - (i15 / 2), (i15 / 2) + this.f76419y, this.f76386l1);
            if (this.f76390n1 != null) {
                canvas.save();
                int i16 = this.f76398r / 2;
                int i17 = this.f76413w;
                canvas.translate(i16 - (i17 / 2), ((this.f76420y0 + this.f76410v) + this.f76416x) - i17);
                Drawable drawable2 = this.f76390n1;
                int i18 = this.f76413w;
                drawable2.setBounds(0, 0, i18, i18);
                this.f76390n1.draw(canvas);
                canvas.restore();
            }
            if (m83035v(this.f76364a1) && ContactProfile.m40345C0(this.f76364a1.f147282i) && (drawable = this.f76400r1) != null) {
                int intrinsicWidth2 = ((this.f76398r / 2) + (this.f76413w / 2)) - drawable.getIntrinsicWidth();
                int intrinsicHeight = (this.f76420y0 + this.f76410v) - (this.f76400r1.getIntrinsicHeight() / 2);
                this.f76400r1.setBounds(intrinsicWidth2, intrinsicHeight, this.f76400r1.getIntrinsicWidth() + intrinsicWidth2, this.f76400r1.getIntrinsicHeight() + intrinsicHeight);
                this.f76400r1.draw(canvas);
            }
            if (this.f76311F0 != null) {
                canvas.save();
                canvas.translate(this.f76356V, this.f76301C);
                this.f76311F0.draw(canvas);
                canvas.restore();
            }
            if (this.f76326K0 != null) {
                this.f76421y1.draw(canvas);
                canvas.save();
                canvas.translate(this.f76365b0, this.f76310F);
                this.f76326K0.draw(canvas);
                canvas.restore();
            }
            if (this.f76314G0 != null) {
                canvas.save();
                canvas.translate(this.f76356V, this.f76319I);
                this.f76314G0.draw(canvas);
                canvas.restore();
            }
            if (this.f76317H0 != null) {
                canvas.save();
                canvas.translate(this.f76356V, this.f76349S);
                this.f76317H0.draw(canvas);
                canvas.restore();
            }
            if (m83035v(this.f76364a1)) {
                if (this.f76332M0 != null) {
                    canvas.save();
                    canvas.translate(this.f76356V, this.f76371e0);
                    this.f76332M0.draw(canvas);
                    canvas.restore();
                }
            } else {
                C32006l8 c32006l8 = this.f76364a1;
                if (c32006l8 != null && (arrayList = c32006l8.f147281h) != null) {
                    int i19 = this.f76367c0;
                    int min = Math.min(arrayList.size(), this.f76375g0);
                    if (min >= this.f76377h0) {
                        while (i12 < min) {
                            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f76364a1.f147281h.get(i12);
                            C13658k c13658k = (C13658k) this.f76321I1.get(itemAlbumMobile.m40526m0());
                            if (c13658k != null) {
                                c13658k.m76339r(i19, this.f76369d0);
                                c13658k.m76325a(canvas);
                                if (itemAlbumMobile.f42591p == 2 && this.f76327K1 != null && (rect = this.f76330L1) != null) {
                                    int i21 = this.f76369d0;
                                    int i22 = this.f76379i0;
                                    rect.set(i19, i21, i19 + i22, i22 + i21);
                                    this.f76327K1.m136731b(this.f76330L1);
                                    this.f76327K1.m136730a(canvas);
                                }
                            }
                            i12++;
                            if (i12 == min && this.f76364a1.f147281h.size() > this.f76375g0) {
                                float f12 = i19;
                                int i23 = this.f76369d0;
                                int i24 = this.f76379i0;
                                canvas.drawRect(f12, i23, i19 + i24, i23 + i24, this.f76341P0);
                                canvas.save();
                                canvas.translate(f12, (this.f76369d0 + (this.f76379i0 / 2)) - (this.f76329L0.getHeight() / 2));
                                this.f76329L0.draw(canvas);
                                canvas.restore();
                            }
                            i19 = i19 + this.f76379i0 + this.f76373f0;
                        }
                    }
                }
            }
            if (m83033s()) {
                this.f76415w1.draw(canvas);
                if (this.f76320I0 != null) {
                    canvas.save();
                    canvas.translate(this.f76383k0, (this.f76391o0 + (this.f76389n0 / 2)) - (this.f76320I0.getHeight() / 2));
                    this.f76320I0.draw(canvas);
                    canvas.restore();
                }
                this.f76418x1.draw(canvas);
                if (this.f76323J0 != null) {
                    canvas.save();
                    canvas.translate(this.f76383k0 + this.f76387m0 + this.f76393p0, (this.f76391o0 + (this.f76389n0 / 2)) - (this.f76323J0.getHeight() / 2));
                    this.f76323J0.draw(canvas);
                    canvas.restore();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(this.f76398r, this.f76404t);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC14801d interfaceC14801d;
        try {
            motionEvent.getPointerId(motionEvent.getActionIndex());
            int round = Math.round(motionEvent.getX());
            int round2 = Math.round(motionEvent.getY());
            if (this.f76361Y0 != null) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action == 3) {
                                m83029m(1, 0);
                            }
                        } else {
                            this.f76348R1 = true;
                        }
                    } else {
                        m83029m(1, 0);
                        if (this.f76339O1 == EnumC14800c.REMOVEIC && this.f76360X0.contains(round, round2) && m83034u()) {
                            this.f76361Y0.mo36283I3(this.f76364a1);
                            C32006l8 c32006l8 = this.f76364a1;
                            if (c32006l8 != null) {
                                int i11 = c32006l8.f147286m;
                                if (i11 == 2) {
                                    AbstractC23647d.m123897g("782022");
                                } else if (i11 == 1) {
                                    AbstractC23647d.m123897g("782021");
                                }
                            }
                        } else {
                            String str = "stranger";
                            if (this.f76339O1 == EnumC14800c.TOP && (this.f76350S0.contains(round, round2) || this.f76353T0.contains(round, round2))) {
                                this.f76361Y0.mo36284a(this.f76364a1);
                                C0708i c0708i = new C0708i();
                                if (AbstractC21935u.m114554u(this.f76364a1.f147278e)) {
                                    str = "friend";
                                }
                                c0708i.m1075f("profile_type", str);
                                if (this.f76350S0.contains(round, round2)) {
                                    C0732w.Companion.m1189a().m1187q("mini_profile_avatar", "", c0708i, null);
                                    AbstractC23647d.m123897g("782012");
                                } else if (this.f76353T0.contains(round, round2)) {
                                    C0732w.Companion.m1189a().m1187q("mini_profile_cover", "", c0708i, null);
                                    AbstractC23647d.m123897g("782013");
                                }
                            } else if (this.f76339O1 == EnumC14800c.PHOTO && m83016B(round, round2)) {
                                m83030p(round, round2);
                                C0708i c0708i2 = new C0708i();
                                if (AbstractC21935u.m114554u(this.f76364a1.f147278e)) {
                                    str = "friend";
                                }
                                c0708i2.m1075f("profile_type", str);
                                C0732w.Companion.m1189a().m1187q("mini_profile_social_image_list", "", c0708i2, null);
                            } else if (this.f76339O1 == EnumC14800c.BUTTON_LEFT && this.f76357V0.contains(round, round2) && m83033s()) {
                                InterfaceC14801d interfaceC14801d2 = this.f76361Y0;
                                if (interfaceC14801d2 != null) {
                                    interfaceC14801d2.mo36287d(this.f76364a1, this.f76336N1);
                                }
                            } else if (this.f76339O1 == EnumC14800c.BUTTON_RIGHT && this.f76359W0.contains(round, round2) && m83033s() && (interfaceC14801d = this.f76361Y0) != null) {
                                interfaceC14801d.mo36287d(this.f76364a1, this.f76333M1);
                            }
                        }
                    }
                } else {
                    VelocityTracker velocityTracker = this.f76351S1;
                    if (velocityTracker == null) {
                        this.f76351S1 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.f76351S1.addMovement(motionEvent);
                    if (this.f76360X0.contains(round, round2) && m83034u()) {
                        this.f76339O1 = EnumC14800c.REMOVEIC;
                    } else {
                        if (!this.f76350S0.contains(round, round2) && !this.f76353T0.contains(round, round2)) {
                            if (m83016B(round, round2)) {
                                this.f76339O1 = EnumC14800c.PHOTO;
                            } else if (this.f76357V0.contains(round, round2) && m83033s()) {
                                this.f76339O1 = EnumC14800c.BUTTON_LEFT;
                                m83029m(0, 1);
                            } else if (this.f76359W0.contains(round, round2) && m83033s() && this.f76333M1 != 4) {
                                this.f76339O1 = EnumC14800c.BUTTON_RIGHT;
                                m83029m(0, 2);
                            } else {
                                this.f76339O1 = EnumC14800c.NONE;
                            }
                        }
                        this.f76339O1 = EnumC14800c.TOP;
                    }
                    this.f76342P1 = motionEvent.getX();
                    this.f76345Q1 = motionEvent.getRawY();
                    this.f76348R1 = false;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return true;
    }

    /* renamed from: p */
    void m83030p(int i11, int i12) {
        try {
            if (this.f76361Y0 != null) {
                int m83026j = m83026j(i11, i12);
                if (m83026j + 1 == this.f76375g0 && this.f76364a1.f147281h.size() > this.f76375g0) {
                    this.f76361Y0.mo36285b(this.f76364a1);
                    AbstractC23647d.m123897g("782015");
                } else {
                    this.f76361Y0.mo36286c(this, this.f76364a1.f147281h, m83026j, new C14799b(i11, i12));
                    AbstractC23647d.m123897g("782014");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    void m83031q(Context context, int i11, int i12) {
        try {
            this.f76366b1 = new Handler(Looper.getMainLooper());
            this.f76406t1 = new C23528a(context);
            this.f76398r = i11;
            this.f76404t = i12;
            this.f76407u = AbstractC23136l9.m118742r(12.0f);
            this.f76410v = AbstractC23136l9.m118742r(148.0f);
            int m118742r = AbstractC23136l9.m118742r(120.0f);
            this.f76413w = m118742r;
            this.f76416x = m118742r / 3;
            this.f76419y = AbstractC23136l9.m118742r(2.0f);
            this.f76422z = Integer.MAX_VALUE;
            this.f76295A = AbstractC23136l9.m118742r(12.0f);
            this.f76298B = AbstractC23136l9.m118742r(4.0f);
            this.f76316H = AbstractC23136l9.m118742r(10.0f);
            this.f76325K = AbstractC23136l9.m118742r(18.0f);
            this.f76328L = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
            this.f76331M = AbstractC23136l9.m118742r(14.0f);
            this.f76337O = AbstractC23136l9.m118742r(16.0f);
            this.f76334N = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
            this.f76340P = 1;
            this.f76343Q = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
            this.f76346R = AbstractC23136l9.m118742r(12.0f);
            int m118742r2 = AbstractC23136l9.m118742r(40.0f);
            this.f76356V = m118742r2;
            this.f76358W = this.f76398r - (m118742r2 * 2);
            this.f76367c0 = AbstractC23136l9.m118742r(22.0f);
            int m118742r3 = AbstractC23136l9.m118742r(2.0f);
            this.f76373f0 = m118742r3;
            int i13 = ((this.f76398r - (this.f76367c0 * 2)) - (m118742r3 * 3)) / 4;
            this.f76381j0 = i13;
            this.f76379i0 = i13;
            int m118742r4 = AbstractC23136l9.m118742r(12.0f);
            this.f76393p0 = m118742r4;
            int i14 = this.f76398r;
            int i15 = (i14 * 2) / 5;
            this.f76387m0 = i15;
            this.f76383k0 = ((i14 - (i15 * 2)) - m118742r4) / 2;
            this.f76385l0 = AbstractC23136l9.m118742r(16.0f);
            this.f76389n0 = AbstractC23136l9.m118742r(34.0f);
            this.f76402s0 = -16538118;
            this.f76405t0 = -1;
            this.f76411v0 = -16733612;
            this.f76408u0 = -1;
            this.f76396q0 = -3485482;
            this.f76399r0 = -3025190;
            this.f76414w0 = AbstractC23136l9.m118742r(1.0f);
            this.f76417x0 = this.f76389n0 / 2;
            this.f76375g0 = 4;
            this.f76377h0 = 2;
            this.f76362Z0 = ViewConfiguration.get(getContext());
            C13704p1 c13704p1 = new C13704p1();
            this.f76370d1 = c13704p1;
            c13704p1.setAntiAlias(true);
            this.f76370d1.setTextSize(this.f76325K);
            this.f76370d1.m76612b(7);
            this.f76370d1.setColor(this.f76328L);
            C13704p1 c13704p12 = new C13704p1();
            this.f76372e1 = c13704p12;
            c13704p12.setAntiAlias(true);
            this.f76372e1.setTextSize(this.f76331M);
            this.f76372e1.setColor(this.f76334N);
            C13704p1 c13704p13 = new C13704p1(1);
            this.f76374f1 = c13704p13;
            c13704p13.setTextSize(AbstractC23136l9.m118742r(14.0f));
            this.f76374f1.setColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            C13704p1 c13704p14 = new C13704p1(1);
            this.f76376g1 = c13704p14;
            c13704p14.setAntiAlias(true);
            this.f76376g1.setTextSize(this.f76337O);
            this.f76376g1.setColor(this.f76328L);
            Paint paint = new Paint();
            this.f76335N0 = paint;
            paint.setAntiAlias(true);
            this.f76335N0.setStrokeWidth(this.f76340P);
            this.f76335N0.setColor(this.f76343Q);
            C13704p1 c13704p15 = new C13704p1();
            this.f76378h1 = c13704p15;
            c13704p15.setAntiAlias(true);
            this.f76378h1.setTextSize(this.f76325K);
            this.f76378h1.setColor(-1);
            Paint paint2 = new Paint();
            this.f76341P0 = paint2;
            paint2.setAntiAlias(true);
            this.f76341P0.setColor(Integer.MIN_VALUE);
            C13697o c13697o = new C13697o(this);
            this.f76324J1 = c13697o;
            c13697o.m76462J(1, this.f76398r);
            this.f76324J1.m76484y(0);
            this.f76324J1.m76482w(-1);
            C13697o c13697o2 = this.f76324J1;
            int i16 = this.f76407u;
            c13697o2.m76461I(new float[]{i16, i16, i16, i16, 0.0f, 0.0f, 0.0f, 0.0f});
            this.f76324J1.m76481v(this.f76398r, this.f76410v + this.f76407u);
            Paint paint3 = new Paint();
            this.f76386l1 = paint3;
            paint3.setAntiAlias(true);
            this.f76386l1.setStyle(Paint.Style.FILL);
            this.f76386l1.setColor(this.f76422z);
            C13704p1 c13704p16 = new C13704p1();
            this.f76382j1 = c13704p16;
            c13704p16.setAntiAlias(true);
            this.f76382j1.setTextSize(this.f76331M);
            this.f76382j1.setColor(this.f76405t0);
            this.f76382j1.m76613c();
            C13704p1 c13704p17 = new C13704p1();
            this.f76380i1 = c13704p17;
            c13704p17.setAntiAlias(true);
            this.f76380i1.setTextSize(this.f76331M);
            this.f76380i1.setColor(this.f76402s0);
            this.f76380i1.m76613c();
            this.f76320I0 = new StaticLayout(getResources().getString(AbstractC8020f0.str_cap_send_msg), this.f76380i1, this.f76387m0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            Paint paint4 = new Paint();
            this.f76338O0 = paint4;
            paint4.setAntiAlias(true);
            this.f76338O0.setColor(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
            this.f76309E1 = new C3977j[this.f76375g0];
            Paint paint5 = new Paint();
            this.f76344Q0 = paint5;
            paint5.setAntiAlias(true);
            this.f76344Q0.setColor(-12434878);
            m83037y("", 0);
            m83037y("", 1);
            this.f76302C0 = AbstractC23136l9.m118742r(10.0f);
            this.f76299B0 = AbstractC23136l9.m118742r(10.0f);
            Paint paint6 = new Paint();
            this.f76347R0 = paint6;
            paint6.setAntiAlias(true);
            this.f76397q1 = AbstractC23136l9.m118665N(context, AbstractC16803z.btn_removeimg);
            this.f76400r1 = AbstractC23136l9.m118665N(context, AbstractC16803z.ic_oa_verify);
            this.f76327K1 = new C26628a(AbstractC1388a.m6964f(getContext(), AbstractC16803z.icn_csc_play_small));
            this.f76415w1 = AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type2_medium);
            this.f76418x1 = AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_type1_medium);
            this.f76424z1 = AbstractC23136l9.m118645D(getContext(), AbstractC16803z.bg_btn_type2_text);
            this.f76297A1 = AbstractC23136l9.m118645D(getContext(), AbstractC16803z.bg_btn_type1_text);
            this.f76421y1 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_label_business_account);
            this.f76415w1.setState(new int[]{R.attr.state_enabled, -16842919});
            this.f76418x1.setState(new int[]{R.attr.state_enabled, -16842919});
            this.f76300B1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_profile_native_desc);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    boolean m83032r(C32006l8 c32006l8) {
        if (c32006l8 != null && c32006l8.f147290q == 3 && c32006l8.f147282i <= 0 && c32006l8.f147286m == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    boolean m83033s() {
        C32006l8 c32006l8 = this.f76364a1;
        if (c32006l8 != null && c32006l8.f147288o == 1) {
            return true;
        }
        return false;
    }

    public void setListener(InterfaceC14801d interfaceC14801d) {
        this.f76361Y0 = interfaceC14801d;
    }

    /* renamed from: u */
    boolean m83034u() {
        C32006l8 c32006l8 = this.f76364a1;
        if (c32006l8 != null && c32006l8.f147289p == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    boolean m83035v(C32006l8 c32006l8) {
        if (c32006l8.f147282i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    void m83036x(String str, C24003n c24003n, InterfaceC3968a interfaceC3968a, int i11) {
        int i12;
        try {
            if (!TextUtils.isEmpty(str)) {
                boolean m125696L2 = C23999j.m125696L2(str, c24003n);
                if (!m125696L2) {
                    m83037y(str, i11);
                }
                if (m125696L2 || !this.f76368c1) {
                    C23528a c23528a = (C23528a) this.f76406t1.m123612r(interfaceC3968a);
                    C14798a c14798a = new C14798a(i11, interfaceC3968a, m125696L2);
                    if (c24003n.f116265f) {
                        i12 = 26005;
                    } else {
                        i12 = 0;
                    }
                    c23528a.m123579C(str, c24003n, (C23999j) c14798a.m125611h1(i12, 0));
                    return;
                }
                return;
            }
            m83037y(str, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    void m83037y(String str, int i11) {
        C13658k c13658k;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 && (c13658k = (C13658k) this.f76321I1.get(str)) != null) {
                        c13658k.m76331h();
                        return;
                    }
                    return;
                }
                if (this.f76394p1 == null) {
                    this.f76392o1 = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.ava_miniprofile_default);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(MainApplication.getAppContext().getResources(), this.f76392o1);
                    this.f76394p1 = bitmapDrawable;
                    int i12 = this.f76413w;
                    bitmapDrawable.setBounds(0, 0, i12, i12);
                }
                this.f76388m1 = this.f76392o1;
                this.f76390n1 = this.f76394p1;
                return;
            }
            this.f76324J1.m76477r();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    void m83038z(Bitmap bitmap, boolean z11, int i11, String str) {
        C13658k c13658k;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 && (c13658k = (C13658k) this.f76321I1.get(str)) != null) {
                        c13658k.m76334m(bitmap, z11);
                        return;
                    }
                    return;
                }
                if (this.f76388m1 != bitmap) {
                    if (z11) {
                        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new BitmapDrawable(getResources(), this.f76388m1), new BitmapDrawable(getResources(), bitmap)});
                        this.f76390n1 = transitionDrawable;
                        transitionDrawable.setCallback(this);
                        ((TransitionDrawable) this.f76390n1).setCrossFadeEnabled(true);
                        ((TransitionDrawable) this.f76390n1).startTransition(200);
                    } else {
                        this.f76390n1 = new BitmapDrawable(MainApplication.getAppContext().getResources(), bitmap);
                    }
                    this.f76388m1 = bitmap;
                    return;
                }
                return;
            }
            this.f76324J1.m76480u(bitmap, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

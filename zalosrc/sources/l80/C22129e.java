package l80;

import am.C0943w;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.zviews.ke0;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22055v0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C24003n;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import vg.AbstractRunnableC28185s6;
import vg.C28203u6;

/* renamed from: l80.e */
/* loaded from: classes6.dex */
public class C22129e extends C16716d implements AbstractRunnableC28185s6.b {

    /* renamed from: t1 */
    static final int f108921t1 = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: u1 */
    static final int f108922u1 = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: M0 */
    int f108923M0;

    /* renamed from: N0 */
    C16716d f108924N0;

    /* renamed from: O0 */
    C3977j[] f108925O0;

    /* renamed from: P0 */
    C22128d0[] f108926P0;

    /* renamed from: Q0 */
    C22126c0 f108927Q0;

    /* renamed from: R0 */
    C24003n f108928R0;

    /* renamed from: S0 */
    GradientDrawable f108929S0;

    /* renamed from: T0 */
    C23528a f108930T0;

    /* renamed from: U0 */
    public boolean f108931U0;

    /* renamed from: V0 */
    String f108932V0;

    /* renamed from: W0 */
    String f108933W0;

    /* renamed from: X0 */
    int f108934X0;

    /* renamed from: Y0 */
    List f108935Y0;

    /* renamed from: Z0 */
    int f108936Z0;

    /* renamed from: a1 */
    int f108937a1;

    /* renamed from: b1 */
    int f108938b1;

    /* renamed from: c1 */
    int f108939c1;

    /* renamed from: d1 */
    int f108940d1;

    /* renamed from: e1 */
    Paint f108941e1;

    /* renamed from: f1 */
    int f108942f1;

    /* renamed from: g1 */
    int f108943g1;

    /* renamed from: h1 */
    int f108944h1;

    /* renamed from: i1 */
    int[] f108945i1;

    /* renamed from: j1 */
    int[] f108946j1;

    /* renamed from: k1 */
    int[] f108947k1;

    /* renamed from: l1 */
    boolean f108948l1;

    /* renamed from: m1 */
    boolean f108949m1;

    /* renamed from: n1 */
    int f108950n1;

    /* renamed from: o1 */
    boolean f108951o1;

    /* renamed from: p1 */
    PathEffect f108952p1;

    /* renamed from: q1 */
    float f108953q1;

    /* renamed from: r1 */
    public boolean f108954r1;

    /* renamed from: s1 */
    String f108955s1;

    /* renamed from: l80.e$a */
    /* loaded from: classes6.dex */
    public class a extends AbstractRunnableC28185s6 {

        /* renamed from: z */
        final /* synthetic */ List f108957z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractRunnableC28185s6.b bVar, List list, int i11, List list2) {
            super(bVar, list, i11);
            this.f108957z = list2;
        }

        /* renamed from: h */
        public /* synthetic */ void m115444h(List list) {
            String str;
            String str2;
            String str3;
            int i11;
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    AbstractC3972e.m18783g0(C22129e.this.f108925O0[intValue]);
                    if (intValue < C22129e.this.f108935Y0.size()) {
                        ContactProfile m141811g = C28203u6.f131407a.m141811g((String) C22129e.this.f108935Y0.get(intValue));
                        if (m141811g != null) {
                            String str4 = m141811g.f42446v;
                            if (TextUtils.isEmpty(str4)) {
                                str2 = null;
                                str3 = str4;
                                str = null;
                            } else {
                                if (C23302b.f113247a.m120523d(str4) && !CoreUtility.f89233i.equals(m141811g.f42434r)) {
                                    i11 = 3;
                                    str2 = m141811g.m40418n0();
                                    str3 = str4;
                                    str = m141811g.f42434r;
                                } else {
                                    str2 = null;
                                    str3 = str4;
                                    str = null;
                                    i11 = 2;
                                }
                                C22129e.this.m115438v1(i11, str, str2, str3, intValue);
                            }
                        } else {
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                        i11 = 1;
                        C22129e.this.m115438v1(i11, str, str2, str3, intValue);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.d

                /* renamed from: q */
                public final /* synthetic */ List f108916q;

                public /* synthetic */ RunnableC22127d(List list) {
                    r2 = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C22129e.a.this.m115444h(r2);
                }
            });
        }
    }

    public C22129e(Context context, int i11) {
        super(context);
        this.f108923M0 = 4;
        this.f108931U0 = false;
        this.f108932V0 = "";
        this.f108933W0 = "";
        this.f108934X0 = 1;
        this.f108935Y0 = new ArrayList();
        this.f108940d1 = 0;
        this.f108948l1 = false;
        this.f108949m1 = false;
        this.f108951o1 = false;
        this.f108953q1 = 0.0f;
        this.f108954r1 = true;
        this.f108955s1 = null;
        this.f108930T0 = new C23528a(context);
        this.f108928R0 = C23278z2.m120152s(context);
        this.f108944h1 = Color.parseColor("#9ff0ff");
        Paint paint = new Paint(1);
        this.f108941e1 = paint;
        paint.setAntiAlias(true);
        this.f108941e1.setStyle(Paint.Style.STROKE);
        this.f108941e1.setColor(this.f108944h1);
        Paint paint2 = this.f108941e1;
        paint2.setFlags(paint2.getFlags() | 1);
        this.f108941e1.setAlpha(m89086B());
        this.f108950n1 = C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor);
        this.f108936Z0 = i11;
        C16718f m89106L = m89106L();
        int i12 = this.f108936Z0;
        m89106L.m89028L(i12, i12);
        this.f108924N0 = new C16716d(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f108929S0 = gradientDrawable;
        gradientDrawable.setShape(1);
        this.f108929S0.setColor(C23212s8.m119607o(context, AbstractC16781w.AvatarPlaceHolderColor));
        C22126c0 c22126c0 = new C22126c0(context);
        this.f108927Q0 = c22126c0;
        c22126c0.m115422R1();
        this.f108927Q0.mo111965M1(1);
        this.f108927Q0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f108927Q0.m89085A0(this.f108929S0);
        this.f108927Q0.m89106L().m89029M(15);
        this.f108927Q0.m89103J0(true);
        this.f108924N0.m89001g1(this.f108927Q0);
        C22128d0[] c22128d0Arr = new C22128d0[this.f108923M0];
        this.f108926P0 = c22128d0Arr;
        for (int length = c22128d0Arr.length - 1; length >= 0; length--) {
            this.f108926P0[length] = new C22128d0(context);
            this.f108926P0[length].m111929z1(5);
            C22128d0 c22128d0 = this.f108926P0[length];
            c22128d0.f108917W0 = this.f108950n1;
            c22128d0.f108918X0 = this.f108938b1;
            this.f108924N0.m89001g1(c22128d0);
        }
        this.f108925O0 = new C3977j[this.f108923M0];
        this.f108952p1 = new DashPathEffect(new float[]{AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f)}, 0.0f);
        m89001g1(this.f108924N0);
        m115431E1(0, 0, true);
    }

    /* renamed from: o1 */
    private void m115426o1() {
        int min;
        String str;
        String str2;
        String str3;
        int i11;
        try {
            if (this.f108934X0 == 4 && this.f108955s1 != null) {
                min = Math.min(this.f108935Y0.size(), 3);
            } else {
                min = Math.min(this.f108935Y0.size(), this.f108934X0);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < min; i12++) {
                AbstractC3972e.m18783g0(this.f108925O0[i12]);
                if (!TextUtils.isEmpty((CharSequence) this.f108935Y0.get(i12))) {
                    if (!((String) this.f108935Y0.get(i12)).startsWith("http") && !((String) this.f108935Y0.get(i12)).contains(".png") && !((String) this.f108935Y0.get(i12)).contains(".jpg")) {
                        ContactProfile m141811g = C28203u6.f131407a.m141811g((String) this.f108935Y0.get(i12));
                        if (m141811g != null) {
                            String str4 = m141811g.f42446v;
                            if (TextUtils.isEmpty(str4)) {
                                str2 = null;
                                str3 = null;
                                str = str4;
                                i11 = 1;
                                m115438v1(i11, str2, str3, str, i12);
                            } else if (C23302b.f113247a.m120523d(str4) && !CoreUtility.f89233i.equals(this.f108935Y0.get(i12))) {
                                str3 = m141811g.m40418n0();
                                str2 = (String) this.f108935Y0.get(i12);
                                str = str4;
                                i11 = 3;
                                m115438v1(i11, str2, str3, str, i12);
                            } else {
                                str2 = null;
                                str3 = null;
                                str = str4;
                                i11 = 2;
                                m115438v1(i11, str2, str3, str, i12);
                            }
                        } else {
                            arrayList.add((String) this.f108935Y0.get(i12));
                            arrayList2.add(Integer.valueOf(i12));
                        }
                    }
                    String str5 = (String) this.f108935Y0.get(i12);
                    if (C23302b.f113247a.m120523d(str5) && !TextUtils.isEmpty(this.f108933W0) && !CoreUtility.f89233i.equals(this.f108933W0)) {
                        str = str5;
                        str3 = this.f108932V0;
                        str2 = this.f108933W0;
                        i11 = 3;
                        m115438v1(i11, str2, str3, str, i12);
                    } else {
                        str = str5;
                        str2 = null;
                        str3 = null;
                        i11 = 2;
                        m115438v1(i11, str2, str3, str, i12);
                    }
                }
                str2 = null;
                str3 = null;
                str = null;
                i11 = 1;
                m115438v1(i11, str2, str3, str, i12);
            }
            if (arrayList.size() > 0) {
                new a(this, arrayList, 1052, arrayList2).m141750b();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: A1 */
    public void m115427A1(int[] iArr) {
        this.f108947k1 = iArr;
        m115429C1(this.f108948l1, this.f108949m1);
    }

    /* renamed from: B1 */
    public void m115428B1(int i11, int i12) {
        this.f108942f1 = i11;
        this.f108943g1 = i12;
        m115429C1(this.f108948l1, this.f108949m1);
    }

    /* renamed from: C1 */
    public void m115429C1(boolean z11, boolean z12) {
        int i11;
        int i12;
        try {
            this.f108948l1 = true;
            this.f108949m1 = z12;
            int i13 = this.f108942f1;
            if (i13 <= 0) {
                i13 = f108921t1;
            }
            int i14 = this.f108943g1;
            if (i14 <= 0) {
                i14 = f108922u1;
            }
            m115431E1(i13, i14, false);
            if (this.f108945i1 == null) {
                this.f108945i1 = AbstractC22055v0.m115164x(getContext());
            }
            if (this.f108946j1 == null) {
                this.f108946j1 = AbstractC22055v0.m115163w(getContext());
            }
            if (this.f108947k1 == null) {
                this.f108947k1 = new int[]{C23212s8.m119607o(getContext(), AbstractC16781w.ItemSeparatorColor), C23212s8.m119607o(getContext(), AbstractC16781w.ItemSeparatorColor)};
            }
            if (z11) {
                if (z12) {
                    i11 = this.f108946j1[0];
                } else {
                    i11 = this.f108947k1[0];
                }
            } else {
                i11 = this.f108945i1[0];
            }
            int i15 = i11;
            if (z11) {
                if (z12) {
                    i12 = this.f108946j1[1];
                } else {
                    i12 = this.f108947k1[1];
                }
            } else {
                i12 = this.f108945i1[1];
            }
            this.f108941e1.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f108936Z0, i15, i12, Shader.TileMode.MIRROR));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D1 */
    void m115430D1() {
        int i11 = 0;
        while (true) {
            C22128d0[] c22128d0Arr = this.f108926P0;
            if (i11 >= c22128d0Arr.length) {
                break;
            }
            c22128d0Arr[i11].mo44614b1(8);
            C16718f m89106L = this.f108926P0[i11].m89106L();
            Boolean bool = Boolean.FALSE;
            m89106L.m89072y(bool).m89018B(bool).m89017A(bool).m89073z(bool).m89026J(false).m89031O(0);
            i11++;
        }
        this.f108927Q0.mo44614b1(8);
        C16718f m89106L2 = this.f108927Q0.m89106L();
        Boolean bool2 = Boolean.FALSE;
        m89106L2.m89073z(bool2).m89018B(bool2).m89017A(bool2).m89072y(bool2).m89026J(false).m89031O(0);
        C22128d0 c22128d0 = this.f108926P0[0];
        c22128d0.f108918X0 = this.f108938b1;
        int i12 = this.f108934X0;
        if (i12 == 5) {
            c22128d0.mo44614b1(0);
            C16718f m89106L3 = this.f108926P0[0].m89106L();
            int i13 = this.f108939c1;
            C16718f m89028L = m89106L3.m89028L(i13, i13);
            Boolean bool3 = Boolean.TRUE;
            m89028L.m89018B(bool3).m89036T((this.f108937a1 - this.f108939c1) / 2).m89073z(bool3);
            if (this.f108955s1 != null) {
                this.f108927Q0.mo44614b1(0);
                C16718f m89106L4 = this.f108927Q0.m89106L();
                int i14 = this.f108939c1;
                m89106L4.m89028L(i14, i14).m89018B(bool3).m89036T((this.f108937a1 - this.f108939c1) / 2).m89017A(bool3);
                this.f108927Q0.m111959G1(this.f108955s1);
                return;
            }
            return;
        }
        if (i12 == 4) {
            c22128d0.mo44614b1(0);
            C16718f m89106L5 = this.f108926P0[0].m89106L();
            int i15 = this.f108939c1;
            C16718f m89072y = m89106L5.m89028L(i15, i15).m89072y(bool2);
            Boolean bool4 = Boolean.TRUE;
            m89072y.m89018B(bool4).m89073z(bool4);
            this.f108926P0[1].mo44614b1(0);
            C16718f m89106L6 = this.f108926P0[1].m89106L();
            int i16 = this.f108939c1;
            m89106L6.m89028L(i16, i16).m89018B(bool4).m89017A(bool4);
            this.f108926P0[2].mo44614b1(0);
            C16718f m89106L7 = this.f108926P0[2].m89106L();
            int i17 = this.f108939c1;
            m89106L7.m89028L(i17, i17).m89072y(bool4).m89073z(bool4);
            if (this.f108955s1 != null) {
                this.f108927Q0.mo44614b1(0);
                C16718f m89106L8 = this.f108927Q0.m89106L();
                int i18 = this.f108939c1;
                m89106L8.m89028L(i18, i18).m89072y(bool4).m89017A(bool4);
                this.f108927Q0.m111959G1(this.f108955s1);
                return;
            }
            this.f108926P0[3].mo44614b1(0);
            C16718f m89106L9 = this.f108926P0[3].m89106L();
            int i19 = this.f108939c1;
            m89106L9.m89028L(i19, i19).m89072y(bool4).m89017A(bool4);
            return;
        }
        if (i12 == 3) {
            c22128d0.mo44614b1(0);
            C16718f m89106L10 = this.f108926P0[0].m89106L();
            int i21 = this.f108939c1;
            C16718f m89026J = m89106L10.m89028L(i21, i21).m89026J(true);
            Boolean bool5 = Boolean.TRUE;
            m89026J.m89018B(bool5);
            this.f108926P0[1].mo44614b1(0);
            C16718f m89106L11 = this.f108926P0[1].m89106L();
            int i22 = this.f108939c1;
            m89106L11.m89028L(i22, i22).m89018B(bool5).m89036T((this.f108937a1 - this.f108939c1) - (this.f108938b1 * 2)).m89073z(bool5);
            this.f108926P0[2].mo44614b1(0);
            C16718f m89106L12 = this.f108926P0[2].m89106L();
            int i23 = this.f108939c1;
            m89106L12.m89028L(i23, i23).m89018B(bool5).m89036T((this.f108937a1 - this.f108939c1) - (this.f108938b1 * 2)).m89017A(bool5);
            return;
        }
        if (i12 == 2) {
            c22128d0.mo44614b1(0);
            C16718f m89106L13 = this.f108926P0[0].m89106L();
            int i24 = this.f108939c1;
            C16718f m89028L2 = m89106L13.m89028L(i24, i24);
            Boolean bool6 = Boolean.TRUE;
            m89028L2.m89018B(bool6).m89036T((this.f108937a1 - this.f108939c1) / 2).m89073z(bool6);
            this.f108926P0[1].mo44614b1(0);
            C16718f m89106L14 = this.f108926P0[1].m89106L();
            int i25 = this.f108939c1;
            m89106L14.m89028L(i25, i25).m89018B(bool6).m89036T((this.f108937a1 - this.f108939c1) / 2).m89017A(bool6);
            return;
        }
        c22128d0.mo44614b1(0);
        C22128d0 c22128d02 = this.f108926P0[0];
        c22128d02.f108918X0 = 0.0f;
        C16718f m89106L15 = c22128d02.m89106L();
        int i26 = this.f108937a1;
        m89106L15.m89028L(i26, i26);
    }

    /* renamed from: E1 */
    public void m115431E1(int i11, int i12, boolean z11) {
        this.f108942f1 = i11;
        this.f108943g1 = i12;
        int i13 = i11 + i12;
        if (i13 != this.f108940d1 || z11) {
            this.f108940d1 = i13;
            int i14 = this.f108936Z0 - (i13 * 2);
            this.f108937a1 = i14;
            this.f108939c1 = (int) (i14 * 0.5416667f);
            this.f108938b1 = (int) (i14 * 0.041666668f);
            C16718f m89106L = this.f108924N0.m89106L();
            int i15 = this.f108937a1;
            m89106L.m89028L(i15, i15).m89034R(this.f108940d1).m89036T(this.f108940d1);
            this.f108927Q0.mo111964L1((this.f108937a1 / 4.0f) - AbstractC23136l9.m118742r(1.0f));
            this.f108929S0.setStroke(this.f108938b1, this.f108950n1);
            for (int length = this.f108926P0.length - 1; length >= 0; length--) {
                this.f108926P0[length].f108918X0 = this.f108938b1;
            }
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        canvas.save();
        if (this.f108951o1) {
            float f11 = (this.f108953q1 + 1.0f) % 360.0f;
            this.f108953q1 = f11;
            int i11 = this.f108936Z0;
            canvas.rotate(f11, i11 / 2.0f, i11 / 2.0f);
        }
        int i12 = this.f108942f1;
        if (i12 > 0) {
            this.f108941e1.setStrokeWidth(i12);
            float f12 = this.f108936Z0 / 2.0f;
            canvas.drawCircle(f12, f12, (f12 - (this.f108942f1 / 2)) - 1.0f, this.f108941e1);
        }
        canvas.restore();
        super.mo44775o0(canvas);
        if (this.f108951o1) {
            invalidate();
        }
    }

    /* renamed from: p1 */
    public int m115432p1() {
        int i11 = this.f108942f1;
        return i11 > 0 ? i11 : f108921t1;
    }

    /* renamed from: q1 */
    public void m115433q1(ContactProfile contactProfile) {
        try {
            if (contactProfile != null) {
                if (contactProfile.m40374K0()) {
                    m115439w1(C23278z2.m120141m0());
                    m115437u1(contactProfile.m40388T(false));
                    return;
                }
                if (AbstractC25495a.m132081f(contactProfile.f42434r)) {
                    m115440x1(AbstractC16803z.ava_oa_news);
                    return;
                }
                if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                    if (C23302b.f113247a.m120523d(contactProfile.f42446v) && !CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                        String str = contactProfile.f42434r;
                        if (TextUtils.isEmpty(str) || str.startsWith("/")) {
                            str = ke0.m87327a(contactProfile.f42455y);
                        }
                        this.f108933W0 = str;
                        this.f108932V0 = contactProfile.m40418n0();
                        m115434r1(contactProfile.f42446v);
                        return;
                    }
                    m115439w1(C23278z2.m120152s(getContext()));
                    m115434r1(contactProfile.f42446v);
                    return;
                }
                m115441y1(C23212s8.m119609q(getContext(), AbstractC16781w.default_avatar));
                return;
            }
            m115434r1("");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r1 */
    public void m115434r1(String str) {
        this.f108935Y0.clear();
        this.f108935Y0.add(str);
        this.f108934X0 = 1;
        m115430D1();
        m115426o1();
    }

    /* renamed from: s1 */
    public void m115435s1(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (AbstractC25495a.m132079d(str)) {
                    m115439w1(C23278z2.m120141m0());
                    m115437u1(C0943w.m4462l().m4473g(str));
                } else if (AbstractC25495a.m132081f(str)) {
                    m115440x1(AbstractC16803z.ava_oa_news);
                } else if (!TextUtils.isEmpty(str2)) {
                    if (C23302b.f113247a.m120523d(str2) && !CoreUtility.f89233i.equals(str)) {
                        this.f108933W0 = str;
                        ContactProfile contactProfile = new ContactProfile(str);
                        contactProfile.f42437s = str3;
                        contactProfile.f42446v = str2;
                        this.f108932V0 = contactProfile.m40418n0();
                        m115434r1(str2);
                    } else {
                        m115439w1(C23278z2.m120143n());
                        m115434r1(str2);
                    }
                } else {
                    m115441y1(C23212s8.m119609q(getContext(), AbstractC16781w.default_avatar));
                }
            } else {
                m115434r1("");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t1 */
    public void m115436t1(List list) {
        this.f108935Y0.clear();
        if (list != null && list.size() != 0) {
            this.f108935Y0.addAll(list);
        } else {
            this.f108935Y0.add("");
        }
        this.f108955s1 = null;
        if (this.f108935Y0.size() == 2 && ((String) this.f108935Y0.get(1)).equals("1")) {
            this.f108934X0 = 5;
            this.f108935Y0.remove(1);
            this.f108955s1 = "1";
        } else if (this.f108935Y0.size() == 4) {
            this.f108934X0 = 4;
            this.f108955s1 = null;
        } else if (this.f108935Y0.size() >= 5) {
            this.f108934X0 = 4;
            this.f108955s1 = (String) this.f108935Y0.get(4);
        } else {
            this.f108934X0 = this.f108935Y0.size();
        }
        if (this.f108934X0 <= 0) {
            this.f108934X0 = 1;
        }
        m115430D1();
        m115426o1();
    }

    /* renamed from: u1 */
    public void m115437u1(C31973j5 c31973j5) {
        if (c31973j5 != null && c31973j5.m153786t0()) {
            m115434r1(c31973j5.m153756e());
        } else if (c31973j5 != null && c31973j5.m153762h() != null && c31973j5.m153762h().size() > 0) {
            m115436t1(c31973j5.m153762h());
        } else {
            m115434r1("");
        }
    }

    /* renamed from: v1 */
    void m115438v1(int i11, String str, String str2, String str3, int i12) {
        if (i11 == 3 && str != null && str2 != null) {
            this.f108926P0[i12].mo111925v1(C16640q2.m88404a().mo88412f(str2, C2343e.m12307a(str, false)));
        } else {
            if (i11 == 2) {
                C3977j[] c3977jArr = this.f108925O0;
                if (c3977jArr[i12] == null) {
                    c3977jArr[i12] = new C3977j(getContext());
                }
                if (this.f108954r1) {
                    AbstractC23268y2.m120033g(this.f108930T0, this.f108925O0[i12], this.f108926P0[i12], str3, this.f108928R0, this.f108931U0);
                    return;
                } else {
                    AbstractC23268y2.m120034h(this.f108930T0, this.f108925O0[i12], this.f108926P0[i12], str3, this.f108928R0, this.f108931U0);
                    return;
                }
            }
            this.f108926P0[i12].mo111925v1(this.f108928R0.f116261b);
        }
    }

    /* renamed from: w1 */
    public void m115439w1(C24003n c24003n) {
        if (c24003n == null) {
            return;
        }
        this.f108928R0 = c24003n;
    }

    /* renamed from: x1 */
    public void m115440x1(int i11) {
        this.f108934X0 = 1;
        AbstractC3972e.m18783g0(this.f108925O0[0]);
        this.f108926P0[0].mo111925v1(AbstractC23136l9.m118665N(getContext(), i11));
        m115430D1();
        invalidate();
    }

    /* renamed from: y1 */
    public void m115441y1(Drawable drawable) {
        this.f108934X0 = 1;
        AbstractC3972e.m18783g0(this.f108925O0[0]);
        this.f108926P0[0].mo111925v1(drawable);
        m115430D1();
        invalidate();
    }

    /* renamed from: z1 */
    public void m115442z1(boolean z11) {
        this.f108951o1 = z11;
        if (z11) {
            this.f108941e1.setPathEffect(this.f108952p1);
        } else {
            this.f108941e1.setPathEffect(null);
        }
        invalidate();
    }
}

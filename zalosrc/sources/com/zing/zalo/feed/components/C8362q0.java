package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import bo.C3013n3;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.common.C7852a;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.zview.AbstractC17466e;
import is.AbstractC20814p0;
import java.util.ArrayList;
import java.util.List;
import l30.AbstractC22055v0;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C31903ea;
import p716zh.C31942h4;
import p716zh.C32123ta;
import vg.C28227x3;

/* renamed from: com.zing.zalo.feed.components.q0 */
/* loaded from: classes4.dex */
public class C8362q0 extends C16716d {

    /* renamed from: M0 */
    C11850a f45579M0;

    /* renamed from: N0 */
    C22126c0 f45580N0;

    /* renamed from: O0 */
    CharSequence f45581O0;

    /* renamed from: P0 */
    ArrayList f45582P0;

    /* renamed from: Q0 */
    int f45583Q0;

    /* renamed from: R0 */
    int f45584R0;

    /* renamed from: S0 */
    int f45585S0;

    /* renamed from: T0 */
    int f45586T0;

    /* renamed from: U0 */
    C23528a f45587U0;

    /* renamed from: V0 */
    Paint f45588V0;

    /* renamed from: W0 */
    TextPaint f45589W0;

    /* renamed from: com.zing.zalo.feed.components.q0$a */
    /* loaded from: classes4.dex */
    public class a extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ C31890dc f45590c;

        /* renamed from: d */
        final /* synthetic */ CharSequence f45591d;

        /* renamed from: e */
        final /* synthetic */ float f45592e;

        /* renamed from: f */
        final /* synthetic */ int f45593f;

        a(C31890dc c31890dc, CharSequence charSequence, float f11, int i11) {
            this.f45590c = c31890dc;
            this.f45591d = charSequence;
            this.f45592e = f11;
            this.f45593f = i11;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            C8362q0 c8362q0;
            C11850a c11850a;
            try {
                try {
                    c8362q0 = C8362q0.this;
                    c11850a = c8362q0.f45579M0;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (c11850a == null) {
                    c8362q0.m44816z1(this.f45590c, this.f45591d, this.f45592e, c3979l, false, this.f45593f);
                    return;
                }
                if (c11850a.getTag(AbstractC6918a0.tag_bg_id) != null && ((Integer) C8362q0.this.f45579M0.getTag(AbstractC6918a0.tag_bg_id)).intValue() == this.f45590c.f146495a) {
                    super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
                }
                if (C8362q0.this.f45579M0.getTag(AbstractC6918a0.tag_visibility) != null) {
                    C11850a c11850a2 = C8362q0.this.f45579M0;
                    c11850a2.mo44614b1(((Integer) c11850a2.getTag(AbstractC6918a0.tag_visibility)).intValue());
                }
                C8362q0.this.m44816z1(this.f45590c, this.f45591d, this.f45592e, c3979l, false, this.f45593f);
            } catch (Throwable th2) {
                C8362q0.this.m44816z1(this.f45590c, this.f45591d, this.f45592e, c3979l, false, this.f45593f);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.q0$b */
    /* loaded from: classes4.dex */
    public class b extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ C31942h4 f45595c;

        /* renamed from: d */
        final /* synthetic */ float f45596d;

        /* renamed from: e */
        final /* synthetic */ int f45597e;

        /* renamed from: f */
        final /* synthetic */ int f45598f;

        b(C31942h4 c31942h4, float f11, int i11, int i12) {
            this.f45595c = c31942h4;
            this.f45596d = f11;
            this.f45597e = i11;
            this.f45598f = i12;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            try {
                if (c3979l.m18839c().getWidth() != 0 && c3979l.m18839c().getHeight() != 0) {
                    C7852a.d m44810t1 = C8362q0.this.m44810t1(c3979l, this.f45595c, this.f45596d);
                    Point m44808r1 = C8362q0.this.m44808r1(this.f45595c.f146762c, this.f45596d, m44810t1);
                    C16718f m89106L = ((C11850a) C8362q0.this.f45582P0.get(this.f45597e)).m89106L();
                    m89106L.m89032P(m44808r1.x + ((int) (this.f45595c.f146763d * AbstractC23136l9.m118722k0())), m44808r1.y + ((int) (this.f45595c.f146764e * AbstractC23136l9.m118722k0() * this.f45596d)), 0, 0);
                    m89106L.m89060k0(m44810t1.f42176a);
                    ((C11850a) C8362q0.this.f45582P0.get(this.f45597e)).m65868d2((m44810t1.f42177b * 1.0f) / m44810t1.f42176a);
                    ((C11850a) C8362q0.this.f45582P0.get(this.f45597e)).requestLayout();
                    if (((C11850a) C8362q0.this.f45582P0.get(this.f45597e)).getTag(AbstractC6918a0.tag_typo_id) != null && ((Integer) ((C11850a) C8362q0.this.f45582P0.get(this.f45597e)).getTag(AbstractC6918a0.tag_typo_id)).intValue() == this.f45598f) {
                        super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C8362q0(Context context) {
        super(context);
        this.f45583Q0 = 0;
        this.f45584R0 = 0;
        this.f45585S0 = AbstractC23136l9.m118742r(16.0f);
        this.f45586T0 = AbstractC23136l9.m118742r(30.0f);
        m44812v1(context);
    }

    /* renamed from: p1 */
    public static Layout.Alignment m44795p1(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5 A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:3:0x000a, B:5:0x0031, B:10:0x0113, B:13:0x003a, B:15:0x0060, B:16:0x006b, B:18:0x0073, B:20:0x0091, B:21:0x00a1, B:25:0x00c8, B:27:0x00cf, B:29:0x00d5, B:32:0x00e1, B:33:0x0101, B:34:0x00cc, B:35:0x011f, B:37:0x0123), top: B:2:0x000a }] */
    /* renamed from: A1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m44796A1(C31890dc c31890dc, boolean z11, boolean z12, CharSequence charSequence, float f11, int i11) {
        String str;
        String str2;
        try {
            m44798C1(c31890dc, z11, charSequence, i11);
            float m108597C = AbstractC20814p0.m108597C(AbstractC23136l9.m118722k0() - (this.f45585S0 * 2), AbstractC23136l9.m118722k0(), f11, c31890dc, charSequence, this.f45589W0, m44809s1(), null);
            if (c31890dc != null) {
                int i12 = c31890dc.f146519y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        this.f45579M0.m65868d2(m108597C);
                        this.f45579M0.m89085A0(c31890dc.m153240e());
                        this.f45579M0.mo111926w1(AbstractC16803z.trans);
                        this.f45579M0.setTag(AbstractC6918a0.tag_bg_id, -100);
                        List list = c31890dc.f146492B;
                        if (list != null) {
                            m44805J1(c31890dc.f146495a, list.size());
                            for (int i13 = 0; i13 < c31890dc.f146492B.size(); i13++) {
                                m44813w1((C31942h4) c31890dc.f146492B.get(i13), i13, f11, z12, c31890dc.f146495a);
                            }
                        }
                        m44816z1(c31890dc, charSequence, m108597C, null, false, i11);
                    }
                } else {
                    this.f45579M0.m65868d2(m108597C);
                    this.f45579M0.mo89161z0(c31890dc.f146516v);
                    this.f45579M0.mo111926w1(AbstractC16803z.trans);
                    this.f45579M0.setTag(AbstractC6918a0.tag_bg_id, Integer.valueOf(c31890dc.f146495a));
                    int i14 = this.f45584R0;
                    if (i14 != 0 && i14 != 2) {
                        str = c31890dc.f146513s;
                        str2 = str;
                        if (!TextUtils.isEmpty(str2)) {
                            boolean m125696L2 = C23999j.m125696L2(str2, C23278z2.m120163y());
                            if (!z12 || m125696L2) {
                                this.f45579M0.m115381O1(this.f45587U0, str2, C23278z2.m120163y(), new a(c31890dc, charSequence, m108597C, i11).m115395a(150L));
                            }
                        }
                        m44816z1(c31890dc, charSequence, f11, null, true, i11);
                        m44811u1();
                    }
                    str = c31890dc.f146512r;
                    str2 = str;
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    m44816z1(c31890dc, charSequence, f11, null, true, i11);
                    m44811u1();
                }
                setTag(AbstractC6918a0.tag_typo_id, Integer.valueOf(c31890dc.f146495a));
                return;
            }
            C11850a c11850a = this.f45579M0;
            if (c11850a != null) {
                c11850a.mo44614b1(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B1 */
    public void m44797B1(C31890dc c31890dc, boolean z11) {
        m44798C1(c31890dc, z11, "", 7);
    }

    /* renamed from: C1 */
    public void m44798C1(C31890dc c31890dc, boolean z11, CharSequence charSequence, int i11) {
        float m153241g;
        try {
            C22126c0 m44809s1 = m44809s1();
            if (c31890dc != null && m44809s1 != null) {
                if (c31890dc.m153249t()) {
                    m44809s1.m111962J1(C23212s8.m119607o(m44809s1.getContext(), AbstractC21196a.TextColor1));
                } else {
                    m44809s1.m111962J1(c31890dc.m153237b());
                }
                int m118742r = AbstractC23136l9.m118742r(c31890dc.m153244m(charSequence, i11));
                m44809s1.m111961I1(m44795p1(c31890dc.f146515u));
                Typeface m153062r0 = C31845ac.m152996J().m153062r0(c31890dc.f146495a, c31890dc.m153243k());
                if (m153062r0 != null) {
                    m44809s1.mo111966N1(m153062r0);
                }
                if (c31890dc.m153249t()) {
                    m44809s1.m111984z1(AbstractC23136l9.m118742r(c31890dc.m153239d()), 1.0f);
                    m118742r = AbstractC23136l9.m118742r(C31890dc.f146485E);
                } else {
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTypeface(m153062r0);
                    textPaint.setTextSize(m118742r);
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    int i12 = (int) (fontMetrics.descent - fontMetrics.ascent);
                    if (c31890dc.m153248s()) {
                        m153241g = c31890dc.m153242i(i11);
                    } else {
                        m153241g = c31890dc.m153241g(charSequence, i11);
                    }
                    m44809s1.m111984z1(AbstractC23136l9.m118742r(m153241g) - i12, 1.0f);
                }
                m44809s1.mo111964L1(m118742r);
                if (m44809s1.m89106L() != null) {
                    if (c31890dc.m153248s()) {
                        C16718f m89106L = m44809s1.m89106L();
                        Boolean bool = Boolean.TRUE;
                        m89106L.m89073z(bool).m89018B(bool).m89027K(false).m89025I(false);
                        m44809s1.requestLayout();
                        return;
                    }
                    C16718f m89106L2 = m44809s1.m89106L();
                    Boolean bool2 = Boolean.FALSE;
                    m89106L2.m89073z(bool2).m89018B(bool2).m89027K(true).m89025I(true);
                    m44809s1.requestLayout();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D1 */
    public void m44799D1(CharSequence charSequence) {
        this.f45581O0 = charSequence;
        if (m44809s1() != null) {
            m44809s1().m111959G1(charSequence);
        }
    }

    /* renamed from: E1 */
    public void m44800E1(int i11, int i12, int i13, int i14) {
        C11850a c11850a = this.f45579M0;
        if (c11850a != null && c11850a.m89106L() != null) {
            this.f45579M0.m89106L().m89032P(i11, i12, i13, i14);
        }
    }

    /* renamed from: F1 */
    public void m44801F1(int i11) {
        this.f45584R0 = i11;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        C22126c0 c22126c0 = this.f45580N0;
                        if (c22126c0 != null) {
                            c22126c0.m89106L().m89034R(this.f45585S0);
                            this.f45580N0.m89106L().m89035S(this.f45585S0);
                            this.f45580N0.requestLayout();
                        }
                        C11850a c11850a = this.f45579M0;
                        if (c11850a != null) {
                            c11850a.m65869e2(1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C22126c0 c22126c02 = this.f45580N0;
                if (c22126c02 != null) {
                    c22126c02.m89106L().m89034R(this.f45586T0);
                    this.f45580N0.m89106L().m89035S(this.f45586T0);
                    this.f45580N0.requestLayout();
                }
                C11850a c11850a2 = this.f45579M0;
                if (c11850a2 != null) {
                    c11850a2.m65869e2(6);
                    return;
                }
                return;
            }
            C22126c0 c22126c03 = this.f45580N0;
            if (c22126c03 != null) {
                c22126c03.m89106L().m89034R(this.f45585S0);
                this.f45580N0.m89106L().m89035S(this.f45585S0);
                this.f45580N0.requestLayout();
            }
            C11850a c11850a3 = this.f45579M0;
            if (c11850a3 != null) {
                c11850a3.m65869e2(6);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: G1 */
    public void m44802G1(int i11) {
        try {
            int i12 = this.f45584R0;
            if (i12 != 0) {
                if (i12 == 1 && i11 != this.f45586T0) {
                    this.f45586T0 = i11;
                } else {
                    return;
                }
            } else if (i11 != this.f45585S0) {
                this.f45585S0 = i11;
            } else {
                return;
            }
            C22126c0 c22126c0 = this.f45580N0;
            if (c22126c0 != null) {
                c22126c0.m89106L().m89034R(i11);
                this.f45580N0.m89106L().m89035S(i11);
                this.f45580N0.requestLayout();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: H1 */
    public void m44803H1(int i11, Object obj) {
        C11850a c11850a = this.f45579M0;
        if (c11850a != null) {
            c11850a.setTag(i11, obj);
        }
    }

    /* renamed from: I1 */
    public void m44804I1(int i11) {
        this.f45583Q0 = i11;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f45579M0.mo44614b1(0);
                }
            } else {
                this.f45579M0.mo44614b1(8);
            }
            m44811u1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J1 */
    void m44805J1(int i11, int i12) {
        int i13;
        try {
            if (getTag(AbstractC6918a0.tag_typo_id) != null && ((Integer) getTag(AbstractC6918a0.tag_typo_id)).intValue() == i11) {
                return;
            }
            ArrayList arrayList = this.f45582P0;
            if (arrayList != null) {
                i13 = arrayList.size();
            } else {
                i13 = 0;
            }
            if (i12 > i13) {
                int i14 = i12 - i13;
                for (int i15 = 0; i15 < i14; i15++) {
                    m44806o1();
                }
            }
            m44811u1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o1 */
    void m44806o1() {
        C11850a c11850a = new C11850a(getContext());
        c11850a.m89106L().m89060k0(-2).m89030N(-2);
        c11850a.m65869e2(6);
        if (this.f45582P0 == null) {
            this.f45582P0 = new ArrayList();
        }
        this.f45582P0.add(c11850a);
        m89001g1(c11850a);
    }

    /* renamed from: q1 */
    C28227x3 m44807q1(int i11, int i12) {
        boolean z11;
        if (i11 != 0 && i12 != 0) {
            C28227x3 c28227x3 = new C28227x3(i11, i12);
            if (i11 >= i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            float f11 = (i12 * 1.0f) / i11;
            if (z11) {
                while (i11 > 480) {
                    i11 /= 2;
                }
                i12 = (int) (i11 * f11);
            } else {
                while (i12 > 480) {
                    i12 /= 2;
                }
                i11 = (int) (i12 / f11);
            }
            c28227x3.f131648a = i11;
            c28227x3.f131649b = i12;
            return c28227x3;
        }
        return null;
    }

    /* renamed from: r1 */
    protected Point m44808r1(int i11, float f11, C7852a.d dVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int m118722k0 = AbstractC23136l9.m118722k0();
        int i16 = (int) (m118722k0 * f11);
        int i17 = 0;
        switch (i11) {
            case 1:
            default:
                i14 = 0;
                break;
            case 2:
                i12 = (m118722k0 - dVar.f42176a) / 2;
                i17 = i12;
                i14 = 0;
                break;
            case 3:
                i12 = m118722k0 - dVar.f42176a;
                i17 = i12;
                i14 = 0;
                break;
            case 4:
                i13 = (i16 - dVar.f42177b) / 2;
                i14 = i13;
                break;
            case 5:
                i17 = (m118722k0 - dVar.f42176a) / 2;
                i14 = (i16 - dVar.f42177b) / 2;
                break;
            case 6:
                i17 = m118722k0 - dVar.f42176a;
                i14 = (i16 - dVar.f42177b) / 2;
                break;
            case 7:
                i13 = i16 - dVar.f42177b;
                i14 = i13;
                break;
            case 8:
                i17 = (m118722k0 - dVar.f42176a) / 2;
                i15 = dVar.f42177b;
                i14 = i16 - i15;
                break;
            case 9:
                i17 = m118722k0 - dVar.f42176a;
                i15 = dVar.f42177b;
                i14 = i16 - i15;
                break;
        }
        return new Point(i17, i14);
    }

    /* renamed from: s1 */
    public C22126c0 m44809s1() {
        return this.f45580N0;
    }

    /* renamed from: t1 */
    protected C7852a.d m44810t1(C3979l c3979l, C31942h4 c31942h4, float f11) {
        int i11;
        int i12;
        Bitmap m18839c;
        float m118722k0;
        int i13;
        float f12;
        float height;
        int height2;
        float f13;
        float f14;
        if (c3979l != null && c3979l.m18839c() != null && c3979l.m18839c().getWidth() != 0 && c3979l.m18839c().getHeight() != 0) {
            int i14 = 0;
            try {
                m18839c = c3979l.m18839c();
                m118722k0 = AbstractC23136l9.m118722k0();
                i13 = (int) (f11 * m118722k0);
                f12 = c31942h4.f146765f;
                height = (c3979l.m18839c().getHeight() * 1.0f) / c3979l.m18839c().getWidth();
                String str = c31942h4.f146761b;
                switch (str.hashCode()) {
                    case 2402104:
                        if (str.equals(Image.SCALE_TYPE_NONE)) {
                            i12 = 0;
                            break;
                        }
                        i12 = -1;
                        break;
                    case 182565115:
                        if (str.equals(Image.SCALE_TYPE_FIXED_WIDTH)) {
                            i12 = 1;
                            break;
                        }
                        i12 = -1;
                        break;
                    case 931556466:
                        if (str.equals(Image.SCALE_TYPE_FIXED_HEIGHT)) {
                            i12 = 2;
                            break;
                        }
                        i12 = -1;
                        break;
                    case 1244896183:
                        if (str.equals(Image.SCALE_TYPE_SCREEN)) {
                            i12 = 3;
                            break;
                        }
                        i12 = -1;
                        break;
                    default:
                        i12 = -1;
                        break;
                }
                try {
                } catch (Exception e11) {
                    i11 = i12;
                    e = e11;
                    e.printStackTrace();
                    i12 = i11;
                    return new C7852a.d(i12, i14);
                }
            } catch (Exception e12) {
                e = e12;
                i11 = 0;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            i12 = (int) (m18839c.getWidth() * f12);
                            height2 = m18839c.getHeight();
                        } else {
                            i12 = (int) (m118722k0 * f12);
                            f14 = i13;
                            f13 = f14 * f12;
                            i14 = (int) f13;
                            return new C7852a.d(i12, i14);
                        }
                    } else {
                        int i15 = (int) (i13 / f12);
                        i11 = (int) (i15 / height);
                        i14 = i15;
                        i12 = i11;
                        return new C7852a.d(i12, i14);
                    }
                } else {
                    i12 = (int) (m118722k0 * f12);
                    f13 = i12 * height;
                    i14 = (int) f13;
                    return new C7852a.d(i12, i14);
                }
            } else {
                i12 = (int) (m18839c.getWidth() * f12);
                height2 = m18839c.getHeight();
            }
            f14 = height2;
            f13 = f14 * f12;
            i14 = (int) f13;
            return new C7852a.d(i12, i14);
        }
        return null;
    }

    /* renamed from: u1 */
    void m44811u1() {
        try {
            ArrayList arrayList = this.f45582P0;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i11 = 0; i11 < this.f45582P0.size(); i11++) {
                    ((C11850a) this.f45582P0.get(i11)).mo44614b1(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v1 */
    void m44812v1(Context context) {
        this.f45587U0 = new C23528a(context);
        Paint paint = new Paint(1);
        this.f45588V0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f45589W0 = new TextPaint(1);
        m89105K0(true);
        mo89093E0(true);
        C11850a c11850a = new C11850a(context);
        this.f45579M0 = c11850a;
        c11850a.m89106L().m89060k0(-1).m89030N(-2);
        this.f45579M0.m65869e2(3);
        m89001g1(this.f45579M0);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f45580N0 = c22126c0;
        C16718f m89106L = c22126c0.m89106L();
        int i11 = this.f45585S0;
        m89106L.m89032P(i11, 0, i11, 0);
        this.f45580N0.m89101I0(AbstractC6918a0.tvMessage);
        this.f45580N0.mo44614b1(0);
        this.f45580N0.m111982x1(true);
        this.f45580N0.m111984z1(0.8f, 1.0f);
        this.f45580N0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
        this.f45580N0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.cMtxt1));
        m89001g1(this.f45580N0);
    }

    /* renamed from: w1 */
    void m44813w1(C31942h4 c31942h4, int i11, float f11, boolean z11, int i12) {
        if (this.f45582P0.get(i11) != null && !TextUtils.isEmpty(c31942h4.f146760a)) {
            ((C11850a) this.f45582P0.get(i11)).setTag(AbstractC6918a0.tag_typo_id, Integer.valueOf(i12));
            boolean m125696L2 = C23999j.m125696L2(c31942h4.f146760a, C23278z2.m120162x());
            if (!z11 || m125696L2) {
                ((C11850a) this.f45582P0.get(i11)).m115381O1(this.f45587U0, c31942h4.f146760a, C23278z2.m120162x(), new b(c31942h4, f11, i11, i12));
            }
        }
    }

    /* renamed from: x1 */
    public void m44814x1(C3013n3 c3013n3, CharSequence charSequence, float f11) {
        if (c3013n3 != null) {
            try {
                if (c3013n3.m14430a() && !TextUtils.isEmpty(charSequence)) {
                    C22126c0 m44809s1 = m44809s1();
                    if (m44809s1 != null) {
                        m44809s1.m111959G1(charSequence);
                        m44809s1.m111962J1(c3013n3.f11990b);
                        m44809s1.m111961I1(m44795p1(c3013n3.f11992d));
                        C16718f m89106L = m44809s1.m89106L();
                        Boolean bool = Boolean.FALSE;
                        m89106L.m89073z(bool).m89018B(bool).m89027K(true).m89025I(true);
                        m44809s1.requestLayout();
                    }
                    C11850a c11850a = this.f45579M0;
                    if (c11850a != null) {
                        c11850a.mo44614b1(0);
                        this.f45579M0.m65868d2(f11);
                        this.f45579M0.mo89161z0(c3013n3.f11991c);
                        this.f45579M0.mo111926w1(AbstractC17466e.transparent);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: y1 */
    public void m44815y1(C3013n3 c3013n3, CharSequence charSequence, int i11) {
        float f11;
        float m108613K = AbstractC20814p0.m108613K(i11);
        if (c3013n3 != null) {
            f11 = c3013n3.f11989a;
        } else {
            f11 = 1.0f;
        }
        m44814x1(c3013n3, charSequence, m108613K * f11);
    }

    /* renamed from: z1 */
    void m44816z1(C31890dc c31890dc, CharSequence charSequence, float f11, C3979l c3979l, boolean z11, int i11) {
        String m153343h;
        int i12;
        Canvas canvas;
        int i13;
        StaticLayout staticLayout;
        Bitmap bitmap;
        boolean z12;
        float f12;
        float f13;
        float f14;
        int i14 = i11;
        try {
            if (this.f45584R0 != 1) {
                return;
            }
            if (z11) {
                m153343h = C31903ea.f146582a.m153344i(charSequence.toString(), c31890dc.f146495a);
            } else {
                m153343h = C31903ea.f146582a.m153343h(charSequence.toString(), c31890dc.f146495a);
            }
            C24003n m120133j = C23278z2.m120133j(getContext(), AbstractC23006a0.m117930z(), C32123ta.m155029B());
            if (C23999j.m125696L2(m153343h, m120133j)) {
                return;
            }
            int m118722k0 = AbstractC23136l9.m118722k0();
            if (f11 > 0.0f) {
                i12 = (int) (m118722k0 * f11);
            } else {
                i12 = m118722k0;
            }
            Bitmap createBitmap = Bitmap.createBitmap(m118722k0, i12, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            if (c31890dc.f146519y == 0) {
                if (c3979l != null) {
                    bitmap = c3979l.m18839c();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    float f15 = m118722k0;
                    float width = bitmap.getWidth();
                    float f16 = (f15 * 1.0f) / width;
                    float f17 = i12;
                    float height = bitmap.getHeight();
                    float f18 = (f17 * 1.0f) / height;
                    if (f16 >= f18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        f12 = f17 - (height * f16);
                    } else {
                        f12 = f15 - (width * f18);
                    }
                    float f19 = f12 / 2.0f;
                    if (z12) {
                        f13 = 0.0f;
                    } else {
                        f13 = f19;
                    }
                    if (z12) {
                        f14 = f19;
                    } else {
                        f14 = 0.0f;
                    }
                    if (!z12) {
                        f15 -= f19;
                    }
                    if (z12) {
                        f17 -= f19;
                    }
                    canvas2.drawBitmap(bitmap, (Rect) null, new RectF(f13, f14, f15, f17), this.f45588V0);
                    canvas = canvas2;
                } else {
                    this.f45588V0.setColor(c31890dc.f146516v);
                    canvas = canvas2;
                    canvas2.drawRect(0.0f, 0.0f, m118722k0, i12, this.f45588V0);
                }
            } else {
                canvas = canvas2;
                this.f45588V0.setColor(c31890dc.f146516v);
                canvas.drawRect(0.0f, 0.0f, m118722k0, i12, this.f45588V0);
            }
            if (this.f45584R0 == 0) {
                i13 = this.f45585S0;
            } else {
                i13 = this.f45586T0;
            }
            int i15 = m118722k0 - (i13 * 2);
            TextPaint textPaint = new TextPaint();
            int m118742r = AbstractC23136l9.m118742r(c31890dc.m153244m(charSequence, i14));
            this.f45589W0.setColor(c31890dc.m153237b());
            Typeface m153062r0 = C31845ac.m152996J().m153062r0(c31890dc.f146495a, c31890dc.m153243k());
            if (m153062r0 != null) {
                this.f45589W0.setTypeface(m153062r0);
            }
            while (true) {
                if (m153062r0 != null) {
                    textPaint.setTypeface(m153062r0);
                }
                float f21 = m118742r;
                textPaint.setTextSize(f21);
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                Typeface typeface = m153062r0;
                int m118742r2 = AbstractC23136l9.m118742r(c31890dc.m153241g(this.f45581O0, i14)) - ((int) (fontMetrics.descent - fontMetrics.ascent));
                this.f45589W0.setTextSize(f21);
                staticLayout = new StaticLayout(charSequence, this.f45589W0, i15, AbstractC22055v0.m115165y(c31890dc.f146515u), 1.0f, m118742r2, true);
                m118742r -= AbstractC23136l9.m118742r(1.0f);
                if (m118742r == 0 || staticLayout.getHeight() <= i12) {
                    break;
                }
                m153062r0 = typeface;
                i14 = i11;
            }
            canvas.save();
            Canvas canvas3 = canvas;
            canvas3.translate(i13, (i12 - staticLayout.getHeight()) / 2);
            staticLayout.draw(canvas3);
            canvas3.restore();
            C28227x3 m44807q1 = m44807q1(m118722k0, i12);
            if (m44807q1 == null) {
                m44807q1 = new C28227x3(m118722k0 / 2, i12 / 2);
            }
            C23999j.m125686E1(new C3979l(Bitmap.createScaledBitmap(createBitmap, m44807q1.f131648a, m44807q1.f131649b, false), m120133j.f116266g), m153343h, m120133j);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

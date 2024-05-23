package com.zing.zalo.uidrawing;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.zing.zalo.uidrawing.d */
/* loaded from: classes4.dex */
public class C16716d extends C16719g implements InterfaceC16721i {

    /* renamed from: D0 */
    protected List f84695D0;

    /* renamed from: E0 */
    private C16719g f84696E0;

    /* renamed from: F0 */
    private int f84697F0;

    /* renamed from: G0 */
    private int f84698G0;

    /* renamed from: H0 */
    private int f84699H0;

    /* renamed from: I0 */
    private int f84700I0;

    /* renamed from: J0 */
    private int f84701J0;

    /* renamed from: K0 */
    private int f84702K0;

    /* renamed from: L0 */
    private boolean f84703L0;

    public C16716d(Context context) {
        super(context);
        this.f84695D0 = new LinkedList();
        this.f84703L0 = true;
    }

    /* renamed from: i1 */
    private boolean m88999i1(C16719g c16719g, MotionEvent motionEvent) {
        int x11 = (int) (((motionEvent.getX() - getPaddingLeft()) - this.f84753M) - this.f84767a0);
        int y11 = (int) (((motionEvent.getY() - getPaddingTop()) - this.f84754N) - this.f84768b0);
        if (x11 < c16719g.f84745E && x11 > c16719g.f84743C && y11 > c16719g.f84744D && y11 < c16719g.f84746F) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: Q0 */
    public void mo89000Q0(boolean z11) {
        super.mo89000Q0(z11);
        for (C16719g c16719g : this.f84695D0) {
            if (!z11 || (!c16719g.mo89149n() && !c16719g.m89148m0())) {
                c16719g.mo89000Q0(z11);
            }
        }
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    /* renamed from: c */
    public void mo88988c() {
        mo65871t0(MotionEvent.obtain(0L, 0L, 3, this.f84743C, this.f84744D, 0));
        if (m89116Q() != null) {
            m89116Q().mo88988c();
        }
    }

    /* renamed from: g1 */
    public void m89001g1(C16719g c16719g) {
        if (c16719g != null && c16719g.m89116Q() != null) {
            return;
        }
        this.f84695D0.add(c16719g);
        c16719g.m89115P0(this);
        requestLayout();
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getChildCoordinateX() {
        return m89096G() + this.f84753M + getPaddingLeft();
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getChildCoordinateY() {
        return m89098H() + this.f84754N + getPaddingTop();
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getCurrentHeight() {
        return this.f84702K0;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getCurrentWidth() {
        return this.f84701J0;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getHeightMeasureMode() {
        return this.f84700I0;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getHeightMeasureSize() {
        return this.f84699H0;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public List getModules() {
        return this.f84695D0;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getPaddingBottom() {
        return m89106L().f84719o;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getPaddingLeft() {
        return m89106L().f84716l;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getPaddingRight() {
        return m89106L().f84718n;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getPaddingTop() {
        return m89106L().f84717m;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public ViewGroup getRoot() {
        return this.f84784q;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getWidthMeasureMode() {
        return this.f84698G0;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getWidthMeasureSize() {
        return this.f84697F0;
    }

    /* renamed from: h1 */
    public void m89002h1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16719g c16719g = (C16719g) it.next();
            if (c16719g != null && c16719g.m89116Q() == null) {
                this.f84695D0.add(c16719g);
                c16719g.m89115P0(this);
            }
        }
        requestLayout();
    }

    /* renamed from: j1 */
    public void m89003j1() {
        for (C16719g c16719g : this.f84695D0) {
            c16719g.m89115P0(null);
            c16719g.mo89147m();
        }
        this.f84695D0.clear();
        requestLayout();
    }

    /* renamed from: k1 */
    public C16719g m89004k1(int i11) {
        if (i11 >= 0 && i11 < this.f84695D0.size()) {
            return (C16719g) this.f84695D0.get(i11);
        }
        return null;
    }

    /* renamed from: l1 */
    public int m89005l1() {
        return this.f84695D0.size();
    }

    /* renamed from: m1 */
    public void m89006m1(C16719g c16719g) {
        if (c16719g != null) {
            this.f84695D0.remove(c16719g);
            c16719g.m89115P0(null);
            c16719g.mo89147m();
            requestLayout();
        }
    }

    /* renamed from: n1 */
    public void m89007n1(boolean z11) {
        if (z11 != this.f84703L0) {
            this.f84703L0 = z11;
            invalidate();
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: p0 */
    public void mo44848p0(int i11, int i12, int i13, int i14) {
        super.mo44848p0(i11, i12, i13, i14);
        for (C16719g c16719g : this.f84695D0) {
            if (c16719g != null) {
                c16719g.m89146l0(c16719g.f84743C, c16719g.f84744D, c16719g.f84745E, c16719g.f84746F);
            }
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31 = i11;
        this.f84697F0 = getPaddingLeft() + i31 + getPaddingRight();
        this.f84698G0 = i12;
        this.f84699H0 = getPaddingTop() + i13 + getPaddingBottom();
        this.f84700I0 = i14;
        this.f84697F0 = C16718f.m89016r(this.f84697F0, m89106L().f84727w, m89106L().f84729y);
        int m89016r = C16718f.m89016r(this.f84699H0, m89106L().f84728x, m89106L().f84730z);
        this.f84699H0 = m89016r;
        if (this.f84698G0 == 1073741824) {
            i15 = this.f84697F0;
        } else {
            i15 = 0;
        }
        this.f84701J0 = i15;
        if (this.f84700I0 != 1073741824) {
            m89016r = 0;
        }
        this.f84702K0 = m89016r;
        Iterator it = this.f84695D0.iterator();
        int i32 = Integer.MAX_VALUE;
        int i33 = Integer.MAX_VALUE;
        int i34 = 0;
        boolean z13 = false;
        int i35 = 0;
        boolean z14 = false;
        while (true) {
            z11 = true;
            if (!it.hasNext()) {
                break;
            }
            C16719g c16719g = (C16719g) it.next();
            if (c16719g != null) {
                c16719g.m89150n0(i31, i12, i13, i14);
                if (c16719g.m89136d0() != 8) {
                    int i36 = c16719g.f84743C;
                    if (i36 != Integer.MIN_VALUE && i36 != -2147483647 && (i29 = i36 - c16719g.m89106L().f84720p) < i32) {
                        i32 = i29;
                    }
                    int i37 = c16719g.f84744D;
                    if (i37 != Integer.MIN_VALUE && i37 != -2147483647 && (i28 = i37 - c16719g.m89106L().f84721q) < i33) {
                        i33 = i28;
                    }
                    int i38 = c16719g.f84745E;
                    if (i38 != Integer.MIN_VALUE && i38 != -2147483647 && (i27 = i38 + c16719g.m89106L().f84722r) > i34) {
                        i34 = i27;
                    }
                    int i39 = c16719g.f84746F;
                    if (i39 != Integer.MIN_VALUE && i39 != -2147483647 && (i26 = i39 + c16719g.m89106L().f84723s) > i35) {
                        i35 = i26;
                    }
                    if (this.f84698G0 != 1073741824) {
                        int paddingLeft = (i34 - i32) + getPaddingLeft() + getPaddingRight();
                        if (this.f84698G0 == Integer.MIN_VALUE && paddingLeft > (i25 = this.f84697F0)) {
                            this.f84701J0 = i25;
                        } else {
                            this.f84701J0 = paddingLeft;
                        }
                    }
                    if (this.f84700I0 != 1073741824) {
                        int paddingTop = (i35 - i33) + getPaddingTop() + getPaddingBottom();
                        if (this.f84700I0 == Integer.MIN_VALUE && paddingTop > (i24 = this.f84699H0)) {
                            this.f84702K0 = i24;
                        } else {
                            this.f84702K0 = paddingTop;
                        }
                    }
                    if (c16719g.f84755O) {
                        z13 = true;
                    }
                    if (c16719g.f84756P || c16719g.f84757Q) {
                        z14 = true;
                    }
                }
            }
        }
        if (getWidthMeasureMode() != 1073741824 && i32 != 0) {
            for (C16719g c16719g2 : this.f84695D0) {
                c16719g2.f84743C -= i32;
                c16719g2.f84745E -= i32;
            }
            i34 -= i32;
            i32 = 0;
        }
        if (getHeightMeasureMode() != 1073741824 && i33 != 0) {
            for (C16719g c16719g3 : this.f84695D0) {
                c16719g3.f84744D -= i33;
                c16719g3.f84746F -= i33;
            }
            i35 -= i33;
            i33 = 0;
        }
        if (this.f84698G0 != 1073741824) {
            this.f84698G0 = 1073741824;
            int m89016r2 = C16718f.m89016r(this.f84701J0, m89106L().f84727w, m89106L().f84729y);
            this.f84697F0 = m89016r2;
            if (this.f84701J0 != m89016r2) {
                this.f84701J0 = m89016r2;
                z12 = true;
            } else {
                z12 = false;
            }
            i31 = (m89016r2 - getPaddingLeft()) - getPaddingRight();
        } else {
            z12 = false;
        }
        if (this.f84700I0 != 1073741824) {
            this.f84700I0 = 1073741824;
            int m89016r3 = C16718f.m89016r(this.f84702K0, m89106L().f84728x, m89106L().f84730z);
            this.f84699H0 = m89016r3;
            if (this.f84702K0 != m89016r3) {
                this.f84702K0 = m89016r3;
            } else {
                z11 = z12;
            }
            i16 = (m89016r3 - getPaddingTop()) - getPaddingBottom();
        } else {
            z11 = z12;
            i16 = i13;
        }
        if (z13) {
            for (C16719g c16719g4 : this.f84695D0) {
                if (c16719g4 != null && c16719g4.f84755O) {
                    c16719g4.f84755O = false;
                    c16719g4.m89150n0(i31, this.f84698G0, i16, this.f84700I0);
                }
            }
        }
        if (z14 || z11) {
            if (z11) {
                i18 = 0;
                i33 = Integer.MAX_VALUE;
                i35 = 0;
                i17 = Integer.MAX_VALUE;
            } else {
                i17 = i32;
                i18 = i34;
            }
            i34 = i18;
            i32 = i17;
            for (C16719g c16719g5 : this.f84695D0) {
                if (c16719g5.m89136d0() != 8) {
                    if (z14) {
                        c16719g5.m89157w0();
                    }
                    if (z11) {
                        int i41 = c16719g5.f84743C;
                        if (i41 != Integer.MIN_VALUE && i41 != -2147483647 && (i23 = i41 - c16719g5.m89106L().f84720p) < i32) {
                            i32 = i23;
                        }
                        int i42 = c16719g5.f84744D;
                        if (i42 != Integer.MIN_VALUE && i42 != -2147483647 && (i22 = i42 - c16719g5.m89106L().f84721q) < i33) {
                            i33 = i22;
                        }
                        int i43 = c16719g5.f84745E;
                        if (i43 != Integer.MIN_VALUE && i43 != -2147483647 && (i21 = i43 + c16719g5.m89106L().f84722r) > i34) {
                            i34 = i21;
                        }
                        int i44 = c16719g5.f84746F;
                        if (i44 != Integer.MIN_VALUE) {
                            if (i44 != -2147483647 && (i19 = i44 + c16719g5.m89106L().f84723s) > i35) {
                                i35 = i19;
                            }
                        }
                    }
                }
            }
        }
        m89095F0(i32, i33, i34, i35);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r0 */
    public boolean mo89008r0() {
        Iterator it = this.f84695D0.iterator();
        while (it.hasNext()) {
            ((C16719g) it.next()).m89117R0(m89084A());
        }
        return super.mo89008r0();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: s */
    public void mo44179s(Canvas canvas) {
        super.mo44179s(canvas);
        List<C16719g> list = this.f84695D0;
        boolean z11 = this.f84703L0;
        C16718f m89106L = m89106L();
        int i11 = this.f84753M;
        int i12 = this.f84754N;
        canvas.save();
        if (z11) {
            int i13 = -i11;
            int i14 = -i12;
            canvas.clipRect(m89106L.f84716l + i13, m89106L.f84717m + i14, (i13 + m89114P()) - m89106L.f84718n, (i14 + m89112O()) - m89106L.f84719o);
        }
        canvas.translate(m89106L().f84716l, m89106L().f84717m);
        for (C16719g c16719g : list) {
            if (c16719g.m89136d0() == 0) {
                c16719g.m89152u(canvas);
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0130, code lost:            if (r5 == false) goto L85;     */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo65871t0(MotionEvent motionEvent) {
        boolean z11;
        if (!m89143j0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f84696E0 != null) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        int paddingLeft = (-this.f84753M) - getPaddingLeft();
                        C16719g c16719g = this.f84696E0;
                        float f11 = (paddingLeft - c16719g.f84743C) - c16719g.f84767a0;
                        int paddingTop = (-this.f84754N) - getPaddingTop();
                        C16719g c16719g2 = this.f84696E0;
                        motionEvent.offsetLocation(f11, (paddingTop - c16719g2.f84744D) - c16719g2.f84768b0);
                        z11 = this.f84696E0.mo65871t0(motionEvent);
                        motionEvent.setLocation(x11, y11);
                        this.f84696E0 = null;
                    }
                    if (!super.mo65871t0(motionEvent)) {
                        return false;
                    }
                } else {
                    if (this.f84696E0 != null) {
                        float x12 = motionEvent.getX();
                        float y12 = motionEvent.getY();
                        int paddingLeft2 = (-this.f84753M) - getPaddingLeft();
                        C16719g c16719g3 = this.f84696E0;
                        float f12 = (paddingLeft2 - c16719g3.f84743C) - c16719g3.f84767a0;
                        int paddingTop2 = (-this.f84754N) - getPaddingTop();
                        C16719g c16719g4 = this.f84696E0;
                        motionEvent.offsetLocation(f12, (paddingTop2 - c16719g4.f84744D) - c16719g4.f84768b0);
                        z11 = this.f84696E0.mo65871t0(motionEvent);
                        motionEvent.setLocation(x12, y12);
                    }
                    if (!super.mo65871t0(motionEvent)) {
                    }
                }
            } else {
                if (this.f84696E0 != null) {
                    float x13 = motionEvent.getX();
                    float y13 = motionEvent.getY();
                    int paddingLeft3 = (-this.f84753M) - getPaddingLeft();
                    C16719g c16719g5 = this.f84696E0;
                    float f13 = (paddingLeft3 - c16719g5.f84743C) - c16719g5.f84767a0;
                    int paddingTop3 = (-this.f84754N) - getPaddingTop();
                    C16719g c16719g6 = this.f84696E0;
                    motionEvent.offsetLocation(f13, (paddingTop3 - c16719g6.f84744D) - c16719g6.f84768b0);
                    z11 = this.f84696E0.mo65871t0(motionEvent);
                    motionEvent.setLocation(x13, y13);
                    this.f84696E0 = null;
                }
                if (!super.mo65871t0(motionEvent)) {
                }
            }
            return true;
        }
        this.f84696E0 = null;
        int m89005l1 = m89005l1() - 1;
        boolean z12 = false;
        while (true) {
            if (m89005l1 >= 0) {
                C16719g c16719g7 = (C16719g) this.f84695D0.get(m89005l1);
                if (c16719g7.m89136d0() == 0 && c16719g7.m89143j0() && m88999i1(c16719g7, motionEvent)) {
                    float x14 = motionEvent.getX();
                    float y14 = motionEvent.getY();
                    motionEvent.offsetLocation((((-this.f84753M) - getPaddingLeft()) - c16719g7.f84743C) - c16719g7.f84767a0, (((-this.f84754N) - getPaddingTop()) - c16719g7.f84744D) - c16719g7.f84768b0);
                    boolean mo65871t0 = c16719g7.mo65871t0(motionEvent);
                    motionEvent.setLocation(x14, y14);
                    if (mo65871t0) {
                        this.f84696E0 = c16719g7;
                        z11 = mo65871t0;
                        break;
                    }
                    z12 = mo65871t0;
                }
                m89005l1--;
            } else {
                z11 = z12;
                break;
            }
        }
    }
}

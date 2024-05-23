package com.zing.zalo.uidrawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import hd0.AbstractC20004b;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kd0.C21697g;

/* loaded from: classes4.dex */
public class ModulesView extends FrameLayout implements InterfaceC16721i {

    /* renamed from: J */
    static Comparator f84665J;

    /* renamed from: A */
    int f84666A;

    /* renamed from: B */
    private boolean f84667B;

    /* renamed from: C */
    boolean f84668C;

    /* renamed from: D */
    int f84669D;

    /* renamed from: E */
    int f84670E;

    /* renamed from: F */
    int f84671F;

    /* renamed from: G */
    int f84672G;

    /* renamed from: H */
    int f84673H;

    /* renamed from: I */
    int f84674I;

    /* renamed from: p */
    protected Context f84675p;

    /* renamed from: q */
    List f84676q;

    /* renamed from: r */
    C16719g f84677r;

    /* renamed from: s */
    public int f84678s;

    /* renamed from: t */
    public int f84679t;

    /* renamed from: u */
    int f84680u;

    /* renamed from: v */
    int f84681v;

    /* renamed from: w */
    int f84682w;

    /* renamed from: x */
    int f84683x;

    /* renamed from: y */
    int f84684y;

    /* renamed from: z */
    int f84685z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uidrawing.ModulesView$a */
    /* loaded from: classes4.dex */
    public static class C16712a implements Comparator {
        C16712a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C16719g c16719g, C16719g c16719g2) {
            if (ModulesView.m88983R(c16719g2) < ModulesView.m88983R(c16719g)) {
                return 1;
            }
            if (ModulesView.m88983R(c16719g2) > ModulesView.m88983R(c16719g)) {
                return -1;
            }
            if (ModulesView.m88982Q(c16719g2) < ModulesView.m88982Q(c16719g)) {
                return 1;
            }
            if (ModulesView.m88982Q(c16719g2) > ModulesView.m88983R(c16719g)) {
                return -1;
            }
            return 0;
        }
    }

    public ModulesView(Context context) {
        this(context, null);
    }

    /* renamed from: N */
    private boolean m88981N(C16719g c16719g, MotionEvent motionEvent) {
        int x11 = (int) (((motionEvent.getX() - getPaddingLeft()) - this.f84685z) - c16719g.f84767a0);
        int y11 = (int) (((motionEvent.getY() - getPaddingTop()) - this.f84666A) - c16719g.f84768b0);
        if (x11 < c16719g.f84745E && x11 > c16719g.f84743C && y11 > c16719g.f84744D && y11 < c16719g.f84746F) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    static int m88982Q(C16719g c16719g) {
        return c16719g.f84753M + c16719g.m89096G();
    }

    /* renamed from: R */
    static int m88983R(C16719g c16719g) {
        return c16719g.f84754N + c16719g.m89098H();
    }

    private String getAccessibilityText() {
        StringBuilder sb2 = new StringBuilder();
        try {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList(this.f84676q);
            while (!linkedList2.isEmpty()) {
                C16719g c16719g = (C16719g) linkedList2.poll();
                if (c16719g != null && c16719g.m89144k0() && !c16719g.m89104K()) {
                    if (c16719g instanceof C21697g) {
                        linkedList.add((C21697g) c16719g);
                    } else if (c16719g instanceof C16716d) {
                        linkedList2.addAll(((C16716d) c16719g).getModules());
                    }
                }
            }
            if (f84665J == null) {
                f84665J = new C16712a();
            }
            Collections.sort(linkedList, f84665J);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb2.append(((C21697g) it.next()).m111973m1());
                sb2.append("\n");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return sb2.toString();
    }

    /* renamed from: L */
    public void mo69681L(C16719g c16719g) {
        if (c16719g.m89116Q() != null) {
            return;
        }
        this.f84676q.add(c16719g);
        c16719g.m89115P0(this);
        requestLayout();
    }

    /* renamed from: M */
    public void mo69682M(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16719g c16719g = (C16719g) it.next();
            if (c16719g != null && c16719g.m89116Q() == null) {
                this.f84676q.add(c16719g);
                c16719g.m89115P0(this);
            }
        }
        requestLayout();
    }

    /* renamed from: O */
    public void mo44090O() {
        for (C16719g c16719g : this.f84676q) {
            c16719g.m89115P0(null);
            c16719g.mo89147m();
        }
        this.f84676q.clear();
        requestLayout();
    }

    /* renamed from: P */
    void m88984P() {
        if (getWidth() > 0 && getHeight() > 0) {
            this.f84685z = 0;
            this.f84666A = 0;
            int gravity = getGravity();
            if (!AbstractC20004b.m103812c(gravity)) {
                if (AbstractC20004b.m103811b(gravity)) {
                    this.f84685z = -this.f84680u;
                } else if (AbstractC20004b.m103813d(gravity)) {
                    this.f84685z = (getWidth() - ((this.f84678s + getPaddingLeft()) + getPaddingRight())) - this.f84680u;
                } else if (AbstractC20004b.m103810a(gravity)) {
                    this.f84685z = ((getWidth() - ((this.f84678s + getPaddingLeft()) + getPaddingRight())) / 2) - this.f84680u;
                }
            }
            if (!AbstractC20004b.m103816g(gravity)) {
                if (AbstractC20004b.m103817h(gravity)) {
                    this.f84666A = -this.f84681v;
                } else if (AbstractC20004b.m103814e(gravity)) {
                    this.f84666A = (getHeight() - ((this.f84679t + getPaddingTop()) + getPaddingBottom())) - this.f84681v;
                } else if (AbstractC20004b.m103815f(gravity)) {
                    this.f84666A = ((getHeight() - ((this.f84679t + getPaddingTop()) + getPaddingBottom())) / 2) - this.f84681v;
                }
            }
        }
    }

    /* renamed from: S */
    public void m88985S(C16719g c16719g) {
        if (c16719g != null) {
            this.f84676q.remove(c16719g);
            c16719g.m89115P0(null);
            c16719g.mo89147m();
            requestLayout();
        }
    }

    /* renamed from: T */
    protected final void m88986T(int i11, int i12, int i13, int i14) {
        this.f84680u = i11;
        this.f84681v = i12;
        this.f84682w = i13;
        this.f84683x = i14;
        this.f84678s = Math.max(i13 - i11, 0);
        this.f84679t = Math.max(i14 - i12, 0);
    }

    /* renamed from: U */
    public void m88987U(int i11, int i12) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(i11, i12));
        } else {
            layoutParams.width = i11;
            layoutParams.height = i12;
        }
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    /* renamed from: c */
    public void mo88988c() {
        onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getChildCoordinateX() {
        return getPaddingLeft() + this.f84685z;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getChildCoordinateY() {
        return getPaddingTop() + this.f84666A;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getCurrentHeight() {
        return this.f84674I;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getCurrentWidth() {
        return this.f84673H;
    }

    public int getGravity() {
        return this.f84684y;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getHeightMeasureMode() {
        return this.f84672G;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getHeightMeasureSize() {
        return this.f84671F;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public List<C16719g> getModules() {
        return this.f84676q;
    }

    public int getModulesCount() {
        return this.f84676q.size();
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public ViewGroup getRoot() {
        return this;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getWidthMeasureMode() {
        return this.f84670E;
    }

    @Override // com.zing.zalo.uidrawing.InterfaceC16721i
    public int getWidthMeasureSize() {
        return this.f84669D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0 && this.f84678s > 0 && this.f84679t > 0) {
            List<C16719g> list = this.f84676q;
            int paddingLeft = this.f84685z + getPaddingLeft();
            int paddingTop = this.f84666A + getPaddingTop();
            boolean z11 = this.f84667B;
            canvas.save();
            if (z11) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                canvas.clipRect(paddingLeft2, paddingTop2, ((getWidth() + paddingLeft2) - getPaddingLeft()) - getPaddingRight(), ((getHeight() + paddingTop2) - getPaddingTop()) - getPaddingBottom());
            }
            canvas.translate(paddingLeft, paddingTop);
            for (C16719g c16719g : list) {
                if (c16719g.m89136d0() == 0) {
                    c16719g.m89152u(canvas);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(false);
        String accessibilityText = getAccessibilityText();
        if (!TextUtils.isEmpty(accessibilityText)) {
            accessibilityNodeInfo.setText(accessibilityText);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        for (C16719g c16719g : this.f84676q) {
            if (c16719g != null) {
                c16719g.m89146l0(c16719g.f84743C, c16719g.f84744D, c16719g.f84745E, c16719g.f84746F);
            }
        }
        m88984P();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        super.onMeasure(i11, i12);
        this.f84669D = View.MeasureSpec.getSize(i11);
        this.f84670E = View.MeasureSpec.getMode(i11);
        this.f84671F = View.MeasureSpec.getSize(i12);
        this.f84672G = View.MeasureSpec.getMode(i12);
        int paddingLeft = (this.f84669D - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (this.f84671F - getPaddingTop()) - getPaddingBottom();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        if (this.f84670E == 1073741824) {
            i13 = this.f84669D;
        } else {
            i13 = 0;
        }
        this.f84673H = i13;
        if (this.f84672G == 1073741824) {
            i14 = this.f84671F;
        } else {
            i14 = 0;
        }
        this.f84674I = i14;
        this.f84678s = 0;
        this.f84679t = 0;
        int i22 = Integer.MAX_VALUE;
        int i23 = Integer.MAX_VALUE;
        int i24 = 0;
        boolean z11 = false;
        int i25 = 0;
        boolean z12 = false;
        for (C16719g c16719g : this.f84676q) {
            if (c16719g != null) {
                c16719g.m89150n0(paddingLeft, this.f84670E, paddingTop, this.f84672G);
                if (c16719g.m89136d0() != 8) {
                    int i26 = c16719g.f84743C;
                    if (i26 != Integer.MIN_VALUE && i26 != -2147483647 && (i21 = i26 - c16719g.m89106L().f84720p) < i22) {
                        i22 = i21;
                    }
                    int i27 = c16719g.f84744D;
                    if (i27 != Integer.MIN_VALUE && i27 != -2147483647 && (i19 = i27 - c16719g.m89106L().f84721q) < i23) {
                        i23 = i19;
                    }
                    int i28 = c16719g.f84745E;
                    if (i28 != Integer.MIN_VALUE && i28 != -2147483647 && (i18 = i28 + c16719g.m89106L().f84722r) > i24) {
                        i24 = i18;
                    }
                    int i29 = c16719g.f84746F;
                    if (i29 != Integer.MIN_VALUE && i29 != -2147483647 && (i17 = i29 + c16719g.m89106L().f84723s) > i25) {
                        i25 = i17;
                    }
                    if (this.f84670E != 1073741824) {
                        int paddingLeft2 = (i24 - i22) + getPaddingLeft() + getPaddingRight();
                        if (this.f84670E == Integer.MIN_VALUE && paddingLeft2 > (i16 = this.f84669D)) {
                            this.f84673H = i16;
                        } else {
                            this.f84673H = paddingLeft2;
                        }
                    }
                    if (this.f84672G != 1073741824) {
                        int paddingTop2 = (i25 - i23) + getPaddingTop() + getPaddingBottom();
                        if (this.f84672G == Integer.MIN_VALUE && paddingTop2 > (i15 = this.f84671F)) {
                            this.f84674I = i15;
                        } else {
                            this.f84674I = paddingTop2;
                        }
                    }
                    if (c16719g.f84755O) {
                        z11 = true;
                    }
                    if (c16719g.f84756P || c16719g.f84757Q) {
                        z12 = true;
                    }
                }
            }
        }
        if (getWidthMeasureMode() != 1073741824 && i22 != 0) {
            for (C16719g c16719g2 : this.f84676q) {
                c16719g2.f84743C -= i22;
                c16719g2.f84745E -= i22;
            }
            i24 -= i22;
            i22 = 0;
        }
        if (getHeightMeasureMode() != 1073741824 && i23 != 0) {
            for (C16719g c16719g3 : this.f84676q) {
                c16719g3.f84744D -= i23;
                c16719g3.f84746F -= i23;
            }
            i25 -= i23;
            i23 = 0;
        }
        if (this.f84670E != 1073741824) {
            this.f84670E = 1073741824;
            int i31 = this.f84673H;
            this.f84669D = i31;
            paddingLeft = Math.max((i31 - getPaddingLeft()) - getPaddingRight(), 0);
        }
        if (this.f84672G != 1073741824) {
            int i32 = this.f84674I;
            this.f84671F = i32;
            this.f84672G = 1073741824;
            paddingTop = Math.max((i32 - getPaddingTop()) - getPaddingBottom(), 0);
        }
        if (z11) {
            for (C16719g c16719g4 : this.f84676q) {
                if (c16719g4 != null && c16719g4.f84755O) {
                    c16719g4.f84755O = false;
                    c16719g4.m89150n0(paddingLeft, this.f84670E, paddingTop, this.f84672G);
                }
            }
        }
        if (z12) {
            for (C16719g c16719g5 : this.f84676q) {
                if (c16719g5.m89136d0() != 8) {
                    c16719g5.m89157w0();
                }
            }
        }
        m88986T(i22, i23, i24, i25);
        setMeasuredDimension(this.f84673H, this.f84674I);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0132 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f84677r != null) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        int paddingLeft = (-this.f84685z) - getPaddingLeft();
                        C16719g c16719g = this.f84677r;
                        float f11 = (paddingLeft - c16719g.f84743C) - c16719g.f84767a0;
                        int paddingTop = (-this.f84666A) - getPaddingTop();
                        C16719g c16719g2 = this.f84677r;
                        motionEvent.offsetLocation(f11, (paddingTop - c16719g2.f84744D) - c16719g2.f84768b0);
                        z11 = this.f84677r.mo65871t0(motionEvent);
                        motionEvent.setLocation(x11, y11);
                        this.f84677r = null;
                    }
                    if (!super.onTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
                if (this.f84677r != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    int paddingLeft2 = (-this.f84685z) - getPaddingLeft();
                    C16719g c16719g3 = this.f84677r;
                    float f12 = (paddingLeft2 - c16719g3.f84743C) - c16719g3.f84767a0;
                    int paddingTop2 = (-this.f84666A) - getPaddingTop();
                    C16719g c16719g4 = this.f84677r;
                    motionEvent.offsetLocation(f12, (paddingTop2 - c16719g4.f84744D) - c16719g4.f84768b0);
                    z11 = this.f84677r.mo65871t0(motionEvent);
                    motionEvent.setLocation(x12, y12);
                }
                if (!super.onTouchEvent(motionEvent)) {
                }
            } else {
                if (this.f84677r != null) {
                    float x13 = motionEvent.getX();
                    float y13 = motionEvent.getY();
                    int paddingLeft3 = (-this.f84685z) - getPaddingLeft();
                    C16719g c16719g5 = this.f84677r;
                    float f13 = (paddingLeft3 - c16719g5.f84743C) - c16719g5.f84767a0;
                    int paddingTop3 = (-this.f84666A) - getPaddingTop();
                    C16719g c16719g6 = this.f84677r;
                    motionEvent.offsetLocation(f13, (paddingTop3 - c16719g6.f84744D) - c16719g6.f84768b0);
                    z11 = this.f84677r.mo65871t0(motionEvent);
                    motionEvent.setLocation(x13, y13);
                    this.f84677r = null;
                }
                if (!super.onTouchEvent(motionEvent)) {
                }
            }
        } else {
            this.f84677r = null;
            int modulesCount = getModulesCount() - 1;
            boolean z12 = false;
            while (true) {
                if (modulesCount >= 0) {
                    C16719g c16719g7 = (C16719g) this.f84676q.get(modulesCount);
                    if (c16719g7.m89136d0() == 0 && c16719g7.m89143j0() && m88981N(c16719g7, motionEvent)) {
                        float x14 = motionEvent.getX();
                        float y14 = motionEvent.getY();
                        motionEvent.offsetLocation((((-this.f84685z) - getPaddingLeft()) - c16719g7.f84743C) - c16719g7.f84767a0, (((-this.f84666A) - getPaddingTop()) - c16719g7.f84744D) - c16719g7.f84768b0);
                        boolean mo65871t0 = c16719g7.mo65871t0(motionEvent);
                        motionEvent.setLocation(x14, y14);
                        if (mo65871t0) {
                            this.f84677r = c16719g7;
                            z11 = mo65871t0;
                            break;
                        }
                        z12 = mo65871t0;
                    }
                    modulesCount--;
                } else {
                    z11 = z12;
                    break;
                }
            }
        }
        if (z11) {
            return true;
        }
        if (!super.onTouchEvent(motionEvent)) {
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z11) {
        if (z11 != this.f84667B) {
            this.f84667B = z11;
            invalidate();
        }
    }

    public void setGravity(int i11) {
        if (this.f84684y != i11) {
            this.f84684y = i11;
            invalidate();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        super.setPressed(z11);
        for (C16719g c16719g : this.f84676q) {
            if (!z11 || (!c16719g.mo89149n() && !c16719g.m89148m0())) {
                c16719g.mo89000Q0(z11);
            }
        }
    }

    public ModulesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ModulesView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f84676q = new LinkedList();
        this.f84667B = true;
        this.f84675p = context;
        setWillNotDraw(false);
    }
}

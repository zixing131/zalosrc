package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC1261a;
import androidx.constraintlayout.motion.widget.C1265e;
import androidx.constraintlayout.motion.widget.C1268h;
import androidx.constraintlayout.motion.widget.C1273m;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class MotionEffect extends MotionHelper {

    /* renamed from: C */
    private float f4921C;

    /* renamed from: D */
    private int f4922D;

    /* renamed from: E */
    private int f4923E;

    /* renamed from: F */
    private int f4924F;

    /* renamed from: G */
    private int f4925G;

    /* renamed from: H */
    private boolean f4926H;

    /* renamed from: I */
    private int f4927I;

    /* renamed from: J */
    private int f4928J;

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4921C = 0.1f;
        this.f4922D = 49;
        this.f4923E = 50;
        this.f4924F = 0;
        this.f4925G = 0;
        this.f4926H = true;
        this.f4927I = -1;
        this.f4928J = -1;
        m5945G(context, attributeSet);
    }

    /* renamed from: G */
    private void m5945G(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.MotionEffect_motionEffect_start) {
                    int i12 = obtainStyledAttributes.getInt(index, this.f4922D);
                    this.f4922D = i12;
                    this.f4922D = Math.max(Math.min(i12, 99), 0);
                } else if (index == AbstractC1298f.MotionEffect_motionEffect_end) {
                    int i13 = obtainStyledAttributes.getInt(index, this.f4923E);
                    this.f4923E = i13;
                    this.f4923E = Math.max(Math.min(i13, 99), 0);
                } else if (index == AbstractC1298f.MotionEffect_motionEffect_translationX) {
                    this.f4924F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4924F);
                } else if (index == AbstractC1298f.MotionEffect_motionEffect_translationY) {
                    this.f4925G = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4925G);
                } else if (index == AbstractC1298f.MotionEffect_motionEffect_alpha) {
                    this.f4921C = obtainStyledAttributes.getFloat(index, this.f4921C);
                } else if (index == AbstractC1298f.MotionEffect_motionEffect_move) {
                    this.f4928J = obtainStyledAttributes.getInt(index, this.f4928J);
                } else if (index == AbstractC1298f.MotionEffect_motionEffect_strict) {
                    this.f4926H = obtainStyledAttributes.getBoolean(index, this.f4926H);
                } else if (index == AbstractC1298f.MotionEffect_motionEffect_viewTransition) {
                    this.f4927I = obtainStyledAttributes.getResourceId(index, this.f4927I);
                }
            }
            int i14 = this.f4922D;
            int i15 = this.f4923E;
            if (i14 == i15) {
                if (i14 > 0) {
                    this.f4922D = i14 - 1;
                } else {
                    this.f4923E = i15 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x017d, code lost:            if (r14 == 0.0f) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0191, code lost:            if (r14 == 0.0f) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a1, code lost:            if (r15 == 0.0f) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b1, code lost:            if (r15 == 0.0f) goto L46;     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dc  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5946E(MotionLayout motionLayout, HashMap hashMap) {
        C1265e c1265e;
        C1265e c1265e2;
        C1265e c1265e3;
        int i11;
        HashMap hashMap2 = hashMap;
        View[] m6365m = m6365m((ConstraintLayout) getParent());
        if (m6365m == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC1261a.m6057a());
            sb2.append(" views = null");
            return;
        }
        C1265e c1265e4 = new C1265e();
        C1265e c1265e5 = new C1265e();
        c1265e4.m6107R("alpha", Float.valueOf(this.f4921C));
        c1265e5.m6107R("alpha", Float.valueOf(this.f4921C));
        c1265e4.m6070g(this.f4922D);
        c1265e5.m6070g(this.f4923E);
        C1268h c1268h = new C1268h();
        c1268h.m6070g(this.f4922D);
        c1268h.m6113m(0);
        c1268h.m6114n("percentX", 0);
        c1268h.m6114n("percentY", 0);
        C1268h c1268h2 = new C1268h();
        c1268h2.m6070g(this.f4923E);
        c1268h2.m6113m(0);
        int i12 = 1;
        c1268h2.m6114n("percentX", 1);
        c1268h2.m6114n("percentY", 1);
        C1265e c1265e6 = null;
        if (this.f4924F > 0) {
            c1265e = new C1265e();
            c1265e2 = new C1265e();
            c1265e.m6107R("translationX", Integer.valueOf(this.f4924F));
            c1265e.m6070g(this.f4923E);
            c1265e2.m6107R("translationX", 0);
            c1265e2.m6070g(this.f4923E - 1);
        } else {
            c1265e = null;
            c1265e2 = null;
        }
        if (this.f4925G > 0) {
            c1265e6 = new C1265e();
            c1265e3 = new C1265e();
            c1265e6.m6107R("translationY", Integer.valueOf(this.f4925G));
            c1265e6.m6070g(this.f4923E);
            c1265e3.m6107R("translationY", 0);
            c1265e3.m6070g(this.f4923E - 1);
        } else {
            c1265e3 = null;
        }
        int i13 = this.f4928J;
        if (i13 == -1) {
            int[] iArr = new int[4];
            for (View view : m6365m) {
                C1273m c1273m = (C1273m) hashMap2.get(view);
                if (c1273m != null) {
                    float m6153n = c1273m.m6153n() - c1273m.m6157t();
                    float m6154o = c1273m.m6154o() - c1273m.m6158u();
                    if (m6154o < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (m6154o > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (m6153n > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (m6153n < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i14 = iArr[0];
            i13 = 0;
            for (int i15 = 4; i12 < i15; i15 = 4) {
                int i16 = iArr[i12];
                if (i14 < i16) {
                    i14 = i16;
                    i13 = i12;
                }
                i12++;
            }
        }
        int i17 = 0;
        while (i17 < m6365m.length) {
            C1273m c1273m2 = (C1273m) hashMap2.get(m6365m[i17]);
            if (c1273m2 != null) {
                float m6153n2 = c1273m2.m6153n() - c1273m2.m6157t();
                float m6154o2 = c1273m2.m6154o() - c1273m2.m6158u();
                if (i13 == 0) {
                    if (m6154o2 > 0.0f) {
                        if (this.f4926H) {
                        }
                    }
                    i11 = this.f4927I;
                    if (i11 != -1) {
                        c1273m2.m6141a(c1265e4);
                        c1273m2.m6141a(c1265e5);
                        c1273m2.m6141a(c1268h);
                        c1273m2.m6141a(c1268h2);
                        if (this.f4924F > 0) {
                            c1273m2.m6141a(c1265e);
                            c1273m2.m6141a(c1265e2);
                        }
                        if (this.f4925G > 0) {
                            c1273m2.m6141a(c1265e6);
                            c1273m2.m6141a(c1265e3);
                        }
                    } else {
                        motionLayout.m6003b0(i11, c1273m2);
                    }
                } else if (i13 == 1) {
                    if (m6154o2 < 0.0f) {
                        if (this.f4926H) {
                        }
                    }
                    i11 = this.f4927I;
                    if (i11 != -1) {
                    }
                } else if (i13 == 2) {
                    if (m6153n2 < 0.0f) {
                        if (this.f4926H) {
                        }
                    }
                    i11 = this.f4927I;
                    if (i11 != -1) {
                    }
                } else {
                    if (i13 == 3) {
                        if (m6153n2 > 0.0f) {
                            if (this.f4926H) {
                            }
                        }
                    }
                    i11 = this.f4927I;
                    if (i11 != -1) {
                    }
                }
                i17++;
                hashMap2 = hashMap;
            }
            i17++;
            hashMap2 = hashMap;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /* renamed from: y */
    public boolean mo5947y() {
        return true;
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4921C = 0.1f;
        this.f4922D = 49;
        this.f4923E = 50;
        this.f4924F = 0;
        this.f4925G = 0;
        this.f4926H = true;
        this.f4927I = -1;
        this.f4928J = -1;
        m5945G(context, attributeSet);
    }
}

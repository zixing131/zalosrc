package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.q */
/* loaded from: classes2.dex */
public class C1277q {

    /* renamed from: G */
    private static final float[][] f5246G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: H */
    private static final float[][] f5247H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: r */
    private float f5271r;

    /* renamed from: s */
    private float f5272s;

    /* renamed from: t */
    private final MotionLayout f5273t;

    /* renamed from: a */
    private int f5254a = 0;

    /* renamed from: b */
    private int f5255b = 0;

    /* renamed from: c */
    private int f5256c = 0;

    /* renamed from: d */
    private int f5257d = -1;

    /* renamed from: e */
    private int f5258e = -1;

    /* renamed from: f */
    private int f5259f = -1;

    /* renamed from: g */
    private float f5260g = 0.5f;

    /* renamed from: h */
    private float f5261h = 0.5f;

    /* renamed from: i */
    float f5262i = 0.5f;

    /* renamed from: j */
    float f5263j = 0.5f;

    /* renamed from: k */
    private int f5264k = -1;

    /* renamed from: l */
    boolean f5265l = false;

    /* renamed from: m */
    private float f5266m = 0.0f;

    /* renamed from: n */
    private float f5267n = 1.0f;

    /* renamed from: o */
    private boolean f5268o = false;

    /* renamed from: p */
    private float[] f5269p = new float[2];

    /* renamed from: q */
    private int[] f5270q = new int[2];

    /* renamed from: u */
    private float f5274u = 4.0f;

    /* renamed from: v */
    private float f5275v = 1.2f;

    /* renamed from: w */
    private boolean f5276w = true;

    /* renamed from: x */
    private float f5277x = 1.0f;

    /* renamed from: y */
    private int f5278y = 0;

    /* renamed from: z */
    private float f5279z = 10.0f;

    /* renamed from: A */
    private float f5248A = 10.0f;

    /* renamed from: B */
    private float f5249B = 1.0f;

    /* renamed from: C */
    private float f5250C = Float.NaN;

    /* renamed from: D */
    private float f5251D = Float.NaN;

    /* renamed from: E */
    private int f5252E = 0;

    /* renamed from: F */
    private int f5253F = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.q$a */
    /* loaded from: classes2.dex */
    public class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.q$b */
    /* loaded from: classes2.dex */
    public class b implements NestedScrollView.InterfaceC1628c {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC1628c
        /* renamed from: a */
        public void mo4736a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
        }
    }

    public C1277q(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f5273t = motionLayout;
        m6273c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: b */
    private void m6272b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            if (index == AbstractC1298f.OnSwipe_touchAnchorId) {
                this.f5257d = typedArray.getResourceId(index, this.f5257d);
            } else if (index == AbstractC1298f.OnSwipe_touchAnchorSide) {
                int i12 = typedArray.getInt(index, this.f5254a);
                this.f5254a = i12;
                float[] fArr = f5246G[i12];
                this.f5261h = fArr[0];
                this.f5260g = fArr[1];
            } else if (index == AbstractC1298f.OnSwipe_dragDirection) {
                int i13 = typedArray.getInt(index, this.f5255b);
                this.f5255b = i13;
                float[][] fArr2 = f5247H;
                if (i13 < fArr2.length) {
                    float[] fArr3 = fArr2[i13];
                    this.f5266m = fArr3[0];
                    this.f5267n = fArr3[1];
                } else {
                    this.f5267n = Float.NaN;
                    this.f5266m = Float.NaN;
                    this.f5265l = true;
                }
            } else if (index == AbstractC1298f.OnSwipe_maxVelocity) {
                this.f5274u = typedArray.getFloat(index, this.f5274u);
            } else if (index == AbstractC1298f.OnSwipe_maxAcceleration) {
                this.f5275v = typedArray.getFloat(index, this.f5275v);
            } else if (index == AbstractC1298f.OnSwipe_moveWhenScrollAtTop) {
                this.f5276w = typedArray.getBoolean(index, this.f5276w);
            } else if (index == AbstractC1298f.OnSwipe_dragScale) {
                this.f5277x = typedArray.getFloat(index, this.f5277x);
            } else if (index == AbstractC1298f.OnSwipe_dragThreshold) {
                this.f5279z = typedArray.getFloat(index, this.f5279z);
            } else if (index == AbstractC1298f.OnSwipe_touchRegionId) {
                this.f5258e = typedArray.getResourceId(index, this.f5258e);
            } else if (index == AbstractC1298f.OnSwipe_onTouchUp) {
                this.f5256c = typedArray.getInt(index, this.f5256c);
            } else if (index == AbstractC1298f.OnSwipe_nestedScrollFlags) {
                this.f5278y = typedArray.getInteger(index, 0);
            } else if (index == AbstractC1298f.OnSwipe_limitBoundsTo) {
                this.f5259f = typedArray.getResourceId(index, 0);
            } else if (index == AbstractC1298f.OnSwipe_rotationCenterId) {
                this.f5264k = typedArray.getResourceId(index, this.f5264k);
            } else if (index == AbstractC1298f.OnSwipe_springDamping) {
                this.f5248A = typedArray.getFloat(index, this.f5248A);
            } else if (index == AbstractC1298f.OnSwipe_springMass) {
                this.f5249B = typedArray.getFloat(index, this.f5249B);
            } else if (index == AbstractC1298f.OnSwipe_springStiffness) {
                this.f5250C = typedArray.getFloat(index, this.f5250C);
            } else if (index == AbstractC1298f.OnSwipe_springStopThreshold) {
                this.f5251D = typedArray.getFloat(index, this.f5251D);
            } else if (index == AbstractC1298f.OnSwipe_springBoundary) {
                this.f5252E = typedArray.getInt(index, this.f5252E);
            } else if (index == AbstractC1298f.OnSwipe_autoCompleteMode) {
                this.f5253F = typedArray.getInt(index, this.f5253F);
            }
        }
    }

    /* renamed from: c */
    private void m6273c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.OnSwipe);
        m6272b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    public void m6274A() {
        View view;
        int i11 = this.f5257d;
        if (i11 != -1) {
            view = this.f5273t.findViewById(i11);
            if (view == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cannot find TouchAnchorId @id/");
                sb2.append(AbstractC1261a.m6059c(this.f5273t.getContext(), this.f5257d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }

    /* renamed from: a */
    public float m6275a(float f11, float f12) {
        return (f11 * this.f5266m) + (f12 * this.f5267n);
    }

    /* renamed from: d */
    public int m6276d() {
        return this.f5253F;
    }

    /* renamed from: e */
    public int m6277e() {
        return this.f5278y;
    }

    /* renamed from: f */
    public RectF m6278f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i11 = this.f5259f;
        if (i11 == -1 || (findViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* renamed from: g */
    public float m6279g() {
        return this.f5275v;
    }

    /* renamed from: h */
    public float m6280h() {
        return this.f5274u;
    }

    /* renamed from: i */
    public boolean m6281i() {
        return this.f5276w;
    }

    /* renamed from: j */
    public float m6282j(float f11, float f12) {
        this.f5273t.m6007m0(this.f5257d, this.f5273t.getProgress(), this.f5261h, this.f5260g, this.f5269p);
        float f13 = this.f5266m;
        if (f13 != 0.0f) {
            float[] fArr = this.f5269p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f11 * f13) / fArr[0];
        }
        float[] fArr2 = this.f5269p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f12 * this.f5267n) / fArr2[1];
    }

    /* renamed from: k */
    public int m6283k() {
        return this.f5252E;
    }

    /* renamed from: l */
    public float m6284l() {
        return this.f5248A;
    }

    /* renamed from: m */
    public float m6285m() {
        return this.f5249B;
    }

    /* renamed from: n */
    public float m6286n() {
        return this.f5250C;
    }

    /* renamed from: o */
    public float m6287o() {
        return this.f5251D;
    }

    /* renamed from: p */
    public RectF m6288p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i11 = this.f5258e;
        if (i11 == -1 || (findViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* renamed from: q */
    public int m6289q() {
        return this.f5258e;
    }

    /* renamed from: r */
    public boolean m6290r() {
        return this.f5268o;
    }

    /* renamed from: s */
    public void m6291s(MotionEvent motionEvent, MotionLayout.InterfaceC1256g interfaceC1256g, int i11, C1276p c1276p) {
        float f11;
        float f12;
        int i12;
        float f13;
        float f14;
        boolean z11;
        float f15;
        if (this.f5265l) {
            m6292t(motionEvent, interfaceC1256g, i11, c1276p);
            return;
        }
        interfaceC1256g.mo6043a(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.f5272s;
                    float rawX = motionEvent.getRawX() - this.f5271r;
                    if (Math.abs((this.f5266m * rawX) + (this.f5267n * rawY)) > this.f5279z || this.f5268o) {
                        float progress = this.f5273t.getProgress();
                        if (!this.f5268o) {
                            this.f5268o = true;
                            this.f5273t.setProgress(progress);
                        }
                        int i13 = this.f5257d;
                        if (i13 != -1) {
                            this.f5273t.m6007m0(i13, progress, this.f5261h, this.f5260g, this.f5269p);
                        } else {
                            float min = Math.min(this.f5273t.getWidth(), this.f5273t.getHeight());
                            float[] fArr = this.f5269p;
                            fArr[1] = this.f5267n * min;
                            fArr[0] = min * this.f5266m;
                        }
                        float f16 = this.f5266m;
                        float[] fArr2 = this.f5269p;
                        if (Math.abs(((f16 * fArr2[0]) + (this.f5267n * fArr2[1])) * this.f5277x) < 0.01d) {
                            float[] fArr3 = this.f5269p;
                            fArr3[0] = 0.01f;
                            fArr3[1] = 0.01f;
                        }
                        if (this.f5266m != 0.0f) {
                            f14 = rawX / this.f5269p[0];
                        } else {
                            f14 = rawY / this.f5269p[1];
                        }
                        float max = Math.max(Math.min(progress + f14, 1.0f), 0.0f);
                        if (this.f5256c == 6) {
                            max = Math.max(max, 0.01f);
                        }
                        if (this.f5256c == 7) {
                            max = Math.min(max, 0.99f);
                        }
                        float progress2 = this.f5273t.getProgress();
                        if (max != progress2) {
                            if (progress2 == 0.0f || progress2 == 1.0f) {
                                MotionLayout motionLayout = this.f5273t;
                                if (progress2 == 0.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                motionLayout.m6004h0(z11);
                            }
                            this.f5273t.setProgress(max);
                            interfaceC1256g.mo6047e(1000);
                            float mo6045c = interfaceC1256g.mo6045c();
                            float mo6044b = interfaceC1256g.mo6044b();
                            if (this.f5266m != 0.0f) {
                                f15 = mo6045c / this.f5269p[0];
                            } else {
                                f15 = mo6044b / this.f5269p[1];
                            }
                            this.f5273t.f4954Q = f15;
                        } else {
                            this.f5273t.f4954Q = 0.0f;
                        }
                        this.f5271r = motionEvent.getRawX();
                        this.f5272s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f5268o = false;
            interfaceC1256g.mo6047e(1000);
            float mo6045c2 = interfaceC1256g.mo6045c();
            float mo6044b2 = interfaceC1256g.mo6044b();
            float progress3 = this.f5273t.getProgress();
            int i14 = this.f5257d;
            if (i14 != -1) {
                this.f5273t.m6007m0(i14, progress3, this.f5261h, this.f5260g, this.f5269p);
            } else {
                float min2 = Math.min(this.f5273t.getWidth(), this.f5273t.getHeight());
                float[] fArr4 = this.f5269p;
                fArr4[1] = this.f5267n * min2;
                fArr4[0] = min2 * this.f5266m;
            }
            float f17 = this.f5266m;
            float[] fArr5 = this.f5269p;
            float f18 = fArr5[0];
            float f19 = fArr5[1];
            if (f17 != 0.0f) {
                f11 = mo6045c2 / f18;
            } else {
                f11 = mo6044b2 / f19;
            }
            if (!Float.isNaN(f11)) {
                f12 = (f11 / 3.0f) + progress3;
            } else {
                f12 = progress3;
            }
            if (f12 != 0.0f && f12 != 1.0f && (i12 = this.f5256c) != 3) {
                if (f12 < 0.5d) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                if (i12 == 6) {
                    if (progress3 + f11 < 0.0f) {
                        f11 = Math.abs(f11);
                    }
                    f13 = 1.0f;
                }
                if (this.f5256c == 7) {
                    if (progress3 + f11 > 1.0f) {
                        f11 = -Math.abs(f11);
                    }
                    f13 = 0.0f;
                }
                this.f5273t.m5993D0(this.f5256c, f13, f11);
                if (0.0f >= progress3 || 1.0f <= progress3) {
                    this.f5273t.setState(MotionLayout.EnumC1260k.FINISHED);
                    return;
                }
                return;
            }
            if (0.0f >= f12 || 1.0f <= f12) {
                this.f5273t.setState(MotionLayout.EnumC1260k.FINISHED);
                return;
            }
            return;
        }
        this.f5271r = motionEvent.getRawX();
        this.f5272s = motionEvent.getRawY();
        this.f5268o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0290  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m6292t(MotionEvent motionEvent, MotionLayout.InterfaceC1256g interfaceC1256g, int i11, C1276p c1276p) {
        float left;
        float f11;
        int top;
        int bottom;
        int i12;
        float degrees;
        float f12;
        int i13;
        float f13;
        interfaceC1256g.mo6043a(motionEvent);
        int action = motionEvent.getAction();
        boolean z11 = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    motionEvent.getRawY();
                    motionEvent.getRawX();
                    float width = this.f5273t.getWidth() / 2.0f;
                    float height = this.f5273t.getHeight() / 2.0f;
                    int i14 = this.f5264k;
                    if (i14 != -1) {
                        View findViewById = this.f5273t.findViewById(i14);
                        this.f5273t.getLocationOnScreen(this.f5270q);
                        height = ((findViewById.getTop() + findViewById.getBottom()) / 2.0f) + this.f5270q[1];
                        width = this.f5270q[0] + ((findViewById.getLeft() + findViewById.getRight()) / 2.0f);
                    } else {
                        int i15 = this.f5257d;
                        if (i15 != -1) {
                            if (this.f5273t.findViewById(this.f5273t.m6009o0(i15).m6147h()) != null) {
                                this.f5273t.getLocationOnScreen(this.f5270q);
                                width = this.f5270q[0] + ((r12.getLeft() + r12.getRight()) / 2.0f);
                                height = this.f5270q[1] + ((r12.getTop() + r12.getBottom()) / 2.0f);
                            }
                        }
                    }
                    float rawX = motionEvent.getRawX() - width;
                    float rawY = motionEvent.getRawY() - height;
                    float atan2 = (float) (((Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width) - Math.atan2(this.f5272s - height, this.f5271r - width)) * 180.0d) / 3.141592653589793d);
                    if (atan2 > 330.0f) {
                        atan2 -= 360.0f;
                    } else if (atan2 < -330.0f) {
                        atan2 += 360.0f;
                    }
                    if (Math.abs(atan2) > 0.01d || this.f5268o) {
                        float progress = this.f5273t.getProgress();
                        if (!this.f5268o) {
                            this.f5268o = true;
                            this.f5273t.setProgress(progress);
                        }
                        int i16 = this.f5257d;
                        if (i16 != -1) {
                            this.f5273t.m6007m0(i16, progress, this.f5261h, this.f5260g, this.f5269p);
                            this.f5269p[1] = (float) Math.toDegrees(r3[1]);
                        } else {
                            this.f5269p[1] = 360.0f;
                        }
                        float max = Math.max(Math.min(progress + ((atan2 * this.f5277x) / this.f5269p[1]), 1.0f), 0.0f);
                        float progress2 = this.f5273t.getProgress();
                        if (max != progress2) {
                            if (progress2 == 0.0f || progress2 == 1.0f) {
                                MotionLayout motionLayout = this.f5273t;
                                if (progress2 == 0.0f) {
                                    z11 = true;
                                }
                                motionLayout.m6004h0(z11);
                            }
                            this.f5273t.setProgress(max);
                            interfaceC1256g.mo6047e(1000);
                            float mo6045c = interfaceC1256g.mo6045c();
                            double mo6044b = interfaceC1256g.mo6044b();
                            double d11 = mo6045c;
                            this.f5273t.f4954Q = (float) Math.toDegrees((float) ((Math.hypot(mo6044b, d11) * Math.sin(Math.atan2(mo6044b, d11) - r8)) / Math.hypot(rawX, rawY)));
                        } else {
                            this.f5273t.f4954Q = 0.0f;
                        }
                        this.f5271r = motionEvent.getRawX();
                        this.f5272s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f5268o = false;
            interfaceC1256g.mo6047e(16);
            float mo6045c2 = interfaceC1256g.mo6045c();
            float mo6044b2 = interfaceC1256g.mo6044b();
            float progress3 = this.f5273t.getProgress();
            float width2 = this.f5273t.getWidth() / 2.0f;
            float height2 = this.f5273t.getHeight() / 2.0f;
            int i17 = this.f5264k;
            if (i17 != -1) {
                View findViewById2 = this.f5273t.findViewById(i17);
                this.f5273t.getLocationOnScreen(this.f5270q);
                left = this.f5270q[0] + ((findViewById2.getLeft() + findViewById2.getRight()) / 2.0f);
                f11 = this.f5270q[1];
                top = findViewById2.getTop();
                bottom = findViewById2.getBottom();
            } else {
                int i18 = this.f5257d;
                if (i18 != -1) {
                    View findViewById3 = this.f5273t.findViewById(this.f5273t.m6009o0(i18).m6147h());
                    this.f5273t.getLocationOnScreen(this.f5270q);
                    left = this.f5270q[0] + ((findViewById3.getLeft() + findViewById3.getRight()) / 2.0f);
                    f11 = this.f5270q[1];
                    top = findViewById3.getTop();
                    bottom = findViewById3.getBottom();
                }
                float rawX2 = motionEvent.getRawX() - width2;
                double degrees2 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX2));
                i12 = this.f5257d;
                if (i12 == -1) {
                    this.f5273t.m6007m0(i12, progress3, this.f5261h, this.f5260g, this.f5269p);
                    this.f5269p[1] = (float) Math.toDegrees(r3[1]);
                } else {
                    this.f5269p[1] = 360.0f;
                }
                degrees = ((float) (Math.toDegrees(Math.atan2(mo6044b2 + r2, mo6045c2 + rawX2)) - degrees2)) * 62.5f;
                if (Float.isNaN(degrees)) {
                    f12 = (((degrees * 3.0f) * this.f5277x) / this.f5269p[1]) + progress3;
                } else {
                    f12 = progress3;
                }
                if (f12 == 0.0f && f12 != 1.0f && (i13 = this.f5256c) != 3) {
                    float f14 = (degrees * this.f5277x) / this.f5269p[1];
                    if (f12 < 0.5d) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    if (i13 == 6) {
                        if (progress3 + f14 < 0.0f) {
                            f14 = Math.abs(f14);
                        }
                        f13 = 1.0f;
                    }
                    if (this.f5256c == 7) {
                        if (progress3 + f14 > 1.0f) {
                            f14 = -Math.abs(f14);
                        }
                        f13 = 0.0f;
                    }
                    this.f5273t.m5993D0(this.f5256c, f13, f14 * 3.0f);
                    if (0.0f >= progress3 || 1.0f <= progress3) {
                        this.f5273t.setState(MotionLayout.EnumC1260k.FINISHED);
                        return;
                    }
                    return;
                }
                if (0.0f < f12 || 1.0f <= f12) {
                    this.f5273t.setState(MotionLayout.EnumC1260k.FINISHED);
                    return;
                }
                return;
            }
            height2 = f11 + ((top + bottom) / 2.0f);
            width2 = left;
            float rawX22 = motionEvent.getRawX() - width2;
            double degrees22 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX22));
            i12 = this.f5257d;
            if (i12 == -1) {
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(mo6044b2 + r2, mo6045c2 + rawX22)) - degrees22)) * 62.5f;
            if (Float.isNaN(degrees)) {
            }
            if (f12 == 0.0f) {
            }
            if (0.0f < f12) {
            }
            this.f5273t.setState(MotionLayout.EnumC1260k.FINISHED);
            return;
        }
        this.f5271r = motionEvent.getRawX();
        this.f5272s = motionEvent.getRawY();
        this.f5268o = false;
    }

    public String toString() {
        if (Float.isNaN(this.f5266m)) {
            return "rotation";
        }
        return this.f5266m + " , " + this.f5267n;
    }

    /* renamed from: u */
    public void m6293u(float f11, float f12) {
        float f13;
        float progress = this.f5273t.getProgress();
        if (!this.f5268o) {
            this.f5268o = true;
            this.f5273t.setProgress(progress);
        }
        this.f5273t.m6007m0(this.f5257d, progress, this.f5261h, this.f5260g, this.f5269p);
        float f14 = this.f5266m;
        float[] fArr = this.f5269p;
        if (Math.abs((f14 * fArr[0]) + (this.f5267n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f5269p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f15 = this.f5266m;
        if (f15 != 0.0f) {
            f13 = (f11 * f15) / this.f5269p[0];
        } else {
            f13 = (f12 * this.f5267n) / this.f5269p[1];
        }
        float max = Math.max(Math.min(progress + f13, 1.0f), 0.0f);
        if (max != this.f5273t.getProgress()) {
            this.f5273t.setProgress(max);
        }
    }

    /* renamed from: v */
    public void m6294v(float f11, float f12) {
        float f13;
        boolean z11;
        boolean z12 = false;
        this.f5268o = false;
        float progress = this.f5273t.getProgress();
        this.f5273t.m6007m0(this.f5257d, progress, this.f5261h, this.f5260g, this.f5269p);
        float f14 = this.f5266m;
        float[] fArr = this.f5269p;
        float f15 = fArr[0];
        float f16 = this.f5267n;
        float f17 = fArr[1];
        float f18 = 0.0f;
        if (f14 != 0.0f) {
            f13 = (f11 * f14) / f15;
        } else {
            f13 = (f12 * f16) / f17;
        }
        if (!Float.isNaN(f13)) {
            progress += f13 / 3.0f;
        }
        if (progress != 0.0f) {
            if (progress != 1.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = this.f5256c;
            if (i11 != 3) {
                z12 = true;
            }
            if (z12 & z11) {
                MotionLayout motionLayout = this.f5273t;
                if (progress >= 0.5d) {
                    f18 = 1.0f;
                }
                motionLayout.m5993D0(i11, f18, f13);
            }
        }
    }

    /* renamed from: w */
    public void m6295w(float f11, float f12) {
        this.f5271r = f11;
        this.f5272s = f12;
    }

    /* renamed from: x */
    public void m6296x(boolean z11) {
        if (z11) {
            float[][] fArr = f5247H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f5246G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f5247H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f5246G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f5246G[this.f5254a];
        this.f5261h = fArr5[0];
        this.f5260g = fArr5[1];
        int i11 = this.f5255b;
        float[][] fArr6 = f5247H;
        if (i11 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i11];
        this.f5266m = fArr7[0];
        this.f5267n = fArr7[1];
    }

    /* renamed from: y */
    public void m6297y(int i11) {
        this.f5256c = i11;
    }

    /* renamed from: z */
    public void m6298z(float f11, float f12) {
        this.f5271r = f11;
        this.f5272s = f12;
        this.f5268o = false;
    }
}

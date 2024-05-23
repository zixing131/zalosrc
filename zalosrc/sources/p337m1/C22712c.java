package p337m1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.AbstractC1579n0;
import java.util.Arrays;

/* renamed from: m1.c */
/* loaded from: classes2.dex */
public class C22712c {

    /* renamed from: w */
    private static final Interpolator f111278w = new a();

    /* renamed from: a */
    private int f111279a;

    /* renamed from: b */
    private int f111280b;

    /* renamed from: d */
    private float[] f111282d;

    /* renamed from: e */
    private float[] f111283e;

    /* renamed from: f */
    private float[] f111284f;

    /* renamed from: g */
    private float[] f111285g;

    /* renamed from: h */
    private int[] f111286h;

    /* renamed from: i */
    private int[] f111287i;

    /* renamed from: j */
    private int[] f111288j;

    /* renamed from: k */
    private int f111289k;

    /* renamed from: l */
    private VelocityTracker f111290l;

    /* renamed from: m */
    private float f111291m;

    /* renamed from: n */
    private float f111292n;

    /* renamed from: o */
    private int f111293o;

    /* renamed from: p */
    private int f111294p;

    /* renamed from: q */
    private OverScroller f111295q;

    /* renamed from: r */
    private final c f111296r;

    /* renamed from: s */
    private View f111297s;

    /* renamed from: t */
    private boolean f111298t;

    /* renamed from: u */
    private final ViewGroup f111299u;

    /* renamed from: c */
    private int f111281c = -1;

    /* renamed from: v */
    private final Runnable f111300v = new b();

    /* renamed from: m1.c$a */
    /* loaded from: classes2.dex */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    /* renamed from: m1.c$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C22712c.this.m117506K(0);
        }
    }

    /* renamed from: m1.c$c */
    /* loaded from: classes2.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract int mo8626a(View view, int i11, int i12);

        /* renamed from: b */
        public abstract int mo8627b(View view, int i11, int i12);

        /* renamed from: c */
        public int m117523c(int i11) {
            return i11;
        }

        /* renamed from: d */
        public int mo8628d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo31879e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo8629f(int i11, int i12) {
        }

        /* renamed from: g */
        public boolean mo8630g(int i11) {
            return false;
        }

        /* renamed from: h */
        public void mo8631h(int i11, int i12) {
        }

        /* renamed from: i */
        public void mo8632i(View view, int i11) {
        }

        /* renamed from: j */
        public void mo8633j(int i11) {
        }

        /* renamed from: k */
        public abstract void mo8634k(View view, int i11, int i12, int i13, int i14);

        /* renamed from: l */
        public void mo8635l(View view, float f11, float f12) {
        }

        /* renamed from: m */
        public abstract boolean mo8636m(View view, int i11);
    }

    private C22712c(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup != null) {
            if (cVar != null) {
                this.f111299u = viewGroup;
                this.f111296r = cVar;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.f111293o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f111280b = viewConfiguration.getScaledTouchSlop();
                this.f111291m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f111292n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f111295q = new OverScroller(context, f111278w);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    /* renamed from: D */
    private boolean m117480D(int i11) {
        if (!m117503C(i11)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring pointerId=");
            sb2.append(i11);
            sb2.append(" because ACTION_DOWN was not received ");
            sb2.append("for this pointer before ACTION_MOVE. It likely happened because ");
            sb2.append(" ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private void m117481G() {
        this.f111290l.computeCurrentVelocity(1000, this.f111291m);
        m117495q(m117487h(this.f111290l.getXVelocity(this.f111281c), this.f111292n, this.f111291m), m117487h(this.f111290l.getYVelocity(this.f111281c), this.f111292n, this.f111291m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [m1.c$c] */
    /* renamed from: H */
    private void m117482H(float f11, float f12, int i11) {
        boolean m117485d = m117485d(f11, f12, i11, 1);
        boolean z11 = m117485d;
        if (m117485d(f12, f11, i11, 4)) {
            z11 = (m117485d ? 1 : 0) | 4;
        }
        boolean z12 = z11;
        if (m117485d(f11, f12, i11, 2)) {
            z12 = (z11 ? 1 : 0) | 2;
        }
        ?? r02 = z12;
        if (m117485d(f12, f11, i11, 8)) {
            r02 = (z12 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f111287i;
            iArr[i11] = iArr[i11] | r02;
            this.f111296r.mo8629f(r02, i11);
        }
    }

    /* renamed from: I */
    private void m117483I(float f11, float f12, int i11) {
        m117498t(i11);
        float[] fArr = this.f111282d;
        this.f111284f[i11] = f11;
        fArr[i11] = f11;
        float[] fArr2 = this.f111283e;
        this.f111285g[i11] = f12;
        fArr2[i11] = f12;
        this.f111286h[i11] = m117500y((int) f11, (int) f12);
        this.f111289k |= 1 << i11;
    }

    /* renamed from: J */
    private void m117484J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            int pointerId = motionEvent.getPointerId(i11);
            if (m117480D(pointerId)) {
                float x11 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                this.f111284f[pointerId] = x11;
                this.f111285g[pointerId] = y11;
            }
        }
    }

    /* renamed from: d */
    private boolean m117485d(float f11, float f12, int i11, int i12) {
        float abs = Math.abs(f11);
        float abs2 = Math.abs(f12);
        if ((this.f111286h[i11] & i12) != i12 || (this.f111294p & i12) == 0 || (this.f111288j[i11] & i12) == i12 || (this.f111287i[i11] & i12) == i12) {
            return false;
        }
        int i13 = this.f111280b;
        if (abs <= i13 && abs2 <= i13) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f111296r.mo8630g(i12)) {
            int[] iArr = this.f111288j;
            iArr[i11] = iArr[i11] | i12;
            return false;
        }
        if ((this.f111287i[i11] & i12) != 0 || abs <= this.f111280b) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private boolean m117486g(View view, float f11, float f12) {
        boolean z11;
        boolean z12;
        if (view == null) {
            return false;
        }
        if (this.f111296r.mo8628d(view) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f111296r.mo31879e(view) > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && z12) {
            float f13 = (f11 * f11) + (f12 * f12);
            int i11 = this.f111280b;
            if (f13 <= i11 * i11) {
                return false;
            }
            return true;
        }
        if (z11) {
            if (Math.abs(f11) <= this.f111280b) {
                return false;
            }
            return true;
        }
        if (!z12 || Math.abs(f12) <= this.f111280b) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private float m117487h(float f11, float f12, float f13) {
        float abs = Math.abs(f11);
        if (abs < f12) {
            return 0.0f;
        }
        if (abs > f13) {
            if (f11 <= 0.0f) {
                return -f13;
            }
            return f13;
        }
        return f11;
    }

    /* renamed from: i */
    private int m117488i(int i11, int i12, int i13) {
        int abs = Math.abs(i11);
        if (abs < i12) {
            return 0;
        }
        if (abs > i13) {
            if (i11 <= 0) {
                return -i13;
            }
            return i13;
        }
        return i11;
    }

    /* renamed from: j */
    private void m117489j() {
        float[] fArr = this.f111282d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f111283e, 0.0f);
        Arrays.fill(this.f111284f, 0.0f);
        Arrays.fill(this.f111285g, 0.0f);
        Arrays.fill(this.f111286h, 0);
        Arrays.fill(this.f111287i, 0);
        Arrays.fill(this.f111288j, 0);
        this.f111289k = 0;
    }

    /* renamed from: k */
    private void m117490k(int i11) {
        if (this.f111282d != null && m117503C(i11)) {
            this.f111282d[i11] = 0.0f;
            this.f111283e[i11] = 0.0f;
            this.f111284f[i11] = 0.0f;
            this.f111285g[i11] = 0.0f;
            this.f111286h[i11] = 0;
            this.f111287i[i11] = 0;
            this.f111288j[i11] = 0;
            this.f111289k = (~(1 << i11)) & this.f111289k;
        }
    }

    /* renamed from: l */
    private int m117491l(int i11, int i12, int i13) {
        int abs;
        if (i11 == 0) {
            return 0;
        }
        int width = this.f111299u.getWidth();
        float f11 = width / 2;
        float m117496r = f11 + (m117496r(Math.min(1.0f, Math.abs(i11) / width)) * f11);
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m117496r / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i11) / i13) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: m */
    private int m117492m(View view, int i11, int i12, int i13, int i14) {
        float f11;
        float f12;
        float f13;
        float f14;
        int m117488i = m117488i(i13, (int) this.f111292n, (int) this.f111291m);
        int m117488i2 = m117488i(i14, (int) this.f111292n, (int) this.f111291m);
        int abs = Math.abs(i11);
        int abs2 = Math.abs(i12);
        int abs3 = Math.abs(m117488i);
        int abs4 = Math.abs(m117488i2);
        int i15 = abs3 + abs4;
        int i16 = abs + abs2;
        if (m117488i != 0) {
            f11 = abs3;
            f12 = i15;
        } else {
            f11 = abs;
            f12 = i16;
        }
        float f15 = f11 / f12;
        if (m117488i2 != 0) {
            f13 = abs4;
            f14 = i15;
        } else {
            f13 = abs2;
            f14 = i16;
        }
        return (int) ((m117491l(i11, m117488i, this.f111296r.mo8628d(view)) * f15) + (m117491l(i12, m117488i2, this.f111296r.mo31879e(view)) * (f13 / f14)));
    }

    /* renamed from: o */
    public static C22712c m117493o(ViewGroup viewGroup, float f11, c cVar) {
        C22712c m117494p = m117494p(viewGroup, cVar);
        m117494p.f111280b = (int) (m117494p.f111280b * (1.0f / f11));
        return m117494p;
    }

    /* renamed from: p */
    public static C22712c m117494p(ViewGroup viewGroup, c cVar) {
        return new C22712c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: q */
    private void m117495q(float f11, float f12) {
        this.f111298t = true;
        this.f111296r.mo8635l(this.f111297s, f11, f12);
        this.f111298t = false;
        if (this.f111279a == 1) {
            m117506K(0);
        }
    }

    /* renamed from: r */
    private float m117496r(float f11) {
        return (float) Math.sin((f11 - 0.5f) * 0.47123894f);
    }

    /* renamed from: s */
    private void m117497s(int i11, int i12, int i13, int i14) {
        int left = this.f111297s.getLeft();
        int top = this.f111297s.getTop();
        if (i13 != 0) {
            i11 = this.f111296r.mo8626a(this.f111297s, i11, i13);
            AbstractC1579n0.m7883k0(this.f111297s, i11 - left);
        }
        int i15 = i11;
        if (i14 != 0) {
            i12 = this.f111296r.mo8627b(this.f111297s, i12, i14);
            AbstractC1579n0.m7886l0(this.f111297s, i12 - top);
        }
        int i16 = i12;
        if (i13 != 0 || i14 != 0) {
            this.f111296r.mo8634k(this.f111297s, i15, i16, i15 - left, i16 - top);
        }
    }

    /* renamed from: t */
    private void m117498t(int i11) {
        float[] fArr = this.f111282d;
        if (fArr == null || fArr.length <= i11) {
            int i12 = i11 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f111283e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f111284f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f111285g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f111286h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f111287i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f111288j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f111282d = fArr2;
            this.f111283e = fArr3;
            this.f111284f = fArr4;
            this.f111285g = fArr5;
            this.f111286h = iArr;
            this.f111287i = iArr2;
            this.f111288j = iArr3;
        }
    }

    /* renamed from: v */
    private boolean m117499v(int i11, int i12, int i13, int i14) {
        int left = this.f111297s.getLeft();
        int top = this.f111297s.getTop();
        int i15 = i11 - left;
        int i16 = i12 - top;
        if (i15 == 0 && i16 == 0) {
            this.f111295q.abortAnimation();
            m117506K(0);
            return false;
        }
        this.f111295q.startScroll(left, top, i15, i16, m117492m(this.f111297s, i15, i16, i13, i14));
        m117506K(2);
        return true;
    }

    /* renamed from: y */
    private int m117500y(int i11, int i12) {
        int i13;
        if (i11 < this.f111299u.getLeft() + this.f111293o) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (i12 < this.f111299u.getTop() + this.f111293o) {
            i13 |= 4;
        }
        if (i11 > this.f111299u.getRight() - this.f111293o) {
            i13 |= 2;
        }
        if (i12 > this.f111299u.getBottom() - this.f111293o) {
            return i13 | 8;
        }
        return i13;
    }

    /* renamed from: A */
    public int m117501A() {
        return this.f111279a;
    }

    /* renamed from: B */
    public boolean m117502B(int i11, int i12) {
        return m117504E(this.f111297s, i11, i12);
    }

    /* renamed from: C */
    public boolean m117503C(int i11) {
        return ((1 << i11) & this.f111289k) != 0;
    }

    /* renamed from: E */
    public boolean m117504E(View view, int i11, int i12) {
        if (view == null || i11 < view.getLeft() || i11 >= view.getRight() || i12 < view.getTop() || i12 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:            if (r9.f111281c == (-1)) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:            m117481G();     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m117505F(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m117514b();
        }
        if (this.f111290l == null) {
            this.f111290l = VelocityTracker.obtain();
        }
        this.f111290l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f111279a == 1 && pointerId == this.f111281c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 >= pointerCount) {
                                            break;
                                        }
                                        int pointerId2 = motionEvent.getPointerId(i11);
                                        if (pointerId2 != this.f111281c) {
                                            View m117519u = m117519u((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                            View view = this.f111297s;
                                            if (m117519u == view && m117512Q(view, pointerId2)) {
                                            }
                                        }
                                        i11++;
                                    }
                                }
                                m117490k(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x11 = motionEvent.getX(actionIndex);
                        float y11 = motionEvent.getY(actionIndex);
                        m117483I(x11, y11, pointerId3);
                        if (this.f111279a == 0) {
                            m117512Q(m117519u((int) x11, (int) y11), pointerId3);
                            int i12 = this.f111286h[pointerId3];
                            int i13 = this.f111294p;
                            if ((i12 & i13) != 0) {
                                this.f111296r.mo8631h(i12 & i13, pointerId3);
                                return;
                            }
                            return;
                        }
                        if (m117502B((int) x11, (int) y11)) {
                            m117512Q(this.f111297s, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f111279a == 1) {
                        m117495q(0.0f, 0.0f);
                    }
                    m117514b();
                    return;
                }
                if (this.f111279a == 1) {
                    if (m117480D(this.f111281c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f111281c);
                        float x12 = motionEvent.getX(findPointerIndex);
                        float y12 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f111284f;
                        int i14 = this.f111281c;
                        int i15 = (int) (x12 - fArr[i14]);
                        int i16 = (int) (y12 - this.f111285g[i14]);
                        m117497s(this.f111297s.getLeft() + i15, this.f111297s.getTop() + i16, i15, i16);
                        m117484J(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i11 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (m117480D(pointerId4)) {
                        float x13 = motionEvent.getX(i11);
                        float y13 = motionEvent.getY(i11);
                        float f11 = x13 - this.f111282d[pointerId4];
                        float f12 = y13 - this.f111283e[pointerId4];
                        m117482H(f11, f12, pointerId4);
                        if (this.f111279a != 1) {
                            View m117519u2 = m117519u((int) x13, (int) y13);
                            if (m117486g(m117519u2, f11, f12) && m117512Q(m117519u2, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
                m117484J(motionEvent);
                return;
            }
            if (this.f111279a == 1) {
                m117481G();
            }
            m117514b();
            return;
        }
        float x14 = motionEvent.getX();
        float y14 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View m117519u3 = m117519u((int) x14, (int) y14);
        m117483I(x14, y14, pointerId5);
        m117512Q(m117519u3, pointerId5);
        int i17 = this.f111286h[pointerId5];
        int i18 = this.f111294p;
        if ((i17 & i18) != 0) {
            this.f111296r.mo8631h(i17 & i18, pointerId5);
        }
    }

    /* renamed from: K */
    void m117506K(int i11) {
        this.f111299u.removeCallbacks(this.f111300v);
        if (this.f111279a != i11) {
            this.f111279a = i11;
            this.f111296r.mo8633j(i11);
            if (this.f111279a == 0) {
                this.f111297s = null;
            }
        }
    }

    /* renamed from: L */
    public void m117507L(int i11) {
        this.f111294p = i11;
    }

    /* renamed from: M */
    public void m117508M(float f11) {
        this.f111292n = f11;
    }

    /* renamed from: N */
    public boolean m117509N(int i11, int i12) {
        if (this.f111298t) {
            return m117499v(i11, i12, (int) this.f111290l.getXVelocity(this.f111281c), (int) this.f111290l.getYVelocity(this.f111281c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:            if (r12 != r11) goto L54;     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m117510O(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        View m117519u;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m117514b();
        }
        if (this.f111290l == null) {
            this.f111290l = VelocityTracker.obtain();
        }
        this.f111290l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m117490k(motionEvent.getPointerId(actionIndex));
                            }
                        } else {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x11 = motionEvent.getX(actionIndex);
                            float y11 = motionEvent.getY(actionIndex);
                            m117483I(x11, y11, pointerId);
                            int i11 = this.f111279a;
                            if (i11 == 0) {
                                int i12 = this.f111286h[pointerId];
                                int i13 = this.f111294p;
                                if ((i12 & i13) != 0) {
                                    this.f111296r.mo8631h(i12 & i13, pointerId);
                                }
                            } else if (i11 == 2 && (m117519u = m117519u((int) x11, (int) y11)) == this.f111297s) {
                                m117512Q(m117519u, pointerId);
                            }
                        }
                    }
                } else if (this.f111282d != null && this.f111283e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i14 = 0; i14 < pointerCount; i14++) {
                        int pointerId2 = motionEvent.getPointerId(i14);
                        if (m117480D(pointerId2)) {
                            float x12 = motionEvent.getX(i14);
                            float y12 = motionEvent.getY(i14);
                            float f11 = x12 - this.f111282d[pointerId2];
                            float f12 = y12 - this.f111283e[pointerId2];
                            View m117519u2 = m117519u((int) x12, (int) y12);
                            if (m117519u2 != null && m117486g(m117519u2, f11, f12)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                int left = m117519u2.getLeft();
                                int i15 = (int) f11;
                                int mo8626a = this.f111296r.mo8626a(m117519u2, left + i15, i15);
                                int top = m117519u2.getTop();
                                int i16 = (int) f12;
                                int mo8627b = this.f111296r.mo8627b(m117519u2, top + i16, i16);
                                int mo8628d = this.f111296r.mo8628d(m117519u2);
                                int mo31879e = this.f111296r.mo31879e(m117519u2);
                                if (mo8628d != 0) {
                                    if (mo8628d > 0) {
                                    }
                                }
                                if (mo31879e == 0) {
                                    break;
                                }
                                if (mo31879e > 0 && mo8627b == top) {
                                    break;
                                }
                            }
                            m117482H(f11, f12, pointerId2);
                            if (this.f111279a == 1) {
                                break;
                            }
                            if (z12 && m117512Q(m117519u2, pointerId2)) {
                                break;
                            }
                        }
                    }
                    m117484J(motionEvent);
                }
                z11 = false;
            }
            m117514b();
            z11 = false;
        } else {
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            z11 = false;
            int pointerId3 = motionEvent.getPointerId(0);
            m117483I(x13, y13, pointerId3);
            View m117519u3 = m117519u((int) x13, (int) y13);
            if (m117519u3 == this.f111297s && this.f111279a == 2) {
                m117512Q(m117519u3, pointerId3);
            }
            int i17 = this.f111286h[pointerId3];
            int i18 = this.f111294p;
            if ((i17 & i18) != 0) {
                this.f111296r.mo8631h(i17 & i18, pointerId3);
            }
        }
        if (this.f111279a == 1) {
            return true;
        }
        return z11;
    }

    /* renamed from: P */
    public boolean m117511P(View view, int i11, int i12) {
        this.f111297s = view;
        this.f111281c = -1;
        boolean m117499v = m117499v(i11, i12, 0, 0);
        if (!m117499v && this.f111279a == 0 && this.f111297s != null) {
            this.f111297s = null;
        }
        return m117499v;
    }

    /* renamed from: Q */
    boolean m117512Q(View view, int i11) {
        if (view == this.f111297s && this.f111281c == i11) {
            return true;
        }
        if (view != null && this.f111296r.mo8636m(view, i11)) {
            this.f111281c = i11;
            m117515c(view, i11);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m117513a() {
        m117514b();
        if (this.f111279a == 2) {
            int currX = this.f111295q.getCurrX();
            int currY = this.f111295q.getCurrY();
            this.f111295q.abortAnimation();
            int currX2 = this.f111295q.getCurrX();
            int currY2 = this.f111295q.getCurrY();
            this.f111296r.mo8634k(this.f111297s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m117506K(0);
    }

    /* renamed from: b */
    public void m117514b() {
        this.f111281c = -1;
        m117489j();
        VelocityTracker velocityTracker = this.f111290l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f111290l = null;
        }
    }

    /* renamed from: c */
    public void m117515c(View view, int i11) {
        if (view.getParent() == this.f111299u) {
            this.f111297s = view;
            this.f111281c = i11;
            this.f111296r.mo8632i(view, i11);
            m117506K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f111299u + ")");
    }

    /* renamed from: e */
    public boolean m117516e(int i11) {
        int length = this.f111282d.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (m117517f(i11, i12)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean m117517f(int i11, int i12) {
        boolean z11;
        boolean z12;
        if (!m117503C(i12)) {
            return false;
        }
        if ((i11 & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i11 & 2) == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f11 = this.f111284f[i12] - this.f111282d[i12];
        float f12 = this.f111285g[i12] - this.f111283e[i12];
        if (z11 && z12) {
            float f13 = (f11 * f11) + (f12 * f12);
            int i13 = this.f111280b;
            if (f13 <= i13 * i13) {
                return false;
            }
            return true;
        }
        if (z11) {
            if (Math.abs(f11) <= this.f111280b) {
                return false;
            }
            return true;
        }
        if (!z12 || Math.abs(f12) <= this.f111280b) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:            if (r0 == false) goto L19;     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m117518n(boolean z11) {
        if (this.f111279a == 2) {
            boolean computeScrollOffset = this.f111295q.computeScrollOffset();
            int currX = this.f111295q.getCurrX();
            int currY = this.f111295q.getCurrY();
            int left = currX - this.f111297s.getLeft();
            int top = currY - this.f111297s.getTop();
            if (left != 0) {
                AbstractC1579n0.m7883k0(this.f111297s, left);
            }
            if (top != 0) {
                AbstractC1579n0.m7886l0(this.f111297s, top);
            }
            if (left != 0 || top != 0) {
                this.f111296r.mo8634k(this.f111297s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f111295q.getFinalX() && currY == this.f111295q.getFinalY()) {
                this.f111295q.abortAnimation();
            }
            if (z11) {
                this.f111299u.post(this.f111300v);
            } else {
                m117506K(0);
            }
        }
        if (this.f111279a != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public View m117519u(int i11, int i12) {
        for (int childCount = this.f111299u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f111299u.getChildAt(this.f111296r.m117523c(childCount));
            if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && i12 >= childAt.getTop() && i12 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: w */
    public View m117520w() {
        return this.f111297s;
    }

    /* renamed from: x */
    public int m117521x() {
        return this.f111293o;
    }

    /* renamed from: z */
    public int m117522z() {
        return this.f111280b;
    }
}

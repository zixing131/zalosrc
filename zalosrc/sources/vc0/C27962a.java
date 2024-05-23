package vc0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.core.view.AbstractC1579n0;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.mediastore.NestedScrollViewParent;
import s00.AbstractC26080o;

/* renamed from: vc0.a */
/* loaded from: classes4.dex */
public class C27962a implements RecyclerView.InterfaceC1891r {

    /* renamed from: D */
    public static int f130364D = -1;

    /* renamed from: E */
    public static int f130365E = 0;

    /* renamed from: F */
    public static int f130366F = 1;

    /* renamed from: a */
    private boolean f130370a;

    /* renamed from: b */
    private int f130371b;

    /* renamed from: c */
    private int f130372c;

    /* renamed from: d */
    private boolean f130373d;

    /* renamed from: e */
    private boolean f130374e;

    /* renamed from: f */
    private int f130375f;

    /* renamed from: g */
    private float f130376g;

    /* renamed from: h */
    private float f130377h;

    /* renamed from: i */
    private float f130378i;

    /* renamed from: j */
    private int f130379j;

    /* renamed from: k */
    private int f130380k;

    /* renamed from: n */
    private c f130383n;

    /* renamed from: o */
    private RecyclerView f130384o;

    /* renamed from: p */
    private OverScroller f130385p;

    /* renamed from: r */
    private int f130387r;

    /* renamed from: s */
    private int f130388s;

    /* renamed from: t */
    private int f130389t;

    /* renamed from: u */
    private int f130390u;

    /* renamed from: l */
    private float f130381l = -1.0f;

    /* renamed from: m */
    private float f130382m = -1.0f;

    /* renamed from: q */
    private final Runnable f130386q = new a();

    /* renamed from: v */
    private int f130391v = 34;

    /* renamed from: w */
    private int f130392w = (int) (Resources.getSystem().getDisplayMetrics().density * 68.0f);

    /* renamed from: x */
    private int f130393x = 0;

    /* renamed from: y */
    private int f130394y = 0;

    /* renamed from: z */
    private boolean f130395z = true;

    /* renamed from: A */
    private boolean f130367A = true;

    /* renamed from: B */
    private boolean f130368B = false;

    /* renamed from: C */
    private NestedScrollViewParent f130369C = null;

    /* renamed from: vc0.a$a */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C27962a.this.f130385p != null && C27962a.this.f130385p.computeScrollOffset()) {
                C27962a c27962a = C27962a.this;
                c27962a.m140932o(c27962a.f130375f);
                AbstractC1579n0.m7900s0(C27962a.this.f130384o, C27962a.this.f130386q);
            }
        }
    }

    /* renamed from: vc0.a$b */
    /* loaded from: classes4.dex */
    public interface b extends c {
        /* renamed from: a */
        void mo140947a(int i11);

        /* renamed from: c */
        void mo140948c(int i11, float f11, float f12);
    }

    /* renamed from: vc0.a$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: b */
        void mo140949b(int i11, int i12, float f11, float f12, boolean z11, int i13);
    }

    public C27962a() {
        m140931n();
    }

    /* renamed from: j */
    private void m140928j(Context context) {
        if (this.f130385p == null) {
            this.f130385p = new OverScroller(context);
        }
    }

    /* renamed from: l */
    private void m140929l() {
        int i11;
        int i12;
        if (this.f130383n != null && (i11 = this.f130371b) != -1 && (i12 = this.f130372c) != -1) {
            int min = Math.min(i11, i12);
            int max = Math.max(this.f130371b, this.f130372c);
            int i13 = this.f130379j;
            float f11 = 0.0f;
            if (i13 != -1 && this.f130380k != -1) {
                if (min > i13) {
                    c cVar = this.f130383n;
                    int i14 = min - 1;
                    float f12 = this.f130377h;
                    float f13 = this.f130382m;
                    if (f13 == -1.0f) {
                        f13 = 0.0f;
                    }
                    float f14 = f13 + f12;
                    float f15 = this.f130378i;
                    float f16 = this.f130381l;
                    if (f16 == -1.0f) {
                        f16 = 0.0f;
                    }
                    cVar.mo140949b(i13, i14, f14, f16 + f15, false, f130366F);
                } else if (min < i13) {
                    c cVar2 = this.f130383n;
                    int i15 = i13 - 1;
                    float f17 = this.f130377h;
                    float f18 = this.f130382m;
                    if (f18 == -1.0f) {
                        f18 = 0.0f;
                    }
                    float f19 = f17 + f18;
                    float f21 = this.f130378i;
                    float f22 = this.f130381l;
                    if (f22 == -1.0f) {
                        f22 = 0.0f;
                    }
                    cVar2.mo140949b(min, i15, f19, f21 + f22, true, f130364D);
                }
                int i16 = this.f130380k;
                if (max > i16) {
                    c cVar3 = this.f130383n;
                    int i17 = i16 + 1;
                    float f23 = this.f130377h;
                    float f24 = this.f130382m;
                    if (f24 == -1.0f) {
                        f24 = 0.0f;
                    }
                    float f25 = f23 + f24;
                    float f26 = this.f130378i;
                    float f27 = this.f130381l;
                    if (f27 == -1.0f) {
                        f27 = 0.0f;
                    }
                    cVar3.mo140949b(i17, max, f25, f26 + f27, true, f130366F);
                } else if (max < i16) {
                    c cVar4 = this.f130383n;
                    int i18 = max + 1;
                    float f28 = this.f130377h;
                    float f29 = this.f130382m;
                    if (f29 == -1.0f) {
                        f29 = 0.0f;
                    }
                    float f31 = f28 + f29;
                    float f32 = this.f130378i;
                    float f33 = this.f130381l;
                    if (f33 == -1.0f) {
                        f33 = 0.0f;
                    }
                    cVar4.mo140949b(i18, i16, f31, f32 + f33, false, f130364D);
                }
                if (this.f130368B && min == this.f130379j && max == this.f130380k) {
                    if (min < this.f130371b) {
                        c cVar5 = this.f130383n;
                        float f34 = this.f130377h;
                        float f35 = this.f130382m;
                        if (f35 == -1.0f) {
                            f35 = 0.0f;
                        }
                        float f36 = f34 + f35;
                        float f37 = this.f130378i;
                        float f38 = this.f130381l;
                        if (f38 != -1.0f) {
                            f11 = f38;
                        }
                        cVar5.mo140949b(min, min, f36, f37 + f11, true, f130364D);
                    } else {
                        c cVar6 = this.f130383n;
                        float f39 = this.f130377h;
                        float f41 = this.f130382m;
                        if (f41 == -1.0f) {
                            f41 = 0.0f;
                        }
                        float f42 = f39 + f41;
                        float f43 = this.f130378i;
                        float f44 = this.f130381l;
                        if (f44 != -1.0f) {
                            f11 = f44;
                        }
                        cVar6.mo140949b(max, max, f42, f43 + f11, true, f130366F);
                    }
                }
            } else if (max - min == 1) {
                c cVar7 = this.f130383n;
                float f45 = this.f130377h;
                float f46 = this.f130382m;
                if (f46 == -1.0f) {
                    f46 = 0.0f;
                }
                float f47 = f45 + f46;
                float f48 = this.f130378i;
                float f49 = this.f130381l;
                if (f49 != -1.0f) {
                    f11 = f49;
                }
                cVar7.mo140949b(min, min, f47, f48 + f11, true, f130365E);
            } else {
                c cVar8 = this.f130383n;
                float f51 = this.f130377h;
                float f52 = this.f130382m;
                if (f52 == -1.0f) {
                    f52 = 0.0f;
                }
                float f53 = f51 + f52;
                float f54 = this.f130378i;
                float f55 = this.f130381l;
                if (f55 != -1.0f) {
                    f11 = f55;
                }
                cVar8.mo140949b(min, max, f53, f54 + f11, true, f130365E);
            }
            this.f130379j = min;
            this.f130380k = max;
        }
    }

    /* renamed from: m */
    private void m140930m(MotionEvent motionEvent) {
        Rect rect = new Rect();
        this.f130384o.getGlobalVisibleRect(rect);
        int y11 = ((int) motionEvent.getY()) + rect.top;
        int i11 = this.f130387r;
        if (y11 >= i11 && y11 <= this.f130388s) {
            this.f130377h = motionEvent.getX();
            this.f130378i = motionEvent.getY();
            int i12 = this.f130388s;
            int i13 = this.f130387r;
            float f11 = ((i12 - i13) - (y11 - i13)) / (i12 - i13);
            this.f130376g = f11;
            this.f130375f = (int) (this.f130391v * f11 * (-1.0f));
            if (!this.f130373d) {
                this.f130373d = true;
                m140939q();
                return;
            }
            return;
        }
        if (this.f130395z && y11 < i11) {
            this.f130377h = motionEvent.getX();
            this.f130378i = motionEvent.getY();
            this.f130375f = (int) (this.f130391v * (-1.6f));
            if (!this.f130373d) {
                this.f130373d = true;
                m140939q();
                return;
            }
            return;
        }
        if (y11 >= this.f130389t && y11 <= this.f130390u) {
            this.f130377h = motionEvent.getX();
            this.f130378i = motionEvent.getY();
            int i14 = this.f130389t;
            float f12 = (y11 - i14) / (this.f130390u - i14);
            this.f130376g = f12;
            this.f130375f = (int) (this.f130391v * f12);
            if (!this.f130374e) {
                this.f130374e = true;
                m140939q();
                return;
            }
            return;
        }
        if (this.f130367A && y11 > this.f130390u) {
            this.f130377h = motionEvent.getX();
            this.f130378i = motionEvent.getY();
            this.f130375f = (int) (this.f130391v * 1.6f);
            if (!this.f130373d) {
                this.f130373d = true;
                m140939q();
                return;
            }
            return;
        }
        this.f130374e = false;
        this.f130373d = false;
        this.f130377h = motionEvent.getX();
        this.f130378i = motionEvent.getY();
        m140941s();
    }

    /* renamed from: n */
    private void m140931n() {
        m140938p(false);
        c cVar = this.f130383n;
        if (cVar != null && (cVar instanceof b)) {
            ((b) cVar).mo140947a(this.f130372c);
        }
        this.f130371b = -1;
        this.f130372c = -1;
        this.f130379j = -1;
        this.f130380k = -1;
        this.f130373d = false;
        this.f130374e = false;
        this.f130377h = Float.MIN_VALUE;
        this.f130378i = Float.MIN_VALUE;
        m140941s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m140932o(int i11) {
        int max;
        if (i11 > 0) {
            max = Math.min(i11, this.f130391v);
        } else {
            max = Math.max(i11, -this.f130391v);
        }
        NestedScrollViewParent nestedScrollViewParent = this.f130369C;
        if (nestedScrollViewParent != null && nestedScrollViewParent.getScrollY() < this.f130369C.getMaxHeight()) {
            NestedScrollViewParent nestedScrollViewParent2 = this.f130369C;
            nestedScrollViewParent2.scrollBy(0, Math.min(max, nestedScrollViewParent2.getMaxHeight()));
        } else {
            this.f130384o.scrollBy(0, max);
        }
        float f11 = this.f130377h;
        if (f11 != Float.MIN_VALUE) {
            float f12 = this.f130378i;
            if (f12 != Float.MIN_VALUE) {
                m140933u(this.f130384o, f11, f12);
            }
        }
    }

    /* renamed from: u */
    private void m140933u(RecyclerView recyclerView, float f11, float f12) {
        int m9817A0;
        View m9893m0 = recyclerView.m9893m0(f11, f12);
        if (m9893m0 != null && (m9817A0 = recyclerView.m9817A0(m9893m0)) != -1) {
            this.f130372c = m9817A0;
            m140929l();
        }
    }

    /* renamed from: v */
    private void m140934v(RecyclerView recyclerView, MotionEvent motionEvent) {
        m140933u(recyclerView, motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: A */
    public C27962a m140935A(int i11) {
        this.f130393x = i11;
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: a */
    public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f130370a) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action != 3 && action != 6) {
                    return;
                }
            } else {
                if (!this.f130373d && !this.f130374e) {
                    m140934v(recyclerView, motionEvent);
                }
                m140930m(motionEvent);
                return;
            }
        }
        m140931n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:            if (r5 != 6) goto L20;     */
    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f130370a || recyclerView.getAdapter().mo10003k() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action != 5) {
                }
            }
            m140931n();
            return false;
        }
        m140931n();
        this.f130384o = recyclerView;
        int height = recyclerView.getHeight();
        recyclerView.getGlobalVisibleRect(new Rect());
        this.f130381l = r1.top;
        this.f130382m = r1.left;
        if (this.f130394y == 0) {
            this.f130394y = height;
        }
        int i11 = this.f130393x;
        this.f130387r = i11;
        int i12 = this.f130392w;
        this.f130388s = i11 + i12;
        int i13 = this.f130394y;
        this.f130389t = i13 - i12;
        this.f130390u = i13;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: e */
    public void mo954e(boolean z11) {
    }

    /* renamed from: i */
    public void m140936i() {
        if (this.f130384o != null && this.f130385p != null) {
            m140931n();
            this.f130384o.removeCallbacks(this.f130386q);
            OverScroller overScroller = this.f130385p;
            overScroller.startScroll(0, overScroller.getCurrY(), 0, 360, 300);
            AbstractC1579n0.m7900s0(this.f130384o, this.f130386q);
        }
    }

    /* renamed from: k */
    public boolean m140937k() {
        return this.f130370a;
    }

    /* renamed from: p */
    public void m140938p(boolean z11) {
        this.f130370a = z11;
    }

    /* renamed from: q */
    public void m140939q() {
        RecyclerView recyclerView = this.f130384o;
        if (recyclerView == null) {
            return;
        }
        m140928j(recyclerView.getContext());
        OverScroller overScroller = this.f130385p;
        if (overScroller != null && overScroller.isFinished()) {
            this.f130384o.removeCallbacks(this.f130386q);
            OverScroller overScroller2 = this.f130385p;
            overScroller2.startScroll(0, overScroller2.getCurrY(), 0, AbstractC26080o.a.f124275b, 100000);
            AbstractC1579n0.m7900s0(this.f130384o, this.f130386q);
        }
    }

    /* renamed from: r */
    public void m140940r(int i11) {
        m140938p(true);
        this.f130371b = i11;
        this.f130372c = i11;
        this.f130379j = i11;
        this.f130380k = i11;
        c cVar = this.f130383n;
        if (cVar != null && (cVar instanceof b)) {
            b bVar = (b) cVar;
            float f11 = this.f130377h;
            float f12 = this.f130382m;
            float f13 = 0.0f;
            if (f12 == -1.0f) {
                f12 = 0.0f;
            }
            float f14 = f11 + f12;
            float f15 = this.f130378i;
            float f16 = this.f130381l;
            if (f16 != -1.0f) {
                f13 = f16;
            }
            bVar.mo140948c(i11, f14, f15 + f13);
        }
    }

    /* renamed from: s */
    public void m140941s() {
        OverScroller overScroller = this.f130385p;
        if (overScroller != null && !overScroller.isFinished()) {
            this.f130384o.removeCallbacks(this.f130386q);
            this.f130385p.abortAnimation();
        }
    }

    /* renamed from: t */
    public void m140942t() {
        OverScroller overScroller = this.f130385p;
        if (overScroller != null) {
            overScroller.forceFinished(true);
        }
    }

    /* renamed from: w */
    public C27962a m140943w(int i11) {
        this.f130394y = i11;
        return this;
    }

    /* renamed from: x */
    public C27962a m140944x(boolean z11) {
        this.f130368B = z11;
        return this;
    }

    /* renamed from: y */
    public C27962a m140945y(NestedScrollViewParent nestedScrollViewParent) {
        this.f130369C = nestedScrollViewParent;
        return this;
    }

    /* renamed from: z */
    public C27962a m140946z(c cVar) {
        this.f130383n = cVar;
        return this;
    }
}

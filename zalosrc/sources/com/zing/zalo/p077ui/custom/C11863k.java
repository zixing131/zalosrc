package com.zing.zalo.p077ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.custom.C11863k;
import com.zing.zalo.uicontrol.C16565c1;
import com.zing.zalo.zdesign.component.C17024o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import l80.C22122a0;
import ln0.AbstractC22543l;
import p354n3.C23528a;
import p379o3.AbstractRunnableC23992c;
import p379o3.C24003n;
import ui0.C27280g;

/* renamed from: com.zing.zalo.ui.custom.k */
/* loaded from: classes5.dex */
public class C11863k extends C11850a {
    public static final a Companion = new a(null);

    /* renamed from: A1 */
    private boolean f61820A1;

    /* renamed from: B1 */
    private int f61821B1;

    /* renamed from: C1 */
    private final Handler f61822C1;

    /* renamed from: D1 */
    private final C16565c1 f61823D1;

    /* renamed from: E1 */
    private final Drawable f61824E1;

    /* renamed from: F1 */
    private boolean f61825F1;

    /* renamed from: G1 */
    private C23528a f61826G1;

    /* renamed from: H1 */
    private String f61827H1;

    /* renamed from: I1 */
    private C24003n f61828I1;

    /* renamed from: J1 */
    private int f61829J1;

    /* renamed from: K1 */
    private C3979l.b f61830K1;

    /* renamed from: L1 */
    private C22122a0.d f61831L1;

    /* renamed from: M1 */
    private int f61832M1;

    /* renamed from: N1 */
    private boolean f61833N1;

    /* renamed from: O1 */
    private boolean f61834O1;

    /* renamed from: P1 */
    private boolean f61835P1;

    /* renamed from: y1 */
    private boolean f61836y1;

    /* renamed from: z1 */
    private boolean f61837z1;

    /* renamed from: com.zing.zalo.ui.custom.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.k$b */
    /* loaded from: classes5.dex */
    public static final class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            C11863k.this.f61833N1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.k$c */
    /* loaded from: classes5.dex */
    public static final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 == 1000) {
                C11863k c11863k = C11863k.this;
                Object obj = message.obj;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Long");
                c11863k.m65953w2(((Long) obj).longValue() * 2);
                return;
            }
            if (i11 == 1001) {
                C11863k.this.f61834O1 = false;
                if (!C11863k.this.m65954x2()) {
                    C11863k.this.m65951u2(true);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.k$d */
    /* loaded from: classes5.dex */
    public static final class d implements AbstractRunnableC23992c.c {

        /* renamed from: b */
        final /* synthetic */ long f61841b;

        d(long j11) {
            this.f61841b = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static final void m65964k(C11863k c11863k) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65937G2();
            c11863k.f61835P1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m65965l(C11863k c11863k) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65932B2();
            c11863k.f61835P1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static final void m65966m(C11863k c11863k) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65937G2();
            c11863k.m65933C2();
            c11863k.f61835P1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m65967n(C11863k c11863k, int i11) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65934D2(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static final void m65968o(C11863k c11863k) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65936F2();
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: b */
        public void mo65969b(String str) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.m
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.d.m65968o(C11863k.this);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: c */
        public void mo65970c(String str, final int i11) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.o
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.d.m65967n(C11863k.this, i11);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: d */
        public void mo65971d(String str, int i11) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.custom.n
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.d.m65966m(C11863k.this);
                }
            }, this.f61841b);
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: e */
        public void mo65972e(String str) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.p
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.d.m65964k(C11863k.this);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: f */
        public void mo65973f(String str) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.l
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.d.m65965l(C11863k.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.k$e */
    /* loaded from: classes5.dex */
    public static final class e implements AbstractRunnableC23992c.c {

        /* renamed from: b */
        final /* synthetic */ long f61843b;

        e(long j11) {
            this.f61843b = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static final void m65979k(C11863k c11863k) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65937G2();
            c11863k.f61835P1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m65980l(C11863k c11863k) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65932B2();
            c11863k.f61835P1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static final void m65981m(C11863k c11863k) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65937G2();
            c11863k.m65933C2();
            c11863k.f61835P1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m65982n(C11863k c11863k, int i11) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65934D2(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static final void m65983o(C11863k c11863k) {
            AbstractC19074t.m100208f(c11863k, "this$0");
            c11863k.m65936F2();
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: b */
        public void mo65969b(String str) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.q
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.e.m65983o(C11863k.this);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: c */
        public void mo65970c(String str, final int i11) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.t
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.e.m65982n(C11863k.this, i11);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: d */
        public void mo65971d(String str, int i11) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.custom.r
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.e.m65981m(C11863k.this);
                }
            }, this.f61843b);
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: e */
        public void mo65972e(String str) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.u
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.e.m65979k(C11863k.this);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: f */
        public void mo65973f(String str) {
            if (!AbstractC19074t.m100204b(str, C11863k.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C11863k c11863k = C11863k.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.s
                @Override // java.lang.Runnable
                public final void run() {
                    C11863k.e.m65980l(C11863k.this);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11863k(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f61822C1 = new c(Looper.getMainLooper());
        this.f61823D1 = new C16565c1(context, new C17024o0.a() { // from class: com.zing.zalo.ui.custom.i
            @Override // com.zing.zalo.zdesign.component.C17024o0.a
            /* renamed from: a */
            public final void mo61929a() {
                C11863k.m65955y2(C11863k.this);
            }
        });
        Drawable m139658a = C27280g.m139658a(context, AbstractC16803z.ic_video_retry_button);
        if (m139658a != null) {
            C16565c1.a aVar = C16565c1.Companion;
            m139658a.setBounds(0, 0, aVar.m88261a(), aVar.m88261a());
        } else {
            m139658a = null;
        }
        this.f61824E1 = m139658a;
        this.f61825F1 = true;
        this.f61830K1 = C3979l.b.UNKNOWN;
        this.f61832M1 = -1;
    }

    /* renamed from: A2 */
    private final void m65931A2() {
        this.f61836y1 = false;
        this.f61837z1 = false;
        this.f61820A1 = false;
        this.f61822C1.removeMessages(1001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B2 */
    public final void m65932B2() {
        m65934D2(100);
        this.f61837z1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C2 */
    public final void m65933C2() {
        this.f61836y1 = true;
        this.f61821B1 = 0;
        invalidate();
        m65937G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D2 */
    public final void m65934D2(int i11) {
        int m116580c;
        m116580c = AbstractC22543l.m116580c(i11, 5);
        if (m116580c > this.f61821B1) {
            this.f61821B1 = m116580c;
            this.f61823D1.m88260f(m116580c, true);
            if (i11 >= 100 && m65937G2()) {
                m65951u2(false);
            }
        }
    }

    /* renamed from: E2 */
    private final boolean m65935E2() {
        if (this.f61825F1 && !this.f61834O1 && !this.f61836y1) {
            int i11 = this.f61821B1;
            if (1 <= i11 && i11 < 100) {
                return true;
            }
            if (i11 >= 100 && this.f61833N1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F2 */
    public final void m65936F2() {
        if (this.f61822C1.hasMessages(1000)) {
            return;
        }
        this.f61836y1 = false;
        this.f61821B1 = 5;
        this.f61823D1.m88259e(255);
        this.f61823D1.m88260f(this.f61821B1, false);
        m65953w2(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G2 */
    public final boolean m65937G2() {
        boolean hasMessages = this.f61822C1.hasMessages(1000);
        this.f61822C1.removeMessages(1000);
        if (hasMessages && !this.f61834O1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m65951u2(boolean z11) {
        ValueAnimator ofInt;
        if (this.f61833N1) {
            return;
        }
        if (z11) {
            ofInt = ValueAnimator.ofInt(0, 255);
        } else {
            ofInt = ValueAnimator.ofInt(255, 0);
        }
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.custom.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C11863k.m65952v2(C11863k.this, valueAnimator);
            }
        });
        ofInt.addListener(new b());
        ofInt.setDuration(500L);
        this.f61833N1 = true;
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m65952v2(C11863k c11863k, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c11863k, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        C16565c1 c16565c1 = c11863k.f61823D1;
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c16565c1.m88259e(((Integer) animatedValue).intValue());
        c11863k.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w2 */
    public final void m65953w2(long j11) {
        m65934D2(Math.min(this.f61823D1.m88258d() + 5, 70));
        Handler handler = this.f61822C1;
        handler.sendMessageDelayed(handler.obtainMessage(1000, Long.valueOf(j11)), j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x2 */
    public final boolean m65954x2() {
        return this.f61836y1 || this.f61837z1 || this.f61820A1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m65955y2(C11863k c11863k) {
        AbstractC19074t.m100208f(c11863k, "this$0");
        if (AbstractC19444a.m101693a()) {
            c11863k.invalidate();
        } else {
            c11863k.postInvalidate();
        }
    }

    @Override // l80.C22122a0
    /* renamed from: I1 */
    public void mo65956I1(C23528a c23528a, String str, C24003n c24003n, int i11, C3979l.b bVar, C22122a0.d dVar) {
        long j11;
        this.f61826G1 = c23528a;
        this.f61827H1 = str;
        this.f61828I1 = c24003n;
        this.f61829J1 = i11;
        this.f61830K1 = bVar;
        this.f61831L1 = dVar;
        if (this.f61836y1) {
            j11 = 500;
        } else {
            j11 = 0;
        }
        if (!AbstractC19074t.m100204b(str, getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
            setTag(AbstractC6918a0.tag_url_progress_recycling_image_module, str);
            m65931A2();
            m65937G2();
            if (!this.f61835P1) {
                this.f61834O1 = true;
                this.f61822C1.sendEmptyMessageDelayed(1001, 1000L);
            }
            invalidate();
        }
        if (!AbstractC19074t.m100204b(str, getTag(AbstractC6918a0.tag_url_progress_recycling_image_module)) || !this.f61837z1) {
            super.m115378L1(c23528a, str, c24003n, i11, bVar, dVar, new d(j11));
        }
    }

    @Override // l80.C22122a0
    /* renamed from: J1 */
    public void mo65957J1(C23528a c23528a, String str, C24003n c24003n, int i11, C3979l.b bVar, C22122a0.d dVar, int i12) {
        long j11;
        this.f61826G1 = c23528a;
        this.f61827H1 = str;
        this.f61828I1 = c24003n;
        this.f61829J1 = i11;
        this.f61830K1 = bVar;
        this.f61831L1 = dVar;
        this.f61832M1 = i12;
        if (this.f61836y1) {
            j11 = 500;
        } else {
            j11 = 0;
        }
        if (!AbstractC19074t.m100204b(str, getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
            setTag(AbstractC6918a0.tag_url_progress_recycling_image_module, str);
            m65931A2();
            m65937G2();
            if (!this.f61835P1) {
                this.f61834O1 = true;
                this.f61822C1.sendEmptyMessageDelayed(1001, 1000L);
            }
            invalidate();
        }
        if (!AbstractC19074t.m100204b(str, getTag(AbstractC6918a0.tag_url_progress_recycling_image_module)) || !this.f61837z1) {
            super.m115377K1(c23528a, str, c24003n, i11, bVar, dVar, i12, new e(j11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.custom.C11850a, l80.C22122a0, kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo44775o0(canvas);
        if (m65935E2()) {
            this.f61823D1.m88257c(canvas);
        }
        if (this.f61836y1) {
            canvas.save();
            int m89110N = m89110N();
            C16565c1.a aVar = C16565c1.Companion;
            canvas.translate((m89110N - aVar.m88261a()) / 2.0f, (m89108M() - aVar.m88261a()) / 2.0f);
            Drawable drawable = this.f61824E1;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.p077ui.custom.C11850a, kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        super.mo44180q0(i11, i12, i13, i14);
        this.f61823D1.m88256b(m89110N(), m89108M());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.custom.C11850a, com.zing.zalo.uidrawing.C16719g
    /* renamed from: t0 */
    public boolean mo65871t0(MotionEvent motionEvent) {
        int m89110N = m89110N();
        C16565c1.a aVar = C16565c1.Companion;
        float m88261a = (m89110N - aVar.m88261a()) / 2.0f;
        float m89108M = (m89108M() - aVar.m88261a()) / 2.0f;
        Rect rect = new Rect((int) m88261a, (int) m89108M, (int) (m88261a + aVar.m88261a()), (int) (m89108M + aVar.m88261a()));
        if (motionEvent != null && motionEvent.getAction() == 1 && this.f61836y1 && this.f61825F1 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            setTag(AbstractC6918a0.tag_url_progress_recycling_image_module, null);
            this.f61835P1 = true;
            int i11 = this.f61832M1;
            if (i11 != -1) {
                mo65957J1(this.f61826G1, this.f61827H1, this.f61828I1, this.f61829J1, this.f61830K1, this.f61831L1, i11);
            } else {
                mo65956I1(this.f61826G1, this.f61827H1, this.f61828I1, this.f61829J1, this.f61830K1, this.f61831L1);
            }
        }
        if (motionEvent != null && this.f61836y1 && this.f61825F1 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return super.mo65871t0(motionEvent);
    }

    /* renamed from: z2 */
    public final void m65958z2() {
        setTag(AbstractC6918a0.tag_url_progress_recycling_image_module, null);
    }
}

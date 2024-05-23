package l80;

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
import com.zing.zalo.uicontrol.C16565c1;
import com.zing.zalo.zdesign.component.C17024o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import l80.C22122a0;
import l80.C22141p;
import ln0.AbstractC22543l;
import p354n3.C23528a;
import p379o3.AbstractRunnableC23992c;
import p379o3.C24003n;
import ui0.C27280g;

/* renamed from: l80.p */
/* loaded from: classes6.dex */
public class C22141p extends C22122a0 {
    public static final a Companion = new a(null);

    /* renamed from: f1 */
    private boolean f109038f1;

    /* renamed from: g1 */
    private boolean f109039g1;

    /* renamed from: h1 */
    private boolean f109040h1;

    /* renamed from: i1 */
    private int f109041i1;

    /* renamed from: j1 */
    private final Handler f109042j1;

    /* renamed from: k1 */
    private final C16565c1 f109043k1;

    /* renamed from: l1 */
    private final Drawable f109044l1;

    /* renamed from: m1 */
    private boolean f109045m1;

    /* renamed from: n1 */
    private C23528a f109046n1;

    /* renamed from: o1 */
    private String f109047o1;

    /* renamed from: p1 */
    private C24003n f109048p1;

    /* renamed from: q1 */
    private int f109049q1;

    /* renamed from: r1 */
    private C3979l.b f109050r1;

    /* renamed from: s1 */
    private C22122a0.d f109051s1;

    /* renamed from: t1 */
    private int f109052t1;

    /* renamed from: u1 */
    private boolean f109053u1;

    /* renamed from: v1 */
    private boolean f109054v1;

    /* renamed from: w1 */
    private boolean f109055w1;

    /* renamed from: l80.p$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: l80.p$b */
    /* loaded from: classes6.dex */
    public static final class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            C22141p.this.f109053u1 = false;
        }
    }

    /* renamed from: l80.p$c */
    /* loaded from: classes6.dex */
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
                C22141p c22141p = C22141p.this;
                Object obj = message.obj;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Long");
                c22141p.m115492o2(((Long) obj).longValue() * 2);
                return;
            }
            if (i11 == 1001) {
                C22141p.this.f109054v1 = false;
                if (!C22141p.this.m115493p2()) {
                    C22141p.this.m115490m2(true);
                }
            }
        }
    }

    /* renamed from: l80.p$d */
    /* loaded from: classes6.dex */
    public static final class d implements AbstractRunnableC23992c.c {

        /* renamed from: b */
        final /* synthetic */ long f109059b;

        d(long j11) {
            this.f109059b = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static final void m115509k(C22141p c22141p) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115474B2();
            c22141p.m115497v2();
            c22141p.f109055w1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m115510l(C22141p c22141p) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115498w2();
            c22141p.f109055w1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static final void m115511m(C22141p c22141p) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115474B2();
            c22141p.m115499x2();
            c22141p.f109055w1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m115512n(C22141p c22141p, int i11) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115500y2(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static final void m115513o(C22141p c22141p) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115473A2();
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: b */
        public void mo65969b(String str) {
            C22141p c22141p = C22141p.this;
            c22141p.m115494q2("onStart: " + c22141p.f108869W0 + " " + str + " " + c22141p.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p2 = C22141p.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.u
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.d.m115513o(C22141p.this);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: c */
        public void mo65970c(String str, final int i11) {
            C22141p.this.m115494q2("onProgress: " + str + " " + i11);
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p = C22141p.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.r
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.d.m115512n(C22141p.this, i11);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: d */
        public void mo65971d(String str, int i11) {
            C22141p c22141p = C22141p.this;
            c22141p.m115494q2("onFailed: " + c22141p.f108869W0 + " " + str + " " + c22141p.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p2 = C22141p.this;
            AbstractC19444a.m101694b(new Runnable() { // from class: l80.t
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.d.m115511m(C22141p.this);
                }
            }, this.f109059b);
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: e */
        public void mo65972e(String str) {
            C22141p c22141p = C22141p.this;
            c22141p.m115494q2("onCancel: " + c22141p.f108869W0 + " " + str + " " + c22141p.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p2 = C22141p.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.q
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.d.m115509k(C22141p.this);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: f */
        public void mo65973f(String str) {
            C22141p c22141p = C22141p.this;
            c22141p.m115494q2("onComplete: " + c22141p.f108869W0 + " " + str + " " + c22141p.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p2 = C22141p.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.s
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.d.m115510l(C22141p.this);
                }
            });
        }
    }

    /* renamed from: l80.p$e */
    /* loaded from: classes6.dex */
    public static final class e implements AbstractRunnableC23992c.c {

        /* renamed from: b */
        final /* synthetic */ long f109061b;

        e(long j11) {
            this.f109061b = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static final void m115519k(C22141p c22141p) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115474B2();
            c22141p.m115497v2();
            c22141p.f109055w1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m115520l(C22141p c22141p) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115498w2();
            c22141p.f109055w1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static final void m115521m(C22141p c22141p) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115474B2();
            c22141p.m115499x2();
            c22141p.f109055w1 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m115522n(C22141p c22141p, int i11) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115500y2(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static final void m115523o(C22141p c22141p) {
            AbstractC19074t.m100208f(c22141p, "this$0");
            c22141p.m115473A2();
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: b */
        public void mo65969b(String str) {
            C22141p c22141p = C22141p.this;
            c22141p.m115494q2("onStart: " + c22141p.f108869W0 + " " + str + " " + c22141p.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p2 = C22141p.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.x
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.e.m115523o(C22141p.this);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: c */
        public void mo65970c(String str, final int i11) {
            C22141p.this.m115494q2("onProgress: " + str + " " + i11);
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p = C22141p.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.y
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.e.m115522n(C22141p.this, i11);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: d */
        public void mo65971d(String str, int i11) {
            C22141p c22141p = C22141p.this;
            c22141p.m115494q2("onFailed: " + c22141p.f108869W0 + " " + str + " " + c22141p.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p2 = C22141p.this;
            AbstractC19444a.m101694b(new Runnable() { // from class: l80.v
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.e.m115521m(C22141p.this);
                }
            }, this.f109061b);
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: e */
        public void mo65972e(String str) {
            C22141p c22141p = C22141p.this;
            c22141p.m115494q2("onCancel: " + c22141p.f108869W0 + " " + str + " " + c22141p.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p2 = C22141p.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.z
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.e.m115519k(C22141p.this);
                }
            });
        }

        @Override // p379o3.AbstractRunnableC23992c.c
        /* renamed from: f */
        public void mo65973f(String str) {
            C22141p c22141p = C22141p.this;
            c22141p.m115494q2("onComplete: " + c22141p.f108869W0 + " " + str + " " + c22141p.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
            if (!AbstractC19074t.m100204b(str, C22141p.this.getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
                return;
            }
            final C22141p c22141p2 = C22141p.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.w
                @Override // java.lang.Runnable
                public final void run() {
                    C22141p.e.m115520l(C22141p.this);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22141p(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f109042j1 = new c(Looper.getMainLooper());
        this.f109043k1 = new C16565c1(context, new C17024o0.a() { // from class: l80.n
            @Override // com.zing.zalo.zdesign.component.C17024o0.a
            /* renamed from: a */
            public final void mo61929a() {
                C22141p.m115495s2(C22141p.this);
            }
        });
        Drawable m139658a = C27280g.m139658a(context, AbstractC16803z.ic_video_retry_button);
        if (m139658a != null) {
            C16565c1.a aVar = C16565c1.Companion;
            m139658a.setBounds(0, 0, aVar.m88261a(), aVar.m88261a());
        } else {
            m139658a = null;
        }
        this.f109044l1 = m139658a;
        this.f109045m1 = true;
        this.f109050r1 = C3979l.b.UNKNOWN;
        this.f109052t1 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A2 */
    public final void m115473A2() {
        if (this.f109042j1.hasMessages(1000)) {
            return;
        }
        this.f109038f1 = false;
        this.f109041i1 = 5;
        this.f109043k1.m88259e(255);
        this.f109043k1.m88260f(this.f109041i1, false);
        m115492o2(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B2 */
    public final boolean m115474B2() {
        boolean hasMessages = this.f109042j1.hasMessages(1000);
        this.f109042j1.removeMessages(1000);
        if (hasMessages && !this.f109054v1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m115490m2(boolean z11) {
        String str;
        ValueAnimator ofInt;
        if (this.f109053u1) {
            return;
        }
        if (z11) {
            str = "fadeIn";
        } else {
            str = "fadeOut";
        }
        m115494q2(str + " " + this.f108869W0);
        if (z11) {
            ofInt = ValueAnimator.ofInt(0, 255);
        } else {
            ofInt = ValueAnimator.ofInt(255, 0);
        }
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l80.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C22141p.m115491n2(C22141p.this, valueAnimator);
            }
        });
        ofInt.addListener(new b());
        ofInt.setDuration(500L);
        this.f109053u1 = true;
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m115491n2(C22141p c22141p, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c22141p, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        C16565c1 c16565c1 = c22141p.f109043k1;
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c16565c1.m88259e(((Integer) animatedValue).intValue());
        c22141p.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m115492o2(long j11) {
        m115500y2(Math.min(this.f109043k1.m88258d() + 5, 70));
        Handler handler = this.f109042j1;
        handler.sendMessageDelayed(handler.obtainMessage(1000, Long.valueOf(j11)), j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p2 */
    public final boolean m115493p2() {
        m115494q2("hasFinished: " + this.f108869W0 + " " + this.f109038f1 + " " + this.f109039g1 + " " + this.f109040h1);
        if (!this.f109038f1 && !this.f109039g1 && !this.f109040h1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m115494q2(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m115495s2(C22141p c22141p) {
        AbstractC19074t.m100208f(c22141p, "this$0");
        if (AbstractC19444a.m101693a()) {
            c22141p.invalidate();
        } else {
            c22141p.postInvalidate();
        }
    }

    /* renamed from: u2 */
    private final void m115496u2() {
        this.f109038f1 = false;
        this.f109039g1 = false;
        this.f109040h1 = false;
        this.f109042j1.removeMessages(1001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m115497v2() {
        this.f109040h1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w2 */
    public final void m115498w2() {
        m115500y2(100);
        this.f109039g1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x2 */
    public final void m115499x2() {
        this.f109038f1 = true;
        this.f109041i1 = 0;
        invalidate();
        m115474B2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y2 */
    public final void m115500y2(int i11) {
        int m116580c;
        m116580c = AbstractC22543l.m116580c(i11, 5);
        if (m116580c > this.f109041i1) {
            this.f109041i1 = m116580c;
            this.f109043k1.m88260f(m116580c, true);
            if (i11 >= 100 && m115474B2()) {
                m115490m2(false);
            }
        }
    }

    /* renamed from: z2 */
    private final boolean m115501z2() {
        if (this.f109045m1 && !this.f109054v1 && !this.f109038f1) {
            int i11 = this.f109041i1;
            if (1 <= i11 && i11 < 100) {
                return true;
            }
            if (i11 >= 100 && this.f109053u1) {
                return true;
            }
        }
        return false;
    }

    @Override // l80.C22122a0
    /* renamed from: I1 */
    public void mo65956I1(C23528a c23528a, String str, C24003n c24003n, int i11, C3979l.b bVar, C22122a0.d dVar) {
        long j11;
        this.f109046n1 = c23528a;
        this.f109047o1 = str;
        this.f109048p1 = c24003n;
        this.f109049q1 = i11;
        this.f109050r1 = bVar;
        this.f109051s1 = dVar;
        if (this.f109038f1) {
            j11 = 500;
        } else {
            j11 = 0;
        }
        m115494q2("loadPhotoProgress: " + this.f108869W0 + " " + str + " " + getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
        if (!AbstractC19074t.m100204b(str, getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
            setTag(AbstractC6918a0.tag_url_progress_recycling_image_module, str);
            m115496u2();
            m115474B2();
            if (!this.f109055w1) {
                this.f109054v1 = true;
                this.f109042j1.sendEmptyMessageDelayed(1001, 1000L);
            }
            invalidate();
        }
        if (!AbstractC19074t.m100204b(str, getTag(AbstractC6918a0.tag_url_progress_recycling_image_module)) || !this.f109039g1) {
            super.m115378L1(c23528a, str, c24003n, i11, bVar, dVar, new d(j11));
        }
    }

    @Override // l80.C22122a0
    /* renamed from: J1 */
    public void mo65957J1(C23528a c23528a, String str, C24003n c24003n, int i11, C3979l.b bVar, C22122a0.d dVar, int i12) {
        long j11;
        this.f109046n1 = c23528a;
        this.f109047o1 = str;
        this.f109048p1 = c24003n;
        this.f109049q1 = i11;
        this.f109050r1 = bVar;
        this.f109051s1 = dVar;
        this.f109052t1 = i12;
        if (this.f109038f1) {
            j11 = 500;
        } else {
            j11 = 0;
        }
        m115494q2("loadPhotoProgress: " + this.f108869W0 + " " + str + " " + getTag(AbstractC6918a0.tag_url_progress_recycling_image_module));
        if (!AbstractC19074t.m100204b(str, getTag(AbstractC6918a0.tag_url_progress_recycling_image_module))) {
            setTag(AbstractC6918a0.tag_url_progress_recycling_image_module, str);
            m115496u2();
            m115474B2();
            if (!this.f109055w1) {
                this.f109054v1 = true;
                this.f109042j1.sendEmptyMessageDelayed(1001, 1000L);
            }
            invalidate();
        }
        if (!AbstractC19074t.m100204b(str, getTag(AbstractC6918a0.tag_url_progress_recycling_image_module)) || !this.f109039g1) {
            super.m115377K1(c23528a, str, c24003n, i11, bVar, dVar, i12, new e(j11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l80.C22122a0, kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo44775o0(canvas);
        if (m115501z2()) {
            this.f109043k1.m88257c(canvas);
        }
        if (this.f109038f1 && this.f109045m1) {
            canvas.save();
            int m89110N = m89110N();
            C16565c1.a aVar = C16565c1.Companion;
            canvas.translate((m89110N - aVar.m88261a()) / 2.0f, (m89108M() - aVar.m88261a()) / 2.0f);
            Drawable drawable = this.f109044l1;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        super.mo44180q0(i11, i12, i13, i14);
        this.f109043k1.m88256b(m89110N(), m89108M());
    }

    /* renamed from: r2 */
    public final void m115502r2(boolean z11) {
        this.f109045m1 = z11;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: t0 */
    public boolean mo65871t0(MotionEvent motionEvent) {
        int m89110N = m89110N();
        C16565c1.a aVar = C16565c1.Companion;
        float m88261a = (m89110N - aVar.m88261a()) / 2.0f;
        float m89108M = (m89108M() - aVar.m88261a()) / 2.0f;
        Rect rect = new Rect((int) m88261a, (int) m89108M, (int) (m88261a + aVar.m88261a()), (int) (m89108M + aVar.m88261a()));
        if (motionEvent != null && motionEvent.getAction() == 1 && this.f109038f1 && this.f109045m1 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            setTag(AbstractC6918a0.tag_url_progress_recycling_image_module, null);
            this.f109055w1 = true;
            int i11 = this.f109052t1;
            if (i11 != -1) {
                mo65957J1(this.f109046n1, this.f109047o1, this.f109048p1, this.f109049q1, this.f109050r1, this.f109051s1, i11);
            } else {
                mo65956I1(this.f109046n1, this.f109047o1, this.f109048p1, this.f109049q1, this.f109050r1, this.f109051s1);
            }
        }
        if (motionEvent != null && this.f109038f1 && this.f109045m1 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return super.mo65871t0(motionEvent);
    }

    /* renamed from: t2 */
    public final void m115503t2() {
        setTag(AbstractC6918a0.tag_url_progress_recycling_image_module, null);
    }
}

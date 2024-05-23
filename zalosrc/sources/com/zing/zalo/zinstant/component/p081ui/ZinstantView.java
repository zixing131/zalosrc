package com.zing.zalo.zinstant.component.p081ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.zing.zalo.zinstant.component.p081ui.ZinstantView;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.AbstractC17208t;
import com.zing.zalo.zinstant.utils.C17202n;
import com.zing.zalo.zinstant.utils.InterfaceC17194f;
import com.zing.zalo.zinstant.view.AbstractC17227d;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import gg0.AbstractC19444a;
import java.util.Collections;
import nk0.AbstractC23825g0;
import nk0.AbstractC23838k1;
import nk0.C23855s0;
import nk0.InterfaceC23860v;
import pj0.C24783i;
import qk0.AbstractC25310f;
import qk0.InterfaceC25305a;
import qk0.InterfaceC25307c;
import qk0.InterfaceC25316l;
import uk0.C27291e;
import uk0.InterfaceC27287a;
import wj0.InterfaceC29061b;

/* loaded from: classes7.dex */
public class ZinstantView extends View implements Drawable.Callback, InterfaceC25316l, InterfaceC29061b {

    /* renamed from: J */
    static final int f87518J = ViewConfiguration.getLongPressTimeout();

    /* renamed from: A */
    private final AbstractC17227d f87519A;

    /* renamed from: B */
    private final Rect f87520B;

    /* renamed from: C */
    private final Runnable f87521C;

    /* renamed from: D */
    private final Runnable f87522D;

    /* renamed from: E */
    private final Runnable f87523E;

    /* renamed from: F */
    private final Runnable f87524F;

    /* renamed from: G */
    private final Runnable f87525G;

    /* renamed from: H */
    private int f87526H;

    /* renamed from: I */
    private final Runnable f87527I;

    /* renamed from: p */
    public C23855s0 f87528p;

    /* renamed from: q */
    public InterfaceC23860v f87529q;

    /* renamed from: r */
    float f87530r;

    /* renamed from: s */
    float f87531s;

    /* renamed from: t */
    boolean f87532t;

    /* renamed from: u */
    int f87533u;

    /* renamed from: v */
    MotionEvent f87534v;

    /* renamed from: w */
    private boolean f87535w;

    /* renamed from: x */
    private final Runnable f87536x;

    /* renamed from: y */
    private final Handler f87537y;

    /* renamed from: z */
    final Rect f87538z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$a */
    /* loaded from: classes7.dex */
    public class RunnableC17110a implements Runnable {
        RunnableC17110a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C23855s0 c23855s0 = ZinstantView.this.f87528p;
            if (c23855s0 != null) {
                c23855s0.m124644i0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$b */
    /* loaded from: classes7.dex */
    public class RunnableC17111b implements Runnable {
        RunnableC17111b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC25305a interfaceC25305a;
            InterfaceC23860v interfaceC23860v = ZinstantView.this.f87529q;
            if (interfaceC23860v != null) {
                interfaceC25305a = interfaceC23860v.mo92022a();
            } else {
                interfaceC25305a = null;
            }
            ZinstantView zinstantView = ZinstantView.this;
            C23855s0 c23855s0 = zinstantView.f87528p;
            MotionEvent motionEvent = zinstantView.f87534v;
            if (motionEvent == null) {
                return;
            }
            boolean m124635X = c23855s0.m124635X(motionEvent, 3);
            ZinstantView.this.f87535w = true;
            if (interfaceC25305a == null) {
                return;
            }
            if (m124635X) {
                ZinstantView.this.performHapticFeedback(0);
            } else {
                interfaceC25305a.mo92030a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$c */
    /* loaded from: classes7.dex */
    public class HandlerC17112c extends Handler {
        HandlerC17112c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                ZinstantView.this.mo91521y();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$d */
    /* loaded from: classes7.dex */
    public class ViewOnTouchListenerC17113d implements View.OnTouchListener {
        ViewOnTouchListenerC17113d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:            if (r1 != 6) goto L66;     */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            InterfaceC25305a clickHandler = ZinstantView.this.getClickHandler();
            if (clickHandler == null || !clickHandler.mo92034e() || motionEvent == null) {
                return false;
            }
            boolean m91513l = ZinstantView.this.m91513l(motionEvent);
            ZinstantView zinstantView = ZinstantView.this;
            C23855s0 c23855s0 = zinstantView.f87528p;
            if (c23855s0 == null) {
                return false;
            }
            if (!m91513l) {
                c23855s0.m124635X(motionEvent, 4);
                return false;
            }
            zinstantView.f87534v = MotionEvent.obtain(motionEvent);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        c23855s0.m124635X(motionEvent, 4);
                    }
                }
                if (ZinstantView.this.f87535w) {
                    ZinstantView.this.f87535w = false;
                } else if (!c23855s0.m124635X(motionEvent, 1)) {
                    clickHandler.mo92031b();
                }
                c23855s0.m124635X(motionEvent, 4);
            } else {
                c23855s0.m124635X(motionEvent, 2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$e */
    /* loaded from: classes7.dex */
    public class C17114e extends AbstractC17227d {
        C17114e(View view) {
            super(view);
        }

        @Override // com.zing.zalo.zinstant.view.AbstractC17227d
        /* renamed from: l */
        protected void mo91522l(boolean z11) {
            ZinstantView.this.m91508E(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$f */
    /* loaded from: classes7.dex */
    public class RunnableC17115f implements Runnable {
        RunnableC17115f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C23855s0 c23855s0 = ZinstantView.this.f87528p;
            if (c23855s0 != null) {
                c23855s0.onStart();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$g */
    /* loaded from: classes7.dex */
    public class RunnableC17116g implements Runnable {
        RunnableC17116g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C23855s0 c23855s0 = ZinstantView.this.f87528p;
            if (c23855s0 != null) {
                c23855s0.onResume();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$h */
    /* loaded from: classes7.dex */
    public class RunnableC17117h implements Runnable {
        RunnableC17117h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C23855s0 c23855s0 = ZinstantView.this.f87528p;
            if (c23855s0 != null) {
                c23855s0.onPause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$i */
    /* loaded from: classes7.dex */
    public class RunnableC17118i implements Runnable {
        RunnableC17118i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C23855s0 c23855s0 = ZinstantView.this.f87528p;
            if (c23855s0 != null) {
                c23855s0.onStop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.ZinstantView$j */
    /* loaded from: classes7.dex */
    public class RunnableC17119j implements Runnable {
        RunnableC17119j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C23855s0 c23855s0 = ZinstantView.this.f87528p;
                if (c23855s0 != null) {
                    c23855s0.m124645r();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ZinstantView(Context context) {
        super(context);
        this.f87530r = 0.0f;
        this.f87531s = 0.0f;
        this.f87532t = false;
        this.f87535w = false;
        this.f87536x = new RunnableC17111b();
        this.f87537y = new HandlerC17112c(Looper.getMainLooper());
        this.f87538z = new Rect();
        this.f87520B = new Rect();
        this.f87521C = new RunnableC17115f();
        this.f87522D = new RunnableC17116g();
        this.f87523E = new RunnableC17117h();
        this.f87524F = new RunnableC17118i();
        this.f87525G = new RunnableC17119j();
        this.f87526H = 0;
        this.f87527I = new RunnableC17110a();
        this.f87533u = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setOnTouchListener(new ViewOnTouchListenerC17113d());
        this.f87519A = new C17114e(this);
    }

    /* renamed from: A */
    public /* synthetic */ void m91486A(C23855s0 c23855s0, AbstractC23825g0 abstractC23825g0, InterfaceC25307c.a aVar) {
        C23855s0 c23855s02 = this.f87528p;
        if (c23855s0 == c23855s02 && c23855s02 != null) {
            Rect rect = new Rect();
            C17202n.m91830a(this, abstractC23825g0.m131023r(), rect);
            c23855s0.m124639c0(new Runnable() { // from class: wj0.i

                /* renamed from: q */
                public final /* synthetic */ Rect f134648q;

                public /* synthetic */ RunnableC29068i(Rect rect2) {
                    r2 = rect2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantView.m91507z(InterfaceC25307c.a.this, r2);
                }
            });
        }
    }

    /* renamed from: B */
    public /* synthetic */ void m91487B(Drawable drawable, Runnable runnable, long j11) {
        scheduleDrawable(drawable, runnable, j11);
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m91488C(String str, AbstractC25310f abstractC25310f) {
        return TextUtils.equals(abstractC25310f.m131007J().mID, str);
    }

    /* renamed from: F */
    private void m91490F() {
        m91509J(this.f87523E);
    }

    /* renamed from: G */
    private void m91491G() {
        m91509J(this.f87522D);
    }

    /* renamed from: H */
    private void m91492H() {
        m91509J(this.f87521C);
    }

    /* renamed from: I */
    private void m91493I() {
        m91509J(this.f87524F);
    }

    public InterfaceC25305a getClickHandler() {
        InterfaceC23860v interfaceC23860v = this.f87529q;
        if (interfaceC23860v != null) {
            return interfaceC23860v.mo92022a();
        }
        return null;
    }

    /* renamed from: p */
    private boolean m91502p() {
        return this.f87526H == 0;
    }

    /* renamed from: r */
    private boolean m91503r() {
        return this.f87526H == 3;
    }

    /* renamed from: s */
    private boolean m91504s() {
        return this.f87526H == 2;
    }

    /* renamed from: v */
    private boolean m91505v() {
        return this.f87526H == 1;
    }

    /* renamed from: x */
    private boolean m91506x() {
        return this.f87526H == 4;
    }

    /* renamed from: z */
    public static /* synthetic */ void m91507z(InterfaceC25307c.a aVar, Rect rect) {
        aVar.mo92118a(new ZOMRect(rect.left, rect.top, rect.right, rect.bottom));
    }

    /* renamed from: E */
    protected void m91508E(boolean z11) {
        if (z11 && AbstractC17201m.m91822n(this, this.f87538z) && !this.f87537y.hasMessages(1)) {
            this.f87537y.sendEmptyMessageDelayed(1, 100L);
        }
    }

    /* renamed from: J */
    public void m91509J(Runnable runnable) {
        runnable.run();
    }

    @Override // qk0.InterfaceC25316l
    /* renamed from: a */
    public void m91489D(Drawable drawable, Runnable runnable) {
        this.f87537y.post(new Runnable() { // from class: wj0.e

            /* renamed from: q */
            public final /* synthetic */ Drawable f134636q;

            /* renamed from: r */
            public final /* synthetic */ Runnable f134637r;

            public /* synthetic */ RunnableC29064e(Drawable drawable2, Runnable runnable2) {
                r2 = drawable2;
                r3 = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantView.this.m91489D(r2, r3);
            }
        });
    }

    @Override // qk0.InterfaceC25316l
    /* renamed from: b */
    public void mo91511b(Drawable drawable, Runnable runnable, long j11) {
        this.f87537y.post(new Runnable() { // from class: wj0.g

            /* renamed from: q */
            public final /* synthetic */ Drawable f134640q;

            /* renamed from: r */
            public final /* synthetic */ Runnable f134641r;

            /* renamed from: s */
            public final /* synthetic */ long f134642s;

            public /* synthetic */ RunnableC29066g(Drawable drawable2, Runnable runnable2, long j112) {
                r2 = drawable2;
                r3 = runnable2;
                r4 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantView.this.m91487B(r2, r3, r4);
            }
        });
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: f */
    public boolean mo91512f(String str, String str2, int i11) {
        return false;
    }

    @Override // wj0.InterfaceC29061b
    public ZOMRect getGlobalZOMRect() {
        ZOM zom;
        C23855s0 c23855s0 = this.f87528p;
        if (c23855s0 != null) {
            zom = c23855s0.m124620A();
        } else {
            zom = null;
        }
        if (zom == null) {
            return null;
        }
        return zom.mBound;
    }

    @Override // qk0.InterfaceC25316l, wj0.InterfaceC29061b
    public View getView() {
        return this;
    }

    @Override // qk0.InterfaceC25316l
    public Rect getVisibleRect() {
        return this.f87520B;
    }

    @Override // wj0.InterfaceC29061b
    public ZOM getZINSNode() {
        C23855s0 c23855s0 = this.f87528p;
        if (c23855s0 != null) {
            return c23855s0.m124620A();
        }
        return null;
    }

    @Override // qk0.InterfaceC25316l
    public InterfaceC23860v getZinstantHandler() {
        return this.f87529q;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC19444a.m101697e(new Runnable() { // from class: wj0.c
            public /* synthetic */ RunnableC29062c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantView.this.invalidate();
            }
        });
    }

    /* renamed from: l */
    boolean m91513l(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && !this.f87532t) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f87537y.removeCallbacks(this.f87536x);
                        this.f87532t = false;
                    }
                } else {
                    float abs = Math.abs(x11 - this.f87530r);
                    float abs2 = Math.abs(y11 - this.f87531s);
                    int i11 = this.f87533u;
                    if (abs > i11 || abs2 > i11) {
                        this.f87532t = false;
                        this.f87537y.removeCallbacks(this.f87536x);
                    }
                }
            } else {
                this.f87537y.removeCallbacks(this.f87536x);
                if (this.f87532t) {
                    this.f87532t = false;
                    return true;
                }
            }
        } else {
            this.f87532t = true;
            this.f87530r = x11;
            this.f87531s = y11;
            this.f87535w = false;
            this.f87537y.postDelayed(this.f87536x, f87518J);
        }
        return this.f87532t;
    }

    /* renamed from: m */
    public C24783i m91514m(C23855s0 c23855s0, InterfaceC23860v interfaceC23860v) {
        if (this.f87529q != interfaceC23860v) {
            this.f87529q = interfaceC23860v;
        }
        this.f87526H = 0;
        c23855s0.m124642g0(this);
        C23855s0 c23855s02 = this.f87528p;
        if (c23855s0 == c23855s02) {
            return new C24783i(c23855s02.m124651z(), this.f87528p.getHeight());
        }
        if (c23855s02 != null && c23855s02.f115183g.get() == this) {
            this.f87528p.m124642g0(null);
        }
        this.f87528p = c23855s0;
        return new C24783i(c23855s0.m124651z(), this.f87528p.getHeight());
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: n */
    public void mo91515n() {
        C17202n.m91831b(this, this.f87520B);
        if (this.f87520B.width() > 0 && this.f87520B.height() > 0) {
            m91509J(this.f87525G);
        }
    }

    @Override // qk0.InterfaceC25316l
    /* renamed from: o */
    public void mo91516o(AbstractC23825g0 abstractC23825g0, InterfaceC25307c.a aVar) {
        this.f87537y.post(new Runnable() { // from class: wj0.h

            /* renamed from: q */
            public final /* synthetic */ C23855s0 f134644q;

            /* renamed from: r */
            public final /* synthetic */ AbstractC23825g0 f134645r;

            /* renamed from: s */
            public final /* synthetic */ InterfaceC25307c.a f134646s;

            public /* synthetic */ RunnableC29067h(C23855s0 c23855s0, AbstractC23825g0 abstractC23825g02, InterfaceC25307c.a aVar2) {
                r2 = c23855s0;
                r3 = abstractC23825g02;
                r4 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantView.this.m91486A(r2, r3, r4);
            }
        });
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C23855s0 c23855s0 = this.f87528p;
        if (c23855s0 != null) {
            c23855s0.m124634W(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        C23855s0 c23855s0 = this.f87528p;
        if (c23855s0 != null) {
            i13 = c23855s0.m124651z();
            i14 = this.f87528p.getHeight();
        } else {
            i13 = 0;
            i14 = 0;
        }
        setMeasuredDimension(i13, i14);
    }

    @Override // wj0.InterfaceC29061b
    public void onPause() {
        if (m91504s()) {
            this.f87526H = 3;
            this.f87519A.m92052n();
            m91490F();
        }
    }

    @Override // wj0.InterfaceC29061b
    public void onResume() {
        if (m91502p() || m91506x()) {
            onStart();
        }
        if (m91505v() || m91503r()) {
            this.f87526H = 2;
            this.f87519A.m92051m();
            m91491G();
            this.f87537y.post(new Runnable() { // from class: wj0.d
                public /* synthetic */ RunnableC29063d() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantView.this.mo91521y();
                }
            });
        }
    }

    public void onStart() {
        if (m91502p() || m91506x()) {
            this.f87526H = 1;
            m91492H();
        }
        onResume();
    }

    public void onStop() {
        if (m91503r() || m91505v()) {
            this.f87526H = 4;
            m91493I();
        }
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: q */
    public void mo91517q(AbstractC23838k1 abstractC23838k1) {
        if (getParent() instanceof InterfaceC29061b) {
            ((InterfaceC29061b) getParent()).mo91517q(abstractC23838k1);
        } else if (getParent() == null) {
        } else {
            throw new IllegalStateException("ZinstantView must be a child of ZINSComponent to work correctly.");
        }
    }

    @Override // qk0.InterfaceC25316l
    /* renamed from: t */
    public boolean mo91518t(C27291e c27291e) {
        InterfaceC27287a mo92025d = this.f87529q.mo92025d();
        if (this.f87529q != null && mo92025d != null) {
            mo92025d.mo92021a(c27291e);
            return true;
        }
        return false;
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: u */
    public boolean mo91519u(String str) {
        AbstractC25310f abstractC25310f;
        AbstractC25310f m91849a;
        C23855s0 c23855s0 = this.f87528p;
        if (c23855s0 != null && (abstractC25310f = c23855s0.f115179c) != null && (m91849a = AbstractC17208t.Companion.m91849a(abstractC25310f, Collections.singletonList(AbstractC25310f.a.ZinstantNode), new InterfaceC17194f() { // from class: wj0.f

            /* renamed from: a */
            public final /* synthetic */ String f134638a;

            public /* synthetic */ C29065f(String str2) {
                r1 = str2;
            }

            @Override // com.zing.zalo.zinstant.utils.InterfaceC17194f
            /* renamed from: a */
            public final boolean mo91804a(Object obj) {
                boolean m91488C;
                m91488C = ZinstantView.m91488C(r1, (AbstractC25310f) obj);
                return m91488C;
            }
        })) != null) {
            ZinstantLayout.m91934E0(this, m91849a.m131023r().top);
            return true;
        }
        return false;
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: w */
    public void mo91520w(C23855s0 c23855s0, AbstractC23838k1 abstractC23838k1) {
        if (getParent() instanceof InterfaceC29061b) {
            ((InterfaceC29061b) getParent()).mo91520w(c23855s0, abstractC23838k1);
        } else if (getParent() == null) {
        } else {
            throw new IllegalStateException("ZinstantView must be a child of ZINSComponent to work correctly.");
        }
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: y */
    public void mo91521y() {
        C17202n.m91831b(this, this.f87520B);
        m91509J(this.f87527I);
    }
}

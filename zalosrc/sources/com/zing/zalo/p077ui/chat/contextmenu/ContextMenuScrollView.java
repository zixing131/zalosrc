package com.zing.zalo.p077ui.chat.contextmenu;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zing.zalo.p077ui.widget.ScrollView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import y50.InterfaceC30793c;

/* loaded from: classes5.dex */
public final class ContextMenuScrollView extends ScrollView {
    public static final C11546b Companion = new C11546b(null);

    /* renamed from: E */
    private static final InterfaceC24854k f59673E;

    /* renamed from: A */
    private final InterfaceC24854k f59674A;

    /* renamed from: B */
    private final InterfaceC24854k f59675B;

    /* renamed from: C */
    private final Rect f59676C;

    /* renamed from: D */
    private final RunnableC11548d f59677D;

    /* renamed from: q */
    private final int f59678q;

    /* renamed from: r */
    private InterfaceC11547c f59679r;

    /* renamed from: s */
    private boolean f59680s;

    /* renamed from: t */
    private int f59681t;

    /* renamed from: u */
    private final RunnableC11549e f59682u;

    /* renamed from: v */
    private int f59683v;

    /* renamed from: w */
    private long f59684w;

    /* renamed from: x */
    private boolean f59685x;

    /* renamed from: y */
    private final InterfaceC24854k f59686y;

    /* renamed from: z */
    private final InterfaceC24854k f59687z;

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.ContextMenuScrollView$a */
    /* loaded from: classes5.dex */
    static final class C11545a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11545a f59688q = new C11545a();

        C11545a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118742r(5.0f));
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.ContextMenuScrollView$b */
    /* loaded from: classes5.dex */
    public static final class C11546b {
        private C11546b() {
        }

        public /* synthetic */ C11546b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m62657a() {
            return ((Number) ContextMenuScrollView.f59673E.getValue()).intValue();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.ContextMenuScrollView$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC11547c {
        void onStart();

        void onStop();
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.ContextMenuScrollView$d */
    /* loaded from: classes5.dex */
    public static final class RunnableC11548d implements Runnable {
        RunnableC11548d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int scrollY = ContextMenuScrollView.this.f59683v - ContextMenuScrollView.this.getScrollY();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - ContextMenuScrollView.this.f59684w;
            ContextMenuScrollView.this.f59684w = elapsedRealtime;
            int m62657a = (int) ((((float) j11) / ((float) 16)) * ContextMenuScrollView.Companion.m62657a());
            if (scrollY > m62657a) {
                ContextMenuScrollView.this.smoothScrollBy(0, m62657a);
            } else {
                int i11 = -m62657a;
                if (scrollY < i11) {
                    ContextMenuScrollView.this.smoothScrollBy(0, i11);
                } else {
                    ContextMenuScrollView.this.smoothScrollBy(0, scrollY);
                    ContextMenuScrollView.this.f59685x = false;
                }
            }
            if (ContextMenuScrollView.this.m62654m()) {
                ContextMenuScrollView.this.postDelayed(this, 16L);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.ContextMenuScrollView$e */
    /* loaded from: classes5.dex */
    public static final class RunnableC11549e implements Runnable {
        RunnableC11549e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int scrollY = ContextMenuScrollView.this.getScrollY();
            if (ContextMenuScrollView.this.f59681t - scrollY == 0) {
                InterfaceC11547c interfaceC11547c = ContextMenuScrollView.this.f59679r;
                if (interfaceC11547c != null) {
                    interfaceC11547c.onStop();
                    return;
                }
                return;
            }
            ContextMenuScrollView.this.f59681t = scrollY;
            ContextMenuScrollView.this.postDelayed(this, 100L);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.ContextMenuScrollView$f */
    /* loaded from: classes5.dex */
    static final class C11550f extends AbstractC19075u implements InterfaceC18494a {
        C11550f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(ContextMenuScrollView.this.getHeight() - (ContextMenuScrollView.this.f59678q * 4));
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.ContextMenuScrollView$g */
    /* loaded from: classes5.dex */
    static final class C11551g extends AbstractC19075u implements InterfaceC18494a {
        C11551g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(ContextMenuScrollView.this.f59678q * 6);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.ContextMenuScrollView$h */
    /* loaded from: classes5.dex */
    static final class C11552h extends AbstractC19075u implements InterfaceC18494a {
        C11552h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(ContextMenuScrollView.this.getHeight() - ContextMenuScrollView.this.f59678q);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.ContextMenuScrollView$i */
    /* loaded from: classes5.dex */
    static final class C11553i extends AbstractC19075u implements InterfaceC18494a {
        C11553i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(ContextMenuScrollView.this.f59678q * 3);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C11545a.f59688q);
        f59673E = m129210a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "context");
        this.f59678q = AbstractC23136l9.m118742r(11.0f);
        this.f59682u = new RunnableC11549e();
        m129210a = AbstractC24856m.m129210a(new C11550f());
        this.f59686y = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11552h());
        this.f59687z = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C11551g());
        this.f59674A = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C11553i());
        this.f59675B = m129210a4;
        this.f59676C = new Rect();
        this.f59677D = new RunnableC11548d();
    }

    private final int getTouchExceedBottomThreshold() {
        return ((Number) this.f59686y.getValue()).intValue();
    }

    private final int getTouchExceedTopThreshold() {
        return ((Number) this.f59674A.getValue()).intValue();
    }

    private final int getViewExceedBottomThreshold() {
        return ((Number) this.f59687z.getValue()).intValue();
    }

    private final int getViewExceedTopThreshold() {
        return ((Number) this.f59675B.getValue()).intValue();
    }

    /* renamed from: l */
    private final int m62652l(InterfaceC30793c.b bVar, int i11) {
        int touchExceedTopThreshold;
        bVar.m149763g().getDrawingRect(this.f59676C);
        offsetDescendantRectToMyCoords(bVar.m149763g(), this.f59676C);
        int scrollY = this.f59676C.top - getScrollY();
        int scrollY2 = this.f59676C.bottom - getScrollY();
        if (i11 > getTouchExceedBottomThreshold() && scrollY2 > getViewExceedBottomThreshold()) {
            touchExceedTopThreshold = getTouchExceedBottomThreshold();
        } else if (i11 < getTouchExceedTopThreshold() && scrollY < getViewExceedTopThreshold()) {
            touchExceedTopThreshold = getTouchExceedTopThreshold();
        } else {
            return 0;
        }
        return i11 - touchExceedTopThreshold;
    }

    /* renamed from: k */
    public final void m62653k(InterfaceC30793c.b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "content");
        int m62652l = m62652l(bVar, i11);
        if (m62652l != 0) {
            this.f59683v = m62652l + getScrollY();
            if (!this.f59685x) {
                this.f59685x = true;
                this.f59684w = SystemClock.elapsedRealtime();
                postDelayed(this.f59677D, 16L);
            }
        }
    }

    /* renamed from: m */
    public final boolean m62654m() {
        return this.f59685x;
    }

    /* renamed from: n */
    public final void m62655n() {
        this.f59685x = false;
        removeCallbacks(this.f59677D);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59679r = null;
        removeCallbacks(this.f59682u);
        removeCallbacks(this.f59677D);
    }

    @Override // com.zing.zalo.p077ui.widget.ScrollView, android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 0) {
            this.f59680s = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        if (!this.f59680s) {
            this.f59680s = true;
            InterfaceC11547c interfaceC11547c = this.f59679r;
            if (interfaceC11547c != null) {
                interfaceC11547c.onStart();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.widget.ScrollView, android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f59681t = getScrollY();
                postDelayed(this.f59682u, 100L);
            }
        } else {
            this.f59680s = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setGestureScrollEventListener(InterfaceC11547c interfaceC11547c) {
        this.f59679r = interfaceC11547c;
    }
}

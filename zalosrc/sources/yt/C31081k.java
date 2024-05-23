package yt;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.libbubbleview.C8949b;
import com.zing.zalo.libbubbleview.HostFrameLayout;
import fn0.AbstractC19074t;
import p227i3.C20218v;

/* renamed from: yt.k */
/* loaded from: classes4.dex */
public class C31081k {

    /* renamed from: a */
    private final Context f143276a;

    /* renamed from: b */
    private final ViewGroup f143277b;

    /* renamed from: c */
    private View f143278c;

    /* renamed from: d */
    private boolean f143279d;

    /* renamed from: e */
    private HostFrameLayout f143280e;

    /* renamed from: f */
    private C8949b f143281f;

    /* renamed from: g */
    private View f143282g;

    /* renamed from: h */
    private View f143283h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yt.k$a */
    /* loaded from: classes4.dex */
    public static final class a extends View {
        public a(Context context) {
            super(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: yt.k$b */
    /* loaded from: classes4.dex */
    public final class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            AbstractC19074t.m100208f(motionEvent, "event");
            motionEvent.offsetLocation(C31081k.this.m151007j(view), C31081k.this.m151008k(view));
            HostFrameLayout hostFrameLayout = C31081k.this.f143280e;
            if (hostFrameLayout == null) {
                AbstractC19074t.m100223u("frameLayout");
                hostFrameLayout = null;
            }
            return hostFrameLayout.dispatchTouchEvent(motionEvent);
        }
    }

    public C31081k(Context context, ViewGroup viewGroup) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(viewGroup, "rootView");
        this.f143276a = context;
        this.f143277b = viewGroup;
    }

    /* renamed from: b */
    private final void m150998b(View view) {
        m150999c(view, m151000g());
    }

    /* renamed from: c */
    private final void m150999c(View view, RelativeLayout.LayoutParams layoutParams) {
        AbstractC19074t.m100205c(view);
        view.setLayoutParams(layoutParams);
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        this.f143277b.addView(view, layoutParams);
    }

    /* renamed from: g */
    private final RelativeLayout.LayoutParams m151000g() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* renamed from: i */
    public static /* synthetic */ ViewGroup.LayoutParams m151001i(C31081k c31081k, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        int i18;
        int i19;
        if (obj == null) {
            if ((i17 & 16) != 0) {
                i18 = 0;
            } else {
                i18 = i15;
            }
            if ((i17 & 32) != 0) {
                i19 = 0;
            } else {
                i19 = i16;
            }
            return c31081k.m151006h(i11, i12, i13, i14, i18, i19);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayoutParams");
    }

    /* renamed from: m */
    private final RelativeLayout.LayoutParams m151002m(View view) {
        AbstractC19074t.m100205c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        return (RelativeLayout.LayoutParams) layoutParams;
    }

    /* renamed from: d */
    public final void m151003d(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC19074t.m100208f(view, "floatingItemView");
        AbstractC19074t.m100208f(layoutParams, "layoutParams");
        this.f143282g = view;
        m151005f(view, layoutParams);
    }

    /* renamed from: e */
    public final void m151004e(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC19074t.m100208f(view, "logoView");
        AbstractC19074t.m100208f(layoutParams, "layoutParams");
        this.f143283h = view;
        m151005f(view, layoutParams);
    }

    /* renamed from: f */
    public final void m151005f(View view, ViewGroup.LayoutParams layoutParams) {
        HostFrameLayout hostFrameLayout = this.f143280e;
        if (hostFrameLayout == null) {
            AbstractC19074t.m100223u("frameLayout");
            hostFrameLayout = null;
        }
        hostFrameLayout.addView(view, layoutParams);
        m150998b(this.f143278c);
        RelativeLayout.LayoutParams m151002m = m151002m(this.f143278c);
        m151002m.width = 0;
        m151002m.height = 0;
        this.f143277b.updateViewLayout(this.f143278c, m151002m);
        this.f143279d = true;
    }

    /* renamed from: h */
    public final ViewGroup.LayoutParams m151006h(int i11, int i12, int i13, int i14, int i15, int i16) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i11);
        layoutParams.gravity = i13;
        layoutParams.bottomMargin = i14;
        layoutParams.rightMargin = i15;
        layoutParams.leftMargin = i16;
        return layoutParams;
    }

    /* renamed from: j */
    protected final int m151007j(View view) {
        AbstractC19074t.m100208f(view, "container");
        m151002m(view);
        return (int) view.getX();
    }

    /* renamed from: k */
    protected final int m151008k(View view) {
        m151002m(view);
        AbstractC19074t.m100205c(view);
        return (int) view.getX();
    }

    /* renamed from: l */
    public final View m151009l() {
        return this.f143282g;
    }

    /* renamed from: n */
    public final View m151010n() {
        return this.f143277b;
    }

    /* renamed from: o */
    public final void m151011o(C8949b c8949b) {
        AbstractC19074t.m100208f(c8949b, "manager");
        this.f143281f = c8949b;
        HostFrameLayout hostFrameLayout = new HostFrameLayout(this.f143276a, c8949b);
        hostFrameLayout.setFocusable(true);
        hostFrameLayout.setFocusableInTouchMode(true);
        this.f143280e = hostFrameLayout;
        m150998b(hostFrameLayout);
        this.f143278c = new a(this.f143276a);
        b bVar = new b();
        View view = this.f143278c;
        if (view != null) {
            view.setOnTouchListener(bVar);
        }
    }

    /* renamed from: p */
    public final void m151012p() {
        try {
            HostFrameLayout hostFrameLayout = this.f143280e;
            HostFrameLayout hostFrameLayout2 = null;
            if (hostFrameLayout == null) {
                AbstractC19074t.m100223u("frameLayout");
                hostFrameLayout = null;
            }
            hostFrameLayout.removeView(this.f143282g);
            HostFrameLayout hostFrameLayout3 = this.f143280e;
            if (hostFrameLayout3 == null) {
                AbstractC19074t.m100223u("frameLayout");
            } else {
                hostFrameLayout2 = hostFrameLayout3;
            }
            hostFrameLayout2.removeView(this.f143283h);
        } catch (Exception unused) {
        }
    }
}

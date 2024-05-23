package p238ig;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.zing.zalo.chathead.ChatHeadUI.ChatHead;
import com.zing.zalo.chathead.ChatHeadUI.ChatHeadContainer.HostFrameLayout;
import gg.AbstractC19438a;
import gg.C19442e;
import gg.C19443f;
import java.util.Objects;
import p209hg.C20052c;
import p266jg.AbstractC21244b;
import p266jg.C21243a;
import p348mi.AbstractC23309i;
import xl0.InterfaceC30160a;
import zl0.AbstractC32232i;

/* renamed from: ig.b */
/* loaded from: classes3.dex */
public class C20548b {

    /* renamed from: a */
    private HostFrameLayout f100909a;

    /* renamed from: b */
    private final Context f100910b;

    /* renamed from: c */
    private View f100911c;

    /* renamed from: e */
    private WindowManager f100913e;

    /* renamed from: f */
    private AbstractC19438a f100914f;

    /* renamed from: h */
    private C20052c f100916h;

    /* renamed from: d */
    private int f100912d = -1;

    /* renamed from: g */
    private boolean f100915g = false;

    /* renamed from: i */
    private final int[] f100917i = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ig.b$a */
    /* loaded from: classes3.dex */
    public static class a extends View {
        public a(Context context) {
            super(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ig.b$b */
    /* loaded from: classes3.dex */
    public class b implements View.OnTouchListener {

        /* renamed from: p */
        int[] f100918p = new int[2];

        protected b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            motionEvent.offsetLocation(C20548b.this.m106786i(view), C20548b.this.m106787j(view));
            C20548b.this.f100909a.getLocationOnScreen(this.f100918p);
            int[] iArr = this.f100918p;
            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
            return C20548b.this.f100909a.dispatchTouchEvent(motionEvent);
        }
    }

    public C20548b(Context context) {
        this.f100910b = context;
    }

    /* renamed from: A */
    public void m106776A(View view, int i11) {
        view.setTranslationY(i11);
        if ((view instanceof ChatHead) && (this.f100914f instanceof C19443f) && ((ChatHead) view).m39817A()) {
            view.getRootView().getLocationOnScreen(this.f100917i);
            m106802y(this.f100911c, i11 + this.f100917i[1]);
            m106799v(this.f100911c, view.getMeasuredHeight());
        }
    }

    /* renamed from: B */
    public void m106777B(int i11) {
        this.f100909a.setVisibility(i11);
        this.f100911c.setVisibility(i11);
    }

    /* renamed from: C */
    public void m106778C(boolean z11) {
        int i11;
        if (z11) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        this.f100912d = i11;
        if (this.f100915g && this.f100916h.m104165n().size() > 0) {
            WindowManager.LayoutParams m106790m = m106790m(this.f100911c);
            m106790m.screenOrientation = this.f100912d;
            this.f100913e.updateViewLayout(this.f100911c, m106790m);
        }
    }

    /* renamed from: b */
    public void m106779b(View view, WindowManager.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        m106793p().addView(view, layoutParams);
    }

    /* renamed from: c */
    public void m106780c(View view, boolean z11) {
        m106779b(view, m106783f(z11));
    }

    /* renamed from: d */
    public void m106781d(View view, ViewGroup.LayoutParams layoutParams) {
        HostFrameLayout hostFrameLayout = this.f100909a;
        if (hostFrameLayout != null) {
            hostFrameLayout.addView(view, layoutParams);
        }
        if (!this.f100915g && this.f100916h.m104165n().size() > 0) {
            m106780c(this.f100911c, true);
            WindowManager.LayoutParams m106790m = m106790m(this.f100911c);
            m106790m.width = 0;
            m106790m.height = 0;
            m106790m.screenOrientation = this.f100912d;
            this.f100913e.updateViewLayout(this.f100911c, m106790m);
            this.f100915g = true;
        }
    }

    /* renamed from: e */
    public void m106782e(View view) {
        view.bringToFront();
    }

    /* renamed from: f */
    protected WindowManager.LayoutParams m106783f(boolean z11) {
        int i11;
        if (z11) {
            i11 = 65824;
        } else {
            i11 = 65816;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, AbstractC32232i.f148649a, i11, -3);
        AbstractC32232i.m155461i(this.f100910b, layoutParams);
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    /* renamed from: g */
    public ViewGroup.LayoutParams m106784g(int i11, int i12, int i13, int i14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
        layoutParams.gravity = i13;
        layoutParams.bottomMargin = i14;
        return layoutParams;
    }

    /* renamed from: h */
    public void m106785h() {
        C20052c c20052c = this.f100916h;
        c20052c.f98601M = true;
        c20052c.finish();
        try {
            this.f100909a.removeAllViews();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f100913e.removeViewImmediate(this.f100909a);
    }

    /* renamed from: i */
    protected int m106786i(View view) {
        return m106790m(view).x;
    }

    /* renamed from: j */
    protected int m106787j(View view) {
        return m106790m(view).y;
    }

    /* renamed from: k */
    public HostFrameLayout m106788k() {
        return this.f100909a;
    }

    /* renamed from: l */
    public View m106789l() {
        return this.f100911c;
    }

    /* renamed from: m */
    protected WindowManager.LayoutParams m106790m(View view) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            WindowManager.LayoutParams m106783f = m106783f(false);
            view.setLayoutParams(m106783f);
            return m106783f;
        }
        return layoutParams;
    }

    /* renamed from: n */
    public int m106791n(View view) {
        return (int) view.getTranslationX();
    }

    /* renamed from: o */
    public int m106792o(View view) {
        return (int) view.getTranslationY();
    }

    /* renamed from: p */
    public WindowManager m106793p() {
        if (this.f100913e == null) {
            this.f100913e = (WindowManager) this.f100910b.getSystemService("window");
        }
        return this.f100913e;
    }

    /* renamed from: q */
    public void m106794q(AbstractC19438a abstractC19438a, AbstractC19438a abstractC19438a2) {
        this.f100914f = abstractC19438a2;
        if (abstractC19438a2 instanceof C19442e) {
            WindowManager.LayoutParams m106790m = m106790m(this.f100909a);
            m106790m.flags = (m106790m.flags & (-25)) | 32;
            this.f100913e.updateViewLayout(this.f100909a, m106790m);
            WindowManager.LayoutParams m106790m2 = m106790m(this.f100911c);
            m106790m2.flags |= 24;
            m106790m2.x = 0;
            m106790m2.y = 0;
            m106790m2.width = this.f100909a.getMeasuredWidth();
            m106790m2.height = this.f100909a.getMeasuredHeight();
            if (this.f100915g) {
                this.f100913e.updateViewLayout(this.f100911c, m106790m2);
                return;
            }
            return;
        }
        WindowManager.LayoutParams m106790m3 = m106790m(this.f100909a);
        m106790m3.flags |= 24;
        this.f100913e.updateViewLayout(this.f100909a, m106790m3);
        WindowManager.LayoutParams m106790m4 = m106790m(this.f100911c);
        m106790m4.flags = ((m106790m4.flags | 8) & (-17)) | 32;
        double d11 = this.f100916h.m104167s().f103545c.x;
        double d12 = this.f100916h.m104167s().f103545c.y;
        double parseDouble = Double.parseDouble(AbstractC23309i.m122013ia("preference_relative_x", String.valueOf(d11), true));
        double parseDouble2 = Double.parseDouble(AbstractC23309i.m122013ia("preference_relative_y", String.valueOf(d12), true));
        int m110055e = (int) (AbstractC21244b.m110055e(parseDouble, (this.f100916h.m104173z() - C21243a.f103541p) / this.f100916h.m104173z()) * this.f100916h.m104173z());
        int m110055e2 = (int) (AbstractC21244b.m110055e(parseDouble2, 1.0d) * (this.f100916h.m104172y() - C21243a.f103539n));
        m106790m4.x = m110055e;
        m106790m4.y = m110055e2;
        m106790m4.width = C21243a.f103541p;
        m106790m4.height = C21243a.f103539n;
        if (this.f100915g) {
            this.f100913e.updateViewLayout(this.f100911c, m106790m4);
        }
    }

    /* renamed from: r */
    public void m106795r(final C20052c c20052c) {
        this.f100916h = c20052c;
        HostFrameLayout hostFrameLayout = new HostFrameLayout(this.f100910b, c20052c);
        this.f100909a = hostFrameLayout;
        Objects.requireNonNull(c20052c);
        hostFrameLayout.setApplyWindowInsetsListener(new InterfaceC30160a() { // from class: ig.a
            @Override // xl0.InterfaceC30160a
            /* renamed from: m */
            public final void mo35574m(WindowInsets windowInsets) {
                C20052c.this.m104136L(windowInsets);
            }
        });
        this.f100909a.setDescendantFocusability(262144);
        this.f100909a.setFocusableInTouchMode(true);
        m106780c(this.f100909a, false);
        this.f100911c = new a(this.f100910b);
        this.f100911c.setOnTouchListener(new b());
    }

    /* renamed from: s */
    public void m106796s() {
        if (Build.VERSION.SDK_INT >= 28) {
            if (this.f100915g && this.f100916h.m104165n().size() > 0) {
                WindowManager.LayoutParams m106790m = m106790m(this.f100911c);
                AbstractC32232i.m155461i(this.f100910b, m106790m);
                this.f100913e.updateViewLayout(this.f100911c, m106790m);
            }
            HostFrameLayout hostFrameLayout = this.f100909a;
            if (hostFrameLayout != null) {
                WindowManager.LayoutParams m106790m2 = m106790m(hostFrameLayout);
                AbstractC32232i.m155461i(this.f100910b, m106790m2);
                this.f100913e.updateViewLayout(this.f100909a, m106790m2);
            }
        }
    }

    /* renamed from: t */
    public void m106797t(View view) {
        HostFrameLayout hostFrameLayout = this.f100909a;
        if (hostFrameLayout != null) {
            hostFrameLayout.removeView(view);
        }
        if (this.f100916h.m104165n().size() <= 0) {
            this.f100916h.f98601M = true;
            if (this.f100915g) {
                this.f100913e.removeViewImmediate(this.f100911c);
            }
            this.f100915g = false;
            m106785h();
        }
    }

    /* renamed from: u */
    public void m106798u() {
        HostFrameLayout hostFrameLayout = this.f100909a;
        if (hostFrameLayout != null) {
            hostFrameLayout.requestLayout();
        }
    }

    /* renamed from: v */
    protected void m106799v(View view, int i11) {
        WindowManager.LayoutParams m106790m = m106790m(view);
        m106790m.height = i11;
        m106793p().updateViewLayout(view, m106790m);
    }

    /* renamed from: w */
    protected void m106800w(View view, int i11) {
        WindowManager.LayoutParams m106790m = m106790m(view);
        m106790m.width = i11;
        m106793p().updateViewLayout(view, m106790m);
    }

    /* renamed from: x */
    public void m106801x(View view, int i11) {
        WindowManager.LayoutParams m106790m = m106790m(view);
        m106790m.x = i11;
        m106793p().updateViewLayout(view, m106790m);
    }

    /* renamed from: y */
    public void m106802y(View view, int i11) {
        WindowManager.LayoutParams m106790m = m106790m(view);
        m106790m.y = i11;
        m106793p().updateViewLayout(view, m106790m);
    }

    /* renamed from: z */
    public void m106803z(View view, int i11) {
        view.setTranslationX(i11);
        if ((view instanceof ChatHead) && ((ChatHead) view).m39817A() && (this.f100914f instanceof C19443f)) {
            view.getRootView().getLocationOnScreen(this.f100917i);
            m106801x(this.f100911c, i11 + this.f100917i[0]);
            m106800w(this.f100911c, view.getMeasuredWidth());
        }
    }
}

package i20;

import am.AbstractC0924m0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.widget.PopupWindow;
import androidx.core.view.AbstractC1572l1;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import java.util.List;
import pm0.C24848g0;
import q20.C25078a;

/* renamed from: i20.i */
/* loaded from: classes5.dex */
public final class C20196i {

    /* renamed from: a */
    private final ZaloView f99733a;

    /* renamed from: b */
    private final boolean f99734b;

    /* renamed from: c */
    private final InterfaceC18509p f99735c;

    /* renamed from: d */
    private PopupWindow f99736d;

    /* renamed from: e */
    private PopupWindow f99737e;

    /* renamed from: f */
    private Rect f99738f;

    /* renamed from: g */
    private Rect f99739g;

    /* renamed from: h */
    private ViewTreeObserver.OnGlobalLayoutListener f99740h;

    /* renamed from: i */
    private Runnable f99741i;

    /* renamed from: j */
    private final boolean f99742j;

    /* renamed from: i20.i$a */
    /* loaded from: classes5.dex */
    public static final class a extends WindowInsetsAnimation.Callback {

        /* renamed from: b */
        final /* synthetic */ View f99744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.f99744b = view;
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            WindowInsets rootWindowInsets;
            int navigationBars;
            Insets insets;
            int ime;
            Insets insets2;
            int i11;
            int i12;
            AbstractC19074t.m100208f(windowInsetsAnimation, "animation");
            rootWindowInsets = this.f99744b.getRootWindowInsets();
            C24848g0 c24848g0 = null;
            Float valueOf = Float.valueOf(1.0f);
            if (rootWindowInsets != null) {
                C20196i c20196i = C20196i.this;
                View view = this.f99744b;
                navigationBars = WindowInsets.Type.navigationBars();
                insets = rootWindowInsets.getInsets(navigationBars);
                AbstractC19074t.m100207e(insets, "getInsets(...)");
                ime = WindowInsets.Type.ime();
                insets2 = rootWindowInsets.getInsets(ime);
                AbstractC19074t.m100207e(insets2, "getInsets(...)");
                InterfaceC18509p interfaceC18509p = c20196i.f99735c;
                i11 = insets2.bottom;
                i12 = insets.bottom;
                interfaceC18509p.mo240pC(Integer.valueOf(Math.max(i11 - i12, 0)), valueOf);
                view.removeCallbacks(c20196i.f99741i);
                c20196i.f99741i = null;
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null) {
                C20196i.this.f99735c.mo240pC(0, valueOf);
            }
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public WindowInsets onProgress(WindowInsets windowInsets, List list) {
            int navigationBars;
            Insets insets;
            int ime;
            Insets insets2;
            Object obj;
            float f11;
            int i11;
            int i12;
            int i13;
            int i14;
            int typeMask;
            int ime2;
            AbstractC19074t.m100208f(windowInsets, "windowInsets");
            AbstractC19074t.m100208f(list, "runningAnimations");
            navigationBars = WindowInsets.Type.navigationBars();
            insets = windowInsets.getInsets(navigationBars);
            AbstractC19074t.m100207e(insets, "getInsets(...)");
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            AbstractC19074t.m100207e(insets2, "getInsets(...)");
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    typeMask = AbstractC1572l1.m7794a(obj).getTypeMask();
                    ime2 = WindowInsets.Type.ime();
                    if ((typeMask & ime2) != 0) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            WindowInsetsAnimation m7794a = AbstractC1572l1.m7794a(obj);
            if (m7794a != null) {
                f11 = m7794a.getFraction();
            } else {
                f11 = 0.0f;
            }
            i11 = insets2.bottom;
            i12 = insets.bottom;
            if (i11 > i12) {
                i13 = insets2.bottom;
                i14 = insets.bottom;
                C20196i.this.f99735c.mo240pC(Integer.valueOf(i13 - i14), Float.valueOf(f11));
            } else {
                C20196i.this.f99735c.mo240pC(0, Float.valueOf(Math.round(f11)));
            }
            this.f99744b.removeCallbacks(C20196i.this.f99741i);
            C20196i.this.f99741i = null;
            return windowInsets;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i20.i$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f99745q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m105322a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m105322a() {
        }
    }

    /* renamed from: i20.i$c */
    /* loaded from: classes5.dex */
    public static final class c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f99746p;

        /* renamed from: q */
        final /* synthetic */ C20196i f99747q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18494a f99748r;

        c(View view, C20196i c20196i, InterfaceC18494a interfaceC18494a) {
            this.f99746p = view;
            this.f99747q = c20196i;
            this.f99748r = interfaceC18494a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f99746p.getWindowToken() != null) {
                if (this.f99747q.f99742j) {
                    PopupWindow popupWindow = this.f99747q.f99736d;
                    AbstractC19074t.m100205c(popupWindow);
                    popupWindow.showAtLocation(this.f99746p, 0, 0, 0);
                }
                PopupWindow popupWindow2 = this.f99747q.f99737e;
                AbstractC19074t.m100205c(popupWindow2);
                popupWindow2.showAtLocation(this.f99746p, 0, 0, 0);
                this.f99748r.mo12V4();
                return;
            }
            this.f99746p.post(this);
        }
    }

    public C20196i(ZaloView zaloView, boolean z11, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(interfaceC18509p, "listener");
        this.f99733a = zaloView;
        this.f99734b = z11;
        this.f99735c = interfaceC18509p;
        this.f99742j = AbstractC0924m0.m3567X8();
        if (C25078a.f120479a.m130003e() && z11) {
            View m92691vK = zaloView.m92691vK();
            AbstractC19074t.m100207e(m92691vK, "requireView(...)");
            m105314m(m92691vK);
        } else {
            Context m92689tK = zaloView.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            m105313l(m92689tK);
        }
    }

    /* renamed from: j */
    private final Rect m105311j(PopupWindow popupWindow) {
        Rect rect = new Rect();
        popupWindow.getContentView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:            if (r1 != r2.right) goto L22;     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m105312k() {
        int i11;
        int i12;
        Rect rect = this.f99738f;
        if (rect != null) {
            i11 = rect.bottom;
        } else {
            i11 = -1;
        }
        Rect rect2 = this.f99739g;
        if (rect2 != null) {
            i12 = rect2.bottom;
        } else {
            i12 = 0;
        }
        int i13 = i11 - i12;
        if (this.f99742j) {
            PopupWindow popupWindow = this.f99736d;
            AbstractC19074t.m100205c(popupWindow);
            this.f99738f = m105311j(popupWindow);
            PopupWindow popupWindow2 = this.f99737e;
            AbstractC19074t.m100205c(popupWindow2);
            this.f99739g = m105311j(popupWindow2);
        } else {
            PopupWindow popupWindow3 = this.f99737e;
            AbstractC19074t.m100205c(popupWindow3);
            Rect m105311j = m105311j(popupWindow3);
            this.f99739g = m105311j;
            Rect rect3 = this.f99738f;
            if (rect3 != null) {
                m105311j = rect3;
            }
            this.f99738f = m105311j;
        }
        Rect rect4 = this.f99738f;
        AbstractC19074t.m100205c(rect4);
        int i14 = rect4.bottom;
        Rect rect5 = this.f99739g;
        AbstractC19074t.m100205c(rect5);
        if (i14 >= rect5.bottom) {
            Rect rect6 = this.f99738f;
            AbstractC19074t.m100205c(rect6);
            int i15 = rect6.right;
            Rect rect7 = this.f99739g;
            AbstractC19074t.m100205c(rect7);
        }
        this.f99738f = this.f99739g;
        Rect rect8 = this.f99738f;
        AbstractC19074t.m100205c(rect8);
        int i16 = rect8.bottom;
        Rect rect9 = this.f99739g;
        AbstractC19074t.m100205c(rect9);
        if (i13 != i16 - rect9.bottom) {
            InterfaceC18509p interfaceC18509p = this.f99735c;
            Rect rect10 = this.f99738f;
            AbstractC19074t.m100205c(rect10);
            int i17 = rect10.bottom;
            Rect rect11 = this.f99739g;
            AbstractC19074t.m100205c(rect11);
            interfaceC18509p.mo240pC(Integer.valueOf(i17 - rect11.bottom), Float.valueOf(1.0f));
        }
    }

    /* renamed from: l */
    private final void m105313l(Context context) {
        this.f99740h = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: i20.f
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C20196i.this.m105312k();
            }
        };
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setContentView(new View(context));
        popupWindow.setWidth(0);
        popupWindow.setHeight(-1);
        popupWindow.setInputMethodMode(1);
        popupWindow.setSoftInputMode(48);
        this.f99736d = popupWindow;
        PopupWindow popupWindow2 = new PopupWindow(context);
        popupWindow2.setContentView(new View(context));
        popupWindow2.setWidth(0);
        popupWindow2.setHeight(-1);
        popupWindow2.setInputMethodMode(1);
        popupWindow2.setSoftInputMode(16);
        this.f99737e = popupWindow2;
    }

    /* renamed from: m */
    private final void m105314m(final View view) {
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: i20.e
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                WindowInsets m105315n;
                m105315n = C20196i.m105315n(view, this, view2, windowInsets);
                return m105315n;
            }
        });
        view.setWindowInsetsAnimationCallback(AbstractC20189b.m105298a(new a(view)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final WindowInsets m105315n(View view, final C20196i c20196i, View view2, WindowInsets windowInsets) {
        int navigationBars;
        final Insets insets;
        int ime;
        final Insets insets2;
        AbstractC19074t.m100208f(view, "$root");
        AbstractC19074t.m100208f(c20196i, "this$0");
        AbstractC19074t.m100208f(view2, "<anonymous parameter 0>");
        AbstractC19074t.m100208f(windowInsets, "windowInsets");
        navigationBars = WindowInsets.Type.navigationBars();
        insets = windowInsets.getInsets(navigationBars);
        AbstractC19074t.m100207e(insets, "getInsets(...)");
        ime = WindowInsets.Type.ime();
        insets2 = windowInsets.getInsets(ime);
        AbstractC19074t.m100207e(insets2, "getInsets(...)");
        view.removeCallbacks(c20196i.f99741i);
        Runnable runnable = new Runnable() { // from class: i20.g
            @Override // java.lang.Runnable
            public final void run() {
                C20196i.m105316o(C20196i.this, insets2, insets);
            }
        };
        c20196i.f99741i = runnable;
        view.postDelayed(runnable, ViewConfiguration.getTapTimeout());
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m105316o(C20196i c20196i, Insets insets, Insets insets2) {
        int i11;
        int i12;
        AbstractC19074t.m100208f(c20196i, "this$0");
        AbstractC19074t.m100208f(insets, "$imeInsets");
        AbstractC19074t.m100208f(insets2, "$navInsets");
        InterfaceC18509p interfaceC18509p = c20196i.f99735c;
        i11 = insets.bottom;
        i12 = insets2.bottom;
        interfaceC18509p.mo240pC(Integer.valueOf(Math.max(i11 - i12, 0)), Float.valueOf(1.0f));
    }

    /* renamed from: q */
    public static /* synthetic */ void m105317q(C20196i c20196i, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC18494a = b.f99745q;
        }
        c20196i.m105320p(interfaceC18494a);
    }

    /* renamed from: r */
    private final void m105318r(InterfaceC18494a interfaceC18494a) {
        Context m92689tK = this.f99733a.m92689tK();
        AbstractC19074t.m100206d(m92689tK, "null cannot be cast to non-null type android.app.Activity");
        View findViewById = ((Activity) m92689tK).findViewById(R.id.content);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.view.View");
        findViewById.post(new c(findViewById, this, interfaceC18494a));
    }

    /* renamed from: t */
    private final void m105319t() {
        PopupWindow popupWindow = this.f99737e;
        AbstractC19074t.m100205c(popupWindow);
        popupWindow.dismiss();
        PopupWindow popupWindow2 = this.f99736d;
        AbstractC19074t.m100205c(popupWindow2);
        popupWindow2.dismiss();
        this.f99739g = null;
        this.f99738f = null;
    }

    /* renamed from: p */
    public final void m105320p(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "commitCallback");
        if (!C25078a.f120479a.m130003e() || !this.f99734b) {
            PopupWindow popupWindow = this.f99737e;
            AbstractC19074t.m100205c(popupWindow);
            popupWindow.getContentView().getViewTreeObserver().addOnGlobalLayoutListener(this.f99740h);
            m105318r(interfaceC18494a);
        }
    }

    /* renamed from: s */
    public final void m105321s() {
        if (!C25078a.f120479a.m130003e() || !this.f99734b) {
            PopupWindow popupWindow = this.f99737e;
            AbstractC19074t.m100205c(popupWindow);
            popupWindow.getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f99740h);
            m105319t();
        }
    }

    public /* synthetic */ C20196i(ZaloView zaloView, boolean z11, InterfaceC18509p interfaceC18509p, int i11, AbstractC19060k abstractC19060k) {
        this(zaloView, (i11 & 2) != 0 ? false : z11, interfaceC18509p);
    }
}

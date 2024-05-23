package com.zing.zalo.zview.dialog;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17470g;
import java.util.ArrayList;

/* renamed from: com.zing.zalo.zview.dialog.f */
/* loaded from: classes7.dex */
public class C17465f {

    /* renamed from: A */
    private static int f89016A;

    /* renamed from: B */
    private static int f89017B;

    /* renamed from: C */
    private static int f89018C;

    /* renamed from: D */
    private static int f89019D;

    /* renamed from: E */
    private static int f89020E;

    /* renamed from: F */
    private static int f89021F;

    /* renamed from: G */
    private static int f89022G;

    /* renamed from: H */
    private static int f89023H;

    /* renamed from: I */
    private static int f89024I;

    /* renamed from: J */
    private static int f89025J;

    /* renamed from: K */
    private static int f89026K;

    /* renamed from: v */
    private static int f89027v;

    /* renamed from: w */
    private static int f89028w;

    /* renamed from: x */
    private static int f89029x;

    /* renamed from: y */
    private static int f89030y;

    /* renamed from: z */
    private static int f89031z;

    /* renamed from: a */
    private final Context f89032a;

    /* renamed from: b */
    private LayoutInflater f89033b;

    /* renamed from: c */
    private a f89034c;

    /* renamed from: k */
    private b f89042k;

    /* renamed from: l */
    ViewGroup f89043l;

    /* renamed from: o */
    private Drawable f89046o;

    /* renamed from: s */
    TypedArray f89050s;

    /* renamed from: t */
    boolean f89051t;

    /* renamed from: u */
    private int f89052u;

    /* renamed from: d */
    private boolean f89035d = true;

    /* renamed from: e */
    private boolean f89036e = false;

    /* renamed from: f */
    private boolean f89037f = false;

    /* renamed from: g */
    private boolean f89038g = false;

    /* renamed from: h */
    private boolean f89039h = false;

    /* renamed from: i */
    private int f89040i = -1;

    /* renamed from: j */
    private boolean f89041j = false;

    /* renamed from: m */
    private boolean f89044m = false;

    /* renamed from: n */
    int f89045n = 0;

    /* renamed from: p */
    private int f89047p = 0;

    /* renamed from: q */
    private int f89048q = 0;

    /* renamed from: r */
    private final WindowManager.LayoutParams f89049r = new WindowManager.LayoutParams();

    /* renamed from: com.zing.zalo.zview.dialog.f$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo92858a();

        boolean dispatchKeyEvent(KeyEvent keyEvent);

        boolean dispatchTouchEvent(MotionEvent motionEvent);

        void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams);
    }

    /* renamed from: com.zing.zalo.zview.dialog.f$b */
    /* loaded from: classes7.dex */
    public static final class b extends FrameLayout {

        /* renamed from: p */
        private C17465f f89053p;

        /* renamed from: q */
        private boolean f89054q;

        /* renamed from: r */
        int f89055r;

        /* renamed from: s */
        private final Rect f89056s;

        /* renamed from: t */
        private final Rect f89057t;

        public b(Context context, C17465f c17465f) {
            super(context);
            this.f89055r = -1;
            this.f89056s = new Rect();
            this.f89057t = new Rect();
            this.f89053p = c17465f;
        }

        /* renamed from: a */
        private void m92917a() {
            if (this.f89054q) {
                return;
            }
            Rect rect = this.f89057t;
            int i11 = rect.left;
            Rect rect2 = this.f89056s;
            setPadding(i11 + rect2.left, rect.top + rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
            requestLayout();
            invalidate();
            Drawable background = getBackground();
            Drawable foreground = getForeground();
            int i12 = -1;
            if (background != null) {
                if (foreground == null) {
                    i12 = background.getOpacity();
                } else {
                    Rect rect3 = this.f89057t;
                    if (rect3.left <= 0 && rect3.top <= 0 && rect3.right <= 0 && rect3.bottom <= 0) {
                        int opacity = foreground.getOpacity();
                        int opacity2 = background.getOpacity();
                        if (opacity != -1 && opacity2 != -1) {
                            i12 = opacity == 0 ? opacity2 : opacity2 == 0 ? opacity : Drawable.resolveOpacity(opacity, opacity2);
                        }
                    } else {
                        i12 = -3;
                    }
                }
            }
            this.f89055r = i12;
            this.f89053p.m92885D(i12);
        }

        /* renamed from: b */
        void m92918b() {
            this.f89054q = false;
            m92917a();
        }

        /* renamed from: c */
        void m92919c(C17465f c17465f) {
            this.f89053p = c17465f;
        }

        /* renamed from: d */
        public void m92920d(Drawable drawable) {
            if (getBackground() != drawable) {
                setBackgroundDrawable(drawable);
                if (drawable != null) {
                    drawable.getPadding(this.f89056s);
                } else {
                    this.f89056s.setEmpty();
                }
                m92917a();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean dispatchKeyEvent;
            a m92902i = this.f89053p.m92902i();
            if (m92902i != null) {
                dispatchKeyEvent = m92902i.dispatchKeyEvent(keyEvent);
            } else {
                dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            }
            if (dispatchKeyEvent) {
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            a m92902i = this.f89053p.m92902i();
            if (m92902i != null) {
                return m92902i.dispatchTouchEvent(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        /* renamed from: e */
        public void m92921e(Drawable drawable) {
            if (getForeground() != drawable) {
                setForeground(drawable);
                if (drawable != null) {
                    drawable.getPadding(this.f89057t);
                } else {
                    this.f89057t.setEmpty();
                }
                m92917a();
            }
        }

        /* renamed from: f */
        void m92922f() {
            this.f89054q = true;
        }

        /* renamed from: g */
        public boolean m92923g(KeyEvent keyEvent) {
            return super.dispatchKeyEvent(keyEvent);
        }

        /* renamed from: h */
        public boolean m92924h(MotionEvent motionEvent) {
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return onInterceptTouchEvent(motionEvent);
        }
    }

    public C17465f(Context context) {
        this.f89032a = context;
        this.f89033b = LayoutInflater.from(context);
    }

    /* renamed from: q */
    private void m92879q() {
        b bVar = this.f89042k;
        if (bVar == null) {
            b bVar2 = new b(this.f89032a, this);
            this.f89042k = bVar2;
            bVar2.setDescendantFocusability(262144);
        } else {
            bVar.m92919c(this);
        }
        if (this.f89043l == null) {
            this.f89043l = m92900g(this.f89042k);
        }
    }

    /* renamed from: r */
    private boolean m92880r(Context context, MotionEvent motionEvent) {
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        View m92904k = m92904k();
        if ((x11 < 0 || x11 > m92904k.getWidth() || y11 < 0 || y11 > m92904k.getHeight()) && !m92881s(context, motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private boolean m92881s(Context context, MotionEvent motionEvent) {
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        View m92904k = m92904k();
        int i11 = -scaledWindowTouchSlop;
        if (x11 >= i11 && y11 >= i11 && x11 <= m92904k.getWidth() + scaledWindowTouchSlop && y11 <= m92904k.getHeight() + scaledWindowTouchSlop) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public void m92882A(int i11) {
        if (this.f89043l == null) {
            m92879q();
        }
        this.f89033b.inflate(i11, this.f89043l);
        this.f89043l.requestApplyInsets();
        this.f89044m = true;
    }

    /* renamed from: B */
    public void m92883B(View view) {
        m92884C(view, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: C */
    public void m92884C(View view, ViewGroup.LayoutParams layoutParams) {
        ViewGroup viewGroup = this.f89043l;
        if (viewGroup == null) {
            m92879q();
        } else {
            viewGroup.removeAllViews();
        }
        this.f89043l.addView(view, layoutParams);
    }

    /* renamed from: D */
    protected void m92885D(int i11) {
        this.f89040i = i11;
        if (!this.f89037f) {
            WindowManager.LayoutParams m92901h = m92901h();
            m92901h.format = i11;
            m92898e(m92901h);
        }
    }

    /* renamed from: E */
    public void m92886E(float f11) {
        WindowManager.LayoutParams m92901h = m92901h();
        m92901h.dimAmount = f11;
        this.f89038g = true;
        m92898e(m92901h);
    }

    /* renamed from: F */
    public void m92887F(int i11, int i12) {
        WindowManager.LayoutParams m92901h = m92901h();
        m92901h.flags = (i11 & i12) | (m92901h.flags & (~i12));
        this.f89048q |= i12;
        m92898e(m92901h);
    }

    /* renamed from: G */
    public void m92888G(int i11) {
        WindowManager.LayoutParams m92901h = m92901h();
        m92901h.gravity = i11;
        m92898e(m92901h);
    }

    /* renamed from: H */
    public void m92889H(int i11, int i12) {
        WindowManager.LayoutParams m92901h = m92901h();
        m92901h.width = i11;
        m92901h.height = i12;
        m92898e(m92901h);
    }

    /* renamed from: I */
    public void m92890I(int i11) {
        WindowManager.LayoutParams m92901h = m92901h();
        if (i11 != 0) {
            m92901h.softInputMode = i11;
            this.f89039h = true;
        } else {
            this.f89039h = false;
        }
        m92898e(m92901h);
    }

    /* renamed from: J */
    public boolean m92891J(Context context, MotionEvent motionEvent) {
        a aVar;
        if (this.f89035d && motionEvent.getAction() == 0 && m92881s(context, motionEvent) && m92904k() != null) {
            return true;
        }
        if (m92904k() != null && m92880r(context, motionEvent) && (aVar = this.f89034c) != null) {
            aVar.mo92858a();
            return false;
        }
        return false;
    }

    /* renamed from: K */
    public boolean m92892K(KeyEvent keyEvent) {
        return this.f89042k.m92923g(keyEvent);
    }

    /* renamed from: L */
    public boolean m92893L(MotionEvent motionEvent) {
        return this.f89042k.m92924h(motionEvent);
    }

    /* renamed from: a */
    public void m92894a(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.f89043l == null) {
            m92879q();
        }
        this.f89043l.addView(view, layoutParams);
    }

    /* renamed from: b */
    public void m92895b(int i11) {
        m92887F(i11, i11);
    }

    /* renamed from: c */
    public void m92896c() {
        this.f89041j = true;
    }

    /* renamed from: d */
    public void m92897d(int i11) {
        m92887F(0, i11);
    }

    /* renamed from: e */
    protected void m92898e(WindowManager.LayoutParams layoutParams) {
        a aVar = this.f89034c;
        if (aVar != null) {
            aVar.onWindowAttributesChanged(layoutParams);
        }
    }

    /* renamed from: f */
    public View m92899f(int i11) {
        return m92904k().findViewById(i11);
    }

    /* renamed from: g */
    protected ViewGroup m92900g(b bVar) {
        boolean z11;
        boolean z12;
        TypedArray m92907n = m92907n();
        this.f89051t = m92907n.getBoolean(f89027v, false);
        int i11 = (~m92906m()) & 65792;
        if (this.f89051t) {
            m92889H(-2, -2);
            m92887F(0, i11);
        } else {
            m92887F(65792, i11);
        }
        if (m92907n.getBoolean(f89022G, false)) {
            m92887F(1024, (~m92906m()) & 1024);
        }
        if (m92907n.getBoolean(f89023H, false)) {
            m92887F(67108864, (~m92906m()) & 67108864);
        }
        if (m92907n.getBoolean(f89024I, false)) {
            m92887F(134217728, (~m92906m()) & 134217728);
        }
        int i12 = f89029x;
        if (this.f89032a.getApplicationInfo().targetSdkVersion >= 11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m92907n.getBoolean(i12, z11)) {
            m92887F(8388608, (~m92906m()) & 8388608);
        }
        if (this.f89032a.getApplicationInfo().targetSdkVersion < 21) {
            z12 = true;
        } else {
            z12 = false;
        }
        WindowManager.LayoutParams m92901h = m92901h();
        int i13 = Build.VERSION.SDK_INT;
        if (!this.f89051t && !z12 && m92907n.getBoolean(f89025J, false)) {
            m92887F(Integer.MIN_VALUE, (~m92906m()) & Integer.MIN_VALUE);
        }
        if (i13 >= 23 && m92907n.getBoolean(f89026K, false)) {
            bVar.setSystemUiVisibility(bVar.getSystemUiVisibility() | 8192);
        }
        if ((this.f89041j || this.f89032a.getApplicationInfo().targetSdkVersion >= 11) && m92907n.getBoolean(f89031z, false)) {
            m92916z(true);
        }
        if (!m92908o()) {
            m92901h.softInputMode = m92907n.getInt(f89016A, m92901h.softInputMode);
        }
        if (m92907n.getBoolean(f89018C, this.f89051t)) {
            if ((m92906m() & 2) == 0) {
                m92901h.flags |= 2;
            }
            if (!m92909p()) {
                m92901h.dimAmount = m92907n.getFloat(f89019D, 0.5f);
            }
        }
        if (m92901h.windowAnimations == 0) {
            m92901h.windowAnimations = m92907n.getResourceId(f89017B, 0);
        }
        if (this.f89046o == null) {
            if (this.f89045n == 0) {
                this.f89045n = m92907n.getResourceId(f89020E, 0);
            }
            if (this.f89047p == 0) {
                this.f89047p = m92907n.getResourceId(f89021F, 0);
            }
        }
        this.f89042k.m92922f();
        Drawable drawable = null;
        bVar.addView(this.f89033b.inflate(AbstractC17470g.screen_simple, (ViewGroup) null), new ViewGroup.LayoutParams(-1, -1));
        ViewGroup viewGroup = (ViewGroup) m92899f(R.id.content);
        if (viewGroup != null) {
            this.f89045n = R.color.transparent;
            this.f89042k.m92920d(AbstractC1388a.m6964f(this.f89032a, R.color.transparent));
            int i14 = this.f89047p;
            if (i14 != 0) {
                drawable = AbstractC1388a.m6964f(this.f89032a, i14);
            }
            this.f89042k.m92921e(drawable);
            this.f89042k.m92918b();
            return viewGroup;
        }
        throw new RuntimeException("Window couldn't find content container view");
    }

    /* renamed from: h */
    public final WindowManager.LayoutParams m92901h() {
        return this.f89049r;
    }

    /* renamed from: i */
    public a m92902i() {
        return this.f89034c;
    }

    /* renamed from: j */
    public boolean m92903j() {
        return this.f89035d;
    }

    /* renamed from: k */
    public final View m92904k() {
        if (this.f89042k == null) {
            m92879q();
        }
        return this.f89042k;
    }

    /* renamed from: l */
    protected final int m92905l() {
        return this.f89052u;
    }

    /* renamed from: m */
    protected final int m92906m() {
        return this.f89048q;
    }

    /* renamed from: n */
    public final TypedArray m92907n() {
        TypedArray typedArray;
        synchronized (this) {
            try {
                if (this.f89050s == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(R.attr.windowIsFloating));
                    f89027v = 0;
                    arrayList.add(Integer.valueOf(R.attr.windowNoTitle));
                    f89028w = 1;
                    arrayList.add(Integer.valueOf(R.attr.windowEnableSplitTouch));
                    f89029x = 2;
                    arrayList.add(Integer.valueOf(R.attr.windowIsTranslucent));
                    f89030y = 3;
                    arrayList.add(Integer.valueOf(R.attr.windowCloseOnTouchOutside));
                    f89031z = 4;
                    arrayList.add(Integer.valueOf(R.attr.windowSoftInputMode));
                    f89016A = 5;
                    arrayList.add(Integer.valueOf(R.attr.windowAnimationStyle));
                    f89017B = 6;
                    arrayList.add(Integer.valueOf(R.attr.backgroundDimEnabled));
                    f89018C = 7;
                    arrayList.add(Integer.valueOf(R.attr.backgroundDimAmount));
                    f89019D = 8;
                    arrayList.add(Integer.valueOf(R.attr.windowBackground));
                    f89020E = 9;
                    arrayList.add(Integer.valueOf(R.attr.windowFrame));
                    f89021F = 10;
                    arrayList.add(Integer.valueOf(R.attr.windowFullscreen));
                    f89022G = 11;
                    arrayList.add(Integer.valueOf(R.attr.windowTranslucentStatus));
                    f89023H = 12;
                    arrayList.add(Integer.valueOf(R.attr.windowTranslucentNavigation));
                    f89024I = 13;
                    int i11 = Build.VERSION.SDK_INT;
                    arrayList.add(Integer.valueOf(R.attr.windowDrawsSystemBarBackgrounds));
                    f89025J = 14;
                    if (i11 >= 23) {
                        arrayList.add(Integer.valueOf(R.attr.windowLightStatusBar));
                        f89026K = 15;
                    }
                    int[] iArr = new int[arrayList.size()];
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
                    }
                    this.f89050s = this.f89032a.obtainStyledAttributes(iArr);
                }
                typedArray = this.f89050s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return typedArray;
    }

    /* renamed from: o */
    protected final boolean m92908o() {
        return this.f89039h;
    }

    /* renamed from: p */
    protected boolean m92909p() {
        return this.f89038g;
    }

    /* renamed from: t */
    protected void m92910t(int i11) {
        this.f89052u = (~(1 << i11)) & this.f89052u;
    }

    /* renamed from: u */
    public boolean m92911u(int i11) {
        if (!this.f89044m) {
            int m92905l = m92905l();
            if ((m92905l & 2) != 0 && i11 == 8) {
                return false;
            }
            int i12 = m92905l & 256;
            if (i12 != 0 && i11 == 1) {
                m92910t(8);
            }
            if (i12 != 0 && i11 == 11) {
                throw new AndroidRuntimeException("You cannot combine swipe dismissal and the action bar.");
            }
            if ((m92905l & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 && i11 == 8) {
                throw new AndroidRuntimeException("You cannot combine swipe dismissal and the action bar.");
            }
            if (i11 == 5 && this.f89032a.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                throw new AndroidRuntimeException("You cannot use indeterminate progress on a watch.");
            }
            int i13 = 1 << i11;
            int i14 = this.f89052u | i13;
            this.f89052u = i14;
            if ((i13 & i14) == 0) {
                return false;
            }
            return true;
        }
        throw new AndroidRuntimeException("requestFeature() must be called before adding content");
    }

    /* renamed from: v */
    public void m92912v(WindowManager.LayoutParams layoutParams) {
        this.f89049r.copyFrom(layoutParams);
        m92898e(this.f89049r);
    }

    /* renamed from: w */
    public final void m92913w(Drawable drawable) {
        if (drawable != this.f89046o || this.f89045n != 0) {
            this.f89045n = 0;
            this.f89046o = drawable;
            b bVar = this.f89042k;
            if (bVar != null) {
                bVar.m92920d(drawable);
            }
        }
    }

    /* renamed from: x */
    public void m92914x(a aVar) {
        this.f89034c = aVar;
    }

    /* renamed from: y */
    public void m92915y(boolean z11) {
        this.f89035d = z11;
        this.f89036e = true;
    }

    /* renamed from: z */
    public void m92916z(boolean z11) {
        if (this.f89036e) {
            return;
        }
        this.f89035d = z11;
        this.f89036e = true;
    }
}

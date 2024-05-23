package com.zing.zalo.settingreminder;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import java.util.HashSet;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;

/* loaded from: classes4.dex */
public class ScrollViewVisibleChildViewDetector extends ScrollView {

    /* renamed from: A */
    private Runnable f49578A;

    /* renamed from: B */
    private InterfaceC9359c f49579B;

    /* renamed from: C */
    private InterfaceC9358b f49580C;

    /* renamed from: q */
    private HashSet f49581q;

    /* renamed from: r */
    private int f49582r;

    /* renamed from: s */
    private int f49583s;

    /* renamed from: t */
    private int f49584t;

    /* renamed from: u */
    private final Rect f49585u;

    /* renamed from: v */
    private View f49586v;

    /* renamed from: w */
    private int f49587w;

    /* renamed from: x */
    private Handler f49588x;

    /* renamed from: y */
    private Runnable f49589y;

    /* renamed from: z */
    private int f49590z;

    /* renamed from: com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC9357a {
    }

    /* renamed from: com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC9358b {
        /* renamed from: HE */
        void mo50491HE(ScrollView scrollView, boolean z11);
    }

    /* renamed from: com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC9359c {
        /* renamed from: a */
        void mo50492a(ScrollView scrollView, int i11, int i12, int i13, int i14);
    }

    public ScrollViewVisibleChildViewDetector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49582r = 0;
        this.f49583s = 0;
        this.f49584t = 1;
        this.f49585u = new Rect();
        this.f49587w = 0;
        m50480f();
    }

    /* renamed from: d */
    private void m50479d() {
        HashSet hashSet;
        try {
            if (this.f49583s > 0 && (hashSet = this.f49581q) != null && hashSet.size() == this.f49583s) {
                return;
            }
            m50481g();
            m50486m((ViewGroup) getChildAt(0));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderScroll", e11);
        }
    }

    /* renamed from: f */
    private void m50480f() {
        this.f49588x = new Handler(Looper.getMainLooper());
        this.f49589y = new Runnable() { // from class: s00.b
            @Override // java.lang.Runnable
            public final void run() {
                ScrollViewVisibleChildViewDetector.this.m50484k();
            }
        };
        this.f49578A = new Runnable() { // from class: s00.c
            @Override // java.lang.Runnable
            public final void run() {
                ScrollViewVisibleChildViewDetector.this.m50487e();
            }
        };
    }

    /* renamed from: g */
    private void m50481g() {
        int i11;
        if (this.f49581q == null) {
            try {
                if (this.f49584t == 1) {
                    i11 = getChildViewCountNeeded();
                } else {
                    i11 = 0;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mChildViewVisibleSet initialCapacity=");
                sb2.append(i11);
                if (i11 > 0) {
                    this.f49583s = i11;
                    this.f49581q = new HashSet(i11);
                } else {
                    this.f49581q = new HashSet();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderScroll", e11);
            }
        }
    }

    private int getChildViewCountNeeded() {
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        int childCount = viewGroup.getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            if ((viewGroup.getChildAt(i12) instanceof ViewGroup) && viewGroup.getChildAt(i12).getId() != -1) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: h */
    private LinearLayout m50482h() {
        try {
            View childAt = getChildAt(0);
            if (childAt instanceof LinearLayout) {
                return (LinearLayout) childAt;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    private boolean m50483i(View view) {
        if (view != null && (view instanceof ViewGroup) && view.getId() != -1 && view.getVisibility() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m50484k() {
        try {
            if (this.f49590z - getScrollY() == 0) {
                this.f49588x.removeCallbacks(this.f49589y);
                this.f49587w = 0;
                InterfaceC9358b interfaceC9358b = this.f49580C;
                if (interfaceC9358b != null) {
                    interfaceC9358b.mo50491HE(this, m50488j());
                }
            } else {
                this.f49590z = getScrollY();
                this.f49588x.postDelayed(this.f49589y, 100L);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m50485l() {
        try {
            smoothScrollTo(0, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:            if ((r3.bottom - r3.top) < r2.getHeight()) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:            r5.f49581q.add(java.lang.Integer.valueOf(r2.getId()));     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:            if ((r3.bottom - r3.top) > 0) goto L26;     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m50486m(ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup.getChildCount() != 0 && viewGroup.getVisibility() == 0) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (!m50483i(childAt) && !this.f49581q.contains(Integer.valueOf(childAt.getId()))) {
                    if (childAt.getGlobalVisibleRect(this.f49585u)) {
                        if (this.f49582r == 0) {
                            Rect rect = this.f49585u;
                        }
                        if (this.f49582r == 1) {
                            Rect rect2 = this.f49585u;
                        }
                    }
                    if (this.f49584t == 0 && (childAt instanceof ViewGroup)) {
                        m50486m((ViewGroup) childAt);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m50487e() {
        try {
            View view = this.f49586v;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public Object[] getArrayChildViewVisible() {
        try {
            HashSet hashSet = this.f49581q;
            if (hashSet != null) {
                return hashSet.toArray();
            }
            return null;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderScroll", e11);
            return null;
        }
    }

    /* renamed from: j */
    boolean m50488j() {
        return this.f49587w == 0;
    }

    /* renamed from: n */
    public void m50489n() {
        try {
            if (this.f49586v == null) {
                LinearLayout m50482h = m50482h();
                if (m50482h == null) {
                    return;
                }
                this.f49586v = new View(getContext());
                this.f49586v.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
                this.f49586v.setLayoutParams(new LinearLayout.LayoutParams(-1, (AbstractC23136l9.m118713h0() * 3) / 4));
                m50482h.addView(this.f49586v);
            }
            this.f49586v.setVisibility(0);
            this.f49588x.removeCallbacks(this.f49578A);
            this.f49588x.postDelayed(this.f49578A, 550L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            Handler handler = this.f49588x;
            if (handler != null) {
                handler.removeCallbacks(this.f49589y);
                this.f49588x.removeCallbacks(this.f49578A);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m50479d();
        InterfaceC9359c interfaceC9359c = this.f49579B;
        if (interfaceC9359c != null) {
            interfaceC9359c.mo50492a(this, 0, 0, 0, 0);
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        m50479d();
        InterfaceC9358b interfaceC9358b = this.f49580C;
        if (interfaceC9358b != null) {
            this.f49587w = 1;
            interfaceC9358b.mo50491HE(this, m50488j());
            this.f49588x.removeCallbacks(this.f49589y);
            this.f49588x.postDelayed(this.f49589y, 100L);
        }
        InterfaceC9359c interfaceC9359c = this.f49579B;
        if (interfaceC9359c != null) {
            interfaceC9359c.mo50492a(this, i11, i12, i13, i14);
        }
    }

    /* renamed from: p */
    public void m50490p(int i11) {
        scrollTo(0, i11);
        postDelayed(new Runnable() { // from class: s00.d
            @Override // java.lang.Runnable
            public final void run() {
                ScrollViewVisibleChildViewDetector.this.m50485l();
            }
        }, 170L);
    }

    public void setChildViewVisibleType(int i11) {
        this.f49582r = i11;
    }

    public void setOnChildItemVisibleChangedListener(InterfaceC9357a interfaceC9357a) {
    }

    public void setOnScrollStateChangedListener(InterfaceC9358b interfaceC9358b) {
        this.f49580C = interfaceC9358b;
    }

    public void setScanMode(int i11) {
        this.f49584t = i11;
    }

    public void setScrollViewListener(InterfaceC9359c interfaceC9359c) {
        this.f49579B = interfaceC9359c;
    }
}

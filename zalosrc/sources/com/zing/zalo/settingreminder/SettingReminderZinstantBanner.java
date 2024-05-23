package com.zing.zalo.settingreminder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.settingreminder.SettingReminderZinstantBanner;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import hk0.InterfaceC20083a;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;
import mm0.AbstractC23350e;
import nj0.AbstractC23803b;
import pj0.InterfaceC24775a;
import s00.AbstractC26072g;
import s00.C26071f;
import s00.InterfaceC26070e;

/* loaded from: classes4.dex */
public class SettingReminderZinstantBanner extends FrameLayout implements InterfaceC26070e {

    /* renamed from: p */
    C26071f f49591p;

    /* renamed from: q */
    ZaloZinstantLayout f49592q;

    /* renamed from: r */
    AbstractC23803b f49593r;

    /* renamed from: s */
    AbstractC26072g f49594s;

    /* renamed from: t */
    private volatile boolean f49595t;

    /* renamed from: u */
    ViewTreeObserver.OnGlobalLayoutListener f49596u;

    /* renamed from: v */
    InterfaceC24775a f49597v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.settingreminder.SettingReminderZinstantBanner$a */
    /* loaded from: classes4.dex */
    public class C9360a implements InterfaceC20083a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22508f f49598a;

        C9360a(InterfaceC22508f interfaceC22508f) {
            this.f49598a = interfaceC22508f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m50508d() {
            try {
                SettingReminderZinstantBanner.this.m50503h();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderZinstantBanner", e11);
                SettingReminderZinstantBanner.this.m50496k();
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
            try {
                SettingReminderZinstantBanner.this.f49592q.m91447b1(this.f49598a, interfaceC20578a0);
                SettingReminderZinstantBanner.this.post(new Runnable() { // from class: com.zing.zalo.settingreminder.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingReminderZinstantBanner.C9360a.this.m50508d();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderZinstantBanner", e11);
                SettingReminderZinstantBanner.this.m50496k();
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            SettingReminderZinstantBanner.this.m50496k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.settingreminder.SettingReminderZinstantBanner$b */
    /* loaded from: classes4.dex */
    public class C9361b implements InterfaceC24775a {
        C9361b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m50511d() {
            SettingReminderZinstantBanner.this.m50501f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m50512e() {
            long j11;
            try {
                SettingReminderZinstantBanner settingReminderZinstantBanner = SettingReminderZinstantBanner.this;
                if (settingReminderZinstantBanner.f49591p == null) {
                    settingReminderZinstantBanner.m50496k();
                    return;
                }
                AbstractC26072g abstractC26072g = settingReminderZinstantBanner.f49594s;
                if (abstractC26072g != null) {
                    j11 = abstractC26072g.mo87416a(settingReminderZinstantBanner);
                } else {
                    j11 = 0;
                }
                if (j11 > 0) {
                    SettingReminderZinstantBanner.this.postDelayed(new Runnable() { // from class: com.zing.zalo.settingreminder.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingReminderZinstantBanner.C9361b.this.m50511d();
                        }
                    }, j11);
                } else {
                    SettingReminderZinstantBanner.this.m50501f();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderZinstantBanner", e11);
                SettingReminderZinstantBanner.this.m50496k();
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            SettingReminderZinstantBanner.this.m50496k();
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            try {
                SettingReminderZinstantBanner.this.post(new Runnable() { // from class: com.zing.zalo.settingreminder.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingReminderZinstantBanner.C9361b.this.m50512e();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderZinstantBanner", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.settingreminder.SettingReminderZinstantBanner$c */
    /* loaded from: classes4.dex */
    public class C9362c extends AbstractC23803b {
        C9362c() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            super.mo43842i(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
            SettingReminderZinstantBanner settingReminderZinstantBanner = SettingReminderZinstantBanner.this;
            AbstractC26072g abstractC26072g = settingReminderZinstantBanner.f49594s;
            if (abstractC26072g != null) {
                abstractC26072g.mo87419e(settingReminderZinstantBanner.f49591p, str3, str4);
            }
        }
    }

    public SettingReminderZinstantBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49595t = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m50495i() {
        try {
            if (getHeight() > 0) {
                m50497n();
                AbstractC26072g abstractC26072g = this.f49594s;
                if (abstractC26072g != null) {
                    abstractC26072g.mo87417c(this);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m50496k() {
        this.f49595t = true;
        AbstractC26072g abstractC26072g = this.f49594s;
        if (abstractC26072g != null) {
            abstractC26072g.m134183b(this);
        }
    }

    /* renamed from: n */
    private void m50497n() {
        try {
            if (this.f49596u != null) {
                getViewTreeObserver().removeOnGlobalLayoutListener(this.f49596u);
                this.f49596u = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // s00.InterfaceC26070e
    /* renamed from: a */
    public boolean mo50498a(C26071f c26071f) {
        return this.f49591p == c26071f && !this.f49595t;
    }

    @Override // s00.InterfaceC26070e
    /* renamed from: b */
    public void mo50499b(C26071f c26071f, int i11) {
        if (c26071f == null) {
            return;
        }
        this.f49591p = c26071f;
        setVisibility(8);
        if (i11 <= 0) {
            m50496k();
            return;
        }
        C17244x0 m134175f = c26071f.m134175f();
        if (m134175f == null) {
            m50496k();
            return;
        }
        InterfaceC22508f m92064b = m134175f.m92064b();
        if (m92064b == null) {
            m50496k();
            return;
        }
        this.f49595t = false;
        try {
            AbstractC17148f0.m91694m(m92064b, i11, new C9360a(m92064b));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderZinstantBanner", e11);
        }
    }

    @Override // s00.InterfaceC26070e
    /* renamed from: c */
    public void mo50500c() {
        setVisibility(8);
        m50506m();
        this.f49591p = null;
    }

    /* renamed from: f */
    void m50501f() {
        try {
            setVisibility(0);
            m50505l();
            AbstractC26072g abstractC26072g = this.f49594s;
            if (abstractC26072g != null && abstractC26072g.mo87418d(this)) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: s00.t
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        SettingReminderZinstantBanner.this.m50495i();
                    }
                };
                this.f49596u = onGlobalLayoutListener;
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    void m50502g() {
        if (this.f49593r == null) {
            this.f49593r = new C9362c();
        }
    }

    @Override // s00.InterfaceC26070e
    public C26071f getCurrentData() {
        return this.f49591p;
    }

    /* renamed from: h */
    void m50503h() {
        if (this.f49592q == null) {
            return;
        }
        m50502g();
        if (this.f49597v == null) {
            this.f49597v = new C9361b();
        }
        this.f49592q.setOnZinstantClickListener(this.f49593r);
        this.f49592q.m91446Z0(this.f49597v);
    }

    /* renamed from: j */
    public void m50504j() {
        ZaloZinstantLayout zaloZinstantLayout = this.f49592q;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.m91993g0();
        }
    }

    /* renamed from: l */
    public void m50505l() {
        ZaloZinstantLayout zaloZinstantLayout = this.f49592q;
        if (zaloZinstantLayout != null && !zaloZinstantLayout.m91989T()) {
            this.f49592q.onStart();
        }
    }

    /* renamed from: m */
    public void m50506m() {
        ZaloZinstantLayout zaloZinstantLayout = this.f49592q;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.onStop();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            m50497n();
            super.onDetachedFromWindow();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        this.f49592q = (ZaloZinstantLayout) findViewById(AbstractC6918a0.zinstant_layout);
    }

    @Override // s00.InterfaceC26070e
    public void setSettingReminderListener(AbstractC26072g abstractC26072g) {
        this.f49594s = abstractC26072g;
    }

    public SettingReminderZinstantBanner(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f49595t = false;
    }
}

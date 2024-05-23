package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import fn0.AbstractC19074t;
import p649xl.C29995q5;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class LoadingLayoutWithIndeterminateProgressBar extends RelativeLayout {

    /* renamed from: p */
    private C29995q5 f45044p;

    /* renamed from: q */
    private EnumC8211b f45045q;

    /* renamed from: com.zing.zalo.feed.components.LoadingLayoutWithIndeterminateProgressBar$a */
    /* loaded from: classes4.dex */
    public static final class C8210a {

        /* renamed from: a */
        private final EnumC8211b f45046a;

        public C8210a(EnumC8211b enumC8211b) {
            AbstractC19074t.m100208f(enumC8211b, "loadingPosition");
            this.f45046a = enumC8211b;
        }

        /* renamed from: a */
        public final EnumC8211b m44433a() {
            return this.f45046a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8210a) && this.f45046a == ((C8210a) obj).f45046a;
        }

        public int hashCode() {
            return this.f45046a.hashCode();
        }

        public String toString() {
            return "LoadingData(loadingPosition=" + this.f45046a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.feed.components.LoadingLayoutWithIndeterminateProgressBar$b */
    /* loaded from: classes4.dex */
    public static final class EnumC8211b {

        /* renamed from: p */
        public static final EnumC8211b f45047p = new EnumC8211b("CENTER", 0);

        /* renamed from: q */
        public static final EnumC8211b f45048q = new EnumC8211b("TOP", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC8211b[] f45049r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f45050s;

        static {
            EnumC8211b[] m44434b = m44434b();
            f45049r = m44434b;
            f45050s = AbstractC30166b.m148796a(m44434b);
        }

        private EnumC8211b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8211b[] m44434b() {
            return new EnumC8211b[]{f45047p, f45048q};
        }

        public static EnumC8211b valueOf(String str) {
            return (EnumC8211b) Enum.valueOf(EnumC8211b.class, str);
        }

        public static EnumC8211b[] values() {
            return (EnumC8211b[]) f45049r.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingLayoutWithIndeterminateProgressBar(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f45045q = EnumC8211b.f45047p;
        m44432b(context);
    }

    /* renamed from: c */
    private final void m44428c() {
        C29995q5 c29995q5 = this.f45044p;
        if (c29995q5 == null) {
            AbstractC19074t.m100223u("binding");
            c29995q5 = null;
        }
        ViewGroup.LayoutParams layoutParams = c29995q5.f139093r.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(10);
            layoutParams2.addRule(14, -1);
            layoutParams2.addRule(15, -1);
        }
    }

    /* renamed from: d */
    private final void m44429d() {
        C29995q5 c29995q5 = this.f45044p;
        if (c29995q5 == null) {
            AbstractC19074t.m100223u("binding");
            c29995q5 = null;
        }
        ViewGroup.LayoutParams layoutParams = c29995q5.f139093r.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(15);
            layoutParams2.addRule(14, -1);
            layoutParams2.addRule(10, -1);
        }
    }

    /* renamed from: e */
    private final void m44430e() {
        EnumC8211b enumC8211b = this.f45045q;
        if (enumC8211b == EnumC8211b.f45047p) {
            m44428c();
        } else if (enumC8211b == EnumC8211b.f45048q) {
            m44429d();
        }
        C29995q5 c29995q5 = this.f45044p;
        if (c29995q5 == null) {
            AbstractC19074t.m100223u("binding");
            c29995q5 = null;
        }
        c29995q5.f139093r.requestLayout();
    }

    private final void setLoadingPosition(EnumC8211b enumC8211b) {
        this.f45045q = enumC8211b;
        m44430e();
    }

    /* renamed from: a */
    public final void m44431a(C8210a c8210a) {
        AbstractC19074t.m100208f(c8210a, "loadingData");
        setLoadingPosition(c8210a.m44433a());
        C29995q5 c29995q5 = this.f45044p;
        if (c29995q5 == null) {
            AbstractC19074t.m100223u("binding");
            c29995q5 = null;
        }
        c29995q5.f139093r.setVisibility(0);
    }

    /* renamed from: b */
    public final void m44432b(Context context) {
        C29995q5 m148398c = C29995q5.m148398c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148398c, "inflate(...)");
        this.f45044p = m148398c;
        m44430e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingLayoutWithIndeterminateProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f45045q = EnumC8211b.f45047p;
        m44432b(context);
    }
}

package p468r0;

import android.os.Bundle;

/* renamed from: r0.a */
/* loaded from: classes2.dex */
public final class C25590a {

    /* renamed from: a */
    public final Integer f122329a;

    /* renamed from: b */
    public final Integer f122330b;

    /* renamed from: c */
    public final Integer f122331c;

    /* renamed from: d */
    public final Integer f122332d;

    /* renamed from: r0.a$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private Integer f122333a;

        /* renamed from: b */
        private Integer f122334b;

        /* renamed from: c */
        private Integer f122335c;

        /* renamed from: d */
        private Integer f122336d;

        /* renamed from: a */
        public C25590a m132180a() {
            return new C25590a(this.f122333a, this.f122334b, this.f122335c, this.f122336d);
        }

        /* renamed from: b */
        public a m132181b(int i11) {
            this.f122333a = Integer.valueOf(i11 | (-16777216));
            return this;
        }
    }

    C25590a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f122329a = num;
        this.f122330b = num2;
        this.f122331c = num3;
        this.f122332d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle m132179a() {
        Bundle bundle = new Bundle();
        Integer num = this.f122329a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f122330b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f122331c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f122332d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}

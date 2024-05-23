package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zlottie.widget.LottieImageView;
import fn0.AbstractC19074t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class LottieWithImageView extends FrameLayout {

    /* renamed from: p */
    private EnumC8868a f47374p;

    /* renamed from: q */
    private final RecyclingImageView f47375q;

    /* renamed from: r */
    private final LottieImageView f47376r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.feed.uicontrols.LottieWithImageView$a */
    /* loaded from: classes4.dex */
    public static final class EnumC8868a {

        /* renamed from: p */
        public static final EnumC8868a f47377p = new EnumC8868a("Lottie", 0);

        /* renamed from: q */
        public static final EnumC8868a f47378q = new EnumC8868a("Normal", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC8868a[] f47379r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f47380s;

        static {
            EnumC8868a[] m47323b = m47323b();
            f47379r = m47323b;
            f47380s = AbstractC30166b.m148796a(m47323b);
        }

        private EnumC8868a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8868a[] m47323b() {
            return new EnumC8868a[]{f47377p, f47378q};
        }

        public static EnumC8868a valueOf(String str) {
            return (EnumC8868a) Enum.valueOf(EnumC8868a.class, str);
        }

        public static EnumC8868a[] values() {
            return (EnumC8868a[]) f47379r.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieWithImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f47374p = EnumC8868a.f47378q;
        this.f47375q = new RecyclingImageView(getContext());
        this.f47376r = new LottieImageView(getContext());
        m47322a();
    }

    /* renamed from: a */
    private final void m47322a() {
        this.f47375q.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f47375q.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f47376r.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f47376r.setVisibility(8);
        addView(this.f47375q);
        addView(this.f47376r);
    }

    public final LottieImageView getLottieView() {
        return this.f47376r;
    }

    public final RecyclingImageView getNormalView() {
        return this.f47375q;
    }

    public final void setImageMode(EnumC8868a enumC8868a) {
        AbstractC19074t.m100208f(enumC8868a, "mode");
        this.f47374p = enumC8868a;
        if (enumC8868a == EnumC8868a.f47378q) {
            this.f47375q.setVisibility(0);
            this.f47376r.setVisibility(8);
        } else {
            this.f47376r.setVisibility(0);
            this.f47375q.setVisibility(8);
        }
    }
}

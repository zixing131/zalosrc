package com.zing.zalo.zdesign.component.popover;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2808b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import qi0.EnumC25293b;
import qi0.EnumC25294c;

/* renamed from: com.zing.zalo.zdesign.component.popover.d */
/* loaded from: classes7.dex */
public final class C17035d {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final View f87154a;

    /* renamed from: b */
    private final int f87155b;

    /* renamed from: c */
    private final boolean f87156c;

    /* renamed from: d */
    private final Drawable f87157d;

    /* renamed from: e */
    private final boolean f87158e;

    /* renamed from: f */
    private final Drawable f87159f;

    /* renamed from: g */
    private final View f87160g;

    /* renamed from: h */
    private final EnumC25293b f87161h;

    /* renamed from: i */
    private final int f87162i;

    /* renamed from: j */
    private final EnumC25294c f87163j;

    /* renamed from: k */
    private final Rect f87164k;

    /* renamed from: l */
    private final boolean f87165l;

    /* renamed from: m */
    private final boolean f87166m;

    /* renamed from: n */
    private int f87167n;

    /* renamed from: com.zing.zalo.zdesign.component.popover.d$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        private View f87168a;

        /* renamed from: d */
        private Drawable f87171d;

        /* renamed from: e */
        private boolean f87172e;

        /* renamed from: f */
        private Drawable f87173f;

        /* renamed from: g */
        private View f87174g;

        /* renamed from: i */
        private int f87176i;

        /* renamed from: j */
        private EnumC25294c f87177j;

        /* renamed from: k */
        private Rect f87178k;

        /* renamed from: l */
        private boolean f87179l;

        /* renamed from: b */
        private int f87169b = 8;

        /* renamed from: c */
        private boolean f87170c = true;

        /* renamed from: h */
        private EnumC25293b f87175h = EnumC25293b.NONE;

        /* renamed from: m */
        private boolean f87180m = true;

        /* renamed from: a */
        public final C17035d m91215a() {
            return new C17035d(this.f87168a, this.f87169b, this.f87170c, this.f87171d, this.f87172e, this.f87173f, this.f87174g, this.f87175h, this.f87176i, this.f87177j, this.f87178k, this.f87179l, this.f87180m, null);
        }

        /* renamed from: b */
        public final a m91216b(View view) {
            this.f87174g = view;
            return this;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.popover.d$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public /* synthetic */ C17035d(View view, int i11, boolean z11, Drawable drawable, boolean z12, Drawable drawable2, View view2, EnumC25293b enumC25293b, int i12, EnumC25294c enumC25294c, Rect rect, boolean z13, boolean z14, AbstractC19060k abstractC19060k) {
        this(view, i11, z11, drawable, z12, drawable2, view2, enumC25293b, i12, enumC25294c, rect, z13, z14);
    }

    /* renamed from: a */
    public final Drawable m91202a() {
        return this.f87157d;
    }

    /* renamed from: b */
    public final boolean m91203b() {
        return this.f87156c;
    }

    /* renamed from: c */
    public final Drawable m91204c() {
        return this.f87159f;
    }

    /* renamed from: d */
    public final View m91205d() {
        return this.f87154a;
    }

    /* renamed from: e */
    public final int m91206e(Context context) {
        int m6961c;
        AbstractC19074t.m100208f(context, "context");
        if (!this.f87158e) {
            m6961c = 0;
        } else {
            m6961c = AbstractC1388a.m6961c(context, AbstractC2808b.blk_a70);
        }
        this.f87167n = m6961c;
        return m6961c;
    }

    /* renamed from: f */
    public final int m91207f() {
        return this.f87155b;
    }

    /* renamed from: g */
    public final boolean m91208g() {
        return this.f87165l;
    }

    /* renamed from: h */
    public final EnumC25294c m91209h() {
        return this.f87163j;
    }

    /* renamed from: i */
    public final Rect m91210i() {
        return this.f87164k;
    }

    /* renamed from: j */
    public final boolean m91211j() {
        return this.f87166m;
    }

    /* renamed from: k */
    public final int m91212k() {
        return this.f87162i;
    }

    /* renamed from: l */
    public final View m91213l() {
        return this.f87160g;
    }

    /* renamed from: m */
    public final EnumC25293b m91214m() {
        return this.f87161h;
    }

    private C17035d(View view, int i11, boolean z11, Drawable drawable, boolean z12, Drawable drawable2, View view2, EnumC25293b enumC25293b, int i12, EnumC25294c enumC25294c, Rect rect, boolean z13, boolean z14) {
        this.f87154a = view;
        this.f87155b = i11;
        this.f87156c = z11;
        this.f87157d = drawable;
        this.f87158e = z12;
        this.f87159f = drawable2;
        this.f87160g = view2;
        this.f87161h = enumC25293b;
        this.f87162i = i12;
        this.f87163j = enumC25294c;
        this.f87164k = rect;
        this.f87165l = z13;
        this.f87166m = z14;
        this.f87167n = -2013265920;
    }
}

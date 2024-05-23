package com.zing.zalo.zdesign.component.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;
import kd0.C21693c;

/* renamed from: com.zing.zalo.zdesign.component.avatar.b */
/* loaded from: classes7.dex */
public abstract class AbstractC16946b {

    /* renamed from: a */
    private Context f86499a;

    /* renamed from: b */
    private a f86500b;

    /* renamed from: c */
    private Drawable.Callback f86501c;

    /* renamed from: d */
    private Drawable f86502d;

    /* renamed from: com.zing.zalo.zdesign.component.avatar.b$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo90484a(AbstractC16946b abstractC16946b);
    }

    public AbstractC16946b(Context context, a aVar, Drawable.Callback callback) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "listener");
        AbstractC19074t.m100208f(callback, "drawableCallback");
        this.f86499a = context;
        this.f86500b = aVar;
        this.f86501c = callback;
    }

    /* renamed from: a */
    public final Drawable m90768a() {
        return this.f86502d;
    }

    /* renamed from: b */
    public final Context m90769b() {
        return this.f86499a;
    }

    /* renamed from: c */
    public final Drawable.Callback m90770c() {
        return this.f86501c;
    }

    /* renamed from: d */
    public final a m90771d() {
        return this.f86500b;
    }

    /* renamed from: e */
    public abstract boolean mo88234e(String str);

    /* renamed from: f */
    public abstract void mo88235f(String str, boolean z11, boolean z12);

    /* renamed from: g */
    public abstract void mo88236g(C21693c c21693c, String str, boolean z11, boolean z12);

    /* renamed from: h */
    public abstract void mo88237h();

    /* renamed from: i */
    public final void m90772i(Drawable drawable) {
        this.f86502d = drawable;
    }
}

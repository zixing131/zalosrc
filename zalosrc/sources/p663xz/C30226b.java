package p663xz;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.AbstractC1388a;
import fn0.AbstractC19074t;
import p193h0.AbstractC19694b;

/* renamed from: xz.b */
/* loaded from: classes.dex */
public final class C30226b implements InterfaceC30225a {

    /* renamed from: a */
    private final Context f140405a;

    public C30226b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f140405a = context;
    }

    @Override // p663xz.InterfaceC30225a
    /* renamed from: a */
    public Drawable mo149037a(int i11) {
        return AbstractC19694b.m103336d(this.f140405a, i11);
    }

    @Override // p663xz.InterfaceC30225a
    /* renamed from: b */
    public int mo149038b() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // p663xz.InterfaceC30225a
    /* renamed from: c */
    public int mo149039c() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // p663xz.InterfaceC30225a
    /* renamed from: d */
    public int mo149040d(int i11) {
        return AbstractC1388a.m6961c(this.f140405a, i11);
    }

    @Override // p663xz.InterfaceC30225a
    /* renamed from: e */
    public int mo149041e(int i11) {
        return (int) ((i11 * this.f140405a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // p663xz.InterfaceC30225a
    /* renamed from: f */
    public int mo149042f(float f11) {
        return (int) ((f11 * this.f140405a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // p663xz.InterfaceC30225a
    public String getString(int i11) {
        String string = this.f140405a.getString(i11);
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }
}

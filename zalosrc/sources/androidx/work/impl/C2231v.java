package androidx.work.impl;

import android.content.Context;
import fn0.AbstractC19074t;
import p028b2.AbstractC2494c;
import p119e2.InterfaceC18182g;

/* renamed from: androidx.work.impl.v */
/* loaded from: classes.dex */
public final class C2231v extends AbstractC2494c {

    /* renamed from: c */
    private final Context f9375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2231v(Context context, int i11, int i12) {
        super(i11, i12);
        AbstractC19074t.m100208f(context, "mContext");
        this.f9375c = context;
    }

    @Override // p028b2.AbstractC2494c
    /* renamed from: a */
    public void mo11714a(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        if (this.f10177b >= 10) {
            interfaceC18182g.mo189C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f9375c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}

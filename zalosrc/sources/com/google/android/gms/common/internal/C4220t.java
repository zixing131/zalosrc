package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C4071a;

/* renamed from: com.google.android.gms.common.internal.t */
/* loaded from: classes2.dex */
public class C4220t implements C4071a.d {

    /* renamed from: q */
    public static final C4220t f16660q = m19794a().m19796a();

    /* renamed from: p */
    private final String f16661p;

    /* renamed from: com.google.android.gms.common.internal.t$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private String f16662a;

        /* synthetic */ a(AbstractC4229w abstractC4229w) {
        }

        /* renamed from: a */
        public C4220t m19796a() {
            return new C4220t(this.f16662a, null);
        }

        /* renamed from: b */
        public a m19797b(String str) {
            this.f16662a = str;
            return this;
        }
    }

    /* synthetic */ C4220t(String str, AbstractC4232x abstractC4232x) {
        this.f16661p = str;
    }

    /* renamed from: a */
    public static a m19794a() {
        return new a(null);
    }

    /* renamed from: b */
    public final Bundle m19795b() {
        Bundle bundle = new Bundle();
        String str = this.f16661p;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4220t)) {
            return false;
        }
        return AbstractC4199m.m19701a(this.f16661p, ((C4220t) obj).f16661p);
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f16661p);
    }
}

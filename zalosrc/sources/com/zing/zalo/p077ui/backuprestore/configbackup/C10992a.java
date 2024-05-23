package com.zing.zalo.p077ui.backuprestore.configbackup;

import android.os.Bundle;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.backuprestore.configbackup.a */
/* loaded from: classes5.dex */
public final class C10992a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final boolean f55527a;

    /* renamed from: com.zing.zalo.ui.backuprestore.configbackup.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C10992a m57179a(Bundle bundle) {
            boolean z11;
            if (bundle != null) {
                z11 = bundle.getBoolean("KEY_IS_HAS_RED_DOT");
            } else {
                z11 = false;
            }
            return new C10992a(z11);
        }
    }

    public C10992a(boolean z11) {
        this.f55527a = z11;
    }

    /* renamed from: a */
    public final boolean m57178a() {
        return this.f55527a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10992a) && this.f55527a == ((C10992a) obj).f55527a;
    }

    public int hashCode() {
        return AbstractC2144f.m11520a(this.f55527a);
    }

    public String toString() {
        return "ConfigBackupViewArgs(isHasRedDot=" + this.f55527a + ")";
    }

    public /* synthetic */ C10992a(boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11);
    }
}

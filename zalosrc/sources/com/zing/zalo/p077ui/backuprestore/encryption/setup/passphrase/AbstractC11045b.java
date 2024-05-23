package com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import q40.EnumC25120i;

/* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.b */
/* loaded from: classes5.dex */
public abstract class AbstractC11045b {

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC11045b {

        /* renamed from: a */
        private final EnumC25120i f55731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC25120i enumC25120i) {
            super(null);
            AbstractC19074t.m100208f(enumC25120i, "toastType");
            this.f55731a = enumC25120i;
        }

        /* renamed from: a */
        public final EnumC25120i m57654a() {
            return this.f55731a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f55731a == ((a) obj).f55731a;
        }

        public int hashCode() {
            return this.f55731a.hashCode();
        }

        public String toString() {
            return "ShowToast(toastType=" + this.f55731a + ")";
        }
    }

    private AbstractC11045b() {
    }

    public /* synthetic */ AbstractC11045b(AbstractC19060k abstractC19060k) {
        this();
    }
}

package i60;

import android.content.Intent;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: i60.q */
/* loaded from: classes5.dex */
public final class C20351q {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f100356a;

    /* renamed from: i60.q$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20351q m106093a(Intent intent) {
            if (intent != null) {
                return new C20351q(intent.getStringExtra("extra_result_qr_content"));
            }
            return null;
        }
    }

    public C20351q(String str) {
        this.f100356a = str;
    }

    /* renamed from: a */
    public static final C20351q m106091a(Intent intent) {
        return Companion.m106093a(intent);
    }

    /* renamed from: b */
    public final String m106092b() {
        return this.f100356a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20351q) && AbstractC19074t.m100204b(this.f100356a, ((C20351q) obj).f100356a);
    }

    public int hashCode() {
        String str = this.f100356a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ScanQrCodeForPageResult(qrContent=" + this.f100356a + ")";
    }
}

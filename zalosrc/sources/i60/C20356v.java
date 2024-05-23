package i60;

import android.content.Intent;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;

/* renamed from: i60.v */
/* loaded from: classes5.dex */
public final class C20356v {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final long f100365a;

    /* renamed from: b */
    private final long f100366b;

    /* renamed from: i60.v$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20356v m106107a(Intent intent) {
            if (intent != null) {
                return new C20356v(intent.getLongExtra("extra_global_id", 0L), intent.getLongExtra("extra_client_id", 0L));
            }
            return null;
        }
    }

    public C20356v(long j11, long j12) {
        this.f100365a = j11;
        this.f100366b = j12;
    }

    /* renamed from: a */
    public static final C20356v m106104a(Intent intent) {
        return Companion.m106107a(intent);
    }

    /* renamed from: b */
    public final long m106105b() {
        return this.f100366b;
    }

    /* renamed from: c */
    public final long m106106c() {
        return this.f100365a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20356v)) {
            return false;
        }
        C20356v c20356v = (C20356v) obj;
        return this.f100365a == c20356v.f100365a && this.f100366b == c20356v.f100366b;
    }

    public int hashCode() {
        return (AbstractC2147g0.m11521a(this.f100365a) * 31) + AbstractC2147g0.m11521a(this.f100366b);
    }

    public String toString() {
        return "ViewFullMediaStoreActivityResult(mGlobalMediaStoreMsgId=" + this.f100365a + ", mClientMediaStoreMsgId=" + this.f100366b + ")";
    }
}

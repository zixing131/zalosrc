package tj;

import android.text.TextUtils;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: tj.b */
/* loaded from: classes3.dex */
public final class C26710b {

    /* renamed from: a */
    private final String f126649a;

    /* renamed from: b */
    private final long f126650b;

    /* renamed from: c */
    private final String f126651c;

    /* renamed from: d */
    private final String f126652d;

    public C26710b(String str, long j11, String str2, String str3) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "ownerId");
        this.f126649a = str;
        this.f126650b = j11;
        this.f126651c = str2;
        this.f126652d = str3;
    }

    /* renamed from: a */
    public final String m137326a() {
        return this.f126652d;
    }

    /* renamed from: b */
    public final long m137327b() {
        return this.f126650b;
    }

    /* renamed from: c */
    public final String m137328c() {
        return this.f126649a;
    }

    /* renamed from: d */
    public final String m137329d() {
        return this.f126651c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C26710b) {
            return TextUtils.equals(this.f126649a, ((C26710b) obj).f126649a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f126649a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f126650b)) * 31) + this.f126651c.hashCode();
    }

    public /* synthetic */ C26710b(String str, long j11, String str2, String str3, int i11, AbstractC19060k abstractC19060k) {
        this(str, j11, str2, (i11 & 8) != 0 ? null : str3);
    }
}

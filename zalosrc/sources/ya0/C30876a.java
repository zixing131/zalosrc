package ya0;

import android.graphics.drawable.Drawable;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ya0.a */
/* loaded from: classes6.dex */
public final class C30876a {

    /* renamed from: a */
    private final String f142451a;

    /* renamed from: b */
    private final int f142452b;

    /* renamed from: c */
    private final int f142453c;

    /* renamed from: d */
    private final boolean f142454d;

    /* renamed from: e */
    private final boolean f142455e;

    /* renamed from: f */
    private final Drawable f142456f;

    /* renamed from: g */
    private final long f142457g;

    public C30876a(String str, int i11, long j11, int i12, boolean z11, boolean z12, Drawable drawable) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f142451a = str;
        this.f142452b = i11;
        this.f142453c = i12;
        this.f142454d = z11;
        this.f142455e = z12;
        this.f142456f = drawable;
        this.f142457g = j11 < 0 ? 0L : j11;
    }

    /* renamed from: a */
    public final int m150080a() {
        return this.f142452b;
    }

    /* renamed from: b */
    public final Drawable m150081b() {
        return this.f142456f;
    }

    /* renamed from: c */
    public final boolean m150082c() {
        return this.f142455e;
    }

    /* renamed from: d */
    public final boolean m150083d() {
        return this.f142454d;
    }

    /* renamed from: e */
    public final long m150084e() {
        return this.f142457g;
    }

    /* renamed from: f */
    public final int m150085f() {
        return this.f142453c;
    }

    /* renamed from: g */
    public final String m150086g() {
        return this.f142451a;
    }

    public /* synthetic */ C30876a(String str, int i11, long j11, int i12, boolean z11, boolean z12, Drawable drawable, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? "" : str, i11, j11, (i13 & 8) != 0 ? -1 : i12, (i13 & 16) != 0 ? true : z11, (i13 & 32) != 0 ? true : z12, (i13 & 64) != 0 ? null : drawable);
    }
}

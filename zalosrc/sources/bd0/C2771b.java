package bd0;

import android.widget.ImageView;
import androidx.work.AbstractC2144f;
import com.zing.zalo.p077ui.widget.C13700o2;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p471r3.C25630b;

/* renamed from: bd0.b */
/* loaded from: classes4.dex */
public final class C2771b {

    /* renamed from: a */
    private final C25630b f10928a;

    /* renamed from: b */
    private final C13700o2.c f10929b;

    /* renamed from: c */
    private final ImageView.ScaleType f10930c;

    /* renamed from: d */
    private final boolean f10931d;

    /* renamed from: e */
    private final boolean f10932e;

    /* renamed from: f */
    private final boolean f10933f;

    /* renamed from: g */
    private final boolean f10934g;

    /* renamed from: h */
    private final boolean f10935h;

    public C2771b(C25630b c25630b, C13700o2.c cVar, ImageView.ScaleType scaleType, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        AbstractC19074t.m100208f(scaleType, "stickerRenderScaleType");
        this.f10928a = c25630b;
        this.f10929b = cVar;
        this.f10930c = scaleType;
        this.f10931d = z11;
        this.f10932e = z12;
        this.f10933f = z13;
        this.f10934g = z14;
        this.f10935h = z15;
    }

    /* renamed from: a */
    public final boolean m13322a() {
        return this.f10934g;
    }

    /* renamed from: b */
    public final boolean m13323b() {
        return this.f10932e;
    }

    /* renamed from: c */
    public final C13700o2.c m13324c() {
        return this.f10929b;
    }

    /* renamed from: d */
    public final C25630b m13325d() {
        return this.f10928a;
    }

    /* renamed from: e */
    public final ImageView.ScaleType m13326e() {
        return this.f10930c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2771b)) {
            return false;
        }
        C2771b c2771b = (C2771b) obj;
        return AbstractC19074t.m100204b(this.f10928a, c2771b.f10928a) && this.f10929b == c2771b.f10929b && this.f10930c == c2771b.f10930c && this.f10931d == c2771b.f10931d && this.f10932e == c2771b.f10932e && this.f10933f == c2771b.f10933f && this.f10934g == c2771b.f10934g && this.f10935h == c2771b.f10935h;
    }

    /* renamed from: f */
    public final boolean m13327f() {
        return this.f10933f;
    }

    /* renamed from: g */
    public final boolean m13328g() {
        return this.f10931d;
    }

    /* renamed from: h */
    public final boolean m13329h() {
        return this.f10935h;
    }

    public int hashCode() {
        C25630b c25630b = this.f10928a;
        int hashCode = (c25630b == null ? 0 : c25630b.hashCode()) * 31;
        C13700o2.c cVar = this.f10929b;
        return ((((((((((((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f10930c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f10931d)) * 31) + AbstractC2144f.m11520a(this.f10932e)) * 31) + AbstractC2144f.m11520a(this.f10933f)) * 31) + AbstractC2144f.m11520a(this.f10934g)) * 31) + AbstractC2144f.m11520a(this.f10935h);
    }

    public String toString() {
        return "CreateStickerDrawerParams(stickerInfo=" + this.f10928a + ", renderMode=" + this.f10929b + ", stickerRenderScaleType=" + this.f10930c + ", isResetFrameWhenDone=" + this.f10931d + ", loop=" + this.f10932e + ", isForcePNGListDecoder=" + this.f10933f + ", canPlayWebpFFS=" + this.f10934g + ", isRoundedCorner=" + this.f10935h + ")";
    }

    public /* synthetic */ C2771b(C25630b c25630b, C13700o2.c cVar, ImageView.ScaleType scaleType, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : c25630b, (i11 & 2) == 0 ? cVar : null, (i11 & 4) != 0 ? C13700o2.Companion.m76549c() : scaleType, (i11 & 8) != 0 ? true : z11, (i11 & 16) == 0 ? z12 : true, (i11 & 32) != 0 ? false : z13, (i11 & 64) != 0 ? false : z14, (i11 & 128) == 0 ? z15 : false);
    }
}

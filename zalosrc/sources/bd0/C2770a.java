package bd0;

import android.content.Context;
import android.graphics.Rect;
import android.widget.ImageView;
import androidx.work.AbstractC2144f;
import com.zing.zalo.p077ui.widget.C13700o2;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: bd0.a */
/* loaded from: classes4.dex */
public final class C2770a {

    /* renamed from: a */
    private final a f10919a;

    /* renamed from: b */
    private final C13700o2.d f10920b;

    /* renamed from: c */
    private final int f10921c;

    /* renamed from: d */
    private final Rect f10922d;

    /* renamed from: e */
    private final boolean f10923e;

    /* renamed from: f */
    private final boolean f10924f;

    /* renamed from: g */
    private final boolean f10925g;

    /* renamed from: h */
    private final ImageView.ScaleType f10926h;

    /* renamed from: i */
    private final boolean f10927i;

    /* renamed from: bd0.a$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: bd0.a$a$a */
        /* loaded from: classes4.dex */
        public static final class C32648a {
            /* renamed from: a */
            public static boolean m13320a(a aVar) {
                return false;
            }

            /* renamed from: b */
            public static boolean m13321b(a aVar) {
                return false;
            }
        }

        /* renamed from: a */
        boolean mo13318a();

        /* renamed from: b */
        boolean mo13319b();

        Context getContext();

        void invalidate();

        boolean isShown();

        void postInvalidate();
    }

    public C2770a(a aVar, C13700o2.d dVar, int i11, Rect rect, boolean z11, boolean z12, boolean z13, ImageView.ScaleType scaleType, boolean z14) {
        AbstractC19074t.m100208f(dVar, "sizeType");
        AbstractC19074t.m100208f(scaleType, "stickerRenderScaleType");
        this.f10919a = aVar;
        this.f10920b = dVar;
        this.f10921c = i11;
        this.f10922d = rect;
        this.f10923e = z11;
        this.f10924f = z12;
        this.f10925g = z13;
        this.f10926h = scaleType;
        this.f10927i = z14;
    }

    /* renamed from: a */
    public final boolean m13310a() {
        return this.f10925g;
    }

    /* renamed from: b */
    public final boolean m13311b() {
        return this.f10924f;
    }

    /* renamed from: c */
    public final a m13312c() {
        return this.f10919a;
    }

    /* renamed from: d */
    public final Rect m13313d() {
        return this.f10922d;
    }

    /* renamed from: e */
    public final C13700o2.d m13314e() {
        return this.f10920b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2770a)) {
            return false;
        }
        C2770a c2770a = (C2770a) obj;
        return AbstractC19074t.m100204b(this.f10919a, c2770a.f10919a) && this.f10920b == c2770a.f10920b && this.f10921c == c2770a.f10921c && AbstractC19074t.m100204b(this.f10922d, c2770a.f10922d) && this.f10923e == c2770a.f10923e && this.f10924f == c2770a.f10924f && this.f10925g == c2770a.f10925g && this.f10926h == c2770a.f10926h && this.f10927i == c2770a.f10927i;
    }

    /* renamed from: f */
    public final int m13315f() {
        return this.f10921c;
    }

    /* renamed from: g */
    public final boolean m13316g() {
        return this.f10927i;
    }

    /* renamed from: h */
    public final boolean m13317h() {
        return this.f10923e;
    }

    public int hashCode() {
        a aVar = this.f10919a;
        int hashCode = (((((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f10920b.hashCode()) * 31) + this.f10921c) * 31;
        Rect rect = this.f10922d;
        return ((((((((((hashCode + (rect != null ? rect.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f10923e)) * 31) + AbstractC2144f.m11520a(this.f10924f)) * 31) + AbstractC2144f.m11520a(this.f10925g)) * 31) + this.f10926h.hashCode()) * 31) + AbstractC2144f.m11520a(this.f10927i);
    }

    public String toString() {
        return "CreateStickerContainerDrawerParams(parentViewCallback=" + this.f10919a + ", sizeType=" + this.f10920b + ", stickerFixedHeight=" + this.f10921c + ", rPadding=" + this.f10922d + ", isResetFrameWhenDone=" + this.f10923e + ", forcePNGListDecoder=" + this.f10924f + ", canPlayWebpFFS=" + this.f10925g + ", stickerRenderScaleType=" + this.f10926h + ", supportAIBadge=" + this.f10927i + ")";
    }

    public /* synthetic */ C2770a(a aVar, C13700o2.d dVar, int i11, Rect rect, boolean z11, boolean z12, boolean z13, ImageView.ScaleType scaleType, boolean z14, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? null : aVar, (i12 & 2) != 0 ? C13700o2.d.f70834p : dVar, (i12 & 4) != 0 ? -1 : i11, (i12 & 8) == 0 ? rect : null, (i12 & 16) != 0 ? true : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? C13700o2.Companion.m76549c() : scaleType, (i12 & 256) == 0 ? z14 : false);
    }
}

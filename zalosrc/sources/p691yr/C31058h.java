package p691yr;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.TextLocalization;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: yr.h */
/* loaded from: classes4.dex */
public final class C31058h {

    /* renamed from: a */
    private final int f143183a;

    /* renamed from: b */
    private final TextLocalization f143184b;

    /* renamed from: c */
    private final boolean f143185c;

    /* renamed from: d */
    private final String f143186d;

    /* renamed from: e */
    private final String f143187e;

    /* renamed from: f */
    private final NumberTheme f143188f;

    /* renamed from: g */
    private final NumberTheme f143189g;

    /* renamed from: h */
    private final NumberTheme f143190h;

    /* renamed from: i */
    private Bitmap f143191i;

    /* renamed from: j */
    private Drawable f143192j;

    public C31058h(int i11, TextLocalization textLocalization, boolean z11, String str, String str2, NumberTheme numberTheme, NumberTheme numberTheme2, NumberTheme numberTheme3, Bitmap bitmap, Drawable drawable) {
        AbstractC19074t.m100208f(textLocalization, "reactionText");
        AbstractC19074t.m100208f(str, "effectId");
        AbstractC19074t.m100208f(str2, "effectText");
        AbstractC19074t.m100208f(numberTheme, "backgroundColor");
        AbstractC19074t.m100208f(numberTheme2, "borderColor");
        AbstractC19074t.m100208f(numberTheme3, "textColor");
        this.f143183a = i11;
        this.f143184b = textLocalization;
        this.f143185c = z11;
        this.f143186d = str;
        this.f143187e = str2;
        this.f143188f = numberTheme;
        this.f143189g = numberTheme2;
        this.f143190h = numberTheme3;
        this.f143191i = bitmap;
        this.f143192j = drawable;
    }

    /* renamed from: b */
    public static /* synthetic */ C31058h m150890b(C31058h c31058h, int i11, TextLocalization textLocalization, boolean z11, String str, String str2, NumberTheme numberTheme, NumberTheme numberTheme2, NumberTheme numberTheme3, Bitmap bitmap, Drawable drawable, int i12, Object obj) {
        return c31058h.m150891a((i12 & 1) != 0 ? c31058h.f143183a : i11, (i12 & 2) != 0 ? c31058h.f143184b : textLocalization, (i12 & 4) != 0 ? c31058h.f143185c : z11, (i12 & 8) != 0 ? c31058h.f143186d : str, (i12 & 16) != 0 ? c31058h.f143187e : str2, (i12 & 32) != 0 ? c31058h.f143188f : numberTheme, (i12 & 64) != 0 ? c31058h.f143189g : numberTheme2, (i12 & 128) != 0 ? c31058h.f143190h : numberTheme3, (i12 & 256) != 0 ? c31058h.f143191i : bitmap, (i12 & 512) != 0 ? c31058h.f143192j : drawable);
    }

    /* renamed from: a */
    public final C31058h m150891a(int i11, TextLocalization textLocalization, boolean z11, String str, String str2, NumberTheme numberTheme, NumberTheme numberTheme2, NumberTheme numberTheme3, Bitmap bitmap, Drawable drawable) {
        AbstractC19074t.m100208f(textLocalization, "reactionText");
        AbstractC19074t.m100208f(str, "effectId");
        AbstractC19074t.m100208f(str2, "effectText");
        AbstractC19074t.m100208f(numberTheme, "backgroundColor");
        AbstractC19074t.m100208f(numberTheme2, "borderColor");
        AbstractC19074t.m100208f(numberTheme3, "textColor");
        return new C31058h(i11, textLocalization, z11, str, str2, numberTheme, numberTheme2, numberTheme3, bitmap, drawable);
    }

    /* renamed from: c */
    public final NumberTheme m150892c() {
        return this.f143188f;
    }

    /* renamed from: d */
    public final NumberTheme m150893d() {
        return this.f143189g;
    }

    /* renamed from: e */
    public final Bitmap m150894e() {
        return this.f143191i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31058h)) {
            return false;
        }
        C31058h c31058h = (C31058h) obj;
        return this.f143183a == c31058h.f143183a && AbstractC19074t.m100204b(this.f143184b, c31058h.f143184b) && this.f143185c == c31058h.f143185c && AbstractC19074t.m100204b(this.f143186d, c31058h.f143186d) && AbstractC19074t.m100204b(this.f143187e, c31058h.f143187e) && AbstractC19074t.m100204b(this.f143188f, c31058h.f143188f) && AbstractC19074t.m100204b(this.f143189g, c31058h.f143189g) && AbstractC19074t.m100204b(this.f143190h, c31058h.f143190h) && AbstractC19074t.m100204b(this.f143191i, c31058h.f143191i) && AbstractC19074t.m100204b(this.f143192j, c31058h.f143192j);
    }

    /* renamed from: f */
    public final Drawable m150895f() {
        return this.f143192j;
    }

    /* renamed from: g */
    public final String m150896g() {
        return this.f143186d;
    }

    /* renamed from: h */
    public final String m150897h() {
        return this.f143187e;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f143183a * 31) + this.f143184b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f143185c)) * 31) + this.f143186d.hashCode()) * 31) + this.f143187e.hashCode()) * 31) + this.f143188f.hashCode()) * 31) + this.f143189g.hashCode()) * 31) + this.f143190h.hashCode()) * 31;
        Bitmap bitmap = this.f143191i;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Drawable drawable = this.f143192j;
        return hashCode2 + (drawable != null ? drawable.hashCode() : 0);
    }

    /* renamed from: i */
    public final boolean m150898i() {
        return this.f143185c;
    }

    /* renamed from: j */
    public final int m150899j() {
        return this.f143183a;
    }

    /* renamed from: k */
    public final TextLocalization m150900k() {
        return this.f143184b;
    }

    /* renamed from: l */
    public final NumberTheme m150901l() {
        return this.f143190h;
    }

    /* renamed from: m */
    public final void m150902m(Bitmap bitmap) {
        this.f143191i = bitmap;
    }

    /* renamed from: n */
    public final void m150903n(Drawable drawable) {
        this.f143192j = drawable;
    }

    public String toString() {
        return "FeedReactionConfigInfo(reactionId=" + this.f143183a + ", reactionText=" + this.f143184b + ", enablePost=" + this.f143185c + ", effectId=" + this.f143186d + ", effectText=" + this.f143187e + ", backgroundColor=" + this.f143188f + ", borderColor=" + this.f143189g + ", textColor=" + this.f143190h + ", defaultThumb=" + this.f143191i + ", drawableForAnimation=" + this.f143192j + ")";
    }

    public /* synthetic */ C31058h(int i11, TextLocalization textLocalization, boolean z11, String str, String str2, NumberTheme numberTheme, NumberTheme numberTheme2, NumberTheme numberTheme3, Bitmap bitmap, Drawable drawable, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? TextLocalization.Companion.m44978a() : textLocalization, (i12 & 4) == 0 ? z11 : false, (i12 & 8) != 0 ? "" : str, (i12 & 16) == 0 ? str2 : "", (i12 & 32) != 0 ? NumberTheme.Companion.m44973a() : numberTheme, (i12 & 64) != 0 ? NumberTheme.Companion.m44973a() : numberTheme2, (i12 & 128) != 0 ? NumberTheme.Companion.m44973a() : numberTheme3, (i12 & 256) != 0 ? null : bitmap, (i12 & 512) == 0 ? drawable : null);
    }
}

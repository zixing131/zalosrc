package p615wn;

import android.text.SpannableString;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23059e9;

/* renamed from: wn.f */
/* loaded from: classes4.dex */
public final class C29110f {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final C29110f f134953c = new C29110f(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* renamed from: a */
    private final SpannableString f134954a;

    /* renamed from: b */
    private final SpannableString f134955b;

    /* renamed from: wn.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29110f(SpannableString spannableString, SpannableString spannableString2) {
        AbstractC19074t.m100208f(spannableString, "vi");
        AbstractC19074t.m100208f(spannableString2, "en");
        this.f134954a = spannableString;
        this.f134955b = spannableString2;
    }

    /* renamed from: a */
    public final SpannableString m145359a() {
        if (AbstractC23059e9.m118342u()) {
            return this.f134954a;
        }
        return this.f134955b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29110f)) {
            return false;
        }
        C29110f c29110f = (C29110f) obj;
        return AbstractC19074t.m100204b(this.f134954a, c29110f.f134954a) && AbstractC19074t.m100204b(this.f134955b, c29110f.f134955b);
    }

    public int hashCode() {
        return (this.f134954a.hashCode() * 31) + this.f134955b.hashCode();
    }

    public String toString() {
        return "SpannableTextLocalization(vi=" + ((Object) this.f134954a) + ", en=" + ((Object) this.f134955b) + ")";
    }

    public /* synthetic */ C29110f(SpannableString spannableString, SpannableString spannableString2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new SpannableString("") : spannableString, (i11 & 2) != 0 ? new SpannableString("") : spannableString2);
    }
}

package k50;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: k50.e */
/* loaded from: classes5.dex */
public final class C21477e {

    /* renamed from: a */
    private final String f104511a;

    /* renamed from: b */
    private String f104512b;

    /* renamed from: c */
    private long f104513c;

    /* renamed from: d */
    private int f104514d;

    public C21477e(String str, String str2, long j11, int i11) {
        AbstractC19074t.m100208f(str, "idSong");
        AbstractC19074t.m100208f(str2, "streamUrl");
        this.f104511a = str;
        this.f104512b = str2;
        this.f104513c = j11;
        this.f104514d = i11;
    }

    /* renamed from: a */
    public final int m111093a() {
        return this.f104514d;
    }

    /* renamed from: b */
    public final String m111094b() {
        return this.f104511a;
    }

    /* renamed from: c */
    public final String m111095c() {
        return this.f104512b;
    }

    /* renamed from: d */
    public final void m111096d(int i11) {
        this.f104514d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21477e)) {
            return false;
        }
        C21477e c21477e = (C21477e) obj;
        return AbstractC19074t.m100204b(this.f104511a, c21477e.f104511a) && AbstractC19074t.m100204b(this.f104512b, c21477e.f104512b) && this.f104513c == c21477e.f104513c && this.f104514d == c21477e.f104514d;
    }

    public int hashCode() {
        return (((((this.f104511a.hashCode() * 31) + this.f104512b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f104513c)) * 31) + this.f104514d;
    }

    public String toString() {
        return "RingtoneStreaming(idSong=" + this.f104511a + ", streamUrl=" + this.f104512b + ", timeStamp=" + this.f104513c + ", durationMillis=" + this.f104514d + ")";
    }

    public /* synthetic */ C21477e(String str, String str2, long j11, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) == 0 ? str2 : "", (i12 & 4) != 0 ? System.currentTimeMillis() : j11, (i12 & 8) != 0 ? 0 : i11);
    }
}

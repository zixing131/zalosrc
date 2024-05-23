package p258j7;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j7.f */
/* loaded from: classes3.dex */
public final class C20948f extends AbstractC20944d {

    /* renamed from: a */
    private final int f102840a;

    /* renamed from: b */
    private final int f102841b;

    /* renamed from: c */
    private final int f102842c;

    /* renamed from: d */
    private final long f102843d;

    /* renamed from: e */
    private final long f102844e;

    /* renamed from: f */
    private final List f102845f;

    /* renamed from: g */
    private final List f102846g;

    /* renamed from: h */
    private final PendingIntent f102847h;

    /* renamed from: i */
    private final List f102848i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20948f(int i11, int i12, int i13, long j11, long j12, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f102840a = i11;
        this.f102841b = i12;
        this.f102842c = i13;
        this.f102843d = j11;
        this.f102844e = j12;
        this.f102845f = list;
        this.f102846g = list2;
        this.f102847h = pendingIntent;
        this.f102848i = list3;
    }

    @Override // p258j7.AbstractC20944d
    /* renamed from: a */
    public final long mo109479a() {
        return this.f102843d;
    }

    @Override // p258j7.AbstractC20944d
    /* renamed from: c */
    public final int mo109480c() {
        return this.f102842c;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC20944d) {
            AbstractC20944d abstractC20944d = (AbstractC20944d) obj;
            if (this.f102840a == abstractC20944d.mo109485h() && this.f102841b == abstractC20944d.mo109486i() && this.f102842c == abstractC20944d.mo109480c() && this.f102843d == abstractC20944d.mo109479a() && this.f102844e == abstractC20944d.mo109487j() && ((list = this.f102845f) != null ? list.equals(abstractC20944d.mo109489l()) : abstractC20944d.mo109489l() == null) && ((list2 = this.f102846g) != null ? list2.equals(abstractC20944d.mo109488k()) : abstractC20944d.mo109488k() == null) && ((pendingIntent = this.f102847h) != null ? pendingIntent.equals(abstractC20944d.mo109484g()) : abstractC20944d.mo109484g() == null) && ((list3 = this.f102848i) != null ? list3.equals(abstractC20944d.mo109490m()) : abstractC20944d.mo109490m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p258j7.AbstractC20944d
    /* renamed from: g */
    public final PendingIntent mo109484g() {
        return this.f102847h;
    }

    @Override // p258j7.AbstractC20944d
    /* renamed from: h */
    public final int mo109485h() {
        return this.f102840a;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i11 = ((((this.f102840a ^ 1000003) * 1000003) ^ this.f102841b) * 1000003) ^ this.f102842c;
        long j11 = this.f102843d;
        long j12 = j11 ^ (j11 >>> 32);
        long j13 = this.f102844e;
        long j14 = (j13 >>> 32) ^ j13;
        List list = this.f102845f;
        int i12 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i13 = ((((((i11 * 1000003) ^ ((int) j12)) * 1000003) ^ ((int) j14)) * 1000003) ^ hashCode) * 1000003;
        List list2 = this.f102846g;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i14 = (i13 ^ hashCode2) * 1000003;
        PendingIntent pendingIntent = this.f102847h;
        if (pendingIntent == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = pendingIntent.hashCode();
        }
        int i15 = (i14 ^ hashCode3) * 1000003;
        List list3 = this.f102848i;
        if (list3 != null) {
            i12 = list3.hashCode();
        }
        return i15 ^ i12;
    }

    @Override // p258j7.AbstractC20944d
    /* renamed from: i */
    public final int mo109486i() {
        return this.f102841b;
    }

    @Override // p258j7.AbstractC20944d
    /* renamed from: j */
    public final long mo109487j() {
        return this.f102844e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p258j7.AbstractC20944d
    /* renamed from: k */
    public final List mo109488k() {
        return this.f102846g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p258j7.AbstractC20944d
    /* renamed from: l */
    public final List mo109489l() {
        return this.f102845f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p258j7.AbstractC20944d
    /* renamed from: m */
    public final List mo109490m() {
        return this.f102848i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f102840a + ", status=" + this.f102841b + ", errorCode=" + this.f102842c + ", bytesDownloaded=" + this.f102843d + ", totalBytesToDownload=" + this.f102844e + ", moduleNamesNullable=" + String.valueOf(this.f102845f) + ", languagesNullable=" + String.valueOf(this.f102846g) + ", resolutionIntent=" + String.valueOf(this.f102847h) + ", splitFileIntents=" + String.valueOf(this.f102848i) + "}";
    }
}

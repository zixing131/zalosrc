package p280jx;

import p220hx.AbstractC20163a;

/* renamed from: jx.d */
/* loaded from: classes4.dex */
public class C21379d extends AbstractC20163a {

    /* renamed from: p */
    public long f104262p;

    /* renamed from: q */
    public long f104263q;

    /* renamed from: r */
    public long f104264r;

    /* renamed from: s */
    public long f104265s;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C21379d c21379d = (C21379d) obj;
        if (this.f104262p == c21379d.f104262p && this.f104263q == c21379d.f104263q && this.f104264r == c21379d.f104264r && this.f104265s == c21379d.f104265s) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f104262p;
        long j12 = this.f104263q;
        int i11 = ((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f104264r;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f104265s;
        return i12 + ((int) (j14 ^ (j14 >>> 32)));
    }

    public String toString() {
        return "NetworkMetrics{mobileBytesTx=" + this.f104262p + ", mobileBytesRx=" + this.f104263q + ", wifiBytesTx=" + this.f104264r + ", wifiBytesRx=" + this.f104265s + '}';
    }
}

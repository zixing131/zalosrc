package androidx.media;

import java.util.Arrays;

/* loaded from: classes2.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f7455a = 0;

    /* renamed from: b */
    int f7456b = 0;

    /* renamed from: c */
    int f7457c = 0;

    /* renamed from: d */
    int f7458d = -1;

    /* renamed from: a */
    public int m9445a() {
        return this.f7456b;
    }

    /* renamed from: b */
    public int m9446b() {
        int i11 = this.f7457c;
        int m9447c = m9447c();
        if (m9447c == 6) {
            i11 |= 4;
        } else if (m9447c == 7) {
            i11 |= 1;
        }
        return i11 & 273;
    }

    /* renamed from: c */
    public int m9447c() {
        int i11 = this.f7458d;
        if (i11 != -1) {
            return i11;
        }
        return AudioAttributesCompat.m9443a(false, this.f7457c, this.f7455a);
    }

    /* renamed from: d */
    public int m9448d() {
        return this.f7455a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f7456b != audioAttributesImplBase.m9445a() || this.f7457c != audioAttributesImplBase.m9446b() || this.f7455a != audioAttributesImplBase.m9448d() || this.f7458d != audioAttributesImplBase.f7458d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7456b), Integer.valueOf(this.f7457c), Integer.valueOf(this.f7455a), Integer.valueOf(this.f7458d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f7458d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f7458d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.m9444b(this.f7455a));
        sb2.append(" content=");
        sb2.append(this.f7456b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f7457c).toUpperCase());
        return sb2.toString();
    }
}

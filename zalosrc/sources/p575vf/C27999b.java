package p575vf;

/* renamed from: vf.b */
/* loaded from: classes3.dex */
public class C27999b {

    /* renamed from: a */
    public final int f130581a;

    /* renamed from: b */
    public final int f130582b;

    /* renamed from: c */
    public final int f130583c;

    public C27999b(int i11, int i12, int i13) {
        this.f130581a = i11;
        this.f130582b = i12;
        this.f130583c = i13;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C27999b)) {
            return false;
        }
        C27999b c27999b = (C27999b) obj;
        if (this.f130581a != c27999b.f130581a || this.f130582b != c27999b.f130582b || this.f130583c != c27999b.f130583c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f130583c & 255) << 24) | ((this.f130581a & 4095) << 12) | (this.f130582b & 4095);
    }

    public String toString() {
        return "FrameBufferKey{width=" + this.f130581a + ", height=" + this.f130582b + ", threadId=" + this.f130583c + '}';
    }
}

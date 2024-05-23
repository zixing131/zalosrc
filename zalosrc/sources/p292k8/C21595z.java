package p292k8;

import p292k8.AbstractC21573d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k8.z */
/* loaded from: classes.dex */
public final class C21595z extends AbstractC21573d0.b {

    /* renamed from: a */
    private final int f104935a;

    /* renamed from: b */
    private final String f104936b;

    /* renamed from: c */
    private final int f104937c;

    /* renamed from: d */
    private final long f104938d;

    /* renamed from: e */
    private final long f104939e;

    /* renamed from: f */
    private final boolean f104940f;

    /* renamed from: g */
    private final int f104941g;

    /* renamed from: h */
    private final String f104942h;

    /* renamed from: i */
    private final String f104943i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21595z(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
        this.f104935a = i11;
        if (str != null) {
            this.f104936b = str;
            this.f104937c = i12;
            this.f104938d = j11;
            this.f104939e = j12;
            this.f104940f = z11;
            this.f104941g = i13;
            if (str2 != null) {
                this.f104942h = str2;
                if (str3 != null) {
                    this.f104943i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // p292k8.AbstractC21573d0.b
    /* renamed from: a */
    public int mo111509a() {
        return this.f104935a;
    }

    @Override // p292k8.AbstractC21573d0.b
    /* renamed from: b */
    public int mo111510b() {
        return this.f104937c;
    }

    @Override // p292k8.AbstractC21573d0.b
    /* renamed from: d */
    public long mo111511d() {
        return this.f104939e;
    }

    @Override // p292k8.AbstractC21573d0.b
    /* renamed from: e */
    public boolean mo111512e() {
        return this.f104940f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21573d0.b)) {
            return false;
        }
        AbstractC21573d0.b bVar = (AbstractC21573d0.b) obj;
        if (this.f104935a == bVar.mo111509a() && this.f104936b.equals(bVar.mo111514g()) && this.f104937c == bVar.mo111510b() && this.f104938d == bVar.mo111517j() && this.f104939e == bVar.mo111511d() && this.f104940f == bVar.mo111512e() && this.f104941g == bVar.mo111516i() && this.f104942h.equals(bVar.mo111513f()) && this.f104943i.equals(bVar.mo111515h())) {
            return true;
        }
        return false;
    }

    @Override // p292k8.AbstractC21573d0.b
    /* renamed from: f */
    public String mo111513f() {
        return this.f104942h;
    }

    @Override // p292k8.AbstractC21573d0.b
    /* renamed from: g */
    public String mo111514g() {
        return this.f104936b;
    }

    @Override // p292k8.AbstractC21573d0.b
    /* renamed from: h */
    public String mo111515h() {
        return this.f104943i;
    }

    public int hashCode() {
        int i11;
        int hashCode = (((((this.f104935a ^ 1000003) * 1000003) ^ this.f104936b.hashCode()) * 1000003) ^ this.f104937c) * 1000003;
        long j11 = this.f104938d;
        int i12 = (hashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f104939e;
        int i13 = (i12 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        if (this.f104940f) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return ((((((i13 ^ i11) * 1000003) ^ this.f104941g) * 1000003) ^ this.f104942h.hashCode()) * 1000003) ^ this.f104943i.hashCode();
    }

    @Override // p292k8.AbstractC21573d0.b
    /* renamed from: i */
    public int mo111516i() {
        return this.f104941g;
    }

    @Override // p292k8.AbstractC21573d0.b
    /* renamed from: j */
    public long mo111517j() {
        return this.f104938d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f104935a + ", model=" + this.f104936b + ", availableProcessors=" + this.f104937c + ", totalRam=" + this.f104938d + ", diskSpace=" + this.f104939e + ", isEmulator=" + this.f104940f + ", state=" + this.f104941g + ", manufacturer=" + this.f104942h + ", modelClass=" + this.f104943i + "}";
    }
}

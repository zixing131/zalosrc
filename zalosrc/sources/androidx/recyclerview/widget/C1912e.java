package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes2.dex */
public class C1912e implements InterfaceC1926s {

    /* renamed from: a */
    final InterfaceC1926s f7995a;

    /* renamed from: b */
    int f7996b = 0;

    /* renamed from: c */
    int f7997c = -1;

    /* renamed from: d */
    int f7998d = -1;

    /* renamed from: e */
    Object f7999e = null;

    public C1912e(InterfaceC1926s interfaceC1926s) {
        this.f7995a = interfaceC1926s;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1926s
    /* renamed from: a */
    public void mo10406a(int i11, int i12) {
        int i13;
        if (this.f7996b == 1 && i11 >= (i13 = this.f7997c)) {
            int i14 = this.f7998d;
            if (i11 <= i13 + i14) {
                this.f7998d = i14 + i12;
                this.f7997c = Math.min(i11, i13);
                return;
            }
        }
        m10449e();
        this.f7997c = i11;
        this.f7998d = i12;
        this.f7996b = 1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1926s
    /* renamed from: b */
    public void mo10407b(int i11, int i12) {
        int i13;
        if (this.f7996b == 2 && (i13 = this.f7997c) >= i11 && i13 <= i11 + i12) {
            this.f7998d += i12;
            this.f7997c = i11;
        } else {
            m10449e();
            this.f7997c = i11;
            this.f7998d = i12;
            this.f7996b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC1926s
    /* renamed from: c */
    public void mo10408c(int i11, int i12, Object obj) {
        int i13;
        if (this.f7996b == 3) {
            int i14 = this.f7997c;
            int i15 = this.f7998d;
            if (i11 <= i14 + i15 && (i13 = i11 + i12) >= i14 && this.f7999e == obj) {
                this.f7997c = Math.min(i11, i14);
                this.f7998d = Math.max(i15 + i14, i13) - this.f7997c;
                return;
            }
        }
        m10449e();
        this.f7997c = i11;
        this.f7998d = i12;
        this.f7999e = obj;
        this.f7996b = 3;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1926s
    /* renamed from: d */
    public void mo10409d(int i11, int i12) {
        m10449e();
        this.f7995a.mo10409d(i11, i12);
    }

    /* renamed from: e */
    public void m10449e() {
        int i11 = this.f7996b;
        if (i11 == 0) {
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f7995a.mo10408c(this.f7997c, this.f7998d, this.f7999e);
                }
            } else {
                this.f7995a.mo10407b(this.f7997c, this.f7998d);
            }
        } else {
            this.f7995a.mo10406a(this.f7997c, this.f7998d);
        }
        this.f7999e = null;
        this.f7996b = 0;
    }
}

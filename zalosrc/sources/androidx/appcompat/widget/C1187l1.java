package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.l1 */
/* loaded from: classes2.dex */
class C1187l1 {

    /* renamed from: a */
    private int f4660a = 0;

    /* renamed from: b */
    private int f4661b = 0;

    /* renamed from: c */
    private int f4662c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f4663d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f4664e = 0;

    /* renamed from: f */
    private int f4665f = 0;

    /* renamed from: g */
    private boolean f4666g = false;

    /* renamed from: h */
    private boolean f4667h = false;

    /* renamed from: a */
    public int m5609a() {
        return this.f4666g ? this.f4660a : this.f4661b;
    }

    /* renamed from: b */
    public int m5610b() {
        return this.f4660a;
    }

    /* renamed from: c */
    public int m5611c() {
        return this.f4661b;
    }

    /* renamed from: d */
    public int m5612d() {
        return this.f4666g ? this.f4661b : this.f4660a;
    }

    /* renamed from: e */
    public void m5613e(int i11, int i12) {
        this.f4667h = false;
        if (i11 != Integer.MIN_VALUE) {
            this.f4664e = i11;
            this.f4660a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f4665f = i12;
            this.f4661b = i12;
        }
    }

    /* renamed from: f */
    public void m5614f(boolean z11) {
        if (z11 == this.f4666g) {
            return;
        }
        this.f4666g = z11;
        if (!this.f4667h) {
            this.f4660a = this.f4664e;
            this.f4661b = this.f4665f;
            return;
        }
        if (z11) {
            int i11 = this.f4663d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f4664e;
            }
            this.f4660a = i11;
            int i12 = this.f4662c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = this.f4665f;
            }
            this.f4661b = i12;
            return;
        }
        int i13 = this.f4662c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f4664e;
        }
        this.f4660a = i13;
        int i14 = this.f4663d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = this.f4665f;
        }
        this.f4661b = i14;
    }

    /* renamed from: g */
    public void m5615g(int i11, int i12) {
        this.f4662c = i11;
        this.f4663d = i12;
        this.f4667h = true;
        if (this.f4666g) {
            if (i12 != Integer.MIN_VALUE) {
                this.f4660a = i12;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f4661b = i11;
                return;
            }
            return;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f4660a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f4661b = i12;
        }
    }
}

package p361nb;

/* renamed from: nb.o */
/* loaded from: classes3.dex */
public class C23658o extends C23669z {

    /* renamed from: i */
    private long f114611i;

    /* renamed from: j */
    private int f114612j;

    /* renamed from: k */
    private String f114613k;

    /* renamed from: l */
    private int f114614l;

    public C23658o() {
        m123981i();
    }

    /* renamed from: g */
    public static C23658o m123979g(int i11, int i12, int i13, String str) {
        C23658o c23658o = new C23658o();
        c23658o.f114655b = 1;
        c23658o.f114657d = i11;
        c23658o.f114614l = i12;
        c23658o.f114612j = i13;
        c23658o.f114613k = str;
        return c23658o;
    }

    /* renamed from: h */
    public static C23658o m123980h(int i11, long j11, int i12, String str) {
        C23658o c23658o = new C23658o();
        c23658o.f114655b = 0;
        c23658o.f114657d = i11;
        c23658o.f114611i = j11;
        c23658o.f114612j = i12;
        c23658o.f114613k = str;
        return c23658o;
    }

    /* renamed from: i */
    private void m123981i() {
        this.f114654a = 10;
        this.f114658e = 3;
        this.f114659f = new String[3];
    }

    @Override // p361nb.C23669z
    /* renamed from: c */
    public void mo123889c() {
        super.mo123889c();
        int i11 = this.f114655b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f114614l = Integer.parseInt(this.f114659f[0]);
                this.f114612j = Integer.parseInt(this.f114659f[1]);
                this.f114613k = this.f114659f[2];
                return;
            }
            return;
        }
        this.f114611i = Long.parseLong(this.f114659f[0]);
        this.f114612j = Integer.parseInt(this.f114659f[1]);
        this.f114613k = this.f114659f[2];
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        String[] strArr = new String[this.f114658e];
        this.f114659f = strArr;
        int i11 = this.f114655b;
        if (i11 != 0) {
            if (i11 == 1) {
                strArr[0] = String.valueOf(this.f114614l);
                this.f114659f[1] = String.valueOf(this.f114612j);
                this.f114659f[2] = this.f114613k;
                return;
            }
            return;
        }
        strArr[0] = String.valueOf(this.f114611i);
        this.f114659f[1] = String.valueOf(this.f114612j);
        this.f114659f[2] = this.f114613k;
    }
}

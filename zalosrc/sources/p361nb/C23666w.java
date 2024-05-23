package p361nb;

/* renamed from: nb.w */
/* loaded from: classes3.dex */
public class C23666w extends C23669z {

    /* renamed from: i */
    public long f114644i;

    /* renamed from: j */
    public int f114645j;

    /* renamed from: k */
    public int f114646k;

    /* renamed from: l */
    public long f114647l;

    public C23666w() {
        this.f114644i = 0L;
        this.f114647l = 0L;
        this.f114658e = 4;
        this.f114659f = new String[4];
        this.f114654a = 4;
    }

    @Override // p361nb.C23669z
    /* renamed from: c */
    public void mo123889c() {
        super.mo123889c();
        this.f114644i = 0L;
        this.f114645j = 0;
        this.f114646k = 0;
        this.f114647l = 0L;
        this.f114644i = Long.parseLong(this.f114659f[0]);
        this.f114645j = Integer.parseInt(this.f114659f[1]);
        this.f114646k = Integer.parseInt(this.f114659f[2]);
        this.f114647l = Long.parseLong(this.f114659f[3]);
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        String[] strArr = new String[this.f114658e];
        this.f114659f = strArr;
        strArr[0] = String.valueOf(this.f114644i);
        this.f114659f[1] = String.valueOf(this.f114645j);
        this.f114659f[2] = String.valueOf(this.f114646k);
        this.f114659f[3] = String.valueOf(this.f114647l);
    }

    public C23666w(long j11, int i11, int i12, long j12, int i13) {
        this.f114644i = j11;
        this.f114645j = i11;
        this.f114646k = i12;
        this.f114647l = j12;
        this.f114657d = i13;
        this.f114658e = 4;
        this.f114659f = new String[4];
    }
}

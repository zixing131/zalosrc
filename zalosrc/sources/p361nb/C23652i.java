package p361nb;

/* renamed from: nb.i */
/* loaded from: classes3.dex */
public class C23652i extends C23669z {

    /* renamed from: i */
    public int f114590i;

    /* renamed from: j */
    public int f114591j;

    /* renamed from: k */
    public int f114592k;

    public C23652i() {
        this.f114658e = 3;
        this.f114654a = 9;
        this.f114659f = new String[3];
    }

    @Override // p361nb.C23669z
    /* renamed from: c */
    public void mo123889c() {
        super.mo123889c();
        this.f114590i = Integer.parseInt(this.f114659f[0]);
        this.f114591j = Integer.parseInt(this.f114659f[1]);
        this.f114592k = Integer.parseInt(this.f114659f[2]);
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        String[] strArr = new String[this.f114658e];
        this.f114659f = strArr;
        strArr[0] = String.valueOf(this.f114590i);
        this.f114659f[1] = String.valueOf(this.f114591j);
        this.f114659f[2] = String.valueOf(this.f114592k);
    }
}

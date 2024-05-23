package p361nb;

/* renamed from: nb.r */
/* loaded from: classes3.dex */
public class C23661r extends C23669z {

    /* renamed from: i */
    public String f114617i;

    /* renamed from: j */
    public int f114618j;

    /* renamed from: k */
    public String f114619k;

    /* renamed from: l */
    public String f114620l;

    public C23661r(int i11, int i12, String str, int i13, String str2, String str3) {
        this.f114655b = i11;
        this.f114657d = i12;
        this.f114617i = str;
        this.f114618j = i13;
        this.f114619k = str2;
        this.f114620l = str3;
        this.f114658e = 4;
        this.f114659f = new String[4];
    }

    @Override // p361nb.C23669z
    /* renamed from: c */
    public void mo123889c() {
        super.mo123889c();
        this.f114618j = 0;
        this.f114619k = "";
        this.f114620l = "";
        String[] strArr = this.f114659f;
        this.f114617i = strArr[0];
        this.f114618j = Integer.parseInt(strArr[1]);
        String[] strArr2 = this.f114659f;
        this.f114619k = strArr2[2];
        this.f114620l = strArr2[3];
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        String[] strArr = new String[this.f114658e];
        this.f114659f = strArr;
        strArr[0] = this.f114617i;
        strArr[1] = String.valueOf(this.f114618j);
        String[] strArr2 = this.f114659f;
        strArr2[2] = this.f114619k;
        strArr2[3] = this.f114620l;
    }

    public C23661r() {
        this.f114658e = 4;
        this.f114654a = 7;
        this.f114659f = new String[4];
    }
}

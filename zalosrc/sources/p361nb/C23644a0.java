package p361nb;

import com.zing.zalocore.CoreUtility;
import im0.AbstractC20626a;

/* renamed from: nb.a0 */
/* loaded from: classes3.dex */
public class C23644a0 extends C23669z {

    /* renamed from: i */
    public String f114540i;

    /* renamed from: j */
    public String f114541j;

    /* renamed from: k */
    public String f114542k;

    /* renamed from: l */
    public String f114543l;

    /* renamed from: m */
    public String f114544m;

    /* renamed from: n */
    public int f114545n;

    /* renamed from: o */
    public int f114546o;

    public C23644a0() {
        this.f114540i = "";
        this.f114541j = "";
        this.f114542k = "";
        this.f114543l = "";
        this.f114544m = "";
        this.f114545n = 0;
        this.f114658e = 6;
        this.f114659f = new String[6];
        this.f114654a = 5;
    }

    @Override // p361nb.C23669z
    /* renamed from: c */
    public void mo123889c() {
        super.mo123889c();
        this.f114546o = 0;
        String[] strArr = this.f114659f;
        this.f114540i = strArr[0];
        this.f114541j = strArr[1];
        this.f114542k = strArr[2];
        this.f114543l = strArr[3];
        this.f114544m = strArr[4];
        this.f114546o = Integer.parseInt(strArr[5]);
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        String[] strArr = new String[this.f114658e];
        this.f114659f = strArr;
        strArr[0] = this.f114540i;
        strArr[1] = this.f114541j;
        strArr[2] = this.f114542k;
        strArr[3] = this.f114543l;
        strArr[4] = this.f114544m;
        strArr[5] = String.valueOf(this.f114546o);
    }

    public C23644a0(String str, String str2, String str3, String str4, String str5) {
        this.f114545n = 0;
        this.f114540i = str;
        this.f114541j = str2;
        this.f114542k = str3;
        this.f114543l = str4;
        this.f114544m = str5;
        this.f114546o = AbstractC20626a.m107394j(CoreUtility.getAppContext()) ? 1 : 0;
        this.f114658e = 6;
        this.f114659f = new String[6];
    }
}

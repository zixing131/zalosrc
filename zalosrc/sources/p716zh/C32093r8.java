package p716zh;

import java.util.ArrayList;

/* renamed from: zh.r8 */
/* loaded from: classes3.dex */
public class C32093r8 {

    /* renamed from: a */
    public String f147884a;

    /* renamed from: b */
    public long f147885b;

    /* renamed from: c */
    public int f147886c;

    /* renamed from: d */
    public String f147887d;

    /* renamed from: e */
    public long f147888e;

    /* renamed from: f */
    public long f147889f;

    /* renamed from: g */
    public float f147890g;

    /* renamed from: h */
    public int f147891h;

    /* renamed from: i */
    public int f147892i;

    /* renamed from: j */
    public ArrayList f147893j;

    public C32093r8() {
        this.f147888e = 0L;
        this.f147889f = 0L;
        this.f147890g = 0.0f;
        this.f147891h = -1;
        this.f147892i = 1;
        this.f147893j = new ArrayList();
    }

    public String toString() {
        return "RecentClickObject{uid='" + this.f147884a + "', timestamp=" + this.f147885b + ", clickCount=" + this.f147886c + ", typeBonus=" + this.f147892i + ", dpn='" + this.f147887d + "'}";
    }

    public C32093r8(String str, int i11, long j11) {
        this.f147888e = 0L;
        this.f147889f = 0L;
        this.f147890g = 0.0f;
        this.f147891h = -1;
        this.f147892i = 1;
        this.f147893j = new ArrayList();
        this.f147884a = str;
        this.f147886c = i11;
        this.f147885b = j11;
    }

    public C32093r8(String str, int i11, String str2, ArrayList arrayList, int i12) {
        this.f147888e = 0L;
        this.f147889f = 0L;
        this.f147890g = 0.0f;
        this.f147891h = -1;
        this.f147892i = 1;
        this.f147893j = new ArrayList();
        this.f147884a = str;
        this.f147886c = i11;
        this.f147887d = str2;
        this.f147893j = new ArrayList(arrayList);
        this.f147892i = i12;
    }
}

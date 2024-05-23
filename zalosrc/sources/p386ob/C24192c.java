package p386ob;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p361nb.C23669z;

/* renamed from: ob.c */
/* loaded from: classes3.dex */
public final class C24192c extends C23669z {
    public static final a Companion = new a(null);

    /* renamed from: i */
    private boolean f116763i;

    /* renamed from: j */
    private String f116764j;

    /* renamed from: ob.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24192c() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        String str;
        super.mo123890f();
        String[] strArr = new String[this.f114658e];
        this.f114659f = strArr;
        if (this.f116763i) {
            str = "2";
        } else {
            str = "1";
        }
        strArr[0] = str;
        strArr[1] = this.f116764j;
    }

    public /* synthetic */ C24192c(boolean z11, String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? "" : str);
    }

    public C24192c(boolean z11, String str) {
        AbstractC19074t.m100208f(str, "uploadInfo");
        this.f116763i = z11;
        this.f116764j = str;
        this.f114654a = 14;
        this.f114657d = 0;
        this.f114655b = 0;
        this.f114658e = 2;
        String[] strArr = new String[2];
        for (int i11 = 0; i11 < 2; i11++) {
            strArr[i11] = "";
        }
        this.f114659f = strArr;
    }
}

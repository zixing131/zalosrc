package p361nb;

import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.HashMap;

/* renamed from: nb.e */
/* loaded from: classes3.dex */
public final class C23648e extends C23669z {
    public static final a Companion;

    /* renamed from: p */
    private static final int[] f114561p;

    /* renamed from: q */
    private static String f114562q;

    /* renamed from: i */
    private String f114563i;

    /* renamed from: j */
    private String f114564j;

    /* renamed from: k */
    private int f114565k;

    /* renamed from: l */
    private String f114566l;

    /* renamed from: m */
    private long f114567m;

    /* renamed from: n */
    private String[] f114568n;

    /* renamed from: o */
    private int f114569o;

    /* renamed from: nb.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23648e m123929a() {
            return new C23648e(null);
        }

        /* renamed from: b */
        public final String m123930b() {
            return C23648e.f114562q;
        }

        /* renamed from: c */
        public final void m123931c() {
            if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                m123932d(System.currentTimeMillis() + "_" + CoreUtility.f89233i);
                AbstractC20110a.f98889a.mo104548a("ActionLogV2 SESSION_ID=" + m123930b(), new Object[0]);
            }
        }

        /* renamed from: d */
        public final void m123932d(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            C23648e.f114562q = str;
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        f114561p = new int[]{4};
        f114562q = "";
        aVar.m123931c();
    }

    public /* synthetic */ C23648e(AbstractC19060k abstractC19060k) {
        this();
    }

    @Override // p361nb.C23669z
    /* renamed from: c */
    public void mo123889c() {
        super.mo123889c();
        String[] strArr = this.f114659f;
        this.f114563i = strArr[0];
        this.f114564j = strArr[1];
        String str = strArr[2];
        AbstractC19074t.m100207e(str, "get(...)");
        this.f114565k = Integer.parseInt(str);
        String[] strArr2 = this.f114659f;
        this.f114566l = strArr2[3];
        String str2 = strArr2[4];
        AbstractC19074t.m100207e(str2, "get(...)");
        this.f114567m = Long.parseLong(str2);
        int i11 = this.f114658e;
        if (i11 > 5) {
            System.arraycopy(this.f114659f, 5, this.f114568n, 0, i11 - 5);
        }
    }

    @Override // p361nb.C23669z
    /* renamed from: d */
    public String mo123915d() {
        StringBuffer stringBuffer = new StringBuffer(1024);
        stringBuffer.append("\n");
        stringBuffer.append(this.f114656c);
        stringBuffer.append("\t");
        stringBuffer.append(this.f114654a);
        stringBuffer.append("\t");
        stringBuffer.append(this.f114655b);
        stringBuffer.append("\t");
        stringBuffer.append(this.f114657d);
        if (this.f114659f != null) {
            HashMap hashMap = new HashMap();
            for (int i11 : f114561p) {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf(i11));
            }
            int length = this.f114659f.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (!hashMap.containsKey(Integer.valueOf(i12)) && this.f114659f[i12] != null) {
                    stringBuffer.append("\t");
                    stringBuffer.append(this.f114659f[i12]);
                }
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        AbstractC19074t.m100207e(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        String[] strArr = new String[this.f114658e];
        this.f114659f = strArr;
        strArr[0] = this.f114563i;
        strArr[1] = this.f114564j;
        strArr[2] = String.valueOf(this.f114565k);
        this.f114659f[3] = String.valueOf(this.f114566l);
        this.f114659f[4] = String.valueOf(this.f114567m);
        int i11 = this.f114569o;
        if (i11 >= 0) {
            System.arraycopy(this.f114568n, 0, this.f114659f, 5, i11);
        }
    }

    /* renamed from: i */
    public final String m123916i() {
        return this.f114564j;
    }

    /* renamed from: j */
    public final int m123917j() {
        return this.f114565k;
    }

    /* renamed from: k */
    public final String m123918k() {
        return this.f114563i;
    }

    /* renamed from: l */
    public final String[] m123919l() {
        return this.f114568n;
    }

    /* renamed from: m */
    public final String m123920m() {
        return this.f114566l;
    }

    /* renamed from: n */
    public final long m123921n() {
        return this.f114567m;
    }

    /* renamed from: o */
    public final void m123922o(int i11) {
        this.f114565k = i11;
    }

    /* renamed from: p */
    public final C23648e m123923p(String str) {
        this.f114564j = str;
        return this;
    }

    /* renamed from: q */
    public final C23648e m123924q(int i11) {
        this.f114655b = i11;
        return this;
    }

    /* renamed from: r */
    public final C23648e m123925r(String str) {
        this.f114563i = str;
        return this;
    }

    /* renamed from: s */
    public final C23648e m123926s(String... strArr) {
        AbstractC19074t.m100208f(strArr, "params");
        this.f114658e = 10;
        this.f114659f = new String[10];
        this.f114569o = 5;
        this.f114568n = new String[5];
        System.arraycopy(strArr, 0, this.f114568n, 0, Math.min(5, strArr.length));
        return this;
    }

    /* renamed from: t */
    public final C23648e m123927t(int i11) {
        this.f114657d = i11;
        return this;
    }

    /* renamed from: u */
    public final void m123928u(long j11) {
        this.f114567m = j11;
    }

    private C23648e() {
        this.f114654a = 13;
        this.f114658e = 10;
        this.f114659f = new String[10];
        this.f114569o = 5;
        this.f114568n = new String[5];
        this.f114566l = f114562q;
    }

    public C23648e(int i11, String str, int i12, String str2, String... strArr) {
        AbstractC19074t.m100208f(strArr, "params");
        this.f114654a = 13;
        this.f114655b = i12;
        this.f114657d = i11;
        this.f114658e = 10;
        this.f114659f = new String[10];
        this.f114569o = 5;
        this.f114568n = new String[5];
        System.arraycopy(strArr, 0, this.f114568n, 0, Math.min(5, strArr.length));
        this.f114563i = str;
        this.f114564j = str2;
        this.f114566l = f114562q;
        this.f114565k = 0;
        this.f114567m = 0L;
    }
}

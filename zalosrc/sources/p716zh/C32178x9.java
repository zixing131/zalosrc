package p716zh;

import ai.InterfaceC0864d;
import ai.InterfaceC0865e;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zalocloud.configs.C16805b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.C23024b7;
import p348mi.AbstractC23306f;

/* renamed from: zh.x9 */
/* loaded from: classes3.dex */
public class C32178x9 implements InterfaceC0865e, InterfaceC0864d {

    /* renamed from: K */
    public static Comparator f148371K = new Comparator() { // from class: zh.w9
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m155172k;
            m155172k = C32178x9.m155172k((C32178x9) obj, (C32178x9) obj2);
            return m155172k;
        }
    };

    /* renamed from: A */
    public String f148372A;

    /* renamed from: B */
    public int f148373B;

    /* renamed from: C */
    public String f148374C;

    /* renamed from: D */
    public float f148375D;

    /* renamed from: E */
    public Map f148376E;

    /* renamed from: F */
    public ArrayList f148377F;

    /* renamed from: G */
    public boolean f148378G;

    /* renamed from: H */
    public boolean f148379H;

    /* renamed from: I */
    public boolean f148380I;

    /* renamed from: J */
    public boolean f148381J;

    /* renamed from: p */
    private final String f148382p;

    /* renamed from: q */
    public int f148383q;

    /* renamed from: r */
    public final int f148384r;

    /* renamed from: s */
    public String f148385s;

    /* renamed from: t */
    public String f148386t;

    /* renamed from: u */
    public String f148387u;

    /* renamed from: v */
    public int f148388v;

    /* renamed from: w */
    public int f148389w;

    /* renamed from: x */
    public int f148390x;

    /* renamed from: y */
    public boolean f148391y;

    /* renamed from: z */
    public int f148392z;

    public C32178x9(int i11, int i12, int i13, int i14, int i15, boolean z11, int i16) {
        this.f148385s = "";
        this.f148386t = "";
        this.f148387u = "";
        this.f148389w = 0;
        this.f148390x = 0;
        this.f148392z = 0;
        this.f148373B = 4;
        this.f148374C = "";
        this.f148375D = 0.0f;
        this.f148376E = new HashMap();
        this.f148377F = new ArrayList();
        this.f148378G = false;
        this.f148379H = false;
        this.f148380I = false;
        this.f148381J = false;
        this.f148383q = i11;
        this.f148384r = i12;
        this.f148388v = i13;
        this.f148391y = z11;
        this.f148392z = i16;
        this.f148382p = C23024b7.m118046b(i12);
        if (i13 == AbstractC8020f0.str_title_website_app) {
            this.f148385s = AbstractC23136l9.m118746s0(i13, AbstractC23306f.m120583H().m110204g().m116324p());
        } else if (i13 == AbstractC8020f0.str_title_email_app) {
            this.f148385s = AbstractC23136l9.m118746s0(i13, AbstractC23306f.m120583H().m110204g().m116316h());
        } else if (i13 == AbstractC8020f0.str_zcloud_branding) {
            this.f148385s = AbstractC23136l9.m118746s0(i13, C16805b.m89786h().m89800f());
        } else {
            this.f148385s = AbstractC23136l9.m118743r0(i13);
        }
        this.f148390x = AbstractC23148n.m118831e(i12);
    }

    /* renamed from: f */
    public static C32178x9 m155171f(C32178x9 c32178x9) {
        C32178x9 c32178x92 = new C32178x9(c32178x9.f148384r);
        c32178x92.f148383q = c32178x9.f148383q;
        c32178x92.f148385s = c32178x9.f148385s;
        c32178x92.f148386t = c32178x9.f148386t;
        c32178x92.f148388v = c32178x9.f148388v;
        c32178x92.f148389w = c32178x9.f148389w;
        c32178x92.f148390x = c32178x9.f148390x;
        c32178x92.f148391y = c32178x9.f148391y;
        c32178x92.f148392z = c32178x9.f148392z;
        c32178x92.f148376E = c32178x9.f148376E;
        c32178x92.f148377F = c32178x9.f148377F;
        c32178x92.f148378G = c32178x9.f148378G;
        c32178x92.f148379H = c32178x9.f148379H;
        c32178x92.f148380I = c32178x9.f148380I;
        c32178x92.f148381J = c32178x9.f148381J;
        return c32178x92;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ int m155172k(C32178x9 c32178x9, C32178x9 c32178x92) {
        float f11 = c32178x9.f148375D;
        float f12 = c32178x92.f148375D;
        if (f11 < f12) {
            return 1;
        }
        if (f11 > f12) {
            return -1;
        }
        return 0;
    }

    @Override // ai.InterfaceC0863c
    /* renamed from: b */
    public String mo2478b() {
        return this.f148382p;
    }

    @Override // ai.InterfaceC0861a
    /* renamed from: c */
    public String mo2475c() {
        return this.f148372A;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: d */
    public float mo2479d() {
        return this.f148375D;
    }

    @Override // ai.InterfaceC0861a
    /* renamed from: e */
    public void mo2476e(String str) {
        this.f148372A = str;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: g */
    public int mo2481g() {
        return this.f148373B;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: h */
    public List mo2482h() {
        return this.f148377F;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: i */
    public void mo2483i(float f11) {
        this.f148375D = f11;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: j */
    public void mo2484j(int i11) {
        this.f148373B = i11;
    }

    public C32178x9(int i11) {
        this.f148385s = "";
        this.f148386t = "";
        this.f148387u = "";
        this.f148389w = 0;
        this.f148390x = 0;
        this.f148392z = 0;
        this.f148373B = 4;
        this.f148374C = "";
        this.f148375D = 0.0f;
        this.f148376E = new HashMap();
        this.f148377F = new ArrayList();
        this.f148378G = false;
        this.f148379H = false;
        this.f148380I = false;
        this.f148381J = false;
        this.f148384r = i11;
        this.f148382p = C23024b7.m118046b(i11);
    }
}

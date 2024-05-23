package bo;

import com.zing.zalo.feed.components.C8314k0;
import com.zing.zalo.feed.components.LoadingLayoutWithIndeterminateProgressBar;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import java.util.ArrayList;
import java.util.List;
import p425po.C24894p;
import p716zh.AbstractC32173x4;
import p716zh.C31862c;
import p716zh.C32187y4;
import tr.C26885i;

/* renamed from: bo.e1 */
/* loaded from: classes4.dex */
public class C2966e1 {

    /* renamed from: A */
    public C3061y2 f11692A;

    /* renamed from: B */
    public C3065z2 f11693B;

    /* renamed from: C */
    public C2948a3 f11694C;

    /* renamed from: D */
    public C2958c3 f11695D;

    /* renamed from: E */
    private boolean f11696E;

    /* renamed from: F */
    public C2968e3 f11697F;

    /* renamed from: G */
    public InterfaceC2946a1 f11698G;

    /* renamed from: H */
    public C26885i f11699H;

    /* renamed from: I */
    public C8314k0 f11700I;

    /* renamed from: J */
    public LoadingLayoutWithIndeterminateProgressBar.C8210a f11701J;

    /* renamed from: K */
    public boolean f11702K;

    /* renamed from: a */
    public C3000l0 f11703a;

    /* renamed from: b */
    public C3020p0 f11704b;

    /* renamed from: c */
    public int f11705c;

    /* renamed from: d */
    public C3030r0 f11706d;

    /* renamed from: e */
    public AbstractC32173x4 f11707e;

    /* renamed from: f */
    public List f11708f;

    /* renamed from: g */
    public C3010n0 f11709g;

    /* renamed from: h */
    public C2977g2 f11710h;

    /* renamed from: i */
    public C3062z f11711i;

    /* renamed from: j */
    public C3019p f11712j;

    /* renamed from: k */
    public C2983h3 f11713k;

    /* renamed from: l */
    public C2991j1 f11714l;

    /* renamed from: m */
    public C3032r2 f11715m;

    /* renamed from: n */
    public C3041t2 f11716n;

    /* renamed from: o */
    public C3037s2 f11717o;

    /* renamed from: p */
    public C2993j3 f11718p;

    /* renamed from: q */
    public C3001l1 f11719q;

    /* renamed from: r */
    public C2961d1 f11720r;

    /* renamed from: s */
    public C2978g3 f11721s;

    /* renamed from: t */
    public C3008m3 f11722t;

    /* renamed from: u */
    public C2996k1 f11723u;

    /* renamed from: v */
    public ProfileAlbumItem f11724v;

    /* renamed from: w */
    public C3054x f11725w;

    /* renamed from: x */
    public C24894p f11726x;

    /* renamed from: y */
    public C2944a f11727y;

    /* renamed from: z */
    public C31862c f11728z;

    public C2966e1(C3000l0 c3000l0, C3020p0 c3020p0, int i11) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11703a = c3000l0;
        this.f11704b = c3020p0;
        this.f11705c = i11;
    }

    /* renamed from: a */
    public float m14029a() {
        List list = this.f11708f;
        float f11 = 0.0f;
        if (list != null && !list.isEmpty()) {
            for (C32187y4 c32187y4 : this.f11708f) {
                if (c32187y4.m155177e() > f11) {
                    f11 = c32187y4.m155177e();
                }
            }
        }
        return f11;
    }

    /* renamed from: b */
    public boolean m14030b() {
        return this.f11696E;
    }

    /* renamed from: c */
    public boolean m14031c() {
        return this.f11705c == 75;
    }

    /* renamed from: d */
    public C2966e1 m14032d(boolean z11) {
        this.f11696E = z11;
        return this;
    }

    public C2966e1(int i11, AbstractC32173x4 abstractC32173x4, List list) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = i11;
        this.f11707e = abstractC32173x4;
        if (list != null) {
            this.f11708f = new ArrayList(list);
        }
    }

    public C2966e1(C2958c3 c2958c3) {
        C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 83;
        this.f11695D = c2958c3;
    }

    public C2966e1(int i11, AbstractC32173x4 abstractC32173x4, List list, ProfileAlbumItem profileAlbumItem) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = i11;
        this.f11707e = abstractC32173x4;
        if (list != null) {
            this.f11708f = new ArrayList(list);
        }
        this.f11724v = profileAlbumItem;
    }

    public C2966e1(C3010n0 c3010n0) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 72;
        this.f11709g = c3010n0;
    }

    public C2966e1(C2977g2 c2977g2) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 70;
        this.f11710h = c2977g2;
    }

    public C2966e1(C3062z c3062z) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 71;
        this.f11711i = c3062z;
    }

    public C2966e1(C3019p c3019p) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 67;
        this.f11712j = c3019p;
    }

    public C2966e1(C2983h3 c2983h3) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 73;
        this.f11713k = c2983h3;
    }

    public C2966e1(C3001l1 c3001l1) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 78;
        this.f11719q = c3001l1;
    }

    public C2966e1(C3032r2 c3032r2) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 74;
        this.f11715m = c3032r2;
    }

    public C2966e1(C3041t2 c3041t2) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 75;
        this.f11716n = c3041t2;
    }

    public C2966e1(C3037s2 c3037s2) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 76;
        this.f11717o = c3037s2;
    }

    public C2966e1(C2993j3 c2993j3) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 77;
        this.f11718p = c2993j3;
    }

    public C2966e1(C2991j1 c2991j1) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 86;
        this.f11714l = c2991j1;
    }

    public C2966e1(C2961d1 c2961d1) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 79;
        this.f11720r = c2961d1;
    }

    public C2966e1(C2978g3 c2978g3) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 80;
        this.f11721s = c2978g3;
    }

    public C2966e1(C3008m3 c3008m3) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 81;
        this.f11722t = c3008m3;
    }

    public C2966e1(C2996k1 c2996k1) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 82;
        this.f11723u = c2996k1;
    }

    public C2966e1(C3054x c3054x) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 84;
        this.f11725w = c3054x;
    }

    public C2966e1(C24894p c24894p) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 74;
        this.f11726x = c24894p;
    }

    public C2966e1(C2944a c2944a) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 85;
        this.f11727y = c2944a;
    }

    public C2966e1(C3061y2 c3061y2) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 87;
        this.f11692A = c3061y2;
    }

    public C2966e1(C3065z2 c3065z2, AbstractC32173x4 abstractC32173x4) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 55;
        this.f11693B = c3065z2;
        this.f11707e = abstractC32173x4;
    }

    public C2966e1(C2948a3 c2948a3, AbstractC32173x4 abstractC32173x4) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 57;
        this.f11694C = c2948a3;
        this.f11707e = abstractC32173x4;
    }

    public C2966e1(C2968e3 c2968e3) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11701J = null;
        this.f11702K = false;
        this.f11705c = 75;
        this.f11697F = c2968e3;
    }

    public C2966e1(LoadingLayoutWithIndeterminateProgressBar.C8210a c8210a) {
        this.f11695D = C2958c3.m14004a();
        this.f11696E = true;
        this.f11698G = null;
        this.f11699H = null;
        this.f11700I = null;
        this.f11702K = false;
        this.f11705c = 76;
        this.f11701J = c8210a;
    }
}

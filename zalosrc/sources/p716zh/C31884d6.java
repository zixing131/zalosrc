package p716zh;

import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.MainApplication;

/* renamed from: zh.d6 */
/* loaded from: classes3.dex */
public class C31884d6 {

    /* renamed from: f */
    static final int f146453f = MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cLink1);

    /* renamed from: g */
    static final int f146454g = MainApplication.getAppContext().getResources().getColor(AbstractC16801x.co_mtxt2);

    /* renamed from: a */
    public a f146455a;

    /* renamed from: b */
    public a f146456b;

    /* renamed from: c */
    public a f146457c;

    /* renamed from: d */
    public a f146458d;

    /* renamed from: e */
    public a f146459e;

    /* renamed from: zh.d6$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public int f146460a;

        /* renamed from: b */
        public boolean f146461b;

        /* renamed from: c */
        public boolean f146462c;

        public a(int i11, boolean z11, boolean z12) {
            this.f146460a = i11;
            this.f146461b = z11;
            this.f146462c = z12;
        }
    }

    public C31884d6(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f146455a = aVar;
        this.f146456b = aVar2;
        this.f146457c = aVar3;
        this.f146458d = aVar4;
        this.f146459e = aVar5;
    }

    /* renamed from: a */
    public static C31884d6 m153209a() {
        a aVar = new a(f146453f, false, false);
        return new C31884d6(aVar, aVar, aVar, new a(f146454g, true, false), aVar);
    }

    /* renamed from: b */
    public static C31884d6 m153210b() {
        a aVar = new a(f146453f, false, true);
        return new C31884d6(aVar, aVar, aVar, new a(f146454g, true, true), aVar);
    }
}

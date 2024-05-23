package p566v3;

import java.util.List;
import p631x3.AbstractC29302c;
import p631x3.AbstractC29304e;

/* renamed from: v3.o */
/* loaded from: classes2.dex */
public class C27507o {

    /* renamed from: a */
    private final List f129400a;

    /* renamed from: b */
    private final float[][][] f129401b;

    /* renamed from: v3.o$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public List f129402a;

        /* renamed from: b */
        public float[][][] f129403b;

        /* renamed from: a */
        public C27507o m140645a() {
            return new C27507o(this.f129402a, this.f129403b);
        }
    }

    public C27507o(List list, float[][][] fArr) {
        List m146402a = AbstractC29304e.m146402a(list);
        this.f129400a = m146402a;
        this.f129401b = (float[][][]) AbstractC29302c.m146400b(fArr, AbstractC29302c.m146401c(fArr, m146402a.size()), "timing_curves");
    }

    /* renamed from: a */
    public List m140643a() {
        return this.f129400a;
    }

    /* renamed from: b */
    public float[][][] m140644b() {
        return this.f129401b;
    }
}

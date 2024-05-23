package p566v3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p596w3.AbstractC28708f;
import p596w3.C28704b;
import p596w3.C28705c;
import p596w3.C28707e;
import p596w3.C28709g;
import p596w3.C28711i;
import p596w3.C28712j;
import p631x3.AbstractC29302c;
import p631x3.AbstractC29304e;

/* renamed from: v3.c */
/* loaded from: classes2.dex */
public class C27495c {

    /* renamed from: f */
    public static final Comparator f129316f = new Comparator() { // from class: v3.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m140595g;
            m140595g = C27495c.m140595g((C27495c) obj, (C27495c) obj2);
            return m140595g;
        }
    };

    /* renamed from: a */
    private final b f129317a;

    /* renamed from: b */
    private final List f129318b;

    /* renamed from: c */
    private final float[][][] f129319c;

    /* renamed from: d */
    private final float[] f129320d;

    /* renamed from: e */
    private final AbstractC28708f f129321e;

    /* renamed from: v3.c$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public b f129322a;

        /* renamed from: b */
        public List f129323b;

        /* renamed from: c */
        public float[][][] f129324c;

        /* renamed from: d */
        public float[] f129325d;

        /* renamed from: a */
        public C27495c m140601a() {
            return new C27495c(this.f129322a, this.f129323b, this.f129324c, this.f129325d);
        }
    }

    /* renamed from: v3.c$b */
    /* loaded from: classes2.dex */
    public enum b {
        SCALE(true),
        ROTATION(true),
        POSITION(true),
        X_POSITION(true),
        Y_POSITION(true),
        ANCHOR_POINT(false),
        STROKE_WIDTH(false),
        STROKE_COLOR(false),
        FILL_COLOR(false),
        OPACITY(false);


        /* renamed from: p */
        final boolean f129337p;

        b(boolean z11) {
            this.f129337p = z11;
        }

        /* renamed from: c */
        public boolean m140603c() {
            return this.f129337p;
        }
    }

    public C27495c(C27495c c27495c) {
        this.f129317a = c27495c.f129317a;
        if (c27495c.f129318b != null) {
            this.f129318b = new ArrayList();
            Iterator it = c27495c.f129318b.iterator();
            while (it.hasNext()) {
                this.f129318b.add(new C27496d((C27496d) it.next()));
            }
        } else {
            this.f129318b = null;
        }
        float[][][] fArr = c27495c.f129319c;
        if (fArr != null) {
            this.f129319c = new float[fArr.length][];
            int length = c27495c.f129319c.length;
            for (int i11 = 0; i11 < length; i11++) {
                float[][][] fArr2 = this.f129319c;
                float[][][] fArr3 = c27495c.f129319c;
                fArr2[i11] = new float[fArr3[i11].length];
                int length2 = fArr3[i11].length;
                for (int i12 = 0; i12 < length2; i12++) {
                    float[][] fArr4 = this.f129319c[i11];
                    float[][][] fArr5 = c27495c.f129319c;
                    fArr4[i12] = new float[fArr5[i11][i12].length];
                    int length3 = fArr5[i11][i12].length;
                    for (int i13 = 0; i13 < length3; i13++) {
                        this.f129319c[i11][i12][i13] = c27495c.f129319c[i11][i12][i13];
                    }
                }
            }
        } else {
            this.f129319c = null;
        }
        float[] fArr6 = c27495c.f129320d;
        if (fArr6 != null) {
            this.f129320d = new float[fArr6.length];
            int length4 = c27495c.f129320d.length;
            for (int i14 = 0; i14 < length4; i14++) {
                this.f129320d[i14] = c27495c.f129320d[i14];
            }
        } else {
            this.f129320d = null;
        }
        this.f129321e = c27495c.f129321e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m140595g(C27495c c27495c, C27495c c27495c2) {
        return c27495c.m140599e().compareTo(c27495c2.m140599e());
    }

    /* renamed from: b */
    public float[] m140596b() {
        return this.f129320d;
    }

    /* renamed from: c */
    public AbstractC28708f m140597c() {
        return this.f129321e;
    }

    /* renamed from: d */
    public List m140598d() {
        return this.f129318b;
    }

    /* renamed from: e */
    public b m140599e() {
        return this.f129317a;
    }

    /* renamed from: f */
    public float[][][] m140600f() {
        return this.f129319c;
    }

    public C27495c(b bVar, List list, float[][][] fArr, float[] fArr2) {
        boolean z11 = true;
        b bVar2 = (b) AbstractC29302c.m146400b(bVar, bVar != null, "property");
        this.f129317a = bVar2;
        List list2 = (List) AbstractC29302c.m146400b(AbstractC29304e.m146402a(list), list != null && list.size() > 0, "key_values");
        this.f129318b = list2;
        this.f129319c = (float[][][]) AbstractC29302c.m146400b(fArr, AbstractC29302c.m146401c(fArr, list2.size()), "timing_curves");
        if (fArr2 != null && fArr2.length != 2) {
            z11 = false;
        }
        this.f129320d = (float[]) AbstractC29302c.m146400b(fArr2, z11, "anchor");
        if (bVar2.m140603c()) {
            this.f129321e = C28707e.m143776j(this);
            return;
        }
        if (bVar2 == b.STROKE_WIDTH) {
            this.f129321e = C28712j.m143791e(this);
            return;
        }
        if (bVar2 == b.STROKE_COLOR) {
            this.f129321e = C28711i.m143786e(this);
            return;
        }
        if (bVar2 == b.FILL_COLOR) {
            this.f129321e = C28705c.m143758e(this);
            return;
        }
        if (bVar2 == b.ANCHOR_POINT) {
            this.f129321e = C28704b.m143755e(this);
        } else {
            if (bVar2 == b.OPACITY) {
                this.f129321e = C28709g.m143780e(this);
                return;
            }
            throw new IllegalArgumentException("Unknown property type for animation post processing: " + bVar2);
        }
    }
}

package p596w3;

import java.util.List;
import p566v3.C27495c;
import p566v3.C27496d;

/* renamed from: w3.g */
/* loaded from: classes2.dex */
public class C28709g extends AbstractC28708f {

    /* renamed from: w3.g$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private float f133201a = 100.0f;

        /* renamed from: a */
        public float m143782a() {
            return this.f133201a;
        }

        /* renamed from: b */
        public void m143783b(float f11) {
            this.f133201a = f11;
        }
    }

    public C28709g(List list, float[][][] fArr) {
        super(list, fArr);
    }

    /* renamed from: e */
    public static C28709g m143780e(C27495c c27495c) {
        if (c27495c.m140599e() == C27495c.b.OPACITY) {
            return new C28709g(c27495c.m140598d(), c27495c.m140600f());
        }
        throw new IllegalArgumentException("Cannot create a KeyFramedOpacity object from a non OPACITY animation.");
    }

    @Override // p596w3.AbstractC28708f
    /* renamed from: d */
    public void mo143756b(C27496d c27496d, C27496d c27496d2, float f11, a aVar) {
        if (c27496d2 == null) {
            aVar.m143783b(c27496d.m140604b()[0]);
        } else {
            aVar.m143783b(AbstractC28708f.m143778c(c27496d.m140604b()[0], c27496d2.m140604b()[0], f11));
        }
    }
}

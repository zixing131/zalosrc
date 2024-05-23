package p596w3;

import java.util.List;
import p566v3.C27495c;
import p566v3.C27496d;

/* renamed from: w3.j */
/* loaded from: classes2.dex */
public class C28712j extends AbstractC28708f {

    /* renamed from: w3.j$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private float f133204a;

        /* renamed from: a */
        public void m143793a(float f11) {
            this.f133204a *= f11;
        }

        /* renamed from: b */
        public float m143794b() {
            return Math.abs(this.f133204a);
        }

        /* renamed from: c */
        public void m143795c(float f11) {
            this.f133204a = f11;
        }
    }

    public C28712j(List list, float[][][] fArr) {
        super(list, fArr);
    }

    /* renamed from: e */
    public static C28712j m143791e(C27495c c27495c) {
        if (c27495c.m140599e() == C27495c.b.STROKE_WIDTH) {
            return new C28712j(c27495c.m140598d(), c27495c.m140600f());
        }
        throw new IllegalArgumentException("Cannot create a KeyFramedStrokeWidth object from a non STROKE_WIDTH animation.");
    }

    @Override // p596w3.AbstractC28708f
    /* renamed from: d */
    public void mo143756b(C27496d c27496d, C27496d c27496d2, float f11, a aVar) {
        if (c27496d2 == null) {
            aVar.m143795c(c27496d.m140604b()[0]);
        } else {
            aVar.m143795c(AbstractC28708f.m143778c(c27496d.m140604b()[0], c27496d2.m140604b()[0], f11));
        }
    }
}

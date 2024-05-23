package p596w3;

import android.graphics.Color;
import java.util.List;
import p566v3.C27495c;
import p566v3.C27496d;

/* renamed from: w3.i */
/* loaded from: classes2.dex */
public class C28711i extends AbstractC28708f {

    /* renamed from: w3.i$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private float f133202a;

        /* renamed from: b */
        private boolean f133203b;

        /* renamed from: a */
        public float m143788a() {
            return this.f133202a;
        }

        /* renamed from: b */
        public boolean m143789b() {
            return this.f133203b;
        }

        /* renamed from: c */
        public void m143790c(float f11) {
            this.f133202a = f11;
            this.f133203b = true;
        }
    }

    public C28711i(List list, float[][][] fArr) {
        super(list, fArr);
    }

    /* renamed from: e */
    public static C28711i m143786e(C27495c c27495c) {
        if (c27495c.m140599e() == C27495c.b.STROKE_COLOR) {
            return new C28711i(c27495c.m140598d(), c27495c.m140600f());
        }
        throw new IllegalArgumentException("Cannot create a KeyFramedStrokeColor object from a non STROKE_COLOR animation.");
    }

    @Override // p596w3.AbstractC28708f
    /* renamed from: d */
    public void mo143756b(C27496d c27496d, C27496d c27496d2, float f11, a aVar) {
        if (c27496d2 == null) {
            aVar.m143790c(c27496d.m140604b()[0]);
            return;
        }
        int i11 = (int) c27496d.m140604b()[0];
        int i12 = (int) c27496d2.m140604b()[0];
        aVar.m143790c(Color.argb((int) AbstractC28708f.m143778c(Color.alpha(i11), Color.alpha(i12), f11), (int) AbstractC28708f.m143778c(Color.red(i11), Color.red(i12), f11), (int) AbstractC28708f.m143778c(Color.green(i11), Color.green(i12), f11), (int) AbstractC28708f.m143778c(Color.blue(i11), Color.blue(i12), f11)));
    }
}

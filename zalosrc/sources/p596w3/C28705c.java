package p596w3;

import android.graphics.Color;
import java.util.List;
import p566v3.C27495c;
import p566v3.C27496d;

/* renamed from: w3.c */
/* loaded from: classes2.dex */
public class C28705c extends AbstractC28708f {

    /* renamed from: w3.c$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private float f133186a;

        /* renamed from: b */
        private boolean f133187b;

        /* renamed from: a */
        public float m143760a() {
            return this.f133186a;
        }

        /* renamed from: b */
        public boolean m143761b() {
            return this.f133187b;
        }

        /* renamed from: c */
        public void m143762c(float f11) {
            this.f133186a = f11;
            this.f133187b = true;
        }
    }

    public C28705c(List list, float[][][] fArr) {
        super(list, fArr);
    }

    /* renamed from: e */
    public static C28705c m143758e(C27495c c27495c) {
        if (c27495c.m140599e() == C27495c.b.FILL_COLOR) {
            return new C28705c(c27495c.m140598d(), c27495c.m140600f());
        }
        throw new IllegalArgumentException("Cannot create a KeyFramedFillColor object from a non FILL_COLOR animation.");
    }

    @Override // p596w3.AbstractC28708f
    /* renamed from: d */
    public void mo143756b(C27496d c27496d, C27496d c27496d2, float f11, a aVar) {
        if (c27496d2 == null) {
            aVar.m143762c(c27496d.m140604b()[0]);
            return;
        }
        int i11 = (int) c27496d.m140604b()[0];
        int i12 = (int) c27496d2.m140604b()[0];
        aVar.m143762c(Color.argb((int) AbstractC28708f.m143778c(Color.alpha(i11), Color.alpha(i12), f11), (int) AbstractC28708f.m143778c(Color.red(i11), Color.red(i12), f11), (int) AbstractC28708f.m143778c(Color.green(i11), Color.green(i12), f11), (int) AbstractC28708f.m143778c(Color.blue(i11), Color.blue(i12), f11)));
    }
}

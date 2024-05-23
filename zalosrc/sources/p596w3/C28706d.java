package p596w3;

import android.graphics.Color;
import java.util.List;
import p566v3.C27499g;
import p566v3.C27507o;

/* renamed from: w3.d */
/* loaded from: classes2.dex */
public class C28706d extends AbstractC28708f {

    /* renamed from: e */
    private final b f133188e;

    /* renamed from: w3.d$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private int f133189a;

        /* renamed from: b */
        private int f133190b;

        /* renamed from: a */
        public int m143766a() {
            return this.f133190b;
        }

        /* renamed from: b */
        public int m143767b() {
            return this.f133189a;
        }

        /* renamed from: c */
        void m143768c(int i11) {
            this.f133190b = i11;
        }

        /* renamed from: d */
        void m143769d(int i11) {
            this.f133189a = i11;
        }
    }

    /* renamed from: w3.d$b */
    /* loaded from: classes2.dex */
    public enum b {
        START,
        END
    }

    private C28706d(List list, float[][][] fArr, b bVar) {
        super(list, fArr);
        this.f133188e = bVar;
    }

    /* renamed from: e */
    public static C28706d m143763e(C27507o c27507o, b bVar) {
        return new C28706d(c27507o.m140643a(), c27507o.m140644b(), bVar);
    }

    /* renamed from: f */
    public static int m143764f(float f11, int i11, int i12) {
        return ((Color.alpha(i11) + ((int) ((Color.alpha(i12) - r0) * f11))) << 24) | ((Color.red(i11) + ((int) ((Color.red(i12) - r1) * f11))) << 16) | ((Color.green(i11) + ((int) ((Color.green(i12) - r2) * f11))) << 8) | (Color.blue(i11) + ((int) (f11 * (Color.blue(i12) - r7))));
    }

    @Override // p596w3.AbstractC28708f
    /* renamed from: d */
    public void mo143756b(C27499g c27499g, C27499g c27499g2, float f11, a aVar) {
        if (c27499g2 == null) {
            if (this.f133188e == b.START) {
                aVar.m143769d(c27499g.m140611b());
                return;
            } else {
                aVar.m143768c(c27499g.m140611b());
                return;
            }
        }
        if (this.f133188e == b.START) {
            aVar.m143769d(m143764f(f11, c27499g.m140611b(), c27499g2.m140611b()));
        } else {
            aVar.m143768c(m143764f(f11, c27499g.m140611b(), c27499g2.m140611b()));
        }
    }

    public C28706d(C28706d c28706d) {
        super(c28706d);
        this.f133188e = c28706d.f133188e;
    }
}

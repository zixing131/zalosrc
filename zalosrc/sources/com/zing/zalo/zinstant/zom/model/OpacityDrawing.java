package com.zing.zalo.zinstant.zom.model;

import com.zing.zalo.zinstant.utils.C17206r;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class OpacityDrawing {
    private C17249a mCurrentOpacity;
    private float mFraction;
    private float outerOpacity = 1.0f;
    private float mActualOpacity = 1.0f;
    private int mActualAlpha = 255;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zinstant.zom.model.OpacityDrawing$a */
    /* loaded from: classes7.dex */
    public static final class C17249a {

        /* renamed from: a */
        private final float f87935a;

        /* renamed from: b */
        private final float f87936b;

        /* renamed from: c */
        private final float f87937c;

        /* renamed from: d */
        private float f87938d;

        public C17249a(float f11, float f12, float f13, float f14) {
            this.f87935a = f11;
            this.f87936b = f12;
            this.f87937c = f13;
            this.f87938d = f14;
        }

        /* renamed from: a */
        public final float m92077a() {
            return this.f87938d;
        }

        /* renamed from: b */
        public final float m92078b() {
            return this.f87937c;
        }

        /* renamed from: c */
        public final float m92079c() {
            return this.f87936b;
        }

        /* renamed from: d */
        public final float m92080d() {
            return this.f87935a;
        }

        /* renamed from: e */
        public final void m92081e(float f11) {
            this.f87938d = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17249a)) {
                return false;
            }
            C17249a c17249a = (C17249a) obj;
            return AbstractC19074t.m100204b(Float.valueOf(this.f87935a), Float.valueOf(c17249a.f87935a)) && AbstractC19074t.m100204b(Float.valueOf(this.f87936b), Float.valueOf(c17249a.f87936b)) && AbstractC19074t.m100204b(Float.valueOf(this.f87937c), Float.valueOf(c17249a.f87937c)) && AbstractC19074t.m100204b(Float.valueOf(this.f87938d), Float.valueOf(c17249a.f87938d));
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f87935a) * 31) + Float.floatToIntBits(this.f87936b)) * 31) + Float.floatToIntBits(this.f87937c)) * 31) + Float.floatToIntBits(this.f87938d);
        }

        public String toString() {
            return "Data(src=" + this.f87935a + ", des=" + this.f87936b + ", comp=" + this.f87937c + ", combine=" + this.f87938d + ')';
        }
    }

    private final void onOpacityChanged() {
        float f11;
        float f12 = this.outerOpacity;
        C17249a c17249a = this.mCurrentOpacity;
        if (c17249a != null) {
            f11 = c17249a.m92077a();
        } else {
            f11 = 1.0f;
        }
        float f13 = f12 * f11;
        this.mActualOpacity = f13;
        this.mActualAlpha = (int) (f13 * 255);
    }

    public final int getAlpha() {
        return this.mActualAlpha;
    }

    public final float getOpacity() {
        return this.mActualOpacity;
    }

    public final boolean handleNewOpacity(float f11) {
        float f12;
        C17249a c17249a = this.mCurrentOpacity;
        if (c17249a != null) {
            f12 = c17249a.m92079c();
        } else {
            f12 = 1.0f;
        }
        if (C17206r.m91843a(f11, f12, 0.001d)) {
            return false;
        }
        float f13 = this.mActualOpacity;
        this.mCurrentOpacity = new C17249a(f13, f11, f11 - f13, f13);
        this.mFraction = 0.0f;
        return true;
    }

    public final boolean setFraction(float f11) {
        if (C17206r.m91844b(f11, this.mFraction, 0.0d, 4, null)) {
            return false;
        }
        this.mFraction = f11;
        C17249a c17249a = this.mCurrentOpacity;
        if (c17249a != null) {
            c17249a.m92081e(c17249a.m92080d() + (c17249a.m92078b() * f11));
        }
        onOpacityChanged();
        return true;
    }

    public final boolean setOuterOpacity(float f11) {
        if (C17206r.m91844b(f11, this.outerOpacity, 0.0d, 4, null)) {
            return false;
        }
        this.outerOpacity = f11;
        onOpacityChanged();
        return true;
    }
}

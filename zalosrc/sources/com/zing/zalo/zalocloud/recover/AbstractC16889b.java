package com.zing.zalo.zalocloud.recover;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;

/* renamed from: com.zing.zalo.zalocloud.recover.b */
/* loaded from: classes7.dex */
public abstract class AbstractC16889b {

    /* renamed from: a */
    private final float f85925a;

    /* renamed from: b */
    private final int f85926b;

    /* renamed from: c */
    private final boolean f85927c;

    /* renamed from: com.zing.zalo.zalocloud.recover.b$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC16889b {

        /* renamed from: d */
        private final float f85928d;

        public a(float f11) {
            super(f11, 3, false, null);
            this.f85928d = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f85928d, ((a) obj).f85928d) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f85928d);
        }

        public String toString() {
            return "BatteryError(percent=" + this.f85928d + ")";
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.b$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC16889b {

        /* renamed from: d */
        private final float f85929d;

        public b(float f11) {
            super(f11, 4, false, null);
            this.f85929d = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f85929d, ((b) obj).f85929d) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f85929d);
        }

        public String toString() {
            return "NetworkError(percent=" + this.f85929d + ")";
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.b$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC16889b {

        /* renamed from: d */
        public static final c f85930d = new c();

        private c() {
            super(0.0f, 0, 0 == true ? 1 : 0, null);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.b$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC16889b {

        /* renamed from: d */
        private final long f85931d;

        /* renamed from: e */
        private final float f85932e;

        public d(long j11, float f11) {
            super(f11, 1, false, null);
            this.f85931d = j11;
            this.f85932e = f11;
        }

        /* renamed from: c */
        public final long m90260c() {
            return this.f85931d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f85931d == dVar.f85931d && Float.compare(this.f85932e, dVar.f85932e) == 0;
        }

        public int hashCode() {
            return (AbstractC2147g0.m11521a(this.f85931d) * 31) + Float.floatToIntBits(this.f85932e);
        }

        public String toString() {
            return "StorageError(needSpaceSize=" + this.f85931d + ", percent=" + this.f85932e + ")";
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.b$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC16889b {

        /* renamed from: d */
        private final float f85933d;

        public e(float f11) {
            super(f11, 2, false, null);
            this.f85933d = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Float.compare(this.f85933d, ((e) obj).f85933d) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f85933d);
        }

        public String toString() {
            return "UnknownError(percent=" + this.f85933d + ")";
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.b$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC16889b {

        /* renamed from: d */
        private final float f85934d;

        public f(float f11) {
            super(f11, 5, true, null);
            this.f85934d = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Float.compare(this.f85934d, ((f) obj).f85934d) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f85934d);
        }

        public String toString() {
            return "WorkerError(percent=" + this.f85934d + ")";
        }
    }

    public /* synthetic */ AbstractC16889b(float f11, int i11, boolean z11, AbstractC19060k abstractC19060k) {
        this(f11, i11, z11);
    }

    /* renamed from: a */
    public final int m90258a() {
        return this.f85926b;
    }

    /* renamed from: b */
    public final float m90259b() {
        return this.f85925a;
    }

    private AbstractC16889b(float f11, int i11, boolean z11) {
        this.f85925a = f11;
        this.f85926b = i11;
        this.f85927c = z11;
    }
}

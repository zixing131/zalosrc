package com.zing.zalo.zinstant.component.skeleton;

import android.graphics.RectF;

/* renamed from: com.zing.zalo.zinstant.component.skeleton.a */
/* loaded from: classes7.dex */
public class C17108a {

    /* renamed from: a */
    final float[] f87493a = new float[4];

    /* renamed from: b */
    final int[] f87494b = new int[4];

    /* renamed from: c */
    final RectF f87495c = new RectF();

    /* renamed from: d */
    int f87496d = -1;

    /* renamed from: e */
    int f87497e = -16777216;

    /* renamed from: f */
    int f87498f = 0;

    /* renamed from: g */
    int f87499g = 0;

    /* renamed from: h */
    float f87500h = 0.0f;

    /* renamed from: i */
    float f87501i = 0.6f;

    /* renamed from: j */
    float f87502j = 0.5f;

    /* renamed from: k */
    boolean f87503k = true;

    /* renamed from: l */
    int f87504l = -1;

    /* renamed from: m */
    int f87505m = 1;

    /* renamed from: n */
    long f87506n = 1500;

    /* renamed from: o */
    long f87507o;

    /* renamed from: com.zing.zalo.zinstant.component.skeleton.a$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        final C17108a f87508a = new C17108a();

        /* renamed from: b */
        private static float m91470b(float f11, float f12, float f13) {
            return Math.min(f12, Math.max(f11, f13));
        }

        /* renamed from: a */
        public C17108a m91471a() {
            this.f87508a.m91468a();
            this.f87508a.m91469b();
            return this.f87508a;
        }

        /* renamed from: c */
        public a m91472c(float f11) {
            int m91470b = (int) (m91470b(0.0f, 1.0f, f11) * 255.0f);
            C17108a c17108a = this.f87508a;
            c17108a.f87497e = (m91470b << 24) | (c17108a.f87497e & 16777215);
            return this;
        }

        /* renamed from: d */
        public a m91473d(float f11) {
            int m91470b = (int) (m91470b(0.0f, 1.0f, f11) * 255.0f);
            C17108a c17108a = this.f87508a;
            c17108a.f87496d = (m91470b << 24) | (c17108a.f87496d & 16777215);
            return this;
        }
    }

    C17108a() {
    }

    /* renamed from: a */
    void m91468a() {
        int[] iArr = this.f87494b;
        int i11 = this.f87497e;
        iArr[0] = i11;
        int i12 = this.f87496d;
        iArr[1] = i12;
        iArr[2] = i12;
        iArr[3] = i11;
    }

    /* renamed from: b */
    void m91469b() {
        this.f87493a[0] = Math.max(((1.0f - this.f87500h) - this.f87501i) / 2.0f, 0.0f);
        this.f87493a[1] = Math.max(((1.0f - this.f87500h) - 0.001f) / 2.0f, 0.0f);
        this.f87493a[2] = Math.min(((this.f87500h + 1.0f) + 0.001f) / 2.0f, 1.0f);
        this.f87493a[3] = Math.min(((this.f87500h + 1.0f) + this.f87501i) / 2.0f, 1.0f);
    }
}

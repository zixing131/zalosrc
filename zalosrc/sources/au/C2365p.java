package au;

import android.graphics.Bitmap;
import android.renderscript.RenderScript;
import p169fu.AbstractC19146a;
import p678yd.C30906a;
import p678yd.C30907b;

/* renamed from: au.p */
/* loaded from: classes4.dex */
public class C2365p {

    /* renamed from: a */
    private final RenderScript f9895a;

    /* renamed from: b */
    private int f9896b;

    /* renamed from: c */
    private float f9897c;

    /* renamed from: d */
    private boolean f9898d = false;

    private C2365p(RenderScript renderScript) {
        this.f9895a = renderScript;
        m12380e(25);
        m12382h(0.0f);
    }

    /* renamed from: a */
    private Bitmap m12374a(Bitmap bitmap, int i11) {
        return new C30907b(this.f9895a).m150160a(i11, bitmap);
    }

    /* renamed from: b */
    private Bitmap m12375b(Bitmap bitmap, int i11) {
        return new C30906a().m150158a(i11, bitmap);
    }

    /* renamed from: g */
    private Bitmap m12376g(Bitmap bitmap) {
        float min = Math.min(m12379d() / bitmap.getWidth(), m12379d() / bitmap.getHeight());
        return Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * min), Math.round(min * bitmap.getHeight()), true);
    }

    /* renamed from: i */
    public static C2365p m12377i(RenderScript renderScript) {
        return new C2365p(renderScript);
    }

    /* renamed from: c */
    public int m12378c() {
        return this.f9896b;
    }

    /* renamed from: d */
    public float m12379d() {
        return this.f9897c;
    }

    /* renamed from: e */
    public C2365p m12380e(int i11) {
        this.f9896b = i11;
        return this;
    }

    /* renamed from: f */
    public Bitmap m12381f(Bitmap bitmap) {
        Bitmap bitmap2;
        if (m12379d() > 0.0f) {
            bitmap2 = m12376g(bitmap);
        } else {
            bitmap2 = bitmap;
        }
        if (!this.f9898d && bitmap2 == bitmap) {
            bitmap2 = AbstractC19146a.m100462a(bitmap2);
        }
        if (this.f9895a != null) {
            try {
                return m12374a(bitmap2, m12378c());
            } catch (Exception unused) {
                return m12375b(bitmap2, m12378c());
            }
        }
        return m12375b(bitmap2, m12378c());
    }

    /* renamed from: h */
    public C2365p m12382h(float f11) {
        this.f9897c = f11;
        return this;
    }
}

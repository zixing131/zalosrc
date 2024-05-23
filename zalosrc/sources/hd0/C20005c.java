package hd0;

/* renamed from: hd0.c */
/* loaded from: classes4.dex */
public class C20005c {

    /* renamed from: a */
    private int f98347a;

    /* renamed from: b */
    private int f98348b;

    /* renamed from: c */
    private float f98349c;

    /* renamed from: d */
    private float f98350d;

    public C20005c() {
    }

    /* renamed from: a */
    public float m103818a() {
        return this.f98349c;
    }

    /* renamed from: b */
    public float m103819b() {
        return this.f98350d;
    }

    /* renamed from: c */
    public int m103820c() {
        return this.f98347a;
    }

    /* renamed from: d */
    public int m103821d() {
        return this.f98348b;
    }

    /* renamed from: e */
    public C20005c m103822e(float f11) {
        if (f11 < 0.0f) {
            this.f98349c = 0.0f;
        } else if (f11 > 1.0f) {
            this.f98349c = 1.0f;
        } else {
            this.f98349c = f11;
        }
        return this;
    }

    public C20005c(float f11, float f12) {
        this.f98349c = f11;
        this.f98350d = f12;
    }
}

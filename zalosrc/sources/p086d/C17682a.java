package p086d;

import android.graphics.Bitmap;
import p025b.AbstractC2473b;
import p116e.C18150a;

/* renamed from: d.a */
/* loaded from: classes2.dex */
public class C17682a {

    /* renamed from: c */
    private static final String f89683c = "BitmapRamCache";

    /* renamed from: d */
    private static C17682a f89684d;

    /* renamed from: a */
    private C18150a f89685a;

    /* renamed from: b */
    private int f89686b;

    /* renamed from: d.a$a */
    /* loaded from: classes2.dex */
    class a extends C18150a {
        a(C17682a c17682a, int i11) {
            super(i11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p116e.C18150a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int mo93667g(String str, Bitmap bitmap) {
            return (bitmap.getRowBytes() * bitmap.getHeight()) / 1024;
        }
    }

    private C17682a() {
        this.f89685a = null;
        int maxMemory = ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8;
        this.f89686b = maxMemory;
        try {
            this.f89685a = new a(this, maxMemory);
            AbstractC2473b.m12488a(f89683c, "Bitmap cache max size" + this.f89686b);
        } catch (Exception e11) {
            AbstractC2473b.m12489b(f89683c, f89683c, e11);
        }
    }

    /* renamed from: b */
    public static C17682a m93664b() {
        if (f89684d == null) {
            f89684d = new C17682a();
        }
        return f89684d;
    }

    /* renamed from: a */
    public synchronized Bitmap m93665a(String str) {
        Bitmap bitmap;
        try {
            bitmap = (Bitmap) this.f89685a.m96439f(str);
        } catch (Exception e11) {
            AbstractC2473b.m12489b(f89683c, "get", e11);
            bitmap = null;
        }
        return bitmap;
    }

    /* renamed from: c */
    public synchronized boolean m93666c(String str, Bitmap bitmap) {
        boolean z11;
        if (str != null) {
            try {
            } catch (Exception e11) {
                AbstractC2473b.m12489b(f89683c, "put", e11);
            }
            if (str.length() != 0 && bitmap != null) {
                this.f89685a.m96440h(str);
                this.f89685a.m96436b(str, bitmap);
                z11 = true;
            }
        }
        z11 = false;
        return z11;
    }
}

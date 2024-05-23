package p20;

import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;
import java.util.List;
import java.util.Random;

/* renamed from: p20.k */
/* loaded from: classes5.dex */
public final class C24620k {

    /* renamed from: a */
    private String f118423a;

    /* renamed from: b */
    private int f118424b;

    /* renamed from: c */
    private int f118425c;

    /* renamed from: d */
    private String f118426d;

    /* renamed from: e */
    private String f118427e;

    /* renamed from: f */
    private Drawable f118428f;

    /* renamed from: g */
    private List f118429g;

    /* renamed from: h */
    private final Random f118430h;

    public C24620k(String str, int i11, int i12, String str2, String str3, Drawable drawable, List list) {
        AbstractC19074t.m100208f(str, "id");
        this.f118423a = str;
        this.f118424b = i11;
        this.f118425c = i12;
        this.f118426d = str2;
        this.f118427e = str3;
        this.f118428f = drawable;
        this.f118429g = list;
        this.f118430h = new Random();
    }

    /* renamed from: a */
    public final Drawable m128119a() {
        return this.f118428f;
    }

    /* renamed from: b */
    public final Drawable m128120b(boolean z11) {
        int i11;
        List list = this.f118429g;
        AbstractC19074t.m100205c(list);
        if (z11) {
            Random random = this.f118430h;
            List list2 = this.f118429g;
            AbstractC19074t.m100205c(list2);
            i11 = random.nextInt(list2.size());
        } else {
            i11 = 0;
        }
        return (Drawable) list.get(i11);
    }

    /* renamed from: c */
    public final String m128121c() {
        return this.f118423a;
    }

    /* renamed from: d */
    public final int m128122d() {
        return this.f118425c;
    }

    /* renamed from: e */
    public final boolean m128123e() {
        return this.f118424b == 1;
    }
}

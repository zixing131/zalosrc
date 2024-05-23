package zn0;

/* renamed from: zn0.h */
/* loaded from: classes7.dex */
public class C32521h {

    /* renamed from: a */
    private String f150240a;

    /* renamed from: b */
    private int f150241b = 0;

    public C32521h(String str) {
        this.f150240a = str;
    }

    /* renamed from: a */
    public boolean m157483a() {
        return this.f150241b != -1;
    }

    /* renamed from: b */
    public String m157484b() {
        int i11 = this.f150241b;
        if (i11 == -1) {
            return null;
        }
        int indexOf = this.f150240a.indexOf(46, i11);
        if (indexOf == -1) {
            String substring = this.f150240a.substring(this.f150241b);
            this.f150241b = -1;
            return substring;
        }
        String substring2 = this.f150240a.substring(this.f150241b, indexOf);
        this.f150241b = indexOf + 1;
        return substring2;
    }
}

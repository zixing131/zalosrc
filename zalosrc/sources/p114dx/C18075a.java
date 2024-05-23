package p114dx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: dx.a */
/* loaded from: classes4.dex */
public class C18075a {

    /* renamed from: a */
    private String f91500a;

    /* renamed from: b */
    private long f91501b;

    /* renamed from: c */
    private long f91502c;

    /* renamed from: e */
    private int f91504e;

    /* renamed from: f */
    private String f91505f;

    /* renamed from: g */
    private int f91506g;

    /* renamed from: h */
    private int f91507h;

    /* renamed from: d */
    private ArrayList f91503d = new ArrayList();

    /* renamed from: i */
    private StringBuffer f91508i = new StringBuffer();

    /* renamed from: f */
    public static C18075a m96123f() {
        C18075a c18075a = new C18075a();
        c18075a.f91500a = UUID.randomUUID().toString();
        return c18075a;
    }

    /* renamed from: a */
    public String m96124a() {
        this.f91508i = new StringBuffer();
        try {
            ArrayList arrayList = this.f91503d;
            if (arrayList != null && !arrayList.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = this.f91503d.iterator();
                while (it.hasNext()) {
                    sb2.append((String) it.next());
                    sb2.append("|");
                }
                this.f91508i.append(sb2.substring(0, sb2.toString().length() - 1));
            }
        } catch (IndexOutOfBoundsException e11) {
            e11.printStackTrace();
        }
        return this.f91508i.toString();
    }

    /* renamed from: b */
    public int m96125b() {
        return this.f91507h;
    }

    /* renamed from: c */
    public long m96126c() {
        return this.f91502c;
    }

    /* renamed from: d */
    public int m96127d() {
        return this.f91506g;
    }

    /* renamed from: e */
    public int m96128e() {
        return this.f91504e;
    }

    /* renamed from: g */
    public C18075a m96129g(long j11, long j12, long j13, long j14) {
        long j15 = j12 - j11;
        this.f91502c = j15;
        this.f91504e = 0;
        if (j15 > 5000) {
            this.f91504e = 1;
        }
        return this;
    }

    /* renamed from: h */
    public void m96130h(int i11) {
        this.f91507h = i11;
    }

    /* renamed from: i */
    public C18075a m96131i(ArrayList arrayList) {
        this.f91503d = arrayList;
        return this;
    }

    /* renamed from: j */
    public void m96132j(int i11) {
        this.f91506g = i11;
    }

    public String toString() {
        return this.f91500a + "|" + this.f91501b + "|" + this.f91502c + "|" + this.f91505f + "|" + this.f91504e + "|" + this.f91506g + "|" + this.f91507h + "\n";
    }
}

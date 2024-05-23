package hm0;

/* renamed from: hm0.c */
/* loaded from: classes7.dex */
public class C20096c {

    /* renamed from: a */
    public int f98836a;

    /* renamed from: b */
    public String f98837b;

    /* renamed from: c */
    public String f98838c;

    /* renamed from: d */
    public int f98839d;

    /* renamed from: e */
    public String f98840e;

    public C20096c(int i11, String str) {
        this(i11, str, i11, str);
    }

    /* renamed from: a */
    public int m104489a() {
        return this.f98839d;
    }

    /* renamed from: b */
    public String m104490b() {
        return this.f98838c;
    }

    /* renamed from: c */
    public int m104491c() {
        return this.f98836a;
    }

    /* renamed from: d */
    public String m104492d() {
        return this.f98837b;
    }

    /* renamed from: e */
    public String m104493e() {
        return this.f98840e;
    }

    /* renamed from: f */
    public void m104494f(String str) {
        this.f98838c = str;
    }

    public String toString() {
        return String.format("error_code:%d - error_message:%s", Integer.valueOf(this.f98839d), this.f98840e);
    }

    public C20096c(int i11, String str, int i12) {
        this(i11, str, i12, str);
    }

    public C20096c(int i11, String str, int i12, String str2) {
        this.f98838c = "";
        this.f98836a = i11;
        this.f98837b = str;
        this.f98839d = i12;
        this.f98840e = str2;
    }
}

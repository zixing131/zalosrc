package ko0;

import com.zing.zalo.control.ContactProfile;

/* renamed from: ko0.d */
/* loaded from: classes7.dex */
public class C21789d {

    /* renamed from: a */
    public ContactProfile f105756a;

    /* renamed from: b */
    public boolean f105757b;

    /* renamed from: c */
    public boolean f105758c;

    /* renamed from: d */
    public int f105759d;

    /* renamed from: e */
    public boolean f105760e;

    /* renamed from: f */
    public String f105761f;

    /* renamed from: g */
    public String f105762g;

    /* renamed from: h */
    public CharSequence f105763h;

    public C21789d(int i11) {
        this.f105762g = "";
        this.f105759d = i11;
    }

    /* renamed from: a */
    public int m112452a() {
        return this.f105759d;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C21789d) && ((C21789d) obj).f105762g == this.f105762g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f105762g;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C21789d(int i11, boolean z11, String str) {
        this.f105762g = "";
        this.f105759d = i11;
        this.f105760e = z11;
        this.f105761f = str;
    }

    public C21789d(String str, int i11) {
        this.f105762g = str;
        this.f105759d = i11;
    }
}

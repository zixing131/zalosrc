package p187gk;

import com.zing.zalo.p062db.C7960e;
import java.util.List;

/* renamed from: gk.f */
/* loaded from: classes3.dex */
public class C19469f implements InterfaceC19467d {

    /* renamed from: a */
    private final int f96611a;

    public C19469f(int i11) {
        this.f96611a = i11;
    }

    @Override // p187gk.InterfaceC19467d
    /* renamed from: a */
    public String mo101796a(String str, int i11) {
        String m42252R5 = C7960e.m41971c6().m42252R5(str, i11);
        if (m42252R5 != null && m42252R5.length() < 100000) {
            return m42252R5;
        }
        return "";
    }

    @Override // p187gk.InterfaceC19467d
    /* renamed from: b */
    public void mo101797b(String str, String str2, int i11) {
        C7960e.m41971c6().m42160J3(str, i11);
        if (str2 != null && str2.length() < 100000) {
            C7960e.m41971c6().m42380e8(str, i11, str2);
            C7960e.m41971c6().m42392fb(i11, this.f96611a);
        }
    }

    @Override // p187gk.InterfaceC19467d
    /* renamed from: c */
    public int mo101798c() {
        return this.f96611a;
    }

    @Override // p187gk.InterfaceC19467d
    /* renamed from: d */
    public List mo101799d(int i11) {
        return C7960e.m41971c6().m42442k6(i11);
    }
}

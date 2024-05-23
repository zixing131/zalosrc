package t00;

import com.zing.zalo.AbstractC8020f0;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;

/* renamed from: t00.c */
/* loaded from: classes4.dex */
public class C26446c {

    /* renamed from: a */
    private String f125634a;

    /* renamed from: b */
    private int f125635b;

    /* renamed from: c */
    private boolean f125636c;

    /* renamed from: d */
    private boolean f125637d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t00.c$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        static final C26446c f125638a = new C26446c();
    }

    /* renamed from: b */
    public static C26446c m136326b() {
        return a.f125638a;
    }

    /* renamed from: a */
    public String m136327a() {
        return this.f125634a;
    }

    /* renamed from: c */
    public int m136328c() {
        return this.f125635b;
    }

    /* renamed from: d */
    public boolean m136329d() {
        return this.f125635b == 1;
    }

    /* renamed from: e */
    public boolean m136330e() {
        return this.f125636c;
    }

    /* renamed from: f */
    public boolean m136331f() {
        return this.f125637d;
    }

    /* renamed from: g */
    public void m136332g() {
        this.f125634a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_accept_friend);
    }

    /* renamed from: h */
    public void m136333h(boolean z11) {
        this.f125636c = z11;
        AbstractC23309i.m121018Hm(z11);
    }

    /* renamed from: i */
    public void m136334i(boolean z11) {
        this.f125637d = z11;
    }

    /* renamed from: j */
    public void m136335j(int i11) {
        this.f125635b = i11;
        m136332g();
        AbstractC23309i.m121062It(i11);
    }

    private C26446c() {
        this.f125635b = AbstractC23309i.m121746b9();
        this.f125636c = AbstractC23309i.m122118l3();
        this.f125637d = AbstractC23309i.m120777B3() == 1;
        m136332g();
    }
}

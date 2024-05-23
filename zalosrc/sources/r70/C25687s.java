package r70;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r70.s */
/* loaded from: classes5.dex */
public final class C25687s extends AbstractC25672d {

    /* renamed from: c */
    private final String f122674c;

    /* renamed from: d */
    private final String f122675d;

    /* renamed from: e */
    private final String f122676e;

    /* renamed from: f */
    private List f122677f;

    /* renamed from: g */
    private boolean f122678g;

    /* renamed from: h */
    private boolean f122679h;

    /* renamed from: i */
    private String f122680i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25687s(String str, String str2, String str3) {
        super(0);
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "dpn");
        AbstractC19074t.m100208f(str3, "status");
        this.f122674c = str;
        this.f122675d = str2;
        this.f122676e = str3;
        this.f122677f = new ArrayList();
        this.f122680i = "";
    }

    /* renamed from: d */
    public final String m132587d() {
        return this.f122680i;
    }

    /* renamed from: e */
    public final String m132588e() {
        return this.f122675d;
    }

    /* renamed from: f */
    public final boolean m132589f() {
        return this.f122679h;
    }

    /* renamed from: g */
    public final List m132590g() {
        return this.f122677f;
    }

    /* renamed from: h */
    public final boolean m132591h() {
        return this.f122678g;
    }

    /* renamed from: i */
    public final String m132592i() {
        return this.f122676e;
    }

    /* renamed from: j */
    public final String m132593j() {
        return this.f122674c;
    }

    /* renamed from: k */
    public final void m132594k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f122680i = str;
    }

    /* renamed from: l */
    public final void m132595l(boolean z11) {
        this.f122679h = z11;
    }

    /* renamed from: m */
    public final void m132596m(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f122677f = list;
    }

    /* renamed from: n */
    public final void m132597n(boolean z11) {
        this.f122678g = z11;
    }
}

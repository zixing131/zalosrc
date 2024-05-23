package xe0;

import ve0.InterfaceC27993b;
import ye0.C30919a;
import ye0.C30920b;
import ze0.C31798d;
import ze0.C31806l;
import ze0.InterfaceC31797c;
import ze0.InterfaceC31808n;

/* renamed from: xe0.a */
/* loaded from: classes4.dex */
public final class C29607a {

    /* renamed from: g */
    private static final C29607a f136703g = new C29607a();

    /* renamed from: a */
    private final C30920b f136704a;

    /* renamed from: b */
    private final InterfaceC27993b f136705b;

    /* renamed from: c */
    private final InterfaceC31808n f136706c;

    /* renamed from: d */
    private final InterfaceC31808n f136707d;

    /* renamed from: e */
    private final InterfaceC31808n f136708e;

    /* renamed from: f */
    private final InterfaceC31797c f136709f;

    private C29607a() {
        C30920b m150208c = C30920b.m150208c();
        this.f136704a = m150208c;
        C30919a c30919a = new C30919a();
        this.f136705b = c30919a;
        this.f136706c = new C31806l("dataphonenumber/PhoneNumberMetadataProto");
        this.f136707d = new C31806l("dataphonenumber/ShortNumberMetadataProto");
        C31806l c31806l = new C31806l("dataphonenumber/PhoneNumberAlternateFormatsProto");
        this.f136708e = c31806l;
        this.f136709f = new C31798d(c31806l, c30919a, m150208c);
    }

    /* renamed from: a */
    public static C29607a m147172a() {
        return f136703g;
    }

    /* renamed from: b */
    public InterfaceC27993b m147173b() {
        return this.f136705b;
    }

    /* renamed from: c */
    public C30920b m147174c() {
        return this.f136704a;
    }

    /* renamed from: d */
    public InterfaceC31808n m147175d() {
        return this.f136706c;
    }
}

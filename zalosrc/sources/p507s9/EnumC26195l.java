package p507s9;

import com.google.protobuf.AbstractC6830s;

/* renamed from: s9.l */
/* loaded from: classes3.dex */
public enum EnumC26195l implements AbstractC6830s.a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);


    /* renamed from: s */
    private static final AbstractC6830s.b f124477s = new AbstractC6830s.b() { // from class: s9.l.a
    };

    /* renamed from: p */
    private final int f124479p;

    /* renamed from: s9.l$b */
    /* loaded from: classes3.dex */
    private static final class b implements AbstractC6830s.c {

        /* renamed from: a */
        static final AbstractC6830s.c f124480a = new b();

        private b() {
        }
    }

    EnumC26195l(int i11) {
        this.f124479p = i11;
    }

    /* renamed from: b */
    public static EnumC26195l m134713b(int i11) {
        if (i11 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i11 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    /* renamed from: c */
    public static AbstractC6830s.c m134714c() {
        return b.f124480a;
    }

    @Override // com.google.protobuf.AbstractC6830s.a
    /* renamed from: a */
    public final int mo35139a() {
        return this.f124479p;
    }
}

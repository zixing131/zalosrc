package p507s9;

import com.google.protobuf.AbstractC6830s;

/* renamed from: s9.d */
/* loaded from: classes3.dex */
public enum EnumC26187d implements AbstractC6830s.a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* renamed from: u */
    private static final AbstractC6830s.b f124444u = new AbstractC6830s.b() { // from class: s9.d.a
    };

    /* renamed from: p */
    private final int f124446p;

    /* renamed from: s9.d$b */
    /* loaded from: classes3.dex */
    private static final class b implements AbstractC6830s.c {

        /* renamed from: a */
        static final AbstractC6830s.c f124447a = new b();

        private b() {
        }
    }

    EnumC26187d(int i11) {
        this.f124446p = i11;
    }

    /* renamed from: b */
    public static AbstractC6830s.c m134563b() {
        return b.f124447a;
    }

    @Override // com.google.protobuf.AbstractC6830s.a
    /* renamed from: a */
    public final int mo35139a() {
        return this.f124446p;
    }
}

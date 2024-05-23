package ru;

import android.renderscript.RenderScript;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24855l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ru.a */
/* loaded from: classes4.dex */
public final class C25978a {

    /* renamed from: a */
    public static final C25978a f123943a = new C25978a();

    /* renamed from: b */
    private static final InterfaceC24854k f123944b = AbstractC24855l.m129208a(a.f123945q);

    /* renamed from: ru.a$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f123945q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final RenderScript mo12V4() {
            return RenderScript.create(CoreUtility.getAppContext());
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f123945q);
        f123944b = m129210a;
    }

    private C25978a() {
    }

    /* renamed from: a */
    public static final RenderScript m133807a() {
        return f123943a.m133808b();
    }

    /* renamed from: b */
    private final RenderScript m133808b() {
        Object value = f123944b.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RenderScript) value;
    }
}

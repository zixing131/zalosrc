package p515t2;

import android.content.Context;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p595w2.InterfaceC28696c;

/* renamed from: t2.n */
/* loaded from: classes.dex */
public final class C26463n {

    /* renamed from: a */
    private final AbstractC26456g f125657a;

    /* renamed from: b */
    private final C26452c f125658b;

    /* renamed from: c */
    private final AbstractC26456g f125659c;

    /* renamed from: d */
    private final AbstractC26456g f125660d;

    public C26463n(Context context, InterfaceC28696c interfaceC28696c, AbstractC26456g abstractC26456g, C26452c c26452c, AbstractC26456g abstractC26456g2, AbstractC26456g abstractC26456g3) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC28696c, "taskExecutor");
        AbstractC19074t.m100208f(abstractC26456g, "batteryChargingTracker");
        AbstractC19074t.m100208f(c26452c, "batteryNotLowTracker");
        AbstractC19074t.m100208f(abstractC26456g2, "networkStateTracker");
        AbstractC19074t.m100208f(abstractC26456g3, "storageNotLowTracker");
        this.f125657a = abstractC26456g;
        this.f125658b = c26452c;
        this.f125659c = abstractC26456g2;
        this.f125660d = abstractC26456g3;
    }

    /* renamed from: a */
    public final AbstractC26456g m136373a() {
        return this.f125657a;
    }

    /* renamed from: b */
    public final C26452c m136374b() {
        return this.f125658b;
    }

    /* renamed from: c */
    public final AbstractC26456g m136375c() {
        return this.f125659c;
    }

    /* renamed from: d */
    public final AbstractC26456g m136376d() {
        return this.f125660d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C26463n(Context context, InterfaceC28696c interfaceC28696c, AbstractC26456g abstractC26456g, C26452c c26452c, AbstractC26456g abstractC26456g2, AbstractC26456g abstractC26456g3, int i11, AbstractC19060k abstractC19060k) {
        this(context, interfaceC28696c, r3, r4, r5, r6);
        AbstractC26456g abstractC26456g4;
        C26452c c26452c2;
        AbstractC26456g abstractC26456g5;
        AbstractC26456g abstractC26456g6;
        if ((i11 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            AbstractC19074t.m100207e(applicationContext, "context.applicationContext");
            abstractC26456g4 = new C26450a(applicationContext, interfaceC28696c);
        } else {
            abstractC26456g4 = abstractC26456g;
        }
        if ((i11 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            AbstractC19074t.m100207e(applicationContext2, "context.applicationContext");
            c26452c2 = new C26452c(applicationContext2, interfaceC28696c);
        } else {
            c26452c2 = c26452c;
        }
        if ((i11 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            AbstractC19074t.m100207e(applicationContext3, "context.applicationContext");
            abstractC26456g5 = AbstractC26459j.m136366a(applicationContext3, interfaceC28696c);
        } else {
            abstractC26456g5 = abstractC26456g2;
        }
        if ((i11 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            AbstractC19074t.m100207e(applicationContext4, "context.applicationContext");
            abstractC26456g6 = new C26461l(applicationContext4, interfaceC28696c);
        } else {
            abstractC26456g6 = abstractC26456g3;
        }
    }
}

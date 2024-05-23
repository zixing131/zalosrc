package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import p345m9.C22961h;
import p384o9.AbstractC24137g;
import p384o9.C24136f;
import p441q9.C25197k;
import xn0.AbstractC30177g;
import xn0.InterfaceC30171a;
import xn0.InterfaceC30172b;

/* loaded from: classes3.dex */
public class FirebasePerfOkHttpClient {
    /* renamed from: a */
    static void m34185a(AbstractC30177g abstractC30177g, C22961h c22961h, long j11, long j12) {
        throw null;
    }

    @Keep
    public static void enqueue(InterfaceC30171a interfaceC30171a, InterfaceC30172b interfaceC30172b) {
        Timer timer = new Timer();
        interfaceC30171a.m148810Z(new C24136f(interfaceC30172b, C25197k.m130415k(), timer, timer.m34294e()));
    }

    @Keep
    public static AbstractC30177g execute(InterfaceC30171a interfaceC30171a) throws IOException {
        C22961h m117692c = C22961h.m117692c(C25197k.m130415k());
        Timer timer = new Timer();
        long m34294e = timer.m34294e();
        try {
            interfaceC30171a.m148811d();
            m34185a(null, m117692c, m34294e, timer.m34292c());
            return null;
        } catch (IOException e11) {
            interfaceC30171a.m148809M();
            m117692c.m117704n(m34294e);
            m117692c.m117708t(timer.m34292c());
            AbstractC24137g.m126110d(m117692c);
            throw e11;
        }
    }
}

package com.zing.zalo.media.download;

import com.zing.zalo.media.download.AbstractC9010h;
import java.util.List;

/* renamed from: com.zing.zalo.media.download.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9003a {

    /* renamed from: a */
    private static AbstractC9003a f48179a;

    /* renamed from: com.zing.zalo.media.download.a$a */
    /* loaded from: classes4.dex */
    public interface a extends InterfaceC9009g {
        /* renamed from: a */
        void mo48123a(int i11);

        /* renamed from: c */
        void mo48124c();
    }

    /* renamed from: c */
    public static AbstractC9003a m48119c() {
        AbstractC9003a abstractC9003a;
        synchronized (AbstractC9003a.class) {
            try {
                if (f48179a == null) {
                    f48179a = new C9006d();
                }
                abstractC9003a = f48179a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC9003a;
    }

    /* renamed from: a */
    public abstract void mo48120a(AbstractC9007e abstractC9007e);

    /* renamed from: b */
    public abstract List mo48121b(AbstractC9010h.b bVar);

    /* renamed from: d */
    public abstract void mo48122d(AbstractC9007e abstractC9007e, AbstractC9010h.b bVar, a aVar);
}

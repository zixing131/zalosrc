package je0;

import fn0.AbstractC19074t;
import he0.InterfaceC20026a;
import hu.C20128b;
import java.util.List;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import p185gc.AbstractC19383g;
import p213hl.C20086b;
import p248iy.AbstractC20887g;
import p405ov.C24561c;
import za0.C31747a;

/* renamed from: je0.a */
/* loaded from: classes4.dex */
public final class C21230a extends AbstractC19383g {

    /* renamed from: a */
    private final C20086b f103506a;

    /* renamed from: b */
    private InterfaceC20026a f103507b;

    /* renamed from: je0.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC20026a f103508a;

        public a(InterfaceC20026a interfaceC20026a) {
            AbstractC19074t.m100208f(interfaceC20026a, "loadComponentDataCallback");
            this.f103508a = interfaceC20026a;
        }

        /* renamed from: a */
        public final InterfaceC20026a m110020a() {
            return this.f103508a;
        }
    }

    public C21230a(C20086b c20086b) {
        AbstractC19074t.m100208f(c20086b, "storageUsageRepository");
        this.f103506a = c20086b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        this.f103507b = aVar.m110020a();
        try {
            List m104434e = this.f103506a.m104434e();
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC23041d2.m118202a(m104434e);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C24561c.m127942b("ClearCacheData", "Cache files cleaned! Deleted size: " + this.f103506a.m104437h() + ". Retained size: " + C20128b.m104775v());
            C31747a.m152705d(this.f103506a.m104437h(), currentTimeMillis2);
            AbstractC20887g.m109217D(20600, null, 2, null);
            InterfaceC20026a interfaceC20026a = this.f103507b;
            if (interfaceC20026a != null) {
                interfaceC20026a.mo17105a();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            AbstractC20887g.m109244v(20600, null, 2, null);
            InterfaceC20026a interfaceC20026a2 = this.f103507b;
            if (interfaceC20026a2 != null) {
                interfaceC20026a2.mo17106b();
            }
        }
    }
}

package lb;

import am.AbstractC0906d0;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import eg0.C18427b;
import fg0.ThreadFactoryC18928a;
import gw.C19669z;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lb.C22388a;
import mg.C23288a;
import p142ey.C18644n;
import p304ks.C21928n;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p716zh.C31901e8;
import vg.C28203u6;
import wd0.C28931k;
import xd0.C29593i;

/* renamed from: lb.d */
/* loaded from: classes3.dex */
public class C22391d {

    /* renamed from: b */
    private static C22391d f109626b;

    /* renamed from: a */
    private final ExecutorService f109627a = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("NotifyChangePhone"));

    /* renamed from: c */
    public static synchronized C22391d m115801c() {
        C22391d c22391d;
        synchronized (C22391d.class) {
            try {
                if (f109626b == null) {
                    synchronized (C22391d.class) {
                        try {
                            if (f109626b == null) {
                                f109626b = new C22391d();
                            }
                        } finally {
                        }
                    }
                }
                c22391d = f109626b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c22391d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m115803e(C22388a c22388a, String str) {
        C22388a.a aVar;
        boolean z11;
        int i11;
        try {
            if (!c22388a.m115796b() || !c22388a.m115795a() || (aVar = c22388a.f109617e) == null || TextUtils.isEmpty(aVar.f109618a)) {
                return;
            }
            long m103087c = AbstractC23306f.m120599M0().m103087c();
            if (!aVar.m115798a()) {
                Conversation m103201R = C19669z.m103146Y().m103201R(str);
                if (m103201R != null) {
                    m103087c = m103201R.m41008l();
                } else {
                    m103087c = 0;
                }
            }
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, str), 20).m95382r(aVar.f109618a).m95387w(aVar.f109619b).m95359K(m103087c).m95365a();
            m95365a.m94951M9();
            if (aVar.m115798a() && ((i11 = aVar.f109621d) == 1 || i11 == 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AbstractC23309i.m122564x2() == 1 && aVar.m115798a()) {
                m95365a.m95210na(aVar.f109621d);
            }
            AbstractC23306f.m120681k0().m101500a(new C29593i.a(str, m95365a, new C28931k.d(z11, false, aVar.m115798a())));
            AbstractC23306f.m120724x().m99492f(m95365a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m115804f(final C22388a c22388a) {
        ExecutorService executorService = this.f109627a;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: lb.b
                @Override // java.lang.Runnable
                public final void run() {
                    C22391d.this.m115802d(c22388a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void m115802d(final C22388a c22388a) {
        if (c22388a != null) {
            try {
                if (c22388a.m115797c()) {
                    final String valueOf = String.valueOf(c22388a.f109613a);
                    String str = c22388a.f109615c;
                    C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), valueOf);
                    if (m2801g != null) {
                        m2801g.m153291A(0L);
                    }
                    C21928n.m114372h().m114385o(valueOf, str);
                    C28203u6 c28203u6 = C28203u6.f131407a;
                    c28203u6.m141821t(valueOf, str);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(valueOf);
                    if (m98552o != null && !TextUtils.isEmpty(m98552o.f42455y) && m98552o.f42455y.equals(str)) {
                        m98552o.m40417m1("");
                    }
                    ContactProfile m141809c = c28203u6.m141809c(valueOf);
                    if (m141809c != null && !TextUtils.isEmpty(m141809c.f42455y) && m141809c.f42455y.equals(str)) {
                        m141809c.m40417m1("");
                    }
                    C23288a.f113033a.mo13474a(new C18427b(valueOf, new Runnable() { // from class: lb.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22391d.m115803e(C22388a.this, valueOf);
                        }
                    }));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}

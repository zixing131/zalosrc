package ci;

import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import android.util.LruCache;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.C20131e;
import java.io.File;
import me0.AbstractC23238v2;
import me0.AbstractC23258x2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import p716zh.C32042o;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ci.z */
/* loaded from: classes3.dex */
public final class C3531z {

    /* renamed from: a */
    public static final C3531z f14843a = new C3531z();

    /* renamed from: b */
    private static final InterfaceC24854k f14844b;

    /* renamed from: c */
    private static final String f14845c;

    /* renamed from: d */
    private static final LruCache f14846d;

    /* renamed from: ci.z$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f14847q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(MainApplication.Companion.m35500c());
        }
    }

    /* renamed from: ci.z$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ MediaStoreItem f14848a;

        /* renamed from: b */
        final /* synthetic */ String f14849b;

        b(MediaStoreItem mediaStoreItem, String str) {
            this.f14848a = mediaStoreItem;
            this.f14849b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7956b.b bVar = C7956b.Companion;
            C17945a0 m41553q = bVar.m41573b().m41553q(this.f14848a.m40571M());
            if (m41553q != null && !TextUtils.isEmpty(m41553q.m94983Q3())) {
                m41553q.m94934Ka(this.f14849b);
                C7956b m41573b = bVar.m41573b();
                String m95249s4 = m41553q.m95249s4();
                AbstractC19074t.m100207e(m95249s4, "getRelativePath(...)");
                m41573b.m41569z0(m41553q, m95249s4);
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f14847q);
        f14844b = m129210a;
        f14845c = C20131e.f99303a.m104947d();
        f14846d = new LruCache(20);
    }

    private C3531z() {
    }

    /* renamed from: b */
    private final boolean m17889b(MediaStoreItem mediaStoreItem) {
        boolean m127120J;
        String m95090b5 = mediaStoreItem.m40599m().m95090b5();
        AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
        if (m95090b5.length() <= 0) {
            return false;
        }
        String m94983Q3 = mediaStoreItem.m40599m().m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        if (m94983Q3.length() != 0) {
            String m94983Q32 = mediaStoreItem.m40599m().m94983Q3();
            AbstractC19074t.m100207e(m94983Q32, "getLocalpath(...)");
            m127120J = AbstractC24341v.m127120J(m94983Q32, f14845c, false, 2, null);
            if (!m127120J) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private final void m17890d(MediaStoreItem mediaStoreItem, String str) {
        C0824j.m2153b(new b(mediaStoreItem, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m17891f(MediaStoreItem mediaStoreItem, String str, String str2) {
        File m123603i;
        AbstractC19074t.m100208f(mediaStoreItem, "$item");
        AbstractC19074t.m100208f(str, "$originalUrl");
        AbstractC19074t.m100208f(str2, "$conversationId");
        try {
            System.currentTimeMillis();
            C3531z c3531z = f14843a;
            if (!c3531z.m17889b(mediaStoreItem)) {
                return;
            }
            LruCache lruCache = f14846d;
            if (lruCache.get(mediaStoreItem.m40599m().m95090b5()) == null && (m123603i = c3531z.m17892c().m123603i(str)) != null && m123603i.exists() && m123603i.length() != 0 && AbstractC23258x2.m119958q(m123603i.getPath())) {
                C32042o c32042o = C32042o.f147549a;
                MessageId m40571M = mediaStoreItem.m40571M();
                String m95090b5 = mediaStoreItem.m40599m().m95090b5();
                AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                String m154589e = c32042o.m154589e(str2, m40571M, m95090b5);
                File file = new File(m154589e);
                if (file.exists() && file.length() > 0) {
                    lruCache.put(mediaStoreItem.m40599m().m95090b5(), m154589e);
                    mediaStoreItem.m40599m().m94934Ka(m154589e);
                } else {
                    AbstractC23238v2.m119717b(m123603i, file);
                    lruCache.put(mediaStoreItem.m40599m().m95090b5(), m154589e);
                    mediaStoreItem.m40599m().m94934Ka(m154589e);
                    c3531z.m17890d(mediaStoreItem, m154589e);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: c */
    public final C23528a m17892c() {
        return (C23528a) f14844b.getValue();
    }

    /* renamed from: e */
    public final void m17893e(final MediaStoreItem mediaStoreItem, final String str) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        AbstractC19074t.m100208f(str, "originalUrl");
        if (!AbstractC25495a.m132079d(mediaStoreItem.m40599m().mo95039W2())) {
            return;
        }
        final String mo95039W2 = mediaStoreItem.m40599m().mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (m17889b(mediaStoreItem) && f14846d.get(str) == null) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ci.y
                @Override // java.lang.Runnable
                public final void run() {
                    C3531z.m17891f(MediaStoreItem.this, str, mo95039W2);
                }
            });
        }
    }
}

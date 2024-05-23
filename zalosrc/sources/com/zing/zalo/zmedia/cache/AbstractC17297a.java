package com.zing.zalo.zmedia.cache;

import com.zing.zalo.media.download.AbstractC9003a;
import com.zing.zalo.media.download.AbstractC9010h;
import com.zing.zalo.zmedia.cache.CacheException;
import com.zing.zalo.zmedia.view.C17391z;
import hu.AbstractC20130d;
import java.io.File;
import mm0.AbstractC23352g;
import p587vv.C28631a;

/* renamed from: com.zing.zalo.zmedia.cache.a */
/* loaded from: classes7.dex */
public abstract class AbstractC17297a {

    /* renamed from: a */
    public static final /* synthetic */ int f88138a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.cache.a$a */
    /* loaded from: classes7.dex */
    public class a implements AbstractC9003a.a {

        /* renamed from: a */
        final /* synthetic */ b f88139a;

        /* renamed from: b */
        final /* synthetic */ C17391z f88140b;

        a(b bVar, C17391z c17391z) {
            this.f88139a = bVar;
            this.f88140b = c17391z;
        }

        @Override // com.zing.zalo.media.download.AbstractC9003a.a
        /* renamed from: a */
        public void mo48123a(int i11) {
            int i12 = AbstractC17297a.f88138a;
            try {
                b bVar = this.f88139a;
                if (bVar != null) {
                    bVar.mo39665cH(this.f88140b, new CacheException(CacheException.EnumC17296a.UNKNOWN));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.media.download.InterfaceC9009g
        /* renamed from: b */
        public void mo48147b(int i11) {
            int i12 = AbstractC17297a.f88138a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("transferred:");
            sb2.append(i11);
        }

        @Override // com.zing.zalo.media.download.AbstractC9003a.a
        /* renamed from: c */
        public void mo48124c() {
            int i11 = AbstractC17297a.f88138a;
            try {
                b bVar = this.f88139a;
                if (bVar != null) {
                    bVar.mo39667tE(this.f88140b);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.cache.a$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: cH */
        void mo39665cH(C17391z c17391z, CacheException cacheException);

        /* renamed from: qH */
        void mo39666qH(C17391z c17391z);

        /* renamed from: tE */
        void mo39667tE(C17391z c17391z);
    }

    /* renamed from: a */
    public static void m92223a() {
        C28631a.m143198e();
        AbstractC9010h.m48152e();
    }

    /* renamed from: b */
    public static String m92224b(String str) {
        return AbstractC23352g.m122788d(str);
    }

    /* renamed from: c */
    public static String m92225c(String str) {
        return AbstractC20130d.m104904x0().getAbsolutePath() + File.separator + str + ".mp4";
    }

    /* renamed from: d */
    public static void m92226d(C17391z c17391z, b bVar) {
        if (c17391z == null) {
            return;
        }
        AbstractC9010h.a m48150c = AbstractC9010h.m48150c(c17391z.f88620c, new a(bVar, c17391z));
        if (bVar != null) {
            if (m48150c.m48161h()) {
                bVar.mo39667tE(c17391z);
            } else {
                bVar.mo39666qH(c17391z);
            }
        }
    }
}

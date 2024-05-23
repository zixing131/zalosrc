package p591vz;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.Map;
import km0.AbstractC21767b;
import km0.EnumC21773h;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import org.json.JSONObject;
import qm0.AbstractC25363p0;
import uz.C27386b;

/* renamed from: vz.a */
/* loaded from: classes4.dex */
public final class C28677a {

    /* renamed from: vz.a$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo138705a(C27386b c27386b);
    }

    /* renamed from: vz.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC21769d {

        /* renamed from: a */
        final /* synthetic */ a f133123a;

        b(a aVar) {
            this.f133123a = aVar;
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: a */
        public void mo13651a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            this.f133123a.mo138705a(null);
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: b */
        public void mo13652b(EnumC21773h enumC21773h, Object obj) {
            AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(obj, "result");
            if (enumC21773h == EnumC21773h.JSON) {
                this.f133123a.mo138705a(new C27386b((JSONObject) obj));
            }
        }
    }

    /* renamed from: a */
    public final void m143636a(a aVar) {
        Map m131404i;
        String str;
        AbstractC19074t.m100208f(aVar, "listener");
        b bVar = new b(aVar);
        InterfaceC21766a m112296a = AbstractC21767b.f105718a.m112296a();
        m131404i = AbstractC25363p0.m131404i();
        str = AbstractC28678b.f133124a;
        m112296a.mo1367c(str, -1, false, m131404i, bVar);
    }
}

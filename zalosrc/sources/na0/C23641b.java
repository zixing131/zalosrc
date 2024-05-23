package na0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import km0.AbstractC21767b;
import km0.EnumC21773h;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import me0.AbstractC23161o1;
import org.json.JSONObject;
import pm0.C24860q;

/* renamed from: na0.b */
/* loaded from: classes6.dex */
public final class C23641b implements InterfaceC23640a {

    /* renamed from: na0.b$a */
    /* loaded from: classes6.dex */
    public static final class a implements InterfaceC21769d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f114526a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f114527b;

        a(InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l) {
            this.f114526a = interfaceC18509p;
            this.f114527b = interfaceC18505l;
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: a */
        public void mo13651a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            this.f114526a.mo240pC(Integer.valueOf(i11), str);
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: b */
        public void mo13652b(EnumC21773h enumC21773h, Object obj) {
            AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(obj, "result");
            this.f114527b.mo205i9((JSONObject) obj);
        }
    }

    @Override // na0.InterfaceC23640a
    /* renamed from: a */
    public void mo123880a(List list, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(list, "listPrivacySetting");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        a aVar = new a(interfaceC18509p, interfaceC18505l);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C24860q c24860q = (C24860q) it.next();
                byteArrayOutputStream.write(AbstractC17522a.m93345h(((Number) c24860q.m129215c()).intValue()));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(((Number) c24860q.m129216d()).intValue()));
            }
            InterfaceC21766a m112296a = AbstractC21767b.f105718a.m112296a();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC19074t.m100207e(byteArray, "toByteArray(...)");
            m112296a.mo1366b(277, 0, byteArray, aVar);
        } catch (Exception e11) {
            String m119318c = AbstractC23161o1.m119318c(112, e11.toString());
            AbstractC19074t.m100207e(m119318c, "getErrorMsgFromCode(...)");
            interfaceC18509p.mo240pC(112, m119318c);
        }
    }
}

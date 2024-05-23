package p444qd;

import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import fn0.AbstractC19074t;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import km0.AbstractC21767b;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import me0.AbstractC23161o1;
import p480rd.C25734e;
import p620wt.AbstractC29239n;
import pm0.C24848g0;

/* renamed from: qd.b */
/* loaded from: classes3.dex */
public final class C25224b implements InterfaceC25223a {
    @Override // p444qd.InterfaceC25223a
    /* renamed from: a */
    public void mo130487a(C25734e c25734e, InterfaceC21769d interfaceC21769d) {
        C24848g0 c24848g0;
        Set keySet;
        AbstractC19074t.m100208f(c25734e, "eventTimeRangeRequest");
        AbstractC19074t.m100208f(interfaceC21769d, "networkRequestListener");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(c25734e.m132845c()));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(c25734e.m132847e()));
            byteArrayOutputStream.write(AbstractC17522a.m93346i(c25734e.m132846d()));
            Map m132844b = c25734e.m132844b();
            if (m132844b != null && (keySet = m132844b.keySet()) != null) {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(keySet.size()));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC29239n.m146002a((String) it.next(), 0)));
                }
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
            }
            InterfaceC21766a m112296a = AbstractC21767b.f105718a.m112296a();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC19074t.m100207e(byteArray, "toByteArray(...)");
            m112296a.mo1366b(365, 0, byteArray, interfaceC21769d);
        } catch (Exception e11) {
            String m119318c = AbstractC23161o1.m119318c(112, e11.toString());
            AbstractC19074t.m100207e(m119318c, "getErrorMsgFromCode(...)");
            interfaceC21769d.mo13651a(112, m119318c);
        }
    }
}

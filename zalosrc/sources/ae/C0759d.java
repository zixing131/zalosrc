package ae;

import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import fn0.AbstractC19074t;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import p609wh.C29037t0;

/* renamed from: ae.d */
/* loaded from: classes3.dex */
public final class C0759d extends AbstractC0756a {
    /* renamed from: k */
    public final void m1356k(List list, String str) {
        AbstractC19074t.m100208f(list, "listInfoPull");
        AbstractC19074t.m100208f(str, "trackingLog");
        C29037t0 m1337e = m1337e();
        m1337e.f103775r = 2;
        RequestPacket m1336d = m1336d();
        m1336d.m93295q((short) 2131);
        m1336d.m93275F((byte) 0);
        ByteArrayOutputStream m1333g = AbstractC0756a.m1333g(this, str, 0, 2, null);
        m1333g.write(AbstractC17522a.m93344g(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0763h c0763h = (C0763h) it.next();
            m1333g.write(AbstractC17522a.m93344g(c0763h.m1379a()));
            m1333g.write(AbstractC17522a.m93344g(c0763h.m1380b().size()));
            Iterator it2 = c0763h.m1380b().iterator();
            while (it2.hasNext()) {
                m1333g.write(AbstractC17522a.m93344g(((Number) it2.next()).intValue()));
            }
        }
        m1336d.m93303y(m1333g.toByteArray());
        m1337e.m110313i0(m1336d);
        m1340i(m1337e);
    }
}

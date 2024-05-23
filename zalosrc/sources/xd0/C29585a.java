package xd0;

import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17969i0;
import fn0.AbstractC19074t;
import java.util.Map;
import me0.AbstractC23262x6;
import p038bl.C2829a;
import p185gc.AbstractC19384h;
import p348mi.AbstractC23309i;
import p471r3.C25630b;
import p647xj.C29677c;
import p684yk.InterfaceC31005a;

/* renamed from: xd0.a */
/* loaded from: classes4.dex */
public final class C29585a extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC31005a f136535a;

    /* renamed from: xd0.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C17945a0 f136536a;

        public a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            this.f136536a = c17945a0;
        }

        /* renamed from: a */
        public final C17945a0 m147014a() {
            return this.f136536a;
        }
    }

    /* renamed from: xd0.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
    }

    public C29585a(InterfaceC31005a interfaceC31005a) {
        AbstractC19074t.m100208f(interfaceC31005a, "stickerRepo");
        this.f136535a = interfaceC31005a;
    }

    /* renamed from: c */
    private final b m147011c(InterfaceC31005a interfaceC31005a, C17945a0 c17945a0) {
        String m95019U3;
        C29677c mo150742f = interfaceC31005a.mo150742f();
        if (mo150742f == null || !mo150742f.m147611d() || !mo150742f.m147610c() || !AbstractC23309i.m122610yb()) {
            return null;
        }
        if (c17945a0.m95015T7()) {
            if (c17945a0.m95285w4() != null) {
                m95019U3 = c17945a0.m95285w4().m95606h();
            } else {
                m95019U3 = "";
            }
        } else {
            m95019U3 = c17945a0.m95019U3();
        }
        boolean z11 = false;
        if (!TextUtils.equals(c17945a0.m94862C4(), CoreUtility.f89233i) ? mo150742f.m147609b() == 2 || mo150742f.m147609b() == 3 : mo150742f.m147609b() == 1 || mo150742f.m147609b() == 3) {
            z11 = true;
        }
        if (!z11 || TextUtils.isEmpty(m95019U3)) {
            return null;
        }
        Map m147608a = mo150742f.m147608a();
        AbstractC19074t.m100205c(m147608a);
        int m119992e = AbstractC23262x6.m119992e(m147608a.entrySet().iterator(), m95019U3);
        if (m119992e <= -1) {
            return null;
        }
        b bVar = new b();
        Map mo150728A = interfaceC31005a.mo150728A();
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        C2829a.m13677b(mo150728A, mo95039W2, c17945a0.m95029V3().m41045i(), m119992e);
        return bVar;
    }

    /* renamed from: d */
    private final b m147012d(InterfaceC31005a interfaceC31005a, C17945a0 c17945a0) {
        if (!(c17945a0.m94929K2() instanceof C17949b1)) {
            return null;
        }
        C17969i0 m94929K2 = c17945a0.m94929K2();
        AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentSticker");
        C25630b m95397g = ((C17949b1) m94929K2).m95397g();
        if (m95397g == null) {
            return null;
        }
        Map mo150728A = interfaceC31005a.mo150728A();
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        C2829a.m13677b(mo150728A, mo95039W2, c17945a0.m95029V3().m41045i(), m95397g.m132425e());
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b mo13388b(a aVar) {
        b m147011c;
        String str;
        AbstractC19074t.m100208f(aVar, "params");
        C17945a0 m147014a = aVar.m147014a();
        long currentTimeMillis = System.currentTimeMillis();
        if (m147014a.m95110d8()) {
            m147011c = m147012d(this.f136535a, m147014a);
        } else if (!m147014a.m95208n8() && !m147014a.m95015T7()) {
            m147011c = null;
        } else {
            m147011c = m147011c(this.f136535a, m147014a);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (m147011c != null) {
            str = "1";
        } else {
            str = "0";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Exe time: ");
        sb2.append(currentTimeMillis2);
        sb2.append(" - result: ");
        sb2.append(str);
        return m147011c;
    }
}

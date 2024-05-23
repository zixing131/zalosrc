package bj;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dj.C17945a0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p511sw.InterfaceC26392a;
import qm0.AbstractC25370t;

/* renamed from: bj.e */
/* loaded from: classes.dex */
public final class C2821e implements InterfaceC2820d {
    @Override // bj.InterfaceC2820d
    /* renamed from: a */
    public List mo13621a(String str, int i11) {
        AbstractC19074t.m100208f(str, "ownerId");
        return C7956b.Companion.m41573b().m41504D(str, i11);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: b */
    public List mo13622b(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "ownerId");
        return C7956b.Companion.m41573b().m41545k0(str, i11, i12, true);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: c */
    public void mo13623c(String str, List list, int i11) {
        int m131511r;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "messages");
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C17945a0) it.next()).m95029V3());
        }
        C7956b.m41482Q0(C7956b.Companion.m41573b(), str, arrayList, 0, i11, 4, null);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: d */
    public List mo13624d(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "ownerId");
        return C7956b.m41494l0(C7956b.Companion.m41573b(), str, i11, i12, false, 8, null);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: e */
    public long mo13625e(InterfaceC26392a interfaceC26392a) {
        MessageId messageId;
        AbstractC19074t.m100208f(interfaceC26392a, ZinstantMetaConstant.TARGET_VIEWPORT);
        Object itemId = interfaceC26392a.getItemId();
        if (itemId instanceof MessageId) {
            messageId = (MessageId) itemId;
        } else {
            messageId = null;
        }
        if (messageId != null) {
            return C7956b.Companion.m41573b().m41510H(messageId);
        }
        return -2147483648L;
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: f */
    public C17945a0 mo13626f(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        return C7956b.Companion.m41573b().m41533Y(str, j11);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: g */
    public void mo13627g() {
        C7959d.Companion.m41850e().m41802l0();
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: h */
    public Map mo13628h(int i11) {
        return C7959d.Companion.m41850e().m41786g2(i11);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: i */
    public void mo13629i(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        C7959d.Companion.m41850e().m41799k0(str);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: j */
    public C17945a0 mo13630j(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "msgId");
        return C7956b.Companion.m41573b().m41553q(messageId);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: k */
    public long mo13631k(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        return C7956b.Companion.m41573b().m41508G(c17945a0);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: l */
    public boolean mo13632l(String str, long j11, String str2, String str3) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "ownerId");
        C7959d m41850e = C7959d.Companion.m41850e();
        if (str3 == null) {
            str3 = "";
        }
        return m41850e.m41707H1(str, j11, str2, str3);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: m */
    public List mo13633m(String str, int i11) {
        AbstractC19074t.m100208f(str, "ownerId");
        return C7956b.Companion.m41573b().m41512J(str, i11);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: n */
    public void mo13634n(String str, List list, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str2, "path");
        C7956b.Companion.m41573b().m41503C0(str, list, str2);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: o */
    public long mo13635o(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        return C7956b.Companion.m41573b().m41548n(str);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: p */
    public long mo13636p(InterfaceC26392a interfaceC26392a) {
        AbstractC19074t.m100208f(interfaceC26392a, ZinstantMetaConstant.TARGET_VIEWPORT);
        return C7956b.Companion.m41573b().m41500A(interfaceC26392a.mo95039W2(), interfaceC26392a.mo95213o());
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: q */
    public void mo13637q(int i11) {
        C7959d.Companion.m41850e().m41836x0(i11);
    }

    @Override // bj.InterfaceC2820d
    /* renamed from: r */
    public C17945a0 mo13638r(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        return C7956b.Companion.m41573b().m41517M(str);
    }
}

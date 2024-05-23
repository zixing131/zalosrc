package com.zing.zalo.shortvideo.data.utils;

import a10.C0053r;
import com.zing.zalo.shortvideo.data.utils.ZInstantPayload;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import v00.C27417l;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29104l;
import y00.InterfaceC30248b;

/* renamed from: com.zing.zalo.shortvideo.data.utils.c */
/* loaded from: classes5.dex */
public final class C9466c {

    /* renamed from: a */
    private final InterfaceC30248b f50358a = AbstractC28684a.Companion.m143685s();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.data.utils.c$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f50359t;

        /* renamed from: v */
        final /* synthetic */ ZInstantPayload f50361v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ZInstantPayload zInstantPayload, Continuation continuation) {
            super(2, continuation);
            this.f50361v = zInstantPayload;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f50361v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            int m131511r2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f50359t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC30248b interfaceC30248b = C9466c.this.f50358a;
                List m51714b = this.f50361v.m51714b();
                m131511r = AbstractC25370t.m131511r(m51714b, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = m51714b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ZInstantPayload.Entry) it.next()).m51716a());
                }
                this.f50359t = 1;
                obj = interfaceC30248b.mo50552e(arrayList, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Iterable iterable = (Iterable) obj;
            m131511r2 = AbstractC25370t.m131511r(iterable, 10);
            ArrayList arrayList2 = new ArrayList(m131511r2);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C0053r) it2.next()).m157d());
            }
            return new HashSet(arrayList2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: b */
    public final String m51745b(String str) {
        AbstractC19074t.m100208f(str, "input");
        ZInstantPayload zInstantPayload = (ZInstantPayload) C27417l.f129055a.m140384h().m139867d(ZInstantPayload.Companion.serializer(), str);
        HashSet hashSet = (HashSet) BuildersKt.m112532e(Dispatchers.m112680b(), new a(zInstantPayload, null));
        List m51714b = zInstantPayload.m51714b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m51714b) {
            if (hashSet.contains(((ZInstantPayload.Entry) obj).m51716a())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ZInstantPayload.Entry) it.next()).m51717b(true);
        }
        return C27417l.f129055a.m140384h().mo131597b(ZInstantPayload.Companion.serializer(), zInstantPayload);
    }
}

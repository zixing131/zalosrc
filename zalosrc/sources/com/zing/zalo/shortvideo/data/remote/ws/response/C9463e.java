package com.zing.zalo.shortvideo.data.remote.ws.response;

import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import h10.C19710k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p10.AbstractC24599c;
import p10.EnumC24604h;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;

/* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.e */
/* loaded from: classes5.dex */
public final class C9463e extends AbstractC24599c {

    /* renamed from: b */
    private final InteractEventResponse f50353b;

    public C9463e(InteractEventResponse interactEventResponse) {
        super(EnumC24604h.f118390u);
        this.f50353b = interactEventResponse;
    }

    @Override // p10.AbstractC24599c
    /* renamed from: b */
    public List mo51711b() {
        List m51664b;
        int m131511r;
        List m131187O0;
        InteractEventResponse interactEventResponse = this.f50353b;
        if (interactEventResponse == null || (m51664b = interactEventResponse.m51664b()) == null) {
            return null;
        }
        List list = m51664b;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C19710k(interactEventResponse.m51665c(), (InteractEventResponse.InteractItem) it.next(), m128088a()));
        }
        m131187O0 = AbstractC25332a0.m131187O0(arrayList);
        return m131187O0;
    }
}

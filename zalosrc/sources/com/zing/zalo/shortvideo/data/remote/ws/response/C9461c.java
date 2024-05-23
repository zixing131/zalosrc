package com.zing.zalo.shortvideo.data.remote.ws.response;

import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import h10.C19701b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p10.AbstractC24599c;
import p10.EnumC24604h;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;

/* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.c */
/* loaded from: classes5.dex */
public final class C9461c extends AbstractC24599c {

    /* renamed from: b */
    private final GetCommentLiveRes f50351b;

    public C9461c(GetCommentLiveRes getCommentLiveRes) {
        super(EnumC24604h.f118391v);
        this.f50351b = getCommentLiveRes;
    }

    @Override // p10.AbstractC24599c
    /* renamed from: b */
    public List mo51711b() {
        List m51638b;
        int m131511r;
        List m131187O0;
        GetCommentLiveRes getCommentLiveRes = this.f50351b;
        if (getCommentLiveRes != null && (m51638b = getCommentLiveRes.m51638b()) != null) {
            List list = m51638b;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C19701b((GetCommentLiveRes.CommentData) it.next()));
            }
            m131187O0 = AbstractC25332a0.m131187O0(arrayList);
            return m131187O0;
        }
        return null;
    }
}
